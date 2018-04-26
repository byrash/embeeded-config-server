package com.shivaji.embeededconfigserver;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class DemoController {

    @Autowired
    private PropertyConfiguration propertyConfiguration;

    @RequestMapping("/print")
    public String print() {
        return propertyConfiguration.toString();
    }


}
