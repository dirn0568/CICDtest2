//package com.example.cicdtest2.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import redis.embedded.RedisServer;
//
//
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//
///**
// * 로컬 환경일경우 내장 레디스가 실행됩니다.
// */
//@Profile("server") // 프로필이랑 파일은 똑같아야함, application.yml은 무조건 실행이됨, profile 안에 변수 == application-변수 == spring:profiles:active: 변수, application.yml 에 server를 명시해주고 여기서 profile로 로컬쪽을 돌려버린다???
//@Configuration
//public class EmbeddedRedisConfig {
//    @Value("${spring.redis.port}")
//    private int redisPort;
//    private RedisServer redisServer;
//
//    @PostConstruct
//    public void redisServer() {
//        System.out.println(redisPort);
//        System.out.println("412313123123");
//        redisServer = new RedisServer(redisPort);
//        redisServer.start();
//    }
//
//    @PreDestroy
//    public void stopRedis() {
//        if (redisServer != null) {
//            redisServer.stop();
//        }
//    }
//}
