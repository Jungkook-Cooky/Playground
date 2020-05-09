#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int chalk,n,days;
  cin>>chalk;
	n=sqrt(chalk);
  days=chalk+n;
  //days = n + sqrt(n);
  cout<<days+1;
}