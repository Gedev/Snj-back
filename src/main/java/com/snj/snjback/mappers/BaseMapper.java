package com.snj.snjback.mappers;

public interface BaseMapper <TDTO,TFORM,TDOCUMENT>{
    TDTO entityToDto(TDOCUMENT document);
    TDOCUMENT formToEntity(TFORM form);
}
