package io.codehunters.commons.dto.pagination;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Map;

/**
 * @author andres.montoya@codehunters.io
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@SuperBuilder
public class PaginationQueryDTO {

    private String query;

    private Integer page;

    private Integer size;

    private Map<String, String> sort;
}
