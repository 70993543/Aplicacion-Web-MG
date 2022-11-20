package pe.com.miguelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.miguelo.entity.CategoriaEntity;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
    @Query("select c from CategoriaEntity c where c.estado=1")
    List<CategoriaEntity> findAllCustom();
}
