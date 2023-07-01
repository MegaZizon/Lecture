package Ch12_1;
import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
	JLabel timerLabel; // Ÿ�̸� ���� ��µǴ� ���̺�

	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	public void run() {
		int n = 0; 
		while (true) { 
			timerLabel.setText(Integer.toString(n));
			n++; 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JLabel timerLabel1 = new JLabel();
		JLabel timerLabel2 = new JLabel(); 
		timerLabel1.setFont(new Font("Gothic", Font.ITALIC, 80));
		timerLabel2.setFont(new Font("Gothic", Font.ITALIC, 80));
		timerLabel2.setForeground(Color.BLUE); 
		c.add(timerLabel1,BorderLayout.WEST);//�����̳ʿ� ����
		c.add(timerLabel2,BorderLayout.EAST);
		TimerThread th1 = new TimerThread(timerLabel1);
		TimerThread th2 = new TimerThread(timerLabel2);
		setSize(250, 150);
		setVisible(true);
		th1.start(); //���������
		th2.start();
	}

	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}