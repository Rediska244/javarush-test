CREATE schema test;
USE test;

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `description` varchar(255) NOT NULL,
  `author` varchar(100) NOT NULL,
  `isbn` varchar(20) NOT NULL,
  `printYear` int(11) NOT NULL,
  `readAlready` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO 
	book (title, description , author, isbn, printYear, readAlready)
VALUES 
	('Book 1 ', 'description 1', 'FIO 1', '2-232265-23-9', 2013, false),
	('Book 2 ', 'description 2', 'FIO 2', '3-211148-76-4', 2013, false),
	('Book 3 ', 'description 3', 'FIO 1', '4-230984-45-9', 2013, false),
	('Book 4 ', 'description 4', 'FIO 2', '1-123321-67-7', 2014, false),
	('Book 5 ', 'description 5', 'FIO 1', '2-423459-03-2', 2014, false),
  ('Book 6 ', 'description 6', 'FIO 1', '4-456344-443-6', 2015, false),
	('Book 7 ', 'description 7', 'FIO 3', '9-123456-03-2', 2015, false),
	('Book 8 ', 'description 8', 'FIO 4', '4-456556-897-6', 2013, false),
	('Book 9 ', 'description 9', 'FIO 5', '1-908228-83-0', 2013, false),
	('Book 10 ', 'description 10','FIO 6', '1-625559-83-0', 2015, false),
	('Book 5 ', 'description 11', 'FIO 2',  '1-943667-83-0', 2013, false),
	('Book 5 ', 'description 12', 'FIO 3',  '7-188443-90-0', 2012, false),
	('Book 5 ', 'description 13', 'FIO 4', '6-785673-03-2', 2016, false),
	('BookF 6 ', 'description 14', 'FIO 11', '7-648654-90-0', 2014, false),
	('BookF 7 ', 'description 15', 'FIO 12', '6-904234-03-2', 2014, false),
	('BookF 7 ', 'description 16', 'FIO 11',  '0-1256737-43-4', 2015, false),
	('BookF 8 ', 'description 17', 'FIO 12',  '4-2831092-22-2', 2015, false),
	('BookF 9 ', 'description 18', 'FIO 13', '0-938487-43-4', 2015, false),
	('BookF 10 ', 'description 19', 'FIO 14', '4-738322-22-2', 2014, false),
	('BookF 11 ', 'description 20', 'FIO 14', '0-456028-43-4', 2015, false),
	('BookH 7 ', 'description 21', 'FIO 21',  '5-228228-22-8', 2016, false),
	('BookH 8 ', 'description 22', 'FIO 21',  '9-000777-00-7', 2015, false),
	('BookH 8 ', 'description 23', 'FIO 22', '5-123123-22-8', 2016, false),
	('BookH 9 ', 'description 24', 'FIO 22', '9-777000-00-7', 2016, false),
	('BookH 10 ', 'description 25', 'FIO 22', '5-321321-22-8', 2016, false)
