public class StaticExample {
    static int a;           // static variable
    int b;           // instance variable

    public static void Main(String[] args)
    {

            StaticExample stat_eg1 = new StaticExample();
            stat_eg1.a=5;
            stat_eg1.b=7;
            StaticExample stat_eg2 = new StaticExample();
            stat_eg2.a=4;
            stat_eg2.b=9;
            System.out.println(stat_eg1.a);

    }
}
