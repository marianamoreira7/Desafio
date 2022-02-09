import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Desafio {

    public static void main(String[] args){
        List<Double> numbers = new ArrayList<>();
        double maxNumber=0;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        numbers.add(in.nextDouble());
        System.out.println("Digite o numero 2: ");
        numbers.add(in.nextDouble());
        System.out.println("Digite o numero 3: ");
        numbers.add(in.nextDouble());

        for (double number: numbers) {
            if(number>maxNumber)
                maxNumber=number;
        }

        System.out.println("O maior numero eh "+ maxNumber);
        in.close();
    }

}
