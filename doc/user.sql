/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : springmvc-mybatis-book

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-05-01 18:11:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint (32) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `account` varchar (20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_name_index` (`name`) USING BTREE,
  KEY `user_account_index` (`account`) using BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user` VALUES ('1', '华仔','ah');
INSERT INTO `user` VALUES ('2', '萍妹','ap');
