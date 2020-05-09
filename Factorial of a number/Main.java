#include<iostream>
using namespace std;
int main()
{
  int num,i;
  int fact=1;
  cin>>num;
  for(i=num;i>1;i--)
  {
    fact=fact*i;
  }
  cout<<fact;
}