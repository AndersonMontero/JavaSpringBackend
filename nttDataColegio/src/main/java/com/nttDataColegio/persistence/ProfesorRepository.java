package com.nttDataColegio.persistence;

import com.nttDataColegio.business.repository.IProfesorRepository;
import com.nttDataColegio.domain.dto.ProfesorAsignaturasEstudiantesDto;
import com.nttDataColegio.domain.dto.ProfesorDto;
import com.nttDataColegio.domain.entity.ProfesorEntity;
import com.nttDataColegio.persistence.crud.ProfesorCrudRepository;
import com.nttDataColegio.persistence.mapper.IProfesorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfesorRepository implements IProfesorRepository {

    @Autowired
    private ProfesorCrudRepository profesorCrudRepository;

    @Autowired
    private IProfesorMapper profesorMapper;

    @Override
    public List<ProfesorDto> getListaProfesores() {
        List<ProfesorDto> profesores = profesorMapper.toProfesoresDto((List<ProfesorEntity>) profesorCrudRepository.findAll());
        return profesores;
    }

    @Override
    public ProfesorAsignaturasEstudiantesDto getobtenerAsignaturasYEstudiantes(Integer profesorId) {
        ProfesorEntity profesorEntity = profesorCrudRepository.findById(profesorId).orElse(null);
        if (profesorEntity != null) {
            ProfesorAsignaturasEstudiantesDto profesorAsignaturasEstudiantesDto = profesorMapper.toProfesorAsignaturasEstudiantesDto(profesorEntity);
            return profesorAsignaturasEstudiantesDto;
        }
        return null;
    }

    @Override
    public ProfesorDto getProfesor(Integer profesorId) {
        ProfesorDto profesorDto = profesorMapper.toProfesorDto(profesorCrudRepository.findById(profesorId).orElse(null));
        return profesorDto;
    }
}
