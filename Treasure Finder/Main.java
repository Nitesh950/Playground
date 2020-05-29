#include<iostream>
using namespace std;
int main()
{
  int a, b, c, hcf;
  cin>>a>>b>>c;
  if(a>b)
  {
      if(a<c)
        cout<<"The treasure is in box which has number "<<a<<'\n';
      else if(c<b)
        cout<<"The treasure is in box which has number "<<b<<'\n';
      else
        cout<<"The treasure is in box which has number "<<c<<'\n';
  }
  else if(a<b)

  {
      if(b<c)
        cout<<"The treasure is in box which has number "<<b<<'\n';
      else if(c<a)
        cout<<"The treasure is in box which has number "<<a<<'\n';
      else
      cout<<"The treasure is in box which has number "<<c<<'\n';
  }


  int min = (a < b ? a : b);
min = (min < c ? min : c);

for( int i = min; i>0; i--)
{
if(a%i == 0 && b%i == 0 && c%i == 0)
{
  hcf = i;
  break;
  }
}
 cout<<"The code to open the box is "<<hcf;
}
