package com.example.cicdtest2.controller.redis;

import com.example.cicdtest2.dto.ChatMessage;
import com.example.cicdtest2.dto.redis.RedisRequestDto;
import com.example.cicdtest2.service.RedisPubService;
import com.example.cicdtest2.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class RedisController {

    private final RedisService redisService;

    private final RedisPubService redisPubService;

    private final RedisTemplate<String, String> stringRedisTemplate;
//    @PostMapping("/test")
//    public void test(@RequestBody ChatMessage chatMessage) {
//        redisPubService.sendMessage(chatMessage);
//    }
    @PostMapping("/test")
    public String test(@RequestBody RedisRequestDto requestDto) {
        String value = redisService.redisString(requestDto);
        return "벨류는 " + value;
    }

    @GetMapping("test2")
    public void test2() {
        stringRedisTemplate.convertAndSend("ch01", "Coffee, latte");
    }
}