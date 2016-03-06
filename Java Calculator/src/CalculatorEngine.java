class CalculatorEngine {
	//Fields
	int value;
	int keep;
	char toDo;
	
	void binaryOperation(char op)
	{
		//This methods manages the fields accordingly to the operation and values given
		keep = value; //keep first operand
		value = 0; //initialize and get ready for second operand
		toDo = op; 
	}
	void add() {binaryOperation('+');} //Sum operation
	void subtract() {binaryOperation('-');} //Subtract operation
	void multiply() {binaryOperation('*');} //Multiply operation
	void divide() {binaryOperation('/');} //Multuply operation
	
	void compute(){
		
		//This method compute the value of each operation
		if (toDo == '+')
		{
			value = keep + value;
		}
		else if (toDo == '-')
		{
			value = keep - value;
		}
		else if (toDo == '*')
		{
			value = keep * value;
		}
		else if (toDo == '/')
		{
			value = keep/value;
		}
		keep = 0;
	}
	
	void clear(){
		//This method clears the fields
		keep = 0;
		value = 0;
	}
	
	int display(){
		//This method returns the value from the calculator display
		return value;
	}
	
	CalculatorEngine() {
		//Constructor	
		clear ();
	}	
	void digit(int x){
		value = value*10 + x; 
		
	}
	
}