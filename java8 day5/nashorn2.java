  nashorn  Example 2


import javax.script.*;
import java.io.*;

public class Geeksforgeeks {
	public static void main(String[] args)
		throws Exception
	{

	
		ScriptEngine ee = new ScriptEngineManager()
							.getEngineByName("Nashorn");

		
		ee.eval("print('Welcome to Geeksforgeeks!!!"
				+ " Executing JavaScript code with the"
				+ " help of Nashorn engine');");
	}
}
Output:
Welcome to Geeksforgeeks!!! Executing JavaScript code with the help of Nashorn engine