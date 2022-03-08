

import java.time.LocalDate;
import java.util.Arrays;

public class Departamento {
	private int dept_no;
	private String dnombre;
	private String localizacion;
	Empleado[] listaEmpleado;

	public Departamento() {

	}

	public Departamento(int dept_no, String dnombre, String localizacion, Empleado[] listaEmpleado) {
		this.dept_no = dept_no;
		this.dnombre = dnombre;
		this.localizacion = localizacion;
		this.listaEmpleado = listaEmpleado;
	}

	public Departamento(int dept_no, String dnombre, String localizacion) {
		this.dept_no = dept_no;
		this.dnombre = dnombre;
		this.localizacion = localizacion;
		this.listaEmpleado = new Empleado[4]; //Reservamos memoria para 4 empleados 
		this.listaEmpleado[0] = new Director(10, "María", LocalDate.of(1964, 03, 17), 3000, this);
		this.listaEmpleado[1] = new Analista(20, "Luis", LocalDate.of(1980, 04, 10), 2600, 200, this);
		this.listaEmpleado[2] = new Director(30, "Ana", LocalDate.of(1960, 11, 15), 5000, this);
		this.listaEmpleado[3] = new Analista(40, "Alba", LocalDate.of(1984, 02, 29), 6000, 200, this);
	}

	public int posicionEmpleado(int emp_no) {
		int posicion = -1;
		int contador = 0;
		boolean encontrado = false;
		do {
			if (listaEmpleado[contador] != null && emp_no == listaEmpleado[contador].getNumeroEmpleado()) {
				posicion = contador;
				encontrado = true;
			}
		} while (encontrado);
		return posicion;
	}
	public void mostrarEmpleados() {
		for (int i = 0; i < listaEmpleado.length; i++) {
			System.out.println("\t" + listaEmpleado[i].toString());
		}
	}
	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	public String getDnombre() {
		return dnombre;
	}

	public void setDnombre(String dnombre) {
		this.dnombre = dnombre;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public Empleado[] getListaEmpleado() {
		return listaEmpleado;
	}

	public void setListaEmpleado(Empleado[] listaEmpleado) {
		this.listaEmpleado = listaEmpleado;
	}

	@Override
	public String toString() {
		return "Departamento Número de Departamento: " + dept_no + ", Nombre de Departamento: " + dnombre
				+ ", Localizacion= " + localizacion + ", \nEmpleados= " + Arrays.toString(listaEmpleado) + "\n";
	}
}
