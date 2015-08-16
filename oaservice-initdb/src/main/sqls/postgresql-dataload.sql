-- Role: postgres
-- DROP ROLE postgres;

CREATE ROLE postgres LOGIN
  ENCRYPTED PASSWORD 'md53175bce1d3201d16594cebf9d7eb3f9d'
  SUPERUSER INHERIT CREATEDB CREATEROLE REPLICATION;


-- Database: oaservice
-- DROP DATABASE oaservice;

CREATE DATABASE oaservice
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Japanese_Japan.932'
       LC_CTYPE = 'Japanese_Japan.932'
       CONNECTION LIMIT = -1;


-- Sequence: seq01_user_id
-- DROP SEQUENCE seq01_user_id;

CREATE SEQUENCE seq01_user_id
  INCREMENT 1
  MINVALUE 100
  MAXVALUE 999999
  START 100
  CACHE 1;


-- Table: t900_todo
-- DROP TABLE t900_todo;

CREATE TABLE t900_todo
(
  todo_id varchar(50) NOT NULL,
  todo_title varchar(100),
  finished boolean,
  created_at timestamp,
  CONSTRAINT t900_todo_pk_1 PRIMARY KEY (todo_id)
)


-- Table: t001_user
-- DROP TABLE t001_user;

CREATE TABLE t001_user
(
  user_id varchar(10) NOT NULL,
  password varchar(100),
  name_kanji varchar(30),
  name_katakana varchar(30),
  gender varchar(1),
  birthday varchar(8),
  joined_date varchar(8),
  email varchar(100),
  address varchar(200),
  tel_no varchar(20),
  kyk_type varchar(1),
  job_stat varchar(1),
  user_role varchar(1) DEFAULT 1,
  del_flg varchar(1) DEFAULT 0,
  insert_date timestamp,
  update_date timestamp,
  CONSTRAINT t001_user_pk_1 PRIMARY KEY (user_id)
)