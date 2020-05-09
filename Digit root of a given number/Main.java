#include<iostream>
using namespace std;
int main()
  
{
      int n,rem;
      cin>>n;
      rem = n%9;
  if(n==0)
      {
              cout<<"0";
      }
      else
      {
              if(rem==0)
                        cout<<"9";
              else
                        cout<<rem;
      }
      
}