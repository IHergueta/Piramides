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
		
	
			
			
			
			//Hago el switch case dentro de un do while para controlar la opci�n correspondiente
			do{
				
				//pinto el men�
				
				System.out.println("\t\t\t\t\t\t\t\t Men� de opciones:");
				System.out.println("\t\t\t\t\t\t\t ------------------------------------");
				System.out.println("\t\t\t\t\t\t\t\t Checklist(L)");
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t C�lculos(C)");
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t Planos de Pir�mides(P)");
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t Salir(S)");
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t ------------------------------------");
				System.out.println("\t\t\t\t\t\t\t Eliga la opci�n seg�n su letra correspondiente");
			    letra=leer.nextLine();
			    
			   
				switch(letra){
				
				case "L"://Checklist
					
					System.out.println("\t\t\t\t\t\t\t Ha entrado usted en el checklist");
					System.out.println("\t\t\t\t\t\t\t �Preparado para el test basado en el antiguo Egipto?");
					System.out.println("\t\t\t\t\t\t\t Solo se podr�n responder con las respectivas letras");
					System.out.println("\t\t\t\t\t\t\t ------------------------------------");
					//primera pregunta
					System.out.println("\t\t\t\t\t\t\t Primera pregunta:");
					System.out.println("\t\t\t\t\t\t\t �Cu�l es el centro del universo? ");
					System.out.println("\t\t\t\t\t\t\t Opci�n A: Espa�ita");
					System.out.println("\t\t\t\t\t\t\t Opci�n B: Egipto");
					System.out.println("\t\t\t\t\t\t\t Opci�n C: Dios");
					System.out.print("\t\t\t\t\t\t\t Y la repuesta es...");
					System.out.println();
					String pri=leer.nextLine();
					if(pri.equalsIgnoreCase("B")){
						check++;
					}
					
					//segunda pregunta
					System.out.println("\t\t\t\t\t\t\t Segunda pregunta:");
					System.out.println("\t\t\t\t\t\t\t �Qu� nombre le damos al cielo? ");
					System.out.println("\t\t\t\t\t\t\t Opci�n A: Nut");
					System.out.println("\t\t\t\t\t\t\t Opci�n B: El mar azul");
					System.out.println("\t\t\t\t\t\t\t Opci�n C: Cristiano Ronaldo");
					System.out.print("\t\t\t\t\t\t\t Y la repuesta es...");
					System.out.println();
					String seg=leer.nextLine();
					if(seg.equalsIgnoreCase("A")){
						check++;
					}
					
					//tercera pregunta
					System.out.println("\t\t\t\t\t\t\t Tercera pregunta:");
					System.out.println("\t\t\t\t\t\t\t �Y al m�s all�? ");
					System.out.println("\t\t\t\t\t\t\t Opci�n A: La cama");
					System.out.println("\t\t\t\t\t\t\t Opci�n B: Tutankam�n");
					System.out.println("\t\t\t\t\t\t\t Opci�n C: Duat");
					System.out.print("\t\t\t\t\t\t\t Y la repuesta es...");
					System.out.println();
					String ter=leer.nextLine();
					if(ter.equalsIgnoreCase("c")){
						check++;
					}
					
					//Cuarta pregunta
					System.out.println("\t\t\t\t\t\t\t Cuarta pregunta:");
					System.out.println("\t\t\t\t\t\t\t �Nombre del padre del Rey Dyeser? ");
					System.out.println("\t\t\t\t\t\t\t Opci�n A: Messi");
					System.out.println("\t\t\t\t\t\t\t Opci�n B: Sanajt");
					System.out.println("\t\t\t\t\t\t\t Opci�n C: Papa");
					System.out.print("\t\t\t\t\t\t\t Y la repuesta es...");
					System.out.println();
					String cua=leer.nextLine();
					if(cua.equalsIgnoreCase("b")){
						check++;
					}
					
					//quinta pregunta
					System.out.println("\t\t\t\t\t\t\t Quinta pregunta:");
					System.out.println("\t\t\t\t\t\t\t  �Sobrenombre del Rey? ");
					System.out.println("\t\t\t\t\t\t\t Opci�n A: Abderram�n III");
					System.out.println("\t\t\t\t\t\t\t Opci�n B: Ram�n");
					System.out.println("\t\t\t\t\t\t\t Opci�n C: Necherjet");
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
					
					System.out.println("\t\t\t\t\t\t\t Ha entrado usted en la calculadora de �reas de pir�mides");
					System.out.println("\t\t\t\t\t\t\t Para calcular el �rea de la pir�mide");
					System.out.println("\t\t\t\t\t\t\t ------------------------------------");
					System.out.print("\t\t\t\t\t\t\t Deme la altura de la pir�mide:");
					float alt=leer.nextFloat();
					
					System.out.print("\t\t\t\t\t\t\t Ahora deme el apotema de la base:");
					float apob=leer.nextFloat();
					
					//hago las distintas operaciones matem�ticas
					float solucion = (alt * alt) + (apob  + apob);
			        solucion = (float)Math.sqrt(solucion);
			        
			       
			        
					System.out.println("\t\t\t\t\t\t\t El area de la pir�mide es "+solucion);
					
					
					
					break;
					
					
					
				case "P"://Piramides
					
					System.out.println("\t\t\t\t\t\t\t Ha entrado usted en el visualizador de planos de pir�mides");
					System.out.println("\t\t\t\t\t\t\t le mostrar� la planta, alzado y perfil de la misma pir�mide");
					System.out.println("\t\t\t\t\t\t\t ------------------------------------");
					System.out.print("\t\t\t\t\t\t\t Introduzca la altura de la pir�mide:");
					int x=leer.nextInt();
					
					//dibujo una de las piramides
					System.out.println("\t\t\t\t\t\t\t Planta:");
					System.out.println("\t\t\t\t\t\t\t ------------------------------------");
					
					//primera pir�mide
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
