#include<iostream>
using namespace std;
int main()
{
  int a,b,temp;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and "<<"b="<<b<<"\n";
  swap(a,b);
  cout<<"After swapping a= "<<a<<" and "<<"b="<<b;
}
int swap(int &n,int &m)
{
  int t;
  t=n;
  n=m;
  m=t;
}