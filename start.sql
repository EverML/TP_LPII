--DROPS THE TABLE..
DROP TABLE IF EXISTS computadores;

-- CREATE THE Table computadores;
CREATE TABLE computadores (
	codigo serial NOT NULL,
	nombre varchar NULL,
	descripcion varchar NULL,
	precio numeric(12,2),
	tiene_garantia BOOLEAN NOT NULL DEFAULT FALSE,
	duracion_garantia varchar NULL,
	CONSTRAINT computadores_pkey PRIMARY KEY (codigo)
);


--INSERT SOME Dummy data.
INSERT into computadores (nombre,descripcion,precio,tiene_garantia,duracion_garantia) values
('Notebook I3','Notebook de Gama BAJA',500,FALSE,NULL),
('Notebook I5','Notebook de Gama MEDIA',650,TRUE,'6 MESES'),
('Notebook I7','Notebook de Gama ALTA',800,TRUE,NULL);
