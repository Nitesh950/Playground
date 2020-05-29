#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x, y;
  cin>>x;
  y=x%4;
  if(y==0)
    cout<<x<<" is a leap year";
  else
    cout<<x<<" is not a leap year";
}