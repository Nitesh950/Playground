#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x,y,val1, val2;
    cin>>x>>y;
    val1 = (x-3)*(x-3)+(y-4)*(y-4);
    val2=pow(val1, 0.5);
    cout<<val2;
}