package com.chocksaway.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class RedisController {
    @Autowired
    private StringRedisTemplate template;

    @RequestMapping(value = "/{key}", method =
            RequestMethod.GET)
    public boolean getBook(@PathVariable String key) {
        ValueOperations<String, String> ops = this.template.opsForValue();
        if (!this.template.hasKey(key)) {
            ops.set(key, "foo");
            return false;
        }

        return true;
    }
}