package com.gyg.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author by gyg
 * @date 2021/10/10 12:52
 * @description
 * ConditionalOnMissingBean: 注入的时候标识这个注解的Bean只能被注入一个实例
 * 严格的说，不是所有的Bean都可以通过@Order这个标注进行顺序的控制。
 * 你把@Order这个标注加在普通的方法上或者类上一点鸟用都没有
 *
 */
@Configuration
public class UserClientConfig {
    public static final String ROOM_CLIENT = "roomClient";
    public static final String BOOK_CLIENT = "bookClient";
    public static final String BOOK_CLIENT2 = "bookClient2";

    @Bean(value = UserClientConfig.BOOK_CLIENT)
    @DependsOn(value = {UserClientConfig.BOOK_CLIENT2,UserClientConfig.ROOM_CLIENT})
    @ConditionalOnMissingBean(value = BookClient.class)
    public BookClient bookClient(){
        return new BookClient();
    }

    @Bean(value = UserClientConfig.BOOK_CLIENT2)
//    @ConditionalOnMissingBean(value = BookClient.class)
    public BookClient bookClient1() {
        return new BookClient();
    }

    @Bean(value = UserClientConfig.ROOM_CLIENT)
    public RoomClient roomClient() {
        return new RoomClient();
    }
}
