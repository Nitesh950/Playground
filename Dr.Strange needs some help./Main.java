#include<iostream>
#include<cmath>
int powerof(int, int);
using namespace std;
int main()
{
  int a, b, req, val;
  cin>>a>>b>>req;
  val=powerof(a, b);
  if(val>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
int powerof(int n, int m)
{
    int val1;
    val1=pow(n, m);
    return val1;
}
