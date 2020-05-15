#include<iostream>
int fib(int);
int fib(int a)
{
  int c=1,temp,b=0;
for(int i=0;i<a-2;i++)
  {
  	temp=c;
  	c=b+c;
  	b=temp;
	}
  return c;
}
using namespace std;
int main()
{
 int a,x;
  cin>>a;
  x=fib(a);
  cout<<"The term "<<a<<" in the fibonacci series is "<<x;
}