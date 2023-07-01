package Ch10_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DigitChanger extends JFrame{
	//������Ʈ�� ���� ��ü��
	JTextField src = new JTextField(8);		
	JLabel pointer=new JLabel("->");
	JTextField dest = new JTextField(8);	
	JTextArea ta = new JTextArea(8,20);		
	ButtonGroup group = new ButtonGroup();
	JRadioButton decimal = new JRadioButton("decimal");
	JRadioButton binary = new JRadioButton("binary");
	JRadioButton octal = new JRadioButton("octal");
	JRadioButton hex = new JRadioButton("hex");
	JButton btn = new JButton("�ʱ�ȭ");
	
	public DigitChanger() {
		super("Digit Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		group.add(decimal);//���� ��ư 4�� �� �׷쿡 �߰�
		group.add(binary);
		group.add(octal);
		group.add(hex);
		
		itListen il = new itListen();//���� ��ư �̺�Ʈ������
		clear cl = new clear();		//�Ϲݹ�ư �̺�Ʈ ������(�ʱ�ȭ)
		
		decimal.addItemListener(il);//�̺�Ʈ������ �߰�
		binary.addItemListener(il);
		octal.addItemListener(il);
		hex.addItemListener(il);
		btn.addActionListener(cl);
		
		c.setLayout(new FlowLayout());
		p1.add(src);//�г�1�� ����
		p1.add(pointer);
		p1.add(dest);
		p2.add(decimal);//�г�2�� ����
		p2.add(binary);
		p2.add(octal);
		p2.add(hex);
		
		c.add(p1); //������Ʈ�� ����
		c.add(p2);
		c.add(new JScrollPane(ta)); //��ũ�� �ٸ� ���� ó�� 
		c.add(btn);
		setSize(300,330);
		setVisible(true);
	}
	
	class itListen implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {//���õǾ��ٸ�
				if(e.getItem()==decimal) {	//10������ ��ȯ ó�� 
					dest.setText((src.getText()));
					ta.append(dest.getText()+"\n");//�����丮�� �߰� ó��
				}
				else if(e.getItem()==binary) { //2������ ��ȯ ó��
					dest.setText(Integer.toBinaryString(Integer.parseInt(src.getText())));
					ta.append(dest.getText()+"\n");//�����丮�� �߰� ó��
				}
				else if(e.getItem()==octal) {//8������ ��ȯ ó��
					dest.setText(Integer.toOctalString(Integer.parseInt(src.getText())));
					ta.append(dest.getText()+"\n");//�����丮�� �߰� ó��
				}
				else if(e.getItem()==hex) {//16������ ��ȯ ó��
					dest.setText(Integer.toHexString(Integer.parseInt(src.getText())));
					ta.append(dest.getText()+"\n");//�����丮�� �߰� ó��
				}
			}
		}
	}
	
	public class clear implements ActionListener{
		public void actionPerformed(ActionEvent e) {//��ư ������ ��
			ta.setText("");//�ʱ�ȭ ó��
		}
	}

	public static void main(String[] args) {
		new DigitChanger();
	}

}
