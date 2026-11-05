public class RetratosRobot{
    public static void main(String[] args) {

        int p = Integer.parseInt(IO.readln("Escoge un peinado para el robot (1-4): "));
        int o = Integer.parseInt(IO.readln("Escoge ojos para el robot (1-4): "));
        int n = Integer.parseInt(IO.readln("Escoge nariz y orejas para el robot (1-4): "));
        int bo = Integer.parseInt(IO.readln("Escoge boca para el robot (1-4): "));
        int ba = Integer.parseInt(IO.readln("Escoge barbilla para el robot (1-4): "));

        switch (p){
            case 1:
            System.out.println("WWWWWWWWW");
            break;
            case 2:
            System.out.println("\\\\\\//////");
            break;
            case 3:
            System.out.println("\"||||||||\"");
            break;
            case 4:
            System.out.println("|||||||||");
        }
        switch (o){
            case 1:
            System.out.println("| o o |");
            break;
            case 2:
            System.out.println("|-(· ·)-|");
            break;
            case 3:
            System.out.println("|-(o o)-|");
            break;
            case 4:
            System.out.println("| \\ / |");
        }
        switch (n){
            case 1:
            System.out.println("@ J @");
            break;
            case 2:
            System.out.println("{ \" }");
            break;
            case 3:
            System.out.println("[ j ]");
            break;
            case 4:
            System.out.println("< - >");
        }
        switch (bo){
            case 1:
            System.out.println("| === |");
            break;
            case 2:
            System.out.println("| - |");
            break;
            case 3:
            System.out.println("| ___ |");
            break;
            case 4:
            System.out.println("| --- |");
        }
        switch (ba){
            case 1:
            System.out.println("\\_______/");
            break;
            case 2:
            System.out.println("\\,,,,,,,/");
            break;
            case 3:
            System.out.println("\\......./");
            break;
            case 4:
            System.out.println("\\mmmmmmm/");
        }
    }
}
