#include <iostream>
using namespace std;
int main() 
{
int num,out,x;
 cin>>num;
  while(num>0)
  {
    x=num%10;
    cout<<x;
    num=num/10;
  }
  
	return 0;
}