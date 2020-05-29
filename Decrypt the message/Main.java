
#include<iostream>
using namespace std;

int main()
{
    int a, b, c, div, sum=0;
    cin>>b>>c;
    for(a=1;a<(b+c);a++){
        div=(b+c)%a;
    if(div==0)
        sum=sum+a;
        }
    if(sum==(b+c))
        cout<<"They can read the message";
    else
        cout<<"They can't read the message";

}
