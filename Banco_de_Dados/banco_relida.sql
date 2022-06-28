-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: relida
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
-- Table structure for table `anuncios`
--

DROP TABLE IF EXISTS `anuncios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `anuncios` (
  `id_anuncios` int NOT NULL AUTO_INCREMENT,
  `id_anunciante` int DEFAULT NULL,
  `id_tipo_operacao` int DEFAULT NULL,
  `n_valor` float DEFAULT '0',
  `c_titulo` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `c_autor` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `d_edicao` date DEFAULT NULL,
  `id_categorias_livros` int DEFAULT NULL,
  `c_outros` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `id_cidade` int DEFAULT NULL,
  `c_comentario_anunciantes` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `c_fotos_diretorio` varchar(30) DEFAULT NULL,
  `d_anuncios` datetime DEFAULT NULL,
  PRIMARY KEY (`id_anuncios`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anuncios`
--

LOCK TABLES `anuncios` WRITE;
/*!40000 ALTER TABLE `anuncios` DISABLE KEYS */;
INSERT INTO `anuncios` VALUES (1,9,1,17.9,'Do Mil ao Milhão. Sem Cortar o Cafezinho','Thiago Nigro','2018-11-10',15,NULL,324,'Está em um ótimo estado.','imagens/livros/1.jpg','2022-03-07 10:00:00'),(2,11,1,24.9,'Pai Rico, Pai Pobre','Robert Kiyosaki e Sharon L. Lechter','2017-07-26',15,'Inspirador',15,'Ótima leitura.','imagens/livros/2.jpg','2022-03-15 11:30:01'),(3,17,3,NULL,'Como Fazer Amigos e Influenciar Pessoas - Bolso','Dale Carnegie','2016-10-31',15,NULL,533,'Ajudou bastante.','imagens/livros/3.jpg','2022-03-22 12:35:11'),(4,15,1,28.5,'O sol é para todos','Harper Lee','2006-10-10',10,'Estados Unidos',125,NULL,'imagens/livros/4.jpg','2022-04-01 12:47:41'),(5,10,2,NULL,'Especialista em pessoas: Soluções bíblicas e inteligentes para lidar com todo tipo de gente\nEspecialista em pessoas: Soluções bíblicas e inteligentes para lidar com todo tipo de gente','Tiago Brunet','2020-03-03',15,'Glorificador!',5,'Glória!','imagens/livros/5.jpg','2022-04-16 11:37:01'),(6,9,1,11.5,'Casais inteligentes enriquecem juntos: Finanças para casais','Gustavo Cerbasi','2014-09-18',15,'Dinheiro',3456,'Muito bom.','imagens/livros/6.jpg','2022-04-24 09:30:31'),(7,8,1,8.45,'Mais esperto que o Diabo: O mistério revelado da liberdade e do sucesso','Napoleon Hill','2014-07-10',15,NULL,536,'Incrível.','imagens/livros/7.jpg','2022-04-30 15:31:21'),(8,7,3,NULL,'O poder da ação','Paulo Vieira',NULL,15,NULL,786,'Ótimo','imagens/livros/8.jpg','2022-05-03 09:32:31'),(9,1,2,NULL,'O Último Olimpiano: Percy Jackson e os Olimpianos Volume 5','Rick Riordan','2014-08-12',9,NULL,34,'Perfeito.','imagens/livros/9.jpg','2022-05-09 17:00:51'),(10,1,1,32,'The Lightning Thief ','Rick Riordan','2006-03-01',9,NULL,542,'Sensasional','imagens/livros/10.jpg','2022-05-18 09:00:31'),(11,9,1,42.5,'Harry Potter and the Goblet of Fire (English Edition)','J.K.Rowling',NULL,9,NULL,2334,'Interessante.','imagens/livros/11.jpg','2022-05-22 22:37:04'),(12,11,1,11.5,'O milagre da manhã: O segredo para transformar sua vida (antes das 8 horas)','Marcelo Schild',NULL,15,NULL,601,'Surpreendente.','imagens/livros/12.jpg','2022-05-29 12:20:47'),(13,17,3,NULL,'P.s eu te amo','Cecelia Ahern',NULL,10,'Romance',640,'Revigorante.','imagens/livros/13.jpg','2022-06-05 20:38:34'),(14,15,1,16.5,'Como Eu Era Antes de Você: (Trilogia Como eu Era Antes de Você - Livro um: 1','JoJo Moyes','2013-04-09',10,'Romance',690,'Sublime.','imagens/livros/14.jpg','2022-06-15 18:37:04'),(15,11,2,NULL,'Como Eu Era Antes de Você: (Trilogia Como eu Era Antes de Você - Livro um: 1','Rachael Lippincott','2019-02-25',10,'Romance',1327,'Leitura obrigatória.','imagens/livros/15.jpg','2022-06-25 10:07:00'),(16,9,1,22.5,'A Culpa é Das Estrelas','John Green',NULL,11,'Romance',689,'Todos precisam ler.','imagens/livros/16.jpg','2022-06-30 21:37:02'),(17,8,1,23.5,'Amor & Gelato: 1','Jenna Evans Welch',NULL,11,'Romance',4902,'Empolgante.','imagens/livros/17.jpg','2022-07-01 19:57:04'),(18,7,3,NULL,'Anna Kariênina','Liev Tolstói',NULL,10,NULL,718,'Diferenciado','imagens/livros/18.jpg','2022-07-12 22:04:02'),(19,9,1,30.9,'Inteligência emocional','Daniel Goleman',NULL,10,NULL,680,'Recomendo.','imagens/livros/19.jpg','2022-07-22 07:37:04'),(20,8,3,NULL,'Demian','Demian','2012-01-01',10,NULL,490,'Inquietante.','imagens/livros/20.jpg','2022-07-29 22:37:00');
/*!40000 ALTER TABLE `anuncios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias_livros`
--

DROP TABLE IF EXISTS `categorias_livros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias_livros` (
  `id_categorias` int NOT NULL AUTO_INCREMENT,
  `c_categorias` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id_categorias`),
  UNIQUE KEY `c_categorias_UNIQUE` (`c_categorias`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias_livros`
--

LOCK TABLES `categorias_livros` WRITE;
/*!40000 ALTER TABLE `categorias_livros` DISABLE KEYS */;
INSERT INTO `categorias_livros` VALUES (15,'Autoajuda'),(14,'Autobiografia'),(13,'Biografia'),(2,'Drama'),(3,'Fantasia'),(4,'Ficção'),(6,'História em quadrinhos'),(7,'Literatura Brasileira'),(10,'Literatura Estrangeira'),(11,'Literatura Ficcional'),(8,'Literatura Infantil'),(9,'Literatura Infanto-Juvenil'),(1,'Romance'),(5,'Suspense'),(12,'Terror');
/*!40000 ALTER TABLE `categorias_livros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cidades`
--

DROP TABLE IF EXISTS `cidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cidades` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(120) DEFAULT NULL,
  `id_estado` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5565 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidades`
--

LOCK TABLES `cidades` WRITE;
/*!40000 ALTER TABLE `cidades` DISABLE KEYS */;
/*!40000 ALTER TABLE `cidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentarios`
--

DROP TABLE IF EXISTS `comentarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comentarios` (
  `id_comentarios` int NOT NULL AUTO_INCREMENT,
  `d_comentarios` datetime DEFAULT NULL,
  `c_comentarios` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `id_usuarios` int DEFAULT NULL,
  `id_anuncios` int DEFAULT NULL,
  `id_recomentarios` int DEFAULT NULL,
  PRIMARY KEY (`id_comentarios`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentarios`
--

LOCK TABLES `comentarios` WRITE;
/*!40000 ALTER TABLE `comentarios` DISABLE KEYS */;
INSERT INTO `comentarios` VALUES (1,'2022-05-23 22:37:04','gostei do livro, muito interessante!',1,11,NULL),(2,'2022-05-23 22:45:55','sim, e o final é surpreendente',2,11,1),(3,'2022-05-24 13:02:58','Oh! HP, gosto da saga, já quero ler',4,11,NULL),(4,'2022-05-25 15:14:00','Tava querendo esse livro, encontrei',12,11,NULL),(5,'2022-05-26 20:00:02','Muito massa!',18,11,NULL),(6,'2022-05-27 10:15:03','Esse livro é muito bom, pô',7,11,NULL),(7,'2022-05-27 10:25:49','Que mentira, pô',5,11,6),(8,'2022-05-27 12:46:01','Concordo!!',10,11,6),(9,'2022-05-28 17:30:22','Vale a pena perder tempo nesse livro não',19,11,NULL),(10,'2022-05-29 00:00:23','Harry Potter é bom demais',20,11,NULL);
/*!40000 ALTER TABLE `comentarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estados`
--

DROP TABLE IF EXISTS `estados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estados` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(75) DEFAULT NULL,
  `uf` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estados`
--

LOCK TABLES `estados` WRITE;
/*!40000 ALTER TABLE `estados` DISABLE KEYS */;
/*!40000 ALTER TABLE `estados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ofertas`
--

DROP TABLE IF EXISTS `ofertas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ofertas` (
  `id_ofertas` int NOT NULL AUTO_INCREMENT,
  `n_desconto` float DEFAULT NULL,
  `id_anuncios` int DEFAULT NULL,
  PRIMARY KEY (`id_ofertas`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ofertas`
--

LOCK TABLES `ofertas` WRITE;
/*!40000 ALTER TABLE `ofertas` DISABLE KEYS */;
INSERT INTO `ofertas` VALUES (1,1.38,3),(2,2.32,3),(3,3.9,8),(4,4.02,6),(5,5.41,3),(6,4.32,8),(7,5.99,10),(8,3.75,2),(9,2.72,2),(10,1.24,9);
/*!40000 ALTER TABLE `ofertas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operacoes`
--

DROP TABLE IF EXISTS `operacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operacoes` (
  `id_operacoes` int NOT NULL AUTO_INCREMENT,
  `id_anuncios` int DEFAULT NULL,
  `id_consumidor` int DEFAULT NULL,
  `c_comentarioperacao` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id_operacoes`),
  UNIQUE KEY `id_operacoes_UNIQUE` (`id_operacoes`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operacoes`
--

LOCK TABLES `operacoes` WRITE;
/*!40000 ALTER TABLE `operacoes` DISABLE KEYS */;
INSERT INTO `operacoes` VALUES (1,10,2,'O livro está em ótimo estado'),(2,1,1,'O livro está rasgado'),(3,2,3,'O livro está faltando folhas'),(4,3,5,'O livro chegou antes do prazo'),(5,4,4,'O estado do livro é melhor do que imaginei'),(6,5,6,'Chegouoperacoesoperacoes mais rápido que o flash'),(7,6,8,'Esse acervo virtual é incrível, entregou o livro antes da data prevista'),(8,7,7,'Recomendo que comprem livros nesse acervo, chegou antes do previsto e em ótimo estado'),(9,8,9,'Agradável e bonito, recomendo que comprem!!!'),(10,9,11,'Excelente livro, recomendo!'),(11,2,10,'Recomendo muito que comprem nesse acervo!'),(12,9,12,'Comprem nesse acervoooooo, ele é ótimo dms!!!'),(13,8,13,'Qualidade dos livros desse acervo são incríveis!'),(14,7,15,'Chegou em perfeito estado!'),(15,6,14,'Recomendo!!!'),(16,5,17,'Demorou pra chegar, mas está em ótimo estado!'),(17,4,16,'Entrega foi muito rápido!!'),(18,3,19,'Esse livro que comprei é incrível'),(19,2,18,'Melhor troca que já fiz na minha vida'),(20,1,20,'Amei essa doação, muito obrigada! Amei esse acervo!!!');
/*!40000 ALTER TABLE `operacoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perguntas_seg`
--

DROP TABLE IF EXISTS `perguntas_seg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perguntas_seg` (
  `id_perguntas` int NOT NULL AUTO_INCREMENT,
  `c_perguntas` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id_perguntas`),
  UNIQUE KEY `c_perguntas_UNIQUE` (`c_perguntas`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perguntas_seg`
--

LOCK TABLES `perguntas_seg` WRITE;
/*!40000 ALTER TABLE `perguntas_seg` DISABLE KEYS */;
INSERT INTO `perguntas_seg` VALUES (4,'Animal Favorito'),(5,'Livro favorito'),(6,'Melhor amigo de infância');
/*!40000 ALTER TABLE `perguntas_seg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos_operacoes`
--

DROP TABLE IF EXISTS `tipos_operacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos_operacoes` (
  `id_tipo_operacoes` int NOT NULL AUTO_INCREMENT,
  `c_tipo` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id_tipo_operacoes`),
  UNIQUE KEY `c_tipo_UNIQUE` (`c_tipo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos_operacoes`
--

LOCK TABLES `tipos_operacoes` WRITE;
/*!40000 ALTER TABLE `tipos_operacoes` DISABLE KEYS */;
INSERT INTO `tipos_operacoes` VALUES (6,'Doação'),(5,'Troca'),(4,'Venda');
/*!40000 ALTER TABLE `tipos_operacoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id_usuarios` int NOT NULL AUTO_INCREMENT,
  `c_nome` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `c_email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `c_senhas` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `id_perguntas` int DEFAULT NULL,
  `c_respostaseg` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `c_interesses` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `id_cidades` int DEFAULT NULL,
  `n_avaliacao` float DEFAULT NULL,
  PRIMARY KEY (`id_usuarios`),
  UNIQUE KEY `c_email_UNIQUE` (`c_email`),
  KEY `fklasdfjkas_idx` (`c_senhas`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'João Pedro','consequat@icloud.couk','OMB04VQC6UE',2,'Shirlley','Drama, Romance, Fantasia, Ler, Doar, Vender, Trocar',3191,1),(2,'Maria José','egestas@google.net','TBX52HDK5NF',1,'Cachorro','Drama, Romance, Fantasia, Ler, Doar, Vender, Trocar Ação',1018,2),(3,'Júlia Araújo','facilisis.suspendisse@yahoo.ca','ATW73VWM7VI',2,'Larissa','Romance, Fantasia,',720,3),(4,'Pedro Paulo','id.risus.quis@aol.couk','YHS27YRF8DM',2,'Francisco','Drama, Romance, Fantasia, Ler, Doar, Vender,',2815,1),(5,'Alvaro Cabenga','vel.venenatis@yahoo.org','WES21BVT0OW',3,'Drácula','Drama, Romance, Fantasia, Ler, +Doar, Vender, Trocar',2931,1),(6,'Bernardo Lorenzolli','velit.egestas@icloud.org','FGK38MIV4GG',2,'Bruno','Drama, Romance, Fantasia, Ler, Doar, Vender, Trocar Ação',149,2),(7,'Thiago Silva','cursus.diam@outlook.net','HPR63YIW8EY',1,'Cachorro','Romance, Fantasia, Ler, Doar, Vender, Trocar',4230,3),(8,'Matheus Santiago','arcu.vestibulum@outlook.org','LQF00TNO2FQ',3,'O menino de Pijama Listrado','Drama, Romance, Fantasia, Ler, Doar, Vender, Trocar Ação',4173,2),(9,'Luiz Crespo','dolor.sit.amet@aol.ca','BQP33CFG2KI',2,'Marcelo','Drama, Romance, Fantasia, Ler, Doar, Vender, Trocar',2994,3),(10,'Tatiane Godoi','eu@icloud.edu','VXU93WTY8UA',3,'O lado bom da vida','Drama, Romance, Fantasia, Ler, Doar, Vender, Trocar',196,2),(11,'Gabriel Santos','quis@hotmail.com','EYT11JOF1XQ',3,'A culpa é das estrelas','Fantasia, Ler, Doar, Vender, Trocar',798,2),(12,'Paulo Albuquerque','turpis.egestas@icloud.couk','YRI93BIJ4QQ',2,'Ana','Drama, Romance, Fantasia, Ler,',2137,3),(13,'Serialdo Ferreira','adipiscing.elit@outlook.com','XIQ84QXP1ZO',2,'Wandemberg','Doar, Vender, Trocar',3653,5),(14,'Abreu Matos','bibendum@yahoo.org','LUD67VGV9DT',1,'Gato','Fantasia, Ler,',3022,3),(15,'Inácia Brasil','feugiat.metus@aol.com','QVR50SBT2CB',2,'Ana','Drama, Romance, Fantasia, Ler, Doar, Vender, Trocar Ação',1168,2),(16,'Célia Pernambucana','ipsum@google.com','EEE73UUW2PK',2,'Julia','Fantasia, Ler, Doar, Vender, Trocar',2425,3),(17,'Cicéra Vilela','phasellus.dapibus@google.com','SJE76VRF8US',2,'Roberta','Fantasia, Ler, Doar, Vender,',3523,5),(18,'Arnaldo Queiroz','et.magnis.dis@hotmail.org','DML67GLW4JF',2,'Maria','Fantasia, Ler, Doar, Vender,',4622,2),(19,'Clarência da Costa','luctus.vulputate@protonmail.couk','SKY37OSC2QS',3,'O mundo da criança','Drama, Romance, Fantasia, Ler, Doar, Vender, Trocar Ação',790,1),(20,'Armelle Santos','et.risus@yahoo.edu','SJZ56KMH6QZ',2,'Marcos','Fantasia, Ler, Doar, Vender,',5416,5);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-28  4:13:18
