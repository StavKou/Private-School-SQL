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
-- Table structure for table `assignment`
--

DROP TABLE IF EXISTS `assignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assignment` (
  `Ass_ID` int NOT NULL,
  `Title` varchar(100) DEFAULT NULL,
  `Description` varchar(100) DEFAULT NULL,
  `Sub_Date_Time` datetime DEFAULT NULL,
  `Oral_Mark` decimal(10,2) DEFAULT NULL,
  `Total_Mark` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`Ass_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignment`
--

LOCK TABLES `assignment` WRITE;
/*!40000 ALTER TABLE `assignment` DISABLE KEYS */;
INSERT INTO `assignment` VALUES (1,'Assignment_1.1','HTML Assignment_1','2022-01-01 00:00:00',20.00,80.00),(2,'Assignment_1.2','HTML Assignment_2','2022-03-01 00:00:00',20.00,80.00),(3,'Assignment_1.3','HTML Assignment_3','2022-05-01 00:00:00',20.00,80.00),(4,'Assignment_1.4','HTML Assignment_4','2022-06-01 00:00:00',20.00,80.00),(5,'Team_Assignment_1','HTML Team Assignment','2022-07-01 00:00:00',30.00,70.00),(6,'Assignment_2.1','Javascript Assignment_1','2022-02-01 00:00:00',20.00,80.00),(7,'Assignment_2.2','Javascript Assignment_2','2022-04-01 00:00:00',20.00,80.00),(8,'Assignment_2.3','Javascript Assignment_3','2022-06-01 00:00:00',20.00,80.00),(9,'Assignment_2.4','Javascript Assignment_4','2022-07-15 00:00:00',20.00,80.00),(10,'Team_Assignment_2','Javascript Team Assignment','2022-08-01 00:00:00',30.00,70.00),(11,'Assignment_3.1','Java Assignment_1','2022-01-15 00:00:00',20.00,80.00),(12,'Assignment_3.2','Java Assignment_2','2022-03-15 00:00:00',20.00,80.00),(13,'Assignment_3.3','Java Assignment_3','2022-05-15 00:00:00',20.00,80.00),(14,'Assignment_3.4','Java Assignment_4','2022-06-15 00:00:00',20.00,80.00),(15,'Team_Assignment_3','Java Team Assignment','2022-07-14 00:00:00',30.00,70.00),(16,'Assignment_4.1','Python Assignment_1','2022-02-15 00:00:00',20.00,80.00),(17,'Assignment_4.2','Python Assignment_2','2022-04-15 00:00:00',20.00,80.00),(18,'Assignment_4.3','Python Assignment_3','2022-06-15 00:00:00',20.00,80.00),(19,'Assignment_4.4','Python Assignment_4','2022-08-15 00:00:00',20.00,80.00),(20,'Team_Assignment_4','Python Team Assignment','2022-09-15 00:00:00',30.00,70.00),(21,'Assignment_5.1','C_Assignment_1','2022-03-01 00:00:00',20.00,80.00),(22,'Assignment_5.2','C_Assignment_2','2022-05-01 00:00:00',20.00,80.00),(23,'Assignment_5.3','C_Assignment_3','2022-07-01 00:00:00',20.00,80.00),(24,'Assignment_5.4','C_Assignment_4','2022-09-01 00:00:00',20.00,80.00),(25,'Team_Assignment_5','C Team Assignment_5','2022-10-15 00:00:00',30.00,80.00),(26,'Assignment_6.1','SQL Assignment_1','2022-04-01 00:00:00',20.00,80.00),(27,'Assignment_6.2','SQL Assignment_2','2022-06-01 00:00:00',20.00,80.00),(28,'Assignment_6.3','SQL Assignment_3','2022-08-01 00:00:00',20.00,80.00),(29,'Assignment_6.4','SQL Assignment_4','2022-09-15 00:00:00',20.00,80.00),(30,'Team_Assignment_6','SQL Team Assignment','2022-10-15 00:00:00',30.00,70.00),(31,'Assignment_7.1','PHP Assignment_1','2022-05-01 00:00:00',20.00,80.00),(32,'Assignment_7.2','PHP Assignment_2','2022-07-01 00:00:00',20.00,80.00),(33,'Assignmnent_7.3','PHP Assignment_3','2022-09-01 00:00:00',20.00,80.00),(34,'Assignment_7.4','PHP Assignment_4','2022-11-01 00:00:00',20.00,80.00),(35,'Team_Assignment_7','PHP Team Assignment','2022-12-20 00:00:00',30.00,70.00),(36,'Assignment_8.1','Scala Assignment_1','2022-04-20 00:00:00',20.00,80.00),(37,'Assignment_8.2','Scala Assignment_2','2022-05-20 00:00:00',20.00,80.00),(38,'Assignment_8.3','Scala Assignment_3','2022-06-20 00:00:00',20.00,80.00),(39,'Assignment_8.4','Scala Assignment_4','2022-07-20 00:00:00',20.00,80.00),(40,'Team_Assignment_8','Scala Team Assignment','2022-09-20 00:00:00',30.00,70.00);
/*!40000 ALTER TABLE `assignment` ENABLE KEYS */;
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
