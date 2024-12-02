package com.nttDataColegio.persistence;

import com.nttDataColegio.business.repository.IEstudianteAsignaturaRepository;
import com.nttDataColegio.domain.dto.EstudianteAsignaturaDto;
import com.nttDataColegio.domain.entity.EstudianteAsignaturaEntity;
import com.nttDataColegio.persistence.crud.EstudianteAsignaturaCrudRepository;
import com.nttDataColegio.persistence.mapper.IEstudianteAsignaturaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EstudianteAsignaturaRepository implements IEstudianteAsignaturaRepository {

    @Autowired
    private EstudianteAsignaturaCrudRepository estudianteAsignaturaCrudRepository;
    @Autowired
    private IEstudianteAsignaturaMapper iEstudianteAsignaturaMapper;

    @Override
    public List<EstudianteAsignaturaDto> getEstudianteAsignatura(Integer id) {
        List<EstudianteAsignaturaEntity> entities = estudianteAsignaturaCrudRepository.findByIdAsignaturaId(id);
        return entities.stream()
                .map(iEstudianteAsignaturaMapper::toEstudianteAsignaturaDto)
                .collect(Collectors.toList());
    }

}

