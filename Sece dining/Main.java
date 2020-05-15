#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[10];
  int i;
  cin>>a>>i;
  if((strcmp(a,"front")==0))
  {
    if(i==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
if(i==1)
  cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
}