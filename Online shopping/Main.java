#include<iostream>
using namespace std;
int main()
{
  int a,c,d,f,g,i;
  float b,e,h;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  float x=a+c-(a*b*0.01);
  float y=d+f-(d*e*0.01);
  float z=g+i-(g*h*0.01);
  cout<<"In Flipkart Rs."<<x<<"\n";
   cout<<"In Snapdeal Rs."<<y<<"\n";
   cout<<"In Amazon Rs."<<z<<"\n";
  if(x<=y&&x<=z)
    cout<<"He will prefer Flipkart";
  else if(y<x&&y<z)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}