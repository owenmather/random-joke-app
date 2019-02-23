CREATE DATABASE  IF NOT EXISTS `JokeApp`;
USE `JokeApp`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `joke`;

CREATE TABLE `joke` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `joke` VALUES
	(1,'Knock knock'),
    (2,'Knock knock 2')

