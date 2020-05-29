#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  cin>>x;
  cout<<"Rs.";
  if(x<=200)
  {
    x=x*0.5;
    x=(int)x;
    cout<<x;
  }
  else if(x<=400)
    cout<<x*0.65+100;
  else if(x<=600)
    cout<<x*0.8+200;
  else
  {
    x=x*1.25+425;
    x=(int)x;
    cout<<x;
}
}