#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,i;
  int s=5,sum=6;
  cin>>n;
  for(i=0;i<n;i++)
  {
    sum=s*i+sum;
    cout<<sum<<" ";
  }
}