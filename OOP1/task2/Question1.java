//1. System.arrayCopy()�� �̿��Ͽ� 2���� �迭�� �����Ͽ� �迭�� �����ϰ� 
// �� ������ ����Ͻÿ�. ��, ����Ǵ� �� �迭�� Ű���� �Է��� �޾� �����Ͻÿ�.
// �迭�� ���� ����� Arrays.toString() Ȱ��.package Tranning2;
package Tranning2;
import java.util.Scanner;
import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {

	    String str;
	    
        Scanner scanner = new Scanner(System.in);
        String[] array1;
        System.out.print("����(SpaceBar)���� �����Ͽ� ù��° �迭�� �Է��Ͻÿ�."
       + "\n�Է¿���)hello world 123\n����[hello, world, 123] 3���� �迭�� �����\n:");
        str = scanner.nextLine(); 
        array1 = str.split(" ");   //�����̽��ٷ� �����ϱ�
        
	    String[] array2;
        
        System.out.print("�ι�° �迭�� �Է��Ͻÿ�:");
        str = scanner.nextLine(); 
        array2 = str.split(" "); 
        
        String[] a1a2 = new String[array1.length+array2.length]; //��ĥ �迭 a1a2����
        System.arraycopy(array1, 0, a1a2, 0, array1.length);
        System.arraycopy(array2, 0, a1a2, array1.length, array2.length);
        
        System.out.println("ù��° �迭: " + Arrays.toString(array1));
        System.out.println("�ι�° �迭: " + Arrays.toString(array2));
        System.out.println("����� �迭: " + Arrays.toString(a1a2));

        scanner.close();
    }
}

