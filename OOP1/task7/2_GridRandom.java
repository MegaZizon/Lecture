package Ch9_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridRandom extends JFrame{
	
	JLabel la[]=new JLabel[12];
	
	public GridRandom(){
		super("3x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();		
		c.setLayout(new GridLayout(4,3)); //�׸��� ���̾ƿ����� ����
		Font ft=new Font("�������",Font.BOLD, 30);//��Ʈ ����
		
		
		for ( int i=0; i<12; i++) {// 12���� ���̺� �����
			String text = Integer.toString(i); //i���� ���ڿ��� ��ȯ �� text �� ����
			la[i] = new JLabel(""+text);		//text�� ����ִ� ���ڿ��� ���� �ؽ�Ʈ������ ����
			la[i].setFont(ft);					//��Ʈ ����
			la[i].setOpaque(true);				//���� ������ ����
			la[i].setBackground(Color.white);	//���� ���� �Ͼ����� ����
			c.add(la[i]);					
			la[i].addMouseListener(new MC());	//���콺�̺�Ʈ������ ����
		}

		setSize(300,400);
		setVisible(true);
	}
	
	class MC extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			
			JLabel jla=(JLabel)e.getSource(); //���콺�� ���� ���� �ҽ��� jla�� ����
				
			jla.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
								//���� �����ϰ� ����
		}
		public void mouseClicked(MouseEvent e) { //����Ŭ�� ��
			if(e.getClickCount()==2) {
				for(int i=0; i<12; i++) {		//��� ���� �Ͼ����� �缳��(�ʱ�ȭ)
					la[i].setBackground(Color.white);
				}
			}
		}
	}

	public static void main(String[] args) {
		new GridRandom();
	}

}
