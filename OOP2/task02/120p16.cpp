#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;

int main()
{
	int cash = 50;
	int betting;
	int wins = 0; 
	int total = 0; 


	for (int i = 0; i < 1000; i++)
	{
		cash = 50;
		betting = 0;
		
		while (true)
		{
			betting++;
			
			if ((double)rand() / RAND_MAX < 0.5)
				cash++;
			else
				cash--;
			

			if (cash <= 0){
				break;
			}
			if (cash >= 250){
				wins++;
				break;
			}
		}

		total += betting; 
	}

    cout<<fixed;
    cout.precision(6);
	cout << "�ʱ� �ݾ� $50" << endl;
	cout << "��ǥ �ݾ� $250" << endl;
	cout << "1000 ���� " << wins << "�� �¸�" << endl;
	cout << "�̱� Ȯ��=" << wins / 1000.0 * 100.0 << endl;
	cout << "��� ���� Ƚ�� = " << total / 1000.0  ;

	return 0;
}
