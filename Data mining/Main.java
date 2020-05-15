#include<iostream>
using namespace std;
int main()
{
  int a,b,sum1=0,sum2=0;
    cin>>a;
  while(a>0)
  {
    b=a%10;
    if(b%2==0)
    {
sum1=sum1+b;
    }
    else
    {
sum2=sum2+b;
    }
    a=a/10;
  }
  if(sum1==sum2)
  cout<<"Yes";
  else
    cout<<"No";
}
