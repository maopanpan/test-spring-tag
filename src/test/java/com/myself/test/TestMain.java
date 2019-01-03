package com.myself.test;

import com.myself.test.vo.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.Assert;


/**
 * 类名称：TestMain<br>
 * 类描述：<br>
 * 创建时间：2019年01月03日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class TestMain {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("/applicationContext.xml", TestMain.class);
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        User user = (User) beanFactory.getBean("user");
        Assert.notNull(user, "用户信息不能为空");

    }
}
