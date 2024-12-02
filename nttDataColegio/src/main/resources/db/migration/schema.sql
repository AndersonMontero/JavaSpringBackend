CREATE TABLE colegio (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100)
);

CREATE TABLE profesor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100)
);

CREATE TABLE estudiante (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100)
);

CREATE TABLE curso (
    id INT AUTO_INCREMENT PRIMARY KEY,
    grado INT,
    salon VARCHAR(50),
    colegio_id INT,
    FOREIGN KEY (colegio_id) REFERENCES colegio(id)
);

CREATE TABLE asignatura (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    profesor_id INT,
    curso_id INT,
    FOREIGN KEY (profesor_id) REFERENCES profesor(id),
    FOREIGN KEY (curso_id) REFERENCES curso(id)
);

CREATE TABLE estudiante_asignatura (
    estudiante_id INT,
    asignatura_id INT,
    PRIMARY KEY (estudiante_id, asignatura_id),
    FOREIGN KEY (estudiante_id) REFERENCES estudiante(id),
    FOREIGN KEY (asignatura_id) REFERENCES asignatura(id)
);