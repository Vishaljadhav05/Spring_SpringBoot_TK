package in.vj.advice;

import java.time.LocalDateTime;

// It is not necessary to create separate class , it is a good practice.

public class ErrorDetails {
	private String statusCode;

	private String msg;

	private LocalDateTime dateTime;

	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorDetails(String statusCode, String msg, LocalDateTime dateTime) {
		super();
		this.statusCode = statusCode;
		this.msg = msg;
		this.dateTime = dateTime;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

}
