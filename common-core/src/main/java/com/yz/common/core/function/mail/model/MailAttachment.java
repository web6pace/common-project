package com.yz.common.core.function.mail.model;

/**
 * <pre> 
 * 描述：邮件附件类
 * 作者：redxun
 * </pre>
 */
public class MailAttachment {
	
	/**
	 *  文件名
	 */
	protected String fileName;
	/**
	 *  文件路径
	 */
	protected String filePath;
	
	/**
	 * 文件数据流
	 */
	protected byte[] fileBlob;
	
	/**
	 * 邮件附件类构造方法
	 */
	public MailAttachment(){}
	
	/**
	 * 邮件附件类构造方法
	 * @param fileName	文件名
	 * @param filePath	文件全路径
	 */
	public MailAttachment(String fileName, String filePath) {
		this.fileName = fileName;
		this.filePath = filePath;
	}
	
	/**
	 * 邮件附件类构造方法
	 * @param fileName	文件名
	 * @param fileBlob	文件字节流
	 */
	public MailAttachment(String fileName, byte[] fileBlob) {
		this.fileName = fileName;
		this.fileBlob = fileBlob;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public byte[] getFileBlob() {
		return fileBlob;
	}

	public void setFileBlob(byte[] fileBlob) {
		this.fileBlob = fileBlob;
	}

}
