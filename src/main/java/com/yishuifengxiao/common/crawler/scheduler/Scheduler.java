package com.yishuifengxiao.common.crawler.scheduler;

/**
 * 资源调度器<br/>
 * 负责资源的调度管理工作<br/>
 * 功能如下：<br/>
 * 1. 接收所有未过滤的链接资源并储存起来<br/>
 * 2. 从资源池中获取一个链接<br/>
 * 3. 清空资源调度器中所有储存的资源信息<br/>
 * 4. 获取资源调度器的名字
 * 
 * @author yishui
 * @date 2019年11月26日
 * @version 1.0.0
 */
public interface Scheduler {
	/**
	 * 接收所有的超链接并存储起来
	 * 
	 * @param urls 未过滤的超链接，可能会存在重复和已爬取等情况
	 */
	void push(String... urls);

	/**
	 * 从资源调度器里获取一个资源
	 * 
	 * @return
	 */
	String poll();

	/**
	 * 清空任务
	 */
	void clear();

	/**
	 * 资源调度器的名字，不能为空
	 * 
	 * @return
	 */
	String getName();

}
