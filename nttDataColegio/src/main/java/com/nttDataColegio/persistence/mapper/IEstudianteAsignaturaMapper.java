package com.nttDataColegio.persistence.mapper;

import com.nttDataColegio.domain.dto.EstudianteAsignaturaDto;
import com.nttDataColegio.domain.entity.EstudianteAsignaturaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IEstudianteAsignaturaMapper {
    @Mapping(source = "id.idEstudiante", target = "idEstudiante")
    @Mapping(source = "id.idAsignatura", target = "idAsignatura")
    EstudianteAsignaturaDto toEstudianteAsignaturaDto(EstudianteAsignaturaEntity entity);

    List<EstudianteAsignaturaDto> toEstudianteAsignaturaDto(List<EstudianteAsignaturaEntity> entities);
}
