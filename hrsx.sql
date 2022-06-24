/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : hrsx

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2022-06-25 07:28:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(16) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', 'java', '1');
INSERT INTO `course` VALUES ('2', '嵌入式', '2');
INSERT INTO `course` VALUES ('3', '云计算', '3');
INSERT INTO `course` VALUES ('4', 'linux', '4');
INSERT INTO `course` VALUES ('5', 'mysql', '2');
INSERT INTO `course` VALUES ('6', 'python', '5');
INSERT INTO `course` VALUES ('7', '前端', '5');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `GOODS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `GOODS_NAME` varchar(255) NOT NULL,
  `GT_ID` int(11) NOT NULL,
  `UNIT_PRICE` decimal(10,2) NOT NULL,
  `STOCK` int(11) NOT NULL,
  `IMG_URL` varchar(255) DEFAULT NULL,
  `INTRODUCE` text,
  PRIMARY KEY (`GOODS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '遥控相机', '1', '15.00', '6', 'img/53c417e891c88.png', '摄像');
INSERT INTO `goods` VALUES ('2', '耳机', '7', '48.52', '10', 'img/53c417e88bec5.png', '');
INSERT INTO `goods` VALUES ('3', '蓝牙音响', '2', '14.66', '16', 'img/53c417e88ca7e.png', '便携家居');
INSERT INTO `goods` VALUES ('4', '智能手环', '5', '120.00', '7', 'img/53c417e88d63c.png', '健康监测');
INSERT INTO `goods` VALUES ('5', '智慧屏电视', '1', '600.00', '2', 'img/53c417e88e1f1.png', '三面视觉');
INSERT INTO `goods` VALUES ('6', '蓝牙耳机', '1', '4.00', '30', 'img/53c417e88eda7.png', '');
INSERT INTO `goods` VALUES ('7', '游戏手柄', '1', '250.00', '16', 'img/53c417e88f963.png', '');
INSERT INTO `goods` VALUES ('8', '打印机', '6', '3300.00', '3', 'img/53c417e891c88.png', '');
INSERT INTO `goods` VALUES ('9', '手表', '8', '150.00', '12', 'img/53c417e893faf.png', '');
INSERT INTO `goods` VALUES ('10', '耳麦', '8', '20.60', '50', 'img/53c417e894f51.png', '');
INSERT INTO `goods` VALUES ('11', '内存卡', '3', '1.50', '30', 'img/53c417e896e93.png', '三星32G');
INSERT INTO `goods` VALUES ('12', 'UBL音响', '2', '15.00', '20', 'img/53c417e88ab3c.png', '');
INSERT INTO `goods` VALUES ('13', '笔记本', '7', '4.50', '19', 'img/53c417e88bec5.png', '');
INSERT INTO `goods` VALUES ('14', '智能转换器', '3', '120.00', '9', 'img/53c417e88d63c.png', '');
INSERT INTO `goods` VALUES ('15', '音箱', '2', '600.00', '5', 'img/53c417e88e1f1.png', '');
INSERT INTO `goods` VALUES ('16', '流媒体播放器', '3', '4.00', '30', 'img/53c417e88eda7.png', '');
INSERT INTO `goods` VALUES ('17', '智能扬声器', '3', '200.00', '6', 'img/53c417e88f963.png', '');
INSERT INTO `goods` VALUES ('18', '耳机', '8', '150.00', '12', 'img/53c417e893faf.png', '');
INSERT INTO `goods` VALUES ('19', '一体机', '7', '20.60', '50', 'img/53c417e894f51.png', 'iMac');
INSERT INTO `goods` VALUES ('20', '笔记本电脑', '7', '1.50', '30', 'img/53c417e896e93.png', '');
INSERT INTO `goods` VALUES ('21', '优盘', '6', '15.00', '20', 'img/53c417e88ab3c.png', '');
INSERT INTO `goods` VALUES ('22', '音响', '2', '4.50', '20', 'img/53c417e88bec5.png', '');
INSERT INTO `goods` VALUES ('23', '相机', '1', '120.00', '10', 'img/53c417e88d63c.png', '');
INSERT INTO `goods` VALUES ('24', '联想笔记本', '7', '600.00', '5', 'img/53c417e88e1f1.png', '');
INSERT INTO `goods` VALUES ('25', '运动手表', '8', '4.00', '30', 'img/53c417e88eda7.png', '');
INSERT INTO `goods` VALUES ('26', '机械手表', '8', '200.00', '4', 'img/53c417e88f963.png', '');
INSERT INTO `goods` VALUES ('27', '节能灯泡', '1', '3300.00', '3', 'img/53c417e891c88.png', '');
INSERT INTO `goods` VALUES ('28', '冰箱', '1', '150.00', '11', 'img/53c417e893faf.png', '');
INSERT INTO `goods` VALUES ('29', '海信电视', '1', '20.60', '50', 'img/53c417e894f51.png', '夏普');
INSERT INTO `goods` VALUES ('30', '索尼电视', '1', '1.50', '30', 'img/53c417e896e93.png', '索尼');
INSERT INTO `goods` VALUES ('31', '测试', '2', '20.00', '22', 'img/53c417e893faf.png', '大');
INSERT INTO `goods` VALUES ('32', '测试商品', '1', '3.14', '100', 'img/53c417e8985fa.png', '商品简介');
INSERT INTO `goods` VALUES ('33', '测试商品', '1', '3.14', '100', 'img/53c417e8966bc.png', '商品简介');
INSERT INTO `goods` VALUES ('34', '测试商品', '1', '3.14', '100', 'img/53c417e89051b.png', '商品简介');
INSERT INTO `goods` VALUES ('35', '测试商品', '1', '3.14', '100', 'img/53c417e89340d.png', '商品简介');
INSERT INTO `goods` VALUES ('36', 'aa', '1', '99.00', '0', 'img/53c417e89477c.png', '商品简介');
INSERT INTO `goods` VALUES ('37', '遥控相机', '1', '15.00', '9', 'img/53c417e892840.png', '摄像');

-- ----------------------------
-- Table structure for goods_type
-- ----------------------------
DROP TABLE IF EXISTS `goods_type`;
CREATE TABLE `goods_type` (
  `TYPE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `TYPE_NAME` char(20) NOT NULL,
  `INTRODUCE` varchar(500) NOT NULL,
  PRIMARY KEY (`TYPE_ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of goods_type
-- ----------------------------
INSERT INTO `goods_type` VALUES ('1', '家用', '家居生活用品');
INSERT INTO `goods_type` VALUES ('2', '数码', '带电的');

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(100) NOT NULL,
  `url_image` varchar(255) DEFAULT NULL,
  `price` decimal(6,2) DEFAULT NULL,
  `menu_status` tinyint(1) DEFAULT '0' COMMENT '状态为1:可用,0：不可用 默认：0',
  `menu_type_id` int(10) unsigned DEFAULT NULL COMMENT 'menu_type的id',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `menu_type_id` (`menu_type_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='菜单表';

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '辣子鸡', 'https://img95.699pic.com/photo/50065/0889.jpg_wh860.jpg', '11.00', '111', '4');
INSERT INTO `menu` VALUES ('2', '皮蛋豆腐', 'https://image.thinkrecipe.com/wp-content/uploads/2020/03/Preserved-egg-with-tofu09-scaled.jpg', '15.00', '0', '4');
INSERT INTO `menu` VALUES ('3', '珍珠翡翠白玉汤', 'https://img.52lishi.com/m00/29/b5/1b9fa917ec616293842797f7835f28f1.jpg', '30.00', '0', '7');
INSERT INTO `menu` VALUES ('4', '东坡肘子', 'https://tse1-mm.cn.bing.net/th/id/OIP-C.CtQK4ny7kRMoUPCZYe2PSgHaE-?pid=ImgDet&rs=1', '66.66', '0', '9');
INSERT INTO `menu` VALUES ('5', '小笼包', 'https://ts1.cn.mm.bing.net/th/id/R-C.949a2fbf1f3c807aba970ef74889093e?rik=A7q0V8Cn3%2b7iWw&riu=http%3a%2f%2fp1.ifengimg.com%2ffck%2f2018_12%2fd8e98208107a4d9_w1080_h864.jpg&ehk=K%2fp4tdsUp4QElJhzvU%2b9iSBdm3jF3hJRC0tRr52OHOQ%3d&risl=&pid=ImgRaw&r=0', '30.00', '0', '5');
INSERT INTO `menu` VALUES ('6', '清汤火锅', 'https://cp1.douguo.com/upload/caiku/3/5/7/yuan_35abee599988d8e1eff0f77a8508d667.jpg', '50.00', '0', '3');
INSERT INTO `menu` VALUES ('7', '麻婆豆腐', 'https://www.jucanw.com/UploadFiles/2018/2/2018031622365054951.jpg', '18.00', '0', '4');
INSERT INTO `menu` VALUES ('8', '东北乱炖', 'https://cp1.douguo.com/upload/caiku/a/7/d/690x390_a7cc023c95136a26a1f2ea5a8ee41d2d.jpg', '28.00', '0', '3');
INSERT INTO `menu` VALUES ('9', '米饭', 'https://ts1.cn.mm.bing.net/th/id/R-C.9c8552345336ecd571ebc2740966b741?rik=eKjsqlulft4XFg&riu=http%3a%2f%2fpic14.nipic.com%2f20110609%2f6426158_161335735000_2.jpg&ehk=szmxRDjTG7eU5OgMmtQlrzjhH%2b5pVtvgeqShiV2aL9o%3d&risl=&pid=ImgRaw&r=0', '3.00', '0', '6');
INSERT INTO `menu` VALUES ('10', '馒头', 'https://www.ys-xl.com/UploadFiles/FCK/2015-11/6358421031877441379027349.png', '2.00', '0', '5');
INSERT INTO `menu` VALUES ('11', '炸鱼', 'https://ts1.cn.mm.bing.net/th/id/R-C.2da6322dc8f3bbda2c6d999d7577dd5d?rik=109bDPuofaLZnw&riu=http%3a%2f%2fstatic.caipiaogu.com%2fimages%2fnews%2f2014%2f07%2f959.jpg&ehk=nhftbwGXXIWXHeGx2sAgCZ3n3yanL%2bBiuvjx0Kyl0dc%3d&risl=&pid=ImgRaw&r=0&sres=1&sresct=1', '30.00', '0', '2');
INSERT INTO `menu` VALUES ('12', '薯条', 'https://img.zcool.cn/community/01c1135b82c27ea8012190f2df4ab9.jpg@1280w_1l_2o_100sh.jpg', '18.00', '0', '8');
INSERT INTO `menu` VALUES ('13', '腐竹烧肉', 'https://www.xiachufang.com/recipe/102210105/', '22.00', '0', '4');
INSERT INTO `menu` VALUES ('14', '鱼香茄条', 'https://www.sohu.com/a/375811859_351130', '26.00', '0', '6');
INSERT INTO `menu` VALUES ('15', '烤鱿鱼', 'https://www.bing.com/images/search?q=%e7%83%a4%e9%b1%bf%e9%b1%bc&form=HDRSC2&first=1&tsc=ImageBasicHover', '35.00', '0', '1');
INSERT INTO `menu` VALUES ('16', '柠檬虾', 'https://vdposter.bdstatic.com/6eae6a6fc8b60a7c4d3a45745629d89f.jpeg?x-bce-process=image/resize,m_fill,w_352,h_234/format,f_jpg/quality,Q_100', '42.00', '0', '10');
INSERT INTO `menu` VALUES ('17', '茄汁年糕', 'www.maigoo.com/tuku/514792.html', '20.00', '0', '2');
INSERT INTO `menu` VALUES ('18', '毛血旺', null, null, '0', '6');
INSERT INTO `menu` VALUES ('19', '羊肉串', null, '15.00', '0', '33');
INSERT INTO `menu` VALUES ('20', '锅包肉', null, null, '0', null);
INSERT INTO `menu` VALUES ('21', '肉丸子', 'aa', null, '0', null);
INSERT INTO `menu` VALUES ('22', '包子', 'bb', null, '0', null);
INSERT INTO `menu` VALUES ('23', '其他', null, null, '0', null);
INSERT INTO `menu` VALUES ('24', '兰州拉面', null, null, '0', null);
INSERT INTO `menu` VALUES ('42', '滚刀肉', null, '30.00', '0', null);
INSERT INTO `menu` VALUES ('43', '滚刀肉1', null, '30.00', '0', null);
INSERT INTO `menu` VALUES ('44', 'abc123', 'hjk', '1.00', '12', '123');
INSERT INTO `menu` VALUES ('45', '酸菜', null, null, '0', null);
INSERT INTO `menu` VALUES ('46', '麻辣烫', null, null, '0', null);
INSERT INTO `menu` VALUES ('47', '大薯条子', 'https://img.zcool.cn/community/01c1135b82c27ea8012190f2df4ab9.jpg@1280w_1l_2o_100sh.jpg', '1.00', '1', '6');
INSERT INTO `menu` VALUES ('48', '大薯', 'https://img.zcool.cn/community/01c1135b82c27ea8012190f2df4ab9.jpg@1280w_1l_2o_100sh.jpg', '11.00', '111', '8');

-- ----------------------------
-- Table structure for menu_type
-- ----------------------------
DROP TABLE IF EXISTS `menu_type`;
CREATE TABLE `menu_type` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `menu_type_name` varchar(50) NOT NULL,
  `menu_status` tinyint(4) DEFAULT '1' COMMENT '1:可用,0：不可用 默认1',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='菜分类表';

-- ----------------------------
-- Records of menu_type
-- ----------------------------
INSERT INTO `menu_type` VALUES ('1', '烧烤', '1');
INSERT INTO `menu_type` VALUES ('2', '海鲜', '1');
INSERT INTO `menu_type` VALUES ('3', '火锅', '1');
INSERT INTO `menu_type` VALUES ('4', '豆制品', '1');
INSERT INTO `menu_type` VALUES ('5', '主食', '1');
INSERT INTO `menu_type` VALUES ('6', '甜品', '1');
INSERT INTO `menu_type` VALUES ('7', '汤类', '1');
INSERT INTO `menu_type` VALUES ('8', '前菜', '1');
INSERT INTO `menu_type` VALUES ('9', '炒菜类', '1');
INSERT INTO `menu_type` VALUES ('10', '酒水', '1');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orders_id` int(11) NOT NULL,
  `menu_id` int(11) NOT NULL COMMENT 'menu表id是关联',
  `num` int(11) DEFAULT NULL COMMENT '份',
  `sum_price` decimal(12,2) DEFAULT NULL COMMENT '总价格',
  `orders_status` tinyint(4) DEFAULT '0' COMMENT '默认0,0:已经下单1：取消订单',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '下单时间',
  `table_num` smallint(5) unsigned DEFAULT NULL COMMENT '桌号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', '1', '2', '2', '30.00', '0', '2021-11-22 08:17:32', '1');
INSERT INTO `orders` VALUES ('2', '2', '2', '2', '30.00', '1', '2021-11-22 08:17:38', '2');
INSERT INTO `orders` VALUES ('3', '3', '1', '2', '56.00', '0', '2021-11-22 08:18:19', '1');
INSERT INTO `orders` VALUES ('4', '3', '2', '2', '30.00', '0', '2021-11-22 08:17:50', '1');
INSERT INTO `orders` VALUES ('5', '3', '4', '2', '133.32', '0', '2021-11-22 08:19:32', '1');
INSERT INTO `orders` VALUES ('6', '3', '8', '1', '28.00', '0', '2021-11-22 08:20:24', '1');
INSERT INTO `orders` VALUES ('7', '3', '10', '1', '2.00', '0', '2022-03-25 14:41:06', '1');
INSERT INTO `orders` VALUES ('8', '3', '13', '1', '22.00', '0', '2021-11-22 08:21:39', '1');
INSERT INTO `orders` VALUES ('9', '3', '17', '1', '20.00', '0', '2021-11-22 08:22:04', '1');
INSERT INTO `orders` VALUES ('10', '4', '1', '2', '56.00', '0', '2021-11-22 08:18:26', '5');
INSERT INTO `orders` VALUES ('11', '4', '3', '2', '177.76', '0', '2021-11-22 08:19:15', '5');
INSERT INTO `orders` VALUES ('12', '4', '4', '2', '133.32', '0', '2021-11-22 08:19:45', '5');
INSERT INTO `orders` VALUES ('13', '4', '5', '1', '15.00', '0', '2021-11-22 08:19:54', '5');
INSERT INTO `orders` VALUES ('14', '4', '7', '3', '54.00', '0', '2021-11-22 08:20:13', '5');
INSERT INTO `orders` VALUES ('15', '4', '8', '3', '84.00', '0', '2021-11-22 08:20:37', '5');
INSERT INTO `orders` VALUES ('16', '4', '9', '2', '6.00', '0', '2021-11-22 08:20:52', '5');
INSERT INTO `orders` VALUES ('17', '4', '10', '2', '4.00', '0', '2021-11-22 08:21:15', '5');
INSERT INTO `orders` VALUES ('18', '4', '12', '2', '36.00', '0', '2021-11-22 08:21:27', '5');
INSERT INTO `orders` VALUES ('19', '4', '13', '1', '22.00', '0', '2021-11-22 08:21:38', '5');
INSERT INTO `orders` VALUES ('20', '4', '17', '2', '40.00', '0', '2021-11-22 08:22:30', '5');
INSERT INTO `orders` VALUES ('21', '5', '1', '2', '56.00', '0', '2021-11-22 08:18:22', '12');
INSERT INTO `orders` VALUES ('22', '5', '4', '1', '66.66', '0', '2021-11-22 08:19:36', '12');
INSERT INTO `orders` VALUES ('23', '5', '5', '1', '15.00', '0', '2021-11-22 08:19:57', '12');
INSERT INTO `orders` VALUES ('24', '5', '8', '2', '56.00', '0', '2021-11-22 08:20:41', '12');
INSERT INTO `orders` VALUES ('25', '5', '10', '1', '2.00', '0', '2021-11-22 08:21:17', '12');
INSERT INTO `orders` VALUES ('26', '5', '12', '1', '18.00', '0', '2021-11-22 08:21:29', '12');
INSERT INTO `orders` VALUES ('27', '5', '16', '1', '42.00', '0', '2021-11-22 08:22:00', '12');
INSERT INTO `orders` VALUES ('28', '5', '16', '1', '42.00', '0', '2021-11-22 08:22:22', '12');
INSERT INTO `orders` VALUES ('29', '6', '1', '1', '28.00', '0', '2021-11-22 08:18:33', '1');
INSERT INTO `orders` VALUES ('30', '6', '2', '2', '30.00', '0', '2021-11-22 08:18:01', '1');
INSERT INTO `orders` VALUES ('31', '6', '5', '1', '15.00', '0', '2021-11-22 08:20:01', '1');
INSERT INTO `orders` VALUES ('32', '6', '9', '1', '3.00', '0', '2021-11-22 08:20:55', '1');
INSERT INTO `orders` VALUES ('33', '6', '13', '1', '22.00', '0', '2021-11-22 08:21:41', '1');
INSERT INTO `orders` VALUES ('34', '6', '5', '2', '30.00', '0', '2021-11-22 08:22:40', '1');

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `number` int(11) NOT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES ('1', '1', '1', '50');
INSERT INTO `score` VALUES ('2', '1', '2', '70');
INSERT INTO `score` VALUES ('3', '1', '3', '5');
INSERT INTO `score` VALUES ('6', '1', '6', '92');
INSERT INTO `score` VALUES ('7', '1', '7', '88');
INSERT INTO `score` VALUES ('8', '2', '1', '79');
INSERT INTO `score` VALUES ('10', '2', '3', '81');
INSERT INTO `score` VALUES ('11', '2', '4', '40');
INSERT INTO `score` VALUES ('12', '2', '5', '21');
INSERT INTO `score` VALUES ('13', '2', '6', '94');
INSERT INTO `score` VALUES ('14', '2', '7', '77');
INSERT INTO `score` VALUES ('15', '3', '1', '92');
INSERT INTO `score` VALUES ('16', '3', '2', '94');
INSERT INTO `score` VALUES ('17', '3', '3', '92');
INSERT INTO `score` VALUES ('18', '3', '4', '67');
INSERT INTO `score` VALUES ('19', '3', '5', '6');
INSERT INTO `score` VALUES ('20', '3', '6', '83');
INSERT INTO `score` VALUES ('21', '3', '7', '86');
INSERT INTO `score` VALUES ('27', '4', '6', '91');
INSERT INTO `score` VALUES ('28', '4', '7', '61');
INSERT INTO `score` VALUES ('29', '5', '1', '75');
INSERT INTO `score` VALUES ('30', '5', '2', '80');
INSERT INTO `score` VALUES ('31', '5', '3', '91');
INSERT INTO `score` VALUES ('32', '5', '4', '65');
INSERT INTO `score` VALUES ('33', '5', '5', '63');
INSERT INTO `score` VALUES ('34', '5', '6', '77');
INSERT INTO `score` VALUES ('37', '6', '2', '85');
INSERT INTO `score` VALUES ('38', '6', '3', '50');
INSERT INTO `score` VALUES ('39', '6', '4', '76');
INSERT INTO `score` VALUES ('40', '6', '5', '81');
INSERT INTO `score` VALUES ('41', '6', '6', '16');
INSERT INTO `score` VALUES ('43', '7', '1', '69');
INSERT INTO `score` VALUES ('44', '7', '2', '75');
INSERT INTO `score` VALUES ('45', '7', '3', '17');
INSERT INTO `score` VALUES ('46', '7', '4', '89');
INSERT INTO `score` VALUES ('49', '7', '7', '72');
INSERT INTO `score` VALUES ('50', '8', '1', '82');
INSERT INTO `score` VALUES ('51', '8', '2', '78');
INSERT INTO `score` VALUES ('52', '8', '3', '89');
INSERT INTO `score` VALUES ('53', '8', '4', '0');
INSERT INTO `score` VALUES ('54', '8', '5', '98');
INSERT INTO `score` VALUES ('55', '8', '6', '80');
INSERT INTO `score` VALUES ('56', '8', '7', '91');
INSERT INTO `score` VALUES ('57', '9', '1', '67');
INSERT INTO `score` VALUES ('59', '9', '3', '60');
INSERT INTO `score` VALUES ('60', '9', '4', '76');
INSERT INTO `score` VALUES ('61', '9', '5', '66');
INSERT INTO `score` VALUES ('62', '9', '6', '85');
INSERT INTO `score` VALUES ('63', '9', '7', '88');
INSERT INTO `score` VALUES ('64', '10', '1', '69');
INSERT INTO `score` VALUES ('68', '10', '5', '46');
INSERT INTO `score` VALUES ('69', '10', '6', '76');
INSERT INTO `score` VALUES ('70', '10', '7', '85');
INSERT INTO `score` VALUES ('71', '11', '1', '79');
INSERT INTO `score` VALUES ('72', '11', '2', '94');
INSERT INTO `score` VALUES ('73', '11', '3', '95');
INSERT INTO `score` VALUES ('76', '11', '6', '49');
INSERT INTO `score` VALUES ('77', '11', '7', '70');
INSERT INTO `score` VALUES ('79', '12', '2', '74');
INSERT INTO `score` VALUES ('81', '12', '4', '44');
INSERT INTO `score` VALUES ('82', '12', '5', '89');
INSERT INTO `score` VALUES ('85', '13', '1', '39');
INSERT INTO `score` VALUES ('86', '13', '2', '67');
INSERT INTO `score` VALUES ('87', '13', '3', '96');
INSERT INTO `score` VALUES ('88', '13', '4', '0');
INSERT INTO `score` VALUES ('89', '13', '5', '80');
INSERT INTO `score` VALUES ('90', '13', '6', '95');
INSERT INTO `score` VALUES ('91', '13', '7', '99');
INSERT INTO `score` VALUES ('92', '14', '1', '72');
INSERT INTO `score` VALUES ('93', '14', '2', '82');
INSERT INTO `score` VALUES ('94', '14', '3', '89');
INSERT INTO `score` VALUES ('95', '14', '4', '60');
INSERT INTO `score` VALUES ('96', '14', '5', '88');
INSERT INTO `score` VALUES ('97', '14', '6', '93');
INSERT INTO `score` VALUES ('98', '14', '7', '99');
INSERT INTO `score` VALUES ('99', '15', '1', '73');
INSERT INTO `score` VALUES ('100', '15', '2', '92');
INSERT INTO `score` VALUES ('101', '15', '3', '85');
INSERT INTO `score` VALUES ('102', '15', '4', '99');
INSERT INTO `score` VALUES ('103', '15', '5', '84');
INSERT INTO `score` VALUES ('104', '15', '6', '85');
INSERT INTO `score` VALUES ('105', '15', '7', '0');
INSERT INTO `score` VALUES ('106', '16', '1', '64');
INSERT INTO `score` VALUES ('107', '16', '2', '6');
INSERT INTO `score` VALUES ('108', '16', '3', '69');
INSERT INTO `score` VALUES ('109', '16', '4', '86');
INSERT INTO `score` VALUES ('110', '16', '5', '21');
INSERT INTO `score` VALUES ('111', '16', '6', '75');
INSERT INTO `score` VALUES ('112', '16', '7', '81');
INSERT INTO `score` VALUES ('113', '17', '1', '81');
INSERT INTO `score` VALUES ('114', '17', '2', '86');
INSERT INTO `score` VALUES ('115', '17', '3', '76');
INSERT INTO `score` VALUES ('116', '17', '4', '75');
INSERT INTO `score` VALUES ('117', '17', '5', '66');
INSERT INTO `score` VALUES ('118', '17', '6', '88');
INSERT INTO `score` VALUES ('119', '17', '7', '92');
INSERT INTO `score` VALUES ('120', '18', '1', '82');
INSERT INTO `score` VALUES ('121', '18', '2', '82');
INSERT INTO `score` VALUES ('122', '18', '3', '83');
INSERT INTO `score` VALUES ('123', '18', '4', '78');
INSERT INTO `score` VALUES ('124', '18', '5', '89');
INSERT INTO `score` VALUES ('125', '18', '6', '91');
INSERT INTO `score` VALUES ('126', '18', '7', '97');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `SId` int(10) NOT NULL AUTO_INCREMENT,
  `Sname` varchar(10) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `Ssex` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`SId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '张三', '1990-01-01', '男');
INSERT INTO `student` VALUES ('2', '李四', '1990-12-21', '男');
INSERT INTO `student` VALUES ('3', '王五', '1990-12-20', '男');
INSERT INTO `student` VALUES ('4', '马六', '1990-12-06', '男');
INSERT INTO `student` VALUES ('5', '吴七', '1991-12-01', '女');
INSERT INTO `student` VALUES ('6', '赵八', '1992-01-01', '女');
INSERT INTO `student` VALUES ('7', '孙九', '1989-01-01', null);
INSERT INTO `student` VALUES ('9', '张一', '2015-12-20', '女');
INSERT INTO `student` VALUES ('10', '张二', '2017-01-25', '女');
INSERT INTO `student` VALUES ('11', '张三', '2012-06-06', '女');
INSERT INTO `student` VALUES ('12', '张四', '2013-06-13', '女');
INSERT INTO `student` VALUES ('13', '张五', '2014-06-01', '女');
INSERT INTO `student` VALUES ('14', '念念', '2013-03-23', '女');
INSERT INTO `student` VALUES ('15', '饼饼', '2019-11-23', '男');
INSERT INTO `student` VALUES ('16', '念念', '2019-11-23', '女');
INSERT INTO `student` VALUES ('17', '花花', '2002-01-01', '女');
INSERT INTO `student` VALUES ('18', 'nn四', '2013-08-03', '女');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(255) NOT NULL,
  PRIMARY KEY (`tid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '张老师');
INSERT INTO `teacher` VALUES ('2', '王老师');
INSERT INTO `teacher` VALUES ('3', '赵老师');
INSERT INTO `teacher` VALUES ('4', '李老师');
INSERT INTO `teacher` VALUES ('5', '孙老师');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `USER_NAME` varchar(20) NOT NULL COMMENT '用户名',
  `PASSWORD` varchar(20) NOT NULL COMMENT '密码',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `REMARKS` varchar(2000) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'lql', '123', 'haha', null);
INSERT INTO `user_info` VALUES ('2', 'cby', '123', '', null);
INSERT INTO `user_info` VALUES ('3', 'lll', '123', '', null);
INSERT INTO `user_info` VALUES ('4', 'www', '123', '', null);
INSERT INTO `user_info` VALUES ('5', 'admin', '123', '234@qq.com', null);
INSERT INTO `user_info` VALUES ('6', 'Tom', '111111', null, null);
INSERT INTO `user_info` VALUES ('7', 'Tom11', '111111', null, null);
INSERT INTO `user_info` VALUES ('8', 'Tom1', '111111', null, null);
INSERT INTO `user_info` VALUES ('9', 'Tom111', '111111', null, null);
INSERT INTO `user_info` VALUES ('10', 'qqqq', '111111', null, null);
INSERT INTO `user_info` VALUES ('11', 'qqq', '123', null, null);
