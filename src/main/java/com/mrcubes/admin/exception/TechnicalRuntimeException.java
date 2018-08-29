package com.mrcubes.admin.exception;

public class TechnicalRuntimeException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	 public TechnicalRuntimeException() {
	        super();
	    }
	    public TechnicalRuntimeException(String s) {
	        super(s);
	    }
	    public TechnicalRuntimeException(String s, Throwable throwable) {
	        super(s, throwable);
	    }
	    public TechnicalRuntimeException(Throwable throwable) {
	        super(throwable);
	    }
}
