
package ejercicio1;


public class Celular {
    //Atributos
    String marca;
    String modelo;
    int anio;
    
    //Método
    public static void main (String [] args){
        Celular celular1 = new Celular();
        
        celular1.marca = "Samsung";
        celular1.modelo = "A30";
        celular1.anio = 2019;
        
        System.out.println("El celular elegido es: "+celular1.marca );
        System.out.println("modelo: "+celular1.modelo);
        System.out.println("Fabricado en el año: "+celular1.anio);
       
    }
}
