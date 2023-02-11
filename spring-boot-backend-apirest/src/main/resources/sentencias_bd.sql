/*
CREAR BD
*/
CREATE DATABASE db_springboot_backend;

/*
VER BDs
*/
SHOW DATABASES;

/*
USAR BD CREADA
*/
USE db_springboot_backend;

/*
CREAR TABLA EN LA BD
*/
CREATE TABLE clientes (
  id BIGINT(20) NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  apellido VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  create_at DATE NOT NULL,
  PRIMARY KEY (id)
);

/*
ACTUALIZAR NOMBRE DE LA TABLA
*/
ALTER TABLE clientes RENAME TO cliente;

/*
VER TABLAS DE LA BD
*/
SHOW TABLES;

/*
INSERTAR VALORES UNO A UNO
*/
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Andrés', 'Guzmán', 'profesor@bolsadeideas.com', '2018-01-01');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06');

/*
INSERTAR VALORES VARIOS A LA VEZ
*/
INSERT INTO clientes (nombre, apellido, email, create_at)
VALUES ('John', 'Doe', 'johndoe@example.com', '2022-01-01'),
       ('Jane', 'Doe', 'janedoe@example.com', '2022-02-01'),
       ('Bob', 'Smith', 'bobsmith@example.com', '2022-03-01');

/*
VER VALORES DE LA TABLA
*/
SELECT * FROM clientes;