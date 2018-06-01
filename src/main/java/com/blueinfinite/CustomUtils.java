package com.blueinfinite;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户功能封装
 */
@Slf4j
public class CustomUtils {
    public static void verifyPermissions() {
        log.info("通用功能：验证是否有权限跟进");
    }

    public static void addlog() {
        log.info("通用功能：记录日志");
    }
}
