BEGIN;
	INSERT INTO urna(secao, zona, presidente_secao) VALUES(420, 30, 'Maria');
COMMIT;

BEGIN;
	INSERT INTO partido(numero_partido, nome_partido, legenda_partido) VALUES(13, 'Partido dos Trabalhadores', 'PT');
COMMIT;

BEGIN;
	INSERT INTO candidato(nome, numero_candidato, uf_candidato, partido_candidato, tipo_candidato) VALUES('Fernando Haddad', 13, 'SP', 13, 'Presidente');
	INSERT INTO candidato(nome, numero_candidato, uf_candidato, partido_candidato, tipo_candidato) VALUES('Manuela DAvila', 13, 'SP', 13, 'Vice-Presidente');
COMMIT;

BEGIN;
	INSERT INTO chapa(nome_candidato, nome_vice_candidato, numero_chapa) VALUES(1, 2, 13);
COMMIT;

BEGIN;
	INSERT INTO partido VALUES(17, 'PSL', 'PSL');
COMMIT;

BEGIN;
	INSERT INTO candidato(nome, numero_candidato, uf_candidato, partido_candidato, tipo_candidato) VALUES ('Jair Bolsonaro', 17, 'RJ', 17, 'Presidente');
	INSERT INTO candidato(nome, numero_candidato, uf_candidato, partido_candidato, tipo_candidato) VALUES ('General Mourão', 17, 'RJ', 17, 'Vice-Presidente');
COMMIT;

BEGIN;
	INSERT INTO chapa (nome_candidato, nome_vice_candidato, numero_chapa) VALUES (3, 4, 17);
COMMIT;


BEGIN;
	INSERT INTO eleitor VALUES(189306479235, 'Helison Ortiz Cavalheiro', 04285314070, 'RS', 'F', 1);
	INSERT INTO eleitor VALUES(253698745896, 'João da Silva', 25369856478, 'RS', 'F', 1);
	INSERT INTO eleitor VALUES(361546987535, 'Maria Fernanda', 23695463215, 'RS', 'F', 1);
	INSERT INTO eleitor VALUES(453698975368, 'Paula Rafaela', 26349685631, 'RS', 'F', 1);
	INSERT INTO eleitor VALUES(362458795362, 'Marcos Luís', 69851563254, 'RS', 'F', 1);
COMMIT;


BEGIN;
	INSERT INTO usuario(login_user, passwd_user, tipo_user, urna_user) VALUES('root', 12345, 'SU', 1);
	INSERT INTO usuario(login_user, passwd_user, tipo_user, urna_user) VALUES('mesario1', 123456, 'USR', 1);
COMMIT;
