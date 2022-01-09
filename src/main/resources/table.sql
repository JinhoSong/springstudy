create table post(
                     USER_ID varchar(50) not null,
                     POST_ID varchar(50) not null ,
                     POST_TITLE varchar(100) not null,
                     POST_CONTENT varchar(500) not null,
                     PRIMARY KEY (POST_ID, USER_ID)
) COMMENT '게시판';
