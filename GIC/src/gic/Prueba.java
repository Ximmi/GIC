package gic;
import java.util.*;
public class Prueba {
    ArrayList <Character> cadena=new ArrayList<>();
    ArrayList<Character> pila= new ArrayList<>();
    Scanner scan =new Scanner(System.in);
    
    Prueba(){
        lectura();
        pila();
    }
    
    void lectura(){
        boolean repetir=true;
        int res;
        String aux;
        
            System.out.println("Ingresa un palíndromo de los caracteres {0, 1, a, b, c}");
            aux=scan.nextLine();
            if(comprueba_cad(aux)){
                agrega_cad(aux);
                System.out.println("Palindormo= " + cadena); 
            }
            else{
                System.out.println("Por favor ingresa otra cadena");
                lectura();
            }
        
    }
    boolean comprueba_cad(String aux){
        boolean retorno=true;
        int i=0;
        while(retorno && i<aux.length()){
            if(aux.charAt(i)=='0' || aux.charAt(i)=='1' || aux.charAt(i)=='a' || aux.charAt(i)=='b' || aux.charAt(i)=='c'){
               i++;
            }
            else{
               retorno=false;
            }
        }
        return retorno;
    }  
    void agrega_cad(String aux){
        for(int i=0; i<aux.length(); i++){
            cadena.add(aux.charAt(i));
        }
    }
    
    void pila(){
        boolean fin=false;
        int cont=0, min=0, red;
        int midi=(cadena.size()/2)-1;
        int longi=cadena.size();
        int max=longi-1;
        //System.out.println("midi ="+ midi);

            while(fin==false && cont<=longi-1){
                //System.out.println("cadena.get=" + cadena.get(cont)+ " cont= " + cont);
                if(cont>=longi-1){
                    fin=true;
                    break;
                }
                else{
                    if(min<=midi && max>midi){
                        if(cadena.get(min)!=cadena.get(max)){    
                            pila.add('F');     
                        }      
                    }
                    min++;
                    max--;
                    cont++;
                
                }
            }
      
        if(pila.isEmpty()){
            System.out.println("Sí es palíndromo");
        }
        else{
            System.out.println("No es palíndromo");
        }
       
    }
            
}
