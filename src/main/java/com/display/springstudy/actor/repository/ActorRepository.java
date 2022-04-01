package com.display.springstudy.actor.repository;

import com.display.springstudy.actor.model.Actor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ActorRepository {
    List<Actor> selectActor(@Param("actorNm") String actorNm);
}
