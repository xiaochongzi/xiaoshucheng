package com.kusora.noveler.spider;

import java.util.Map;
import org.jsoup.nodes.Document;

public interface Spider {
	public Document grab(String url, Map<String, String> params);
}
