class Student{
  int id;
  String name;
  String address;
  String gender;
  String department;
  int semester;
  int year;
  int rollno;
  char section;
  float fee;
  int joiningyear;
  int passoutyear;
  Void insert(int i,String n,String a,String g,String d,int s,int y,int r,char c,float f, int j, int p){
  id=i;
  name=n;
  address=a;
  gender=g;
  department=d;
  semester=s;
  year=y;
  rollno=r;
  section=c;
  fee=f;
  joiningyear=j;
  PassoutYear=p;
}   
  public void display()
{
 System.out.println(id+""+name+""+address+""+gender+""+department+""+semester+""+year+""+rollno+""+section+""+fee+""+joiningyear+""+PassoutYear);
  return classStudent ;
 
}
}
 class StudentProfile{
 public static void main(String args[]){
 Student s1=new Student();
 s1.insert(45,"PRIYA BHARTI","Samastipur Bihar","Female","CSE",5,3,155,'A',45345,2019,2023);
 s1.display();
 }
}
 

