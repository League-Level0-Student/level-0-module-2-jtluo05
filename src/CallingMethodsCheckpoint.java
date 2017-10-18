
public class CallingMethodsCheckpoint {
int number;
	
String name;
void printMessage(){
		System.out.println("message");
	}
void setName(String name){
	this.name=name;
}
int getNumber(){
	return number;
}

	
	
	
	
	public static void main(String[] args) {
	CallingMethodsCheckpoint cmc=new 	CallingMethodsCheckpoint ();
	
	
}
	void runMethod(){
	//Methods go here
	printMessage();
	setName("Jordan");
	int num=getNumber();
	
	
	}
}
