#include<iostream>
using namespace std;
int main()
{
  int num=0;
  float marks=0.0;
  for(int i=0;i<3;)
  {
	cin>>num;
	if(num<0)
	{
		marks=marks-1;
		break;
	}
else if(num%2==0)
{
	marks=marks-0.5;
}
else
{
	marks=marks+1;
	i++;
}
  }
  cout<<marks;
  /*cin>>n1>>n2>>n3;
  if(n1%2==1 && n2%2==1 && n3%2==1 && n1>0 && n2>0 && n3>0)
    score=3.0;
  	cout<<score;*/
}