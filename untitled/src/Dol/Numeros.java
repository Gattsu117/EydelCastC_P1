package Dol;

import ui.iMenu;
import ui.subMenu;

import java.util.Scanner;

public class Numeros implements iMenu {
    Scanner scan = new Scanner(System.in);
    public Numeros(){

    }
    public int number1;
    public int number2;
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number) {
        this.number1 = number;
    }


    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }


    @Override
    public void ShowOpt() {

        System.out.println("Ingresa el número1");
        setNumber1(scan.nextInt());

        System.out.println("Ingresa el número2");
        setNumber2(scan.nextInt());


        System.out.println("La suma es" + getNumber1() + getNumber2());

        subMenu subM = new subMenu();


        subM.show();

    }

    @Override
    public void show() {
        ShowOpt();
    }

    @Override
    public void optSelct(int opc) {

    }
}
