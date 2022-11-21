package pe.com.miguelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.miguelo.entity.RolEntity;
import pe.com.miguelo.service.RolService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private RolService rolservicio;

    @GetMapping
    public List<RolEntity> findAll(){
        return rolservicio.findAll();
    }
    @GetMapping("/custom")
    public List<RolEntity>findAllCustom(){
        return rolservicio.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<RolEntity> findById(@PathVariable long id){
        return rolservicio.findById(id);
    }

    @PostMapping
    public RolEntity add(@RequestBody RolEntity c){
        return rolservicio.add(c);
    }

    @PutMapping("/{id}")
    public RolEntity update(@PathVariable Long id, @RequestBody RolEntity c){
        c.setCodigo(id);
        return rolservicio.update(c);
    }

    @DeleteMapping("/{id}")
    public RolEntity delete(@PathVariable Long id){
        RolEntity objcliente = new RolEntity();
        objcliente.setEstado(false);
        return rolservicio.delete(RolEntity.builder().codigo(id).build());
    }
}

