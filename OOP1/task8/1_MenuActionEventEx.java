package Ch10_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuActionEventEx extends JFrame {
	private JLabel imgLabel = new JLabel();
	public MenuActionEventEx() {
		setTitle("Menu�� Action ������ ����� ����");
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(250,220);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem [] menuItem = new JMenuItem [4];			//�޴� ������ 4�� ����
		String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"}; 
		JMenu screenMenu = new JMenu("Screen");				//�޴� ���� 
		JMenu sourceMenu = new JMenu("Source");
		JMenuItem changeItem = new JMenuItem("Change");		
		sourceMenu.add(changeItem);							//�ҽ��޴��� ü���������� �߰�
		
		MenuActionListener listener = new MenuActionListener();
		Menu2 listener2 = new Menu2();
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);		
			menuItem[i].addActionListener(listener);		//�� �޴��� �׼Ǹ����� �߰�
			screenMenu.add(menuItem[i]);
		}
		
		changeItem.addActionListener(listener2);	//ü���� �����ۿ� ������ �߰�
		mb.add(screenMenu);			//�޴��ٿ� ����
		mb.add(sourceMenu);
		
		setJMenuBar(mb);			//����
	}
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();	//����ڰ� ������ �޴��������� ���ڿ� ����
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
			case "Exit" :		//���Ḧ Ŭ���ߴٸ� confirm���̾�α� ����
				int result = JOptionPane.showConfirmDialog(MenuActionEventEx.this, "�����Ͻðڽ��ϱ�?",
						"Confirm",JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					System.exit(0);	//���̾�α� Yes ���ý� ���α׷� ����
					break;
				}
				else {
					break;
				}
			}
		
		}
	}
	class Menu2 implements ActionListener {//ü���� ���ý� �Է´��̾�α� ���� 
		public void actionPerformed(ActionEvent e) {
			String txt=JOptionPane.showInputDialog(MenuActionEventEx.this,"���ϸ��� �Է��ϼ���.");
			if(txt.equals("cat.jpg")) {//�Է��Ѱ��� cat�̶�� cat.jpg ���
				imgLabel.setIcon(new ImageIcon("images/cat.jpg"));
			}
			else if(txt.equals("dog.jpg")) {//�Է��Ѱ��� dog �̶�� dog.jpg ���
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