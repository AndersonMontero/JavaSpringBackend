package com.nttDataColegio.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "asignatura")
@Getter
@Setter
public class AsignaturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @Column(name = "profesor_id")
    private Integer idProfesor;
    @Column(name = "curso_id")
    private Integer idCurso;

}
