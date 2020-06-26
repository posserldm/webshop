/*
 Navicat Premium Data Transfer

 Source Server         : msql
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost:3306
 Source Schema         : webshop

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 25/06/2020 22:54:36
*/
DROP database IF EXISTS `webshop`;
CREATE database `webshop`;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`address_id`) USING BTREE,
  INDEX `username`(`username`) USING BTREE,
  CONSTRAINT `address_ibfk_1` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (2, '小明', '贺州学院');
INSERT INTO `address` VALUES (4, '小明', '贺州学院');
INSERT INTO `address` VALUES (8, 'posserldm', '贺州学院本校');
INSERT INTO `address` VALUES (9, 'posserldm', '贺州学院西校区');
INSERT INTO `address` VALUES (10, '小陈', '贺州学院西校区');
INSERT INTO `address` VALUES (11, '小陈', '贺州学院');
INSERT INTO `address` VALUES (12, '小陈', '贺州学院本校');
INSERT INTO `address` VALUES (13, '小陈', '贺州学院本校');
INSERT INTO `address` VALUES (14, '小陈', '贺州学院本校');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `author` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` float(10, 2) NOT NULL,
  `inventory` int(10) NOT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`goods_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, '高等数学', '', 50.00, 100, NULL);

-- ----------------------------
-- Table structure for myorder
-- ----------------------------
DROP TABLE IF EXISTS `myorder`;
CREATE TABLE `myorder`  (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone_number` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `state` tinyint(1) NOT NULL,
  `goods_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `goods_number` smallint(5) NOT NULL,
  `goods_price` float(10, 2) NULL DEFAULT NULL,
  `cost` float(8, 2) NOT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `times` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE,
  INDEX `username`(`username`) USING BTREE,
  CONSTRAINT `myorder_ibfk_1` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 161 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of myorder
-- ----------------------------
INSERT INTO `myorder` VALUES (5, '小明', '15107746090', '贺州学院', 1, 'java', 2, 10.00, 20.00, 'images/3.jpg', '2020-06-25 00:01:15');
INSERT INTO `myorder` VALUES (16, '小明', '15107746090', '贺州学院', 1, 'c++程序设计', 1, 38.80, 38.80, 'images/3.jpg', '2020-06-25 10:19:13');
INSERT INTO `myorder` VALUES (17, '小明', '15107746090', '贺州学院', 2, 'c语言程序设计', 1, 48.00, 48.00, 'images/3.jpg', '2020-06-25 10:20:17');
INSERT INTO `myorder` VALUES (18, '小明', '15107746090', '贺州学院', 4, 'python程序设计', 1, 40.60, 40.60, 'images/3.jpg', '2020-06-25 10:20:49');
INSERT INTO `myorder` VALUES (19, '小明', '15107746090', '贺州学院', 3, 'java程序设计', 1, 40.60, 40.60, 'images/3.jpg', '2020-06-25 10:22:36');
INSERT INTO `myorder` VALUES (80, 'posserldm', '15107746090', '贺州学院', 4, 'java程序设计', 1, 62.00, 62.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (81, 'posserldm', '15107746090', '贺州学院', 1, 'c++程序设计', 1, 43.00, 43.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (82, 'posserldm', '15107746090', '贺州学院', 2, 'c++程序设计', 1, 30.00, 30.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (83, 'posserldm', '15107746090', '贺州学院', 1, 'python程序设计', 1, 76.00, 76.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (84, 'posserldm', '15107746090', '贺州学院', 4, '计算机网络', 1, 21.00, 21.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (85, 'posserldm', '15107746090', '贺州学院', 1, 'c语言程序设计', 1, 79.00, 79.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (86, 'posserldm', '15107746090', '贺州学院', 3, 'python程序设计', 1, 21.00, 21.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (87, 'posserldm', '15107746090', '贺州学院', 2, '计算机组成原理', 1, 80.00, 80.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (88, 'posserldm', '15107746090', '贺州学院', 2, '数据结构与算法', 1, 11.00, 11.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (89, 'posserldm', '15107746090', '贺州学院', 4, 'c语言程序设计', 1, 10.00, 10.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (90, 'posserldm', '15107746090', '贺州学院', 4, '计算机组成原理', 1, 98.00, 98.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (91, 'posserldm', '15107746090', '贺州学院', 3, 'java程序设计', 1, 31.00, 31.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (92, 'posserldm', '15107746090', '贺州学院', 4, '数据结构与算法', 1, 67.00, 67.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (93, 'posserldm', '15107746090', '贺州学院', 4, 'python程序设计', 1, 16.00, 16.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (94, 'posserldm', '15107746090', '贺州学院', 3, 'java程序设计', 1, 53.00, 53.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (95, 'posserldm', '15107746090', '贺州学院', 1, 'java程序设计', 1, 95.00, 95.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (96, 'posserldm', '15107746090', '贺州学院', 3, '计算机网络', 1, 4.00, 4.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (97, 'posserldm', '15107746090', '贺州学院', 2, 'c++程序设计', 1, 90.00, 90.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (98, 'posserldm', '15107746090', '贺州学院', 2, 'java程序设计', 1, 92.00, 92.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (99, 'posserldm', '15107746090', '贺州学院', 4, 'c++程序设计', 1, 57.00, 57.00, 'images/3.jpg', '2020-06-25 21:29:41');
INSERT INTO `myorder` VALUES (100, '小明', '15107746090', '贺州学院', 2, '计算机网络', 1, 93.00, 93.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (101, '小明', '15107746090', '贺州学院', 4, 'c++程序设计', 1, 72.00, 72.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (102, '小明', '15107746090', '贺州学院', 2, 'java程序设计', 1, 74.00, 74.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (103, '小明', '15107746090', '贺州学院', 3, 'c++程序设计', 1, 2.00, 2.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (104, '小明', '15107746090', '贺州学院', 4, 'python程序设计', 1, 43.00, 43.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (105, '小明', '15107746090', '贺州学院', 1, 'c语言程序设计', 1, 63.00, 63.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (106, '小明', '15107746090', '贺州学院', 4, 'c语言程序设计', 1, 42.00, 42.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (107, '小明', '15107746090', '贺州学院', 1, '计算机网络', 1, 60.00, 60.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (108, '小明', '15107746090', '贺州学院', 4, 'c++程序设计', 1, 71.00, 71.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (109, '小明', '15107746090', '贺州学院', 3, 'python程序设计', 1, 49.00, 49.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (110, '小明', '15107746090', '贺州学院', 3, 'java程序设计', 1, 55.00, 55.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (111, '小明', '15107746090', '贺州学院', 4, 'python程序设计', 1, 17.00, 17.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (112, '小明', '15107746090', '贺州学院', 4, 'java程序设计', 1, 82.00, 82.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (113, '小明', '15107746090', '贺州学院', 4, 'java程序设计', 1, 98.00, 98.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (114, '小明', '15107746090', '贺州学院', 2, '计算机组成原理', 1, 47.00, 47.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (115, '小明', '15107746090', '贺州学院', 2, 'c语言程序设计', 1, 83.00, 83.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (116, '小明', '15107746090', '贺州学院', 3, 'java程序设计', 1, 34.00, 34.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (117, '小明', '15107746090', '贺州学院', 1, '计算机网络', 1, 80.00, 80.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (118, '小明', '15107746090', '贺州学院', 1, 'python程序设计', 1, 34.00, 34.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (119, '小明', '15107746090', '贺州学院', 3, 'c语言程序设计', 1, 54.00, 54.00, 'images/3.jpg', '2020-06-25 21:31:06');
INSERT INTO `myorder` VALUES (120, '小明', '15107746090', '贺州学院', 4, '数据结构与算法', 1, 96.00, 96.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (121, '小明', '15107746090', '贺州学院', 4, 'c++程序设计', 1, 59.00, 59.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (122, '小明', '15107746090', '贺州学院', 2, '计算机网络', 1, 2.00, 2.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (123, '小明', '15107746090', '贺州学院', 4, 'java程序设计', 1, 60.00, 60.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (124, '小明', '15107746090', '贺州学院', 1, 'c++程序设计', 1, 23.00, 23.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (125, '小明', '15107746090', '贺州学院', 3, '数据结构与算法', 1, 20.00, 20.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (126, '小明', '15107746090', '贺州学院', 4, '计算机网络', 1, 7.00, 7.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (127, '小明', '15107746090', '贺州学院', 1, '计算机组成原理', 1, 26.00, 26.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (128, '小明', '15107746090', '贺州学院', 4, '计算机网络', 1, 23.00, 23.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (129, '小明', '15107746090', '贺州学院', 1, 'c语言程序设计', 1, 2.00, 2.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (130, '小明', '15107746090', '贺州学院', 4, '数据结构与算法', 1, 52.00, 52.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (131, '小明', '15107746090', '贺州学院', 1, 'python程序设计', 1, 14.00, 14.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (132, '小明', '15107746090', '贺州学院', 1, '计算机网络', 1, 13.00, 13.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (133, '小明', '15107746090', '贺州学院', 4, 'c语言程序设计', 1, 78.00, 78.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (134, '小明', '15107746090', '贺州学院', 3, 'c++程序设计', 1, 24.00, 24.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (135, '小明', '15107746090', '贺州学院', 4, '计算机网络', 1, 34.00, 34.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (136, '小明', '15107746090', '贺州学院', 4, '计算机组成原理', 1, 75.00, 75.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (137, '小明', '15107746090', '贺州学院', 3, 'c++程序设计', 1, 63.00, 63.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (138, '小明', '15107746090', '贺州学院', 1, '计算机网络', 1, 39.00, 39.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (139, '小明', '15107746090', '贺州学院', 4, 'c语言程序设计', 1, 26.00, 26.00, 'images/3.jpg', '2020-06-25 21:33:48');
INSERT INTO `myorder` VALUES (142, '小陈', '15107746090', '贺州学院', 3, 'java程序设计', 1, 12.00, 12.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (143, '小陈', '15107746090', '贺州学院', 2, 'c++程序设计', 1, 65.00, 65.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (144, '小陈', '15107746090', '贺州学院', 2, 'python程序设计', 1, 89.00, 89.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (145, '小陈', '15107746090', '贺州学院', 1, 'python程序设计', 1, 62.00, 62.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (146, '小陈', '15107746090', '贺州学院', 4, '计算机组成原理', 1, 39.00, 39.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (147, '小陈', '15107746090', '贺州学院', 1, 'java程序设计', 1, 67.00, 67.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (148, '小陈', '15107746090', '贺州学院', 1, 'c++程序设计', 1, 55.00, 55.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (149, '小陈', '15107746090', '贺州学院', 3, 'java程序设计', 1, 31.00, 31.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (150, '小陈', '15107746090', '贺州学院', 2, 'java程序设计', 1, 12.00, 12.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (151, '小陈', '15107746090', '贺州学院', 1, 'c语言程序设计', 1, 6.00, 6.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (152, '小陈', '15107746090', '贺州学院', 3, '计算机组成原理', 1, 49.00, 49.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (153, '小陈', '15107746090', '贺州学院', 3, 'java程序设计', 1, 98.00, 98.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (155, '小陈', '15107746090', '贺州学院', 1, '计算机组成原理', 1, 49.00, 49.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (156, '小陈', '15107746090', '贺州学院', 3, 'c++程序设计', 1, 12.00, 12.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (157, '小陈', '15107746090', '贺州学院', 4, 'python程序设计', 1, 51.00, 51.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (158, '小陈', '15107746090', '贺州学院', 1, 'c++程序设计', 1, 43.00, 43.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (159, '小陈', '15107746090', '贺州学院', 3, 'c++程序设计', 1, 28.00, 28.00, 'images/3.jpg', '2020-06-25 21:34:51');
INSERT INTO `myorder` VALUES (160, '小陈', '15107746090', '贺州学院', 4, 'c++程序设计', 1, 59.00, 59.00, 'images/3.jpg', '2020-06-25 21:34:51');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone_number` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `head_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('posserldm', '123456', '12345679011', '1782342391@qq.com', 'images/3.jpg');
INSERT INTO `user` VALUES ('小明', '123456', '15107746090', '1782342391@qq.com', 'images/3.jpg');
INSERT INTO `user` VALUES ('小陈', '123456', '15107746090', '1782342391@qq.com', 'images/3.jpg');

SET FOREIGN_KEY_CHECKS = 1;
