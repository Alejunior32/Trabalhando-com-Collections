package List;

//Faça um programa que receba a temperatura média dos 6 primeiros
//meses do ano e armazene-as em uma lista.
//Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas
//acima desta média e em que mês elas ocorreram(mostar o mês por extenso: 1-Janeiro, 2-Fevereiro e etc);

import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class EX1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Double> temperatura = new ArrayList<Double>();
        double soma = 0d;

        System.out.println("Informe a temperatura média dos 6 primeiros meses: ");

        for(int i=0;i<6;i++){
            temperatura.add(teclado.nextDouble());
            soma+=temperatura.get(i);
        }

        System.out.println("Temperaturas: "+temperatura.toString());
        System.out.printf("Média: %.1f\n",(soma/temperatura.size()));

        int count =0;
        Iterator<Double> iterator = temperatura.iterator();
        while(iterator.hasNext()){
            double temp = iterator.next();
            if(temp>(soma/ temperatura.size())){
                switch (count){
                    case(0):
                        System.out.printf("1-Janeiro, %.1f\n", temp);
                        break;
                    case(1):
                        System.out.printf("2-Fevereiro, %.1f\n",temp);
                        break;
                    case(2):
                        System.out.printf("3-Março, %.1f\n",temp);
                        break;
                    case(3):
                        System.out.printf("4-Abril, %.1f\n", temp);
                        break;
                    case(4):
                        System.out.printf("5-Maio, %.1f\n", temp);
                        break;
                    case(5):
                        System.out.printf("6-Junho, %.1f\n",temp);
                        break;
                    default:
                        System.out.printf("Não houve temperatura acima da média.");
                        break;
                }
            }
            count ++;
        }

    }



}
