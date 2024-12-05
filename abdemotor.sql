DROP DATABASE IF EXISTS abdemotor;
CREATE DATABASE IF NOT EXISTS abdemotor;
USE abdemotor;

CREATE TABLE coche (
    id  INT AUTO_INCREMENT PRIMARY KEY,
    tipoVehiculo VARCHAR(50),
    marca VARCHAR(50),
    matricula VARCHAR(50),
    color VARCHAR(50),
    precio DOUBLE
);

-- Esto es nuevo
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(50) UNIQUE NOT NULL,
    contrasena VARCHAR(100) NOT NULL,
    rol VARCHAR(20) NOT NULL
);


INSERT INTO usuarios (usuario, contrasena, rol) VALUES 
("abde","1234","Administrador");

INSERT INTO coche (tipoVehiculo, marca, color, precio) VALUES 
    ('SUV', 'Mercedes', 'Gris metalizado', 55000.00),
    ('SUV', 'Mercedes', 'Blanco', 56000.00),
    ('SUV', 'Mercedes', 'Negro', 57000.00),
    ('SUV', 'Mercedes', 'Rojo', 58000.00),
    ('SUV', 'Audi', 'Gris metalizado', 53000.00),
    ('SUV', 'Audi', 'Blanco', 54000.00),
    ('SUV', 'Audi', 'Negro', 55000.00),
    ('SUV', 'Audi', 'Plata', 56000.00),
    ('SUV', 'Lamborghini', 'Gris metalizado', 200000.00),
    ('SUV', 'Lamborghini', 'Blanco', 210000.00),
    ('SUV', 'Ferrari', 'Rojo', 220000.00),
    ('Sedán', 'Mercedes', 'Gris metalizado', 50000.00),
    ('Sedán', 'Mercedes', 'Blanco', 51000.00),
    ('Sedán', 'Mercedes', 'Negro', 52000.00),   
    ('Sedán', 'Audi', 'Rojo', 48000.00),
    ('Sedán', 'Audi', 'Plata', 49000.00),
    ('Sedán', 'Audi', 'Gris metalizado', 50000.00),    
    ('Sedán', 'Lamborghini', 'Rojo', 240000.00),   
    ('Sedán', 'Ferrari', 'Blanco', 250000.00),
    ('Deportivo', 'Lamborghini', 'Negro', 260000.00),
    ('Deportivo', 'Lamborghini', 'Rojo', 270000.00),
    ('Deportivo', 'Ferrari', 'Blanco', 275000.00),
    ('Deportivo', 'Ferrari', 'Gris metalizado', 280000.00);
    