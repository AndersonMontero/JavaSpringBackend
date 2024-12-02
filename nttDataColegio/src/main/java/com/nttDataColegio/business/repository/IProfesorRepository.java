package com.nttDataColegio.business.repository;

import com.nttDataColegio.domain.dto.ProfesorAsignaturasEstudiantesDto;
import com.nttDataColegio.domain.dto.ProfesorDto;

import java.util.List;

public interface IProfesorRepository {

    List<ProfesorDto> getProfesores();

    ProfesorDto getProfesor(Integer profesorId);
}
