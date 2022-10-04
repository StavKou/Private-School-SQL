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
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `St_ID` int NOT NULL,
  `St_FName` varchar(45) DEFAULT NULL,
  `St_LName` varchar(45) DEFAULT NULL,
  `Date_of_Birth` date DEFAULT NULL,
  `Tuition_Fee` int DEFAULT NULL,
  PRIMARY KEY (`St_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Giorgws','Azakas','1993-05-16',2500),(2,'Vaggelis','Pappas','1990-12-21',2500),(3,'Stavros','Kourkoulos','1989-05-15',2500),(4,'Grigoris','Ladas','1990-07-21',2500),(5,'Dimitrios','Papadogiannakis','1990-08-04',2500),(6,'Akis','Poikilidis','1990-04-22',2500),(7,'Roman','Hagos','1991-02-27',2500),(8,'Andeas','Tsarouchas','1986-04-16',2500),(9,'Aggelos','Kovatsis','1992-09-17',2500),(10,'Dimitris','Mane','1987-10-22',2500),(11,'Antonis','Katsakos','1990-11-04',2500),(12,'Giwrgos','Karatzas','1988-07-12',2500),(13,'Radu','Marinescu','1988-05-30',2500),(14,'Padelis','Logothetis','1989-06-11',2500),(15,'Vaggelis','Kolokotronis','1988-02-14',2500),(16,'Faidon','Fotas','1989-04-04',2500),(17,'Nikolaos','Strateas','1992-11-14',2500),(18,'Dimosthenis','Kaleas','1982-06-01',2500),(19,'Takis','Remotis','1991-05-12',2500),(20,'Markos','Kanakos','1983-04-22',2500),(21,'Efstatios','Siskakis','1984-06-21',2500),(22,'Zoi','Zappidi','1994-02-19',2500),(23,'Aglaia','Statha','1984-09-21',2500),(24,'Florentia','Statha','1985-10-01',2500),(25,'Sapho','Athanouli','1994-11-06',2500),(26,'Maya','Rodinaki','1985-12-03',2500),(27,'Vasiliki','Milatou','1985-12-07',2500),(28,'Agathi','Sallithi','1991-06-22',2500),(29,'Petros','Pepallis','1990-11-23',2500),(30,'Titos','Andreas','1994-05-07',2500);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
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
