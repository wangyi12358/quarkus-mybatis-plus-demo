/*
 Navicat Premium Data Transfer

 Source Server         : partnerResource
 Source Server Type    : MySQL
 Source Server Version : 50651
 Source Host           : 192.168.1.243:3306
 Source Schema         : partner_resource

 Target Server Type    : MySQL
 Target Server Version : 50651
 File Encoding         : 65001

 Date: 16/02/2023 16:27:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for example
-- ----------------------------
DROP TABLE IF EXISTS `example`;
CREATE TABLE `example` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` bigint(20) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;
