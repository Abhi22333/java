class States
{
    public static void state(String[] statename)
    {
        System.out.println("running state in states");
        for ( int i=statename.length-1;i>=0;i--)
        {
            System.out.println(statename[i]);

        }
    }
}