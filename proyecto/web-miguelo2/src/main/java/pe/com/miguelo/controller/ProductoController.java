package pe.com.miguelo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.miguelo.entity.CategoriaEntity;
import pe.com.miguelo.entity.DistritoEntity;
import pe.com.miguelo.entity.ProductoEntity;
import pe.com.miguelo.service.ProductoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoservice;

    @GetMapping
    public List<ProductoEntity> findAll(){
        return productoservice.findAll();
    }
    @GetMapping("/custom")
    public List<ProductoEntity>findAllCustom(){
        return productoservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<ProductoEntity> findById(@PathVariable long id){
        return productoservice.findById(id);
    }

    @PostMapping
    public ProductoEntity add(@RequestBody ProductoEntity c){
        return productoservice.add(c);
    }

    @PutMapping("/{id}")
    public ProductoEntity update(@PathVariable Long id, @RequestBody ProductoEntity c){
        c.setCodigo(id);
        return productoservice.update(c);
    }

    @DeleteMapping("/{id}")
    public ProductoEntity delete(@PathVariable Long id){
        ProductoEntity objcliente = new ProductoEntity();
        objcliente.setEstado(false);
        return productoservice.delete(ProductoEntity.builder().codigo(id).build());
    }
}
