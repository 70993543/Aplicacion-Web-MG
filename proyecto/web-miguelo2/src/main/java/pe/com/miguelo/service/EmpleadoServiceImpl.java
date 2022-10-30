package pe.com.miguelo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.miguelo.entity.EmpleadoEntity;
import pe.com.miguelo.repository.EmpleadoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

   @Autowired
   private EmpleadoRepository empleadoRepositorio;

    @Override
    public List<EmpleadoEntity> findAll() {
        return empleadoRepositorio.findAll();
    }

    @Override
    public Optional<EmpleadoEntity> findById(Long id) {
        return empleadoRepositorio.findById(id);
    }

    @Override
    public EmpleadoEntity add(EmpleadoEntity c) {
        return empleadoRepositorio.save(c);
    }

    @Override
    public EmpleadoEntity update(EmpleadoEntity c) {
        EmpleadoEntity objempleado = empleadoRepositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objempleado);
        return empleadoRepositorio.save(objempleado);
    }

    @Override
    public EmpleadoEntity delete(EmpleadoEntity c) {
        EmpleadoEntity objempleado = empleadoRepositorio.getById(c.getCodigo());
        objempleado.setEstado(false);
        return  empleadoRepositorio.save(objempleado);
    }

    @Override
    public List<EmpleadoEntity> findAllCustom() {
        return empleadoRepositorio.findAllCustom();
    }
}
