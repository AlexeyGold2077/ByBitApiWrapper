package com.alexeygold2077;

import com.alexeygold2077.api.ByBitException;
import com.alexeygold2077.api.ByBitWrapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ByBitException, IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ByBitWrapper api = context.getBean("byBitWrapper", ByBitWrapper.class);

        System.out.println(api.get_NOTUSDT_Price());
    }
}
