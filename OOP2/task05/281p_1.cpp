#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int cnt,input;
	int max, min;

	cout << "������ ����: ";
	cin >> cnt;

	vector<int> vec;

	for (int i=0; i<cnt; i++){
		cout << "������ �Է��Ͻÿ�: ";
		cin >> input;
		vec.push_back(input);
	}

	max=vec[0];
	min=vec[0];
	for (auto& i : vec){
		if (max < i)
			max = i;
		if (min > i)
			min = i;
	}

	cout << "�ִ밪: " << max << endl;
	cout << "�ּҰ�: " << min << endl;
	
	return 0;
}
