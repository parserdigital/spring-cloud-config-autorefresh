package com.parserdigital.chapter.autorefresh.mapping;

import com.parserdigital.chapter.autorefresh.config.AppProperties;
import com.parserdigital.chapter.autorefresh.model.Data;
import com.parserdigital.chapter.autorefresh.model.Position;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Optional;

@Component
public class DataMapper {

    public Data map(AppProperties props) {
        if (props == null) {
            return null;
        }
        return Data.builder()
                .company(props.getCompany())
                .positions(Optional.ofNullable(props.getPositions())
                        .map(positions -> positions.stream().map(this::mapPosition).toList())
                        .orElse(Collections.emptyList()))
                .build();
    }

    private Position mapPosition(AppProperties.Position position) {
        if (position == null) {
            return null;
        }
        return Position.builder()
                .role(position.getRole())
                .location(position.getLocation())
                .build();
    }
}
