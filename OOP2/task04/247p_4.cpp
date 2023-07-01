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
		cout << "영화 #" << number << endl;
		cout << "영화 제목: " << title << endl;
		cout << "영화 감독: " << director << endl;
		cout << "영화 평점: " << rating << endl;
	}
};

int main()
{
	Movie m1("타이타닉", "제임스 카메론", "9.5" );
	m1.print();

	cout << endl;

	Movie m2( "지오스톰", "딘 데블린", "8.34 ");
	m2.print();
}
