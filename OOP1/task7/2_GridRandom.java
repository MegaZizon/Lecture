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
		c.setLayout(new GridLayout(4,3)); //그리드 레이아웃으로 정의
		Font ft=new Font("맑은고딕",Font.BOLD, 30);//폰트 설정
		
		
		for ( int i=0; i<12; i++) {// 12개의 레이블 만들기
			String text = Integer.toString(i); //i값을 문자열로 변환 후 text 에 저장
			la[i] = new JLabel(""+text);		//text에 담겨있는 문자열을 라벨의 텍스트문구로 설정
			la[i].setFont(ft);					//폰트 설정
			la[i].setOpaque(true);				//라벨의 불투명도 설정
			la[i].setBackground(Color.white);	//라벨의 배경색 하양으로 설정
			c.add(la[i]);					
			la[i].addMouseListener(new MC());	//마우스이벤트리스너 설정
		}

		setSize(300,400);
		setVisible(true);
	}
	
	class MC extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			
			JLabel jla=(JLabel)e.getSource(); //마우스로 누른 라벨의 소스를 jla에 저장
				
			jla.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
								//배경색 랜덤하게 변경
		}
		public void mouseClicked(MouseEvent e) { //더블클릭 시
			if(e.getClickCount()==2) {
				for(int i=0; i<12; i++) {		//모든 배경색 하양으로 재설정(초기화)
					la[i].setBackground(Color.white);
				}
			}
		}
	}

	public static void main(String[] args) {
		new GridRandom();
	}

}
