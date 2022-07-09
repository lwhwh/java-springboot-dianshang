/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.33 : Database - shoppingwebsite
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shoppingwebsite` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `shoppingwebsite`;

/*Table structure for table `commodity` */

DROP TABLE IF EXISTS `commodity`;

CREATE TABLE `commodity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commodityname` varchar(255) DEFAULT NULL,
  `commoditypicture` varchar(255) DEFAULT NULL,
  `commodityprice` double NOT NULL,
  `productclassifytwoid` int(11) NOT NULL,
  `collectcount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

/*Data for the table `commodity` */

insert  into `commodity`(`id`,`commodityname`,`commoditypicture`,`commodityprice`,`productclassifytwoid`,`collectcount`) values (1,'连衣裙1','imgs/dress1.jpg',121,2,0),(2,'连衣裙2','imgs/dress2.jpg',122,2,0),(3,'连衣裙3','imgs/dress3.jpg',123,2,0),(4,'连衣裙4','imgs/dress4.jpg',124,2,0),(5,'连衣裙5','imgs/dress5.jpg',125,2,0),(6,'连衣裙6','imgs/dress6.jpg',126,2,0),(7,'连衣裙7','imgs/ca_2.jpg',127,2,0),(8,'连衣裙8','imgs/ca_2.jpg',128,2,0),(9,'连衣裙9','imgs/ca_2.jpg',129,2,0),(10,'男士裤子1','imgs/1/mantrousers1.jpg',121,1,6),(11,'男士裤子2','imgs/1/mantrousers2.jpg',122,1,3),(12,'男士裤子3','imgs/1/mantrousers3.jpg',123,1,0),(13,'男士裤子4','imgs/1/mantrousers4.jpg',124,1,0),(14,'男士裤子5','imgs/1/mantrousers5.jpg',125,1,0),(15,'男士裤子6','imgs/1/mantrousers6.jpg',126,1,0),(16,'男士裤子7','imgs/1/mantrousers7.jpg',127,1,0),(17,'男士裤子8','imgs/1/mantrousers8.jpg',128,1,0),(18,'男士裤子9','imgs/1/mantrousers9.jpg',129,1,0),(19,'果乐果香','imgs/snacks1.jpg',121,7,2),(20,'MMS嘉欣巧克力豆子','imgs/snacks2.jpg',122,7,0),(21,'喜之郎果冻','imgs/snacks3.jpg',123,7,1),(22,'芝士棒','imgs/snacks4.jpg',124,7,0),(23,'空调1','imgs/ca_2.jpg',121,14,0),(24,'空调2','imgs/ca_2.jpg',122,14,0),(25,'空调3','imgs/ca_2.jpg',123,14,0),(26,'空调4','imgs/ca_2.jpg',124,14,0),(27,'手机1','imgs/ca_2.jpg',121,20,0),(28,'手机2','imgs/ca_2.jpg',122,20,0),(29,'手机3','imgs/ca_2.jpg',123,20,0),(30,'手机4','imgs/ca_2.jpg',124,20,0),(31,'坚果1','imgs/ca_2.jpg',121,25,0),(32,'坚果2','imgs/ca_2.jpg',122,25,0),(33,'坚果3','imgs/ca_2.jpg',123,25,0),(34,'坚果4','imgs/ca_2.jpg',124,25,0),(35,'童装1','imgs/childrenwear1.jpg',231,3,0),(36,'童装2','imgs/childrenwear2.jpg',136,3,0),(37,'童装3','imgs/childrenwear3.jpg',131,3,0),(38,'童装4','imgs/childrenwear4.jpg',231,3,1),(39,'童装5','imgs/childrenwear5.jpg',331,3,1),(40,'童装6','imgs/childrenwear6.jpg',133,3,0),(41,'童装7','imgs/childrenwear7.jpg',231,3,1),(42,'童装8','imgs/childrenwear8.jpg',211,3,0),(43,'童装9','imgs/childrenwear9.jpg',171,3,1),(44,'男鞋1','imgs/manshoes1.jpg',231,4,0),(45,'男鞋2','imgs/manshoes2.jpg',336,4,0),(46,'男鞋3','imgs/manshoes3.jpg',431,4,1),(47,'男鞋4','imgs/manshoes4.jpg',239,4,0),(48,'男鞋5','imgs/manshoes5.jpg',431,4,0),(49,'童装6','imgs/manshoes6.jpg',533,4,0),(50,'女鞋1','imgs/womanshoes1.jpg',431,5,1),(51,'女鞋2','imgs/womanshoes2.jpg',536,5,0),(52,'女鞋3','imgs/womanshoes3.jpg',331,5,1),(53,'女鞋4','imgs/womanshoes4.jpg',639,5,1),(54,'女鞋5','imgs/womanshoes5.jpg',531,5,0),(55,'女鞋6','imgs/womanshoes6.jpg',513,5,0),(56,'童鞋1','imgs/childrenshoes1.jpg',431,6,0),(57,'童鞋2','imgs/childrenshoes2.jpg',536,6,0),(58,'童鞋3','imgs/childrenshoes3.jpg',331,6,0),(59,'童鞋4','imgs/childrenshoes4.jpg',639,6,0),(60,'制冷电器1','imgs/refrigeration1.jpg',731,13,0),(61,'制冷电器2','imgs/refrigeration2.jpg',931,13,1),(62,'制冷电器3','imgs/refrigeration3.jpg',1131,13,0),(63,'电脑1','imgs/computer1.jpg',4789,19,1),(64,'电脑2','imgs/computer2.jpg',4999,19,0),(65,'电脑3','imgs/computer3.jpg',6799,19,1);

/*Table structure for table `commodity_collect` */

DROP TABLE IF EXISTS `commodity_collect`;

CREATE TABLE `commodity_collect` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commodityid` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

/*Data for the table `commodity_collect` */

insert  into `commodity_collect`(`id`,`commodityid`,`uid`) values (6,10,4),(10,10,3),(11,11,3),(13,19,1),(15,19,4),(18,63,1),(19,10,8),(20,11,1),(25,61,1),(27,39,1),(28,50,1),(29,53,1),(30,46,1),(35,43,1),(36,41,1),(37,38,1),(38,52,1),(40,21,1),(41,65,1),(43,10,12),(45,11,9),(47,10,1),(48,10,11);

/*Table structure for table `commodity_comment` */

DROP TABLE IF EXISTS `commodity_comment`;

CREATE TABLE `commodity_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commentdate` datetime(6) DEFAULT NULL,
  `commentmessage` varchar(255) DEFAULT NULL,
  `commodityid` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

/*Data for the table `commodity_comment` */

insert  into `commodity_comment`(`id`,`commentdate`,`commentmessage`,`commodityid`,`userid`) values (2,'2022-05-11 20:42:00.000000','不错！！！',10,11),(10,'2022-05-14 22:38:02.930000','味道很好，，，',19,1),(15,'2022-05-14 22:54:45.278000','鞋码刚刚好',44,1),(16,'2022-05-15 15:00:18.040000','又来光顾了！！！',61,1),(17,'2022-05-15 17:29:05.628000','味道很好！！！',19,1),(19,'2022-05-15 23:38:08.532000','很好',10,1),(22,'2022-05-16 23:03:58.681000','很好！！！',10,1),(23,'2022-05-29 18:32:22.811000','质量很好\n',45,1),(24,'2022-05-29 18:38:53.183000','123123',19,1);

/*Table structure for table `commodity_comment_reply` */

DROP TABLE IF EXISTS `commodity_comment_reply`;

CREATE TABLE `commodity_comment_reply` (
  `replyid` int(11) NOT NULL AUTO_INCREMENT,
  `commentdate` datetime(6) DEFAULT NULL,
  `commentreply` varchar(255) DEFAULT NULL,
  `commoditycommentidoneid` int(11) NOT NULL,
  `commoditycommentidreplyid` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  PRIMARY KEY (`replyid`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;

/*Data for the table `commodity_comment_reply` */

insert  into `commodity_comment_reply`(`replyid`,`commentdate`,`commentreply`,`commoditycommentidoneid`,`commoditycommentidreplyid`,`userid`) values (2,'2022-05-15 23:01:44.000000','不错',2,1,11),(3,'2022-05-15 23:23:59.000000','质量怎么样',10,2,1),(4,'2022-05-15 23:39:10.000000','质量怎么样，1',19,0,11),(6,'2022-05-19 13:53:45.000000','多次购买了！',2,1,11),(47,'2022-05-22 22:49:11.520000','楼上的大哥！质量好吗？',19,46,9),(48,'2022-05-22 22:49:30.363000','张飞大哥，质量怎么样',19,4,9),(56,'2022-05-23 21:48:48.903000','质量怎么样呢',2,43,1),(63,'2022-05-29 18:31:28.307000','你好',19,48,1),(65,'2022-05-29 18:36:28.333000','123123123',2,56,11),(66,'2022-05-29 18:39:07.056000','123123',10,3,1),(67,'2022-05-29 18:39:12.045000','123123',10,66,1);

/*Table structure for table `commodity_discount` */

DROP TABLE IF EXISTS `commodity_discount`;

CREATE TABLE `commodity_discount` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commodityid` int(11) NOT NULL,
  `discount` double NOT NULL,
  `discountdetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `commodity_discount` */

/*Table structure for table `commodity_img` */

DROP TABLE IF EXISTS `commodity_img`;

CREATE TABLE `commodity_img` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commodityid` int(11) NOT NULL,
  `imgurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8;

/*Data for the table `commodity_img` */

insert  into `commodity_img`(`id`,`commodityid`,`imgurl`) values (1,1,'imgs/dress1.jpg'),(2,2,'imgs/dress2.jpg'),(3,2,'imgs/dress2-1.jpg'),(4,1,'imgs/dress1-1.jpg'),(5,3,'imgs/dress3.jpg'),(6,4,'imgs/dress4.jpg'),(7,4,'imgs/dress4-1.jpg'),(8,5,'imgs/dress5.jpg'),(9,6,'imgs/dress6.jpg'),(10,7,'imgs/ca_2.jpg'),(11,8,'imgs/ca_2.jpg'),(12,9,'imgs/ca_2.jpg'),(13,10,'imgs/1/mantrousers1.jpg'),(14,10,'imgs/mantrousers1-1.jpg'),(15,10,'imgs/mantrousers1-2.jpg'),(16,11,'imgs/1/mantrousers2.jpg'),(17,12,'imgs/1/mantrousers3.jpg'),(18,13,'imgs/1/mantrousers4.jpg'),(19,14,'imgs/1/mantrousers5.jpg'),(20,15,'imgs/1/mantrousers6.jpg'),(21,16,'imgs/1/mantrousers7.jpg'),(22,17,'imgs/1/mantrousers8.jpg'),(23,18,'imgs/1/mantrousers9.jpg'),(24,19,'imgs/snacks1.jpg'),(25,20,'imgs/snacks2.jpg'),(26,21,'imgs/snacks3.jpg'),(27,22,'imgs/snacks4.jpg'),(28,23,'imgs/ca_2.jpg'),(29,24,'imgs/ca_2.jpg'),(30,25,'imgs/ca_2.jpg'),(31,26,'imgs/ca_2.jpg'),(32,27,'imgs/ca_2.jpg'),(33,28,'imgs/ca_2.jpg'),(34,29,'imgs/ca_2.jpg'),(35,30,'imgs/ca_2.jpg'),(36,32,'imgs/ca_2.jpg'),(37,32,'imgs/ca_2.jpg'),(38,33,'imgs/ca_2.jpg'),(39,34,'imgs/ca_2.jpg'),(40,35,'imgs/childrenwear1.jpg'),(41,36,'imgs/childrenwear2.jpg'),(42,37,'imgs/childrenwear3.jpg'),(43,38,'imgs/childrenwear4.jpg'),(44,39,'imgs/childrenwear5.jpg'),(45,40,'imgs/childrenwear6.jpg'),(46,41,'imgs/childrenwear7.jpg'),(47,42,'imgs/childrenwear8.jpg'),(48,43,'imgs/childrenwear9.jpg'),(49,44,'imgs/manshoes1.jpg'),(50,45,'imgs/manshoes2.jpg'),(51,46,'imgs/manshoes3.jpg'),(52,47,'imgs/manshoes4.jpg'),(53,48,'imgs/manshoes5.jpg'),(54,49,'imgs/manshoes6.jpg'),(55,50,'imgs/womanshoes1.jpg'),(56,51,'imgs/womanshoes2.jpg'),(57,52,'imgs/womanshoes3.jpg'),(58,53,'imgs/womanshoes4.jpg'),(59,54,'imgs/womanshoes5.jpg'),(60,55,'imgs/womanshoes6.jpg'),(61,56,'imgs/childrenshoes1.jpg'),(62,57,'imgs/childrenshoes2.jpg'),(63,58,'imgs/childrenshoes3.jpg'),(64,59,'imgs/childrenshoes4.jpg'),(65,1,'imgs/dress1-2.jpg'),(66,63,'imgs/computer1.jpg'),(67,63,'imgs/computer1-1.jpg'),(68,64,'imgs/computer2.jpg'),(69,65,'imgs/computer3.jpg'),(70,65,'imgs/computer3-1.jpg'),(71,60,'imgs/refrigeration1.jpg'),(72,61,'imgs/refrigeration2.jpg'),(73,62,'imgs/refrigeration3.jpg');

/*Table structure for table `commodity_specification_name` */

DROP TABLE IF EXISTS `commodity_specification_name`;

CREATE TABLE `commodity_specification_name` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commodityspecificationtitleid` int(11) NOT NULL,
  `specificationname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=135 DEFAULT CHARSET=utf8;

/*Data for the table `commodity_specification_name` */

insert  into `commodity_specification_name`(`id`,`commodityspecificationtitleid`,`specificationname`) values (1,1,'红色'),(2,1,'黑色'),(3,1,'蓝色'),(4,2,'S'),(5,2,'M'),(6,2,'L'),(7,3,'红色'),(8,3,'黑色'),(9,3,'蓝色'),(10,4,'S'),(11,4,'M'),(12,4,'L'),(13,5,'红色'),(14,5,'黑色'),(15,5,'蓝色'),(16,6,'S'),(17,6,'M'),(18,6,'L'),(19,7,'红色'),(20,7,'黑色'),(21,7,'蓝色'),(22,8,'S'),(23,8,'M'),(24,8,'L'),(25,9,'红色'),(26,9,'黑色'),(27,9,'蓝色'),(28,10,'S'),(29,10,'M'),(30,10,'L'),(31,11,'红色'),(32,11,'黑色'),(33,11,'蓝色'),(34,12,'S'),(35,12,'M'),(36,12,'L'),(37,13,'红色'),(38,13,'黑色'),(39,13,'蓝色'),(40,14,'S'),(41,14,'M'),(42,14,'L'),(43,15,'红色'),(44,15,'黑色'),(45,15,'蓝色'),(46,16,'S'),(47,16,'M'),(48,16,'L'),(49,17,'红色'),(50,17,'黑色'),(51,17,'蓝色'),(52,18,'S'),(53,18,'M'),(54,18,'L'),(55,19,'红色'),(56,19,'黑色'),(57,19,'蓝色'),(58,20,'S'),(59,20,'M'),(60,20,'L'),(61,21,'红色'),(62,21,'黑色'),(63,21,'蓝色'),(64,22,'S'),(65,22,'M'),(66,22,'L'),(67,23,'红色'),(68,23,'黑色'),(69,23,'蓝色'),(70,24,'S'),(71,24,'M'),(72,24,'L'),(73,25,'红色'),(74,25,'黑色'),(75,25,'蓝色'),(76,26,'S'),(77,26,'M'),(78,26,'L'),(79,27,'红色'),(80,27,'黑色'),(81,27,'蓝色'),(82,28,'S'),(83,28,'M'),(84,28,'L'),(85,29,'红色'),(86,29,'黑色'),(87,29,'蓝色'),(88,30,'S'),(89,30,'M'),(90,30,'L'),(91,31,'红色'),(92,31,'黑色'),(93,31,'蓝色'),(94,32,'S'),(95,32,'M'),(96,32,'L'),(97,33,'红色'),(98,33,'黑色'),(99,33,'蓝色'),(100,34,'S'),(101,34,'M'),(102,34,'L'),(103,35,'红色'),(104,35,'黑色'),(105,35,'蓝色'),(106,36,'S'),(107,36,'M'),(108,36,'L'),(109,37,'经典味'),(110,37,'巧克力味'),(111,37,'蓝莓味'),(112,38,'混合装'),(113,38,'花生味'),(114,38,'牛奶味'),(115,39,'270g'),(116,40,'菠萝味'),(117,40,'草莓味'),(118,40,'混合装'),(119,41,'奶酪味'),(120,43,'1.5米'),(121,43,'2米'),(122,43,'3米'),(123,44,'1.5米'),(124,44,'2米'),(125,44,'3米'),(126,45,'1.5米'),(127,45,'2米'),(128,45,'3米'),(129,46,'金色'),(130,46,'黑色'),(131,47,'银白色'),(132,47,'黑色'),(133,48,'银白色'),(134,48,'金色');

/*Table structure for table `commodity_specification_title` */

DROP TABLE IF EXISTS `commodity_specification_title`;

CREATE TABLE `commodity_specification_title` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commodityid` int(11) NOT NULL,
  `specificationtitle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

/*Data for the table `commodity_specification_title` */

insert  into `commodity_specification_title`(`id`,`commodityid`,`specificationtitle`) values (1,10,'颜色'),(2,10,'尺码'),(3,1,'颜色'),(4,1,'尺码'),(5,2,'颜色'),(6,2,'尺码'),(7,3,'颜色'),(8,3,'尺码'),(9,4,'颜色'),(10,4,'尺码'),(11,5,'颜色'),(12,5,'尺码'),(13,6,'颜色'),(14,6,'尺码'),(15,7,'颜色'),(16,7,'尺码'),(17,8,'颜色'),(18,8,'尺码'),(19,9,'颜色'),(20,9,'尺码'),(21,11,'颜色'),(22,11,'尺码'),(23,12,'颜色'),(24,12,'尺码'),(25,13,'颜色'),(26,13,'尺码'),(27,14,'颜色'),(28,14,'尺码'),(29,15,'颜色'),(30,15,'尺码'),(31,16,'颜色'),(32,16,'尺码'),(33,17,'颜色'),(34,17,'尺码'),(35,18,'颜色'),(36,18,'尺码'),(37,19,'口味'),(38,20,'口味'),(39,20,'净含量'),(40,21,'口味'),(41,22,'口味'),(43,60,'尺寸'),(44,61,'尺寸'),(45,62,'尺寸'),(46,63,'颜色'),(47,64,'颜色'),(48,65,'颜色');

/*Table structure for table `consignee_info` */

DROP TABLE IF EXISTS `consignee_info`;

CREATE TABLE `consignee_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `consigneeaddress` varchar(255) DEFAULT NULL,
  `consigneename` varchar(255) DEFAULT NULL,
  `consigneephone` varchar(255) DEFAULT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `consignee_info` */

insert  into `consignee_info`(`id`,`consigneeaddress`,`consigneename`,`consigneephone`,`uid`) values (1,'中国上海宝山','梁文航','15617890913',1),(2,'中国上海宝山','梁麒桓','16718901231',9),(3,'中国','关羽','16719091211',10),(4,'中国新疆','张飞','17819861121',11),(5,'','梁文可','17810987123',12),(6,'','123','123',13);

/*Table structure for table `order_list` */

DROP TABLE IF EXISTS `order_list`;

CREATE TABLE `order_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `orderstate` varchar(255) DEFAULT NULL,
  `oredrnumber` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `uid` int(11) NOT NULL,
  `commodityid` int(11) NOT NULL,
  `commentstatus` int(11) NOT NULL,
  `paymentstate` int(11) NOT NULL,
  `commoditypicture` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `count` int(11) NOT NULL,
  `commodityname` varchar(255) DEFAULT NULL,
  `totalprice` double NOT NULL,
  `freightstatus` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8;

/*Data for the table `order_list` */

insert  into `order_list`(`id`,`address`,`orderstate`,`oredrnumber`,`phone`,`uid`,`commodityid`,`commentstatus`,`paymentstate`,`commoditypicture`,`username`,`count`,`commodityname`,`totalprice`,`freightstatus`) values (88,'中国上海宝山','已完成','2022040716370565988507','15617890913',1,61,1,1,'imgs/refrigeration2.jpg','梁文航',4,'制冷电器22米，',3724,'已收货'),(89,'中国上海宝山','已完成','202204071637056638033','15617890913',1,19,1,1,'imgs/snacks1.jpg','梁文航',1,'果乐果香经典味，',121,'已收货'),(90,'中国上海宝山','已完成','2022040716380065537823','15617890913',1,19,1,1,'imgs/snacks1.jpg','梁文航',1,'果乐果香经典味，',121,'已收货'),(94,'中国上海宝山','已完成','202204072114582778784','15617890913',1,10,1,1,'imgs/1/mantrousers1.jpg','梁文航',10,'男士裤子1红色，S',1210,'已收货'),(95,'中国上海宝山','已完成','2022042321000893166017','15617890913',1,10,1,1,'imgs/1/mantrousers1.jpg','梁文航',10,'男士裤子1红色，S',1210,'已收货'),(96,'中国上海宝山','未完成','2022051123242631436279','16718901231',9,11,0,0,'imgs/1/mantrousers2.jpg','梁麒桓',3,'男士裤子2红色，S',366,'未收货'),(97,'中国上海宝山','已完成','2022051213595559279332','15617890913',1,10,1,1,'imgs/1/mantrousers1.jpg','梁文航',10,'男士裤子1红色，S',1210,'已收货'),(98,'中国上海宝山','已完成','2022051213595561695617','15617890913',1,61,1,1,'imgs/refrigeration2.jpg','梁文航',4,'制冷电器22米，',3724,'已收货'),(99,'中国上海宝山','已完成','2022051213595562195402','15617890913',1,19,1,1,'imgs/snacks1.jpg','梁文航',1,'果乐果香经典味，',121,'已收货'),(100,'中国上海宝山','已完成','2022051422520542556355','15617890913',1,44,1,1,'imgs/manshoes1.jpg','梁文航',1,'男鞋1',231,'已收货'),(101,'中国上海宝山','已完成','2022051422520543641873','15617890913',1,45,1,1,'imgs/manshoes2.jpg','梁文航',1,'男鞋2',336,'已收货'),(102,'中国上海宝山','已完成','2022051517272147539720','15617890913',1,19,1,1,'imgs/snacks1.jpg','梁文航',1,'果乐果香经典味，',121,'已收货'),(103,'中国上海宝山','未完成','2022051517272149318390','15617890913',1,44,0,2,'imgs/manshoes1.jpg','梁文航',1,'男鞋1',231,'未收货'),(104,'中国上海宝山','未完成','2022051517272149737808','15617890913',1,45,0,2,'imgs/manshoes2.jpg','梁文航',1,'男鞋2',336,'未收货'),(105,'中国上海宝山','已完成','2022051523365578223902','15617890913',1,10,1,1,'imgs/1/mantrousers1.jpg','梁文航',10,'男士裤子1红色，S',1210,'已收货'),(106,'中国上海宝山','未完成','2022051523365579932822','15617890913',1,61,0,0,'imgs/refrigeration2.jpg','梁文航',4,'制冷电器22米，',3724,'未收货'),(107,'中国上海宝山','未完成','2022051523365580893392','15617890913',1,19,0,0,'imgs/snacks1.jpg','梁文航',1,'果乐果香经典味，',121,'未收货'),(108,'中国上海宝山','未完成','2022051523365582595566','15617890913',1,44,0,0,'imgs/manshoes1.jpg','梁文航',1,'男鞋1',231,'未收货'),(109,'中国上海宝山','未完成','2022051523365583269252','15617890913',1,45,0,0,'imgs/manshoes2.jpg','梁文航',1,'男鞋2',336,'未收货'),(110,'中国上海宝山','未完成','2022051523365583784642','15617890913',1,12,0,1,'imgs/1/mantrousers3.jpg','梁文航',1,'男士裤子3红色，S',123,'已收货'),(111,'中国上海宝山','已完成','202205162302346454748','15617890913',1,10,1,1,'imgs/1/mantrousers1.jpg','梁文航',10,'男士裤子1红色，S',1210,'已收货'),(112,'中国上海宝山','已完成','2022051623023725441629','15617890913',1,10,1,1,'imgs/1/mantrousers1.jpg','梁文航',10,'男士裤子1红色，S',1210,'已收货'),(113,'中国上海宝山','未完成','2022052918315325452504','15617890913',1,10,0,2,'imgs/1/mantrousers1.jpg','梁文航',10,'男士裤子1红色，S',1210,'未收货'),(114,'中国上海宝山','未完成','2022052918315326463889','15617890913',1,61,0,0,'imgs/refrigeration2.jpg','梁文航',4,'制冷电器22米，',3724,'未收货'),(115,'中国上海宝山','未完成','2022052918333471257137','15617890913',1,35,0,2,'imgs/childrenwear1.jpg','梁文航',10,'童装1',2310,'未收货'),(116,'中国新疆','未完成','2022052918373663779281','17819861121',11,10,0,0,'imgs/1/mantrousers1.jpg','张飞',10,'男士裤子1红色，M',1210,'未收货'),(117,'中国新疆','未完成','2022052918373664384512','17819861121',11,10,0,0,'imgs/1/mantrousers1.jpg','张飞',2,'男士裤子1黑色，M',242,'未收货'),(118,'中国新疆','未完成','2022052918373664920421','17819861121',11,10,0,0,'imgs/1/mantrousers1.jpg','张飞',1,'男士裤子1蓝色，L',121,'未收货');

/*Table structure for table `product_classify_one` */

DROP TABLE IF EXISTS `product_classify_one`;

CREATE TABLE `product_classify_one` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productclassiftitle` varchar(255) DEFAULT NULL,
  `routeto` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `product_classify_one` */

insert  into `product_classify_one`(`id`,`productclassiftitle`,`routeto`) values (1,'服装','/clothing'),(2,'食品','/food'),(3,'家用电器','/appliance'),(4,'数码产品','/numericalcode'),(5,'年货节','/yeargoods');

/*Table structure for table `product_classify_two` */

DROP TABLE IF EXISTS `product_classify_two`;

CREATE TABLE `product_classify_two` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productclassiftitletwo` varchar(255) DEFAULT NULL,
  `productclassifyoneid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

/*Data for the table `product_classify_two` */

insert  into `product_classify_two`(`id`,`productclassiftitletwo`,`productclassifyoneid`) values (1,'男装',1),(2,'女装',1),(3,'童装',1),(4,'男鞋',1),(5,'女鞋',1),(6,'童鞋',1),(7,'零食',2),(8,'饮料',2),(9,'水果',2),(10,'酒类',2),(11,'粮油调味',2),(12,'肉制品',2),(13,'制冷电器',3),(14,'空调器',3),(15,'清洁电器',3),(16,'厨房电器',3),(17,'电暖器具',3),(18,'其他电器',3),(19,'电脑',4),(20,'手机',4),(21,'电视机',4),(22,'摄像机',4),(23,'摄像头',4),(24,'音箱',4),(25,'干果糖果',5),(26,'酒水',5),(27,'电视机',5),(28,'年货大促销',5);

/*Table structure for table `shopping_trolley` */

DROP TABLE IF EXISTS `shopping_trolley`;

CREATE TABLE `shopping_trolley` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commoditycount` int(11) NOT NULL,
  `commodityid` int(11) NOT NULL,
  `commodityname` varchar(255) DEFAULT NULL,
  `commodityprice` double NOT NULL,
  `commodityspecification` varchar(255) DEFAULT NULL,
  `totalprice` double NOT NULL,
  `uid` int(11) NOT NULL,
  `commoditypicture` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

/*Data for the table `shopping_trolley` */

insert  into `shopping_trolley`(`id`,`commoditycount`,`commodityid`,`commodityname`,`commodityprice`,`commodityspecification`,`totalprice`,`uid`,`commoditypicture`) values (33,10,10,'男士裤子1',121,'红色，S',1210,1,'imgs/1/mantrousers1.jpg'),(35,4,61,'制冷电器2',931,'2米，',3724,1,'imgs/refrigeration2.jpg'),(38,3,11,'男士裤子2',122,'红色，S',366,9,'imgs/1/mantrousers2.jpg'),(41,8,61,'制冷电器2',931,'1.5米，',7448,9,'imgs/refrigeration2.jpg'),(42,1,19,'果乐果香',121,'经典味，',121,1,'imgs/snacks1.jpg'),(43,1,44,'男鞋1',231,'',231,1,'imgs/manshoes1.jpg'),(44,1,45,'男鞋2',336,'',336,1,'imgs/manshoes2.jpg'),(45,1,12,'男士裤子3',123,'红色，S',123,1,'imgs/1/mantrousers3.jpg'),(46,10,35,'童装1',231,'',2310,1,'imgs/childrenwear1.jpg'),(47,10,10,'男士裤子1',121,'红色，M',1210,11,'imgs/1/mantrousers1.jpg'),(48,2,10,'男士裤子1',121,'黑色，M',242,11,'imgs/1/mantrousers1.jpg'),(49,1,10,'男士裤子1',121,'蓝色，L',121,11,'imgs/1/mantrousers1.jpg');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`account`,`password`,`phone`,`username`) values (1,'123','123','1671899081','梁文航'),(9,'1234','123','16718901231','梁麒桓'),(10,'2202282210437296845','123','16719091211','关羽'),(11,'2202282218506141810','123','17819861121','张飞');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
