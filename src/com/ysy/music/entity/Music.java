package com.ysy.music.entity;

public class Music {
    private int musicId;
    private String name;
    private String attribute;
    private String musicUrl;

    public Music(int musicId,String name,String attribute,String musicUrl) {

        this.name=name;
        this.attribute=attribute;
        this.musicId=musicId;
        this.musicUrl=musicUrl;
    }
    public Music(String name,String attribute,String musicUrl) {

        this.name=name;
        this.attribute=attribute;
        this.musicUrl=musicUrl;
    }
    public Music(int musicId,String name,String attribute) {

        this.name=name;
        this.attribute=attribute;
        this.musicId=musicId;
    }

    @Override
    public String toString() {
        return "Music{" +
                "musicId=" + musicId +
                ", name='" + name + '\'' +
                ", attribute='" + attribute + '\'' +
                ", musicUrl='" + musicUrl + '\'' +
                '}';
    }

    public Music(String name,String attribute) {

        this.name=name;
        this.attribute=attribute;
    }

    public String getMusicUrl() {
        return musicUrl;
    }

    public void setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl;
    }

    public Music() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }
}
