package com.display.springstudy.actor.service;


import com.display.springstudy.actor.model.Actor;
import com.display.springstudy.actor.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorService {

    private final ActorRepository actorRepository;

    public List<Actor> getActor(String actorNm){
        return actorRepository.selectActor(actorNm);
    }
}
