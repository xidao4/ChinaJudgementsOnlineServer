/*
 Navicat Premium Data Transfer

 Source Server         : aliyun
 Source Server Type    : MySQL
 Source Server Version : 50735
 Source Host           : 47.98.198.252:3306
 Source Schema         : judgements

 Target Server Type    : MySQL
 Target Server Version : 50735
 File Encoding         : 65001

 Date: 25/10/2021 17:04:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for doc
-- ----------------------------
DROP TABLE IF EXISTS `doc`;
CREATE TABLE `doc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 NOT NULL,
  `type` varchar(10) CHARACTER SET utf8 NOT NULL,
  `court` varchar(40) CHARACTER SET utf8 NOT NULL,
  `cause` varchar(100) CHARACTER SET utf8 NOT NULL,
  `content` varchar(600) CHARACTER SET utf8 NOT NULL,
  `status` varchar(1) CHARACTER SET utf8 NOT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of doc
-- ----------------------------
BEGIN;
INSERT INTO `doc` VALUES (1, 'title', 'type', 'court', 'cause', 'content', '0', NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
