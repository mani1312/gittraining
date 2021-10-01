                        Nashorn javascriptengine:


import javax.script.*;
import java.io.*;

public class Geeksforgeeks {
	public static void main(String[] args)
		throws Exception
	{


		ScriptEngine ee = new ScriptEngineManager()
							.getEngineByName("Nashorn");

		
		ee.eval(new FileReader("geeks.js"));
	}
}
output:
Welcome to Geeksforgeeks!!!						