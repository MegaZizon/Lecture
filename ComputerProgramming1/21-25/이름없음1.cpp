#define _WIN32_WINNT 0x0500
#include <stdio.h>
#include <windows.h>

Int Check();

int main()
{
       while(1)
      {
               Sleep(1000);
               if(Check()==0xFFFF0001)
                           printf("����� ����\n");
               else
                           printf("����\n");
       }
       return 0;
}

int Check()
{
        _asm
       {
              mov eax, fs:[30h]
              mov eax, [eax+2]
              test eax, eax
       }
}
