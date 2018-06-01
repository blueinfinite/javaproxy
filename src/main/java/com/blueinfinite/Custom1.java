package com.blueinfinite;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户业务 例1
 */
@Slf4j
public class Custom1 {
    /**
     * 客户跟进
     */
    public void follow() {
        log.info("通用功能：验证是否有权限跟进");

        log.info("业务A：客户跟进");

        log.info("通用功能：记录日志");
    }

    /**
     * 客户信息修改
     */
    public void edit() {
        log.info("通用功能：验证是否有权限跟进");

        log.info("业务B：客户信息修改");

        log.info("通用功能：记录日志");
    }
}
