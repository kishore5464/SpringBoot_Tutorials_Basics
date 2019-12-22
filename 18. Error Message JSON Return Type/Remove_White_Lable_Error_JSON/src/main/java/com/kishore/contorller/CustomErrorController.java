package com.kishore.contorller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
public class CustomErrorController implements ErrorController {

	private static final String PATH = "/error";

	@Value("${debug}")
	private boolean debug;

	@Autowired
	private ErrorAttributes errorAttributes;

	@Override
	public String getErrorPath() {
		return PATH;
	}

	@RequestMapping(value = PATH)
	public Map<String, Object> error(HttpServletRequest request, WebRequest webRequest) {
		return getErrorAttributes(webRequest, true);
	}

	private Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
		return this.errorAttributes.getErrorAttributes(webRequest, includeStackTrace);
	}
}