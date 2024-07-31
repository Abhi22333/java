class CoilRunner{

public class CoilRunner {
    public static void main(String[] args) {
        System.out.println("Start main in CoilRunner");

        Coil coil1 = new Coil("copper", 100);
        Coil coil2 = new Coil("aluminum", 150);
        Coil coil3 = new Coil("steel", 120);
        Coil coil4 = new Coil("nickel", 130);
        Coil coil5 = new Coil("titanium", 140);
        Coil coil6 = new Coil("brass", 110);
        Coil coil7 = new Coil("bronze", 160);
        Coil coil8 = new Coil("zinc", 170);
        Coil coil9 = new Coil("silver", 180);
        Coil coil10 = new Coil("gold", 190);
        Coil coil11 = new Coil("platinum", 200);

        System.out.println("Coil 1 material: " + coil1.material);
        System.out.println("Coil 1 length: " + coil1.length);

        System.out.println("Coil 2 material: " + coil2.material);
        System.out.println("Coil 2 length: " + coil2.length);

        System.out.println("Coil 3 material: " + coil3.material);
        System.out.println("Coil 3 length: " + coil3.length);

        System.out.println("Coil 4 material: " + coil4.material);
        System.out.println("Coil 4 length: " + coil4.length);

        System.out.println("Coil 5 material: " + coil5.material);
        System.out.println("Coil 5 length: " + coil5.length);

        System.out.println("Coil 6 material: " + coil6.material);
        System.out.println("Coil 6 length: " + coil6.length);

        System.out.println("Coil 7 material: " + coil7.material);
        System.out.println("Coil 7 length: " + coil7.length);

        System.out.println("Coil 8 material: " + coil8.material);
        System.out.println("Coil 8 length: " + coil8.length);

        System.out.println("Coil 9 material: " + coil9.material);
        System.out.println("Coil 9 length: " + coil9.length);

        System.out.println("Coil 10 material: " + coil10.material);
        System.out.println("Coil 10 length: " + coil10.length);

        System.out.println("Coil 11 material: " + coil11.material);
        System.out.println("Coil 11 length: " + coil11.length);

        System.out.println("end main in CoilRunner");
    }
}
}
