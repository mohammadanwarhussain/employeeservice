package com.employeeservice.response.success;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomSuccessResponse {
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime timestamp;
    
	private String status = "success";

    private Object message;

    private int statusCode = 200;
    
    public CustomSuccessResponse() {
		// TODO Auto-generated constructor stub	
	}
    
    public CustomSuccessResponse(String message) {
		// TODO Auto-generated constructor stub
    	this.setTimestamp(LocalDateTime.now());
    	this.message = message;	
	}
    
    public LocalDateTime getTimestamp() {
		return timestamp;
	}

    public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

    public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		
		this.message = message;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	

}
