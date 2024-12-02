package com.nttDataColegio.business.repository;

import com.nttDataColegio.domain.dto.AsignaturaDto;

import java.util.List;

public interface IAsignaturaRepository {
    List<AsignaturaDto> getAsignatura(Integer id);
}
