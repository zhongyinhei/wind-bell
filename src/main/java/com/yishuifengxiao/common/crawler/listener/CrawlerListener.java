package com.yishuifengxiao.common.crawler.listener;

import com.yishuifengxiao.common.crawler.Task;
import com.yishuifengxiao.common.crawler.domain.entity.Page;

/**
 * 风铃虫处理事件监听器
 * 
 * @author yishui
 * @date 2019年11月28日
 * @version 1.0.0
 */
public interface CrawlerListener {

	/**
	 * 下载页面失败的消息
	 * 
	 * @param task 当前任务信息
	 * @param page 原始的页面信息
	 * @param e    失败的原因
	 */
	void onDownError(final Task task, final Page page, Exception e);

	/**
	 * 下载页面成功的消息
	 * 
	 * @param task 当前任务信息
	 * @param page 原始的页面信息
	 */
	void onDownSuccess(final Task task, final Page page);

	/**
	 * 解析页面失败的消息
	 * 
	 * @param task 当前任务信息
	 * @param page 原始的页面信息
	 * @param e    失败的原因
	 */
	void onExtractError(final Task task, final Page page, Exception e);

	/**
	 * 解析页面成功的消息
	 * 
	 * @param task 当前任务信息
	 * @param page 原始的页面信息
	 */
	void onExtractSuccess(final Task task, final Page page);

}
