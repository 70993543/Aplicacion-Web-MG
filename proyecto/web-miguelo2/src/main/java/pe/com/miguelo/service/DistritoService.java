package pe.com.miguelo.service;
import pe.com.miguelo.entity.DistritoEntity;

import java.util.List;
import java.util.Optional;

public interface DistritoService {
    List<DistritoEntity> findAll();
    Optional<DistritoEntity> findById(Long id);
    DistritoEntity add(DistritoEntity c);
    DistritoEntity update(DistritoEntity c);
    DistritoEntity delete(DistritoEntity c);
    List<DistritoEntity>findAllCustom();
}

