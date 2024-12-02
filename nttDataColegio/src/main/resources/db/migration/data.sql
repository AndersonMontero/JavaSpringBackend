-- Inserta el colegio
INSERT INTO colegio (nombre) VALUES ('El colegio del Olimpo');

-- Inserta los estudiantes
INSERT INTO estudiante (nombre) VALUES
  ('Afrodita'),
  ('Apolo'),
  ('Atenea'),
  ('Ares'),
  ('Artemisa'),
  ('Dionisio'),
  ('Hefesto'),
  ('Hera'),
  ('Hermes'),
  ('Hades'),
  ('Poseidón'),
  ('Zeus');

-- Inserta los docentes
INSERT INTO profesor (nombre) VALUES
  ('Némesis'),
  ('Príapo'),
  ('Iris');

-- Inserta los cursos
INSERT INTO curso (grado, salon, colegio_id) VALUES
  (10, 'A', (SELECT id FROM colegio WHERE nombre = 'El colegio del Olimpo')),
  (10, 'B', (SELECT id FROM colegio WHERE nombre = 'El colegio del Olimpo')),
  (11, 'A', (SELECT id FROM colegio WHERE nombre = 'El colegio del Olimpo')),
  (11, 'B', (SELECT id FROM colegio WHERE nombre = 'El colegio del Olimpo'));

-- Inserta las asignaturas
INSERT INTO asignatura (nombre, profesor_id, curso_id) VALUES
  ('Matemáticas', (SELECT id FROM profesor WHERE nombre = 'Némesis'), (SELECT id FROM curso WHERE grado = 10 AND salon = 'A')),
  ('Matemáticas', (SELECT id FROM profesor WHERE nombre = 'Némesis'), (SELECT id FROM curso WHERE grado = 10 AND salon = 'B')),
  ('Matemáticas', (SELECT id FROM profesor WHERE nombre = 'Némesis'), (SELECT id FROM curso WHERE grado = 11 AND salon = 'A')),
  ('Matemáticas', (SELECT id FROM profesor WHERE nombre = 'Némesis'), (SELECT id FROM curso WHERE grado = 11 AND salon = 'B')),
  ('Español', (SELECT id FROM profesor WHERE nombre = 'Príapo'), (SELECT id FROM curso WHERE grado = 10 AND salon = 'A')),
  ('Español', (SELECT id FROM profesor WHERE nombre = 'Príapo'), (SELECT id FROM curso WHERE grado = 10 AND salon = 'B')),
  ('Ingles Básico', (SELECT id FROM profesor WHERE nombre = 'Iris'), (SELECT id FROM curso WHERE grado = 10 AND salon = 'A')),
  ('Ingles Avanzado', (SELECT id FROM profesor WHERE nombre = 'Iris'), (SELECT id FROM curso WHERE grado = 10 AND salon = 'B')),  
  ('Pre Icfes', (SELECT id FROM profesor WHERE nombre = 'Némesis'), (SELECT id FROM curso WHERE grado = 11 AND salon = 'A')),
  ('Pre Icfes', (SELECT id FROM profesor WHERE nombre = 'Némesis'), (SELECT id FROM curso WHERE grado = 11 AND salon = 'B'));

-- Inserta las relaciones entre asignaturas, docentes y cursos
INSERT INTO estudiante_asignatura (estudiante_id, asignatura_id) VALUES
  ((SELECT id FROM estudiante WHERE nombre = 'Afrodita'), (SELECT id FROM asignatura WHERE nombre = 'Matemáticas' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'A'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Apolo'), (SELECT id FROM asignatura WHERE nombre = 'Matemáticas' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'A'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Ares'), (SELECT id FROM asignatura WHERE nombre = 'Matemáticas' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'A'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Afrodita'), (SELECT id FROM asignatura WHERE nombre = 'Español' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'A'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Apolo'), (SELECT id FROM asignatura WHERE nombre = 'Español' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'A'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Ares'), (SELECT id FROM asignatura WHERE nombre = 'Español' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'A'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Afrodita'), (SELECT id FROM asignatura WHERE nombre = 'Ingles Básico' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'A'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Apolo'), (SELECT id FROM asignatura WHERE nombre = 'Ingles Básico' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'A'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Ares'), (SELECT id FROM asignatura WHERE nombre = 'Ingles Básico' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'A'))),  
  ((SELECT id FROM estudiante WHERE nombre = 'Artemisa'), (SELECT id FROM asignatura WHERE nombre = 'Matemáticas' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Atenea'), (SELECT id FROM asignatura WHERE nombre = 'Matemáticas' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Dionisio'), (SELECT id FROM asignatura WHERE nombre = 'Matemáticas' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Artemisa'), (SELECT id FROM asignatura WHERE nombre = 'Español' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Atenea'), (SELECT id FROM asignatura WHERE nombre = 'Español' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Dionisio'), (SELECT id FROM asignatura WHERE nombre = 'Español' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Artemisa'), (SELECT id FROM asignatura WHERE nombre = 'Ingles Avanzado' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Atenea'), (SELECT id FROM asignatura WHERE nombre = 'Ingles Avanzado' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Dionisio'), (SELECT id FROM asignatura WHERE nombre = 'Ingles Avanzado' AND curso_id = (SELECT id FROM curso WHERE grado = 10 AND salon = 'B'))),  
  ((SELECT id FROM estudiante WHERE nombre = 'Hefesto'), (SELECT id FROM asignatura WHERE nombre = 'Matemáticas' AND curso_id = (SELECT id FROM curso WHERE grado = 11 AND salon = 'A'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Hera'), (SELECT id FROM asignatura WHERE nombre = 'Matemáticas' AND curso_id = (SELECT id FROM curso WHERE grado = 11 AND salon = 'A'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Hefesto'), (SELECT id FROM asignatura WHERE nombre = 'Pre Icfes' AND curso_id = (SELECT id FROM curso WHERE grado = 11 AND salon = 'A'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Hera'), (SELECT id FROM asignatura WHERE nombre = 'Pre Icfes' AND curso_id = (SELECT id FROM curso WHERE grado = 11 AND salon = 'A'))),  
  ((SELECT id FROM estudiante WHERE nombre = 'Hermes'), (SELECT id FROM asignatura WHERE nombre = 'Matemáticas' AND curso_id = (SELECT id FROM curso WHERE grado = 11 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Hades'), (SELECT id FROM asignatura WHERE nombre = 'Matemáticas' AND curso_id = (SELECT id FROM curso WHERE grado = 11 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Poseidón'), (SELECT id FROM asignatura WHERE nombre = 'Matemáticas' AND curso_id = (SELECT id FROM curso WHERE grado = 11 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Zeus'), (SELECT id FROM asignatura WHERE nombre = 'Matemáticas' AND curso_id = (SELECT id FROM curso WHERE grado = 11 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Hermes'), (SELECT id FROM asignatura WHERE nombre = 'Pre Icfes' AND curso_id = (SELECT id FROM curso WHERE grado = 11 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Hades'), (SELECT id FROM asignatura WHERE nombre = 'Pre Icfes' AND curso_id = (SELECT id FROM curso WHERE grado = 11 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Poseidón'), (SELECT id FROM asignatura WHERE nombre = 'Pre Icfes' AND curso_id = (SELECT id FROM curso WHERE grado = 11 AND salon = 'B'))),
  ((SELECT id FROM estudiante WHERE nombre = 'Zeus'), (SELECT id FROM asignatura WHERE nombre = 'Pre Icfes' AND curso_id = (SELECT id FROM curso WHERE grado = 11 AND salon = 'B')));