# **Application Web de Vente de Matériel Informatique - OSSEC**

<img src="src/main/resources/static/images/logo.png" height=240px width=360>

## Description

C'est mon premier projet utilisant Spring Boot. Je voulais faire une application web e-commerce pour l'apprendre. J'ai utilisé  **Spring Boot**, **Spring Security**, **Hibernate** avec **MySQL DataBase**, pour les vues que j'ai utilisé **Thymeleaf** template et **Bootstrap** CSS framework.

## Installation

Vous pouvez cloner ce projet et l'utiliser localement:
```sh
$ git clone https://https://github.com/boubakriibrahim/vente-website-ossec.git
```

**Ajouter ces utilisateur au MySQL commands**

Insérer deux roles:
```sh
INSERT INTO roles (id, name) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');
```
Insérer deux utilisateur et les donner leur roles:
```sh
INSERT INTO users (id, email, password, first_Name, last_Name) VALUES
(1, 'admin@gmail.com', '$2a$10$moTjfAVBJzNS32q7NPPVh.iAGDbZSkjZJBkdxT5ZLKQ3R1Vh/y9Fi', 'Admin', 'user'),
(2, 'user@gmail.com', '$2a$10$E4.ySXzoJGVRtuYHOYQ9GuCRJwr3v/lL6cQkxVUdUMMk88H8uVkZu', 'User', 'user');

INSERT INTO user_role(user_id, role_id) values
(1,1),
(1,2),
(2,2);

```

## Logins

Au départ, il y a 2 utilisateurs en mémoire:

Login: ```admin@gmail.com``` Password: ```123456``` avec **ADMIN** role.

Login: ```user@gmail.com``` Password: ```123456``` avec **USER** role.

## Roles

**ADMIN** peut ajouter, modifier et supprimer des produits et des catégories.

**USER** peut ajouter des produits au panier et les acheter.

## Remerciment

Grand merci à notre club **OSSEC - Open Source Software ENSI Club** en génerale et au deux chers encadreurs **Salem Dhouimir** et **Nermine Kad**.
