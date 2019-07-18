package com.bootdo.testDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

//@RestController()
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class TestDemo {
    @Autowired
    RedisTemplate redisTemplate;

   // @Test
    public void test() {
        redisTemplate.opsForValue().set("a", "b");
        System.out.println(redisTemplate.opsForValue().get("a"));
    }

    ;
}
