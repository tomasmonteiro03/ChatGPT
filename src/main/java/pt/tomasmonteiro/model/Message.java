package pt.tomasmonteiro.model;

public class Message {

	private String subject;
	private String content;

	public Message() {
	}

	public Message(String subject, String content) {
		this.subject = subject;
		this.content = content;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
