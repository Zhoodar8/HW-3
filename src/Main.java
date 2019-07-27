public class Main {


    public static void main(String[] args) {

        String names[] = new String[3];
        names[0] = "Ban";
        names[1] = "Mick";
        names[2] = "Ford";


        for (String name : names) {


            switch (name) {

                case "Ban":
                    System.out.println("Доброе утро!" + name);
                    break;

                case "Mick":
                    System.out.println("Добрый день!" + name);
                    break;

                case "Ford":
                    System.out.println("Добрый вечер!" + name);
                    break;






            }
        }
    }

}

