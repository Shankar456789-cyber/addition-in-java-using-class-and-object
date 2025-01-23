class Abc
{
    int a,b;
    void input(int val1,int val2)
    {
        a=val1;
        b=val2;
    }
}
class additionusingclassandobject
{
    public static void main(String []args)
    {
        int c;
        Abc obj=new Abc();
        obj.input(10,20);
        c=obj.a+obj.b;
        System.out.println("Result="+c);
    }
}

    

