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

