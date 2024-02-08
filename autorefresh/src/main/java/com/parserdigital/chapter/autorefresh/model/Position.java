package com.parserdigital.chapter.autorefresh.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Position {

    private String role;
    private String location;

}
