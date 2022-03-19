package com.snj.snjback.mappers;

public interface Mapper <DOCUMENT, DTO, FORM,FormUpdate> {
    DTO documentToDTO(DOCUMENT document);
    DOCUMENT formToDocument(FORM form);
    DOCUMENT formUpdateToDocument(FormUpdate form);
}
