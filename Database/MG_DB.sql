CREATE DATABASE db_mg;
DROP DATABASE IF EXISTS db_mg;
USE db_mg;
CREATE TABLE distrito(
    id_distrito INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    estado BIT NOT NULL
)ENGINE = InnoDB;
INSERT INTO distrito(nombre, estado)VALUES ('Los Olivos', 1);
CREATE TABLE rol(
    id_rol INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    estado BIT NOT NULL
)ENGINE = InnoDB;
CREATE TABLE categoria(
    id_categoria INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    estado BIT NOT NULL
)ENGINE = InnoDB;
CREATE TABLE cliente(
    id_cliente INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    dni VARCHAR(8) NOT NULL,
    nombre VARCHAR(40) NOT NULL,
    apellido_paterno VARCHAR(50) NOT NULL,
    apellido_materno VARCHAR(50) NOT NULL,
    genero CHAR(1) NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    correo VARCHAR(80) NOT NULL,
    telefono INT UNSIGNED,
    estado BIT NOT NULL,
    cod_distrito INT UNSIGNED NOT NULL,
    FOREIGN KEY (cod_distrito) REFERENCES distrito(id_distrito)
)ENGINE=InnoDB;
INSERT INTO cliente(dni, nombre, apellido_paterno, apellido_materno, genero, direccion, correo, telefono, estado, cod_distrito)VALUES('60434436','Carlos', 'Sanchez', 'Mercedez', 'M', 'calle los alamos', 'sanche23@gmail.com', 904345125, 1, 1);
CREATE TABLE empleado(
    id_empleado INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    dni VARCHAR(8) NOT NULL,
    nombre VARCHAR(40) NOT NULL,
    apellido_paterno VARCHAR(50) NOT NULL,
    apellido_materno VARCHAR(50) NOT NULL,
    telefono INT UNSIGNED NOT NULL,
    genero CHAR(1) NOT NULL,
    usuario VARCHAR(20) NOT NULL,
    cod_rol INT UNSIGNED NOT NULL,
    cod_distrito INT UNSIGNED NOT NULL,
    FOREIGN KEY (cod_distrito) REFERENCES distrito(id_distrito),
    FOREIGN KEY (cod_rol)REFERENCES rol(id_rol),
    estado BIT NOT NULL
)ENGINE = InnoDB;

CREATE TABLE producto(
    id_producto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(80) NOT NULL,
    precio DOUBLE NOT NULL,
    stock INT NOT NULL,
    estado BIT NOT NULL,
    cod_categoria INT UNSIGNED NOT NULL,
    FOREIGN KEY (cod_categoria) REFERENCES categoria(id_categoria)
)ENGINE = InnoDB;
CREATE TABLE ventas(
    id_ventas INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    numero_serie VARCHAR(20) DEFAULT NULL,
    fecha_ventas VARCHAR(20) NOT NULL,
    monto VARCHAR(10) NOT NULL,
    cod_cliente INT UNSIGNED NOT NULL,
    cod_empleado INT UNSIGNED NOT NULL,
    FOREIGN KEY (cod_cliente) REFERENCES cliente(id_cliente),
    FOREIGN KEY (cod_empleado) REFERENCES empleado(id_empleado)
)ENGINE = InnoDB;
CREATE TABLE detalle_ventas(
    id_detalle_ventas INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    cantidad INT UNSIGNED NOT NULL,
    precio_venta DOUBLE NOT NULL,
    cod_ventas INT UNSIGNED NOT NULL,
    cod_producto INT UNSIGNED NOT NULL,
    FOREIGN KEY (cod_ventas) REFERENCES ventas(id_ventas),
    FOREIGN KEY (cod_producto) REFERENCES producto(id_producto)
)ENGINE = InnoDB;
SELECT * FROM distrito;
SELECT * FROM cliente;
TRUNCATE TABLE distrito;

