package com.nttDataColegio.persistence.crud;

import com.nttDataColegio.domain.entity.ProfesorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorCrudRepository extends JpaRepository<ProfesorEntity, Integer> {
}