package com.example.rabbitmq.demo.bean;



import java.io.Serializable;
import java.util.Date;

/**
 * mail attachment
 *
 * @author Hanping QIAO
 * @date 2018-09-10 16:39:07
 */

public class MailAttachment  {
	private static final long serialVersionUID = 1L;

	/**
	 * 邮件附件ID
	 */

	private Long id;
	/**
	 * 文件名称
	 */
	private String fileName;
	/**
	 * 文件路径
	 */
	private String filePath;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 删除时间
	 */
	private Date deleteTime;
	/**
	 * 
	 */
	private Long maiId;

  /**
   * primary key
   */

}
