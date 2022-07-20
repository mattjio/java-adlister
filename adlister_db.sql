CREATE DATABASE IF NOT EXISTS adlister_db;
USE adlister_db;


CREATE USER 'adlister'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON adlister_db.* TO 'adlister'@'localhost';


CREATE TABLE IF NOT EXISTS users (
  id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

/* create ads table */
CREATE TABLE IF NOT EXISTS ads (
  id int(11) NOT NULL AUTO_INCREMENT,
  user_id int(11) NOT NULL,
  title varchar(255) NOT NULL,
  description text NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users(id)
);

