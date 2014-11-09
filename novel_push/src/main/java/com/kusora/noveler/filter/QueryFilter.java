package com.kusora.noveler.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public class QueryFilter implements ContainerRequestFilter{

	@Override
	public void filter(ContainerRequestContext requestContext)
			throws IOException {
		//filter the blacklist ips
		final SecurityContext sc = requestContext.getSecurityContext();
		if (sc == null) {
			requestContext.abortWith(
					Response.status(Response.Status.UNAUTHORIZED).entity("user has no access").build());
		}
	} 

}
