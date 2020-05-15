#include <iostream>
using namespace std;
int main() 
{
	int a,i;
  cin>>i;
  	while(i!=0)
    {
	a=i%10;
      cout<<a;
      i=i/10;
    }
	return 0;
}