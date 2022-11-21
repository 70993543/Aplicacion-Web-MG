package pe.com.miguelo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "EmpleadoEntity")
@Table(name = "empleado")
public class EmpleadoEntity implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "id_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "dni")
    private String dni;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido_paterno")
    private String apellidopaterno;
    @Column(name = "apellido_materno")
    private String apellidomaterno;
    @Column(name = "telefono")
    private int telefono;
    @Column(name = "genero")
    private char genero;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "estado")
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "cod_distrito", nullable = false)
    private DistritoEntity distrito;
    @ManyToOne
    @JoinColumn(name = "cod_rol", nullable = false)
    private RolEntity rol;
}

