-- Insertar películas solo si no existen
INSERT INTO movie (title, director, genre, release_year) 
SELECT 'The Shawshank Redemption', 'Frank Darabont', 'DRAMA', 1994
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'The Shawshank Redemption' AND director = 'Frank Darabont');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'The Godfather', 'Francis Ford Coppola', 'CRIME', 1972
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'The Godfather' AND director = 'Francis Ford Coppola');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'The Dark Knight', 'Christopher Nolan', 'ACTION', 2008
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'The Dark Knight' AND director = 'Christopher Nolan');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'Pulp Fiction', 'Quentin Tarantino', 'CRIME', 1994
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'Pulp Fiction' AND director = 'Quentin Tarantino');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'Schindler''s List', 'Steven Spielberg', 'DRAMA', 1993
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'Schindler''s List' AND director = 'Steven Spielberg');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'Forrest Gump', 'Robert Zemeckis', 'DRAMA', 1994
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'Forrest Gump' AND director = 'Robert Zemeckis');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'Inception', 'Christopher Nolan', 'SCIENCE_FICTION', 2010
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'Inception' AND director = 'Christopher Nolan');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'The Matrix', 'Lana Wachowski', 'SCIENCE_FICTION', 1999
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'The Matrix' AND director = 'Lana Wachowski');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'The Silence of the Lambs', 'Jonathan Demme', 'THRILLER', 1991
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'The Silence of the Lambs' AND director = 'Jonathan Demme');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'Fight Club', 'David Fincher', 'DRAMA', 1999
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'Fight Club' AND director = 'David Fincher');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'Titanic', 'James Cameron', 'ROMANCE', 1997
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'Titanic' AND director = 'James Cameron');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'The Lord of the Rings: The Fellowship of the Ring', 'Peter Jackson', 'FANTASY', 2001
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'The Lord of the Rings: The Fellowship of the Ring' AND director = 'Peter Jackson');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'The Godfather: Part II', 'Francis Ford Coppola', 'CRIME', 1974
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'The Godfather: Part II' AND director = 'Francis Ford Coppola');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'The Dark Knight Rises', 'Christopher Nolan', 'ACTION', 2012
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'The Dark Knight Rises' AND director = 'Christopher Nolan');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'The Lord of the Rings: The Two Towers', 'Peter Jackson', 'FANTASY', 2002
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'The Lord of the Rings: The Two Towers' AND director = 'Peter Jackson');
INSERT INTO movie (title, director, genre, release_year) 
SELECT 'The Dark Knight', 'Christopher Nolan', 'ACTION', 2008
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'The Dark Knight' AND director = 'Christopher Nolan');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'Forrest Gump', 'Robert Zemeckis', 'DRAMA', 1994
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'Forrest Gump' AND director = 'Robert Zemeckis');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'The Godfather', 'Francis Ford Coppola', 'CRIME', 1972
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'The Godfather' AND director = 'Francis Ford Coppola');

INSERT INTO movie (title, director, genre, release_year) 
SELECT 'Inception', 'Christopher Nolan', 'SCIENCE_FICTION', 2010
WHERE NOT EXISTS (SELECT 1 FROM movie WHERE title = 'Inception' AND director = 'Christopher Nolan');