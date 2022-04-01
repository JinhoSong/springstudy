package com.display.springstudy.actor.rest;

import com.display.springstudy.actor.model.Actor;
import com.display.springstudy.actor.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/rest/actor")
@RequiredArgsConstructor
public class ActorRestController {

    private final ActorService actorService;

    @GetMapping
    public List<Actor> getActor(@RequestParam("actorNm") String actorNm){
        return actorService.getActor(actorNm);
    }
}
