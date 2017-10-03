import java.util.*;
public class minimum 
{
public static void main(String ar[])throws Exception
{
    int a,b,k;
    int p[]=new int[100];
Scanner sc=new Scanner(System.in);
minimum m1=new minimum();
String a=new String();
a=sc.next();
k=sc.nextInt();
int n=Integer.parseInt(a);
b=0;
while(n>0)
{
a=n%10;
p[b++]=a;
n/=10;
}
m1.sort(p,k,b);
}
public void sort(int l[],int m,int g)
{
    int t;
for(int b=0;b<g-1;b++)
{
for(int j=i+1;j<g;j++)
{
if(l[b]>l[j])
{
t=l[b];
l[b]=l[j];
l[j]=t;
}
}
}
for(int b=0;b<m;b++)
    System.out.print(l[b]);
}
}
