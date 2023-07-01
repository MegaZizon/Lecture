package Ch9_3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Call extends JFrame{
	
	JButton bt[] = new JButton[15];		 //��ư 15�� ����
	JLabel Number=new JLabel();
	JLabel Calling=new JLabel();
	JLabel cancel=new JLabel();

	
	public Call() {
		super("��ȭ�ɱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); 				//��������� ���̾ƿ�
		Font ft=new Font("�������",Font.BOLD, 15);

		Number.setFont(ft);      		//��ȣ�� ��Ʈ������
		Number.setSize(300,33);			//��ȣ���̺��� ũ��
		Number.setLocation(0,0);		//��ȣ���̺��� ��ġ
		Number.setBackground(Color.white);//��ȣ���̺� ������
		Number.setOpaque(true);			//��ȣ���̺� ������

		Calling.setFont(ft);
		Calling.setForeground(new Color(204,204,204));
		Calling.setSize(300,33);
		Calling.setLocation(0,33);
		Calling.setBackground(Color.white);
		Calling.setOpaque(true);

		cancel.setFont(ft);
		cancel.setForeground(new Color(204,204,204));
		cancel.setSize(300,33);
		cancel.setLocation(0,66);
		cancel.setBackground(Color.white);
		cancel.setOpaque(true);
		
		c.add(Number);	//����Ʈ�ҿ� ���̺� �߰�
		c.add(Calling);
		c.add(cancel);
		
		int row=0;
		int col=0;
		for(int i=0; i<15; i++) {	//��ư ��ġ �����̳ʿ� �����ϱ�
			
			bt[i] = new JButton(""+Integer.toString(i-2)); //0~9 ��ư �̸� ����
			bt[i].setSize(100,50);	
			bt[i].setLocation(col,row+100);
			bt[i].addActionListener(new AcEvent());		//�� ��ư�� ��Ƽ���̺�Ʈ������ �߰�
			if((i+1)%3==0) {  	//�� ����
				col=0;
				row+=50;
			}				
			else {				//�� ��ġ����
				col+=100;
			}
			c.add(bt[i]);
			
		}
		bt[0].setText("��ȭ");
		bt[1].setText("����");
		bt[2].setText("����");
		bt[12].setText("*");
		bt[13].setText("0");
		bt[14].setText("#");
		
		setSize(315,390);
		setVisible(true);
	}
	
	public class AcEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {//��ư�� ���������� �߻��ϴ� �̺�Ʈ
			JButton jb=(JButton)e.getSource();
			String S=jb.getText();		//S�� ������ ��ư�� �ؽ�Ʈ �� ����
			String Nb=Number.getText(); //�ѹ� ���̺��ִ� �ؽ�Ʈ�� Nb�� ����
			
			if(S.equals("��ȭ")) {		//������ ��ư�� ���ڿ��� ��ȭ���
				Calling.setText("��ȭ�� �̴ϴ�...") ; //Calling���̺� ���
			}
			else if(S.equals("����")) {	//������
				cancel.setText("��ȭ�� �����ϴ�.");   //Cancel ���̺� ���
			}
			
			else if(S.equals("����")) {			 //�����̶��
				Nb=Nb.substring(0,Nb.length()-1);//Nb���ִ� ���ڿ��� ���� ���� ���ڿ� ����
				Number.setText(Nb);				//���� �� Number���̺� �ٽ� ���
			}
			else {								//��ȣ���
				Number.setText(Nb+""+S);		//��Number���̺� �ڿ� ����Էµ� ��ư�� ���ڿ� �߰�
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		new Call();
	}

}
