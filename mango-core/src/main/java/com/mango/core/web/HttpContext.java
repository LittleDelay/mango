package com.mango.core.web;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 * @author : xs.Liu
 * @date: 2020-12-01
 */
public class HttpContext {

	private static String UNKNOWN = "unKnown";

	/**
	 * 获取IP.
	 * @return
	 */
	public static String getIp() {
		HttpServletRequest request = HttpContext.getRequest();
		String ip = request.getHeader("X-Forwarded-For");
		if (StringUtils.isNotEmpty(ip) && !UNKNOWN.equalsIgnoreCase(ip)) {
			// 多次反向代理后会有多个ip值,第一个ip才是真实ip
			int index = ip.indexOf(",");
			if (index != -1) {
				return ip.substring(0, index);
			} else {
				return ip;
			}
		}
		ip = request.getHeader("X-Real-IP");
		if (StringUtils.isNotEmpty(ip) && ! UNKNOWN.equalsIgnoreCase(ip)) {
			return ip;
		}
		return request.getRemoteAddr();
	}

	/**
	 * 获取HttpServletRequest
	 * @return
	 */
	public static HttpServletRequest getRequest() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes();
		if (requestAttributes == null) {
			return null;
		} else {
			return requestAttributes.getRequest();
		}
	}

	/**
	 * 获取HttpServletResponse
	 * @return
	 */
	public static HttpServletResponse getResponse() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes();
		if (requestAttributes == null) {
			return null;
		} else {
			return requestAttributes.getResponse();
		}
	}

	/**
	 *
	 * @return
	 */
	public static Map<String, String> getRequestParameters() {
		HashMap<String, String> values = new HashMap<>(8);
		HttpServletRequest request = HttpContext.getRequest();
		if (request == null) {
			return values;
		}
		Enumeration enums = request.getParameterNames();
		while (enums.hasMoreElements()) {
			String paramName = (String) enums.nextElement();
			String paramValue = request.getParameter(paramName);
			values.put(paramName, paramValue);
		}
		return values;
	}

}
