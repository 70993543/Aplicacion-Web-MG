package pe.com.miguelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.miguelo.entity.EmpleadoEntity;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {
    @Query("select c from EmpleadoEntity c where c.estado=1")
    List<EmpleadoEntity> findAllCustom();
}
