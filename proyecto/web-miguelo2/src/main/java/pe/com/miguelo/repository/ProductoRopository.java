package pe.com.miguelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.miguelo.entity.ProductoEntity;

import java.util.List;

public interface ProductoRopository extends JpaRepository<ProductoEntity, Long> {
    @Query("select c from ProductoEntity c where c.estado=1")
    List<ProductoEntity> findAllCustom();
}
