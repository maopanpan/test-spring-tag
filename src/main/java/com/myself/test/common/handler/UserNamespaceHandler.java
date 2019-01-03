package com.myself.test.common.handler;

import com.myself.test.common.extend.UserBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 类名称：UserNamespaceHandler<br>
 * 类描述：<br>
 * 创建时间：2019年01月03日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
