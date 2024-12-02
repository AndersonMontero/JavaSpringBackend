package com.nttDataColegio.persistence.crud;

import com.nttDataColegio.domain.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteCrudRepository extends JpaRepository<EstudianteEntity, Integer> {
}
