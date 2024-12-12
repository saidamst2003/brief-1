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
        //System.out.println("donner premier nombre:");
       // int a= sc.nextInt();
       // System.out.println("donner deuxiem nombre:");
        //int b= sc.nextInt();
        switch (s){
            case 1:

                System.out.println("donner premier nombre:");
                int a= sc.nextInt();
                System.out.println("donner deuxiem nombre:");
                int b= sc.nextInt();
                Addition(a,b);

                break;
            case 2:
                System.out.println("donner premier nombre:");
                int s1= sc.nextInt();
                System.out.println("donner deuxiem nombre:");
                int s2= sc.nextInt();
                Soustraction(s1, s2);
                break;
            case 3:
                System.out.println("donner premier nombre:");
                int m1= sc.nextInt();
                System.out.println("donner deuxiem nombre:");
                int m2= sc.nextInt();
                Multiplication(m1,m2);
                break;
            case 4:
                System.out.println("donner premier nombre:");
                int v1= sc.nextInt();
                System.out.println("donner deuxiem nombre:");
                int v2= sc.nextInt();
                Division(v1,v2);
                break;
            case 5:
                System.out.println("donner premier nombre:");
                int l1= sc.nextInt();
                System.out.println("donner deuxiem nombre:");
                int l2= sc.nextInt();
               Puissance(l1,l2);
                break;
            case 6:
                System.out.println("donner un nombre:");
                int u= sc.nextInt();
                RacineCarrée(u);
                break;
            case 7:
                System.out.println("donner un nombre:");
                int z= sc.nextInt();
                Factorielle(z);
                break;
            case 8:
                return ;
        }

    }
    }

    public static void Addition(double a,double b){
        System.out.println("addition : " + (a+b));

    }
    public static void Soustraction(double a,double b){
        System.out.println("soustraction : " + (a-b));

    }
    public static void Multiplication(double a,double b){
        System.out.println("Multiplication  : " + (a*b));

    }
   /* public static void Division(int a,int b){
        while (b==0){
            System.out.println(" error : entrer un nombre different de 0!! ");
            Scanner sc = new Scanner(System.in);
          b = sc.nextInt();
        }
        System.out.println("Division  : " + (a/b));

    }*/
   public static void Division(double a, double b) {
       if (b==0){
           System.out.println("error : la division par 0 est impossible!!");
       }else {
           System.out.println("Division  : " + (a/b));
       }

   }
    public static void Puissance(double a, double b){
        System.out.println("Puissance : " + Math.pow(a,b));

    }
    public static void RacineCarrée(double a){
     if(a<0){
         System.out.println("error: impossible de calculer un racine d/'un nombre negatif!!");
     }else {
         System.out.println("RacineCarrée : " + Math.sqrt(a));
     }
    }
    public static void Factorielle(double a){
        int fact=1;
        if (a==1||a==0) {
            fact =1;
        }else{
            for (int i=2;i<=a;i++){
                fact = fact * i;
            }
        }

        System.out.println(" Factorielle  : " + fact );


    }
}

