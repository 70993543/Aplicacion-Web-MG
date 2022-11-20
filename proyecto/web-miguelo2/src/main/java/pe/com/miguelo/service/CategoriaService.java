package pe.com.miguelo.service;

import pe.com.miguelo.entity.CategoriaEntity;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<CategoriaEntity> findAll();
    // Función para buscar código
    Optional<CategoriaEntity> findById(Long id);
    // Función para registrar
    CategoriaEntity add(CategoriaEntity c);
    // Función para actualizar
    CategoriaEntity update(CategoriaEntity c);
    // Función para eliminar
    CategoriaEntity delete(CategoriaEntity c);
    // Función para mostrar datos habilitados
    List<CategoriaEntity>findAllCustom();
}
