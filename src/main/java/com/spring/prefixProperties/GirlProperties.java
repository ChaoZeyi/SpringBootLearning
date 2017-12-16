package com.spring.prefixProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author cherry
 * @date 2017/12/16 15:09
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String height;
    private Integer age;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
