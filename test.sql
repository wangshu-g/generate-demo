/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 01/02/2024 18:27:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'ID',
  `createdAt` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updatedAt` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `deletedAt` timestamp(0) NULL DEFAULT NULL COMMENT '删除时间',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '文章标题',
  `desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '描述',
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '状态',
  `uid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '发布者',
  `groupId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '文章所属分组',
  `detail` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('1', '2024-01-30 16:22:56', NULL, NULL, '文章-1', '1', NULL, 'user1', 'group1', NULL);
INSERT INTO `article` VALUES ('2', '2024-01-30 22:18:53', NULL, NULL, '文章-2', '2', NULL, 'user1', 'group2', NULL);

-- ----------------------------
-- Table structure for articlegroup
-- ----------------------------
DROP TABLE IF EXISTS `articlegroup`;
CREATE TABLE `articlegroup`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'ID',
  `createdAt` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updatedAt` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `deletedAt` timestamp(0) NULL DEFAULT NULL COMMENT '删除时间',
  `groupName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '分组名称',
  `desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '描述',
  `uid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '创建者',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of articlegroup
-- ----------------------------
INSERT INTO `articlegroup` VALUES ('group1', '2024-01-30 22:18:26', NULL, NULL, '测试组-1', NULL, NULL);
INSERT INTO `articlegroup` VALUES ('group2', '2024-01-30 22:18:31', NULL, NULL, '测试组-2', NULL, NULL);

-- ----------------------------
-- Table structure for articletag
-- ----------------------------
DROP TABLE IF EXISTS `articletag`;
CREATE TABLE `articletag`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'ID',
  `createdAt` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updatedAt` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `deletedAt` timestamp(0) NULL DEFAULT NULL COMMENT '删除时间',
  `tagName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '标签名称',
  `articleId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '所属文章',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of articletag
-- ----------------------------
INSERT INTO `articletag` VALUES ('1', '2024-01-30 22:19:39', NULL, NULL, '文章1标签-1', '1');
INSERT INTO `articletag` VALUES ('2', '2024-01-30 22:19:42', NULL, NULL, '文章1标签-2', '1');
INSERT INTO `articletag` VALUES ('3', '2024-01-30 22:19:43', '2024-01-30 22:19:44', NULL, '文章2标签-1', '2');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT 'name',
  `age` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT 'age',
  `gender` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT 'gender',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT 'email',
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'ID',
  `createdAt` timestamp(0) NULL DEFAULT NULL COMMENT '创建日期',
  `updatedAt` timestamp(0) NULL DEFAULT NULL COMMENT '更新日期',
  `deletedAt` timestamp(0) NULL DEFAULT NULL COMMENT '删除日期',
  `test` int(0) NULL DEFAULT 1,
  `readMe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('100', '100', NULL, NULL, 'd309da18623a480ebaca7e20f5ac40da', '2024-01-10 08:48:57', '2024-01-10 08:48:57', NULL, 1, NULL);
INSERT INTO `user` VALUES ('user1', NULL, NULL, NULL, 'user1', NULL, NULL, NULL, 1, NULL);

SET FOREIGN_KEY_CHECKS = 1;
