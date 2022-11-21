package pe.com.miguelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.miguelo.entity.RolEntity;

import java.util.List;

public interface RolRepository extends JpaRepository<RolEntity, Long> {
    @Query("select c from RolEntity c where c.estado=1")
    List<RolEntity> findAllCustom();
}
