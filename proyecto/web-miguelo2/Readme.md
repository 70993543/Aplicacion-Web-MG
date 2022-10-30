# 🎓Proyecto | Miguelo | Sistema de ventas  

Desarrolladores : Bryan Mancilla. Fabrizio, Jack Honorio

----------------------------------------------
## Conceptos

### Lombok 
Librería que te permite optimizar código, dentro de las principales opciones tenemoss

- **@Builder:** te permite generar la construcción de la clase
- **@AllArgsConstructor:** te permite generar el códicgo constructo con parámetros
- **@NoArgsConstructor:** te permite generar el método constructor sin parámetros
- **@Data:** Te permite generar los métods Get y Set

### Java Persistence
Es un API de persistencia de datos conocida como JPA, permite manejar datos relacionados en aplicaciones Java y utiliza como lenguaje de consulta el JPQL(Java Persistence Query Language).

Entre las principales opciones tenemos:
- **@Entity:** Defiene la entidad con la que se va a trabajar
- **@Table:** Define el nombre de la tabla con la cual se va a trabajar
- **@Id:** Define la clave primaria
- **@Column:** Define la columna de la tabla con la cual se va a relacionar
- **@GeneratedValue:** Permite definir el modo de autoincremento
- **@ManyToOne:** Define la relación de muchos a uno
- **@JoinColumn:** Define el campo que genera la clave foránea

Nota: En Java la **serialización** se relaciona con la manera con la cual los datos son serializados de forma predeterminda para ser utilizados en interfaces serializadas.

La serializaciónn consiste en convertir los obketos de una clase en secuencia de bytes para que estos puedan ser almacenados en la memoria RAM o enviados a una base de datos por medio de la red.


### **Application.properties** 
Este archivo nos permite configurar el Spring y definir configuraciones propias para nuestra aplicación
- **server.port:** permite definir el puerto de la aplicación
- **server.servlet.context-path:** permite definir la url del proyecto
- **spring.datasource.username:** permite definir usuario de la base de datos
- **spring.datasource.password:** permite definir la clave de la base de datos
- **spring.datasource.driver-class-name:** permite definir el driver de la base de datos

### JpaRspository
Nos permite tener acceso a métodos propios que nos permitirá realizar un crud, entre las cuales tenemos:
- **FindAll:** Permite mostrar todos los datos
- **FindbyId:** Permite buscar los datos por códigop
- **Save:** Permite guardar

### Repositorio
Los repositorios en Spring son las clases encargadas de gestionar el acceso a los datos, realizan todas las operaciones de persistencia en una tabla de la base de datos

### Servicios
Los servicios en Spring permite conectar a varios repositorios