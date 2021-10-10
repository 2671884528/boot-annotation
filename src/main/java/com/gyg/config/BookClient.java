package com.gyg.config;

import org.springframework.stereotype.Component;

/**
 * @author by gyg
 * @date 2021/10/10 12:56
 * @description
 */
public class BookClient {

    BookClient() {
        System.out.println("BookClient init ----------------");
    }

    public String openBook(){
        return "openBook -------------";

    }
}
