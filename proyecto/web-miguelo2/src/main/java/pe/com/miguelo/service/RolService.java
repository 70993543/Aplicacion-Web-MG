package pe.com.miguelo.service;

import pe.com.miguelo.entity.RolEntity;

import java.util.List;
import java.util.Optional;

public interface RolService {
    List<RolEntity> findAll();
    Optional<RolEntity> findById(Long id);
    RolEntity add(RolEntity c);
    RolEntity update(RolEntity c);
    RolEntity delete(RolEntity c);
    List<RolEntity>findAllCustom();
}

