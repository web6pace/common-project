package com.yz.common.core.function.mail.model;

/**
 * <pre> 
 * 描述：邮件自定义显示名及邮件地址辅助类
 * 作者：redxun
 * </pre>
 */
public class MailAddress {
	
	protected String address = "";

	protected String name = "";

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MailAddress() {

	}

	public MailAddress(String address, String name) {
		this.address = address;
		this.name = name;
	}
}
