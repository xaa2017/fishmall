package com.cat.fishmall.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/26
 * @Version: V1.0
 * @Description:
 **/
@Component
@Slf4j
public class JwtTokenUtil {

	@Value("${jwt.secret}")
	private String secret;

	@Value("${jwt.expiration}")
	private Long expiration;

	private static final String CLAIM_KEY_USERNAME = "sub";

	private static final String CLAIM_KEY_CREATED = "created";
	/**
	 * 解析 Token
	 * @param token
	 * @return
	 */
	public String getUserNameFromToken(String token) {
		String userName = null;
		Claims claims = this.getClaimsFromToken(token);
		if (Objects.nonNull(claims)) {
			userName = claims.getSubject();
		}
		return userName;
	}

	/**
	 * 验证token是否还有效
	 * @param token
	 * @param userDetails
	 * @return
	 */
	public boolean validateToken(String token, UserDetails userDetails) {
		String userName = this.getUserNameFromToken(token);
		if (Objects.isNull(userName)) {
			return false;
		}
		return userName.equals(userDetails.getUsername()) && !this.isTokenExpired(token);
	}
	/**
	 * 判断 token 是否已经过期
	 * @param token
	 * @return
	 */
	public boolean isTokenExpired(String token) {
		Date expiredDate = this.getExpiredDateFromToken(token);
		return expiredDate.before(new Date());
	}

	/**
	 * 生成Token
	 * @param userDetails
	 * @return
	 */
	public String generateToken(UserDetails userDetails) {
		Map<String, Object> claims = new HashMap<>();
		claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
		claims.put(CLAIM_KEY_CREATED, new Date());
		return this.generateToken(claims);
	}

	/**
	 * 判断Token 是否可以被刷新
	 * @param token
	 * @return
	 */
	public boolean canRefresh(String token) {
		return !isTokenExpired(token);
	}

	/**
	 * 刷新token
	 * @param token
	 * @return
	 */
	public String refreshToken(String token) {
		Claims claims = this.getClaimsFromToken(token);
		claims.put(CLAIM_KEY_CREATED, new Date());
		return this.generateToken(claims);
	}

	/**
	 * 生成 JWT token
	 * @param claims
	 * @return
	 */
	private String generateToken(Map<String,Object> claims) {

		return Jwts.builder()
				.setClaims(claims)
				.setExpiration(this.generateExpirationDate())
				.signWith(SignatureAlgorithm.HS512, secret)
				.compact();
	}

	private Claims getClaimsFromToken(String token) {
		Claims claims = null;
		try {
			claims = Jwts.parser()
					.setSigningKey(secret)
					.parseClaimsJws(token)
					.getBody();
		} catch (Exception e) {
			log.error("JWT格式验证失败：{}", token);
		}
		return claims;
	}

	private Date generateExpirationDate() {
		return new Date(System.currentTimeMillis() + expiration * 1000);
	}

	/**
	 * 从token中获取过期时间
	 */
	private Date getExpiredDateFromToken(String token) {
		Claims claims = getClaimsFromToken(token);
		return claims.getExpiration();
	}
}
