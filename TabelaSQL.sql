CREATE DATABASE IF NOT EXISTS `pais`;

USE `pais`;

CREATE TABLE IF NOT EXISTS `pais`.`pais`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `nome` VARCHAR(100) NOT NULL,
    `populacao` BIGINT NOT NULL,
    `area` DECIMAL(15,2) NOT NULL,
    PRIMARY KEY (`id`)
);

select * from pais;




drop database pais;