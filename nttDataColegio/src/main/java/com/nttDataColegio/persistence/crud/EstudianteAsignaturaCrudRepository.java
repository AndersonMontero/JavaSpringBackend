package com.nttDataColegio.persistence.crud;

import com.nttDataColegio.domain.entity.EstudianteAsignaturaEntity;
import com.nttDataColegio.domain.entity.EstudianteAsignaturaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EstudianteAsignaturaCrudRepository extends JpaRepository<EstudianteAsignaturaEntity, EstudianteAsignaturaId> {
    @Query("SELECT ea FROM EstudianteAsignaturaEntity ea WHERE ea.id.idEstudiante = :idEstudiante")
    List<EstudianteAsignaturaEntity> findByIdEstudiante(@Param("idEstudiante") Integer idEstudiante);

    @Query("SELECT ea FROM EstudianteAsignaturaEntity ea WHERE ea.id.idAsignatura = :idAsignatura")
    List<EstudianteAsignaturaEntity> findByIdAsignaturaId(@Param("idAsignatura") Integer idAsignatura);

}