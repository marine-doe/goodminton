-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema goodminton
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema goodminton
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `goodminton` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `goodminton` ;

-- -----------------------------------------------------
-- Table `goodminton`.`court`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `goodminton`.`court` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `location` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `goodminton`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `goodminton`.`user` (
  `id` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `goodminton`.`book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `goodminton`.`book` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `team_count` INT NOT NULL DEFAULT '1',
  `date` INT NOT NULL,
  `user_id` VARCHAR(45) NOT NULL,
  `court_id` INT NOT NULL,
  `team_total` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_book_user1_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_book_court1_idx` (`court_id` ASC) VISIBLE,
  CONSTRAINT `fk_book_court1`
    FOREIGN KEY (`court_id`)
    REFERENCES `goodminton`.`court` (`id`),
  CONSTRAINT `fk_book_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `goodminton`.`user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `goodminton`.`comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `goodminton`.`comment` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `video_id` VARCHAR(45) NOT NULL,
  `user_id` VARCHAR(45) NOT NULL,
  `content` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_comment_user1_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `fk_comment_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `goodminton`.`user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `goodminton`.`favoritecourt`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `goodminton`.`favoritecourt` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(45) NOT NULL,
  `count` INT NOT NULL DEFAULT '1',
  `court_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_favoriteCourt_user1_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_favoriteCourt_court1_idx` (`court_id` ASC) VISIBLE,
  CONSTRAINT `fk_favoriteCourt_court1`
    FOREIGN KEY (`court_id`)
    REFERENCES `goodminton`.`court` (`id`),
  CONSTRAINT `fk_favoriteCourt_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `goodminton`.`user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `goodminton`.`member`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `goodminton`.`member` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `book_id` INT NOT NULL,
  `user_id` VARCHAR(45) NOT NULL,
  INDEX `fk_member_book_idx` (`book_id` ASC) VISIBLE,
  INDEX `fk_member_user1_idx` (`user_id` ASC) VISIBLE,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_member_book`
    FOREIGN KEY (`book_id`)
    REFERENCES `goodminton`.`book` (`id`),
  CONSTRAINT `fk_member_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `goodminton`.`user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `goodminton`.`mailbox`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `goodminton`.`mailbox` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(45) NOT NULL,
  `message` VARCHAR(45) NOT NULL,
  `read` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  INDEX `fk_mailbox_user1_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `fk_mailbox_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `goodminton`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
