package com.nttDataColegio.persistence;

import com.nttDataColegio.business.repository.IEstudianteRepository;
import com.nttDataColegio.domain.dto.EstudianteDto;
import com.nttDataColegio.domain.entity.EstudianteEntity;
import com.nttDataColegio.persistence.crud.EstudianteCrudRepository;
import com.nttDataColegio.persistence.mapper.IEstudianteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EstudianteRepository implements IEstudianteRepository {

    @Autowired
    private EstudianteCrudRepository estudianteCrudRepository;

    @Autowired
    private IEstudianteMapper estudianteMapper;

    @Override
    public EstudianteDto getEstudiante(Integer idEstudiante) {
        EstudianteEntity estudianteEntity = estudianteCrudRepository.findById(idEstudiante).orElse(null);
        return estudianteMapper.toEstudianteDto(estudianteEntity);
    }
}
