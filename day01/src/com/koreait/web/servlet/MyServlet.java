package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 프론트 단(웹)에서 자바영역으로 myservlet 클래스를 호출한다.
// -> service 메서드에서 그 요청을 받기로 약속이 되어있음
// -> 약속되어있는 라이브러리를 임포트해서 사용
public class MyServlet extends HttpServlet { // Servlet의 역할을 하기위해서는 HttpServlet 추상 클래스를 상속받는다.

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
	// HttpServletRequest 요청 객체, HttpServletResponse 응답 객체
	// 사용자가 요청보낸 데이터는 request에 담기고 사용자에게 응답보낼 데이터는 response에 담긴다.
	// 사용자가 보낸 데이터를 꺼낼 때는 request에서 꺼내고 사용자에게 보여주고 싶은 데이터를 response에 담기만 하면
	// 라이브러리 안에서 알아서 사용자에게 전달한다.
			throws ServletException, IOException {
		
		// 설계된 약속에 맞춰 service 메서드 안에 작업하고 싶은 내용을 작업하면 된다.
		
		PrintWriter out = response.getWriter(); 
		// 문자열 출력 -> java io에 있는 printwriter 클래스를 가지고 객체 생성
		// response안의 getWriter메서드를 호출하여 out 객체에 할당
		out.println("Hello Servlet");
	}
	
} // -> servlet 클래스로 사용 가능
