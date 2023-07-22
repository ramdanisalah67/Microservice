package com.example.demo.Filter;

import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import ch.qos.logback.classic.Logger;
import io.micrometer.core.ipc.http.HttpSender.Request;
import jakarta.servlet.http.HttpServletRequest;

public class zuulFilter extends ZuulFilter{
	  private static final Logger logger = (Logger) LoggerFactory.getLogger(zuulFilter.class);
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = (HttpServletRequest) ctx.getCurrentContext() ;
		logger.info(request+"-------------");
		return null;
	}
	
	
	

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
