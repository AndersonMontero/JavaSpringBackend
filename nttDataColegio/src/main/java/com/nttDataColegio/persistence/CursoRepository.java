package com.nttDataColegio.persistence;

import com.nttDataColegio.business.repository.ICursoRepository;
import com.nttDataColegio.domain.dto.CursoDto;
import com.nttDataColegio.persistence.crud.CursoCrudRepository;
import com.nttDataColegio.persistence.mapper.ICursoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CursoRepository implements ICursoRepository {

    @Autowired
    private CursoCrudRepository cursoCrudRepository;

    @Autowired
    private ICursoMapper iCursoMapper;

}
