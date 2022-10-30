package pe.com.miguelo.service;

import pe.com.miguelo.entity.ProductoEntity;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<ProductoEntity> findAll();
    Optional<ProductoEntity> findById(Long id);
    ProductoEntity add(ProductoEntity c);
    ProductoEntity update(ProductoEntity c);
    ProductoEntity delete(ProductoEntity c);
    List<ProductoEntity>findAllCustom();
}
