#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int r, c, n;
  cin>>r>>c>>n;
  if(n<=r+c)
  {
      if(n>r)
        cout<<"It is a mango tree";
      else
        cout<<"It is not a mango tree";
  }
  else if(n>(r*c)-(2*r))
  {
      if(n<=r*(c-1))
        cout<<"It is a mango tree";
      else
        cout<<"It is not a mango tree";
  }
  else
    cout<<"It is not a mango tree";
}
