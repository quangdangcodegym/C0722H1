-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema c07_hello
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema c07_hello
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `c07_hello` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `c07_hello` ;

-- -----------------------------------------------------
-- Table `c07_hello`.`VatTu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `c07_hello`.`VatTu` (
  `MaVTu` INT NOT NULL AUTO_INCREMENT,
  `TenVTu` VARCHAR(45) NULL,
  PRIMARY KEY (`MaVTu`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `c07_hello`.`PhieuXuat`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `c07_hello`.`PhieuXuat` (
  `SoPX` INT NOT NULL AUTO_INCREMENT,
  `NgayXuat` DATETIME NULL,
  PRIMARY KEY (`SoPX`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `c07_hello`.`ChiTietPhieuXuat`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `c07_hello`.`ChiTietPhieuXuat` (
  `IDVTu` INT NOT NULL,
  `IDSoPXuat` INT NOT NULL,
  `DGiaXuat` DECIMAL NULL,
  `SLXuat` INT NULL,
  PRIMARY KEY (`IDVTu`, `IDSoPXuat`),
  INDEX `fk_idphieuxuat_idx` (`IDSoPXuat` ASC) VISIBLE,
  CONSTRAINT `fk_idvattu`
    FOREIGN KEY (`IDVTu`)
    REFERENCES `c07_hello`.`VatTu` (`MaVTu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_idphieuxuat`
    FOREIGN KEY (`IDSoPXuat`)
    REFERENCES `c07_hello`.`PhieuXuat` (`SoPX`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `c07_hello`.`PhieuNhap`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `c07_hello`.`PhieuNhap` (
  `SoPN` INT NOT NULL AUTO_INCREMENT,
  `NgayNhap` DATETIME NULL,
  PRIMARY KEY (`SoPN`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `c07_hello`.`ChiTietPhieuNhap`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `c07_hello`.`ChiTietPhieuNhap` (
  `IDPhieuNhap` INT NOT NULL,
  `IDMaVTu` INT NOT NULL,
  `DGiaNhap` DECIMAL NULL,
  `SLNhap` INT NULL,
  PRIMARY KEY (`IDPhieuNhap`, `IDMaVTu`),
  INDEX `fk_nhap_idvattu_idx` (`IDMaVTu` ASC) VISIBLE,
  CONSTRAINT `fk_nhap_idvattu`
    FOREIGN KEY (`IDMaVTu`)
    REFERENCES `c07_hello`.`VatTu` (`MaVTu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_nhap_idphieunhap`
    FOREIGN KEY (`IDPhieuNhap`)
    REFERENCES `c07_hello`.`PhieuNhap` (`SoPN`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `c07_hello`.`NhaCC`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `c07_hello`.`NhaCC` (
  `MaNhaCC` INT NOT NULL,
  `TenNhaCC` VARCHAR(45) NULL,
  `DiaChi` VARCHAR(45) NULL,
  `SDT` VARCHAR(45) NULL,
  PRIMARY KEY (`MaNhaCC`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `c07_hello`.`DonDH`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `c07_hello`.`DonDH` (
  `SoDH` INT NOT NULL AUTO_INCREMENT,
  `NgayDatHang` DATETIME NULL,
  `MaNhaCC` INT NULL,
  PRIMARY KEY (`SoDH`),
  INDEX `fk_dondh_manhacc_idx` (`MaNhaCC` ASC) VISIBLE,
  CONSTRAINT `fk_dondh_manhacc`
    FOREIGN KEY (`MaNhaCC`)
    REFERENCES `c07_hello`.`NhaCC` (`MaNhaCC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `c07_hello`.`ChiTietDatHang`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `c07_hello`.`ChiTietDatHang` (
  `IdVatTu` INT NOT NULL,
  `IdDonHang` INT NOT NULL,
  PRIMARY KEY (`IdVatTu`, `IdDonHang`),
  INDEX `fk_chitietdathang_iddonhang_idx` (`IdDonHang` ASC) VISIBLE,
  CONSTRAINT `fk_chitietdathang_idvattu`
    FOREIGN KEY (`IdVatTu`)
    REFERENCES `c07_hello`.`VatTu` (`MaVTu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_chitietdathang_iddonhang`
    FOREIGN KEY (`IdDonHang`)
    REFERENCES `c07_hello`.`DonDH` (`SoDH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
