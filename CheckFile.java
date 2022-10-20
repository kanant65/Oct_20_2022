package ExceptionTest;
import java.util.Map;
import java.util.HashMap;

public class CheckFile {


	  public static void main(String[] args) {

	        HashMap<String, String> studentFiles = new HashMap<>();
	        studentFiles.put("Abhishek", "Program.java");
	        studentFiles.put("Anant", "");
	        studentFiles.put("Elon", "MyCode.txt");
	        studentFiles.put("Aryan", "JavaProgram.java");
	        
	        int i=0; 
	         
	        for (Map.Entry<String, String> e : studentFiles.entrySet()) {
	        	
	        	
	        	
	        	try 
	        	{   
		        	int point=checkFileExtension(e.getValue());//checking file type with checkFileExtension() method.
		        	
		        	// giving points according to file type
		        	if(point==1) {
		        		System.out.println( e.getKey() +"'s " + e.getValue() + " is a java file. Point: 1");
		        	}
		        	
		        	else {
						System.out.println(e.getKey() +"'s " + e.getValue() + " is not a java file. Point: 0");
		        	}
	        	}
	        	
	        	catch(NullException ex) {//null string
	    			System.out.println(e.getKey() +". You have send a null. Point: -1");
	    			
	    		}
	        	
	        	catch(EmptyException ex) {//empty string
	    			System.out.println( e.getKey() +". You have send an empty string. Point: -1");
	    			
	    		}
	        	
	        	catch(Exception ex) {//other exception
	    			System.out.println("Your score is -1");
	    			System.out.println(ex.getMessage());
	    		}
	       }
	         
	    }
	  
	  
		
public static int checkFileExtension(String fileName) throws NullException, EmptyException 
{
	if(fileName==null) { //null exception
		throw new NullException("You have send the null string.");
	}
	
	if(fileName.isEmpty()) { //empty exception
		throw new EmptyException("You have send the empty string.");
	}
	
	if(fileName.endsWith(".java")) 
		return 1;
	
	else
		return 0;
}



}