#include<iostream>
using namespace std;
int main()
{
	int s,e,i,j,sum=0;
      cin>>s>>e;
  for(i=s;i<=e;i++)
  {
    for(j=1;j<i;j++)
    {
	if(i%j==0)
    {
	sum=sum+j;
    }
    }
      if(sum==i)
        cout<<sum<<" ";
    sum=0;
    }
}