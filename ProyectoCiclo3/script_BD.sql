#eliminar BD
DROP DATABASE Vacunas;
#creamos base de datos
CREATE DATABASE IF NOT EXISTS Vacunas;
#seleccionar bd
USE Vacunas;

#Tablas
CREATE TABLE IF NOT EXISTS usuarios(
Idusuario INT AUTO_INCREMENT,
Nombres VARCHAR(20) NOT NULL,
Apellidos VARCHAR(20) NOT NULL,
Pais_nacimiento VARCHAR(15) NOT NULL,
Fecha_Nacimiento DATE NOT NULL,
Dpto_Residencia VARCHAR(12) NOT NULL,
Ciudad_Residencia VARCHAR(12) NOT NULL,
Direccion VARCHAR(15) NOT NULL,
Tipo_Documento VARCHAR(3) NOT NULL,
Numero_Documento VARCHAR(20) NOT NULL,
Npasaporte VARCHAR(15) NOT NULL,
Fecha_VencePasaporte DATE NOT NULL,
Correo VARCHAR (20) NOT NULL,
Contraseña VARCHAR(10) NOT NULL,
Confirmar_Contraseña VARCHAR(10) NOT NULL
PRIMARY KEY(Idusuario)
)ENGINE = INNODB;


CREATE TABLE IF NOT EXISTS ciudad(
Id_ciudad INT AUTO_INCREMENT,
Ciudad_Actual VARCHAR(15) NOT NULL,
Ciudad_destino VARCHAR(15) NOT NULL,
Numero_vacunas INT NOT NULL,
Sintomas INT NOT NULL,
Idusuario INT NOT NULL,
PRIMARY KEY (Id_ciudad),
FOREIGN KEY (Idusuario)
REFERENCES usuarios(Idusuario)
)ENGINE = INNODB;
