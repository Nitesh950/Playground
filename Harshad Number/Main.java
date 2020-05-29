#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int n, dig, sum=0, temp;
    cin>>n;
    temp=n;
    do
    {
      dig=temp%10;
      sum=sum+dig;
      temp=temp/10;
    }while(temp!=0);

    
    if(n%sum==0)
{
    cout<<"Harshad Number";
}
    else{
        cout<<"Not Harshad Number";
}
}
