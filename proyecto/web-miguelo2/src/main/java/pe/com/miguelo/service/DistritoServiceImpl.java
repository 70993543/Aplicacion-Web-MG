package pe.com.miguelo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.miguelo.entity.DistritoEntity;
import pe.com.miguelo.repository.DistritoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DistritoServiceImpl implements DistritoService{

    @Autowired
    private DistritoRepository distritoRepositorio;

    @Override
    public List<DistritoEntity> findAll() {
        return distritoRepositorio.findAll();
    }

    @Override
    public Optional<DistritoEntity> findById(Long id) {
        return distritoRepositorio.findById(id);
    }

    @Override
    public DistritoEntity add(DistritoEntity c) {
        return distritoRepositorio.save(c);
    }

    @Override
    public DistritoEntity update(DistritoEntity c) {
        DistritoEntity objdistrito = distritoRepositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objdistrito);
        return distritoRepositorio.save(objdistrito);
    }

    @Override
    public DistritoEntity delete(DistritoEntity c) {
        DistritoEntity objdistrito = distritoRepositorio.getById(c.getCodigo());
        objdistrito.setEstado(false);
        return distritoRepositorio.save(objdistrito);
    }

    @Override
    public List<DistritoEntity> findAllCustom() {
        return distritoRepositorio.findAllCustom();
    }
}
