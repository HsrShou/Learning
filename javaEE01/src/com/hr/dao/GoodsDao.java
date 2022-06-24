package com.hr.dao;

import com.hr.entity.Goods;
import com.hr.entity.GoodsType;

import java.util.List;
/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public interface GoodsDao {
    List<Goods> goodList();

    List<GoodsType> getGoodsType();

    int goodAdd(Goods goods);

    int goodDel(String id);

    Goods toGoodsUpdate(String id);

    int goodsUpdate(Goods goods);

    List<Goods> goodsListPage(Integer currentPage, int i);

    long getCount();

    long getCountCon(String goodsName, String gtId);

    List<Goods> goodsListPageCon(String goodsName, Integer currentPage, int i, String gtId);
}
