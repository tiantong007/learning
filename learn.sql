/*
 Navicat Premium Data Transfer

 Source Server         : 1
 Source Server Type    : MySQL
 Source Server Version : 80033
 Source Host           : localhost:3306
 Source Schema         : learn

 Target Server Type    : MySQL
 Target Server Version : 80033
 File Encoding         : 65001

 Date: 25/06/2023 11:51:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for certificate
-- ----------------------------
DROP TABLE IF EXISTS `certificate`;
CREATE TABLE `certificate`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '证书ID',
  `user_id` int NULL DEFAULT NULL COMMENT '用户id',
  `course_id` int NULL DEFAULT NULL COMMENT '课程id',
  `create_time` datetime NULL DEFAULT NULL COMMENT '发放时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id`(`user_id` ASC) USING BTREE,
  INDEX `course_id`(`course_id` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of certificate
-- ----------------------------
INSERT INTO `certificate` VALUES (1, 1, 1, '2023-06-25 19:29:45');
INSERT INTO `certificate` VALUES (2, NULL, NULL, NULL);
INSERT INTO `certificate` VALUES (4, 2, 3, '2023-06-25 19:29:45');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `user_id` int NOT NULL COMMENT '用户id',
  `course_id` int NOT NULL COMMENT '课程id',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '评论内容',
  `likes` int NULL DEFAULT 0 COMMENT '点赞数',
  `collect` int NULL DEFAULT 0 COMMENT '收藏数',
  `create_time` datetime NULL DEFAULT NULL COMMENT '评论时间',
  `hide` int NOT NULL DEFAULT 0 COMMENT '是否隐藏',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (1, 0, 0, 'String', 0, 0, '2023-06-25 01:24:24', 0);
INSERT INTO `comment` VALUES (3, 1, 1, 'String', 0, 0, '2023-06-24 08:00:00', 1);
INSERT INTO `comment` VALUES (4, 1, 1, 'String', 0, 0, '2023-06-25 19:35:44', 0);

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `c_id` int NOT NULL AUTO_INCREMENT COMMENT '课程id',
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '课程名',
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '课程描述',
  `price` decimal(10, 2) NULL DEFAULT 0.00 COMMENT '课程价格',
  `type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '图文课程' COMMENT '课程类型',
  `start_date` date NULL DEFAULT NULL COMMENT '开始日期',
  `end_date` date NULL DEFAULT NULL COMMENT '结束日期',
  `teacher` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '任课老师',
  `techer_id` int NULL DEFAULT NULL COMMENT '老师id',
  PRIMARY KEY (`c_id`) USING BTREE,
  INDEX `techer_id`(`techer_id` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, 'JAVA', '超级棒', 0.00, '视频课程', '2023-06-25', '2023-06-25', 'String', 1);
INSERT INTO `course` VALUES (2, 'String', 'String', 0.00, 'String', '2023-06-25', '2023-06-25', 'String', 0);
INSERT INTO `course` VALUES (3, 'String', 'String', 0.00, 'String', '2023-06-25', '2023-06-25', 'String', 0);
INSERT INTO `course` VALUES (4, 'String', 'String', 0.00, 'String', '2023-06-24', '2023-06-26', 'String', 0);
INSERT INTO `course` VALUES (5, 'String', 'String', 10.00, 'String', '2023-06-25', '2023-06-25', 'StriAAng', 2);
INSERT INTO `course` VALUES (6, 'Python', '世界上最好的语言', 2.00, '视频课程', '2023-06-25', '2023-06-25', '王泽桦', 1);
INSERT INTO `course` VALUES (7, 'JAVA', '超级棒', 0.00, '视频课程', '2023-06-25', '2023-06-25', 'String', 2);

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '信息id',
  `u_id` int NULL DEFAULT NULL COMMENT '发送用户id',
  `r_id` int NULL DEFAULT NULL COMMENT '接收用户id',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '发送内容',
  `create_time` datetime NULL DEFAULT NULL COMMENT '发送时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `u_id`(`u_id` ASC) USING BTREE,
  INDEX `r_id`(`r_id` ASC) USING BTREE,
  CONSTRAINT `message_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `message_ibfk_2` FOREIGN KEY (`r_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES (1, 1, 1, 'String', '2023-06-25 19:24:21');
INSERT INTO `message` VALUES (2, 6, 6, 'kMMBscemOh', '2013-12-04 12:35:41');
INSERT INTO `message` VALUES (3, 10, 10, 'rpHOE1Tp8H', '2004-01-22 13:45:53');
INSERT INTO `message` VALUES (5, 6, 6, 'pawoYg8wNJ', '2005-08-12 19:58:07');
INSERT INTO `message` VALUES (6, 9, 9, 'T0WlT9YxZK', '2005-09-23 19:48:40');
INSERT INTO `message` VALUES (7, 5, 5, 'cS4r2YP6mZ', '2018-01-05 00:25:38');
INSERT INTO `message` VALUES (15, NULL, NULL, 'A', '2023-06-25 09:08:32');
INSERT INTO `message` VALUES (16, NULL, NULL, 'String', '2023-06-25 08:56:34');
INSERT INTO `message` VALUES (17, 2, 3, 'aa', '2023-06-25 19:47:49');
INSERT INTO `message` VALUES (18, 2, 2, 'AAA', '2023-06-25 19:35:47');

-- ----------------------------
-- Table structure for power
-- ----------------------------
DROP TABLE IF EXISTS `power`;
CREATE TABLE `power`  (
  `p_id` int NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `role` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '角色类型',
  `p_level` int NULL DEFAULT NULL COMMENT '权限等级',
  PRIMARY KEY (`p_id`) USING BTREE,
  INDEX `role`(`role` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of power
-- ----------------------------
INSERT INTO `power` VALUES (1, '普通用户', 1);
INSERT INTO `power` VALUES (2, '管理员', 2);
INSERT INTO `power` VALUES (3, 'String', 0);
INSERT INTO `power` VALUES (4, 'String', NULL);
INSERT INTO `power` VALUES (5, 'String', NULL);
INSERT INTO `power` VALUES (6, 'String', NULL);
INSERT INTO `power` VALUES (8, 'String', NULL);
INSERT INTO `power` VALUES (9, 'StrAAAing', NULL);
INSERT INTO `power` VALUES (10, 'StrAAAing', NULL);
INSERT INTO `power` VALUES (11, 'String', 2);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮箱',
  `role` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '普通用户' COMMENT '用户类型',
  `balance` decimal(10, 2) NULL DEFAULT 0.00 COMMENT '余额',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `role`(`role` ASC) USING BTREE,
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`role`) REFERENCES `power` (`role`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Tang Ziyi', 'pwg0Jjodgv', 'ziyi95@gmail.com', '管理员', 705.00);
INSERT INTO `user` VALUES (2, 'Raymond Ross', '1leMfEAisA', 'rayross@icloud.com', '管理员', 7.00);
INSERT INTO `user` VALUES (3, 'Nomura Minato', 'XOO1iYvecv', 'mn5@icloud.com', '普通用户', 734.00);
INSERT INTO `user` VALUES (4, 'Hsuan Ming Sze', 'oS1JJXkNgW', 'mshs@icloud.com', '普通用户', 55.00);
INSERT INTO `user` VALUES (5, 'Tong Sze Yu', '1uvKXc3AlF', 'tosy@yahoo.com', '管理员', 928.00);
INSERT INTO `user` VALUES (6, 'Douglas Garza', 'XtGVddQ6w7', 'garzd@icloud.com', '普通用户', 409.00);
INSERT INTO `user` VALUES (7, 'Clifford Martinez', 'iUtoSZbrWz', 'climarti@gmail.com', '普通用户', 849.00);
INSERT INTO `user` VALUES (8, 'Jennifer Stone', '6j57u0dyfg', 'stoje@gmail.com', '管理员', 334.00);
INSERT INTO `user` VALUES (9, 'Carmen Smith', 'ZDRS41j11T', 'carmensmith@gmail.com', '管理员', 530.00);
INSERT INTO `user` VALUES (10, 'Deng Lan', 'LRTx44xXAt', 'dlan106@gmail.com', '管理员', 584.00);
INSERT INTO `user` VALUES (11, 'aa', 'a', 'a', 'String', 0.00);

SET FOREIGN_KEY_CHECKS = 1;
