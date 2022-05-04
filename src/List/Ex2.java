package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    /*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> respostas = new ArrayList<String>();

        System.out.println("Telefonou para a vítima?");
        respostas.add(teclado.nextLine());
        System.out.println("Esteve no local do crima?");
        respostas.add(teclado.nextLine());
        System.out.println("Mora perto da vítima?");
        respostas.add(teclado.nextLine());
        System.out.println("Devia para a vítima?");
        respostas.add(teclado.nextLine());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(teclado.nextLine());


        int count=0;
        for(int i=0; i<5;i++){
            if(respostas.get(i).equals("sim")  || respostas.get(i).equals("s") || respostas.get(i).equals("Sim")){
                count++;
            }
        }

        switch (count){
            case(2):
                System.out.println("Suspeita");
                break;
            case(3):
            case(4):
                System.out.println("Cúmplice");
                break;
            case(5):
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
                break;
        }


    }
}
