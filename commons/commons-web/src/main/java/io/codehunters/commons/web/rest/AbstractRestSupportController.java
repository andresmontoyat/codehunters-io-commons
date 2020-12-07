package io.codehunters.commons.web.rest;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Map;

public interface AbstractRestSupportController<ID> {

    default URI createURI(String path, Object id) {
        return ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path(path)
                .buildAndExpand(id)
                .toUri();
    }

    default URI createURI(String path, Map<String, ? extends Object> vars) {
        return ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path(path)
                .buildAndExpand(vars)
                .toUri();
    }

    Boolean hasError(BindingResult bindingResult);

    Boolean exists(ID identifier);
}
