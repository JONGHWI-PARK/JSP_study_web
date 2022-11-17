package com.koreait.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
		
		String xStr = arg0.getParameter("x");
		String yStr = arg0.getParameter("y");
		
		System.out.println("xStr : " + xStr); // request에서 xStr을 잘 받아오는지 확인
		System.out.println("yStr : " + yStr);
		
		int x = 0;
		int y = 0;
		
		if(xStr != null && !xStr.equals("")) {
			System.out.println("x : " + x); // if문을 잘 탔는지 x 값 출력
			x = Integer.parseInt(xStr);
		}
		
		if(yStr != null && !yStr.equals("")) {
			System.out.println("y : " + y);
			y = Integer.parseInt(yStr);
		}
		
		int result = x + y;
		System.out.println("result : " + result); // result 값이 잘나오는 지 확인
		arg1.getWriter().println("result is " + result);
		
	}
}
