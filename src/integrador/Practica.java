package integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Practica {

    /**
     * El programa debera tomar un numero x y determinar si es capicua o no
     * **Contemplar que el num que llega puede ser null,en caso de que sea null,
     * retornar false, en caso que sea capicua retornar true.
     *
     * @param num
     * @return esPalindromo
     */
    public Boolean numeroCapicua(Integer num) {
        
        try{
            
          int faltante=num;
          int numeroInvertido=0;
          int restante=0;  
        
         while(faltante!=0) {
            restante=faltante%10;
            numeroInvertido=numeroInvertido*10+restante;
            faltante=faltante/10;       
         }
        
         if(numeroInvertido==num){                
            return true;
         }
        }catch(NullPointerException e){
            System.out.println("El número es null");
        }
      return false;
    }
    /**
     * Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una
     * vez al mes, se sienta una n cantidad de ladrones en ronda, contemplando
     * al primer ladron que se sienta, como el ladron 0. A los ladrones se le
     * repartira una m cantidad de caramelos contemplando que se comenzaran a
     * repartir los caramelos desde el primer ladron (inicio). El ultimo
     * caramelo en repartirse estara podrido, determinar a que ladron, segun su
     * posicion en la ronda le tocara.
     *
     * @param inicio
     * @param cantidadCaramelos
     * @param cantidadLadrones
     * @return ladronQueLeTocoElCarameloPodrido
     */
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        int aux=0;
        while(cantidadCaramelos > 0 ) {
           for(int i=inicio; i<cantidadLadrones; i++){
            cantidadCaramelos--;
                if (cantidadCaramelos==0){
                    aux=i;
                    break;
                }
            }
           inicio=0;
        } 
        return aux;
    }

    /**
     * En un universo paralelo, donde los habitantes son medias, existe un
     * crucero de medias donde se sube una lista de medias. Esta lista de
     * tripulantes del crucero es una Collection de letras, lo que se debera
     * hacer, es filtrar la lista de medias que se suben al crucero y retornar
     * una lista que contenga los grupos de medias que si tenian amigas. Esta
     * lista final de medias amigas se mostraran ordenadas de menor a mayor. A
     * continuacion un ejemplo:
     *
     * List de medias que llegan : A,B,A,B,C,A,F,Z,C,H **F,Z,H no tienen amigas
     * :(. List que se deberia retornar : A,B,C
     *
     *
     * @param pasajeros
     * @return mediasAmigas
     */
    public List<String> mediasAmigas(List<String> pasajeros) {
        
        List<String> mediasAmigas= pasajeros.stream().distinct().collect(Collectors.toList());
         
         for (String m: mediasAmigas){
             pasajeros.remove(m);
         }
         
      pasajeros = pasajeros.stream().distinct().collect(Collectors.toList());
               
                  
        Collections.sort(pasajeros);
        System.out.println(pasajeros);
        return pasajeros;
    }
}
