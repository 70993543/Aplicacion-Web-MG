package pe.com.miguelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.miguelo.entity.EmpleadoEntity;
import pe.com.miguelo.entity.ProductoEntity;
import pe.com.miguelo.service.EmpleadoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoservicio;

    @GetMapping
    public List<EmpleadoEntity> findAll(){
        return empleadoservicio.findAll();
    }
    @GetMapping("/custom")
    public List<EmpleadoEntity>findAllCustom(){
        return empleadoservicio.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<EmpleadoEntity> findById(@PathVariable long id){
        return empleadoservicio.findById(id);
    }

    @PostMapping
    public EmpleadoEntity add(@RequestBody EmpleadoEntity c){
        return empleadoservicio.add(c);
    }

    @PutMapping("/{id}")
    public EmpleadoEntity update(@PathVariable Long id, @RequestBody EmpleadoEntity c){
        c.setCodigo(id);
        return empleadoservicio.update(c);
    }

    @DeleteMapping("/{id}")
    public EmpleadoEntity delete(@PathVariable Long id){
        EmpleadoEntity objcliente = new EmpleadoEntity();
        objcliente.setEstado(false);
        return empleadoservicio.delete(EmpleadoEntity.builder().codigo(id).build());
    }
}
