package com.nttDataColegio.persistence.mapper;

import com.nttDataColegio.domain.dto.AsignaturaDto;
import com.nttDataColegio.domain.entity.AsignaturaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IAsignaturaMapper {
    List<AsignaturaDto> toAsignaturaDto(List<AsignaturaEntity> asignaturaEntity);
}
