/*
 * ��дһ���������û�����������ı��ֶΡ���Ͽ�Ͱ�ť�������ť������û����ı��ֶ�
 * ��������ı���Ϊ��Ͽ��һ����ѡ����ӵ���Ͽ��С�ѡ����Ͽ��е�ĳ��ѡ������ֶ�
 * �н�����ʾ��ѡ�
 */

package ts4_2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ts4_2 extends JFrame{
	private String[] items = {};
	private JComboBox comboBox = new JComboBox(items);
	private JButton button = new JButton("���");
	private JTextField textField = new JTextField(10);
	
	public ts4_2(){
		textField.setToolTipText("�����ı�����");
		button.setToolTipText("�������ı�����Ͽ���");
		
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
		frame.setTitle("ʹ�ö���������");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
	//	frame.pack();
		frame.setVisible(true);
	}
}
