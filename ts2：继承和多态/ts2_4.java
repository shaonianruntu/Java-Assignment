/*
 * 请使用接口编码实现如下需求：
 * 乐器（Intrument）分为：钢琴（plano）、小提琴（Vlolin），各种乐器的弹奏（play）
 * 方法各不相同。编写一个测试类InstrumentTest，要求：
 * 编写方法testPlay，对各种乐器进行弹奏测试，要依据乐器的不同，进行相应的弹奏。
 * 在main方法中创建不同的乐器对象，通过testPlay的弹奏测试方法进行测试。
 */

 package ts2_4;

interface Intrument{
	void testPlay();
}

class Plano implements Intrument{
	public void testPlay(){
		System.out.println("the plano is playing, ding ding ding ...");
	}
}

class Vlolin implements Intrument{
	public void testPlay(){
		System.out.println("the vlolin is playing, la la la ...");
	}
}

public class ts2_4 {
	public static void main(String[] args){
		Plano plano = new Plano();
		Play(plano);
		Vlolin vlolin = new Vlolin();
		Play(vlolin);
	}
	
	public static void Play(Intrument intrument){
		intrument.testPlay();
	}
}
