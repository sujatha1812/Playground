#include<iostream>
using namespace std;
int main()
{
int a,b,a1,b1;
std::cin>>a>>b;
if(a>b)
{
  a1=a+1900;
  b1=b+2000;
  std::cout<<b1-a1;
}
else
{
  a1=a+2000;
  b1=b+2000;
  std::cout<<b1-a1;
}
return 0;
}

//Read more on Brainly.in - https://brainly.in/question/16623705#readmore