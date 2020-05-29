#include<iostream>
using namespace std;
int main()
{
  int a, b, c, d, e, f, g, h, i;
  float fp1, fp2, fp3, val1, val2, val3;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  //flipkart
  val1=b/100.0;
  val2=a*val1;
  val3=a-val2;
  fp1=val3+c;
  cout<<"In Flipkart Rs."<<fp1<<'\n';
//snapdeal
    val1=e/100.0;
  val2=d*val1;
  val3=d-val2;
  fp2=val3+f;
  cout<<"In Snapdeal Rs."<<fp2<<'\n';
  //amazon
    val1=h/100.0;
  val2=g*val1;
  val3=g-val2;
  fp3=val3+i;
  cout<<"In Amazon Rs."<<fp3<<'\n';
  if(fp1<=fp2)
  {
      if(fp1<fp3)
        cout<<"He will prefer Flipkart";
      else
        cout<<"He will prefer Amazon";
  }
  else
    cout<<"He will prefer Snapdeal";


}
