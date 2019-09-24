package com.yz.common.core.function.mail;
/**
 * @Description:邮件使用范例
 * @Created with IntelliJ IDEA.
 * @User: conglj
 * @Date: 2019/9/24  8:24
 */

import com.yz.common.core.function.mail.model.Mail;
import com.yz.common.core.function.mail.model.MailConfig;

/**
 *@ClassName MailTest
 *@Description TODO
 *@Author cong
 *@Date 2019/9/24 8:24
 **/

public class MailTest {

    public static void main(String[] args) throws Exception {

        MailConfig mailConfig = new MailConfig();
        mailConfig.setSSL(true);
        mailConfig.setProtocal(MailConfig.SMTP_PROTOCAL);
        MailTools mailTools = new MailTools(mailConfig);
        Mail mail = new Mail();
        mail.setReceiverAddresses("2807918541@qq.com");
        mail.setReceiverAddresses("2807918541@qq.com,254631011@qq.com");
        mail.setSubject("异常通知");
        mail.setContent("<h1>测试</h1>");
        mailTools.send(mail);

    }

}
