/*
 * 编写一个程序。其用户界面包含有文本字段、组合框和按钮。点击按钮将会把用户在文本字段
 * 中输入的文本作为组合框的一个新选项添加到组合框中。选择组合框中的某个选项，文字字段
 * 中将会显示该选项。
 */

package ts4_2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ts4_2 extends JFrame{
	private String[] items = {};
	private JComboBox comboBox = new JComboBox(items);
	private JButton button = new JButton("添加");
	private JTextField textField = new JTextField(10);
	
	public ts4_2(){
		textField.setToolTipText("接收文本输入");
		button.setToolTipText("点击添加文本到组合框中");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.addItem(textField.getText());
				textField.setText(null);				
			}
		});
	
		setLayout(new FlowLayout());
		add(textField);
		add(button);
		add(comboBox);		
	}
	
	public static void main(String[] args){
		ts4_2 frame = new ts4_2();
		frame.setTitle("使用多个界面组件");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
	//	frame.pack();
		frame.setVisible(true);
	}
}
