#include<iostream>
#include<cmath>
using namespace std;
int power(int m,int n)
{
    int val1;
  val1=pow(m, n);
  return val1;
}

int digits(int n)
{
    int m ,digits=0;
  do
  {
    n=n/10;
    digits++;
  }while(n!=0);
  m=digits;
  return m;
}
int arm(int n)
{

int a, last, val2=0;
a=digits(n);
  while(n!=0)
  {

    last=n%10;
    val2= val2+power(last, a);
    n=n/10;
  }

  return val2;
}
int main()
{
    int n, finalv, deff;
    std::cin>>n;
    deff=arm(n);

    finalv=deff%n;
    
    if(finalv==0)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";

}
