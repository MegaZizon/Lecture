#include <iostream>
#include <time.h>
#include <stdlib.h>

using namespace std;

int flip(){
	return rand() % 2;
}

int main()
{
	int front = 0, rear = 0;

	for (int i = 0; i < 100; i++)
	{
		if (flip() == 0)
			front++;
		else
			rear++;
	}

	cout << "동전의 앞면: " << front << endl;
	cout << "동전의 뒷면: " << rear ;
	

	return 0;
}
