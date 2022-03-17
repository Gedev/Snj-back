package com.snj.snjback.mappers;

public interface Mapper <DOCUMENT, DTO, FORM, FORMUPDATE> {
    DTO documentToDTO(DOCUMENT entity);
    DOCUMENT formToDocument(FORM form);
    DOCUMENT formUpdateToDocument(FORMUPDATE form);
}
