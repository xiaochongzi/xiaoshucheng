package com.kusora.noveler.spider;

import java.io.IOException;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupSpider implements Spider {

	@Override
	public Document grab(String url, Map<String, String> params) {
		Connection conn = Jsoup.connect(url).userAgent("I ’ m jsoup") // User-Agent
				.cookie("auth", "token") // 设置 cookie
				.timeout(3000); // 设置连接超时时间
		try {
			if (params == null || params.isEmpty()) {
				return conn.get();
			} else {
				return conn.data(params).post();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
