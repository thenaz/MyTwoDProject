package grid.tests;

import static org.junit.Assert.*;

import org.junit.*;
import grid.controller.GridController;
import grid.view.Gr

public class ControllerTest
{
	private GridController testController;
	
	@Before
	public void setUp() throws Exception
	{
		testController = new GridController();
	}
	
	@After
	public void tearDown() throws Exception
	{
		testController = null;
	}
	
	@Test
	public void testGridController()
	{
		
	}

}
