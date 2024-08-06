class Simcard{

public class SimCardRunner {
    public static void main(String[] args) {
        System.out.println("Start main in SimCardRunner");

        SimCard sim1 = new SimCard("Verizon", "prepaid", 10);
        SimCard sim2 = new SimCard("AT&T", "postpaid", 20);
        SimCard sim3 = new SimCard("T-Mobile", "prepaid", 15);
        SimCard sim4 = new SimCard("Sprint", "postpaid", 25);
        SimCard sim5 = new SimCard("Boost Mobile", "prepaid", 5);
        SimCard sim6 = new SimCard("Cricket", "postpaid", 30);
        SimCard sim7 = new SimCard("MetroPCS", "prepaid", 12);
        SimCard sim8 = new SimCard("Straight Talk", "postpaid", 18);
        SimCard sim9 = new SimCard("Google Fi", "prepaid", 22);
        SimCard sim10 = new SimCard("Xfinity Mobile", "postpaid", 35);
        SimCard sim11 = new SimCard("Mint Mobile", "prepaid", 8);

        System.out.println("SimCard 1 provider: " + sim1.provider);
        System.out.println("SimCard 1 type: " + sim1.type);
        System.out.println("SimCard 1 data limit: " + sim1.dataLimit + " GB");

        System.out.println("SimCard 2 provider: " + sim2.provider);
        System.out.println("SimCard 2 type: " + sim2.type);
        System.out.println("SimCard 2 data limit: " + sim2.dataLimit + " GB");

        System.out.println("SimCard 3 provider: " + sim3.provider);
        System.out.println("SimCard 3 type: " + sim3.type);
        System.out.println("SimCard 3 data limit: " + sim3.dataLimit + " GB");

        System.out.println("SimCard 4 provider: " + sim4.provider);
        System.out.println("SimCard 4 type: " + sim4.type);
        System.out.println("SimCard 4 data limit: " + sim4.dataLimit + " GB");

        System.out.println("SimCard 5 provider: " + sim5.provider);
        System.out.println("SimCard 5 type: " + sim5.type);
        System.out.println("SimCard 5 data limit: " + sim5.dataLimit + " GB");

        System.out.println("SimCard 6 provider: " + sim6.provider);
        System.out.println("SimCard 6 type: " + sim6.type);
        System.out.println("SimCard 6 data limit: " + sim6.dataLimit + " GB");

        System.out.println("SimCard 7 provider: " + sim7.provider);
        System.out.println("SimCard 7 type: " + sim7.type);
        System.out.println("SimCard 7 data limit: " + sim7.dataLimit + " GB");

        System.out.println("SimCard 8 provider: " + sim8.provider);
        System.out.println("SimCard 8 type: " + sim8.type);
        System.out.println("SimCard 8 data limit: " + sim8.dataLimit + " GB");

        System.out.println("SimCard 9 provider: " + sim9.provider);
        System.out.println("SimCard 9 type: " + sim9.type);
        System.out.println("SimCard 9 data limit: " + sim9.dataLimit + " GB");

        System.out.println("SimCard 10 provider: " + sim10.provider);
        System.out.println("SimCard 10 type: " + sim10.type);
        System.out.println("SimCard 10 data limit: " + sim10.dataLimit + " GB");

        System.out.println("SimCard 11 provider: " + sim11.provider);
        System.out.println("SimCard 11 type: " + sim11.type);
        System.out.println("SimCard 11 data limit: " + sim11.dataLimit + " GB");

        System.out.println("end main in SimCardRunner");
    }
}
}
//constructor

//1. Special non-static Method

//2. Init IV during creation

//3. used with new keyword

//4. does not have return type 
// 5. Access-sepcifer ClassName
//6.its explicite
//7.we can use N number of parameter

1