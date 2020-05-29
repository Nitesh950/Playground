#include<iostream>
int main()
{
  int num1, num2, sum, dif, mult, div, mod;
  std::cin>>num1>>num2;
  sum=num1+num2;
  dif=num1-num2;
  mult=num1*num2;
  div=num1/num2;
  mod=num1%num2;
  std::cout<<"a+b="<<sum<<"\na-b="<<dif<<"\na*b="<<mult<<"\na/b="<<div<<"\na%b="<<mod;
  
}