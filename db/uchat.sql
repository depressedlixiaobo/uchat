/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : uchat

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 06/03/2019 18:29:13
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
  `email` varchar(255) DEFAULT NULL,
  `nickName` varchar(16) DEFAULT NULL,
  `mobile` varchar(20) NOT NULL COMMENT '用户手机号',
  `account` varchar(30) NOT NULL COMMENT '用户账号',
  PRIMARY KEY (`userId`,`account`,`mobile`) USING BTREE
) /*!50100 STORAGE DISK */ ENGINE=InnoDB AUTO_INCREMENT=100000000001 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (100000000000, 'sdfsf', 'sfd', 'sdf', 'ff', 'dsafdsaf');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
