package com.kusora.noveler.application;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
 
@ApplicationPath("/")
public class NovelApplication extends ResourceConfig{
    public NovelApplication(){
        packages("com.kusora.noveler.action");
    	// here start jetty
    }
}
