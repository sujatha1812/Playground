#include <iostream>
using namespace std;
int main() {
int hours1, minutes1, seconds1;
int hours2, minutes2, seconds2;
int diff_hours, diff_minutes, diff_seconds;
cin >> hours1 >> minutes1 >> seconds1;
cin >> hours2 >> minutes2 >> seconds2;
if(seconds2 > seconds1) 
{
  minutes1--;
  seconds1 += 60;
}
  diff_seconds = seconds1 - seconds2;
  if(minutes2 > minutes1) 
  {
    hours1--;
    minutes1 += 60;
  }
  diff_minutes = minutes1 - minutes2;
  diff_hours = hours1 - hours2;
  cout<< diff_hours <<":"<< diff_minutes <<":"<<diff_seconds;
  return 0;
}
