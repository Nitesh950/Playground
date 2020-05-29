#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int n, temp, no=0;
    cin>>n;
    temp=n;
    cout<<n<<'\n';
    while(temp!=1)
    {
        if(temp%2==0)
        {
            temp=temp/2;
        }
        else
        {
            temp=3*temp+1;
        }
    cout<<temp<<'\n';
    no=no+1;
    }
    cout<<no;
}
