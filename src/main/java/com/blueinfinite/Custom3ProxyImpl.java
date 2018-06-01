package com.blueinfinite;

import lombok.extern.slf4j.Slf4j;

/**
 * 静态代理实现
 */
@Slf4j
public class Custom3ProxyImpl implements Custom3Proxy {
    private Custom3Proxy proxy;

    public Custom3ProxyImpl(Custom3Proxy proxy){
        this.proxy = proxy;
    }

    /**
     * 客户跟进
     */
    public void follow() {
        CustomUtils.verifyPermissions();

        proxy.follow();

        CustomUtils.addlog();
    }

    /**
     * 客户信息修改
     */
    public void edit() {
        CustomUtils.verifyPermissions();

        proxy.edit();

        CustomUtils.addlog();
    }
}
