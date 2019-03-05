/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : uchat

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 06/03/2019 00:53:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` bigint(16) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `passWord` varchar(64) NOT NULL,
  `email` varchar(255) NOT NULL,
  `nickName` varchar(16) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) /*!50100 STORAGE DISK */ ENGINE=InnoDB AUTO_INCREMENT=100000000001 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (100000000000, 'sdfsf', 'sfd', 'sdf', 'ff');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
