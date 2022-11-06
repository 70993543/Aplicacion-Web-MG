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
@Entity(name = "DetalleVentasEntity")
@Table(name = "detalle_ventas")
public class DetalleVentasEntity implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "id_detalle_ventas")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "precio_venta")
    private double precioventa;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private ProductoEntity producto;
    @ManyToOne
    @JoinColumn(name = "id_ventas")
    private VentasEntity ventas;
}

