# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table users (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_users primary key (id)
);


# --- !Downs

drop table if exists users;

