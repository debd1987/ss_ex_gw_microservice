package com.ss.gw.filters;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ZuulLoggingFilter extends ZuulFilter {
	private static String PRE_FILTER_TYPE = "pre";

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		return PRE_FILTER_TYPE;
	}

	@Override
	public Object run() {
		final HttpServletRequest request = RequestContext.getCurrentContext().getRequest();

		log.info("Request .{} , Request URI . {}", request, request.getRequestURI());

		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}
}
