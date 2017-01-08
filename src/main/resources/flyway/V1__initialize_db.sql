CREATE TABLE `user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'id seq',
  `account` varchar(50) NOT NULL COMMENT 'account info',
  `password` varchar(255) NOT NULL COMMENT 'pass word hash info',
  `status` tinyint(1) DEFAULT '0' COMMENT 'NORMAL(0),DELETE(1)',
  `grade` varchar(20) DEFAULT 'NORMAL' COMMENT 'NORMAL, HEAVY, ADMIN',
  `modifiedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `createdAt` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `account_UNIQUE` (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='user account information.';
