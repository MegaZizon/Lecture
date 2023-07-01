package Ch_10_3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import Ch10_1.MenuActionEventEx;


public class List extends JFrame{
	
	JTextField tf = new JTextField(20);//�ؽ�Ʈ�ʵ�
	ImageIcon img[] = {new ImageIcon("images/apple.jpg"),//�̹��� �迭 3��
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/mango.jpg")};
	JLabel imgLa = new JLabel("�̹��� ���");
	JPanel npanel = new JPanel();
	JPanel spanel = new JPanel();
	JList list;
	DefaultListModel dlm;
	
	public List() {
		super("List ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		list = new JList(new DefaultListModel());//DefaultListModel�� ����Ʈ ������Ʈ�� ����
		dlm= (DefaultListModel)list.getModel(); //����Ʈ ���� �� ����Ʈ�� dml�� ����
		list.setModel(dlm); //dlm�� list�� ����
		
		JScrollPane jp = new JScrollPane(list); //JScrollPane�� list ����
		jp.setPreferredSize(new Dimension(100,230));
		
		npanel.add(new JLabel("�Է� �� <Enter>Ű�� �Է��ϼ���"),BorderLayout.NORTH);
		npanel.add(tf,BorderLayout.SOUTH);
		npanel.setPreferredSize(new Dimension(100, 50));
		
		spanel.add(jp,BorderLayout.WEST);
		spanel.add(imgLa,BorderLayout.EAST);
		spanel.setPreferredSize(new Dimension(150, 150));
		
		imgLa.setPreferredSize(new Dimension(150,100));

		c.add(npanel,BorderLayout.NORTH);
		c.add(spanel,BorderLayout.CENTER);
		
		tf.addActionListener(new ActionListener() {//�ؽ�Ʈ�ڽ����� Enter �Է½ù߻� �̺�Ʈ
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(tf.getText()); //�� �ؽ�Ʈ�ڽ� String dlm�� ����
				tf.setText("");				//�ʱ�ȭ 
			
			}
		});
		
		list.addListSelectionListener(new ListSelectionListener(){//����Ʈ ���ý� �߻� �̺�Ʈ
			public void valueChanged(ListSelectionEvent e) {
				
				String s=(String)list.getSelectedValue();
				
				if(s.equals("apple")) {//���� ���ڿ��� apple �̶��
					imgLa.setIcon(img[0]);//���̺� �̹��� ���
					
				}
				else if(s.equals("banana")) {//���� ���ڿ��� banana �̶��
					imgLa.setIcon(img[1]);//���̺� �̹��� ���
				}
				else if(s.equals("mango")) {//���� ���ڿ��� mango �̶��
					imgLa.setIcon(img[2]);//���̺� �̹��� ���
				}
				else {						//���� ���ڿ��� �� 3���� �ƴ϶��
					JOptionPane.showMessageDialog(List.this, "�ش� �̹����� �����ϴ�.",
						"Message",JOptionPane.ERROR_MESSAGE);//�޼��� ���̾�α� ����
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
