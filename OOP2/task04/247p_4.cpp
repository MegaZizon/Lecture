#include <iostream>

using namespace std;
int NO=1;

class Movie {
private:
	string title,director,rating;
	int number;
		
public:
	Movie() {
		number = NO++;
		title = "";
		director = "";
		rating = "";
	}
	Movie(string t,string d,string r){
		number = NO++;
		title=t;
		director=d;
		rating=r;
	}
	string getTitle() { return title; }
	string getDirector() { return director; }
	string getRating() { return rating; }
	void setTitle(string t) { title = t; }
	void setDirector(string d) { director = d; }
	void setRating(string r) { rating = r; }
	
	void print() {
		cout << "��ȭ #" << number << endl;
		cout << "��ȭ ����: " << title << endl;
		cout << "��ȭ ����: " << director << endl;
		cout << "��ȭ ����: " << rating << endl;
	}
};

int main()
{
	Movie m1("Ÿ��Ÿ��", "���ӽ� ī�޷�", "9.5" );
	m1.print();

	cout << endl;

	Movie m2( "��������", "�� ����", "8.34 ");
	m2.print();
}
