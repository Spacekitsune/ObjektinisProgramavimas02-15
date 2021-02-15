public class TestSuo {
    public static void main(String[] args) {
        int a=10;
        double b = 15.5;

        Suo s1= new Suo(); //objektas s1
        System.out.println(s1.vardas); //pasiima is klases "Suo".
        System.out.println(s1.amzius);
        System.out.println(s1.svoris);

        s1.info ();  // panaudoja objektui metodą.

        Suo s2 = new Suo("Meškis", 15, 10.9); //objektas s2
        System.out.println(s2.vardas); //pasiima is naujai pateiktas reikšmes.
        System.out.println(s2.amzius);
        System.out.println(s2.svoris);

        s2.info ();
        s2.sedeti();
        s2.miegoti();
        s2.valgyti();



    }


}
