package org.uncertweb.aquacrop;

public class AquaCropException extends Exception {
	
	private static final long serialVersionUID = -7162388318983129934L;

	public AquaCropException() {
		super();
	}
	
	public AquaCropException(String message) {
		super(message);
	}
	
	public AquaCropException(Throwable cause) {
		super(cause);
	}
	
	public AquaCropException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
