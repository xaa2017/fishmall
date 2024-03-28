package com.cat.fishmall.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderTimeOutCancelTask {
    @Scheduled(cron = "0 0-15 * ? * ?")
    private void cancelTimeOutOrder() {
        log.info("取消订单，并根据sku编号释放锁定库存");
    }
}
