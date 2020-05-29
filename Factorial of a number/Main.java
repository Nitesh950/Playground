#include<iostream>
using namespace std;
int main(){
  int num, pro=1;
  cin>>num;
  for(int i=1; i<=num; i++)
  {
    pro=pro*i;
  }
  cout<<pro;
}