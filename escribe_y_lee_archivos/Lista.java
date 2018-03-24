package escribe_y_lee_archivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Lista  {
	
	static ArrayList<Persona> personas=new ArrayList<Persona>();
	
	
	public Lista() {
		
		
	}
	
	public  void cargar() {
		
	        try {
	        	
	        	ArrayList<String[]> datos=new ArrayList<String[]>();
	        	
	        	
	        	BufferedReader br = new BufferedReader(new FileReader("lista.csv"));
	        	String linea=br.readLine();
	        	while(linea!=null){
	        	datos.add(linea.split(","));
	        	linea=br.readLine();
	        	}
	        	 br.close();
	            
	            
	        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
	            System.out.println("No se encuentra el fichero tenerife.txt");
	        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
	            System.out.println("No se puede leer el fichero tenerife.txt");
	        }
	      
	    }
	
	
		
			
	public void listar() {
		
	Lista listardt = new Lista();
	listardt.cargar();
	
	System.out.println(listardt);
			
		}
		
		
	
	
	public static void insertar(Persona c) {
		personas.add(c);

			

		
	}
	
	public static void eliminar (int p) {
		
		personas.remove(p);
	}
	
	public  void contar() {
		System.out.println("Existen "+personas.size() + " persnas");
	}
	
	
	public void buscadni(String dni) {
	   
	  ArrayList<String> search = new ArrayList<String>();
	  
		
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

	
		
		
	
		public void ordenar() {
		 
		 Collections.sort(personas);
		 for (Persona ord: personas) {
			 System.out.println(ord);
		 }
		 
	 }
		 
	
	
}
	


