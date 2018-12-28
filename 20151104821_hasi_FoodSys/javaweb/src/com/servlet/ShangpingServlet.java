package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ShangpingDao;
import com.dao.Shangpinglmpl;
import com.entity.ShangpingBean;


/**
 * Servlet implementation class shangpingServlet
 */
public class ShangpingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShangpingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String miaoshu = request.getParameter("miaoshu");
		String price = request.getParameter("price");
		String coloer= request.getParameter("coloer");
		String shuoming = request.getParameter("shuoming");
		
		
		ShangpingBean use = new ShangpingBean();
		use.setName(name);
		use.setMiaoshu(miaoshu);
		use.setPrice(price);
		use.setColoer(coloer);
		use.setShuoming(shuoming);
		
		ShangpingDao ud = new Shangpinglmpl();
		
		if(ud.register(use)){
			request.setAttribute("username", name);
			//request.setAttribute("xiaoxi", "注册成功");
			request.getRequestDispatcher("denglu.jsp").forward(request, response);
		}else{
			
			response.sendRedirect("index.jsp");
		}
	}

}
