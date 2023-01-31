package com.example.cicdtest2.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RedisMessageStringSubscriber implements MessageListener {
    public void onMessage(Message message, byte[] pattern) {
        log.info("String Messager rexceived: " + message.toString());
        System.out.println("String Messager just message: " + message);
        System.out.println("String Messager sout: " + message.toString());
    }
}
