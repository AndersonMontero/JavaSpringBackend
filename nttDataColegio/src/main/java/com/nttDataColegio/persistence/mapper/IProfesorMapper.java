package com.nttDataColegio.persistence.mapper;

import com.nttDataColegio.domain.dto.ProfesorAsignaturasEstudiantesDto;
import com.nttDataColegio.domain.dto.ProfesorDto;
import com.nttDataColegio.domain.entity.ProfesorEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IProfesorMapper {
    List<ProfesorDto> toProfesoresDto(List<ProfesorEntity> all);

    ProfesorAsignaturasEstudiantesDto toProfesorAsignaturasEstudiantesDto(ProfesorEntity profesorEntity);

    ProfesorDto toProfesorDto(ProfesorEntity profesorEntity);
}
