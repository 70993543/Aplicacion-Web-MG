package pe.com.miguelo.entity;

// Utilizamos las anaotaciones lombok

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

// @Builder permite generar la construcción de la clase
@Builder
// @AllArgsConstructor te permite generar el método constructor con parámetros
@AllArgsConstructor
// @NoArgsContructor te permite generar el método constructor sin parametros
@NoArgsConstructor
// @Data te permite generar los métodos de get y set
@Data
// @Define la entidad con la que se va a trabajar
@Entity(name = "ClienteEntity")
// @Table define el nombre de la tabla
@Table(name = "cliente")
// se tiene que serializar la clase
public class ClienteEntity  implements Serializable {
    // agregamos el id de serialización
    @Serial
    private static final long serialVersionUID=1L;
    // @Id define la clave primaria
    @Id
    // @Column define la columna de la tabla con la cual se va a relacionar
    @Column(name = "Idcliente")
    // @GeneratedValue permite definir el modo de autoincremento
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "dni")
    private String dni;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidopaterno")
    private String apellidopaterno;
    @Column(name = "apellidomaterno")
    private String apellidomaterno;
    @Column(name = "genero")
    private char genero;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "teleforno")
    private int telefono;
    @Column(name = "estado")
    private boolean estado;
    // @ManyToOne define la relación de muchos a uno
    @ManyToOne
    // @JoinColumn define el campo que genera la clave foránea
    @JoinColumn(name = "coDistrito",nullable = false)
    private DistritoEntity distrito;
}

