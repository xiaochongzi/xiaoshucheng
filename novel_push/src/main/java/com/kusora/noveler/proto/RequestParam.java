package com.kusora.noveler.proto;

public class RequestParam {
	private String resourceType;
	private String resourceId;
	private String userId;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	//private 
	public static enum ResourceType {
		search, //search result , a list of novelMeta
		novelMeta, // metadata for a novel
		novelReferences, // all sources for a novel
		referenceCatalog, // a catalog list for a novel and a reference
		catalogMeta, // a catalog list for a novel
		chapterMeta, // chapter infor for a novel,reference,and chapter
		chapterReferences, // all sources for this chapter
		userMeta, // a novel list for this user, and the current chapter
		novelCountMeta
	}
}
