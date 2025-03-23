https://github.com/imane2004-desing/concoursinterne.git

Gestion des Concours Internes

Description

La Gestion des Concours Internes est une application Java Swing conçue pour simplifier l'organisation et la gestion des concours au sein d'une institution. Elle offre une plateforme centralisée pour enregistrer les informations des concours, gérer les participants et les résultats, et faciliter la communication entre les organisateurs et les participants.

Contexte

Dans le cadre de l'organisation des concours académiques ou professionnels, il est essentiel de disposer d'un outil efficace pour gérer les inscriptions, suivre les performances des participants et produire des rapports. Cet outil permettra de centraliser les informations, réduisant ainsi les erreurs et facilitant l'accès aux données nécessaires.

Problématique

Actuellement, la gestion des concours est souvent réalisée de manière manuelle ou avec des outils disparates, ce qui entraîne des difficultés dans la gestion des données, la communication entre les organisateurs et les participants, ainsi que la production de rapports précis et fiables.

Objectifs

Centraliser les informations : Regrouper toutes les données relatives aux concours, aux participants et aux résultats dans une base de données unique.

Faciliter la gestion : Offrir une interface conviviale pour la création de concours, l'enregistrement des participations et la gestion des résultats.

Améliorer le suivi : Permettre aux organisateurs de suivre les inscriptions et les performances des participants.

Optimiser la recherche : Permettre une recherche efficace des participants par nom et un filtrage des résultats par concours.

Diagrammes

Diagramme Use Case 

![WhatsApp Image 2025-03-22 à 02 44 00_c72d45ce](https://github.com/user-attachments/assets/3cb8ba23-c55f-4d45-bbc5-bbdbbb6c0154)


Diagramme de Classe :

![image](https://github.com/user-attachments/assets/49b75c1c-95ea-4f5c-9f15-fc74b5e482fd)

Architecture

![image](https://github.com/user-attachments/assets/dc711cd8-48c4-4c6a-8309-aaa8a3f5f4dd)


Technologies

Langage : Java

Framework d'interface graphique : Java Swing

Base de données : MySQL

Bibliothèque graphique : JFreeChart (pour les graphiques)

Outils de développement :

oIDE Java : NetBeans

oOutil de diagramme : Staruml

oOutil de gestion de base de données : phpMyAdmin

Accès aux données : JDBC

Structure de la Base de Données

Le système repose sur trois tables principales :

CREATE TABLE concoursinterne (

    id INT(11) AUTO_INCREMENT PRIMARY KEY,
    
    nom VARCHAR(255) NOT NULL,
    
    date DATE NOT NULL,
    
    lieu VARCHAR(255) NOT NULL
    
);

CREATE TABLE participant (

    id INT(11) AUTO_INCREMENT PRIMARY KEY,
    
    nom VARCHAR(100) NOT NULL,
    
    prenom VARCHAR(255) NULL,
    
    email VARCHAR(255) NOT NULL UNIQUE
    
);

CREATE TABLE resultatconcours (

   
    concours_id INT(11) NOT NULL,
    
    participant_id INT(11) NOT NULL,
    
    note DECIMAL(5,2) NULL,
    
    FOREIGN KEY (concours_id) REFERENCES concoursinterne(id) ,
    
    FOREIGN KEY (participant_id) REFERENCES participant(id)
    
);

Fonctionnalités

Créer un concours : Interface pour que les organisateurs puissent créer un nouveau concours.

Enregistrer la participation : Permet aux participants de s'inscrire à des concours.

Filtrer les résultats par concours : Offre la possibilité de visualiser les résultats d'un concours spécifique.

Rechercher un participant : Fonctionnalité de recherche pour trouver un participant par son nom.


