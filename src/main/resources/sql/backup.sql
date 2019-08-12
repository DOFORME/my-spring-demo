-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        8.0.16 - MySQL Community Server - GPL
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 my-spring-demo 的数据库结构
CREATE DATABASE IF NOT EXISTS `my-spring-demo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `my-spring-demo`;

-- 导出  表 my-spring-demo.class 结构
CREATE TABLE IF NOT EXISTS `class` (
                                       `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
                                       `code` int(10) unsigned DEFAULT NULL,
                                       `name` varchar(50) DEFAULT NULL,
                                       `flag` int(11) DEFAULT NULL,
                                       `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
                                       `update_time` datetime DEFAULT NULL,
                                       PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  my-spring-demo.class 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `class` DISABLE KEYS */;
INSERT INTO `class` (`id`, `code`, `name`, `flag`, `create_time`, `update_time`) VALUES
(1, 1, 'math', 1, '2019-07-31 15:01:14', NULL);
/*!40000 ALTER TABLE `class` ENABLE KEYS */;

-- 导出  表 my-spring-demo.student 结构
CREATE TABLE IF NOT EXISTS `student` (
                                         `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
                                         `name` varchar(10) DEFAULT NULL,
                                         `age` int(11) DEFAULT NULL,
                                         `gender` int(11) DEFAULT NULL,
                                         `flag` int(11) DEFAULT NULL,
                                         `create_time` datetime DEFAULT NULL,
                                         `update_time` datetime DEFAULT NULL,
                                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  my-spring-demo.student 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`, `name`, `age`, `gender`, `flag`, `create_time`, `update_time`) VALUES
(1, 'bob', 20, 0, 0, '2019-07-31 10:29:23', NULL);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;

-- 导出  表 my-spring-demo.teacher 结构
CREATE TABLE IF NOT EXISTS `teacher` (
                                         `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
                                         `name` varchar(10) DEFAULT NULL,
                                         `age` int(11) DEFAULT NULL,
                                         `gender` int(11) DEFAULT NULL,
                                         `flag` int(11) DEFAULT NULL,
                                         `create_time` datetime DEFAULT NULL,
                                         `update_time` datetime DEFAULT NULL,
                                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  my-spring-demo.teacher 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` (`id`, `name`, `age`, `gender`, `flag`, `create_time`, `update_time`) VALUES
(2, 'lee', 40, 1, 1, '2019-07-31 14:19:23', '2019-07-31 14:19:23');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
