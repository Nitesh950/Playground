#include<iostream>
int main(){
  int val1;
  std::cin>>val1;
  val1%=2;
  (val1==0)? std::cout<<"Possible":std::cout<<"Not possible";
}
