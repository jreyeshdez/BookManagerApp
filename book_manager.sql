SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `booktbl`
-- ----------------------------
DROP TABLE IF EXISTS `booktbl`;
CREATE TABLE `booktbl` (
  `book_id` int(4) NOT NULL AUTO_INCREMENT,
  `book_title` varchar(255) NOT NULL,
  `book_genre` varchar(255) NOT NULL,
  `book_authors` text NOT NULL,
  `no_of_pages` int(2) NOT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of booktbl
-- ----------------------------
INSERT INTO `booktbl` VALUES ('4', 'TCP/IP', 'Network', 'Jim', '450');
INSERT INTO `booktbl` VALUES ('5', 'Cloud Computing', 'IT', 'David', '298');
INSERT INTO `booktbl` VALUES ('6', 'Design Patterns', 'Software Engineering', 'Barry, John', '498');
