CREATE DATABASE  IF NOT EXISTS `jokeapp`;
USE `jokeapp`;

--
-- Table structure for table `employee`
--


CREATE TABLE `fact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `fact` VALUES
	(1,'Washington was the first american president'),
  (2,'Knock knock 2')

