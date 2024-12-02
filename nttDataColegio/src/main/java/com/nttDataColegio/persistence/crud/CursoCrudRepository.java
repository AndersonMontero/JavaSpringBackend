package com.nttDataColegio.persistence.crud;

import com.nttDataColegio.domain.entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoCrudRepository extends JpaRepository<CursoEntity, Integer> {
}
