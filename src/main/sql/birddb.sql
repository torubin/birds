DROP TABLE IF EXISTS BIRD_NAMES;
DROP TABLE IF EXISTS BIRD_IMAGES;
DROP TABLE IF EXISTS BIRDS;
DROP TABLE IF EXISTS FAMILIES;

CREATE TABLE FAMILIES(
  FAMILY_NAME VARCHAR(100) PRIMARY KEY,
  GROUP_NAME VARCHAR(100)
);

CREATE TABLE BIRDS(
  ID VARCHAR(100) PRIMARY KEY,
  FAMILY_NAME VARCHAR(100) NOT NULL,
  SCIENTIFIC_NAME VARCHAR(200) NOT NULL,
  HREF VARCHAR(500) NOT NULL,
  FOREIGN KEY(FAMILY_NAME) REFERENCES FAMILIES(FAMILY_NAME)
);

CREATE TABLE BIRD_IMAGES(
  BIRD_ID VARCHAR(100),
  IMAGE BYTEA,
  FOREIGN KEY (BIRD_ID) REFERENCES BIRDS(ID)
);

CREATE TABLE BIRD_NAMES(
  BIRD_ID VARCHAR(100),
  BIRD_NAME VARCHAR(100),
  LANG VARCHAR(10) PRIMARY KEY,
  FOREIGN KEY (BIRD_ID) REFERENCES BIRDS(ID)
);