package com.example.cicdtest2.service;

import com.example.cicdtest2.dto.redis.RedisRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class RedisService {

    private final RedisTemplate<String, Object> redisTemplate;

    public String redisString(RedisRequestDto requestDto) {
        ValueOperations<String, Object> operations = redisTemplate.opsForValue();

        operations.set(requestDto.getName(), requestDto.getValue());


        String redis = (String)operations.get(requestDto.getName());
        // 아니 이게 맞음??
        return redis;
    }
}
