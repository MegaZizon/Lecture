package Ch9_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gambling extends JFrame{
	
	JLabel Fir=new JLabel("     0");
	JLabel Sec=new JLabel("     0");
	JLabel Trd=new JLabel("     0");
	JLabel Txt=new JLabel("�����մϴ�.");
	
	public Gambling(){
		
		super("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();		
		JButton btn = new JButton("��������������"); //��Ī�ڸ� ������ ��ư
		Font ft=new Font("�������",Font.ITALIC, 30);
		c.setLayout(null);
		
		Fir.setSize(100,50); //�� ���̺� ũ�� ����
		Sec.setSize(100,50);
		Trd.setSize(100,50);
		Txt.setSize(150,50);
		btn.setSize(180,50);
		
		Fir.setFont(ft); // �� ���̺�  ��Ʈ ����
		Sec.setFont(ft);
		Trd.setFont(ft);
		Txt.setFont(new Font("�������",Font.BOLD,20));
		btn.setFont(new Font("�������",Font.BOLD,20));
		
		Fir.setLocation(30,50); // �� ���̺� ��ġ ����
		Sec.setLocation(190,50);
		Trd.setLocation(350,50);
		Txt.setLocation(30,150);
		btn.setLocation(200,150);
		
		Fir.setOpaque(true); //�� ���̺� ������ ����
		Sec.setOpaque(true);
		Trd.setOpaque(true);
		
		Fir.setBackground(new Color(102,000,102)); //�� ���̺� ���� ����
		Sec.setBackground(new Color(102,000,102));
		Trd.setBackground(new Color(102,000,102));
		Fir.setForeground(Color.yellow);
		Sec.setForeground(Color.yellow);
		Trd.setForeground(Color.yellow);
		
		c.add(Fir); c.add(Sec); c.add(Trd); //����Ʈ�濡 ����
		c.add(Txt); c.add(btn);
		
		btn.addActionListener(new dolimpan()); //��ư�� ������ �̺�Ʈ �߻�
		
		setSize(500,300);
		setVisible(true);
	}
	
	public class dolimpan implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			String x=Integer.toString((int)(Math.random()*5));//������ ������ ��Ʈ������ ��ȯ �� x�� ���
			String y=Integer.toString((int)(Math.random()*5));
			String z=Integer.toString((int)(Math.random()*5));
			Fir.setText("     "+x);//���̺� ���
			Sec.setText("     "+y);
			Trd.setText("     "+z);
			
			//���̺� ���� �����ϰ� ����
			Fir.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
			Sec.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
			Trd.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
												
			if(x.equals(y)&&x.equals(z)) { //x=y=z���
				Txt.setText("�����մϴ�!!");  //txt���̺� �����մϴ� ���
			}
			else {						
				Txt.setText("�ƽ�����");
			}
		}
	}

	public static void main(String[] args) {
		new Gambling();
	}

}
