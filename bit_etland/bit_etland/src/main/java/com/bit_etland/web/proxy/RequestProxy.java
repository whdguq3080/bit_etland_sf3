package com.bit_etland.web.proxy;

import javax.servlet.http.HttpServletRequest;


public class RequestProxy implements Proxy {
	private HttpServletRequest request;
	@Override
	public void carryOut(Object o) {
		System.out.println("-----3------");
		if((HttpServletRequest) o != null ) {
			System.out.println("RequestProxy o 가 널 임");
			setRequest((HttpServletRequest) o);
		}else {
		System.out.println("RequestProxy o 가 널 아님");
		}
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
}
