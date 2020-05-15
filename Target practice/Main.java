#include<iostream>
using namespace std;
int main()
{
  int t,count=0,a;
  cin>>t;
 while(t>0)
 {
cin>>a;
   t=t-a;
     count++;
 }
  cout<<"The number of turns is "<<count;
}