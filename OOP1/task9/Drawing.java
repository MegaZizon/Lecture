package Ch11_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Drawing extends JFrame {
	
	MyPanel mp = new MyPanel();		//패널 생성
	imgPanel ip = new imgPanel();
	JPanel jp = new JPanel();
	BluePanel bp = new BluePanel();
	RedPanel rp = new RedPanel();
	YellowPanel yp = new YellowPanel();
	
	ImageIcon icon = new ImageIcon("images/img.jpg");
	Image img = icon.getImage();	//이미지 생성

	int width = img.getWidth(this);		//이미지의 크기 저장
	int height = img.getHeight(this);
	int x2,y2,width2,height2;
	
	boolean DelColor=false;		//지우기를 클릭했을때의 사용할 변수
	int dividing=0;				//3,4색원을 선택했을때의 사용할 변수
	
	Drawing() {
		setTitle("실습과제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createMenu();		//메뉴 함수
		
		setSize(400, 300);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		
		JMenu imgDraw = new JMenu("이미지그리기");		//메뉴4개 초기화
		JMenu mouseDraw = new JMenu("마우스로원그리기");
		JMenu divideC = new JMenu("원분할하기");
		JMenu ChangeColor = new JMenu("색상변경");
		
		JMenuItem imgLoad = new JMenuItem("이미지로딩");			//메뉴아이템 10개 초기화
		JMenuItem imgMinus = new JMenuItem("이미지축소(-10%)");		
		JMenuItem imgPlus = new JMenuItem("이미지확대(+10%)");
		JMenuItem DrawCircle = new JMenuItem("원그리기");								
		JMenuItem R = new JMenuItem("빨강");
		JMenuItem B = new JMenuItem("파랑");
		JMenuItem Y = new JMenuItem("노랑");
		JMenuItem deleteall = new JMenuItem("지우기");		
		JMenuItem ThreeC = new JMenuItem("3색원");			
		JMenuItem FourC = new JMenuItem("4색원");			

		imgDraw.add(imgLoad);	//아이템 부착
		imgDraw.add(imgMinus);
		imgDraw.add(imgPlus);
		
		mouseDraw.add(ChangeColor);//아이템 부착
		mouseDraw.add(deleteall);
		mouseDraw.add(DrawCircle);
		ChangeColor.add(R);
		ChangeColor.add(B);
		ChangeColor.add(Y);
		
		divideC.add(ThreeC);//아이템 부착
		divideC.add(FourC);
		
		MenuActionListener ls = new MenuActionListener();//메뉴아이템에 리스너 설정
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
		
		setJMenuBar(mb);			//메뉴바에 부착
	}
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();	//메뉴아이템 클릭 시 사용자가 선택한 메뉴아이템의 문자열 리턴
			switch(cmd) { 						
			case "이미지로딩" :
				getContentPane().removeAll();//보여지는 패널을 ip로 바꾼다
				repaint();
				getContentPane().add(ip);
				setVisible(true);
				break;
			case "이미지축소(-10%)" :			//ip패널에서 보여지는 크기를 줄인다
				width=width-width/10;
				height=height-height/10;
				getContentPane().removeAll();
				repaint();
				getContentPane().add(ip);
				setVisible(true);
				break;
			case "이미지확대(+10%)" :			//ip패널에서 보여지는 크기를 늘린다
				width=width+width/10;
				height=height+height/10;
				getContentPane().removeAll();
				repaint();
				getContentPane().add(ip);
				setVisible(true);
				break;
			case "원그리기" :					//보여지는 패널을 mp로 바꾼다
				getContentPane().removeAll();
				repaint();
				
				getContentPane().add(mp);
				setVisible(true);
				break;
			case "빨강" :						//보여지는 패널을 rp(mp의 속성을 저장해 다시그린패널)로 바꾼다
				getContentPane().removeAll();
				repaint();
				getContentPane().add(rp);
				setVisible(true);
				break;
			case "파랑" :						//보여지는 패널을 bp(mp의 속성을 저장해 다시그린패널)로 바꾼다
				getContentPane().removeAll();
				repaint();
				getContentPane().add(bp);
				setVisible(true);
				break;
			case "노랑" :						//보여지는 패널을 yp(mp의 속성을 저장해 다시그린패널)로 바꾼다
				getContentPane().removeAll();
				repaint();
				getContentPane().add(yp);
				setVisible(true);
				break;
			case "지우기" :					//mp 에서 그래픽을 그리지 않고 바로 넘어와 지운것과 같은 효과를 낸다.
				DelColor=true;
				getContentPane().removeAll();
				repaint();
				mp=new MyPanel();
				setVisible(true);
				break;
			case "3색원" :					//mp에서 설정한 너비와 높이로 원을 3분할하여 다시그린다.
				dividing=3;
				getContentPane().removeAll();
				repaint();
				getContentPane().add(mp);
				setVisible(true);
				break;
			case "4색원" :					//mp에서 설정한 너비와 높이로 원을 4분할하여 다시그린다.
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
		Point start = null, end = null; // 마우스의 시작점과 끝점

		
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
				repaint();			//패널 그리기
			}
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			if (DelColor==true) {//지우는 요청 들어왔을 시 그리지않고 나감
				width2=0;
				height2=0;
				DelColor=false;
				return;
			}
			if(dividing==3) {	//분할 요청 들어왔을 시 분할하고 나감
				g.setColor(Color.red); 
				g.fillArc(x2, y2, width2, height2, 90, 120);
				g.setColor(Color.blue); 
				g.fillArc(x2, y2, width2, height2, 210, 120);
				g.setColor(Color.yellow);
				g.fillArc(x2, y2, width2, height2, -30, 120);
				dividing=0;
				return;
			}
			else if(dividing==4) {//분할 요청 들어왔을 시 분할하고 나감
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
			g.setColor(Color.black); //디폴트값 검정색
			int x3 = Math.min(start.x, end.x);//원을 그린다
			int y3 = Math.min(start.y, end.y);
			int width3 = Math.abs(start.x - end.x);
			int height3 = Math.abs(start.y - end.y);
			
			
			//그려진 뒤 좌표값 저장
			x2=x3; y2=y3; width2=width3; height2=height3;
			g.fillOval(x2, y2, width2, height2);  
		}
	}
	
	class BluePanel extends JPanel{//저장된 좌표값을 기반, 색만 바꿔그린 패널BLUE
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue); 
			g.fillOval(x2, y2, width2, height2);
		}
	}
	class RedPanel extends JPanel{//저장된 좌표값을 기반, 색만 바꿔그린 패널Red
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red); 
			g.fillOval(x2, y2, width2, height2);
		}
	}
	class YellowPanel extends JPanel{//저장된 좌표값을 기반, 색만 바꿔그린 패널Yellow
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.yellow); 
			g.fillOval(x2, y2, width2, height2);
		}
	}
	
	class imgPanel extends JPanel{//이미지 출력 패널
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, width, height,this);
		}
	}
	public static void main(String[] args) {
		new Drawing();
	}
	
}


