package com.hendisantika.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-data-redis-crud-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/22
 * Time: 15.01
 */
@Data
@RedisHash(value = "student")
public class Student {
    @Id
    @Indexed
    private String id;
    private String name;
    private String grade;
}
