CREATE DATABASE  IF NOT EXISTS `gastos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `gastos`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: gastos
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
-- Table structure for table `gastosgenerales`
--

DROP TABLE IF EXISTS `gastosgenerales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gastosgenerales` (
  `id_gastos` int NOT NULL AUTO_INCREMENT,
  `saldo_actual` double(9,2) DEFAULT NULL,
  `saldo_utilizado` double(9,2) DEFAULT NULL,
  `saldo_nuevo` double(9,2) DEFAULT NULL,
  `tipo_operacion` varchar(200) DEFAULT NULL,
  `fecha_movimiento` date DEFAULT NULL,
  PRIMARY KEY (`id_gastos`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gastosgenerales`
--

LOCK TABLES `gastosgenerales` WRITE;
/*!40000 ALTER TABLE `gastosgenerales` DISABLE KEYS */;
INSERT INTO `gastosgenerales` VALUES (1,63758.19,11366.13,52392.06,'Transferencias a Javier','2022-09-20'),(2,52392.06,500.00,52892.06,'Depósito de un cliente ','2022-09-20'),(3,52892.06,2741.56,50150.50,'Transferencias a Javier','2022-09-20'),(4,50150.50,41431.60,91582.10,'Depósito de un cliente ','2022-09-20'),(5,91582.10,11105.53,80476.57,'Transferencias a Javier','2022-09-20'),(6,80476.57,2741.56,77735.01,'Transferencias a Javier','2022-09-20'),(7,77735.01,12800.99,90536.00,'Depósito de un cliente ','2022-09-20'),(8,90536.17,11940.76,78595.41,'Transferencias a Javier','2022-09-20'),(9,78595.41,11266.00,67329.41,'Transferencias a Javier','2022-09-20'),(10,67329.41,2741.56,64587.85,'Transferencias a Javier','2022-09-20'),(11,64587.85,2048.16,66636.01,'Depósito de un cliente ','2022-09-20'),(12,66636.01,2741.56,63894.45,'Transferencias a Javier','2022-09-20'),(13,63894.45,19999.97,43894.48,'Transferencias a Javier','2022-09-20'),(14,43894.48,53000.00,96894.48,'Depósito de un cliente ','2022-09-20'),(15,96894.48,6842.45,90052.03,'Transferencias a Javier','2022-09-20'),(16,90052.89,9000.00,99052.89,'Depósito de un cliente ','2022-09-20'),(17,99052.89,1000.00,100052.89,'Depósito de un cliente ','2022-09-20'),(18,100052.89,6396.44,93656.45,'Transferencias a Javier','2022-09-20'),(19,93656.45,568.40,93088.05,'Transferencias a Javier','2022-09-20'),(20,93088.05,2741.56,90346.49,'Pago de Nominas','2022-09-20'),(21,90346.49,1649.97,91996.46,'Depósito de un cliente ','2022-09-20'),(22,91996.46,13172.00,78824.46,'Otro...','2022-09-20'),(23,78824.49,552.00,78272.49,'Otro...','2022-09-25');
/*!40000 ALTER TABLE `gastosgenerales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'gastos'
--

--
-- Dumping routines for database 'gastos'
--
/*!50003 DROP PROCEDURE IF EXISTS `sp_ConsultarGastosTable` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ConsultarGastosTable`()
begin 
select id_gastos, saldo_actual, saldo_utilizado, saldo_nuevo, 
tipo_operacion, fecha_movimiento from gastosgenerales;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_eliminarGasto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminarGasto`(in idGastos int(10))
begin
delete from gastosgenerales where id_gastos = idGastos;
ALTER TABLE gastosgenerales AUTO_INCREMENT=1;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_insertarGastoNuevo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insertarGastoNuevo`(in saldoActual varchar(50), saldoUtilizado varchar(50),
saldoNuevo varchar(50), tipoOperacion varchar(200), fecha date)
begin
insert into gastosgenerales(id_gastos, saldo_actual, saldo_utilizado, saldo_nuevo, tipo_operacion, fecha_movimiento)
values(null, saldoActual, saldoUtilizado, saldoNuevo, tipoOperacion, fecha);
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-25  0:49:20
