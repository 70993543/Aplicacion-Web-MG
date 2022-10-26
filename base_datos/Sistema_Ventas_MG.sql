CREATE DATABASE db_miguelo;
USE db_miguelo;
CREATE TABLE cliente(
    Idcliente INT(11) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Dni VARCHAR(8) NOT NULL,
    Nombre VARCHAR(40) NOT NULL,
    ApellidoPaterno VARCHAR(50) NOT NULL,
    ApellidoMaterno VARCHAR(50) NOT NULL,
    Genero CHAR(1) NOT NULL,
    Direccion VARCHAR(100) NOT NULL,
    Correo VARCHAR(80) NOT NULL,
    Telefono INT(9) UNSIGNED,
    Estado BIT NOT NULL,
    CodDistrito INT UNSIGNED,
    FOREIGN KEY (CodDistrito) REFERENCES distrito(coDistrito)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE empleado(
    IdEmpleado INT(10) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Dni VARCHAR(8) NOT NULL,
    Nombre VARCHAR(40) NOT NULL ,
    ApellidoMaterno VARCHAR(50) NOT NULL,
    ApellidoPaterno VARCHAR(50) NOT NULL,
    Telefono INT(9) UNSIGNED Not Null ,
    Genero CHAR(1) NOT NULL,
    Estado BIT NOT NULL ,
    Usuario VARCHAR(20) NOT NULL,
    Contrasena VARCHAR(20) NOT NULL,
    CodRol INT UNSIGNED NOT NULL,
    CodDistrito INT UNSIGNED NOT NULL,
    FOREIGN KEY (CodDistrito) REFERENCES distrito(coDistrito),
    FOREIGN KEY (CodRol) REFERENCES rol(coRol)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE producto(
    IdProducto INT(11) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(244) NOT NULL ,
    Precio DOUBLE NOT NULL,
    Stock INT(11) NOT NULL,
    Estado BIT NOT NULL,
    CodCategoria INT UNSIGNED NOT NULL,
    FOREIGN KEY (CodCategoria) REFERENCES categoria(coCategoria)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE ventas(
  IdVentas INT(11) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
  IdCliente INT(11) UNSIGNED NOT NULL,
  IdEmpleado INT(10) UNSIGNED NOT NULL,
  NumeroSerie VARCHAR(244) DEFAULT NULL,
  FechaVentas DATE NOT NULL,
  Monto VARCHAR(1) NOT NULL,
  CONSTRAINT ventas_ibfk_1 FOREIGN KEY (IdEmpleado)REFERENCES empleado(IdEmpleado) ON DELETE NO ACTION ON UPDATE NO ACTION ,
  CONSTRAINT ventas_ibfk_2 FOREIGN KEY (IdCliente)REFERENCES cliente(Idcliente) ON DELETE NO ACTION ON UPDATE NO ACTION
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE detalle_ventas(
  IdDetalleVentas INT(11) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
  IdVentas INT(11) UNSIGNED NOT NULL,
  IdProducto INT(11) UNSIGNED NOT NULL,
  Cantidad INT(11) UNSIGNED NOT NULL,
  PrecioVenta DOUBLE NOT NULL,
  CONSTRAINT detalle_ventas_ibfk_1 FOREIGN KEY (IdVentas)REFERENCES ventas(IdVentas) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT detalle_ventas_ibfk_2 FOREIGN KEY (IdProducto)REFERENCES producto(IdProducto) ON DELETE NO ACTION ON UPDATE NO ACTION
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE distrito(
    coDistrito INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL ,
    estado BIT NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE categoria(
    coCategoria INT UNSIGNED AUTO_INCREMENT PRIMARY KEY NOT NULL ,
    nombre VARCHAR(40) NOT NULL ,
    estado BIT NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE rol(
    coRol INT UNSIGNED AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nombre VARCHAR(40) NOT NULL,
    estado BIT NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
DROP DATABASE IF EXISTS db_miguelo;