DROP TABLE IF EXISTS bike;
CREATE TABLE
    bike
    (
        id BIGINT NOT NULL,
        contact BOOLEAN NOT NULL,
        email VARCHAR(50),
        model VARCHAR(50),
        name VARCHAR(50),
        phone VARCHAR(50),
        purchase_date DATE,
        purchase_price DOUBLE,
        serial_number VARCHAR(50),
        PRIMARY KEY (id)
    );
DROP TABLE IF EXISTS hibernate_sequence;
CREATE TABLE 
    hibernate_sequence
    (
        next_val BIGINT
    );