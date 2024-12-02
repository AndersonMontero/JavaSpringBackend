package com.nttDataColegio.business.repository;

import com.nttDataColegio.domain.dto.EstudianteDto;

public interface IEstudianteRepository {
    EstudianteDto getEstudiante(Integer idEstudiante);
}
