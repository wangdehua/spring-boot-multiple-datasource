package com.example.demo1.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/application.yml")
@ConfigurationProperties(prefix = "backup.muti-datasource")
@Data
public class SlaveProperties {

    public String url;

    public String username;

    public String password;

    //private String driverClassName = "com.mysql.jdbc.Driver";
    public String driverClassName;

}
