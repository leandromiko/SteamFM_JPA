CREATE SCHEMA STEAMFM;

CREATE TABLE STEAMFM.GENERO_JOGO (
ID_GENERO_JOGO INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
NOME_GENERO VARCHAR(100) NOT NULL
);

INSERT INTO STEAMFM.GENERO_JOGO (NOME_GENERO) VALUES ('2D'),
('A��o'),
('A��o / Aventura'),
('Alta Rejogabilidade'),
('Anime'),
('Arcade'),
('Atmosferico'),
('Aventura'),
('Baseado em Equipes'),
('Basquete'),
('Beat''em Up'),
('C�mera Topo-Baixo'),
('Cartunizado'),
('Casual'),
('Cl�ssico'),
('Clique Clique'),
('Com�dia'),
('Competitivo'),
('Controle por Toque'),
('Cooperativo'),
('Cooperativo Local'),
('Cooperativo Online'),
('Corrida'),
('Cyberpunk'),
('Dark Humor'),
('Desenhado � m�o'),
('Desenvolvimento de Jogos'),
('Design e ilustra��o'),
('Dif�cil'),
('Educativo'),
('Em Turnos'),
('Engra�ado'),
('Escolha a Sua Aventura'),
('Escolhas Importam'),
('Espacial'),
('Esportes'),
('Estilizado'),
('Estrat�gia'),
('Estrat�gia em Tempo Real (RTS)'),
('Estrat�gia em turnos'),
('Explora��o'),
('Fabrica��o'),
('Fantasia'),
('Fantasia Sombria'),
('Fic��o cient�fica'),
('F�sica'),
('fofo'),
('FPS'),
('Furtivo'),
('Game Maker'),
('genero'),
('Gr�ficos Pixelados'),
('Gratuito para Jogar'),
('Hack and Slash'),
('Hackear'),
('Hardware'),
('Hidden Object'),
('Hist�ria'),
('Hist�ria Alternativa'),
('Indie'),
('Infantil'),
('Jogador Deus'),
('Jogador x Inimigo (PvE)'),
('Jogador x Jogador (PvP)'),
('Jogo de A��o Focado em Perso'),
('J-RPG'),
('Kickstarter'),
('Local para 4 Jogadores'),
('M�quina Steam'),
('Mecha'),
('Medieval'),
('Metroidvania'),
('Multijogador'),
('Multijogador Local'),
('Multijogador Massivo Online (MMO)'),
('Mundo Aberto'),
('Mystery Dungeon'),
('Ninja'),
('Nudez'),
('Oficina de jogos'),
('Parkour'),
('Personaliza��o de Armas'),
('Personaliza��o de Personagens'),
('Plataforma'),
('Plataforma com Quebra-cabe�as'),
('Point-and-Click'),
('Primeira Pessoa'),
('Produ��o de �udio'),
('Produ��o de v�deo'),
('Protagonista feminina'),
('Publica��o para web'),
('Puzzle'),
('Quadrinhos'),
('Quick-Time Events'),
('Remake'),
('Rico em Hist�ria'),
('Roguelike'),
('Romance Visual'),
('RPG'),
('RPG de A��o'),
('RPG Maker'),
('sandbox'),
('Sangue'),
('Saquear'),
('SHMUP com vis�o de cima'),
('SHMUP de controle duplo'),
('Shoot ''em up (shmup)'),
('Simula��o'),
('Sobreviv�ncia'),
('software'),
('Software de treinamento'),
('Sombrio'),
('Soundtrack'),
('Star Wars'),
('Steampunk'),
('Super Her�i'),
('Tanques'),
('Terceira Pessoa'),
('Terror'),
('Terror de Sobreviv�ncia'),
('Tiro'),
('Tower Defense'),
('TrackIR'),
('trilha sonora boa'),
('Um jogador'),
('Utilit�rios'),
('Wargame'),
('Warhammer 40K'),
('Xadrez'),
('Zumbi');

CREATE TABLE STEAMFM.MUSICA (
ID_MUSICA INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
TITULO_MUSICA VARCHAR(100) NOT NULL,
ID_MUSICA_LASTFM INT NOT NULL
);

CREATE TABLE STEAMFM.ALBUM (
ID_ALBUM INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
TITULO_ALBUM VARCHAR(100) NOT NULL,
ID_ALBUM_LASTFM INT NOT NULL
);

CREATE TABLE STEAMFM.ARTISTA (
ID_ARTISTA INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
NOME_ARTISTA VARCHAR(100) NOT NULL,
ID_ARTISTA_LASTFM INT NOT NULL
);

CREATE TABLE STEAMFM.RELACAO (
ID_RELACAO INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
ID_GENERO_JOGO INT, FOREIGN KEY (ID_GENERO_JOGO) REFERENCES STEAMFM.GENERO_JOGO (ID_GENERO_JOGO) ON DELETE CASCADE,
ID_MUSICA INT, FOREIGN KEY (ID_MUSICA) REFERENCES STEAMFM.MUSICA (ID_MUSICA) ON DELETE CASCADE,
ID_ALBUM INT, FOREIGN KEY (ID_ALBUM) REFERENCES STEAMFM.ALBUM (ID_ALBUM) ON DELETE CASCADE,
ID_ARTISTA INT, FOREIGN KEY (ID_ARTISTA) REFERENCES STEAMFM.ARTISTA (ID_ARTISTA) ON DELETE CASCADE
);
 
--INSERT INTO STEAMFM.RELACAO(ID_GENERO_JOGO, ID_MUSICA, ID_ALBUM, ID_ARTISTA) VALUES (),();