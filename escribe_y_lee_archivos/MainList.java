package escribe_y_lee_archivos;


import java.util.*;



public class MainList {
	
	ArrayList<Lista> lis =new ArrayList<Lista>();
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		 Lista list = new Lista ();
	
		
		int opcion;
		do {
			
				
			System.out.println("Elige la opcion que desee:");
			System.out.println("1. opcion cargar datos");
			System.out.println("2. opcion listar datos");
			System.out.println("3. opcion insertar un dato al final de la lista");
			System.out.println("4. opcion elimine un dato indicando su posicion");
			System.out.println("5. opcion indica el numero de datos");
			System.out.println("6. opcion busque por DNI ");
			System.out.println("7. opcion ordene la lista");
			System.out.println("8. opcion busque por nombre");
			System.out.println("9. opcion guarde los datos");
			System.out.println("0. Salir");
			
			
			opcion=sc.nextInt();
			switch (opcion){
			 
			
			case 1:
				list.cargar();
			break;
			
			case 2:
				list.listar();
				
			break;
			
			case 3:
				list.insertar();
			break;	
			
			case 4:
				
				list.eliminar();
				
			break;
			
			case 5:
				list.contar();
			break;
			
			case 6:
				System.out.println("Indique el DNI que busca: ");
				list.buscadni(sc.nextInt());
				
			break;	
			
			case 7:
				
				list.ordenar();
			break;
			
			case 8:
				System.out.println("Indique el nombre que busca: ");
				list.buscarnombre(sc.next());
			
			break;
			
			case 9:
				
				list.guardar();
			
			break;
			
			default:
				System.out.println("bye");
			break;
		
		}
		
	
}
		while (opcion!=0);
	}
		
/*public static void insertaPersona() {

	
			System.out.println("Nombre :");
			String nombre = sc.next();

			System.out.println("Apellidos :");
			String apellidos = sc.next();

			System.out.println("DNI:");
			String dni = sc.next();
			
			System.out.println("Edad:");
			int edad = sc.nextInt();

			System.out.println("Calle :");
			String calle = sc.next();
			
			System.out.println("Numero :");
			int numero = sc.nextInt();

			System.out.println("Código Postal");
			int cp = sc.nextInt();

			System.out.println("Provincia :");
			String provincia=sc.next();
			Lista.insertar(new Persona(nombre,apellidos,dni,edad,calle,numero,cp,provincia));


			
		}*/
		

		
	
		
/*public static void eliminaPersona() {

	
			System.out.println("Linea del nombre a eliminar");
			int pos = sc.nextInt();
	
			Lista.eliminar(pos);
}*/
}