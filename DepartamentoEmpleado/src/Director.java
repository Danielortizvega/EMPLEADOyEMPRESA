


import java.time.LocalDate;

public class Director extends Empleado {
	
	public Director() {

	}

	public Director(int numeroEmpleado, String apellido, LocalDate fechaAlta, double salario,
			Departamento departamentos) {
		super.numeroEmpleado = numeroEmpleado;
		super.apellido = apellido;
		super.fechaAlta = fechaAlta;
		super.salario = salario;
		super.departamentos = departamentos;

	}

	public void saludar() {
		System.out.println("Hola Director " + super.apellido);
	}

	public double salarioAnual() {
		return super.salario * 14;

	}

	@Override
	public String toString() {
		return "Numero Empleado= " + numeroEmpleado + ", Apellido= " + apellido + ", Fecha de Alta= " + fechaAlta
				+ ", Salario= " + salario + ", Departamento= " + departamentos;
	}
	
}
