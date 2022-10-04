-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: private_school
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `st_course`
--

DROP TABLE IF EXISTS `st_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_course` (
  `St_Course` int NOT NULL,
  `C_All_St` int NOT NULL,
  PRIMARY KEY (`St_Course`,`C_All_St`),
  KEY `C_All_St_idx` (`C_All_St`),
  CONSTRAINT `C_All_St` FOREIGN KEY (`C_All_St`) REFERENCES `course` (`C_ID`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `St_Course` FOREIGN KEY (`St_Course`) REFERENCES `student` (`St_ID`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_course`
--

LOCK TABLES `st_course` WRITE;
/*!40000 ALTER TABLE `st_course` DISABLE KEYS */;
INSERT INTO `st_course` VALUES (4,1),(6,1),(10,1),(15,1),(17,1),(18,1),(22,1),(23,1),(27,1),(1,2),(8,2),(9,2),(19,2),(28,2),(30,2),(1,3),(14,3),(15,3),(16,3),(19,3),(24,3),(26,3),(28,3),(5,4),(9,4),(12,4),(13,4),(21,4),(23,4),(25,4),(26,4),(27,4),(2,5),(5,5),(6,5),(15,5),(17,5),(20,5),(23,5),(27,5),(2,6),(4,6),(5,6),(13,6),(22,6),(24,6),(25,6),(29,6),(7,7),(24,7),(3,8),(10,8),(11,8),(13,8),(15,8),(17,8),(18,8),(24,8);
/*!40000 ALTER TABLE `st_course` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-25 14:08:14
