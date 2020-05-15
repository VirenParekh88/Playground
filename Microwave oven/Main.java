#include<iostream>
using namespace std;
int main()
{
  int n;
    float t;
    cin>>n>>t;
  if(n==2)
    cout<<t*1.5;
    else if(n==3)
      cout<<t*2;
  else
    cout<<"Number of items is more";
}