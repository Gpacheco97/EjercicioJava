package ObjetoEmpleado;

public class DatosPersonales{
	private String dir;
	private long tel;
	private String cor;

	public DatosPersonales(String dir, long tel, String cor){
		this.dir=dir;
		this.tel=tel;
		this.cor=cor;
	}

	public void mostrarDatos(){
		System.out.printf("La direccion del empleado es: ["+dir+"]\n");
		System.out.printf("El telefono del empleado es: ["+tel+"]\n");
		System.out.printf("El correo del empleado es: ["+cor+"]\n");
	}
}