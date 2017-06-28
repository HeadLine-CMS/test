package com.zzq;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.alibaba.fastjson.JSON;

/**
 * Servlet implementation class Jasonservlet
 */
@WebServlet("/Jasonservlet")
public class Jasonservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jasonservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<atudent> arrayList = new ArrayList<atudent>();
		atudent a1 = new atudent("zzq","123");
		arrayList.add(a1);
		atudent a2 = new atudent("zzq2","123456");
		arrayList.add(a2);
		String jsonString = JSON.toJSONString(arrayList);
		response.getWriter().append(jsonString);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
class atudent{
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public atudent(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
}