#include<iostream>
using namespace std;
int main()
{
  int num1,num2,s,i;
  int sum=0;
  cin>>num1>>num2;
  s=num1+num2;
  for(i=1;i<s;i++)
  {
    if(s%i==0)
    {
      sum=sum+i;
    }
  }
  if(s==sum)
  {
    cout<<"They can read the message";
  }
  else
  {
    cout<<"They can't read the message";
  }
}