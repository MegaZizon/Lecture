#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int cnt,input;
	int max, min;

	cout << "정수의 개수: ";
	cin >> cnt;

	vector<int> vec;

	for (int i=0; i<cnt; i++){
		cout << "정수를 입력하시오: ";
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

	cout << "최대값: " << max << endl;
	cout << "최소값: " << min << endl;
	
	return 0;
}
