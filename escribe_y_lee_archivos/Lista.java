package escribe_y_lee_archivos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Lista  {
	Scanner sc =new Scanner (System.in);
	
	static ArrayList<Persona> personas=new ArrayList<Persona>();
	
	public Lista() {
		
		
	}
	
	public void cargar() {
		
	        try {
	        	
	        	
	        	String cvsSplit=",";	        	
	        	BufferedReader br = new BufferedReader(new FileReader("lista.csv"));
	        	String linea=br.readLine();
	        	while(linea!=null){
	        		
	        		String[] datos=linea.split(cvsSplit) ;	
	        		linea=br.readLine();
	        		personas.add(new Persona(datos[0],datos[1],Integer.parseInt(datos[2]),Integer.parseInt(datos[3]),datos[4],Integer.parseInt(datos[5]),Integer.parseInt(datos[6]),datos[7]));
	        	}
	        	 br.close();
	            
	            
	        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
	            System.out.println("No se encuentra el fichero tenerife.txt");
	        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
	            System.out.println("No se puede leer el fichero tenerife.txt");
	        }
	      
}
	
	public void listar() {
		for (Persona a: personas) {
			System.out.println("Nombre/"+"Apellidos/"+"DNI/"+"Edad/"+"Calle/"+"Numero/"+"CP/"+"Provincia");
		
			System.out.println(a);
		}
	}
		
		
	
	
	public void insertar() {
		System.out.println("\n vamos a introducir los datos de la persona");
		System.out.println("Nombre :");
		String nombre = sc.next();

		System.out.println("Apellidos :");
		String apellidos = sc.next();

		System.out.println("DNI:");
		int dni = sc.nextInt();
		
		System.out.println("Edad:");
		int edad = sc.nextInt();
		
		System.out.println("Numero :");
		int numero = sc.nextInt();


		System.out.println("Calle :");
		String calle = sc.next();
		
		
		System.out.println("Código Postal");
		int cp = sc.nextInt();

		System.out.println("Provincia :");
		String provincia=sc.next();
		


		personas.add(new Persona(nombre,apellidos,dni,edad,calle,numero,cp,provincia));

			

		
	}
	
	public void eliminar () {
		System.out.println("Linea del nombre a eliminar");
		int p = sc.nextInt();

		personas.remove(p);
	}
	
	public  void contar() {
		System.out.println("Existen "+personas.size() + " persnas");
	}
	
	
	public void buscadni(int dni) {
	   
	  ArrayList<Integer> search = new ArrayList<Integer>();
	  
		
		for (Persona busca : personas) {
	    	
	    	search.add(busca.getDni());
	    	
		}
	        if ((search.contains(dni))) {
	        	
	        	
	        	System.out.println(personas.get(search.indexOf(dni)));
	    }
	        else {
	    	System.out.println("el dni no existe");
	    	
	    }
	    
	   } 

	public void buscarnombre (String nom){
		
		ArrayList<String> buscanom = new ArrayList<>();
		
		for (Persona nombres : personas) {
			nombres.getNombre().equalsIgnoreCase(nom);
			buscanom.add(nombres.getNombre());
						
			if (nombres.getNombre().equalsIgnoreCase(nom)||nombres.getNombre().contains(nom)) {
				
				System.out.println(nombres);
			
			}else {
				
				System.out.println(" ");
		
			}
			
		}
	}

		
	
		public void ordenar() {
		 
		 Collections.sort(personas);
		 for (Persona ord: personas) {
			 System.out.println(ord);
		 }
		 
	 }
		 
		public void guardar() {
			
			try {
				
				BufferedWriter escritura = new BufferedWriter(new FileWriter("listas.csv"));
				
				for (Persona listado:personas) {
					
					System.out.println(listado);
					escritura.write(listado+"/n");
								
			}
				escritura.close(); }
			
			catch (Exception e) {
					System.out.print("Ha habído un error");
	}
	

}
}


