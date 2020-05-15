#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int a,count1=0,count2=0;
  cin>>a;
  int *b;
  b=(int *)malloc(a*sizeof(int));
  for(int i=0;i<a;i++)
  {
cin>>b[i];
  }
  for(int i=0;i<a;i++)
  {
	if(b[i]%2==0)
	count1++;
    else
      count2++;
  }
  cout<<count2<<"\n"<<count1;
  
  return 0;
}