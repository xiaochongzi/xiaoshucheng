package com.kusora.noveler.proto;

import com.kusora.noveler.proto.RequestParam.ResourceType;

public interface Data {
	public ResourceType getResourceType();
	public String toJson();
		
}
