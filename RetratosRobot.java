
public class RetratosRobot{
    public static void main(String[] args) {
        boolean salir = false;
        do {
        int p = Integer.parseInt(IO.readln("Escoge un peinado para el robot (1-4): "));
        int o = Integer.parseInt(IO.readln("Escoge ojos para el robot (1-4): "));
        int n = Integer.parseInt(IO.readln("Escoge nariz y orejas para el robot (1-4): "));
        int bo = Integer.parseInt(IO.readln("Escoge boca para el robot (1-4): "));
        int ba = Integer.parseInt(IO.readln("Escoge barbilla para el robot (1-4): "));

        System.out.println(Pelo(p));
        System.out.println(Orejas(o));
        System.out.println(Nariz(n));
        System.out.println(Boca(bo));
        System.out.println(Barbilla(ba));
        String respuesta = IO.readln("Desea salir?(N/Y) ");
        if (respuesta.equalsIgnoreCase("Y"))
            salir = true;
        } while (salir == false);
        System.out.println("El programa ha finalizado");



    }
    static String Pelo(int p){
        String pelo = "";
        switch (p){
            case 1:
            pelo = "WWWWWWWWW";
            break;
            case 2:
            pelo = "\\\\\\//////";
            break;
            case 3:
            pelo = "\"||||||||\"";
            break;
            case 4:
            pelo = "|||||||||";
        }
        return pelo;
    }
    static String Orejas(int o){
        String orejas = "";
        switch (o){
            case 1:
            orejas = "| o o |";
            break;
            case 2:
            orejas = "|-(· ·)-|";
            break;
            case 3:
            orejas = "|-(o o)-|";
            break;
            case 4:
            orejas = "| \\ / |";
        }
        return orejas;
    }
    static String Nariz(int n){
        String nariz = "";
        switch (n){
            case 1:
            nariz = "@ J @";
            break;
            case 2:
            nariz = "{ \" }";
            break;
            case 3:
            nariz = "[ j ]";
            break;
            case 4:
            nariz = "< - >";
        }
        return nariz;
    }
    static String Boca(int bo){
        String boca = "";
        switch (bo){
            case 1:
            boca = "| === |";
            break;
            case 2:
            boca = "| - |";
            break;
            case 3:
            boca = "| ___ |";
            break;
            case 4:
            boca = "| --- |";
        }
        return boca;
    }
    static String Barbilla(int ba){
        String barbilla = "";
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
        return barbilla;
    }
}
