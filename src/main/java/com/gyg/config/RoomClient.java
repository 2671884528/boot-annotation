package com.gyg.config;

import org.springframework.stereotype.Component;

/**
 * @author by gyg
 * @date 2021/10/10 12:56
 * @description
 */
public class RoomClient {

    RoomClient() {
        System.out.println("RoomClient init--------------");
    }

    public String inRoom() {
        return "in room--------------";
    }
}
