package com.yz.common.core.function.mail.model;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre> 
 * 描述：邮件实体类
 * 作者：redxun
 * </pre>
 */
public class Mail implements Serializable{
	
	private static final long serialVersionUID = 4311266253309771066L;
	/**
	 * 每种邮箱中，邮件的唯一ID
	 */
	protected String messageId ;
	/**
	 * 发件人显示名
	 */
	protected String senderName ;
	/**
	 * 发件人地址
	 */
	protected String senderAddress;
	/**
	 * 邮件主题
	 */
	protected String subject;
	/**
	 * 邮件内容
	 */
	protected String content;
	/**
	 * 发送时间
	 */
	protected Date sendDate ;
	/**
	 * 收件人显示名
	 */
	protected String receiverName ;
	/**
	 * 收件人地址
	 */
	protected String receiverAddresses;
	/**
	 * 抄送人显示名
	 */
	protected String copyToName ;
	/**
	 * 抄送人地址
	 */
	protected String copyToAddresses;
	/**
	 * 暗送人显示名
	 */
	protected String bccName ;
	/**
	 * 暗送人地址
	 */
	protected String bcCAddresses;
	
	/**
	 * 模版路径
	 */
	private String template="";
	/**
	 * 表单变量。
	 */
	private Map<String,Object> vars=new HashMap<String, Object>();
	
	/**
	 * 添加变量。
	 * @param key
	 * @param val
	 */
	public void addVar(String key,Object val){
		vars.put(key, val);
	}
	
	
	
	/**
	 * 邮件附件
	 */
	protected List<MailAttachment> attachments = new ArrayList<MailAttachment>();
	
	public String getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) throws UnsupportedEncodingException {
		subject = new String(subject.getBytes( "UTF-8"));
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) throws UnsupportedEncodingException {
		content = new String(content.getBytes( "UTF-8"));
		this.content = content;
	}
	public String getBcCAddresses() {
		return bcCAddresses;
	}
	public void setBcCAddresses(String bcCAddresses) {
		this.bcCAddresses = bcCAddresses;
	}
	public List<MailAttachment> getMailAttachments() {
		return attachments;
	}
	public void setMailAttachments(List<MailAttachment> attachments) {
		this.attachments = attachments;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getCopyToName() {
		return copyToName;
	}
	public void setCopyToName(String copyToName) {
		this.copyToName = copyToName;
	}
	public String getBccName() {
		return bccName;
	}
	public void setBccName(String bccName) {
		this.bccName = bccName;
	}
	public String getCopyToAddresses() {
		return copyToAddresses;
	}
	public void setCopyToAddresses(String copyToAddresses) {
		this.copyToAddresses = copyToAddresses;
	}
	public String getReceiverAddresses() {
		return receiverAddresses;
	}
	public void setReceiverAddresses(String receiverAddresses) {
		this.receiverAddresses = receiverAddresses;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public Map<String, Object> getVars() {
		return vars;
	}
	public void setVars(Map<String, Object> vars) {
		this.vars = vars;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
		
		result = prime
				* result
				+ ((receiverAddresses == null) ? 0 : receiverAddresses
						.hashCode());
		result = prime * result
				+ ((receiverName == null) ? 0 : receiverName.hashCode());
		result = prime * result
				+ ((sendDate == null) ? 0 : sendDate.hashCode());
		result = prime * result
				+ ((senderAddress == null) ? 0 : senderAddress.hashCode());
		result = prime * result
				+ ((senderName == null) ? 0 : senderName.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Mail [messageId=" + messageId + ", senderName=" + senderName
				+ ", senderAddress=" + senderAddress + ", subject=" + subject
				+ ", content=" + content + ", sendDate=" + sendDate
				+ ", receiverName=" + receiverName + ", receiverAddresses="
				+ receiverAddresses + ", copyToName=" + copyToName
				+ ", copyToAddresses=" + copyToAddresses + ", bccName="
				+ bccName + ", bcCAddresses=" + bcCAddresses + ", attachments="
				+ attachments + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Mail)) return false;
		Mail other = (Mail) obj;
		
		if (receiverAddresses == null) {
			if (other.receiverAddresses != null)
				return false;
		} else if (!receiverAddresses.equals(other.receiverAddresses))
			return false;
		
		if (senderAddress == null) {
			if (other.senderAddress != null)
				return false;
		} else if (!senderAddress.equals(other.senderAddress))
			return false;
		if (senderName == null) {
			if (other.senderName != null)
				return false;
		} else if (!senderName.equals(other.senderName))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
	
	
}