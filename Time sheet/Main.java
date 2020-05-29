#include<iostream>
#include<cmath>

using namespace std;

int main()
{
    int sun, mon, tue, wed, thu, fri, sat, toth;
    int wage1, wage2, wage3, wage4, wage5, wage6, wage7, fwage1, fwage2;
    cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;

    //sunday
    wage1 = sun*100+0.5*sun*100;
   
    if(mon>8)
       wage2=800+((mon-8)*115);
    else
        wage2= mon*100;
  
    if(tue>8)
        wage3=800+((tue-8)*115);
    else
        wage3= tue*100;
    if(wed>8)
        wage4=800+((wed-8)*115);
    else
        wage4= wed*100;
  
    if(thu>8)
        wage5=800+((thu-8)*115);
    else
        wage5= thu*100;
    if(fri>8)
        wage6=800+((fri-8)*115);
    else
        wage6= fri*100;
    wage7=sat*100+0.25*sat*100;

    toth=mon+tue+wed+thu+fri;
    fwage1= wage2+wage3+wage4+wage5+wage6;
    fwage2= wage2+wage3+wage4+wage5+wage6+wage1+wage7;
    if(toth>40)
    cout<<fwage1+((toth-40)*25+100)+wage1+wage7;
    else
        cout<<fwage2;
}