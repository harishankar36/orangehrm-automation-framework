package orangehrm_automation.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import orangehrm_automation.base_Package.base_Test;

public class test1 extends base_Test {

	
	public static void main(String[] args) throws IOException
	{
		base_Test b = new base_Test();
		b.initialize_Driver();
		b.tearDown();
	}

}
