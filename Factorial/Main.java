#include<iostream>
using namespace std;
int fact(int);
int fact(int x)
{
if(x==1)
  return 1;
  else
    return x*fact(x-1);
}
int main()
{
  int a,b;
  cin>>a;
  b=fact(a);
  cout<<"The factorial of "<<a<<" is "<<b;
}