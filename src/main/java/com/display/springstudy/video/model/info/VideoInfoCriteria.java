package com.display.springstudy.video.model.info;

import com.display.springstudy.video.model.cast.VideoCast;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class VideoInfoCriteria {

    private String detailsCd;
    private String videoNm;
    private String poster;
    private String videoUrl;

    private int score;
    private String summary;
    private LocalDateTime openingDate;
    private LocalDateTime insDtm;

    private List<VideoCast> videoCastList;
}
