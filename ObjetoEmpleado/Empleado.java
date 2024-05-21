package ObjetoEmpleado;


public class Empleado{
	private String ap1;
	private String ap2;
	private String nom;
	private int no_emp;
	private char sexo;

	public Empleado(String ap1,String ap2,String nom,int no_emp,char sexo){
		this.ap1=ap1;
		this.ap2=ap2;
		this.nom=nom;
		this.no_emp=no_emp;
		this.sexo=sexo;
	}

	public void mostrarEmpleado(){
		System.out.printf("El nombre del empleado es: ["+ap1+" "+ap2+" "+nom+"]\n");
		System.out.printf("El numero del empleado es: ["+no_emp+"]\n");
		System.out.printf("El sexo del empleado es: ["+sexo+"]\n");
	}
}