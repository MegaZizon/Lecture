package Ch12_2;
import java.awt.*;
import javax.swing.*;


class TimerThread extends Thread {
	JLabel timerLabel;
	int whoami;
	public TimerThread(JLabel timerLabel, int whoami) {//whoami�ʵ带 �߰��� �ڽ��� Ȯ���� �� �ְ� ��
		this.timerLabel = timerLabel;
		this.whoami=whoami;
	}

	public void run() {
		int n = 0; 
		while (true) { 
			if(whoami==1) { //1���̸� 1�ʸ��� 1�����ϴ� �۾� ����
				timerLabel.setText(Integer.toString(n));
				n++; 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					return;
				}
			}
			else {		//�׷����ʴٸ� 2�ʸ��� 1 �����ϴ� �۾� ����
				timerLabel.setText(Integer.toString(n));
				n--; 
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					return;
				}
			}
			
		}
	}
}
public class ThreadTimerEx2 extends JFrame {
	public ThreadTimerEx2() {
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JLabel timerLabel1 = new JLabel();
		JLabel timerLabel2 = new JLabel();
		timerLabel1.setFont(new Font("Gothic", Font.ITALIC, 80));
		timerLabel2.setFont(new Font("Gothic", Font.ITALIC, 80));
		timerLabel2.setForeground(Color.BLUE); 
		c.add(timerLabel1,BorderLayout.WEST);
		c.add(timerLabel2,BorderLayout.EAST);
		TimerThread th1 = new TimerThread(timerLabel1,1);
		TimerThread th2 = new TimerThread(timerLabel2,2);
		setSize(250, 150);
		setVisible(true);
		th1.start(); 
		th2.start();
	}

	public static void main(String[] args) {
		new ThreadTimerEx2();
	}
}

