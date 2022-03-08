


import java.time.LocalDate;

public class Analista extends Empleado {

	public Analista() {

	}

	public Analista(int numeroEmpleado, String apellido, LocalDate fechaAlta, double salario, double comision,
			Departamento departamentos) {
		super.numeroEmpleado = numeroEmpleado;
		super.apellido = apellido;
		super.fechaAlta = fechaAlta;
		super.salario = salario;
		super.comision = comision;
		super.departamentos = departamentos;
	}

	public void saludar() {
		System.out.println("Hola analista " + super.apellido);
	}

	public double salarioAnual() {
		return super.salario * 14 + super.comision;
	}
}
