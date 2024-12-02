package com.nttDataColegio.business.service.impl;

import com.nttDataColegio.business.repository.*;
import com.nttDataColegio.business.service.IProfesorService;
import com.nttDataColegio.domain.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfesorService implements IProfesorService {

    @Autowired
    private IProfesorRepository iProfesorRepository;

    @Autowired
    private IAsignaturaRepository iAsignaturaRepository;

    @Autowired
    private IEstudianteAsignaturaRepository iEstudianteAsignaturaRepository;

    @Autowired
    private IEstudianteRepository iEstudianteRepository;

    @Override
    public List<ProfesorDto> getListaProfesores() {
        List<ProfesorDto> profesores = iProfesorRepository.getListaProfesores();
        return profesores;
    }

    @Override
    public ProfesorAsignaturasEstudiantesDto getobtenerAsignaturasYEstudiantes(Integer profesorId) {
        ProfesorDto profesorDto = iProfesorRepository.getProfesor(profesorId);
        if (profesorDto == null) {
            return null;
        }

        List<AsignaturaDto> asignaturaDtoList = iAsignaturaRepository.getAsignatura(profesorDto.getId());
        if (asignaturaDtoList == null) {
            return null;
        }

        List<AsignaturaEstudiantesDto> asignaturaEstudiantesList = new ArrayList<>();
        for (AsignaturaDto asignatura : asignaturaDtoList) {
            List<EstudianteDto> estudiantes = new ArrayList<>();
            List<EstudianteAsignaturaDto> estudianteAsignaturaList = iEstudianteAsignaturaRepository.getEstudianteAsignatura(asignatura.getId());
            if (estudianteAsignaturaList == null) {
                return null;
            }

            for (EstudianteAsignaturaDto estudianteAsignatura : estudianteAsignaturaList) {
                EstudianteDto estudianteDto = iEstudianteRepository.getEstudiante(estudianteAsignatura.getIdEstudiante());
                if (estudianteDto == null) {
                    return null;
                }
                estudiantes.add(estudianteDto);
            }

            AsignaturaEstudiantesDto asignaturaEstudiantesDto = new AsignaturaEstudiantesDto();
            asignaturaEstudiantesDto.setAsignaturaId(asignatura.getId());
            asignaturaEstudiantesDto.setAsignaturaNombre(asignatura.getNombre());
            asignaturaEstudiantesDto.setCurso(asignatura.getIdCurso());
            asignaturaEstudiantesDto.setEstudiantes(estudiantes);
            asignaturaEstudiantesList.add(asignaturaEstudiantesDto);
        }

        ProfesorAsignaturasEstudiantesDto profesorAsignaturasEstudiantesDto = new ProfesorAsignaturasEstudiantesDto();
        profesorAsignaturasEstudiantesDto.setProfesorId(profesorDto.getId());
        profesorAsignaturasEstudiantesDto.setProfesorNombre(profesorDto.getNombre());
        profesorAsignaturasEstudiantesDto.setAsignaturas(asignaturaEstudiantesList);
        return profesorAsignaturasEstudiantesDto;
    }
}