/* 
 * 编写一个学生和教师数据输入和显示程序，学生数据有编号、姓名、班号和成绩，教师数据有编号、
 * 姓名、职称和部门。要求将编号、姓名输入和显示设计成一个类Person,并作为学生数据操作类
 * Student和教师数据操作类Teacher的基类。
 */

package ts2_2;

class Person{
	int id;
	String name;
	public Person(){
		
	}
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}	
	public void show(){
		System.out.println(this.name+"'s id is "+this.id+".");
	}
}

class Student extends Person{
	int classroom;
	int grade;
	public Student(){
		
	}
	public Student(int id, String name, int classroom, int grade){
		super(id, name);
		this.classroom = classroom;
		this.grade = grade;
	}
	public int getclass(){
		System.out.println("This student is from "+this.classroom+" class.");
		return this.classroom;
	}
	public int getgrade(){
		System.out.println("The student's grade is "+this.grade+".");
		return this.grade;
	}	
}

class Teacher extends Person{
	String zhichen;
	String bumen;
	public Teacher(){
		
	}
	public Teacher(int id, String name, String zhichen, String bumen){
		super(id, name);
		this.zhichen = zhichen;
		this.bumen = bumen;
	}
	public String getzhichen(){
		System.out.println("This teacher's zhichen is "+this.zhichen+".");
		return this.zhichen;
	}
	public String getbumen(){
		System.out.println("This teacher is from "+this.bumen+".");
		return this.bumen;
	}	
}

public class ts2_2 {
	public static void main(String[] args){
		Person person = new Person(10001000,"赵某");
		person.show();
		Student student = new Student(10051001,"张三",10052311,100);
		student.show();
		student.getclass();
		student.getgrade();
		Teacher teacher = new Teacher(10001,"李四","教授","计算机学院");
		teacher.show();
		teacher.getzhichen();
		teacher.getbumen();
	}
}
