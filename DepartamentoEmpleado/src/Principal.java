

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.InputMismatchException;

public class Principal {

	public static int TAM = 2;
	public static Departamento[] departamentos = new Departamento[TAM];
	public static InputStreamReader isr = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(isr);
	public static int numeroDepartamentos;
	public static boolean numeroEmpleado;
	public static int posicionInsercciones;
	public static Empleado[] empleadosVentas = new Empleado[TAM];
	public static Empleado[] empleadosInnovacion = new Empleado[TAM];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// menu();
		cargaAutomaticaPorComposicion();
		// cargaAutomaticaPorAgregacion();
		System.out.println(insertarDepartamentoSinEmpleado(2, "Programadores", "Chicago"));

	}

	public static void menu() throws NumberFormatException, IOException {
		int opcion;
		do {
			System.out.println("MENU");
			System.out.println("1. Menu Departamentos");
			System.out.println("2. Menu Empleados");
			System.out.println("0. Salir");
			try {
				System.out.println("Seleccione una opcion: ");
				opcion = Integer.parseInt(br.readLine());
			} catch (InputMismatchException ime) {
				opcion = 100;
			}
			switch (opcion) {
			case 1:
				menuDepartamento();
				break;
			case 2:
				menuEmpleado();
				break;
			case 0:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (opcion != 0);
	}

	public static void menuDepartamento() throws NumberFormatException, IOException {
		int opcion;
		do {
			System.out.println("MENU");
			System.out.println("1. Mostrar Departamento");
			System.out.println("2. Insertar Departamento");
			System.out.println("3. Borrar Departamento");
			System.out.println("4. Modificar Atributo de un Departamento");
			System.out.println("5. Busqueda de un departamento");
			System.out.println("0. Volver");
			try {
				System.out.println("Selecccionar opcion:");
				opcion = Integer.parseInt(br.readLine());
			} catch (InputMismatchException ime) {
				opcion = 100;

			}
			switch (opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (opcion != 0);
	}

	public static void menuEmpleado() throws NumberFormatException, IOException {
		int opcion;
		do {
			System.out.println("MENU");
			System.out.println("1. Mostrar Empleado");
			System.out.println("2. Insertar Empleado");
			System.out.println("3. Borrar Empleado");
			System.out.println("4. Modificar atributo de un empleado");
			System.out.println("5. Busqueda de un empleado");
			System.out.println("0. Volver");
			try {
				System.out.println("Seleccione una opcion: ");
				opcion = Integer.parseInt(br.readLine());
			} catch (InputMismatchException ime) {
				opcion = 100;
			}
			switch (opcion) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 0:

				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (opcion != 0);
	}

	public static void cargaAutomaticaPorComposicion() {
		departamentos[0] = new Departamento(1, "Ventas", "Barcelona"); // Creo el primer Departamento por composicion
		// departamentos[1] = new Departamento(30, "Innovacion", "Helechosa de los
		// montes"); // Creo el segundo
		// Departamento por
		// composicion
		numeroDepartamentos = 1;
		posicionInsercciones = 1;
	}

	public static void cargaAutomaticaPorAgregacion() {
		// Creo el primer Departamento por agregacion
		departamentos[0] = new Departamento(1, "Ventas", "Barcelona", empleadosVentas);
		// Creo el segundo Departamento por agregacion
		departamentos[1] = new Departamento(30, "Innovacion", "Helechosa de los montes", empleadosInnovacion);
		// Creo los empleados de los 2 departamentos
		empleadosVentas[0] = new Director(10, "María", LocalDate.of(1964, 03, 17), 3000, departamentos[0]);
		empleadosVentas[1] = new Analista(20, "Luis", LocalDate.of(1980, 04, 10), 2600, 200, departamentos[0]);
		empleadosInnovacion[0] = new Director(30, "Ana", LocalDate.of(1960, 11, 15), 5000, departamentos[1]);
		empleadosInnovacion[1] = new Analista(40, "Alba", LocalDate.of(1984, 02, 29), 6000, 200, departamentos[1]);
		numeroDepartamentos = 2;
		posicionInsercciones = 2;
	}


	public static boolean departamentoLleno(Departamento d) {
	
		if (numeroDepartamentos == TAM) {
			return true;
		} else {
			return false;
		}
		empleadolleno(d); 	//llamamos al metodo 
	}

	public static boolean departamentoVacio(Departamento d) {
		if (numeroDepartamentos == 0) {
			return true;
		} else {
			return false;
		}
		empleadovacio(d); 	//llamamos al metodo
	}

	public static void listadoAutomatico() {
		for (int i = 0; i < departamentos.length; i++) {
			if (departamentos[i] != null) {
				System.out.println("Departamento: Numero Departamento: " + departamentos[i].getDept_no() + " Nombre: "
						+ departamentos[i].getDnombre() + " Localizacion: " + departamentos[i].getLocalizacion());
				departamentos[i].mostrarEmpleados();
				System.out.println();
			}
		}
		System.out.println("Tenemos " + numeroDepartamentos + " departamentos -- ");
		if (!departamentoLleno()) {
			System.out.println("La posicion para la siguiente inseccion es: " + (posicionInsercciones + 1));
		} else {
			System.out.println("Los departamentos están llenos");
		}
	}
	
	private static boolean departamentoLleno() {
		// TODO Auto-generated method stub
		return false;
	}

	public static int insertarDepartamentoSinEmpleado(int dept_no, String dnombre, String localizacion) {
		int posicion = -1;
		if (!departamentoLleno()) {
			departamentos[posicionInsercciones] = new Departamento(dept_no, dnombre, localizacion);
			posicion = posicionInsercciones;
			numeroDepartamentos++;
			posicionInsercciones = buscaHueco();
			return posicion;
		} else {
			return -1;
		}
	}

	public static int buscaHueco() {
		boolean encontrado = false;
		int contador = 0;
		while (!encontrado && contador < TAM) {
			if (departamentos[contador] == null) {
				posicionInsercciones = contador;
				return posicionInsercciones;
			} else {
				return -1;
			}
		}
		return -1;
	}

	public static int existeDepartamento(int dept_no) {
		boolean encontrado = false;
		int contador = 0;
		do {
			if (departamentos[contador] != null && departamentos[contador].getDept_no() == dept_no) {
				encontrado = true;
				return contador;
			} else {
				contador++;
			}
		} while (!encontrado && contador < TAM);
		/*if (encontrado)
			return contador;
		else*/
			return -1;
	}

	public static int borrarDepartamento(int dept_no) {
		boolean encontrado = false;
		int contador = 0;
		do {	
		if (existeDepartamento(dept_no) != -1) {
			departamentos[contador] = null;
			return 1;
		} else {
			return 0;
		}
		} while (!encontrado && contador < TAM);
	}
	public static void borrarDepartamentoInteractivo() throws NumberFormatException, IOException {
		System.out.println("Escribe el número de departamento que desee borrar");
		int dept_num = Integer.parseInt(br.readLine());
		if (borrarDepartamento(dept_num) != 0) {
			System.out.println("El departamento ha sido borrado");
		} else {
			System.out.println("El departamento no se a podido borrar");
		}
		
	}
	
	
		
		
		public static void modificardepartamentoInteractivo() throws NumberFormatException, IOException {
			System.out.println("inserte un departamento nuevo");
			int dept_num = Integer.parseInt(br.readLine());
			if (modificardepartamento(dept_num) != 0) {
				
			}
				System.out.println("El departamento ha sido añadido");
			} else (){
				System.out.println("no existe departamento");
			}
			
		
		public static boolean empleadovacio(Departamento d) {
			if (departamentoLleno(d)) {
				return true;
			} else {
				return false;
			}
		}
		
		public static boolean empleadolleno(Departamento d) {
	if (numeroEmpleado == TAM) {
				return true;
			} else {
				return false;
			}
		}
		
	public static void mostrarempleados(Departamento d) {
		for (int i = 0; i < e.; i++) {
			if (d.listaEmpleado[i] != null) {
				System.out.println("Empleados: Numero Empleados: " + listaEmpleado[i].getDept_no() + " Nombre: "
						+ empleados[i].getDnombre() + " Localizacion: " + listaEmpleado[i].getLocalizacion());
				departamentos[i].mostrarEmpleados();
				System.out.println();
			}
		}
	}
	
	
	public static int insertarempleado (Empleado e, Departamento d) {
		int posicion = -1;
		if (!empleadolleno(d)) {
			d.posicionEmpleado(posicion)[posicionInsercciones] = new Empleado(numeroEmpleado, departamentos);
			posicion = posicionInsercciones;
			numeroDepartamentos++;
			posicionInsercciones = buscaHueco();
			return posicion;
		} else {
			return -1;
		}
	}
		
	
	
		public static void insertarempleadoInteractivo() throws IOException{
			
			System.out.println("inserte un empleado nuevo");
			int dept_num = Integer.parseInt(br.readLine());
			if (existeEmpleado(dept_num) != 0) {
				
			}
				System.out.println("El empleado ha sido añadido");
			} else () {
				
				if(modificarEmpleado()) {
					System.out.println();
				}
			return 0;
		}
			{
				System.out.println("no existe empleado");
			}
			
			
			
			public static int existeEmpleado() {
				for(int i=0; i<empleados; i++)
				{
					empleados[i=empleados[i]
				}
			}

			
			public static int borrarEmpleado(Departamento d, int numeroEmpleado) {
					
					if (empleadovacio(d) = 0) {
						if(existeEmpleado = -1)
						return 0;
					}
				} else {
					return -1;
				}
			
			//1 ok
			//	0 empleadovacio
			//	-1 no existe
			
			public static void borrarEmpleadoInteractivo() throws NumberFormatException, IOException {
		
				System.out.println("Escribe el Empleado que desee borrar");
				int numeroEmpleado = Integer.parseInt(br.readLine());
				if (borrarEmpleado(numeroEmpleado) != 0) {
					System.out.println("El empleado ha sido borrado");
				} else {
					System.out.println("El empleado no se a podido borrar no existe");
				}
				
			}
			
			
			public static void modificarEmpleado(int dept_no) {
				
			}
			
			
			public static void modificarEmpleadoInteractivo() throws NumberFormatException, IOException {
				System.out.println("inserte un Empleado nuevo");
				int dept_num = Integer.parseInt(br.readLine());
				if (modificarEmpleado(dept_num) != 0) {
					
				}
					System.out.println("El departamento ha sido añadido");
				} else (){
					System.out.println("no existe departamento");
				}
				
			
			public static int buscaHuecoempleados() {
				boolean encontrado = false;
				int contador = 0;
				while (!encontrado && contador < TAM) {
					if (existeEmpleado[contador] == null) {
						posicionInsercciones = contador;
						return posicionInsercciones;
					} else {
						return -1;
					}
				}
				return -1;
			}	
				
				
	}
	
