package ExceptionTest;


public class EmptyException extends Exception{
	public EmptyException() {//creating a custom exception
		super();
	}
	
	public EmptyException(String message) {
		super(message);
	}
}