package com.nttDataColegio.persistence.crud;

import com.nttDataColegio.domain.dto.AsignaturaDto;
import com.nttDataColegio.domain.entity.AsignaturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AsignaturaCrudRepository  extends JpaRepository<AsignaturaEntity, Integer> {

    List<AsignaturaEntity> findByIdProfesor(Integer id);
}
