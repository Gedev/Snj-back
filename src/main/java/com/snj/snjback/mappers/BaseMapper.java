package com.snj.snjback.mappers;

public interface BaseMapper <TDTO,TFORM,TDOCUMENT>{
    TDTO documentToDto(TDOCUMENT document);
    TDOCUMENT formToDocument(TFORM form);
}
