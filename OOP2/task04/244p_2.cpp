#include <iostream>
using namespace std;

class Person{
private:
	string name;
	int snumber;
	int age;
public:
	Person(){
		name="È«±æµ¿";
		snumber=0;
		age=0;
	}
	Person(string n,int s,int a){
		name=n;
		snumber=s;
		age=a;
	}
	//ÃÊ±âÈ­ ¸®½ºÆ® 
	// Person(string n,int s,int a) : name(n), snumber(s), age(a){}
	~Person(){
		cout << "¼Ò¸êÀÚ È£Ãâ\n";
	}
	print(){
		cout << "ÀÌ¸§: "<<name << endl<<"ÁÖ¹Î¹øÈ£: "<<snumber<<endl<<"³ªÀÌ: "<<age<<endl; 
	}
};

int main(){
	Person p2("±èÃ¶¼ö",990101,24);
	p2.print();
}
