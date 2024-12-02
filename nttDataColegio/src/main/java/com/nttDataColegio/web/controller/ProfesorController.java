package com.nttDataColegio.web.controller;

import com.nttDataColegio.business.service.IProfesorService;
import com.nttDataColegio.domain.dto.ProfesorAsignaturasEstudiantesDto;
import com.nttDataColegio.domain.dto.ProfesorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    private IProfesorService iProfesorService;

    @GetMapping("/listar")
    public ResponseEntity<List<ProfesorDto>> getListaProfesores() {
        return ResponseEntity.ok(iProfesorService.getListaProfesores());
    }

    @GetMapping("/{profesorId}/asignaturas-estudiantes")
    public ResponseEntity<ProfesorAsignaturasEstudiantesDto> getobtenerAsignaturasYEstudiantes(@PathVariable Integer profesorId) {
        return ResponseEntity.ok(iProfesorService.getobtenerAsignaturasYEstudiantes(profesorId));
    }
}
