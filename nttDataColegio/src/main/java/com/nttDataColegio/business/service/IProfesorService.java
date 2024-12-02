package com.nttDataColegio.business.service;

import com.nttDataColegio.domain.dto.ProfesorAsignaturasEstudiantesDto;
import com.nttDataColegio.domain.dto.ProfesorDto;

import java.util.List;

public interface IProfesorService {

    List<ProfesorDto> getProfesores();

    ProfesorAsignaturasEstudiantesDto getobtenerAsignaturasYEstudiantes(Integer profesorId);
}

