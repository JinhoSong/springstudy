package com.display.springstudy.video.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VideoPageCriteria {
    private String videoNm;
    private String detailsCd;
    private int pageNum = 1;
    private int pageSize = 2;
}
