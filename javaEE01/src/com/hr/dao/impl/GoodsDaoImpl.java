package com.hr.dao.impl;

import com.hr.dao.GoodsDao;
import com.hr.entity.Goods;
import com.hr.entity.GoodsType;
import com.hr.util.BaseDao;

import java.util.List;

public class GoodsDaoImpl implements GoodsDao {
    BaseDao baseDao = new BaseDao();

    @Override
    public List<Goods> goodList() {
        String sql = "select *,GOODS_ID as goodsId,GOODS_NAME as goodsName,GT_ID as gtId,UNIT_PRICE as unitPrice,IMG_URL as imgUrl,g.INTRODUCE , TYPE_NAME as typeName " +
                "from goods g left join goods_type gt " +
                "on g.GT_ID = gt.TYPE_ID  order by goodsId";
        List<Goods> list =  baseDao.list(sql,Goods.class);
        return list;
    }

    @Override
    public List<GoodsType> getGoodsType() {
        String sql ="select *,TYPE_ID as typeId,TYPE_NAME as typeName " +
                " from goods_type";
        List<GoodsType> list = baseDao.list(sql,GoodsType.class);
        return list;
    }

    @Override
    public int goodAdd(Goods goods) {
        String sql = "INSERT into goods (GOODS_NAME,GT_ID,UNIT_PRICE,STOCK,IMG_URL,INTRODUCE) VALUES(?,?,?,?,?,?)";
        int out = baseDao.update(sql,goods.getGoodsName(),goods.getGtId(),goods.getUnitPrice(),goods.getStock(),goods.getImgUrl(),goods.getIntroduce());
        return out;
    }

    @Override
    public int goodDel(String id) {
        String sql = "DELETE FROM goods WHERE GOODS_ID = ?";
        int out = baseDao.update(sql,id);
        return out;
    }

    @Override
    public Goods toGoodsUpdate(String id) {
        String sql = "select *,GOODS_ID as goodsId,GOODS_NAME as goodsName,GT_ID as gtId,UNIT_PRICE as unitPrice,IMG_URL as imgUrl,g.INTRODUCE , TYPE_NAME as typeName ,TYPE_ID as typeId " +
                "from goods g left join goods_type gt " +
                "on g.GT_ID = gt.TYPE_ID  where GOODS_ID = ?";
        Goods goods =  baseDao.getOne(sql,Goods.class,id);
        return goods;
    }

    @Override
    public int goodsUpdate(Goods goods) {
        String sql = "update goods set GOODS_NAME = ?,GT_ID = ?,UNIT_PRICE  =?,STOCK =?,IMG_URL = ?,INTRODUCE = ? where GOODS_ID = ? ";
        int out = baseDao.update(sql,goods.getGoodsName(),goods.getGtId(),goods.getUnitPrice(),goods.getStock(),goods.getImgUrl(),goods.getIntroduce(),goods.getGoodsId());
        return out;
    }
}
