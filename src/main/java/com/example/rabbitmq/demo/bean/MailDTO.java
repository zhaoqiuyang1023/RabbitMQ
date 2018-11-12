package com.example.rabbitmq.demo.bean;


import java.util.ArrayList;
import java.util.List;

/**
 * Mail DTO
 *
 * @author Hanping QIAO
 * 2018-09-11 上午11:48
 **/

public class MailDTO extends Mail{
    /**
     * Mail Attachments
     */
    private List<ImageRes> inlines;
    private ArrayList<MailAttachment> attachments;

    public List<ImageRes> getInlines() {
        return inlines;
    }

    public void setInlines(List<ImageRes> inlines) {
        this.inlines = inlines;
    }

    public ArrayList<MailAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(ArrayList<MailAttachment> attachments) {
        this.attachments = attachments;
    }
}
