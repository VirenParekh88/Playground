#include<iostream>
using namespace std;
int main()
{
  int m,n,req,b=1;
cin>>m>>n>>req;
  for(int i=0;i<n;i++)
  {
b=m*b;
  }
  if(b>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}