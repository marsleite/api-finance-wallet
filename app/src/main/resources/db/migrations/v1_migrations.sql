CREATE TABLE user (
    id INTEGER(11) NOT NULL AUTO_INCREMENT,
    user_name VARCHAR(11) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(20) NOT NULL,
    create_at DATETIME NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE categories (
    id INTEGER(11) NOT NULL AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    description VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE transactions(
    id INTEGER(11) NOT NULL AUTO_INCREMENT,
    date DATETIME NOT NULL,
    description VARCHAR(255) NOT NULL,
    total_value DECIMAL(10,2) NOT NULL,
    types ENUM('entrada', 'saida') NOT NULL,
    id_categories INTEGER(11) NOT NULL,
    id_user INTEGER(11) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categories) REFERENCES categories(id),
    FOREIGN KEY (id_user) REFERENCES user(id)
);