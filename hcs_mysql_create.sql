CREATE TABLE `banner` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`email` VARCHAR(50) NOT NULL UNIQUE,
	`image_url` VARCHAR(255) NOT NULL,
	`operator` VARCHAR(20) NOT NULL,
	`phone_number` VARCHAR(20) NOT NULL,
	`share_code` VARCHAR(20) NOT NULL,
	`user_name` VARCHAR(50) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `promo` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`description` VARCHAR(255) NOT NULL,
	`discount` INT NOT NULL,
	`image_url` VARCHAR(255) NOT NULL,
	`is_active` BOOLEAN NOT NULL,
	`title` VARCHAR(255) NOT NULL,
	`start_time` DATE NOT NULL,
	`end_time` DATE NOT NULL,
	`service_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `service` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`distance` INT NOT NULL,
	`cost` INT NOT NULL,
	`name` VARCHAR(255) NOT NULL,
	`type` INT NOT NULL,
	`image_url` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `user` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL,
	`phone_number` VARCHAR(20) NOT NULL,
	`email` VARCHAR(50) NOT NULL,
	`operator` VARCHAR(20) NOT NULL,
	`share_code` VARCHAR(20) NOT NULL,
	`image_url` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `task` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`location` VARCHAR(100) NOT NULL,
	`price` INT NOT NULL,
	`discount` INT NOT NULL,
	`unit` INT NOT NULL,
	`status` INT NOT NULL,
	`start_location` VARCHAR(100) NOT NULL,
	`end_location` VARCHAR(100) NOT NULL,
	`store_time` DATE NOT NULL,
	`user` INT NOT NULL,
	`promo` INT NOT NULL,
	`service` INT NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `promo` ADD CONSTRAINT `promo_fk0` FOREIGN KEY (`service_id`) REFERENCES `service`(`id`);

ALTER TABLE `task` ADD CONSTRAINT `task_fk0` FOREIGN KEY (`user`) REFERENCES `user`(`id`);

ALTER TABLE `task` ADD CONSTRAINT `task_fk1` FOREIGN KEY (`promo`) REFERENCES `promo`(`id`);

ALTER TABLE `task` ADD CONSTRAINT `task_fk2` FOREIGN KEY (`service`) REFERENCES `service`(`id`);

