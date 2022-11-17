package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello") 
// 어노테이션을 선언만해주면 MyServlet이 서블릿 대상클래스로 인식되어 별도의 세팅없이 사용가능 (web.xml)
// "/hello" -> 사용자가 요청하는 URL
public class MyServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
		
		arg1.setCharacterEncoding("UTF-8");	// 한글이 나타나게 Response를 인코딩하기
		arg1.setContentType("text/html charset=UTF-8");	// 한글이 깨지지않게 Response의 내용의 type을 설정하기
		// 브라우저에 응답을 던져줄 때, 한글을 맞춰서 던져주기 위해 설정
		// 한글이 깨지는 이유 : UTF-8이라는 인코딩 방식이 브라우저와 내가 던져줄 때의 인코딩 방식이 다 틀어졌을 가능성이 높아서
		
		String paramCnt = arg0.getParameter("cnt");
		System.out.println("paramCnt : " + paramCnt);
		int cnt = 0;
		
		// 예외처리
		if(paramCnt != null && !paramCnt.equals("")) {
			cnt = Integer.parseInt(paramCnt);
		} else {
			cnt = 100;
		}
		
		// 요청객체에서 꺼내오기
		// int cnt = arg0.getParameter("cnt"); 에러가 나는 이유 : 브라우저 영역에서 넘어오는 것은 다 string 타입으로 넘어오기 때문 	/ 특정 key값을 통해 Request로 들어온 value값을 반환하기
		//int cnt = Integer.parseInt(arg0.getParameter("cnt")); // int 타입으로 변환 후 int 타입에 넣어준다. / 문자열로 반환되므로 타 타입으로 바꿀 필요가 있음
		// ?cnt=3 -> cnt(key값)를 기점으로 해서 parameter를 get해오면 value인 3이 담기게됨
		
		System.out.println("cnt : " + cnt);
		
		PrintWriter out = arg1.getWriter();
		out.println("Hello Servlet Annotation!!!<br>"); // jsp에서는 줄바꿈을 하려면 <br>태그를 붙여준다.
		out.println("안녕 Servlet Annotation!!!");
	}
	// service + alt + space 자동완성으로 생성가능
}
