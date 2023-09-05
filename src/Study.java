import java.io.IOException;
import java.util.Scanner;

public class Study {
    public Study(){
        System.out.print("null");
    }
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        String value=input.nextLine();
        String numbers[]=value.split(",");
        int number[]=new int[numbers.length];
        for (int i=0;i<numbers.length;i++) {
            number[i] = Integer.parseInt(numbers[i]);
            for(int y=0;y<4;y++){
                
            }
        }
        System.out.print(input.nextLine());
        input.close();
    }
}
