package com.shivaji.embeededconfigserver;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "hello")
@Data
public class PropertyConfiguration {
    private String message1;
    private String message2;
    private String message3;
    private String message4;
    private String message5;
}
