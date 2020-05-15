#include<iostream>
using namespace std;
void swap(int *,int *);
int main()
{
  int a,b;
  int &c=a;
  int &d=b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(c,d);
  cout<<"After swapping a= "<<a<<" and b="<<b;
}
void swap(int *x,int *y)
{
int temp;
  temp=*x;
  *x=*y;
  *y=temp;
}