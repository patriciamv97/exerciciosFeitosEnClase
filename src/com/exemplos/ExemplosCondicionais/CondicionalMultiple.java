package com.exemplos.ExemplosCondicionais;

public class CondicionalMultiple {
    public void amosarDiaSemana(int num){
        if (num<=7 && num>=1)
            switch (num){
                case 1 : System.out.println("Luns");
                    break;
                case 2 : System.out.println("Martes");
                    break;
                case 3 : System.out.println("Mercores");
                    break;
                case 4 : System.out.println("Xoves");
                    break;
                case 5 : System.out.println("Venres");
                    break;
                case 6 : System.out.println("Sabado");
                    break;
                case 7 : System.out.println("Domingo");
            }
        else
            System.out.println("erro");
    }
    public void amosarDiaSemana2 (int num){
        switch (num) {
            case 1:
                System.out.println("Luns");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Mercores");
                break;
            case 4:
                System.out.println("Xoves");
                break;
            case 5:
                System.out.println("Venres");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("error");

        }
    }
}
