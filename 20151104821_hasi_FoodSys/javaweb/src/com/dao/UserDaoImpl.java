package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.User;
import com.util.DBUtil;

public class UserDaoImpl implements UserDao{
	
	public boolean register(User user) {
		boolean flag = false;
		DBUtil.init();
		int i =DBUtil.addUpdDel("insert into custormer(name,pwd,sex,age,info) " +
				"values('"+user.getName()+"','"+user.getPwd()+"','"+user.getSex()+"','"+user.getAge()+"','"+user.getInfo()+"')");
		if(i>0){
			flag = true;
		}
		DBUtil.closeConn();
		return flag;
	}
    public boolean login(String name, String pwd) {
		boolean flag = false;
		try {
			    DBUtil.init();
				ResultSet rs = DBUtil.selectSql("select * from custormer where name='"+name+"' and pwd='"+pwd+"'");
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
	public List<User> getUserAll() {
		List<User> list = new ArrayList<User>();
    	try {
		    DBUtil.init();
			ResultSet rs = DBUtil.selectSql("select * from custormer");
			while(rs.next()){
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setSex(rs.getString("sex"));
				user.setAge(rs.getString("age"));
				user.setInfo(rs.getString("info"));
				list.add(user);
			}
			DBUtil.closeConn();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean update(int id,String name, String pwd,String sex, String age,String info) {
		boolean flag = false;
		DBUtil.init();
		String sql ="update custormer set name ='"+name
				+"' , pwd ='"+pwd
				+"' , sex ='"+sex
				+"' , age ='"+age
				+"' , info ='"+info+"' where id = "+id;
		int i =DBUtil.addUpdDel(sql);
		if(i>0){
			flag = true;
		}
		DBUtil.closeConn();
		return flag;
	}
	public boolean delete(String name) {
		boolean flag = false;
		DBUtil.init();
		String sql = "delete  from cutormer where name="+name;
		int i =DBUtil.addUpdDel(sql);
		if(i>0){
			flag = true;
		}
		DBUtil.closeConn();
		return flag;
	}
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
    
}
