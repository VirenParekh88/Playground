#include<iostream>
using namespace std;
int main()
{
  int a,temp;
  cin>>a;
  int b[a];
  for(int i=0;i<a;i++)
    cin>>b[i];  
    for (int i = 0; i < a-1; i++)      
    {   
    for (int j = 0; j < a-i-1; j++)  
        if (b[j] > b[j+1])
        {
            temp=b[j];
  b[j]=b[j+1];
  b[j+1]=temp;
        }
    }
  cout<<b[a-1];
}