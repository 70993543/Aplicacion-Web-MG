package pe.com.miguelo.service;

import pe.com.miguelo.entity.EmpleadoEntity;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    List<EmpleadoEntity> findAll();
    Optional<EmpleadoEntity> findById(Long id);
    EmpleadoEntity add(EmpleadoEntity c);
    EmpleadoEntity update(EmpleadoEntity c);
    EmpleadoEntity delete(EmpleadoEntity c);
    List<EmpleadoEntity>findAllCustom();
}
