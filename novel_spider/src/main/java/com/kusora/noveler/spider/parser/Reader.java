package com.kusora.noveler.spider.parser;

import java.util.Map;

public interface Reader {
	public boolean isSearchable();
	public Map<String, Map<String, String>> search(String keyword, String searchType); 
	public Map<String, Map<String, String>> searchNovel(String keyword); 
	public Map<String, Map<String, String>> searchAuthor(String keyword);
	
}
