package com.blueinfinite;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户业务 例3
 */
@Slf4j
public class Custom3 implements Custom3Proxy {
    /**
     * 客户跟进
     */
    public void follow() {
        log.info("业务A：客户跟进");
    }

    /**
     * 客户信息修改
     */
    public void edit() {
        log.info("业务B：客户信息修改");
    }
}
