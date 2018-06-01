package com.blueinfinite;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户业务 例2
 */
@Slf4j
public class Custom2 {
    /**
     * 客户跟进
     */
    public void follow() {
        CustomUtils.verifyPermissions();

        log.info("业务A：客户跟进");

        CustomUtils.addlog();
    }

    /**
     * 客户信息修改
     */
    public void edit() {
        CustomUtils.verifyPermissions();

        log.info("业务B：客户信息修改");

        CustomUtils.addlog();
    }
}
