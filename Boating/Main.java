#include<iostream>
using namespace std;
int main()
{
  int h,a,c;
  cin>>h>>a>>c;
  a=a*75+c*30;
  if(h>a)
    cout<<"Boat is stable";
    else
      cout<<"Boat will drow";
}