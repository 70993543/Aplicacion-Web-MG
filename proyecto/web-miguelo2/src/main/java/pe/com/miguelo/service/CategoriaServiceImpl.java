package pe.com.miguelo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.miguelo.entity.CategoriaEntity;
import pe.com.miguelo.repository.CategoriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    @Autowired
    private CategoriaRepository categoriarepositorio;


    @Override
    public List<CategoriaEntity> findAll() {
        return categoriarepositorio.findAll();
    }

    @Override
    public Optional<CategoriaEntity> findById(Long id) {
        return categoriarepositorio.findById(id);
    }

    @Override
    public CategoriaEntity add(CategoriaEntity c) {
        return categoriarepositorio.save(c);
    }

    @Override
    public CategoriaEntity update(CategoriaEntity c) {
        CategoriaEntity objCategoria = categoriarepositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objCategoria);
        return categoriarepositorio.save(objCategoria);
    }

    @Override
    public CategoriaEntity delete(CategoriaEntity c) {
        CategoriaEntity objCategoria = categoriarepositorio.getById(c.getCodigo());
        objCategoria.setEstado(false);
        return categoriarepositorio.save(objCategoria);
    }

    @Override
    public List<CategoriaEntity> findAllCustom() {
        return categoriarepositorio.findAllCustom();
    }
}
