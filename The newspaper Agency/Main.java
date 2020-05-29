#include<iostream>
using namespace std;
int main()
{
  int w, x, y, TS, Cost, Profit;
    std::cin>>w>>x>>y;
    TS = w*x;
    Cost= TS-w*y;
    Profit=Cost-100;
    std::cout<<Profit;

}