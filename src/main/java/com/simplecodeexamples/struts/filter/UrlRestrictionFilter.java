package com.simplecodeexamples.struts.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class UrlRestrictionFilter implements Filter{
	
	private List<String> excludedUrls;
	private static final String PARAM_ENABLED = "enabled";
	private static final String USER_AGENT = "User-Agent";
	private static final String REFERRER = "Referer";
	private boolean enabled;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		String e = filterConfig.getInitParameter(PARAM_ENABLED);
		enabled = !(e != null && e.equalsIgnoreCase("false"));
		excludedUrls = new ArrayList<String>();
		excludedUrls.add("/systemTime.do");
	
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		String url = httpServletRequest.getServletPath();
		
		if (isEnabled() && !excludedUrls.contains(url)) {
			String referer = httpServletRequest.getHeader(REFERRER);
			String userAgent = httpServletRequest.getHeader(USER_AGENT);
			System.out.println("referer: "+referer);	
			System.out.println("userAgent: "+userAgent);	

		}
		filterChain.doFilter(request, response);
	}

	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public void destroy() {
		excludedUrls=null;
	}

}
