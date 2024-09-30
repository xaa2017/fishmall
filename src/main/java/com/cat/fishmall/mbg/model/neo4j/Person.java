package com.cat.fishmall.mbg.model.neo4j;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @Author: xaa
 * @Date: 2024/9/30
 * @Version: V1.0
 * @Description:
 **/
@NodeEntity
@Data
public class Person {

	@Id
	@GeneratedValue
	private Long id;

	private String firstName;

	private String lastName;
}
