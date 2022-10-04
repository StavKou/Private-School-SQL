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
-- Table structure for table `st_ass`
--

DROP TABLE IF EXISTS `st_ass`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_ass` (
  `St_Involved_Ass` int NOT NULL,
  `Ass_All_St` int NOT NULL,
  PRIMARY KEY (`St_Involved_Ass`,`Ass_All_St`),
  KEY `Ass_All_St_idx` (`Ass_All_St`),
  CONSTRAINT `Ass_All_St` FOREIGN KEY (`Ass_All_St`) REFERENCES `assignment` (`Ass_ID`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `St_Involved_Ass` FOREIGN KEY (`St_Involved_Ass`) REFERENCES `student` (`St_ID`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_ass`
--

LOCK TABLES `st_ass` WRITE;
/*!40000 ALTER TABLE `st_ass` DISABLE KEYS */;
INSERT INTO `st_ass` VALUES (9,1),(2,2),(9,2),(3,3),(1,4),(6,8),(9,8),(5,11),(8,11),(7,14),(6,19),(7,19),(10,19),(6,20),(8,20),(3,21),(9,22),(1,23),(2,23),(10,25),(2,28),(4,29),(4,32),(7,33),(8,33),(10,34),(2,35),(9,37),(3,38),(1,40),(7,40);
/*!40000 ALTER TABLE `st_ass` ENABLE KEYS */;
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
