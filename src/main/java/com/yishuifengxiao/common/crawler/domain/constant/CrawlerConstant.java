package com.yishuifengxiao.common.crawler.domain.constant;

/**
 * 爬虫常量类
 * 
 * @author yishui
 * @date 2019年11月28日
 * @version 1.0.0
 */
public final class CrawlerConstant {
	/**
	 * 已经下载完成的URL的集合
	 */
	public final static String HAS_DOWN = "HAS_DOWN_";

	/**
	 * 已经解析过的URL的集合
	 */
	public final static String HAS_CRAWLERED = "HAS_CRAWLERED_";
	
	/**
	 * 等待下载的URL的集合
	 */
	public final static String WAIT_DOWN = "WAIT_DOWN_";

	/**
	 * 所有请求的请求的集合
	 */
	public final static String REQUEST_HOSTORY = "REQUEST_HOSTORY_";

	/**
	 * 提取时出现多条数据拼接的标识符
	 */
	public final static String SEPARATOR = "[@<yishui>@]";

	/**
	 * 左斜杠
	 */
	public final static String LEFT_SALASH = "/";
}
