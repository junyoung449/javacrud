SHOW DATABASES;
USE crud_test;
CREATE DATABASE crud_test;
CREATE USER 'crud'@'localhost' IDENTIFIED BY 'crud';
GRANT ALL PRIVILEGES ON crud_test.* TO 'crud'@'localhost';
FLUSH PRIVILEGES;
DESC member;
DESC board;