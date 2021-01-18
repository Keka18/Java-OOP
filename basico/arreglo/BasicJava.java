package ejercicio.basico.arreglo;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {

	//aqui se crea las funciones o los metodos
	//Escriba un método que imprima todos los número del 1 al 255.
	
	
	
	void imprim () { //nombre de la funcion o metodo "imprim"
		for (int i=1; i<=255; i++) {
			System.out.println(i); //variable (i)
		}
	}
	
	
	
	
	//Escriba un método que imprima todos los número impares entre el 1 al 255.
	
	
	void imprintimpar () {
		for (int i=1; i<=255; i+=2) {
			System.out.println(i);
		}
	}
	
	
//	Escriba un método que imprima los números desde el 0 hasta el 255, 
//	pero esta vez muestre también las suma de los números que ha mostrado en pantalla hasta ahora. 
//	Por ejemplo, su salida debe ser algo como esto:
	
	void nuevonum () {
		int sum=0; //declarar la variable sum
		for (int i=0; i<=255; i++) {
			 sum=sum + i;//para entender
			 System.out.println("nuevo numero " + i + " suma " + sum);
		}
	}
	
	
	//Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un método que "recorra" cada uno de los elementos del arreglo e imprima cada valor. 
	//Ser capaz de recorrer cada elemento de un arreglo es extremadamente importante.
	
	void recorrerArreglo () {
		int arreglo[] = {1,3,5,7,9,13};
		for (int i=0 ; i< arreglo.length ; i++){ 
			System.out.println(arreglo[i] ); 
			}	
	}
	
	//Escribir un método que tome un arreglo e imprima el valor máximo en el arreglo. 
	//Su método debería funcionar también con todos los números en negativo 
	//(ejemplo [-3,-5,-7]), o incluso una mezcla de números positivos, números negativos y cero.
	
	
	void arregloPrint () {
		int max[] = {-3,-5,-7};
		int maximo = max[0];
		for(int i=0;i<max.length ; i++){
	        if(max[i]>maximo){
	        maximo = max[i];
	        }  
		}
		System.out.println(maximo);	
	}
	
	
	
	
	//Escribir un método que tome un arreglo e imprima el promedio de los valores en el arreglo. 
	//Por ejemplo en un arreglo hay [2,10,3], su método debería Imprimir “Promedio de 5”. 
	//Nuevamente, asegúrese de crear un caso simple y escriba las instrucciones para resolver ese caso primero, 
	//luego pruebe sus instrucciones con casos más complicados.
	
	
	void arregloPrintAvg () {
		int avgProm[] = {2,10,3};
		int suma = 0;
		int Promed = 0;
		for(int i=0;i<avgProm.length ; i++){
		   suma = suma + avgProm [i];
		   Promed = (suma/avgProm.length);
		}
		System.out.println("Promedio de avgProm: " + Promed );
		}
		
		
	
	
	
	//Escribir un método que cree un arreglo ‘y’ que contenga todos los números impares entre 1 - 255. 
	//Cuando el método haya terminado, ‘y’ debe tener los valores de [1,3,5,7…255].
	
	
	
	void arrayImpares (){
		int y[];
		y = new int[256];
		int j = 0;
	 	for(int i=1; i<=255;i++){
	 		
	 		if(i%2!=0) {
	 			y[j] =  i;
	 			j++;
	 		} 
	 				
		}
	 	System.out.println(Arrays.toString(y));
	}
	
	
	void arrayImparesObj() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i =1; i<=255;i+=2) {
			lista.add(i);
		
			
		}
		System.out.println(lista.toString());
		
	}
	
	
	
	
	
	//Escribir un método que tome un arreglo y devuelva el número de valores mayores a un valor Y dado.
	//Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3, 
	//después de terminar el proceso el método debe Imprimir el número 2 (ya que hay 2 valores en el arreglo que son mayores que 3).
	
	
	
	void mayorY (){
	   int sum=0;
	   int arr[] = {1,3,5,7};
	   int Y = 3;
	   for(int i=0;i<arr.length;i++){
	    if(arr[i]>Y){
	        sum++;
	    }
	
	   }
	   System.out.println(sum);
	}
	
	
	
	
	
	//Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un método que multiplique cada valor en el arreglo por sí mismo. 
	//Cuando el método haya terminado, el arreglo x debe contener valores que han sido elevados al cuadrado, digamos [1,25,100,4].
	
	
	 void cuadrado () {
		 int array[] = {1,5,10,-2};
		 
		  for( int i=0;i<=3;i++){
			  array[i] = array [i] * array[i];
			  System.out.println(array[i]);
		    }
		 
		}
	
	 
	
	 
	 
	 
	 
	 //Dado un arreglo x, digamos [1,5,10,-2], escribir un método que reemplace cualquier número negativo por 0. 
	 //Cuando el método haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].
	
	
	void numNeg () {
		int arr[]= {1,5,10,-2};
		  for( int i=0;i<4;i++){
			  if(arr[i]>0){
		      arr [i] = arr[i];
		      
		       }else {     
		    	   arr [i] = 0;       
	}
	
		  }System.out.println(Arrays.toString(arr));
	}
	
		  //Dado un arreglo x, digamos [1,5,10,-2], escribir un método que devuelva un arreglo con el número máximo, 
		  //el número mínimo y el valor promedio que hay en el arreglo x. 
		  //El arreglo devuelto debe contener solo 3 valores [Max, Min, Prom].
	
	
	
	
	void nuevoArray(){
	     int suma=0;
	     int arr[] = {1,5,10,-2}; 
	     int mayor= arr[0];
	     int menor= arr[0];
	     int prom= 0;
	     ArrayList<Integer> lista = new ArrayList<Integer>();
	    for(int i=0;i<4;i++){
	    
	        suma = suma + arr[i];
	        if(arr[i]>mayor){
	            mayor=arr[i];
	           
	        }
	        if(arr[i]<menor){
	            menor=arr[i];
	            
	        }
	    }prom=suma/4;
	    lista.add(mayor);
	    lista.add(menor);
	    lista.add(prom);
	    System.out.println(lista.toString());
	}
	
	// Dado un arreglo x, digamos [1,5,10,7,-2], escribir un método que cambie cada valor por el valor que sigue. 
	//Por ejemplo, cuando el método haya terminado, un arreglo x [1,5,10,7,-2] se convertirá en [5,10,7,-2,0]. 
	//Observe que el último número es 0. El método no necesita ajustarse para los valores que están fuera de los límites.
	
	
	void IntercambiaValores(){
		int arr[] = {1,5,10,7,-2};
	    for( int i=0;i<=4;i++){
	    	if(i==4){
	            arr[i]=0;
	           }if(i<=3) {
	        	   
	        	   arr[i] = (arr[i+1]);
	        	   }
	        
	    } 
		System.out.println(Arrays.toString(arr));
		}
	
	}
	
	
	
	
	
	
	
	
	

