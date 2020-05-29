#include<iostream>
using namespace std;
int main()
{
  int r, s;
  cin>>r>>s;
  if(2*r<=s){
    if(r==0||s==0)
      cout<<"";
    else
      cout<<"circle can be inside a square";
  }
  else
    cout<<"circle cannot be inside a square";
  
}