package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regit")
public class RegitServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
		
//		arg0.setCharacterEncoding("UTF-8");
//		// 응답부분만 해주면 한글이 깨질수 있기 때문에
//		
//		arg1.setCharacterEncoding("UTF-8");
//		arg1.setContentType("text/html charset=UTF-8");

		arg0.setCharacterEncoding("UTF-8");
		// 응답부분만 해주면 한글이 깨질수 있기 때문에
		
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html charset=UTF-8");
		
		PrintWriter out = arg1.getWriter();
		
		String title = arg0.getParameter("title");
		String content = arg0.getParameter("content");
		// String title: 자바단
		// getParameter("title"): 프론트단
		// 이름을 동일하게 하면 헷갈리지 않는다. => DB 컬럼명도 동일하게 (DB 설계가 첫번째로)
		
		out.println(title);
		out.println(content);
	}
}
