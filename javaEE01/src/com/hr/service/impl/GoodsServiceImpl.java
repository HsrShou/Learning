package com.hr.service.impl;

import com.hr.dao.GoodsDao;
import com.hr.dao.impl.GoodsDaoImpl;
import com.hr.entity.Goods;
import com.hr.entity.GoodsType;
import com.hr.service.GoodsService;

import java.util.List;

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
}
