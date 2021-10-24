
public class Student{
    String stuName;
	char gen;
	String adds;
	float fee;
	public String displayName(){
	String name="Priya";
	return name;
	}
	public static void main(String ar[]){
  Student student= new Student();
	String myName= student.displayName();
    System.out.println("my name is :"+ myName);
	}
}