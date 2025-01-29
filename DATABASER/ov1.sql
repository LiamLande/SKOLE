-- SQL script for Real Estate Company Database
-- Author: Liam
-- Date: 2025-01-26

-- Drop existing tables if they exist
DROP TABLE IF EXISTS neighboorhood;
DROP TABLE IF EXISTS ownergroup;
DROP TABLE IF EXISTS houses;
DROP TABLE IF EXISTS transactions;

-- Create table for neighboorhood
CREATE TABLE neighboorhood (
    id INT PRIMARY KEY AUTO_INCREMENT,
    area VARCHAR(255) NOT NULL,
    city VARCHAR(100) NOT NULL,
    zip_code VARCHAR(10) NOT NULL,
    houses INT NOT NULL,
    details VARCHAR(50) NOT NULL,
    established_date DATE NOT NULL,
    owner_group_id INT NOT NULL FOREIGN KEY REFERENCES ownergroup(id)
) ENGINE=InnoDB;

CREATE TABLE ownergroup (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE houses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    address VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    neighboorhood_id INT NOT NULL FOREIGN KEY REFERENCES neighboorhood(id)
)

CREATE TABLE apartment_blocks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    address VARCHAR(255) NOT NULL,
    number_of_apartments INT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    neighboorhood_id INT NOT NULL FOREIGN KEY REFERENCES neighboorhood(id)
)

CREATE TABLE apartment (
    id INT PRIMARY KEY AUTO_INCREMENT,
    address VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    apartment_blocks_id INT NOT NULL FOREIGN KEY REFERENCES apartment_blocks(id)
)