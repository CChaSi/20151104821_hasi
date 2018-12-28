package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.DBUtil;

public class UserGuanli {
	public boolean login(String name, String pwd) {
		boolean flag = false;
		try {
			    DBUtil.init();
				ResultSet rs = DBUtil.selectSql("select * from guanli where name='"+name+"' and pwd='"+pwd+"'");
				while(rs.next()){
					if(rs.getString("name").equals(name) && rs.getString("pwd").equals(pwd)){
						flag = true;
					}
				}
				DBUtil.closeConn();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
}
