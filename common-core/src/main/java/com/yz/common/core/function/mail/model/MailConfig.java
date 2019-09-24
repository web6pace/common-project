package com.yz.common.core.function.mail.model;

import java.io.Serializable;

/**
 * <pre> 
 * 描述：邮箱设置实体类
 * 作者：redxun
 * </pre>
 */
public class MailConfig implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6136301302501012892L;
	
	// 邮件服务器的IP、端口
	protected String sendHost = "smtp.exmail.qq.com";
	protected String sendPort = "465";
	
	// 邮件接收服务器的IP、端口和协议
	protected String receiveHost;
	protected String receivePort;
	protected String protocal;

	// 是否是SSL
	protected Boolean SSL = false ;

	// 是否需要身份验证
	protected Boolean validate = true ;

	// 登陆邮件服务器的用户名和密码
	protected String mailAddress = "server@yuepong.com";
	protected String password = "yPL98N2G)&a@q";
	
	// 用户昵称
	protected String nickName = "悦朋科技";
	
	// 是否收取附件
	protected Boolean isHandleAttach = true;
	
	// 是否删除服务器上的邮件
	protected Boolean isDeleteRemote = false ;
	
	public final static String SMTP_PROTOCAL = "smtp";
	public final static String POP3_PROTOCAL = "pop3";
	public final static String IMAP_PROTOCAL = "imap";

	public Boolean getSSL() {
		return SSL;
	}

	public void setSSL(Boolean SSL) {
		this.SSL = SSL;
	}

	public Boolean getValidate() {
		return validate;
	}

	public void setValidate(Boolean validate) {
		this.validate = validate;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProtocal() {
		return protocal;
	}

	public void setProtocal(String protocal) {
		this.protocal = protocal;
	}

	public String getReceiveHost() {
		return receiveHost;
	}

	public void setReceiveHost(String receiveHost) {
		this.receiveHost = receiveHost;
	}

	public String getReceivePort() {
		return receivePort;
	}

	public void setReceivePort(String receivePort) {
		this.receivePort = receivePort;
	}

	public Boolean getIsHandleAttach() {
		return isHandleAttach;
	}

	public void setIsHandleAttach(Boolean isHandleAttach) {
		this.isHandleAttach = isHandleAttach;
	}

	public String getSendHost() {
		return sendHost;
	}

	public void setSendHost(String sendHost) {
		this.sendHost = sendHost;
	}

	public String getSendPort() {
		return sendPort;
	}

	public void setSendPort(String sendPort) {
		this.sendPort = sendPort;
	}

	public Boolean getIsDeleteRemote() {
		return isDeleteRemote;
	}

	public void setIsDeleteRemote(Boolean isDeleteRemote) {
		this.isDeleteRemote = isDeleteRemote;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	
	@Override
	public String toString() {
		return "MailSeting [sendHost=" + sendHost + ", sendPort=" + sendPort
				+ ", receiveHost=" + receiveHost + ", receivePort="
				+ receivePort + ", protocal=" + protocal + ", SSL=" + SSL
				+ ", validate=" + validate + ", mailAddress=" + mailAddress
				+ ", password=" + password + ", nickName=" + nickName
				+ ", isHandleAttach=" + isHandleAttach + ", isDeleteRemote="
				+ isDeleteRemote + "]";
	}
}