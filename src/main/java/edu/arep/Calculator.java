package edu.arep;

/**
 * Main
 */
public class Calculator
{
    public static double mean(LinkedList list){
        // Variables temporales, usadas en el calculo de la media
        double mean = 0;
        double sumOfTheMean = 0;
        double n = 0;
        while(list.hasMoreItems()){
            n++;
            sumOfTheMean+= list.next();
        }
        mean = sumOfTheMean/(--n);
        list.restart();
        return mean;
    }


    public static double deviation(LinkedList list){
        // Variables temporales, usadas en el calculo de la desviación
        double mean = mean(list);
        double deviation = 0;
        double sumOfTheDeviation = 0;
        double n = 0;
        while(list.hasMoreItems()){
            n++;
            sumOfTheDeviation+= Math.pow(list.next()-mean,2);
        }
        // Al incluir el "head" dentro de la lista, se agrega un dato basura que es controlado con la siguiente sentencia.
        sumOfTheDeviation-=Math.pow(mean,2);
        deviation = Math.sqrt(sumOfTheDeviation/(n-2));
        list.restart();
        return deviation;


    }
}
