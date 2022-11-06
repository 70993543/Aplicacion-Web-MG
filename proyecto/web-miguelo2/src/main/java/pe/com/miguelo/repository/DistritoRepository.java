package pe.com.miguelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.miguelo.entity.DistritoEntity;

import java.util.List;

public interface DistritoRepository extends JpaRepository<DistritoEntity, Long> {
    @Query("select c from DistritoEntity c where c.estado=1")
    List<DistritoEntity> findAllCustom();
}

