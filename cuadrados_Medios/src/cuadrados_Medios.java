import java.util.Scanner;
import java.lang.Math;

public class cuadrados_Medios {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        long n = 0,it = 0,f,xi1;
        String r,y,sn3;
        int t1,t2,pc;
        boolean cont = true;
    do
    {
        System.out.println("--------------------------------");
        System.out.println("METODO DE CUADRADOS MEDIOS\n");
        System.out.println("Escribe el numero a evaluar: ");
        n = datos.nextLong(); //Recibe el valor como cadena
        t1 = String.valueOf(n).length(); // longitud del numero ingresado
        while (String.valueOf(n).length()<3) // Si el numero ingresado es menor a que 3 entra el while 
            {
                System.out.println("El numero ingresado es menor a 3 digitos. Por favor ingresa un numero mayor a 3 digitos");
                n =datos.nextLong(); //El numero ingresado por el usuario a evaluar (SEMILLA) ó (xi)
            }
            System.out.println("Ingresa la cantidad para iterar: ");
            while (!datos.hasNextLong()) //Compara si el caracter ingresado es numerico
            {
                System.out.println("Error: El caracter ingresado no es un numero. Ingreso de nuevo.");
                datos.next();
            }
            it = datos.nextLong(); //numero de iteraciones
            
            System.out.println("------------------------------------------------------------------");
            System.out.println("| Iteracion |     Xi    |    y= xi^2 |     xi+1  |     nvalor |     ri+1  |");
            for (int i = 0; i < it; i++ )
            {
                long xa = n; // Guarda el valor
                f = (long) Math.pow(n, 2); //Elevacion al cuadrado
                y = Long.toString(f); //Convierte la variable f a cadena
                t2 = y.length(); //Obtiene la longitud de la cadena y 
                pc = (t2-t1)/2; //Calcula el primer caracter a extraer 
                sn3 = y.substring(pc,pc+t1); //Sustrae los caracteres 
                xi1 = Integer.parseInt(sn3); //Convierte sn3 a un numero entero 
                n = xi1;//Actualiza valor
                    float ri1 = (float)xi1/10000; //Divide el valor de xi1 
                System.out.printf("| %9d | %9d | %9s | %9s | %9d | %9f |\n",i,xa,y,sn3,n,ri1);
            }
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Deseas seguir realizando operaciones? (s/n)");
            r = datos.next();
            cont = r.equalsIgnoreCase("s");
            datos.nextLine();
    }while (cont);
        
    }
}
