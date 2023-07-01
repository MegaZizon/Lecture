package Ch12_2;
import java.awt.*;
import javax.swing.*;


class TimerThread extends Thread {
	JLabel timerLabel;
	int whoami;
	public TimerThread(JLabel timerLabel, int whoami) {//whoami필드를 추가해 자신을 확인할 수 있게 함
		this.timerLabel = timerLabel;
		this.whoami=whoami;
	}

	public void run() {
		int n = 0; 
		while (true) { 
			if(whoami==1) { //1번이면 1초마다 1증가하는 작업 수행
				timerLabel.setText(Integer.toString(n));
				n++; 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					return;
				}
			}
			else {		//그렇지않다면 2초마다 1 감소하는 작업 수행
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
		setTitle("Thread를 상속받은 타이머 스레드 예제");
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

