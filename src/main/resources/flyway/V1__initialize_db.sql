#gradle flywayMigrate -i

CREATE TABLE `user_account` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'id seq',
  `account` varchar(50) NOT NULL COMMENT 'account info',
  `password` varchar(255) NOT NULL COMMENT 'pass word hash info',
  `displayName` varchar(255) NOT NULL,
  `live` tinyint(1) DEFAULT '1' COMMENT 'NORMAL(0),DELETE(1)',
  `grade` varchar(20) DEFAULT 'NORMAL' COMMENT 'NORMAL, HEAVY, ADMIN',
  `role` varchar(50) DEFAULT NULL COMMENT 'user role',
  `modifiedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `createdAt` datetime NOT NULL COMMENT 'display name',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `account_UNIQUE` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='user account information.';
CREATE TABLE `board` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'id value',
  `createdId` bigint(11) NOT NULL COMMENT 'created user id',
  `modifiedId` bigint(11) NOT NULL COMMENT 'modified user id',
  `title` varchar(255) DEFAULT NULL COMMENT 'title',
  `content` text COMMENT 'content',
  `createdAt` datetime NOT NULL COMMENT 'created date',
  `modifiedAt` datetime NOT NULL COMMENT 'modified date',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='board content datas ';
CREATE  TABLE `info`.`board_comment` (
  `id` BIGINT(11) NOT NULL AUTO_INCREMENT COMMENT 'seq' ,
  `boardId` BIGINT(11) NOT NULL COMMENT 'board id ' ,
  `ipAddress` VARCHAR(50) NULL COMMENT 'create user ip address' ,
  `content` TEXT NULL COMMENT 'content' ,
  `createdAt` DATETIME NOT NULL COMMENT 'created date' ,
  `modifiedAt` DATETIME NOT NULL COMMENT 'modified date' ,
  PRIMARY KEY (`id`) ,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
COMMENT = 'board comment info';
CREATE TABLE `board_image` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `boardId` bigint(11) DEFAULT NULL,
  `displayName` varchar(255) NOT NULL,
  `hashValue` varchar(500) DEFAULT NULL,
  `createdAt` datetime NOT NULL,
  `modifiedAt` datetime NOT NULL,
  `createdId` bigint(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='image ';