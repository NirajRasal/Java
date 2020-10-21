class nestingg

{
	int a,b;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("inner method");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	void display()
	{
		System.out.println("outer method");
		getdata(10,20);
		System.out.println("outer method again");
	}
     public static void main(String args[])
    {
	nestingg a1=new nestingg();
	a1.display();
    } 
}