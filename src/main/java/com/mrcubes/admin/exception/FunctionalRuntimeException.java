package com.mrcubes.admin.exception;

public class FunctionalRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	 public FunctionalRuntimeException() {
	        super();
	    }
	    public FunctionalRuntimeException(String s) {
	        super(s);
	    }
	    public FunctionalRuntimeException(String s, Throwable throwable) {
	        super(s, throwable);
	    }
	    public FunctionalRuntimeException(Throwable throwable) {
	        super(throwable);
	    }
}
