package com.example.cicdtest2.controller.redis;

import com.example.cicdtest2.dto.redis.RedisRequestDto;
import com.example.cicdtest2.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class RedisController {

//    private final RedisService redisService;
//
//    @PostMapping("/test")
//    public String test(@RequestBody RedisRequestDto requestDto) {
//
//        String value = redisService.redisString(requestDto);
//        return "벨류는 " + value;
//    }

}