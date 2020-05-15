#include<iostream>
using namespace std;
int ans(int,int);
int ans(int a,int n)
{
if(n==0)
  return 1;
  else
    return a*ans(a,n-1);
}
int main()
{
  int b,a,n;
  cout<<"Enter the value of a"<<"\n";
  cin>>a;
  cout<<"Enter the value of n"<<"\n";
  cin>>n;
  b=ans(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<b;
}