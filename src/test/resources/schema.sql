DROP TABLE IF EXISTS FUND;
  
CREATE TABLE FUND (
  id LONG fundId  PRIMARY KEY,
  fundName VARCHAR(250) NOT NULL,
  buy VARCHAR(250) NOT NULL,
  sell VARCHAR(250) DEFAULT NULL
  expirationDate VARCHAR(250) DEFAULT NULL
  publishDate VARCHAR(250) DEFAULT NULL
);