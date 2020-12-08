import java.util.Random;
import java.util.Scanner;

public class TrippTrappTresko {
    public static void main(String[] args){

        char [][] spillBrett = {{' ','|',' ','|',' '}, {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},{' ','|',' ','|',' '}};

        printSpillBrett(spillBrett);

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv inn din valgte posisojon (1-9):");

        int spillerPos = scan.nextInt();

        System.out.println(spillerPos);

        plasserebrikke(spillBrett, spillerPos, "spiller");

        Random rand = new Random();
        int cpuPos = rand.nextInt(9) + 1;
        plasserebrikke(spillBrett, cpuPos, "cpu");


        printSpillBrett(spillBrett);
    }
    public static void printSpillBrett(char [][] spillBrett){
        for (char[] rad : spillBrett) {
            for (char r : rad) {
                System.out.print(r);
            }
            System.out.println();
        }
    }
    public static void plasserebrikke(char[][] spillBrett, int pos, String bruker){
        char symbol = ' ';
        if(bruker.equals("spiller")){
            symbol = 'X';
        }
        else if(bruker.equals("cpu")){
            symbol = 'O';
        }
        switch(pos){
            case 1:
                spillBrett[0][0] = symbol;
                break;
            case 2:
                spillBrett[0][2] = symbol;
                break;
            case 3:
                spillBrett[0][4] = symbol;
                break;
            case 4:
                spillBrett[2][0] = symbol;
                break;
            case 5:
                spillBrett[2][2] = symbol;
                break;
            case 6:
                spillBrett[2][4] = symbol;
                break;
            case 7:
                spillBrett[4][0] = symbol;
                break;
            case 8:
                spillBrett[4][2] = symbol;
                break;
            case 9:
                spillBrett[4][4] = symbol;
                break;
            default:
                break;
        }
    }
}
