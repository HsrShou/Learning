package com.hr.service;

import com.hr.entity.Goods;
import com.hr.entity.GoodsType;
import com.hr.entity.Page;

import java.util.List;

/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public interface GoodsService {
    List<Goods> goodsList();

    List<GoodsType> getGoodsType();

    int goodsAdd(Goods goods);

    int goodsDel(String id);

    Goods toGoodsUpdate(String id);

    int goodsUpdate(Goods goods);

    Page<Goods> goodsListPage(Integer currentPage);

    Page<Goods> goodsListPageCondition(Integer currentPage, String goodsName, String gtId);
}
