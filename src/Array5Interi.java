import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Array5Interi implements Limiti {

int posizione;
    int n1=getRandom(1,10);
    int n2=getRandom(1,10);
    int n3=getRandom(1,10);
    int n4=getRandom(1,10);
    int n5=getRandom(1,10);
    public Integer[] Arr={ n1,n2,n3,n4,n5};
    public Array5Interi(){

    }
    public void getScanner(){

        System.out.println("////ARRAY////");
        
           System.out.println("Inserisci un numero, relativo alla posizione dell'Array:");
        System.out.println("I numeri sono: "+ Arrays.asList(this.Arr));
        Scanner scanner = new Scanner(System.in);
        int inserisci =  scanner.nextInt();
        posizione=inserisci;
        getLimiti();
        this.Arr[inserisci]=0;
        System.out.println("Che numero vuoi inserire in quella posizione?");
        int cambiamento = scanner.nextInt();
        if(cambiamento <=0 || cambiamento>10) {
            System.out.println("Numero non valido");
            getScanner();
        } else {
        }
        this.Arr[inserisci]=cambiamento;
        System.out.println("I numeri sono: "+ Arrays.asList(this.Arr));


    }
    public void getLimiti(){
        try {
            System.out.println(this.Arr[this.posizione]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("La posizione non e' valida");
getScanner();

        }catch (InputMismatchException e){
            System.out.println("Perfavore Inserisci un numero e non una lettera...");
            getScanner();
        }
    }

    @Override
    public void getRandom() {

    }


     static int getRandom(int min, int max){
        Random random = new Random();

       return random.nextInt(max - min +1)+min;
    }
}
