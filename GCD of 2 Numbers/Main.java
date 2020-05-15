#include<iostream>
using namespace std;
  int gcd(int,int,int);
int gcd(int a,int b,int c)
{
  int i,flag=1;
  for(i=c;i>1;i--)
  {
	if(a%i==0&&b%i==0)
    {
		flag=0;
      break;
    }
  }
  return i;
      
}
int main()
{
  int a,b,c,x;
  cin>>a>>b;
  c=a<b?a:b;
  x=gcd(a,b,c);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<x;
}