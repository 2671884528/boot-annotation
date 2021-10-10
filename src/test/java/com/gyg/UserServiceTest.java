package com.gyg;

import com.gyg.config.BookClient;
import com.gyg.config.RoomClient;
import com.gyg.config.UserClientConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author by gyg
 * @date 2021/10/10 23:14
 * @description
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
public class UserServiceTest {

    @Autowired
    @Qualifier(UserClientConfig.BOOK_CLIENT)
    BookClient bookClient;

    @Autowired
    @Qualifier(UserClientConfig.BOOK_CLIENT2)
    BookClient bookClient2;

    @Autowired
    @Qualifier(UserClientConfig.ROOM_CLIENT)
    RoomClient roomClient;

    @Test
    public void clientTest() {
        log.info("book客户端调用{}{}", bookClient,bookClient.openBook());
        log.info("book2客户端调用{}{}",bookClient2, bookClient2.openBook());
        log.info("room客户端调用{}", roomClient.inRoom());
        log.info("结束");
    }
}
