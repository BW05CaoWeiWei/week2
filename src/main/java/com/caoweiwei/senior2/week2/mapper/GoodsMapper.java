package com.caoweiwei.senior2.week2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.caoweiwei.senior2.week2.bean.Goods;

/** 
* @author 作者:曹伟伟
* @version 创建时间：2019年10月14日 上午9:10:53
* 类功能说明 
*/
public interface GoodsMapper {
	
	//list页面方法
	@Select("select * from goods")
	List<Goods> getlist(Goods goods);

}
