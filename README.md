https://github.com/imane2004-desing/concoursinterne.git
Gestion des concours interne
Ce projet est une application de gestion des concours internes. Elle permet de gérer les concours, les participants, les jurys et les associations entre participants et concours. L'application est développée en Java avec une base de données MySQL.
Fonctionnalités
Ajouter un concours : Permet d'ajouter un nouveau concours avec son titre, sa description, la date de début et la date de fin.
Inscrire un participant à un concours : Permet d'ajouter un participant à un concours.
Rechercher un concours par titre : Permet de rechercher un concours en fonction de son titre.
La base de données MySQL est composée des tables suivantes :
Concours interne : Contient les informations sur les concours interne.
Participant : Contient les informations sur les participants.
ResultatConcours:pour représenter les résultats d'un participant dans un concours.
Schéma de la Base de Données:
CREATE TABLE ConcoursInterne (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255),
    date DATE,
    lieu VARCHAR(255)
);
CREATE TABLE Participant (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255),
    prenom VARCHAR(255),
    email VARCHAR(255)
);
CREATE TABLE ResultatConcours (
    concours_id INT NOT NULL,
    participant_id INT NOT NULL,
    note DECIMAL(5,2),
    PRIMARY KEY( concours_id,  participant_id ),
    FOREIGN KEY (concours_id) REFERENCES ConcoursInterne(id),
    FOREIGN KEY (participant_id) REFERENCES Participant(id)
);
