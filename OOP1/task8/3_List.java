package Ch_10_3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import Ch10_1.MenuActionEventEx;


public class List extends JFrame{
	
	JTextField tf = new JTextField(20);//텍스트필드
	ImageIcon img[] = {new ImageIcon("images/apple.jpg"),//이미지 배열 3개
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/mango.jpg")};
	JLabel imgLa = new JLabel("이미지 출력");
	JPanel npanel = new JPanel();
	JPanel spanel = new JPanel();
	JList list;
	DefaultListModel dlm;
	
	public List() {
		super("List 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		list = new JList(new DefaultListModel());//DefaultListModel로 리스트 컴포넌트를 생성
		dlm= (DefaultListModel)list.getModel(); //리스트 모델을 얻어내 디폴트모델 dml에 저장
		list.setModel(dlm); //dlm을 list에 설정
		
		JScrollPane jp = new JScrollPane(list); //JScrollPane에 list 부착
		jp.setPreferredSize(new Dimension(100,230));
		
		npanel.add(new JLabel("입력 후 <Enter>키를 입력하세요"),BorderLayout.NORTH);
		npanel.add(tf,BorderLayout.SOUTH);
		npanel.setPreferredSize(new Dimension(100, 50));
		
		spanel.add(jp,BorderLayout.WEST);
		spanel.add(imgLa,BorderLayout.EAST);
		spanel.setPreferredSize(new Dimension(150, 150));
		
		imgLa.setPreferredSize(new Dimension(150,100));

		c.add(npanel,BorderLayout.NORTH);
		c.add(spanel,BorderLayout.CENTER);
		
		tf.addActionListener(new ActionListener() {//텍스트박스에서 Enter 입력시발생 이벤트
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(tf.getText()); //현 텍스트박스 String dlm에 저장
				tf.setText("");				//초기화 
			
			}
		});
		
		list.addListSelectionListener(new ListSelectionListener(){//리스트 선택시 발생 이벤트
			public void valueChanged(ListSelectionEvent e) {
				
				String s=(String)list.getSelectedValue();
				
				if(s.equals("apple")) {//선택 문자열이 apple 이라면
					imgLa.setIcon(img[0]);//레이블에 이미지 출력
					
				}
				else if(s.equals("banana")) {//선택 문자열이 banana 이라면
					imgLa.setIcon(img[1]);//레이블에 이미지 출력
				}
				else if(s.equals("mango")) {//선택 문자열이 mango 이라면
					imgLa.setIcon(img[2]);//레이블에 이미지 출력
				}
				else {						//선택 문자열이 위 3개가 아니라면
					JOptionPane.showMessageDialog(List.this, "해당 이미지가 없습니다.",
						"Message",JOptionPane.ERROR_MESSAGE);//메세지 다이얼로그 띄우기
				}
			}
		});
		
		setSize(400,350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new List();
	}

}
