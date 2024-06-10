package org.kitri.shoppingmall.dto.common.mail;

public class EmailDto {

	private String receiver;
	private String title;
	private String contents;

	public EmailDto() {}
	public EmailDto(String receiver, String sender, String title, String contents, String smtpuser,
			String smtppassword) {
		this.receiver = receiver;
		this.title = title;
		this.contents = contents;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

}
