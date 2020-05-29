#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a;
  float b, c;
    cin>>a>>b;
  switch(a){
    case 1:
      cout<<setprecision(2)<<fixed<<b;
      break;
    case 2:
      c=b*1.5;
      cout<<setprecision(2)<<fixed<<c;
      break;
    case 3:
      c=b*2;
      cout<<setprecision(2)<<fixed<<c;
      break;
    default:
      cout<<"Number of items is more";
  }
}
