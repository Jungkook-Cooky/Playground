#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int num,i;
  double n=0.5,t,x;
  cin>>num;
  for(i=0;i<num;i++)
  {
    if(i==0)
    {
      cout<<n;
      continue;
    }
    else
    {
      t=pow(3,i-1);
      x=t+n;
      n=x;
      cout<<" "<<x;
    }
  }
}