#eliminar BD
DROP DATABASE Vacunas;
#creamos base de datos
CREATE DATABASE IF NOT EXISTS Vacunas;
#seleccionar bd
USE Vacunas;

#Tablas
CREATE TABLE IF NOT EXISTS usuarios(
Idusuario INT AUTO_INCREMENT,
Npasaporte VARCHAR(15) NOT NULL,
Correo VARCHAR (20) NOT NULL,
Contraseña VARCHAR(10) NOT NULL,
Telefono VARCHAR (12),
Nacionalidad VARCHAR(12),
Eps VARCHAR (12),
PRIMARY KEY(Idusuario)
)ENGINE = INNODB;


CREATE TABLE IF NOT EXISTS ciudad(
Id_ciudad INT AUTO_INCREMENT,
Ciudad_Actual VARCHAR(15) NOT NULL,
Ciudad_destino VARCHAR(15) NOT NULL,
Numero_vacunas INT,
Sintomas INT,
Idusuario INT NOT NULL,
PRIMARY KEY (Id_ciudad),
FOREIGN KEY (Idusuario)
REFERENCES usuarios(Idusuario)
)ENGINE = INNODB;
