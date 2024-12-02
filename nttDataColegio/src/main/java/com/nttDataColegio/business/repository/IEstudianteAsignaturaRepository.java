package com.nttDataColegio.business.repository;

import com.nttDataColegio.domain.dto.EstudianteAsignaturaDto;

import java.util.List;

public interface IEstudianteAsignaturaRepository {
    List<EstudianteAsignaturaDto> getEstudianteAsignatura(Integer id);
}
