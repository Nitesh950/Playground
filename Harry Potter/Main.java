#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  cin>>n;
  n=abs(n);
  cout<<(n%10+ (n/1000)%10);
}