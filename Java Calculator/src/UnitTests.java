import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UnitTests {
	private CalculatorEngine myCalcEngine = new CalculatorEngine();

	@Before
	public void setUp(){
		
		myCalcEngine.keep = 20;
		myCalcEngine.value = 10;
	}
	
	@Test
	public void testBinaryOperation() {
		
		myCalcEngine.binaryOperation('+');
		assertEquals ("Error in operation", myCalcEngine.toDo, '+');
		assertEquals ("Error in value", myCalcEngine.keep, 10);
		assertEquals ("Error in keep", myCalcEngine.value, 0);
		
	}

	@Test
	public void testAdd() {
		myCalcEngine.add();
		assertEquals ("Error in sum", myCalcEngine.toDo, '+');
	}

	@Test
	public void testSubtract() {
		myCalcEngine.subtract();
		assertEquals ("Error in subtract", myCalcEngine.toDo, '-');
	}

	@Test
	public void testMultiply() {
		myCalcEngine.multiply();
		assertEquals ("Error in multiply", myCalcEngine.toDo, '*');
	}

	@Test
	public void testDivide() {
		myCalcEngine.divide();
		assertEquals ("Error in divide", myCalcEngine.toDo, '/');
	}

	@Test
	public void testCompute() {
		myCalcEngine.toDo = '+';
		myCalcEngine.compute();
		assertEquals ("Error in compute sum", myCalcEngine.value, 30);
		setUp();
		myCalcEngine.toDo = '-';
		myCalcEngine.compute();
		assertEquals ("Error in compute subtract", myCalcEngine.value, 10);
		setUp();
		myCalcEngine.toDo = '*';
		myCalcEngine.compute();
		assertEquals ("Error in compute multiply", myCalcEngine.value, 200);
		setUp();
		myCalcEngine.toDo = '/';
		myCalcEngine.compute();
		assertEquals ("Error in compute divide", myCalcEngine.value, 2);
	}

	@Test
	public void testClear() {
		myCalcEngine.clear();
		assertEquals ("Error in clearing value", myCalcEngine.value, 0);
		assertEquals ("Error in clearing keep", myCalcEngine.keep,0);
	}

	@Test
	public void testDisplay() {
		assertEquals ("Error in display", myCalcEngine.display(), myCalcEngine.value);
	}

	@Test
	public void testCalculatorEngine() {
		CalculatorEngine myCalcEngTest = new CalculatorEngine();
		assertEquals ("Error in constructor", myCalcEngTest.value, 0);
		assertEquals ("Error in construct", myCalcEngTest.keep, 0);
	}
	
	@Test
	public void testDigit(){
		myCalcEngine.clear();
		myCalcEngine.digit(1);
		myCalcEngine.digit(5);
		assertEquals ("Error in digit", myCalcEngine.value, 15);
	}
	

}
