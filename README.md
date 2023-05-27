# **An e-commerce web application for Computer Hardware Sales**

<img src="src/main/resources/static/images/logo.png" height=240px width=360>


## Installation

Clone the project:
```sh
$ git clone https://https://github.com/boubakriibrahim/vente-website-ossec.git
```

**Add users using these MySQL commands**

Adding roles:
```sh
INSERT INTO roles (id, name) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');
```
Adding user and admin and giving them roles:
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

Login: ```admin@gmail.com``` Password: ```123456``` avec **ADMIN** role.

Login: ```user@gmail.com``` Password: ```123456``` avec **USER** role.
