CREATE TABLE PSS.USER
(
    userId   varchar(20) comment '아이디',
    password varchar(20) NOT NULL comment '비밀번호',
    email    varchar(20) NOT NULL comment '이메일',
    userName varchar(20) NOT NULL comment '이름'
) charset = utf8 comment '사용자';


CREATE TABLE PSS.CATEGORY
(
    catCd varchar(20) comment '카테고리 코드',
    catNm varchar(20) not null comment '카테고리 명'
) charset = utf8 comment '카테고리';

CREATE TABLE PSS.CATEGORY_DETAIL
(
    catCd     varchar(20) comment '카테고리 코드',
    detailsCd varchar(20) comment '세부 카테고리 코드',
    detailsNm varchar(20) not null comment '세부 카테고리 명',
    primary key (catCd, detailsCd)
) charset = utf8 comment '세부 카테고리';

CREATE TABLE PSS.PROFILE
(
    userId          varchar(20) comment '아이디',
    profileId       varchar(20) comment '프로필 아이디',
    profilePassword varchar(20) not null comment '프로필 비밀번호',
    nickName        varchar(20) comment '닉네임',
    primary key (userId, profileId)
) charset = utf8 comment '프로필';

CREATE TABLE PSS.VIDEO
(
    detailsCd varchar(20) comment '세부 카테고리 코드',
    videoCd   varchar(20) comment '동영상 코드',
    videoNm   varchar(20) not null comment '동영상 명',
    poster    varchar(20) not null comment '포스터',
    primary key (detailsCd, videoCd)
) charset = utf8 comment '영상';

CREATE TABLE PSS.VIDEO_INFO
(
    videoCd     varchar(20) comment '동영상 코드',
    views       integer comment '조회수',
    playTime    integer comment '재생시간',
    insDtm      date comment '등록 날짜',
    openingDate date comment '개봉일',
    score       long comment '평점',
    summary     varchar(200) comment '줄거리',
    primary key (videoCd)
) charset = utf8 comment '영상 정보';

CREATE TABLE PSS.ACTOR
(
    actorCd varchar(20) comment '배우 코드',
    actorNm varchar(20) not null comment '배우 명',
    image   varchar(30) not null comment '이미지',
    primary key (actorCd)
) charset = utf8 comment '배우';

CREATE TABLE PSS.VIDEO_CAST
(
    videoCd   varchar(20) comment '동영상 코드',
    actorCd   varchar(20) comment '배우 코드',
    inActorNm varchar(20) not null comment '작중 이름',
    primary key (videoCd, actorCd)
) charset = utf8 comment '출연진 정보';

CREATE TABLE PSS.VIDEO_REPLY
(
    videoCd   varchar(20) not null comment '비디오 코드',
    profileId varchar(20) not null comment '프로필 아이디',
    replyCd   varchar(20) comment '댓글 코드',
    reply     varchar(40) comment '댓글 내용',
    primary key (reply)
) charset = utf8 comment '댓글';

CREATE TABLE PSS.VIDEO_NESTED_REPLY
(
    videoCd       varchar(20) not null comment '비디오 코드',
    profileId     varchar(20) not null comment '프로필 아이디',
    replyCd       varchar(20) comment '댓글 코드',
    nestedReplyCd varchar(20) comment '대댓글 코드',
    nestedReply   varchar(40) comment '대댓글 내용',
    primary key (replyCd, nestedReply)
) charset = utf8 comment '대댓글';