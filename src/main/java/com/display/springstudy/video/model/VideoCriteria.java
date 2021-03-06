package com.display.springstudy.video.model;

import com.display.springstudy.video.model.cast.VideoCast;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class VideoCriteria {

    private String detailsCd;
    private String videoUrl;
    private String videoNm;
    private String poster;

    private List<VideoCast> videoCastList;

    private LocalDateTime openingDate;
    private int score;
    private String summary;



}
