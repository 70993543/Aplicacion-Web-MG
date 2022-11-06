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
    @Column(name = "id_ventas")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "numero_serie")
    private String numeroserie;
    @Column(name = "fecha_ventas")
    private String fechaventas;
    @Column(name = "monto")
    private String monto;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteEntity cliente;
    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private EmpleadoEntity empleado;
}


