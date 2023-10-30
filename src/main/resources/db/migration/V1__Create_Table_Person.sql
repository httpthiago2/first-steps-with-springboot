CREATE DATABASE IF NOT EXISTS `rest_spring_boot_thiago`;
USE `rest_spring_boot_thiago`;

CREATE TABLE IF NOT EXISTS `person` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `first_name` varchar(80) NOT NULL,
    `last_name` varchar(80) NOT NULL,
    `address` varchar(80) NOT NULL,
    `gender` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
    );