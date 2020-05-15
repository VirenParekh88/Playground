#include<iostream>
using namespace std;
int main()
{
  int a,i,c,flag=1;
  cin>>a;
  int b[a];
  for(i=0;i<a;i++)
    cin>>b[i];
  cin>>c;
  for(i=0;i<a;i++)
  {
if(c==b[i])
{
  flag=0;
  break;
}
  }
  if(flag==0)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
  
}