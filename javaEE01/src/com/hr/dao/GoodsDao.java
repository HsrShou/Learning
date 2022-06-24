package com.hr.dao;

import com.hr.entity.Goods;
import com.hr.entity.GoodsType;

import java.util.List;

public interface GoodsDao {
    List<Goods> goodList();

    List<GoodsType> getGoodsType();

    int goodAdd(Goods goods);

    int goodDel(String id);

    Goods toGoodsUpdate(String id);

    int goodsUpdate(Goods goods);
}
