package com.hr.entity;
/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */

import java.util.List;

public class Page<T> {
    private Integer currentPage;//当前第几页
    private Integer pageTotal;//一共多少页
    private List<T> data;//当前页中的数据
    private Long count;//总共多少条记录
    private Integer pageSize = 10;//每页多少条

    @Override
    public String toString() {
        return "Page{" +
                "currentPage=" + currentPage +
                ", pageTotal=" + pageTotal +
                ", data=" + data +
                ", count=" + count +
                ", pageSize=" + pageSize +
                '}';
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    /*
     *  总页数：
     *   假设我们有30条记录，每页10条，我们应该有3页
     *   总页数=总记录数%每页多少条==0?总记录数/每页多少条:(总记录数/每页多少条+1)
     *     pageTotal = (32%10==0)?(32/10):((32/10)+1)
     * */
}
