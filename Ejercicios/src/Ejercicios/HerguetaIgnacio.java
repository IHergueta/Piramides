package Ejercicios;

import java.util.*;
import java.math.*;

public class HerguetaIgnacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaracion de varibles y clases
		Scanner leer=new Scanner(System.in);
		int cont=0,check=0;
		String letra;
		
		
		System.out.println("\t\t\t\t\t\t\t\t Bienvenido");
		System.out.println("\t\t\t\t\t\t\t\t Registrese");
		do{
			
			System.out.print("\t\t\t\t\t\t\t\t User : ");
			String user=leer.nextLine();
			System.out.println();//Limpio el buffer
			
			System.out.print("\t\t\t\t\t\t\t\t Password: ");
			String pass=leer.nextLine();
			
			//voy imcrementando el contador
			cont++;
			
			//impongo las condiciones
			if(user.equals("Imhotep") && pass.equals("Saqqara")){
				
				System.out.println("\t\t\t\t\t\t\t\t User y Password correctas");
				break;
				
			}else{
				
				//limpio la pantalla escribiendo en blanco
				for(int clear = 0; clear < 1000; clear++)
				  {
				     System.out.println("\b") ;
				  }
				
				System.out.println("\t\t\t\t\t\t\t\t User y Password incorrectas");
				
				
				
				
			}
			
		
		//El limite	
		}while(cont<3);   
		
	
			
			
			
			//Hago el switch case dentro de un do while para controlar la opción correspondiente
			do{
				
				//pinto el menú
				
				System.out.println("\t\t\t\t\t\t\t\t Menú de opciones:");
				System.out.println("\t\t\t\t\t\t\t ------------------------------------");
				System.out.println("\t\t\t\t\t\t\t\t Checklist(L)");
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t Cálculos(C)");
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t Planos de Pirámides(P)");
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t Salir(S)");
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t ------------------------------------");
				System.out.println("\t\t\t\t\t\t\t Eliga la opción según su letra correspondiente");
			    letra=leer.nextLine();
			    
			   
				switch(letra){
				
				case "L"://Checklist
					
					System.out.println("\t\t\t\t\t\t\t Ha entrado usted en el checklist");
					System.out.println("\t\t\t\t\t\t\t ¿Preparado para el test basado en el antiguo Egipto?");
					System.out.println("\t\t\t\t\t\t\t Solo se podrán responder con las respectivas letras");
					System.out.println("\t\t\t\t\t\t\t ------------------------------------");
					//primera pregunta
					System.out.println("\t\t\t\t\t\t\t Primera pregunta:");
					System.out.println("\t\t\t\t\t\t\t ¿Cuál es el centro del universo? ");
					System.out.println("\t\t\t\t\t\t\t Opción A: Españita");
					System.out.println("\t\t\t\t\t\t\t Opción B: Egipto");
					System.out.println("\t\t\t\t\t\t\t Opción C: Dios");
					System.out.print("\t\t\t\t\t\t\t Y la repuesta es...");
					System.out.println();
					String pri=leer.nextLine();
					if(pri.equalsIgnoreCase("B")){
						check++;
					}
					
					//segunda pregunta
					System.out.println("\t\t\t\t\t\t\t Segunda pregunta:");
					System.out.println("\t\t\t\t\t\t\t ¿Qué nombre le damos al cielo? ");
					System.out.println("\t\t\t\t\t\t\t Opción A: Nut");
					System.out.println("\t\t\t\t\t\t\t Opción B: El mar azul");
					System.out.println("\t\t\t\t\t\t\t Opción C: Cristiano Ronaldo");
					System.out.print("\t\t\t\t\t\t\t Y la repuesta es...");
					System.out.println();
					String seg=leer.nextLine();
					if(seg.equalsIgnoreCase("A")){
						check++;
					}
					
					//tercera pregunta
					System.out.println("\t\t\t\t\t\t\t Tercera pregunta:");
					System.out.println("\t\t\t\t\t\t\t ¿Y al más allá? ");
					System.out.println("\t\t\t\t\t\t\t Opción A: La cama");
					System.out.println("\t\t\t\t\t\t\t Opción B: Tutankamón");
					System.out.println("\t\t\t\t\t\t\t Opción C: Duat");
					System.out.print("\t\t\t\t\t\t\t Y la repuesta es...");
					System.out.println();
					String ter=leer.nextLine();
					if(ter.equalsIgnoreCase("c")){
						check++;
					}
					
					//Cuarta pregunta
					System.out.println("\t\t\t\t\t\t\t Cuarta pregunta:");
					System.out.println("\t\t\t\t\t\t\t ¿Nombre del padre del Rey Dyeser? ");
					System.out.println("\t\t\t\t\t\t\t Opción A: Messi");
					System.out.println("\t\t\t\t\t\t\t Opción B: Sanajt");
					System.out.println("\t\t\t\t\t\t\t Opción C: Papa");
					System.out.print("\t\t\t\t\t\t\t Y la repuesta es...");
					System.out.println();
					String cua=leer.nextLine();
					if(cua.equalsIgnoreCase("b")){
						check++;
					}
					
					//quinta pregunta
					System.out.println("\t\t\t\t\t\t\t Quinta pregunta:");
					System.out.println("\t\t\t\t\t\t\t  ¿Sobrenombre del Rey? ");
					System.out.println("\t\t\t\t\t\t\t Opción A: Abderramán III");
					System.out.println("\t\t\t\t\t\t\t Opción B: Ramón");
					System.out.println("\t\t\t\t\t\t\t Opción C: Necherjet");
					System.out.print(" \t\t\t\t\t\t\t Y la repuesta es...");
					System.out.println();
					String qui=leer.nextLine();
					if(qui.equalsIgnoreCase("c")){
						check++;
					}
					
					
					
					
					System.out.println("\t\t\t\t\t\t\t ------------------------------------");
					System.out.println("\t\t\t\t\t\t\t Ha respondido correctamente a "+check+" con lo cual ha fallado un total de "+(5-check));
					System.out.println("\t\t\t\t\t\t\t ------------------------------------");
					
					break;
					
					
				case "C"://Calculos
					
					System.out.println("\t\t\t\t\t\t\t Ha entrado usted en la calculadora de áreas de pirámides");
					System.out.println("\t\t\t\t\t\t\t Para calcular el área de la pirámide");
					System.out.println("\t\t\t\t\t\t\t ------------------------------------");
					System.out.print("\t\t\t\t\t\t\t Deme la altura de la pirámide:");
					float alt=leer.nextFloat();
					
					System.out.print("\t\t\t\t\t\t\t Ahora deme el apotema de la base:");
					float apob=leer.nextFloat();
					
					//hago las distintas operaciones matemáticas
					float solucion = (alt * alt) + (apob  + apob);
			        solucion = (float)Math.sqrt(solucion);
			        
			       
			        
					System.out.println("\t\t\t\t\t\t\t El area de la pirámide es "+solucion);
					
					
					
					break;
					
					
					
				case "P"://Piramides
					
					System.out.println("\t\t\t\t\t\t\t Ha entrado usted en el visualizador de planos de pirámides");
					System.out.println("\t\t\t\t\t\t\t le mostraré la planta, alzado y perfil de la misma pirámide");
					System.out.println("\t\t\t\t\t\t\t ------------------------------------");
					System.out.print("\t\t\t\t\t\t\t Introduzca la altura de la pirámide:");
					int x=leer.nextInt();
					
					//dibujo una de las piramides
					System.out.println("\t\t\t\t\t\t\t Planta:");
					System.out.println("\t\t\t\t\t\t\t ------------------------------------");
					
					//primera pirámide
					for (int i=x;i>0;i--){
			            //Este bucle pinta los asteriscos en cada fila
						for(int j=i;j>0;j--){
							System.out.print("*");
						}
			            //Saltamos de linea
						System.out.println("");
					}
					
					System.out.println("\t\t\t\t\t\t\t Alzado:");
					System.out.println("\t\t\t\t\t\t\t ------------------------------------");
					
					//segunda piramide
					for(int i=0;i<=x;i++){
						System.out.println(" ");
						
						for(int j=0;j<i;j++){
							System.out.print("*");
						}
					}
					
					System.out.println("\t\t\t\t\t\t\t Perfil:");
					System.out.println("\t\t\t\t\t\t\t ------------------------------------");
					
					//tercera piramide
					for(int a = 1; a<=x; a++){
			            //Espacios en blanco
			            for(int b = 1; b<=x-a; b++){
			                System.out.print(" ");
			            }

			            //Asteriscos
			            for(int c=1; c<=(a*2)-1; c++){
			                System.out.print("*");
			            }
			            System.out.println();
			        }
			    
					
					
				break;
					
				
				
				
				
				
					
				}
			
			}while(!letra.equals("S"));
			
			
			System.out.println("Gracias por su visita");
			
			
			
	}

}
