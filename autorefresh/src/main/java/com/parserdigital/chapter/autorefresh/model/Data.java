package com.parserdigital.chapter.autorefresh.model;

import lombok.Builder;

import java.util.List;

@lombok.Data
@Builder
public class Data {

    private String company;
    private List<Position> positions;

}
