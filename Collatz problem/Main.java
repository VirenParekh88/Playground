#include<iostream>
using namespace std;
int main()
{
  int a,count1=0,count2=0;
    cin>>a;
        cout<<a<<"\n";

    while(a!=1)
    {
    if(a%2==0)
    {
      a=a/2;
  cout<<a<<"\n";
      count1++;
    }
  else
  {
    a=3*a+1;
    cout<<a<<"\n";
    count2++;
  }
    }
  cout<<count1+count2;
}