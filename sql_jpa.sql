DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(255) NOT NULL ,
  `writer` VARCHAR(255) NOT NULL ,
  `introduction` TEXT,
  `book_category_id` INT(11) UNSIGNED DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_book_category_idx` (`book_category_id`),
  CONSTRAINT `fk_book_category_id` FOREIGN KEY (`book_category_id`) REFERENCES `book_category` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `book`(`name`, `writer`, `introduction`,`book_category_id`) VALUES ('大道争锋', '误导者', '不堕轮回入大千，心传一道在人间。愿起一剑杀万劫，无情换作有情天!……境界分化：明气、玄光、化丹、元婴、象相、凡蜕、真阳、炼神、至人……','1');
INSERT INTO `book`(`name`, `writer`, `introduction`,`book_category_id`) VALUES ('元尊', '天蚕土豆', '吾有一口玄黄气，可吞天地日月星。天蚕土豆最新鼎力大作，2017年度必看玄幻小说。','1');
INSERT INTO `book`(`name`, `writer`, `introduction`,`book_category_id`) VALUES ('凡人修仙传', '忘语', '个普通山村小子，偶然下进入到当地江湖小门派，成了一名记名弟子。他以这样身份，如何在门派中立足,如何以平庸的资质进入到修仙者的行列，从而笑傲三界之中！','1');
INSERT INTO `book`(`name`, `writer`, `introduction`,`book_category_id`) VALUES ('黑夜暴君', '派乐船长', '我叫方昊，我意外来到了这个不知名的古代，但却活得挺滋润。\r\n　　作为一名古代的屠夫，两年来我挣了不少钱，有了不错的积蓄。正当我因为焕城没有夜生活想要搬到另一个有夜生活的城池时，我发现世界变了。\r\n　　灵气复苏了！\r\n　　不，是魔气复苏了……\r\n　　“MMP，古代为什么会有魔气复苏这种梗！！！”','4');
INSERT INTO `book`(`name`, `writer`, `introduction`,`book_category_id`) VALUES ('我是一个原始人', '墨守白', '天空一碧如洗，阳光普照山林，整个世界都显得一片安静祥和，带着一种独有的静谧。\r\n看着穿着性感虎皮短裙手里拿着棍子，带着十余个人嗷嗷叫着去追赶披毛犀的首领，韩成禁不住的将稍微蜷着的右手放到微张的嘴边，再一次的发出了感慨：“我的天呐！”','5');



CREATE TABLE `book_category` (
  `id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(120) NOT NULL ,
  `details` TEXT ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `book_category`(`name`, `details`) VALUES ('玄幻', NULL);
INSERT INTO `book_category`(`name`, `details`) VALUES ('军事', NULL);
INSERT INTO `book_category`(`name`, `details`) VALUES ('游戏', NULL);
INSERT INTO `book_category`(`name`, `details`) VALUES ('仙侠', NULL);
INSERT INTO `book_category`(`name`, `details`) VALUES ('科幻', NULL);
INSERT INTO `book_category`(`name`, `details`) VALUES ('都市', NULL);
INSERT INTO `book_category`(`name`, `details`) VALUES ('历史', NULL);