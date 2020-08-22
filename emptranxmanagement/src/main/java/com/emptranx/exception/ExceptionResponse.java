package com.emptranx.exception;

class ExceptionResponse {
	
	private String errMessage;
	private String requestedUri;
	
	public String getErrMessage() {
		return errMessage;
	}
	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	public String getRequestedUri() {
		return requestedUri;
	}
	public void setRequestedUri(String requestedUri) {
		this.requestedUri = requestedUri;
	}
	
}
