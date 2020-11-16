public class TrippTrappTresko {
    public static void main(String[] args){

        char [][] spillBrett = {{' ','|',' ','|',' '}, {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},{' ','|',' ','|',' '}};
        for (char[] rad : spillBrett){
            for (char r : rad){
                System.out.print(r);
            }
            System.out.println();
        }
    }

}
