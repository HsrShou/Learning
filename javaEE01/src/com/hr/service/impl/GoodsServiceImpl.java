package com.hr.service.impl;

import com.hr.dao.GoodsDao;
import com.hr.dao.impl.GoodsDaoImpl;
import com.hr.entity.Goods;
import com.hr.entity.GoodsType;
import com.hr.entity.Page;
import com.hr.service.GoodsService;

import java.util.List;

/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public class GoodsServiceImpl implements GoodsService {
    GoodsDao goodsDao = new GoodsDaoImpl();

    @Override
    public List<Goods> goodsList() {
        return goodsDao.goodList();
    }

    @Override
    public List<GoodsType> getGoodsType() {
        return goodsDao.getGoodsType();
    }

    @Override
    public int goodsAdd(Goods goods) {
        return goodsDao.goodAdd(goods);
    }

    @Override
    public int goodsDel(String id) {
        return goodsDao.goodDel(id);
    }

    @Override
    public Goods toGoodsUpdate(String id) {
        return goodsDao.toGoodsUpdate(id);
    }

    @Override
    public int goodsUpdate(Goods goods) {

        return goodsDao.goodsUpdate(goods);
    }

    @Override
    public Page<Goods> goodsListPage(Integer currentPage) {
        Page<Goods> page = new Page();
//        private Integer currentPage;//当前第几页
//        private Integer pageTotal;//一共多少页
//        private List<T> data;//当前页中的数据
//        private Long count;//总共多少条记录
//        private Integer pageSize = 10;//每页多少条
        page.setCurrentPage(currentPage);//组装当前页
//        组装count 总共多少条记录
        long count = goodsDao.getCount();
        page.setCount(count);
        //组装pageTotal总页数：先去数据库查询总共多少数据 再用公式求pageTotal
//        page.getpageTotal = (32%10==0)?(32/10):((32/10)+1)
        int temp = (int) (page.getCount() / page.getPageSize());
        Integer pageTotal = page.getCount() % page.getPageSize() == 0 ? (temp) : (temp + 1);
        page.setPageTotal(pageTotal);
//      组装data数据->去数据库查数据select*from表limit?,?
//      分析了一下，sg1不用改
//      如果是第一页：limit0,1 第二页 limit 10,10
        List<Goods> list = goodsDao.goodsListPage((currentPage - 1) * 10, page.getPageSize());
        page.setData(list);
        return page;
    }

    @Override
    public Page<Goods> goodsListPageCondition(Integer currentPage, String goodsName, String gtId) {
        Page<Goods> page = new Page();
//        private Integer currentPage;//当前第几页
//        private Integer pageTotal;//一共多少页
//        private List<T> data;//当前页中的数据
//        private Long count;//总共多少条记录
//        private Integer pageSize = 10;//每页多少条
        page.setCurrentPage(currentPage);//组装当前页
//        组装count 总共多少条记录
        long count = goodsDao.getCountCon(goodsName, gtId);
        page.setCount(count);
        //组装pageTotal总页数：先去数据库查询总共多少数据 再用公式求pageTotal
//        page.getpageTotal = (32%10==0)?(32/10):((32/10)+1)
        int temp = (int) (page.getCount() / page.getPageSize());
        Integer pageTotal = page.getCount() % page.getPageSize() == 0 ? (temp) : (temp + 1);
        page.setPageTotal(pageTotal);
//      组装data数据->去数据库查数据select*from表limit?,?
//      分析了一下，sg1不用改
//      如果是第一页：limit0,1 第二页 limit 10,10
        List<Goods> list = goodsDao.goodsListPageCon(goodsName, (currentPage - 1) * 10, page.getPageSize(), gtId);
        System.out.println(list);
        page.setData(list);
        return page;
    }
}
