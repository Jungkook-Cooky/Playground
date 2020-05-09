#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  double n,x,i,y,z=11;
  cin>>n;
  for(i=0;i<n;i++)
  {
    if(i==0)
    {
      cout<<"121";
      continue;
    }
    else
    {
      y=z+4;
      z=y;
      x=pow(y,2);
      cout<<" "<<x;
    }
  }
}