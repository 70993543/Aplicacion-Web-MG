package pe.com.miguelo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.miguelo.entity.RolEntity;
import pe.com.miguelo.repository.RolRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RolServiceImpl implements RolService {
    @Autowired
    private RolRepository rolrepositorio;

    @Override
    public List<RolEntity> findAll() {
        return rolrepositorio.findAll();
    }

    @Override
    public Optional<RolEntity> findById(Long id) {
        return rolrepositorio.findById(id);
    }

    @Override
    public RolEntity add(RolEntity c) {
        return rolrepositorio.save(c);
    }

    @Override
    public RolEntity update(RolEntity c) {
        RolEntity objRol = rolrepositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objRol);
        return rolrepositorio.save(objRol);
    }

    @Override
    public RolEntity delete(RolEntity c) {
        RolEntity objRol = rolrepositorio.getById(c.getCodigo());
        objRol.setEstado(false);
        return  rolrepositorio.save(objRol);
    }

    @Override
    public List<RolEntity> findAllCustom() {
        return rolrepositorio.findAllCustom();
    }
}
