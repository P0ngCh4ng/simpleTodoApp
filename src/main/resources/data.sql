CREATE TABLE todos(
	id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    todo_name TEXT NOT NULL,
    todo_deadline TEXT NOT NULL,
    did boolean NOT NULL);