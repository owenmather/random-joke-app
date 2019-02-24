CREATE DATABASE  IF NOT EXISTS `jokeapp`;
USE `jokeapp`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `joke`;

CREATE TABLE `joke` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

