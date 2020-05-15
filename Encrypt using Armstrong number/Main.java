#include<iostream>
int power(int,int);
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int a,b,sum=0,count =0,m;
  m=n;
  b=n;
  while(n>0)
  {
n=n/10;
  count++;
  }
  while(m>0)
  {
n=m%10;
    a=power(n,count);
      sum=sum+a;
    m=m/10;
  }
  if(sum==b)
      return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
}