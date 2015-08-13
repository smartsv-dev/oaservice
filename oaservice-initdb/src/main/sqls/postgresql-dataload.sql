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


-- Table: todo
-- DROP TABLE todo;

CREATE TABLE todo
(
  todo_id character varying(50) NOT NULL,
  todo_title character varying(100),
  finished boolean,
  created_at timestamp with time zone,
  CONSTRAINT todo_pk_001 PRIMARY KEY (todo_id)
)


-- Table: t001_user
-- DROP TABLE t001_user;

CREATE TABLE t001_user
(
  user_id character varying(10) NOT NULL,
  password character varying(100),
  name_kanji character varying(30),
  name_katakana character varying(30),
  gender character varying(1),
  birthday character varying(8),
  joined_date timestamp with time zone,
  email character varying(100),
  address character varying(200),
  tel_no character varying(20),
  kyk_type character varying(1),
  job_stat character varying(1),
  user_role character varying(1) DEFAULT 1,
  del_flg character varying(1) DEFAULT 0,
  insert_date timestamp with time zone,
  update_date timestamp with time zone,
  CONSTRAINT t001_user_pk_1 PRIMARY KEY (user_id)
)
