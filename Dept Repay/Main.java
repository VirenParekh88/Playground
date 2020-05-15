#include<iostream>
using namespace std;
int main()
{
  int p,roi,n;
  float i,t,d,f;
  cin>>p>>roi>>n;
  i=p*roi*n/100;
  t=i+p;
  d=0.02*i;
  f=t-d;
  cout<<i<<"\n"<<t<<"\n"<<d<<"\n"<<f<<"\n";
}