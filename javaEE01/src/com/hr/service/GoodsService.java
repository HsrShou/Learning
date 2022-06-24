package com.hr.service;

import com.hr.entity.Goods;
import com.hr.entity.GoodsType;

import java.util.List;

public interface GoodsService {
    List<Goods> goodsList();

    List<GoodsType> getGoodsType();

    int goodsAdd(Goods goods);

    int goodsDel(String id);

    Goods toGoodsUpdate(String id);

    int goodsUpdate(Goods goods);
}
