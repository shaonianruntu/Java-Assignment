/*
 * 编程创建一个Person类，在其中包括属性（姓名，性别，年龄）和方法getDetails()，用于显示所有信息。
 * 将Person类作为父类，创建子类Student，增加属性“专业”，重写getDetails()方法，在该方法中使用
 * 父类的getDetails()方法，用下面的测试代码。
 * 	public static void main(String args[]){
 * 	       Student s=new Student("庄敏","女",20,"软件技术");
 * 	       System.out.println(s.getDetails());
 * 	}
 * 最后显示：“姓名：庄敏，性别：女，年龄：20岁，专业：软件技术”
 * 
 * 设计显示学生平均成绩的类StudentInfo，根据学生语文、数学、英语成绩，计算其平均成绩。
 * 显示信息包括：学生的姓名、语文、数学、英语成绩及各科平均成绩。编写测试类，显示三名学生的信息。
 */

package ts2_3;

class Person{
	String	name;
	String 	sex;
	int 	age;
	public Person(){
		
	}
	public Person(String name, String sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getDetails(){
		return "姓名："+this.name+"，性别："+this.sex+
				"，年龄："+this.age+"岁";
	}
}

class Student extends Person{
	String zhuanye;
	public Student(){
		
	}
	public Student(String name, String sex, int age, String zhuanye){
		super(name, sex, age);
		this.zhuanye = zhuanye;
	}
	public String getDetails(){
		return "姓名："+this.name+"，性别："+this.sex+
				"，年龄："+this.age+"岁，专业："+this.zhuanye;
	}	
}

public class ts2_3 {
	public static void main(String args[]){
		Student s=new Student("庄敏","女",20,"软件技术");
	    System.out.println(s.getDetails());
	}
}
