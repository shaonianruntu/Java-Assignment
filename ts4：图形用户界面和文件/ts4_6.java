/*
 * 编写一个Java Application程序。定义一个学生类Student（属性有学号、姓名、性别、年龄、成绩等；
 * 方法有获得学号、获得姓名、获得性别、获得年龄、获得成绩等），创建若干Student类的对象后，
 * 以成绩为依据，按降序打印输出每个学生的相关信息。实验要求如下：
 * 在学生类Student中，应做到
 * (1) 相关属性应为private；
 * (2) 为每个private属性定义一对getXXX()和setXXX()方法；
 * (3) 定义带参数的构造方法完成对学生对象的初始化；
 * 
 * 在测试学生类的公共类StudentTest中，应做到
 * (1)初始化对象前对输入的数据应验证其有效性；
 * (2)能够根据用户的输入动态创建Student的对象；
 */

package ts4_6;

import java.util.Scanner;

class Student{
	private String Sno;		//学号
	private String Sname;	//姓名
	private String Ssex;	//性别
	private int    Sage;	//年龄
	private double  Sgrade;	//成绩
	
	public Student(String Sno, String Sname, String Ssex, int Sage, double Sgrade){
		this.Sno = Sno;
		this.Sname = Sname;
		this.Ssex = Ssex;
		this.Sage = Sage;
		this.Sgrade = Sgrade;
	}
	
	public String getSno(){
		return this.Sno;
	}
	public String getSname(){
		return this.Sname;
	}
	public String getSsex(){
		return this.Ssex;
	}
	public int getSage(){
		return this.Sage;
	}
	public double getSgrade(){
		return this.Sgrade;
	}
	
	public void setSno(String Sno){
		this.Sno = Sno;
	}
	public void setSname(String Sname){
		this.Sname = Sname;
	}
	public void setSsex(String Ssex){
		this.Ssex = Ssex;
	}
	public void setSage(int Sage){
		this.Sage = Sage;
	}
	public void setSgrade(float Sgrade){
		this.Sgrade = Sgrade;
	}
}

public class ts4_6 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[1000];
		int index = 0;
		
		String sno = "";
		String sname = "";
		String ssex = "";
		int sage = 0;
		double sgrade = 0.0;
		
		while(true){
			System.out.print("是否想要添加学生信息? (1/0)");
			int flag= scanner.nextInt();
			if(flag == 0){
				if(index > 0){
					System.out.println("如何下本次学生成绩的排名情况：");
					quicksort(students, index);	
					for(int i = 1; i <= index; i++){
						System.out.println(students[i].getSno()+" "+students[i].getSname()
								+" "+students[i].getSsex()+" "+students[i].getSage()+" "
								+students[i].getSgrade());
					}
				}
				System.exit(0);
			}
			else if(flag == 1){
				try{
					index++;
					System.out.print("请输入该学生的姓名：");			
					sname = scanner.next();
					System.out.print("请输入该学生的学号：");
					sno = scanner.next();
					System.out.print("请输入该学生的性别：");
					ssex = scanner.next();
					System.out.print("请输入该学生的年龄：");
					sage = scanner.nextInt();		
					System.out.print("请输入该学生的成绩：");
					sgrade = scanner.nextDouble();
					students[index] = new Student(sno, sname, ssex, sage, sgrade);
				}
				catch (Exception e) {
					System.out.println("请重新输入！");
				}		
			}
			else{
				System.out.println("您的输入有误，请重新输入！");
			}
		}
	}
	
	public static void quicksort(Student[] stu, int len){
		qsort(stu, 1, len);
	}
	
	public static void qsort(Student[] stu, int low, int high){
		if(low < high){
			int pivot = sort(stu, low, high);
			qsort(stu, low, pivot - 1);
			qsort(stu, pivot + 1, high);
		}
	}
	
	public static int sort(Student[] stu, int low, int high){
		stu[0] = stu[low];
		double pivot = stu[low].getSgrade();
		while(low < high){
			while(low < high && stu[high].getSgrade() >= pivot){
				high--;
			}
			stu[low] = stu[high];
			while(low < high && stu[low].getSgrade() <= pivot){
				low++;
			}
			stu[high] = stu[low];
		}
		stu[low] = stu[0];
		return low;
	}
}
