package d_31082024;

//public class InvalidPlanException extends Exception{
public class InvalidPlanException extends RuntimeException{
	InvalidPlanException(String msg){
		super(msg);
	}
}
