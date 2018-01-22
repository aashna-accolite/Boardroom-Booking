CREATE DATABASE  IF NOT EXISTS 'accounts';
USE 'accounts';

DROP TABLE IF EXISTS 'location';
CREATE TABLE 'location' (
	'locID' int(10) NOT NULL,
	'locName' varchar(255) DEFAULT NULL,
	PRIMARY KEY ('locID')
)

DROP TABLE IF EXISTS 'user';
CREATE TABLE 'user' (
  'userID' int(10) NOT NULL,
  'username' varchar(255) DEFAULT NULL,
  'userPassword' varchar(255) DEFAULT NULL,
  'userLocID' int(10) NOT NULL,
  PRIMARY KEY ('id'),
  CONSTRAINT 'fk_userLocID_userID' FOREIGN KEY ('userLocID') REFERENCES 'location'('locID') ON DELETE CASCADE ON UPDATE CASCADE
)

DROP TABLE IF EXISTS 'admin';
CREATE TABLE 'admin' (
	'adminID' int(10) NOT NULL,
	'adminUserName' varchar(255) DEFAULT NULL,
	'adminPassword' varchar(255) DEFAULT NULL,
	'adminLocID' int(10) NOT NULL,
  	PRIMARY KEY ('adminID'),
  	CONSTRAINT 'fk_adminLocID_userID' FOREIGN KEY ('adminLocID') REFERENCES 'location'('locID') ON DELETE CASCADE ON UPDATE CASCADE
)


