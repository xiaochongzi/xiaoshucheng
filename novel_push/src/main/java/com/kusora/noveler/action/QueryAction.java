package com.kusora.noveler.action;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.kusora.noveler.proto.RequestParam;
import com.kusora.noveler.resource.ContentManager;

@Path("/query")
public class QueryAction {

	Logger logger = LoggerFactory.getLogger(QueryAction.class);
	@Context HttpServletRequest request;
	static ContentManager cm = new ContentManager();

	@POST
	@Consumes({"text/plain", "application/json"})
	public String query(String params) {
		logger.info("Connection from {}, params: {}", request.getRemoteHost(), params);
		Gson gson = new Gson();
		RequestParam param = gson.fromJson(params, RequestParam.class);

		//List<String> names = formParams.get("name");
		return "hello world!" + params;
	}

}
