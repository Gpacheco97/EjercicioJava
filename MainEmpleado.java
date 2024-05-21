import java.util.Scanner;
import ObjetoEmpleado.Empleado;
import ObjetoEmpleado.DatosPersonales;

public class MainEmpleado{
	public static void main(String[] args){
		String ap1;
		String ap2;
		String nom;
		int no_emp;
		char sexo;
		String dir;
		long tel;
		String cor;

		Scanner p = new Scanner(System.in);
		Scanner e = new Scanner(System.in);

		System.out.println("Ingresar el apellido paterno del empleado: ");
		ap1=p.nextLine();
		System.out.println("Ingresar el apellido materno del empleado: ");
		ap2=p.nextLine();
		System.out.println("Ingresar el/los nombres del empleado: ");
		nom=p.nextLine();
		System.out.println("Ingresar el numero de empleado: ");
		no_emp=p.nextInt();
		System.out.println("Ingresar el sexo del empleado. (F)=Femenino, (M)=Masculino: ");
		sexo=p.next().charAt(0);
		System.out.println("Ingresar la direccion del empleado: ");
		dir=e.nextLine();
		System.out.println("Ingresar el telefono del empleado: ");
		tel=p.nextLong();
		System.out.println("Ingresar el correo electronico del empleado: ");
		cor=e.nextLine();

		Empleado emp = new Empleado(ap1,ap2,nom,no_emp, sexo);
		DatosPersonales data = new DatosPersonales(dir,tel,cor);

		System.out.println("Informacion del empleado: ");
		emp.mostrarEmpleado();

		System.out.println("Datos personales del empleado: ");
		data.mostrarDatos();


	}
}