#include<iostream>
using namespace std;
int main()
{
  float mil, mult;
  int pet, dist;
  cin>>mil>>pet>>dist;
  mult=mil*pet;
  if(mult>=dist)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
    
}