#include<iostream>
using namespace std;
int main()
{
  int count=0,i,a;
  float mark=0.0;
  while(count<3)
  {
	cin>>a;
    if(a%2==1&&a>0)
    {
      mark++;
         count++;
     }
    else if(a%2==0&&a>0)
      mark=mark-0.5;
    else if(a<0)
    {
      mark=mark-1;
      break;
    }

  }  
    cout<<(float)mark;
}