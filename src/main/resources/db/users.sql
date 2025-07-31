-- Insertar usuarios solo si no existen
INSERT INTO user (username, name, password) 
SELECT 'john_doe', 'John Doe', '$2a$10$ix2q7lD/09.QB4z5iTuJf.Y7zlZoWkDn4K1NZi9F/mgr4Mc3plum6'
WHERE NOT EXISTS (SELECT 1 FROM user WHERE username = 'john_doe');

INSERT INTO user (username, name, password) 
SELECT 'jane_smith', 'Jane Smith', '$2a$10$RtKoAVsZmAKfNu2eXUfR2u1XyOo.u0M.WiE/N4MOrZEPH3T4wN9G2'
WHERE NOT EXISTS (SELECT 1 FROM user WHERE username = 'jane_smith');

INSERT INTO user (username, name, password) 
SELECT 'bob_jones', 'Bob Jones', '$2a$10$FoUa/CNMENNU/rdsNrUZl.8BkNpmwEKzTDFfP.HpFb8FD7jUHZ5aG'
WHERE NOT EXISTS (SELECT 1 FROM user WHERE username = 'bob_jones');

INSERT INTO user (username, name, password) 
SELECT 'alice_walker', 'Alice Walker', '$2a$10$6q/QwNwQpN3dOzl6Z9VZM.iIbgl1BR/7TP2.eSMp3B9RDCnNW18Ma'
WHERE NOT EXISTS (SELECT 1 FROM user WHERE username = 'alice_walker');

INSERT INTO user (username, name, password) 
SELECT 'michael_brown', 'Michael Brown', '$2a$10$8EbdB3AaXH9t6hEC2yPFtu.HpTJrq9ClYE0ITNu0Gn9pI32ukA/Hi'
WHERE NOT EXISTS (SELECT 1 FROM user WHERE username = 'michael_brown');

INSERT INTO user (username, name, password) 
SELECT 'emily_wilson', 'Emily Wilson', '$2a$10$X5bC6aLY/gBq9aeJwfiB.eMgQ4LB3efB6AqDU8Veql4AmDx1o5xU6'
WHERE NOT EXISTS (SELECT 1 FROM user WHERE username = 'emily_wilson');

INSERT INTO user (username, name, password) 
SELECT 'charlie_miller', 'Charlie Miller', '$2a$10$C1iOz8TkNfuQugjM/t/r4uNV6gmrDZxJDLA9.MLvAowvKKfwQV/eO'
WHERE NOT EXISTS (SELECT 1 FROM user WHERE username = 'charlie_miller');

INSERT INTO user (username, name, password) 
SELECT 'olivia_jackson', 'Olivia Jackson', '$2a$10$SyDl6r48LPk0gP0nr3XUeetE8ZtoIKMoQylYcbSf0X/Qohtc1UWt2'
WHERE NOT EXISTS (SELECT 1 FROM user WHERE username = 'olivia_jackson');

INSERT INTO user (username, name, password) 
SELECT 'william_anderson', 'William Anderson', '$2a$10$Qk.8wLM.HOaFFf1u4wA6SuUR7nRdGZSwflS9VSt/S2kjjzYJmdI2i'
WHERE NOT EXISTS (SELECT 1 FROM user WHERE username = 'william_anderson');

INSERT INTO user (username, name, password) 
SELECT 'oliver_thompson', 'Oliver Thompson', '$2a$10$jPQGMHyLyWG.DPo2bF1wF.znmq4V3ekd6XAK8PfX8dbP0G.T0SYHy'
WHERE NOT EXISTS (SELECT 1 FROM user WHERE username = 'oliver_thompson');