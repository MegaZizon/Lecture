package Ch10_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuActionEventEx extends JFrame {
	private JLabel imgLabel = new JLabel();
	public MenuActionEventEx() {
		setTitle("Menu에 Action 리스너 만들기 예제");
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(250,220);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem [] menuItem = new JMenuItem [4];			//메뉴 아이템 4개 생성
		String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"}; 
		JMenu screenMenu = new JMenu("Screen");				//메뉴 생성 
		JMenu sourceMenu = new JMenu("Source");
		JMenuItem changeItem = new JMenuItem("Change");		
		sourceMenu.add(changeItem);							//소스메뉴에 체인지아이템 추가
		
		MenuActionListener listener = new MenuActionListener();
		Menu2 listener2 = new Menu2();
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);		
			menuItem[i].addActionListener(listener);		//각 메뉴에 액션리스너 추가
			screenMenu.add(menuItem[i]);
		}
		
		changeItem.addActionListener(listener2);	//체인지 아이템에 리스너 추가
		mb.add(screenMenu);			//메뉴바에 삽입
		mb.add(sourceMenu);
		
		setJMenuBar(mb);			//부착
	}
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();	//사용자가 선택한 메뉴아이템의 문자열 리턴
			switch(cmd) { 						
			case "Load" :
				if(imgLabel.getIcon() != null)
					return;
				imgLabel.setIcon(new ImageIcon("images/img.jpg"));
				break;
			case "Hide" :
				imgLabel.setVisible(false);
				break;
			case "ReShow" :
				imgLabel.setVisible(true);
				break;
			case "Exit" :		//종료를 클릭했다면 confirm다이얼로그 띄우기
				int result = JOptionPane.showConfirmDialog(MenuActionEventEx.this, "종료하시겠습니까?",
						"Confirm",JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					System.exit(0);	//다이얼로그 Yes 선택시 프로그램 종료
					break;
				}
				else {
					break;
				}
			}
		
		}
	}
	class Menu2 implements ActionListener {//체인지 선택시 입력다이얼로그 띄우기 
		public void actionPerformed(ActionEvent e) {
			String txt=JOptionPane.showInputDialog(MenuActionEventEx.this,"파일명을 입력하세요.");
			if(txt.equals("cat.jpg")) {//입력한것이 cat이라면 cat.jpg 출력
				imgLabel.setIcon(new ImageIcon("images/cat.jpg"));
			}
			else if(txt.equals("dog.jpg")) {//입력한것이 dog 이라면 dog.jpg 출력
				imgLabel.setIcon(new ImageIcon("images/dog.jpg"));
			}
			else {
			}
		}
	}
	public static void main(String [] args) {
		new MenuActionEventEx();
	}
}