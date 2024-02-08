package com.parserdigital.chapter.autorefresh;

import com.parserdigital.chapter.autorefresh.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
@EnableAutoConfiguration
public class AppAutorefreshApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppAutorefreshApplication.class, args);
    }

}
