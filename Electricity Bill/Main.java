#include<iostream>
using namespace std;
int main()
{
  int u;
  cin>>u;
  if(u<=200)
    cout<<"Rs."<<int(u*0.5);
  else if(u>200&&u<=400)
    cout<<"Rs."<<int(u*0.65+100);
  else if(u>400&&u<=600)
    cout<<"Rs."<<int(u*0.80+200);
  else
    cout<<"Rs."<<int(u*1.25+425);
}