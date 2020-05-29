#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a, b, c;
  cin>>a>>b;
  if(a>b)
  {
    a=1900+a;
    b=2000+b;
    cout<<b-a;
  }
  else
  {
    c=b-a;
    cout<<c;
  }
}