package com.koreait.web.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*") 
// url을 설정해줘야 필터를 적용시킬 수 있다. url 요청이 왔을 때만 이 클래스가 캐치가 된다.
// 모든 요청에 대해서 처리를 하고 싶으면 '/*'을 사용한다. -> 공통적인 요소를 처리할 때
public class CharacterEncodingFilter implements Filter{

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		arg0.setCharacterEncoding("UTF-8");
		
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html charset=UTF-8");
		
//		System.out.println("before filter");
		// filterChain으로 다음 작업 진행 여부를 정한다.
		arg2.doFilter(arg0, arg1);
//		System.out.println("after filter");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
