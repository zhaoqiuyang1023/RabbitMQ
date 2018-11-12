package com.example.rabbitmq.demo.bean;


import java.io.Serializable;
import java.util.Date;


/**
 * mail table
 *
 * @author Hanping QIAO
 * @date 2018-09-04 11:42:36
 */

public class Mail  implements  Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */

    private Long id;
    /**
     * 邮件发送方
     */
    private String from;
    /**
     * 邮件接收方
     */
    private String to;
    /**
     * 邮件抄送方
     */
    private String cc;
    /**
     * 邮件密送方
     */
    private String bcc;
    /**
     * 邮件主题
     */
    private String subject;
    /**
     * 邮件内容
     */
    private String html;
    /**
     * 邮件状态
     */

    /**
     * 邮件发送时间
     */
    private Date sendTime;
    /**
     * 邮件接收到时间
     */
    private Date receiveTime;
    /**
     * 邮件创建时间
     */
    private Date createTime;
    /**
     * 邮件更新时间
     */
    private Date updateTime;
    /**
     * 邮件错误信息
     */
    private String error;


    /**
     * primary key
     */

}
