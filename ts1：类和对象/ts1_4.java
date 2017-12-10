/*
 * 定义一个网络用户类（NetUser），要处理的信息有用户ID、密码、email地址，在建立类的实例时，
 * 把以上三个信息都作为构造函数的参数输入，其中用户ID和用户密码是必须的，缺省的email地址是
 * 用户ID加上字符串@hope.com。编写测试代码进行测试。
 */

package ts1_4;

import java.util.Scanner;

class NetUser{
	private String id;
	private String password;
	private String email;
	public NetUser(String id, String password, String email){
		this.id = id;
		this.password = password;
		this.email = email;
	}
	public NetUser(String id, String password){
		this.id = id;
		this.password = password;
		this.email = id+"@hope.com";
	}
	public void print(){
		System.out.println(id+"\t"+password+"\t"+email);
	}
}

public class ts1_4 {
	public static void main(String[] args){
		NetUser zhangsan = new NetUser("10086","zhangsan123");
		zhangsan.print();
		NetUser lisi = new NetUser("10087", "lisi123", "lisi@gmail.com");
		lisi.print();
	}
}
