package com.parserdigital.chapter.autorefresh.controller;

import com.parserdigital.chapter.autorefresh.config.AppProperties;
import com.parserdigital.chapter.autorefresh.mapping.DataMapper;
import com.parserdigital.chapter.autorefresh.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutorefreshController {

    private final AppProperties properties;
    private final DataMapper dataMapper;

    @Autowired
    public AutorefreshController(AppProperties properties, DataMapper dataMapper) {
        this.properties = properties;
        this.dataMapper = dataMapper;
    }

    @GetMapping(path = "/positions", produces = MediaType.APPLICATION_JSON_VALUE)
    public Data getPositions() {
        return dataMapper.map(properties);
    }

}
