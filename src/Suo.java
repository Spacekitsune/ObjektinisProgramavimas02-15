public class Suo {
    String vardas= "Ozis";
    int amzius =5;
    double svoris =50.5;

    Suo(){

    }

    public Suo(String vardas, int amzius, double svoris) {
        this.vardas = vardas;
        this.amzius = amzius;
        this.svoris = svoris;
    }

    public void valgyti(){
        System.out.println(this.vardas + " " +"Niam niam");
    }

    public void sedeti() {
        System.out.println(this.vardas + " " + "Sedziu");
    }

    public void miegoti() {
        System.out.println(this.vardas + " " +"Zzzzz....");
    }

    public void info() {
        System.out.println(this.vardas + " " + this. amzius + " " + this.svoris);
    }


}
