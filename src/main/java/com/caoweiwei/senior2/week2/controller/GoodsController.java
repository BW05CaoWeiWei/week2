package com.caoweiwei.senior2.week2.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.caoweiwei.senior2.week2.bean.Goods;
import com.caoweiwei.senior2.week2.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/** 
* @author 作者:曹伟伟
* @version 创建时间：2019年10月14日 上午9:10:42
* 类功能说明 
*/
@Controller
public class GoodsController {
	//注入
	@Autowired
	private GoodsService goodsService;
	//list页面
	@RequestMapping("list.do")
	public String getlist(Goods goods,HttpServletRequest request,@RequestParam(defaultValue = "1")int pageNum) {
		PageHelper.startPage(pageNum, 10);
		List<Goods> list=goodsService.getlist(goods);
		PageInfo<Goods> page=new PageInfo<Goods>(list);
		request.setAttribute("list", list);
		request.setAttribute("p", page);
		request.setAttribute("goods", goods);
		
		return "list";
	}
}
