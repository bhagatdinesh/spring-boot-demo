package com.example.springbootdemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dinesh.bhagat on 29/04/18.
 */
@Configuration
@ConfigurationProperties
@ConfigurationPropertiesBinding
@EnableCaching
@EnableAutoConfiguration(exclude = {CassandraDataAutoConfiguration.class},
        excludeName = "org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration")
public class ApplicationConfig {
}