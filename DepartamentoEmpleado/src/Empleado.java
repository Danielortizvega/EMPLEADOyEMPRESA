


import java.time.LocalDate;

public abstract class Empleado {

	int numeroEmpleado;
	String apellido;
	String oficio;
	LocalDate fechaAlta;
	double salario;
	double comision;
	Departamento departamentos;

	public Empleado() {

	}

	public Empleado(int numeroEmpleado, String apellido, String oficio, LocalDate fechaAlta, double salario,
			double comision, Departamento departamentos) {
		this.numeroEmpleado = numeroEmpleado;
		this.apellido = apellido;
		this.oficio = oficio;
		this.fechaAlta = fechaAlta;
		this.salario = salario;
		this.comision = comision;
		this.departamentos = departamentos;
	}

	public void saludar() {
		System.out.println("Hola " + apellido);
	}

	public abstract double salarioAnual();

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public Departamento getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamento departamentos) {
		this.departamentos = departamentos;
	}

	@Override
	public String toString() {
		return "Empleado Numero Empleado: " + numeroEmpleado + ", Apellido: " + apellido + ", Oficio: " + oficio
				+ ", Fecha de alta: " + fechaAlta + ", Salario: " + salario + ", Comision: " + comision + "\n" ;
	}

}
