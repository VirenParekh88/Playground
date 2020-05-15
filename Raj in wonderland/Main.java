#include<iostream>
int main()
{
  int x,y;
  std::cin>>x;
  y=(x%2==0)?1:0;
  if(y==1)
    std::cout<<"Possible";
  else
    std::cout<<"Not possible";
}