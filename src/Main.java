import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while(true){
        System.out.println("-------------Menu------------\n");
        System.out.println("1- Addition (+)\n");
        System.out.println("2- Soustraction (-)\n");
        System.out.println("3- Multiplication (*)\n");
        System.out.println("4- Division(/)\n");
        System.out.println("5- Puissance\n");
        System.out.println("6- Racine carrée\n");
        System.out.println("7- Factorielle\n");

        System.out.println("choisir votre choix:");
        Scanner sc= new Scanner(System.in);
        int s= sc.nextInt();
        System.out.println("donner premier nombre:");
        int a= sc.nextInt();
        System.out.println("donner deuxiem nombre:");
        int b= sc.nextInt();
        switch (s){
            case 1:
                Addition(a,b);
                break;
            case 2:
                Soustraction(a,b);
                break;

