import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner leer= new Scanner(System.in);
      System.out.println("Ingrese cantidad de materias");
      int capturarNmaterias=leer.nextInt();
		Materias vector[]= new Materias[capturarNmaterias];
		for (int i = 0; i < vector.length; i++) {
			
			System.out.println("Ingresa el nombre de la materia "+ (i+1));
			String Nommat= leer.next();
			System.out.println("Ingresa la cantidad de alumnos");
			int CantAl=leer.nextInt();
			double aux []= new double [CantAl];
			for (int j = 0; j < CantAl; j++) {
				System.out.println("Ingresa la calificacion");
				double CalAL=leer.nextDouble();
				aux[j]=CalAL;
			}
			
			
			vector[i]= new Materias(Nommat, CantAl,aux );
		}
		
		for (int i = 0; i < vector.length; i++) {
		
			System.out.println("La cantidad de alumnos de la clase "+vector[i].NombreMateria+" es : "+vector[i].CantidadDealumnos);
			for (int j = 0; j < vector[i].CantidadDealumnos; j++) {
				System.out.println(vector[i].Calificacion[j]);
			}
		}
		
		
		
	}

}
