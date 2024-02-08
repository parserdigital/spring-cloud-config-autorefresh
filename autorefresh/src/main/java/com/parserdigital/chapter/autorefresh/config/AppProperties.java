package com.parserdigital.chapter.autorefresh.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.List;

@ConfigurationProperties(prefix = "app")
@Data
@RefreshScope
public class AppProperties {

    private String company;
    @NestedConfigurationProperty
    private List<Position> positions;

    @Data
    public static class Position {

        private String role;
        private String location;
        private String published;

    }

}
