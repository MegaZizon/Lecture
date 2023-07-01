package Ch10_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DigitChanger extends JFrame{
	//컴포넌트에 붙일 객체들
	JTextField src = new JTextField(8);		
	JLabel pointer=new JLabel("->");
	JTextField dest = new JTextField(8);	
	JTextArea ta = new JTextArea(8,20);		
	ButtonGroup group = new ButtonGroup();
	JRadioButton decimal = new JRadioButton("decimal");
	JRadioButton binary = new JRadioButton("binary");
	JRadioButton octal = new JRadioButton("octal");
	JRadioButton hex = new JRadioButton("hex");
	JButton btn = new JButton("초기화");
	
	public DigitChanger() {
		super("Digit Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		group.add(decimal);//라디오 버튼 4개 한 그룹에 추가
		group.add(binary);
		group.add(octal);
		group.add(hex);
		
		itListen il = new itListen();//라디오 버튼 이벤트리스너
		clear cl = new clear();		//일반버튼 이벤트 리스너(초기화)
		
		decimal.addItemListener(il);//이벤트리스너 추가
		binary.addItemListener(il);
		octal.addItemListener(il);
		hex.addItemListener(il);
		btn.addActionListener(cl);
		
		c.setLayout(new FlowLayout());
		p1.add(src);//패널1에 부착
		p1.add(pointer);
		p1.add(dest);
		p2.add(decimal);//패널2에 부착
		p2.add(binary);
		p2.add(octal);
		p2.add(hex);
		
		c.add(p1); //컴포넌트에 부착
		c.add(p2);
		c.add(new JScrollPane(ta)); //스크롤 바를 가짐 처리 
		c.add(btn);
		setSize(300,330);
		setVisible(true);
	}
	
	class itListen implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {//선택되었다면
				if(e.getItem()==decimal) {	//10진수로 변환 처리 
					dest.setText((src.getText()));
					ta.append(dest.getText()+"\n");//히스토리에 추가 처리
				}
				else if(e.getItem()==binary) { //2진수로 변환 처리
					dest.setText(Integer.toBinaryString(Integer.parseInt(src.getText())));
					ta.append(dest.getText()+"\n");//히스토리에 추가 처리
				}
				else if(e.getItem()==octal) {//8진수로 변환 처리
					dest.setText(Integer.toOctalString(Integer.parseInt(src.getText())));
					ta.append(dest.getText()+"\n");//히스토리에 추가 처리
				}
				else if(e.getItem()==hex) {//16진수로 변환 처리
					dest.setText(Integer.toHexString(Integer.parseInt(src.getText())));
					ta.append(dest.getText()+"\n");//히스토리에 추가 처리
				}
			}
		}
	}
	
	public class clear implements ActionListener{
		public void actionPerformed(ActionEvent e) {//버튼 눌렀을 시
			ta.setText("");//초기화 처리
		}
	}

	public static void main(String[] args) {
		new DigitChanger();
	}

}
