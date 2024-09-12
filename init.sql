CREATE TABLE IF NOT EXISTS USER_GYM(
    USER_ID INT NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(255),
    SURNAME VARCHAR(255),
    CODE VARCHAR(16),
    BIRTHDAY DATE,
    PHONE VARCHAR(10),
    EMAIL VARCHAR(255),
    CERTIFICATE VARCHAR(255),
    VALID_DATE DATE,
    SUBSCRIPTION DATE,
    SUBSCRIPTION VARCHAR(255),
    SUBSCRIPTION_DATE DATE,
    PRIMARY KEY(USER_ID)
    )
CREATE TABLE IF NOT EXISTS COURSE(
    COURSE_ID INT NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(255),
    COURSE_START DATE,
    COURSE_END DATE,
    STATUS VARCHAR(255)
    PRIMARY KEY(COURSE_ID)
    )
CREATE TABLE IF NOT EXISTS TRAINER(
    TRAINER_ID INT NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(255),
    SURNAME VARCHAR(255),
    PRIMARY KEY(TRAINER_ID)
    )
CREATE TABLE IF NOT EXISTS ROOM(
    ROOM_ID INT NOT NULL AUTO_INCREMENT,

    PRIMARY KEY(ROOM_ID)
    )
