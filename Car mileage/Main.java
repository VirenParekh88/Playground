#include<iostream>
using namespace std;
int main()
{
  float m;
    int l,d;
    cin>>m>>l>>d;
    m=m*l;
    if(m>d)
      cout<<"Can reach";
  else
    cout<<"Cannot reach";
}