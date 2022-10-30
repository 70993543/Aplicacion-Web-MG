package pe.com.miguelo.service;

import pe.com.miguelo.entity.ClienteEntity;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    // Función para mostrar todos los datos
    List<ClienteEntity>findAll();
    // Función para buscar código
    Optional<ClienteEntity>findById(Long id);
    // Función para registrar
    ClienteEntity add(ClienteEntity c);
    // Función para actualizar
    ClienteEntity update(ClienteEntity c);
    // Función para eliminar
    ClienteEntity delete(ClienteEntity c);
    // Función para mostrar datos habilitados
    List<ClienteEntity>findAllCustom();
}
