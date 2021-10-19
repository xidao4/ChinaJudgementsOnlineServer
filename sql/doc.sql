DROP TABLE IF EXISTS Doc;
CREATE TABLE `doc` (
    `title` varchar(50) CHARACTER SET utf8 NOT NULL,
    `type` varchar(10) CHARACTER SET utf8 NOT NULL,
    `court` varchar(40) CHARACTER SET utf8 NOT NULL,
    `cause` varchar(100) CHARACTER SET utf8 NOT NULL,
    `content` varchar(600) CHARACTER SET utf8 NOT NULL,
    `status` varchar(1) CHARACTER SET utf8 NOT NULL,
    PRIMARY KEY (`title`)
) ENGINE=InnoDB;

INSERT INTO Doc VALUES ('title', 'type', 'court', 'cause', 'content', '0');

