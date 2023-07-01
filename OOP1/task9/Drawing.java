package Ch11_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Drawing extends JFrame {
	
	MyPanel mp = new MyPanel();		//�г� ����
	imgPanel ip = new imgPanel();
	JPanel jp = new JPanel();
	BluePanel bp = new BluePanel();
	RedPanel rp = new RedPanel();
	YellowPanel yp = new YellowPanel();
	
	ImageIcon icon = new ImageIcon("images/img.jpg");
	Image img = icon.getImage();	//�̹��� ����

	int width = img.getWidth(this);		//�̹����� ũ�� ����
	int height = img.getHeight(this);
	int x2,y2,width2,height2;
	
	boolean DelColor=false;		//����⸦ Ŭ���������� ����� ����
	int dividing=0;				//3,4������ ������������ ����� ����
	
	Drawing() {
		setTitle("�ǽ�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createMenu();		//�޴� �Լ�
		
		setSize(400, 300);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		
		JMenu imgDraw = new JMenu("�̹����׸���");		//�޴�4�� �ʱ�ȭ
		JMenu mouseDraw = new JMenu("���콺�ο��׸���");
		JMenu divideC = new JMenu("�������ϱ�");
		JMenu ChangeColor = new JMenu("���󺯰�");
		
		JMenuItem imgLoad = new JMenuItem("�̹����ε�");			//�޴������� 10�� �ʱ�ȭ
		JMenuItem imgMinus = new JMenuItem("�̹������(-10%)");		
		JMenuItem imgPlus = new JMenuItem("�̹���Ȯ��(+10%)");
		JMenuItem DrawCircle = new JMenuItem("���׸���");								
		JMenuItem R = new JMenuItem("����");
		JMenuItem B = new JMenuItem("�Ķ�");
		JMenuItem Y = new JMenuItem("���");
		JMenuItem deleteall = new JMenuItem("�����");		
		JMenuItem ThreeC = new JMenuItem("3����");			
		JMenuItem FourC = new JMenuItem("4����");			

		imgDraw.add(imgLoad);	//������ ����
		imgDraw.add(imgMinus);
		imgDraw.add(imgPlus);
		
		mouseDraw.add(ChangeColor);//������ ����
		mouseDraw.add(deleteall);
		mouseDraw.add(DrawCircle);
		ChangeColor.add(R);
		ChangeColor.add(B);
		ChangeColor.add(Y);
		
		divideC.add(ThreeC);//������ ����
		divideC.add(FourC);
		
		MenuActionListener ls = new MenuActionListener();//�޴������ۿ� ������ ����
		imgLoad.addActionListener(ls);
		imgMinus.addActionListener(ls);
		imgPlus.addActionListener(ls);
		DrawCircle.addActionListener(ls);
		R.addActionListener(ls);
		B.addActionListener(ls);
		Y.addActionListener(ls);
		deleteall.addActionListener(ls);
		ThreeC.addActionListener(ls);
		FourC.addActionListener(ls);
		
		mb.add(imgDraw);
		mb.add(mouseDraw);
		mb.add(divideC);
		
		setJMenuBar(mb);			//�޴��ٿ� ����
	}
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();	//�޴������� Ŭ�� �� ����ڰ� ������ �޴��������� ���ڿ� ����
			switch(cmd) { 						
			case "�̹����ε�" :
				getContentPane().removeAll();//�������� �г��� ip�� �ٲ۴�
				repaint();
				getContentPane().add(ip);
				setVisible(true);
				break;
			case "�̹������(-10%)" :			//ip�гο��� �������� ũ�⸦ ���δ�
				width=width-width/10;
				height=height-height/10;
				getContentPane().removeAll();
				repaint();
				getContentPane().add(ip);
				setVisible(true);
				break;
			case "�̹���Ȯ��(+10%)" :			//ip�гο��� �������� ũ�⸦ �ø���
				width=width+width/10;
				height=height+height/10;
				getContentPane().removeAll();
				repaint();
				getContentPane().add(ip);
				setVisible(true);
				break;
			case "���׸���" :					//�������� �г��� mp�� �ٲ۴�
				getContentPane().removeAll();
				repaint();
				
				getContentPane().add(mp);
				setVisible(true);
				break;
			case "����" :						//�������� �г��� rp(mp�� �Ӽ��� ������ �ٽñ׸��г�)�� �ٲ۴�
				getContentPane().removeAll();
				repaint();
				getContentPane().add(rp);
				setVisible(true);
				break;
			case "�Ķ�" :						//�������� �г��� bp(mp�� �Ӽ��� ������ �ٽñ׸��г�)�� �ٲ۴�
				getContentPane().removeAll();
				repaint();
				getContentPane().add(bp);
				setVisible(true);
				break;
			case "���" :						//�������� �г��� yp(mp�� �Ӽ��� ������ �ٽñ׸��г�)�� �ٲ۴�
				getContentPane().removeAll();
				repaint();
				getContentPane().add(yp);
				setVisible(true);
				break;
			case "�����" :					//mp ���� �׷����� �׸��� �ʰ� �ٷ� �Ѿ�� ����Ͱ� ���� ȿ���� ����.
				DelColor=true;
				getContentPane().removeAll();
				repaint();
				mp=new MyPanel();
				setVisible(true);
				break;
			case "3����" :					//mp���� ������ �ʺ�� ���̷� ���� 3�����Ͽ� �ٽñ׸���.
				dividing=3;
				getContentPane().removeAll();
				repaint();
				getContentPane().add(mp);
				setVisible(true);
				break;
			case "4����" :					//mp���� ������ �ʺ�� ���̷� ���� 4�����Ͽ� �ٽñ׸���.
				dividing=4;
				getContentPane().removeAll();
				repaint();
				getContentPane().add(mp);
				setVisible(true);
				break;
			}
			
		}
	}
	
	class MyPanel extends JPanel {
		Point start = null, end = null; // ���콺�� �������� ����

		
		public MyPanel() {
			MyMouseListener listener = new MyMouseListener();
			addMouseListener(listener);
			addMouseMotionListener(listener);
		}

		class MyMouseListener extends MouseAdapter {
			public void mousePressed(MouseEvent e) {
				start = e.getPoint();
			}

			public void mouseDragged(MouseEvent e) {
				end = e.getPoint();
				repaint();			//�г� �׸���
			}
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			if (DelColor==true) {//����� ��û ������ �� �׸����ʰ� ����
				width2=0;
				height2=0;
				DelColor=false;
				return;
			}
			if(dividing==3) {	//���� ��û ������ �� �����ϰ� ����
				g.setColor(Color.red); 
				g.fillArc(x2, y2, width2, height2, 90, 120);
				g.setColor(Color.blue); 
				g.fillArc(x2, y2, width2, height2, 210, 120);
				g.setColor(Color.yellow);
				g.fillArc(x2, y2, width2, height2, -30, 120);
				dividing=0;
				return;
			}
			else if(dividing==4) {//���� ��û ������ �� �����ϰ� ����
				g.setColor(Color.red); 
				g.fillArc(x2, y2, width2, height2, 90, 90);
				g.setColor(Color.blue); 
				g.fillArc(x2, y2, width2, height2, 180, 90);
				g.setColor(Color.yellow); 
				g.fillArc(x2, y2, width2, height2, 270, 90);
				g.setColor(Color.green); 
				g.fillArc(x2, y2, width2, height2, 0, 90);
				dividing=0;
				return;
			}
			
			if (start == null) 
				return;
			g.setColor(Color.black); //����Ʈ�� ������
			int x3 = Math.min(start.x, end.x);//���� �׸���
			int y3 = Math.min(start.y, end.y);
			int width3 = Math.abs(start.x - end.x);
			int height3 = Math.abs(start.y - end.y);
			
			
			//�׷��� �� ��ǥ�� ����
			x2=x3; y2=y3; width2=width3; height2=height3;
			g.fillOval(x2, y2, width2, height2);  
		}
	}
	
	class BluePanel extends JPanel{//����� ��ǥ���� ���, ���� �ٲ�׸� �г�BLUE
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue); 
			g.fillOval(x2, y2, width2, height2);
		}
	}
	class RedPanel extends JPanel{//����� ��ǥ���� ���, ���� �ٲ�׸� �г�Red
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red); 
			g.fillOval(x2, y2, width2, height2);
		}
	}
	class YellowPanel extends JPanel{//����� ��ǥ���� ���, ���� �ٲ�׸� �г�Yellow
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.yellow); 
			g.fillOval(x2, y2, width2, height2);
		}
	}
	
	class imgPanel extends JPanel{//�̹��� ��� �г�
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, width, height,this);
		}
	}
	public static void main(String[] args) {
		new Drawing();
	}
	
}


