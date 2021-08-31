// Programming Logic Questions

1. Write a code to check if given number is armstrong number or not.

import java.io.*;
class eg1psp
{
public static void main(String gg[])
{
int num,n,result,r;
num=Integer.parseInt(gg[0]);
result=0;
n=num;
while(n>0)
{
r=n%10;
result=result+(r*r*r);
n=n/10;
}
if(result==num) System.out.println(num+" is armstrong number.");
else System.out.println(num+" is not armstrong number.");
}
}


-------------------------------------------------------------------------------------------------

// 2. From an array find 3rd highest value.

import java.io.*;
class eg2psp
{
public static void main(String gg[])
{
int x[]=new int[10];
for(int i=0;i<10;i++) x[i]=Integer.parseInt(gg[i+1]);
int fMax,sMax,tMax;
fMax=Integer.MIN_VALUE;
sMax=Integer.MIN_VALUE;
tMax=Integer.MIN_VALUE;
for(int i=0;i<10;i++) if(fMax<x[i]) fMax=x[i];
for(int i=0;i<10;i++) if(sMax<x[i] && fMax!=x[i]) sMax=x[i];
for(int i=0;i<10;i++) if(tMax<x[i] && sMax!=x[i] && fMax!=x[i]) tMax=x[i];
//System.out.println("first max : "+fMax);
//System.out.println("second max : "+sMax);
System.out.println("third max : "+tMax);
}
}

---------------------------------------------------------------------------------------------------------------

// 3 . Write a code to reverse a number.

import java.io.*;
class eg3psp
{
public static void main(String gg[])
{
int num,n,r,result;
result=0;
num=Integer.parseInt(gg[0]);
n=num;
while(n>0)
{
r=n%10;
result=result*10+r;
n=n/10;
}
System.out.println("Reverse of "+num+" is : "+result);
}
}

----------------------------------------------------------------------------------------------------------------------
