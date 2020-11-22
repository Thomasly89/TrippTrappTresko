import java.util.Scanner;

public class TrippTrappTresko {
    public static void main(String[] args){

        char [][] spillBrett = {{' ','|',' ','|',' '}, {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},{' ','|',' ','|',' '}};

        printSpillBrett(spillBrett);

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv inn din valgte posisojon (1-9):");

        int pos = scan.nextInt();

        System.out.println(pos);

        switch(pos){
            case 1:
                spillBrett[0][0] = 'X';
                break;
            case 2:
                spillBrett[0][2] = 'X';
                break;
            case 3:
                spillBrett[0][4] = 'X';
                break;
            case 4:
                spillBrett[2][0] = 'X';
                break;
            case 5:
                spillBrett[2][2] = 'X';
                break;
            case 6:
                spillBrett[2][4] = 'X';
                break;
            case 7:
                spillBrett[4][0] = 'X';
                break;
            case 8:
                spillBrett[4][2] = 'X';
                break;
            case 9:
                spillBrett[4][4] = 'X';
                break;
        }
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
}
