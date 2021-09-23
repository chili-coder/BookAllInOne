package com.sohaghlab.bookallinone.model;

import java.util.ArrayList;
import java.util.List;

public class Chapter {

    String chapterName;
    List<Topic> topicList = new ArrayList<>();


    public Chapter(String chapterName, List<Topic> topicList) {
        this.chapterName = chapterName;
        this.topicList = topicList;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }
}
