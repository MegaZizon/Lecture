#include <iostream>
#include <stdlib.h>
#include <stdbool.h>
using namespace std;

int main(){
	int height=4;
	int width=6;
	int i;
	int** temp_box;
	
	
	temp_box=(int**)malloc(height * sizeof(int*));
	for(i=0; i<width; i++){
		temp_box[i]=(int*)malloc(width * sizeof(int));
	}
	cout<<"cc"<<endl;
	
	for(i=0; i<height; i++){
		free(temp_box[i]);
		
		cout<<"gg"<<endl;
	}
	free(temp_box);
	
	cout<<"aa"<<endl;
	return 0;
}
/*
int main(void)
{
 
    int height =6, width =8;
    int **arr;
    int i,j;
 
    arr=(int**)malloc(sizeof(int*)*height);
    for(i=0; i<height; i++)
    {
        arr[i] = (int*)malloc(sizeof(int)*width);
    }
 
    for(i=0; i<height; i++)
    {
        for(j=0; j<width; j++)
        {
            arr[i][j] = i+j+1;
        }
    }
 
    for(i=0; i<height; i++)
    {
        for(j=0; j<width; j++)
        {
            printf("%3d", arr[i][j]);
        }
        printf("\n");
    }
 
    for(i=0; i<height; i++)
    {
        free(arr[i]);
    }
    free(arr);
    
    cout <<"gd";
    return 0;
}
*/
