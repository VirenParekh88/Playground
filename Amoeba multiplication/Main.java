#include<iostream>
using namespace std;
int main()
{
  int c=1,a,b=0;
  cin>>a;
  for(int i=1;i<a-1;i++)
  {
    int temp=c;
	c=b+c;
	b=temp;
  }
  cout<<c;
}