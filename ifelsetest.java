class ifelsetest
{
public static void main(String args[])
{
int number[]={10,12,14,17,18};
int even=0,odd=0;
for(int i=0;i<number.length;i++)
{
if(number[i]%2==0)
{
even+=1;
}
else
{
odd+=1;
}
}
System.out.println("even numbers:\t"+even);
System.out.println("odd numbers:\t"+odd);
}
}