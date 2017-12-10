/*
 * 编写一个完整的JavaApplication程序。包含接口Shape，类Circle、Rectangle和Test，具体要求如下：
 * （1）接口Shape
 * 方法:
 * double calculateArea()：求一个形状的面积；
 * double calculatePerimeter()：求一个形状的周长；
 * （2）类Circle，实现Shape接口，并有以下属性和方法：
 * 属性：
 * radius，数据类型为double，用于表示圆的半径；
 * 方法：
 * Circle(double r)，构造函数，给属性赋值；
 * toString()，将圆的描述信息以字符串形式返回，例如“radius=2.0, perimeter=12.6, area=12.6”，数值小数
 * 点后保留一位；
 * （3）类Triangle，实现Shape接口，并有以下属性和方法：
 * 属性:
 * sideA，sideB，sideC，数据类型为double，表示三角形的三条边；
 * 方法：
 * Triangle (double sideA, double sideB, double sideC)，构造函数，给属性赋值；
 * toString()，将矩形的描述信息以字符串形式返回，例如“sideA=3.0, sideB=4.0, sideC=5.0, perimeter=12.0,
 * area=6.0”，数值小数点后保留一位；
 * 提示：
 * 根据三边a, b, c求三角形面积的方法是，令  p = (a+b+c)/2 , 面积 s= 根号下(p(p-a)(p-b)(p-c))。
 * （4）Test类作为主类要完成测试功能
 * 创建一个Circle对象和一个Triangle对象，分别计算Circle和Triangle对象的面积和周长，再分别调用对象的
 * toString（）方法，输出对象的描述信息。程序在调用上述方法时，需要体现多态性。
 */

package ts2_6;

interface Shape{
	double calculateArea();
	double calculatePerimeter();
}

class Circle implements Shape{
	private double radius;
	private final double PI = 3.14;
	public Circle(){
		
	}
	public Circle(double r){
		this.radius = r;
	}
	public String toString(){
		return "radius="+this.radius+",perimeter="+
				String.format("%.1f",calculateArea())+
				",area="+String.format("%.1f",calculatePerimeter());
	}
	public double calculateArea(){
		return PI*this.radius*this.radius;
	}
	public double calculatePerimeter(){
		return PI*2*this.radius;
	}
}

class Triangle implements Shape{
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double sideA, double sideB, double sideC){
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public String toString(){
		return "sideA="+this.sideA+",sideB="+this.sideB+",sideC="+
				this.sideC+",perimeter="+String.format("%.1f",calculateArea())+
				",area="+String.format("%.1f",calculatePerimeter());		
	}
	public double calculateArea(){
		return this.sideA+this.sideB+this.sideC;
	}
	public double calculatePerimeter(){
		double p = (this.sideA+this.sideB+this.sideC)/2.0;
		return Math.sqrt(p*(p-this.sideA)*(p-this.sideB)*(p-this.sideC));
	}
} 

public class ts2_6 {
	public static void main(String[] args){
		Circle circle = new Circle(2.0);
		Triangle triangle = new Triangle(3.0, 4.0, 5.0);
		System.out.println(circle.toString());
		System.out.println(triangle.toString());
	}
	
	public static void calculateArea(Shape shape){
		shape.calculateArea();
	}
	public static void calculatePerimeter(Shape shape){
		shape.calculatePerimeter();
	}
}