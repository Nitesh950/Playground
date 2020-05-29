#include<iostream>
using namespace std;
bool isperfect(int no)
{
  int i=0;
  int sum=0;
  while(i++ < no)
  {
    if(no%i==0&&i<no)
      sum=sum+i;
}
  return sum==no;
}
  int main()
  {
    float first;
    float second;
    cin>>first>>second;
    for(int i=first; i<=second; i++)
    {
      if(isperfect(i))
      cout<<i<<" ";
    }
  }