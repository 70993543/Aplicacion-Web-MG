package pe.com.miguelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.miguelo.entity.ClienteEntity;

import java.util.List;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    // Creamos una función para mostrar todos los datos habilitados
    // Select * from cliente where estado = 1 --> MySQL
    // Select variable from Entidad variable-->JPQL
    // Select c from ClienteEntity c where c.estado=1
    @Query("select c from ClienteEntity c where c.estado")
    List<ClienteEntity> findAllCustom();
}

