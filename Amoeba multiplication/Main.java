#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int n3, fibo, n1=0, n2=1, n;
    cin>>n;
    for(int i=3; i<=n; i++)
    {
        n3=n2+n1;
        n1=n2;
        n2=n3;
    }
    cout<<n3;

}
