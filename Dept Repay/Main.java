#include<iomanip>
#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x, r, y;
  float inre, amo, disc, fs, rate ;
  cin>>x>>r>>y;
  inre=(x*r*y)/100;
  amo=x+inre;
  disc=inre*2/100;
  fs=amo-disc;
  double scale = 0.01;
  inre = floor(inre/scale +0.5)*scale;
  amo = floor(amo/scale+0.5)*scale;
  disc=floor(disc/scale+0.5)*scale;
  fs=floor(fs/scale+0.5)*scale;
  cout<<inre<<'\n'<<amo<<'\n'<<disc<<'\n'<<fs;

}
