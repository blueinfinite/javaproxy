package com.blueinfinite;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理 例4
 */
public class DynamicProxy {

    public static <T> T getObj(final Object target) {
        return (T)Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //验证是否有权限跟进
                        CustomUtils.verifyPermissions();

                        //具体业务
                        Object result = method.invoke(target, args);

                        //记录日志
                        CustomUtils.addlog();

                        return result;
                    }
                }
        );

    }

}
