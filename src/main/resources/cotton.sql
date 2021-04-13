/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : cotton

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 13/04/2021 18:46:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '密码',
  `role` char(1) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户类型（1普通用户 2管理员）',
  `tel` char(11) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '电话',
  `head_img_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '头像图片名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES (1, 'admin', '123', '1', '13123424111', '头像1');
INSERT INTO `t_admin` VALUES (2, 'root', '123', '2', '15253145732', '头像2');
INSERT INTO `t_admin` VALUES (3, 'lisi', '123', '2', '13213213132', '头像3');

-- ----------------------------
-- Table structure for t_team
-- ----------------------------
DROP TABLE IF EXISTS `t_team`;
CREATE TABLE `t_team`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '密码',
  `role` char(1) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户类型',
  `aaccount_state` char(1) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户状态',
  `tel` char(11) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '电话',
  `team_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '课题组名',
  `real_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '真实姓名',
  `email` varchar(320) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '电子邮件',
  `address_province` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '地址--省份',
  `address_city` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '地址--城市',
  `address_district` varchar(22) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '地址--详细地址',
  `address_detail` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '备注',
  `mark` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '头像名',
  `head_img_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_team
-- ----------------------------
INSERT INTO `t_team` VALUES (1, 'root', '123', '2', '1', '13134213544', 'javaEE01', '张三', '9376239@qq.com', '河南省', '安阳市', '文峰区', '安阳工学院', '无', '头像2');
INSERT INTO `t_team` VALUES (2, 'admin', '123', '1', '0', '13113113131', '种大棉花', '张德帅', '1234567@qq.com', '河南省', '郑州市', '二七区 ', '哈尔滨佛学院 ', '无', '头像1');
INSERT INTO `t_team` VALUES (3, 'lisi', '123', '1', '1', '13213213132', '棉花糖', '赵四', '7654321@qq.com', '河南省', '平顶山', '郏县', '家里蹲大学', '无', '头像3');

-- ----------------------------
-- Table structure for t_zdb_zytx
-- ----------------------------
DROP TABLE IF EXISTS `t_zdb_zytx`;
CREATE TABLE `t_zdb_zytx`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `zi_duan_ming` char(3) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '选项值',
  `zi_duan_zhi` char(1) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '特性分类',
  `state` char(1) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '是否可用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_zdb_zytx
-- ----------------------------
INSERT INTO `t_zdb_zytx` VALUES (1, '株型', '1', '1');
INSERT INTO `t_zdb_zytx` VALUES (2, '叶型', '2', '1');
INSERT INTO `t_zdb_zytx` VALUES (3, '铃型', '3', '1');
INSERT INTO `t_zdb_zytx` VALUES (4, '株高', '4', '1');
INSERT INTO `t_zdb_zytx` VALUES (5, '结铃型', '5', '1');
INSERT INTO `t_zdb_zytx` VALUES (6, '叶絮型', '6', '1');

-- ----------------------------
-- Table structure for t_zpcjsj
-- ----------------------------
DROP TABLE IF EXISTS `t_zpcjsj`;
CREATE TABLE `t_zpcjsj`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nian_fen` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '年份',
  `hang_hao` char(5) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '行号',
  `belong_to_account` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '所属账户',
  `zhong_ming` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '品种名称杂交组合',
  `lai_yuan` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '来源',
  `chang_du` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '长度',
  `bi_qiang` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '比强',
  `ma_zhi` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '马值',
  `ling_zhong` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '铃重',
  `yi_fen` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '衣分',
  `chu_miao_qi` date NULL DEFAULT NULL COMMENT '出苗期',
  `kai_hua_qi` date NULL DEFAULT NULL COMMENT '开花期',
  `tu_xu_qi` date NULL DEFAULT NULL,
  `szs_miao_qi` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `szs_hua_qi` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `zqd_miao_qi` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `zqd_hua_qi` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `shou_huo_zhu_shu` int(0) NULL DEFAULT NULL,
  `zytx_zhu_xing` int(0) NULL DEFAULT NULL,
  `zytx_ye_xing` int(0) NULL DEFAULT NULL,
  `zytx_ling_xing` int(0) NULL DEFAULT NULL,
  `zytx_zhu_gao` int(0) NULL DEFAULT NULL,
  `zytx_jie_ling_xing` int(0) NULL DEFAULT NULL,
  `zytx_ye_xu_xing` int(0) NULL DEFAULT NULL,
  `ku_wei_bing_zhi` int(0) NULL DEFAULT NULL,
  `huang_wei_bing_zhi` int(0) NULL DEFAULT NULL,
  `tian_jian_jue_xuan` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `mark` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `zytx_zhu_xing`(`zytx_zhu_xing`) USING BTREE,
  INDEX `zytx_ye_xing`(`zytx_ye_xing`) USING BTREE,
  INDEX `zytx_ling_xing`(`zytx_ling_xing`) USING BTREE,
  INDEX `zytx_zhu_gao`(`zytx_zhu_gao`) USING BTREE,
  INDEX `zytx_jie_ling_xing`(`zytx_jie_ling_xing`) USING BTREE,
  INDEX `zytx_ye_xu_xing`(`zytx_ye_xu_xing`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_zpcjsj
-- ----------------------------
INSERT INTO `t_zpcjsj` VALUES (86, '2021', '123', 'admin', '200004', '200005', '200006', '200007', '200008', '200009', '200010', '2021-02-01', '2021-02-01', '2021-02-01', '200014', '200015', '200016', '200017', 200018, 200019, 200020, 200021, 200022, NULL, 200024, 200025, 200026, '200026', '200027');
INSERT INTO `t_zpcjsj` VALUES (87, '2022', '124', 'root', '300004', '300005', '300006', '300007', '300008', '300009', '300010', '2021-03-01', '2021-03-01', '2021-03-01', '300014', '300015', '300016', '300017', 300018, 300019, 300020, 300021, 300022, NULL, 300024, 300025, 300026, '300026', '300027');
INSERT INTO `t_zpcjsj` VALUES (88, '1999', '125', 'lisi', '400004', '400005', '400006', '400007', '400008', '400009', '400010', '2021-04-01', '2021-04-01', '2021-04-01', '400014', '400015', '400016', '400017', 400018, 400019, 400020, 400021, 400022, NULL, 400024, 400025, 400026, '400026', '400027');
INSERT INTO `t_zpcjsj` VALUES (89, '2021', '126', 'root', '500004', '500005', '500006', '500007', '500008', '500009', '500010', '2021-05-01', '2021-05-01', '2021-05-01', '500014', '500015', '500016', '500017', 500018, 500019, 500020, 500021, 500022, NULL, 500024, 500025, 500026, '500026', '500027');
INSERT INTO `t_zpcjsj` VALUES (90, '2022', '127', 'lisi', '600004', '600005', '600006', '600007', '600008', '600009', '600010', '2021-06-01', '2021-06-01', '2021-06-01', '600014', '600015', '600016', '600017', 600018, 600019, 600020, 600021, 600022, NULL, 600024, 600025, 600026, '600026', '600027');
INSERT INTO `t_zpcjsj` VALUES (91, '2023', '128', 'root', '700004', '700005', '700006', '700007', '700008', '700009', '700010', '2021-07-01', '2021-07-01', '2021-07-01', '700014', '700015', '700016', '700017', 700018, 700019, 700020, 700021, 700022, NULL, 700024, 700025, 700026, '700026', '700027');
INSERT INTO `t_zpcjsj` VALUES (92, '1780', '129', 'admin', '800004', '800005', '800006', '800007', '800008', '800009', '800010', '2021-08-01', '2021-08-01', '2021-08-01', '800014', '800015', '800016', '800017', 800018, 800019, 800020, 800021, 800022, NULL, 800024, 800025, 800026, '800026', '800027');
INSERT INTO `t_zpcjsj` VALUES (93, '1970', '130', 'root', '900004', '900005', '900006', '900007', '900008', '900009', '900010', '2021-09-01', '2021-09-01', '2021-09-01', '900014', '900015', '900016', '900017', 900018, 900019, 900020, 900021, 900022, NULL, 900024, 900025, 900026, '900026', '900027');

-- ----------------------------
-- Table structure for t_zpglsj
-- ----------------------------
DROP TABLE IF EXISTS `t_zpglsj`;
CREATE TABLE `t_zpglsj`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `belong_to_account` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `zai_pei_nian_fen` date NOT NULL,
  `tu_rang_qian_zuo` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `geng_di_zheng_di` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `bo_zhong_qi` date NULL DEFAULT NULL,
  `yi_miao_qi` date NULL DEFAULT NULL,
  `jian_miao_qi` date NULL DEFAULT NULL,
  `ding_miao_qi` date NULL DEFAULT NULL,
  `zhong_geng_chu_cao_01` date NULL DEFAULT NULL,
  `zhong_geng_chu_cao_02` date NULL DEFAULT NULL,
  `zhong_geng_chu_cao_03` date NULL DEFAULT NULL,
  `zhong_geng_chu_cao_04` date NULL DEFAULT NULL,
  `zhong_geng_chu_cao_05` date NULL DEFAULT NULL,
  `zhong_geng_chu_cao_06` date NULL DEFAULT NULL,
  `zhong_geng_chu_cao_07` date NULL DEFAULT NULL,
  `zhong_geng_chu_cao_08` date NULL DEFAULT NULL,
  `zhong_geng_chu_cao_09` date NULL DEFAULT NULL,
  `zhong_geng_chu_cao_10` date NULL DEFAULT NULL,
  `zhong_geng_chu_cao_11` date NULL DEFAULT NULL,
  `zhong_geng_chu_cao_12` date NULL DEFAULT NULL,
  `peiTuQi` date NULL DEFAULT NULL,
  `ji_fei` varchar(80) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `zhui_fei_date_1` date NULL DEFAULT NULL,
  `zhui_fei_1` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `zhui_fei_date_2` date NULL DEFAULT NULL,
  `zhui_fei_2` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `zhui_fei_date_3` date NULL DEFAULT NULL,
  `zhui_fei_3` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `zhui_fei_date_4` date NULL DEFAULT NULL,
  `zhui_fei_4` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `guan_gai_1` date NULL DEFAULT NULL,
  `guan_gai_2` date NULL DEFAULT NULL,
  `guan_gai_3` date NULL DEFAULT NULL,
  `guan_gai_4` date NULL DEFAULT NULL,
  `guan_gai_5` date NULL DEFAULT NULL,
  `guan_gai_6` date NULL DEFAULT NULL,
  `guan_gai_7` date NULL DEFAULT NULL,
  `guan_gai_8` date NULL DEFAULT NULL,
  `guan_gai_9` date NULL DEFAULT NULL,
  `zheng_zhi_1` date NULL DEFAULT NULL,
  `zheng_zhi_2` date NULL DEFAULT NULL,
  `zheng_zhi_3` date NULL DEFAULT NULL,
  `da_ding` date NULL DEFAULT NULL,
  `bing_chong_fang_zhi_date_1` date NULL DEFAULT NULL,
  `bing_chong_fang_zhi_1` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `bing_chong_fang_zhi_date_2` date NULL DEFAULT NULL,
  `bing_chong_fang_zhi_2` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `bing_chong_fang_zhi_date_3` date NULL DEFAULT NULL,
  `bing_chong_fang_zhi_3` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `bing_chong_fang_zhi_date_4` date NULL DEFAULT NULL,
  `bing_chong_fang_zhi_4` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `bing_chong_fang_zhi_date_5` date NULL DEFAULT NULL,
  `bing_chong_fang_zhi_5` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `bing_chong_fang_zhi_date_6` date NULL DEFAULT NULL,
  `bing_chong_fang_zhi_6` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `hua_tiao_date_1` date NULL DEFAULT NULL,
  `hua_tiao_1` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `hua_tiao_date_2` date NULL DEFAULT NULL,
  `hua_tiao_2` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `hua_tiao_date_3` date NULL DEFAULT NULL,
  `hua_tiao_3` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `hua_tiao_date_4` date NULL DEFAULT NULL,
  `hua_tiao_4` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `shou_hua_qi_1` date NULL DEFAULT NULL,
  `shou_hua_qi_2` date NULL DEFAULT NULL,
  `shou_hua_qi_3` date NULL DEFAULT NULL,
  `sjq_chu_shuang` date NULL DEFAULT NULL,
  `sjq_ku_shuang` date NULL DEFAULT NULL,
  `qiu_geng` date NULL DEFAULT NULL,
  `mark` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_zpglsj
-- ----------------------------
INSERT INTO `t_zpglsj` VALUES (1, 'admin', '2021-04-11', 'baisda烦都烦死发送', 'dsfsdfs', '2021-04-06', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, '');
INSERT INTO `t_zpglsj` VALUES (3, 'lisi', '2021-04-13', '股份郭德纲', '电视', '2021-04-06', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_zpglsj` VALUES (4, 'root', '2021-04-06', '更多款式', '多少度', '2021-04-12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_zpglsj` VALUES (8, 'admin', '2021-04-22', '23sdas', '12312', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, '');
INSERT INTO `t_zpglsj` VALUES (9, 'root', '2021-04-25', '法大大', '速度', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, '');
INSERT INTO `t_zpglsj` VALUES (10, 'lisi', '2021-04-20', '发放', '电风扇', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, '');

SET FOREIGN_KEY_CHECKS = 1;
