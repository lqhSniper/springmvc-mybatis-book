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
-- Table structure for mood
-- ----------------------------
DROP TABLE IF EXISTS `mood`;
CREATE TABLE `mood` (
  `id` bigint (32) NOT NULL AUTO_INCREMENT,
  `content` varchar(256) DEFAULT NULL,
  `user_id` varchar (32) DEFAULT NULL,
  `publish_time` datetime DEFAULT NULL,
  `praise_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mood_user_id_index` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `mood` VALUES ('1', '今天天气不错哦……', '1', '2019-09-07 22:00:01', '100');
INSERT INTO `mood` VALUES ('2', '今天好累', '2', '2019-09-07 21:00:01', '100');
