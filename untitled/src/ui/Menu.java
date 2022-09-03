package ui;


import Dol.TempConv;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sin;
public class Menu implements iMenu {
    public String name ;
Scanner scan = new Scanner(System.in);
    @Override
    public void ShowOpt() {
        int opt = 0;
        System.out.println("\n1-Calcular Velocidad MRU");
        System.out.println("2-Trayectoria de proyectil Parabólica");
        System.out.println("3-Número primo");
        System.out.println("4-Factorial de un Numero");
        System.out.println("5-Número Aleatorio /Suma de dos número");
        System.out.println("6-Convertir Decimales a Números Binarios");
        System.out.println("7-Convertidor de Temperaturas");
        System.out.println("7-Salir");
        opt = scan.nextInt();
       optSelct(opt);
    }

    @Override
    public void show() {
        ///System.out.println("Aquí va el menú");
        ShowOpt();
    }
    public static void tempConv(){
        System.out.println("tempConv");
        TempConv tempc= new TempConv();


        tempc.show();

    }
    @Override
    public void optSelct(int opc) {
        subMenu enu = new subMenu();
        switch (opc){
            case 1:
                //Opt1


                break;
            case 2:
                int vel,ang;
                System.out.println("Introduzca la velocidad Inicial");
                vel = scan.nextInt();

                System.out.println("\nIntroduzca el angulo velocidad Inicial");
                ang = scan.nextInt();
                calcularTiroParab(vel,ang);
                show();
                break;
            case 3:
                //opt3

                System.out.println("Ingrese numero");
                numPrim(scan.nextInt());
                show();
                break;
            case 4:
                //opt3
                numFact();
                show();
                break;
            case 5:
                //faren a
                enu.show();

                break;
            case 6:
                //Kevin a Faren
                System.out.println("Ingrese numero decimal");
                System.out.println( "El número Binario ="+ConvertirDeDecimalaBinario(scan.nextLong()));
                show();
                break;
            case 7:
                //volver
                tempConv();

                break;
            case 8:
                System.out.println("Saliendo");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida.");
                    show();
                break;
        }


    }
    private void numPrim(int n){
        int a=0,i;


        for(i=1;i<(n+1);i++){
            if(n%i==0){
                a++;
            }
        }
        if(a!=2){
            System.out.println("No es Primo");
        }else{
            System.out.println("Si es Primo");
        }
    }
    public static String ConvertirDeDecimalaBinario(long decimal) {
        if (decimal <= 0) {
            return "0";
        }
        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            short residuo = (short) (decimal % 2);
            decimal = decimal / 2;
            // Insertar el dígito al inicio de la cadena
            binario.insert(0, String.valueOf(residuo));
        }
        return binario.toString();
    }
    private void numFact(){
        double factorial;
        int num;
        System.out.print("Introduce un número: ");
        num=scan.nextInt();
        factorial=1; // es importante inicializarlo a 1, ya que multiplicará-
        // por ejemplo: el factorial de 10 es:
        // 10*9*8*7*6*5*4*3*2*1
        for (int i=num;i>0;i--)
        {
            factorial=factorial*i;

        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
    private void calcularTiroParab(int velInit, int angInic){
        double alcance,altura;

        alcance = pow(velInit,2)*sin(2*angInic)/9.8;
        altura = pow(velInit,2)*pow(sin(angInic),2)/(2*9.8);
        System.out.println("El alcance del proyectil será" + alcance);
        System.out.println("La altura del proyectil será" + altura);
    }
}
