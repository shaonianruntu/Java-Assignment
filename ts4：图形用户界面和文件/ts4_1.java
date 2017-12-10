/*
 * 创建一个Vehicle类并将它声明为抽象类。在Vehicle类中声明一个NoOfWheels方法，
 * 使它返回一个字符串值。创建两个类Car和Motorbike从Vehicle类继承，并在这两个
 * 类中实现NoOfWheels方法。在Car类中，应当显示“四轮车”信息；而在Motorbike类中，
 * 应当显示“双轮车”信息。创建另一个带main方法的类，在该类中创建Car和Motorbike
 * 的实例，并在控制台中显示消息。
 */

package ts4_1;

public class ts4_1 {
	public static void main(String[] args){
		Car car = new Car();
		Motorbike motorbike = new Motorbike();
		System.out.println("car是" + car.NoOfWheels());
		System.out.println("motorbike是"+ motorbike.NoOfWheels());
	}
}

abstract class Vehicle{
	public abstract String NoOfWheels();
}

class Car extends Vehicle{
	public String NoOfWheels(){
		return "四轮车";
	}
}

class Motorbike extends Vehicle{
	public String NoOfWheels(){
		return "双轮车";
	}	
}
