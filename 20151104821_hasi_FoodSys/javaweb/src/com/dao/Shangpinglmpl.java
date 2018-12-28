package com.dao;

import com.entity.ShangpingBean;
import com.util.DBUtil;

public class Shangpinglmpl implements ShangpingDao {

	public boolean register(ShangpingBean user) {
		boolean flag = false;
		DBUtil.init();
		int i =DBUtil.addUpdDel("insert into shangping(name,miaoshu,price,coloer,shuoming) " +
				"values('"+user.getName()+"','"+user.getMiaoshu()+"','"+user.getPrice()+"','"+user.getColoer()+"','"+user.getShuoming()+"')");
		if(i>0){
			flag = true;
		}
		DBUtil.closeConn();
		return flag;
	}

}
