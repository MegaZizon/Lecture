#include <stdio.h>

void main(){
	int i,linecnt;
	int spacecnt=5,starcnt=1;
	//규칙 : 공백5 별1 > 공4 별3 > 공3 별5 
	//별이 7개인 구간 없음 
	for(linecnt=1; linecnt<=11; linecnt++){  //11줄 출력 
		
		if(linecnt<6){  
		
			if(starcnt==7){  //별이 7개인 구간 출력 안함 
				spacecnt--;  
				starcnt+=2;
			}
			else{            //그외 구간 출력 
				for(i=1; i<=spacecnt; i++)
					printf(" ");
		
				for(i=1; i<=starcnt; i++)
					printf("*");
				printf("\n");
				
				spacecnt--;  //공백은 1개씩 줄고 
				starcnt+=2;  //별은 2개씩 늘어난다  
			}
		}
		
		else{
			if(starcnt==7){
				spacecnt++;  //공백은 1개씩 늘고 
				starcnt-=2;  //별은 2개씩  줄어든다 
			}
			else{
				for(i=1; i<=spacecnt; i++)
					printf(" ");
		
				for(i=1; i<=starcnt; i++)
					printf("*");
				printf("\n");
				spacecnt++;
				starcnt-=2;
			}
		}
	}
}

