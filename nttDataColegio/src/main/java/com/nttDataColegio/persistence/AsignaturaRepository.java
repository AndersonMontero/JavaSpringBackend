package com.nttDataColegio.persistence;

import com.nttDataColegio.business.repository.IAsignaturaRepository;
import com.nttDataColegio.domain.dto.AsignaturaDto;
import com.nttDataColegio.domain.entity.AsignaturaEntity;
import com.nttDataColegio.persistence.crud.AsignaturaCrudRepository;
import com.nttDataColegio.persistence.mapper.IAsignaturaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AsignaturaRepository implements IAsignaturaRepository {

    @Autowired
    private AsignaturaCrudRepository asignaturaCrudRepository;

    @Autowired
    private IAsignaturaMapper asignaturaMapper;

    @Override
    public List<AsignaturaDto> getAsignatura(Integer id) {
        List<AsignaturaEntity> asignaturaEntity = asignaturaCrudRepository.findByIdProfesor(id);
        return asignaturaMapper.toAsignaturaDto(asignaturaEntity);
    }
}
