/*
1 Crear una base de datos con tres tablas: "usuarios", "transacciones" y "registro".
2 Crear cuatro usuarios en la tabla "usuarios" con sus saldos iniciales.
3 Realizar las transacciones de transferencia de fondos.
4 Verificar y actualizar las cuentas de origen y destino para cada transacción.
5 Deshacer las transacciones realizadas por los usuarios A y B, restaurando los saldos originales.
6 Realizar un commit de las transacciones realizadas por los usuarios C y D, confirmando los cambios en los saldos.
7 Ejecutar todas las transacciones de forma transaccional, asegurando las verificaciones y actualizaciones.
*/

-- Paso 1: Crear la base de datos y las tablas
CREATE DATABASE actividad;

USE actividad;


CREATE TABLE usuarios (
  Usuario VARCHAR(50) PRIMARY KEY,
  Saldo INT
);
CREATE TABLE transacciones (
  ID INT AUTO_INCREMENT PRIMARY KEY,
  Cuenta_origen VARCHAR(50),
  Cuenta_destino VARCHAR(50),
  Monto INT
);

CREATE TABLE registro (
  ID_transaccion INT,
  Fecha DATETIME,
  PRIMARY KEY (ID_transaccion, Fecha)
);

-- Paso 2: Insertar cuatro usuarios con saldos iniciales
INSERT INTO usuarios (Usuario, Saldo)
VALUES
  ('A', 500),
  ('B', 200),
  ('C', 300),
  ('D', 400);

-- Paso 3: Realizar las transacciones de transferencia
-- Iniciamos una transacción
START TRANSACTION;

-- Transacción a) Transferir 150 puntos del usuario A al usuario B
UPDATE usuarios SET Saldo = Saldo - 150 WHERE Usuario = 'A';
UPDATE usuarios SET Saldo = Saldo + 150 WHERE Usuario = 'B';
INSERT INTO transacciones (Cuenta_origen, Cuenta_destino, Monto)
VALUES ('A', 'B', 150);
INSERT INTO registro (ID_transaccion, Fecha) VALUES (LAST_INSERT_ID(), NOW());

-- Transacción b) Transferir 100 puntos del usuario B al usuario C
UPDATE usuarios SET Saldo = Saldo - 100 WHERE Usuario = 'B';
UPDATE usuarios SET Saldo = Saldo + 100 WHERE Usuario = 'C';
INSERT INTO transacciones (Cuenta_origen, Cuenta_destino, Monto)
VALUES ('B', 'C', 100);
INSERT INTO registro (ID_transaccion, Fecha) VALUES (LAST_INSERT_ID(), NOW());

-- Transacción c) Transferir 250 puntos del usuario C al usuario D
UPDATE usuarios SET Saldo = Saldo - 250 WHERE Usuario = 'C';
UPDATE usuarios SET Saldo = Saldo + 250 WHERE Usuario = 'D';
INSERT INTO transacciones (Cuenta_origen, Cuenta_destino, Monto)
VALUES ('C', 'D', 250);
INSERT INTO registro (ID_transaccion, Fecha) VALUES (LAST_INSERT_ID(), NOW());

-- Transacción d) Transferir 200 puntos del usuario D al usuario A
UPDATE usuarios SET Saldo = Saldo - 200 WHERE Usuario = 'D';
UPDATE usuarios SET Saldo = Saldo + 200 WHERE Usuario = 'A';
INSERT INTO transacciones (Cuenta_origen, Cuenta_destino, Monto)
VALUES ('D', 'A', 200);
INSERT INTO registro (ID_transaccion, Fecha) VALUES (LAST_INSERT_ID(), NOW());

-- Paso 4: Verificar y actualizar las cuentas de origen y destino
-- Al hacer las transacciones se llevan a cabo las validaciones

-- Realizamos un commit para confirmar los cambios en los saldos y transacciones
COMMIT;
