import java.util.Scanner;

public class QuadraticEquation {
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double a, b, c;
    double delta, r, r1, r2;

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }

    double getR(){
        r = getC()/getA();
        return r;
    }

    double getR1(){
        r1 = ( - getB() - Math.sqrt(Math.pow(getB(),2) - 4*getA()*getC() ))/(2*getA());
        return r1;
    }

    double getR2(){
        r2 = ( - getB() + Math.sqrt(Math.pow(getB(),2) - 4*getA()*getC() ))/(2*getA());
        return r2;
    }


    double getDiscriminant() {
        delta = Math.pow(getB(), 2) - 4 * getA() * getC();
        return delta;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a");
        double a = input.nextDouble();
        System.out.println("Nhap b");
        double b = input.nextDouble();
        System.out.println("Nhap c");
        double c = input.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a,b,c);


        if (qe.getDiscriminant() < 0) {
            System.out.println("Phuong trinh vo nghiem");
        }if (qe.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co nghiem kep: " + qe.getR());
        }else{
            System.out.println("Phuong trinh co hai nghiem la " + qe.getR1() + " va " +qe.getR2());
        }


    }
}


