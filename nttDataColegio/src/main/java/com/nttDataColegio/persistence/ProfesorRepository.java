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
    public List<ProfesorDto> getProfesores() {
        return profesorMapper.toProfesoresDto((List<ProfesorEntity>) profesorCrudRepository.findAll());
    }

    @Override
    public ProfesorDto getProfesor(Integer profesorId) {
        return profesorMapper.toProfesorDto(profesorCrudRepository.findById(profesorId).orElse(null));
    }
}
