class sii
{
    int p=2000,r=3,t=5;    // principle=2000 rupees, rate= 3%, time=3 yrs 
    public static void main(String Shaquib[])
    {
        sii obj= new sii();
        int si= (obj.p*obj.r*obj.t)/100;
        System.out.println("simple interest is "+si+" rupees");
    }
}