#include <stdio.h>

/*자연수 n(10 <= n <= 99999)을 입력받아서 각 자리를 제외한 나머지 수들의 합을 구하는 프 로그램 작성.
 예를 들어 자연수 1425가 입력되면 결과는 425+125+145+142 = 837 이 됨.  */
// 입력값 1425 111 10 63572
int tenmultiple(int a){ //10의 N승의 값을 리턴해주는 함수 
	int i,j=1;
	
	for(i=0; i<a-1; i++){
		j*=10;
	}
	return j;
}

void main(){
	int num,temp,count=0;
	int j,i=0,sum=0,hap=0; 
	
	printf("자연수를 입력하시오:");
	scanf("%d",&num);
	printf("결과:");
	
	temp=num;
	
	while(temp!=0){ // num가 몇자리수인지 구함 ex) 4321 이면 4자리 
		temp/=10;
		count++;
	}
	
	int ten=tenmultiple(count); //ten에 10의 count승의 값을 입력 ex)4321일때 4자리이므로 1000 
	int array[count],array2[count]; //count개의 배열을 만듬 
	
	for(i=0; i<count; i++){			//배열 "array"에 각 자리수를 입력 ex)4321일떄 4,3,2,1 
		array[i]=num/ten;            
		num=num-array[i]*ten;        //4321 - (4x1000) = 321 
		ten/=10;
	}
	
	for(i=0; i<count; i++){  //각 자리를 제외한 나머지 수들을 배열"array2"에 입력하며
							 //그 합을 hap에 누적시킴  
		
		ten=tenmultiple(count-1);  //-1을하는 이유:"4321" "4"자리수에서 
		                           //더하는 숫자들(321+421...)은 -1한 "3"자리이기때문 
		sum=0;
		
		for(j=0; j<count; j++){
			if(j==i) continue;    //4321에서 각 자리를 연산하지 않기 위함 
			sum=sum+array[j]*ten; //321을 만들어가기 위함(300+20+1)
			ten/=10;              
		}
		
		array2[i]=sum;            //321을 배열"array2"에 입력  
		hap+=array2[i];           //array2의 모든 원소들의 합 
		
		printf("%d",array2[i]);
		if(i<count-1)			  //마지막이 아니면 + 출력  
			printf("+");
		else                      //마지막이면 출력 
			printf(" = %d",hap);
	}
}
