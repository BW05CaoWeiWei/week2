package com.caoweiwei.senior2.week2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caoweiwei.senior2.week2.bean.Goods;
import com.caoweiwei.senior2.week2.mapper.GoodsMapper;
import com.caoweiwei.senior2.week2.service.GoodsService;

/** 
* @author 作者:曹伟伟
* @version 创建时间：2019年10月14日 上午9:11:06
* 类功能说明 
*/
@Service
public class GoodsServiceImpl implements GoodsService{
	
	//注入
	@Autowired
	private GoodsMapper goodsMapper;
	
	//list页面方法
	@Override
	public List<Goods> getlist(Goods goods) {
		// TODO Auto-generated method stub
		return goodsMapper.getlist(goods);
	}
	
	
}
