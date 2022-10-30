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
@Entity(name = "VentasEntity")
@Table(name = "ventas")
public class VentasEntity implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "idVentas")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "numeroserie")
    private String numeroserie;
    @Column(name = "fechaventas")
    private String fechaventas;
    @Column(name = "monto")
    private String monto;
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private ClienteEntity cliente;
    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    private EmpleadoEntity empleado;
}


