import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink extends Food {
    final static int AGE_ALCOHOL = 18;
    private String sodaWater;
    private String alcoholic;

    public Drink(String name, int calorie) {
        super(name, calorie);
    }

    public void openAndDrink(Drink drink) throws IOException {

        if (sodaWater.toLowerCase().compareTo("да") == 0) {
            System.out.println("Пшш");
        } else {
            System.out.println("Скр");
        }

        if (alcoholic.toLowerCase().compareTo("да") == 0) {
            System.out.println("How old are you?");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int age = Integer.parseInt(br.readLine());
            if (age < AGE_ALCOHOL)
                System.out.println("NO!!!");
        }
    }
}
