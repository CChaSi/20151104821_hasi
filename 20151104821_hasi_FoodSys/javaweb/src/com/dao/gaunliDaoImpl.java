package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.entity.User;
import com.util.DBUtil;

public class gaunliDaoImpl implements UserDao{
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

	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<User> getUserAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(int id, String name, String pwd, String sex, String age, String info) {
		// TODO Auto-generated method stub
		return false;
	}
}
