/*
 * 设计显示学生平均成绩的类StudentInfo，根据学生语文、数学、英语成绩，计算其平均成绩。
 * 显示信息包括：学生的姓名、语文、数学、英语成绩及各科平均成绩。编写测试类，显示三名
 * 学生的信息。
 * StudentInfo
 * -name : String
 * -cs : float
 * -ms : float
 * -es : float
 * +print()
 * +average(in name : String, in cs : float, in ms : float, in es : float)
 * (注：public符号为“＋”，private符号为“－”) 执行Test.java后，得到如下结果：
 * 张三的语文成绩是：75.5,数学成绩是:80.0,英语成绩是：91.5,平均分是：82.333336
 * 李四的语文成绩是：85.5,数学成绩是:60.5,英语成绩是：80.0,平均分是：75.333336
 * 王五的语文成绩是：65.5,数学成绩是:90.5,英语成绩是：77.0,平均分是：77.666664
 */

package ts2_5;

class StudentInfo{
	private String name;
	private float cs;
	private float ms;
	private float es;
	private float average;
	public StudentInfo(){
		
	}
	public void average(String name, float cs, float ms, float es){
		this.name = name;
		this.cs = cs;
		this.ms = ms;
		this.es = es;
		this.average = (cs+ms+es)/(float)(3.0);
	}
	public void print(){
		System.out.println(this.name+"的语文成绩是："+this.cs+",数学成绩是:"+this.ms+
				",英语成绩是："+this.es+",平均分是："+this.average);
	}
}

public class ts2_5 {
	public static void main(String[] args){
		StudentInfo zhangsan = new StudentInfo();
		zhangsan.average("张三", (float)75.5, (float)80.0, (float)91.5);
		zhangsan.print();
		StudentInfo lisi = new StudentInfo();
		lisi.average("李四", (float)85.5, (float)60.5, (float)80.0);
		lisi.print();
		StudentInfo wangwu = new StudentInfo();
		wangwu.average("王五", (float)65.5, (float)90.5, (float)77.0);
		wangwu.print();			
	}
}
