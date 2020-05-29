#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int r, c, n;
  cin>>r>>c>>n;
   if(n<=c)
     cout<<"Yes";

   else if((n-1)%c==0)
     cout<<"Yes";

   else if(n%c==0)
     cout<<"Yes";

   else
     cout<<"No";
}