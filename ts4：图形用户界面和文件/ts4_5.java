/*
 * 编写一个Java应用程序，除了主类（TestTwo）外，该程序还有Shape接口、三角形类Triangle类、
 * 矩形Rectangle类。该程序具体要求如下：
 * 1）Shape接口public abstract double computeArea(double a,double b)抽象方法。
 * 2）Triangle类实现Shape接口，完成计算面积的功能：用a代表三角形的底、b代表三角形的高。
 * 3）Rectangle类实现Shape接口，完成计算面积的功能：有a代表矩形的底、b代表矩形的高。
 * 4）在TestTwo类的主方法中分别创建各子类的对象并调用各自的计算面积的方法，并打印输出信息
 *    面积信息。（要求使用到多态性）
 */

 package ts4_5;

import java.util.Scanner;

public class ts4_5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Triangle triangle = new Triangle();
		Rectangle rectangle = new Rectangle();
		
		System.out.println("请输入想要计算的三角形的底和高：");
		double ta = scanner.nextDouble();
		double tb = scanner.nextDouble();
		System.out.println("该三角形的面积是：" + computeArea(triangle, ta, tb));
		
		System.out.println("请输入想要计算的长方形的底和高：");
		double ra = scanner.nextDouble();
		double rb = scanner.nextDouble();
		System.out.println("该长方形的面积是：" + computeArea(rectangle, ra, rb));
		
	}
	
	public static double computeArea(Shape shape,double a,double b){
		return shape.computeArea(a, b);
	}
}

interface Shape{
	public abstract double computeArea(double a,double b);
}

class Triangle implements Shape{
	public double computeArea(double a,double b){
		return a * b / 2.0;
	}
}

class Rectangle implements Shape{
	public double computeArea(double a,double b){
		return a * b;
	}	
}