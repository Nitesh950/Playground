#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int d1, c1, d2, c2, sum1, sum2;
  cin>>d1>>c1>>d2>>c2;
  if(c1+c2>=100)
  {
    sum1=abs(100-(c1+c2));
      sum2=d1+d2+1;
    cout<<sum2<<'\n';
    cout<<sum1;
    
  }
  else
  {
    cout<<d1+d2<<'\n';
    cout<<c1+c2;
  }
  
  
}