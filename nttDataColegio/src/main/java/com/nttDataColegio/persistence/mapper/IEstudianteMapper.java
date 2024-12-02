package com.nttDataColegio.persistence.mapper;

import com.nttDataColegio.domain.dto.EstudianteDto;
import com.nttDataColegio.domain.entity.EstudianteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IEstudianteMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    EstudianteDto toEstudianteDto(EstudianteEntity estudianteEntity);
}
