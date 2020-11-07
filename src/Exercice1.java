import java.util.Scanner;

public class Exercice1 {
    public static <Int> void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Entrez le nombre");
        String number = obj.next();
        StringBuilder closestNumber = new StringBuilder(number);
        for(int j= number.length()-1; j >=1;j--){
            char val1 = number.charAt(j);
            char val2 = number.charAt(j-1);
            int lastValue = Character.getNumericValue(val1);
            int firstValue = Character.getNumericValue(val2);
            if(lastValue>firstValue){
                closestNumber.setCharAt(j-1,val1);
                closestNumber.setCharAt(j,val2);
                break;
            }
        }
        System.out.println("Le nombre superieur suivant avec les memes chiffres est: " + closestNumber);
    }
}
