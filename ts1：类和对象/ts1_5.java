/*
 * 定义一个圆类Circle，包括一个私有数据成员：半径radius；两个公有方法：getRadius、setRadius，
 * 用于读取和设置radius；两个构造方法：一个默认构造方法和一个带参数的构造方法，用来初始化对象。
 * 另外定义一个主类，在主类中定义一个方法compareCircle，用于比较两个圆的大小，其中待比较的圆
 * 对象由参数传递；在main方法中利用默认构造方法定义一个半径为5的圆circle1，利用带参数的构造方
 * 法定义3个圆circle2、circle3、circle4（半径分别为8、10、5），并调用方法compareCircle比较
 * circle和其他3个圆的大小。
 */

package ts1_5;

class Circle{
	private double radius = 5;
	public Circle(){
		
	}
	public Circle(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return this.radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}	
}

public class ts1_5 {
	public static void main(String[] args){
		Circle circle = new Circle();
		Circle circle1 = new Circle(8);
		Circle circle2 = new Circle(10);
		Circle circle3 = new Circle(5);
		
		System.out.println("circle比circle1"+compareCircle(circle,circle1));
		System.out.println("circle比circle2"+compareCircle(circle,circle2));
		System.out.println("circle比circle3"+compareCircle(circle,circle3));
	}
	
	static public String compareCircle(Circle a, Circle b){
		if(a.getRadius() > b.getRadius()){
			return "大";
		}
		else if(a.getRadius() < b.getRadius()){
			return "小";
		}
		else 
			return "一样大";
	}
}
