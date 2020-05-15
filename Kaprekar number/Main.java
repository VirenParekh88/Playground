#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b,e;
  int c,d;
  cin>>a;
    b=a;
    e=a;
    int count=0;
    while(b>0)
    {
      b=b/10;
      count++;
    }
    a=a*a;
  int j=1;
  for(int i=0;i<count;i++)
  {
j=j*10;
  }
  c=a/j;
  d=a%j;
  if(e==(c+d))
    cout<<"Kaprekar Number";
    else
      cout<<"Not a Kaprekar Number";
}