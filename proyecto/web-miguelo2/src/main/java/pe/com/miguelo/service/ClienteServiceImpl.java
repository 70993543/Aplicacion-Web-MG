package pe.com.miguelo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.miguelo.entity.ClienteEntity;
import pe.com.miguelo.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
// @Autowired permite inyectar la dependencia
    @Autowired
    private ClienteRepository clienteRepositorio;
    @Override
    public List<ClienteEntity> findAll() {
        return clienteRepositorio.findAll();
    }

    @Override
    public Optional<ClienteEntity> findById(Long id) {
        return clienteRepositorio.findById(id);
    }

    @Override
    public ClienteEntity add(ClienteEntity c) {
        return clienteRepositorio.save(c);
    }

    @Override
    public ClienteEntity update(ClienteEntity c) {
        ClienteEntity objcliente = clienteRepositorio.getById(c.getCodigo());
        // @BeanUtilz permite obtener funciones de spring
        BeanUtils.copyProperties(c, objcliente);
        return clienteRepositorio.save(objcliente);
    }

    @Override
    public ClienteEntity delete(ClienteEntity c) {
        ClienteEntity objcliente = clienteRepositorio.getById(c.getCodigo());
        objcliente.setEstado(false);
        return clienteRepositorio.save(objcliente);
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return clienteRepositorio.findAllCustom();
    }
}
