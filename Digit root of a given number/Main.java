#include<iostream>
using namespace std;
int sum(int);
int sum(int a)
{
  int b,s=0;
  while(a>0)
  {
    b=a%10;
s=s+b;
    a=a/10;
  }
  if(s<=9)
    return s;
  else
    sum(s);
}
int main()
{
  int b,a;
    cin>>a;
  b=sum(a);
  cout<<b;
}
