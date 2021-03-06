package com.yishuifengxiao.common.crawler.downloader;

import com.yishuifengxiao.common.crawler.domain.entity.Page;
import com.yishuifengxiao.common.crawler.domain.model.SiteRule;
import com.yishuifengxiao.common.tool.exception.ServiceException;

/**
 * 网页下载器<br/>
 * 负责根据指定的站点规则从指定的地址下载出网页内容
 * 
 * @author yishui
 * @date 2019年11月20日
 * @version 1.0.0
 */
public interface Downloader {
	/**
	 * 下载对应的请求资源
	 * 
	 * @param siteRule 站点规则信息
	 * @param url      需要下载的网页的地址
	 * @return 网页对象
	 * @throws ServiceException
	 */
	Page down(final SiteRule siteRule, final String url) throws ServiceException;

	/**
	 * 关闭下载器以释放资源
	 */
	void close();
}
