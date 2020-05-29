#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int w1, w2, w3, w4;
  cin>>w1>>w2>>w3;
  w2=w2*75;
  w3=w3*30;
  w4=w2+w3;
  if(w4<w1)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  
}