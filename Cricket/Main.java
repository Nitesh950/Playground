#include<iostream>
#include<cmath>
#include<iomanip>

using namespace std;

int main()
{
    int a, b, c, d;
    float over1, over2, over3, over4, fin_ov, scale;


    cin>>a>>b>>c>>d;
    over1=a/6;
    cout<<over1<<'\n';
    over1=d/6;
    over2=(d%6)/10.0;
    fin_ov=over1+over2;
    cout<<fin_ov<<'\n';
    over3=c/fin_ov;
    over3 = floor(over3/0.1 +0.5)*0.1;
    cout<<over3<<'\n';
    over4=(b/300.0)*6;
  	over4 = floor(over4/0.1+0.5)*0.1;
    cout<<over4<<'\n';
  if(over3>=over4)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";

}
