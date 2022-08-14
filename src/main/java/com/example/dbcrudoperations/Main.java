package com.example.dbcrudoperations;

import com.example.model.ClothingItem;
import com.example.model.ClothingItemDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

        ClothingItemDao dao = (ClothingItemDao)context.getBean("cdao");

        int status = dao.createClothingItem(new ClothingItem("Shirt", "XL", 100.00, 10));
        System.out.println("Data Insertion is success or not: " + status);

        List items = dao.getClothingItems();
        items.forEach(System.out::println);

    }
}

/*
 init, doGET, doPOST, destory (app server) => DB
    - tomcat (web server)
* */
