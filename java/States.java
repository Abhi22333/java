class States
{
    public static void state(String[] statename)
    {
        System.out.println("running state in states");
        for ( int i=0;i<statename.length;i++)
        {
            System.out.println(statename[i]);

        }
    }
}