package com.ysy.music.entity;

public class Page {
    private final Integer pageIndex;  //页码
    private final Integer pageSize;   //页大小 显示多少行数据
    private Integer allCounts;    //数据的总行数
    private Integer allPages; //总页数
    private Integer startRows;  //起始行
    public Page(Integer pageIndex){
        this(pageIndex, 5);
    }
    public Page(Integer pageIndex,Integer pageSize){
        this.pageIndex=pageIndex;
        this.pageSize=pageSize;
        this.setStartRows((pageIndex-1)*pageSize);
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", allCounts=" + allCounts +
                ", allPages=" + allPages +
                ", startRows=" + startRows +
                '}';
    }

    public Integer getAllPages() {
        return allPages;
    }

    public void setAllPages(Integer allPages) {
        this.allPages = allPages;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getAllCounts() {
        return allCounts;
    }

    public void setAllCounts(Integer allCounts) {
        this.allCounts = allCounts;

        this.setAllPages(this.allCounts%this.pageSize==0?this.allCounts/this.pageSize:this.allCounts/this.pageSize+1);
    }

    public Integer getStartRows() {
        return startRows;
    }

    public void setStartRows(Integer startRows) {
        this.startRows = startRows;
    }
}
