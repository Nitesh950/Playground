#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;

  if(a>13)
{
    if(b==13.3f)
    cout<<"$5.00";
    else
      cout<<"$8.00";
  }
  else if(a<=13){
    if(b==13.30f)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  }



}