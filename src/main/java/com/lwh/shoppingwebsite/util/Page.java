package com.lwh.shoppingwebsite.util;

/**
 * @Author : lwh
 * @Create : 2022/3/4
 * @Version:2022-03 -04-1
 */
//分页
public class Page {
    private int pageCount;//一页数量
    private int totalCount;//总数量
    private int PageNumber;//总共多少页

    public Page(int pageCount, int totalCount) {
        this.pageCount=pageCount;
        this.totalCount=totalCount;
        this.PageNumber=this.totalCount%this.pageCount==0?this.totalCount/this.pageCount:this.totalCount/this.pageCount+1;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }

    public Page() {
        super();
    }
}
