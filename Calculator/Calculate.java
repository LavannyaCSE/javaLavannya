public class Calculate
{
    public int add(int a,int b)
    {
    return a+b;}
    public int substract(int a,int b)
    {
        return a-b;
    }
    public int multiply(int a,int b)
    {
        return a*b;}
        public int divide(int a,int b)
        {
            return a/b;}
            public static void main(String args[])
        {
            Calculate obj=new Calculate();
            int c=obj.add(10,20);
            int d=obj.substract(40,30);
            int f=obj.multiply(5,12);
            int j=obj.divide(110,90);
            System.out.println(c);
            System.out.println(d);
            System.out.println(f);
            System.out.println(j);
        }
        }
    
