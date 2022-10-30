package pe.com.miguelo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.miguelo.entity.ProductoEntity;
import pe.com.miguelo.repository.ProductoRopository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRopository productoRepositorio;

    @Override
    public List<ProductoEntity> findAll() {
        return productoRepositorio.findAll();
    }

    @Override
    public Optional<ProductoEntity> findById(Long id) {
        return productoRepositorio.findById(id);
    }

    @Override
    public ProductoEntity add(ProductoEntity c) {
        return productoRepositorio.save(c);
    }

    @Override
    public ProductoEntity update(ProductoEntity c) {
        ProductoEntity objProducto = productoRepositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objProducto);
        return productoRepositorio.save(objProducto);
    }

    @Override
    public ProductoEntity delete(ProductoEntity c) {
        ProductoEntity objProducto = productoRepositorio.getById(c.getCodigo());
        objProducto.setEstado(false);
        return  productoRepositorio.save(objProducto);
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return productoRepositorio.findAllCustom();
    }
}
