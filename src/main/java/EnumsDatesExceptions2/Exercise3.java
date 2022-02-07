package EnumsDatesExceptions2;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TShirtSize.values()));

        for (TShirtSize size: TShirtSize.values()) {
            //size atm is not a string, the data type is TShirtSize
            System.out.println(size.getClass().getSimpleName());

            //to get it to string, need to use .toSTring method OR BETTER YET: .name() as this cannot be overwritten
            String sizelowercase = size.toString().toLowerCase();
            System.out.println("now the type is:"+ sizelowercase.getClass().getSimpleName());
            System.out.println(sizelowercase);
        }
    }
}
