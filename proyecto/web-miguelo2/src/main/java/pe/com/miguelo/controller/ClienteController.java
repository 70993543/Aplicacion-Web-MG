package pe.com.miguelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.miguelo.entity.ClienteEntity;
import pe.com.miguelo.service.ClienteService;

import java.util.List;

// @RestController define la clase como un controlador
@RestController
// @RequestMapping define el nombre del controlador
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteservice;
    // @GetMapping sirve para obtener valores
    @GetMapping
    public List<ClienteEntity> findAll(){
        return clienteservice.findAll();
    }
    @GetMapping("/custom")
    public List<ClienteEntity>findAllCustom(){
        return clienteservice.findAllCustom();
    }
    // @Postmapping permite enviar(registrar) valores
    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity c){
        return clienteservice.add(c);
    }
    // @Putmapping permite actualizar
    @PutMapping("/{id}")
    public ClienteEntity update(@PathVariable Long id, @RequestBody ClienteEntity c){
        c.setCodigo(id);
        return clienteservice.update(c);
    }
    // @DeleteMapping permite eliminar
    @DeleteMapping("/{id}")
    public ClienteEntity delete(@PathVariable Long id){
        ClienteEntity objcliente = new ClienteEntity();
        objcliente.setEstado(false);
        return clienteservice.delete(ClienteEntity.builder().codigo(id).build());
    }
}

