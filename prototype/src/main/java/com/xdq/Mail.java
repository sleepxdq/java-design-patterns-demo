package com.xdq;

import lombok.Data;

/**
 * Author: 徐东强
 * Date: 2018/8/28 下午2:01
 * Description:
 **/
@Data
public class Mail implements Cloneable{
    private String receiver;
    private String subject;
    private String appellation;
    private String context;
    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }

    @Override
    public Mail clone(){
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
