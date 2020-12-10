package colegio;

public class TestColegio {

	public static void main(String[] args) {
		
		Centro centro1 = new Centro(1, "Escuela de Ingl�s", "Reyes Cat�licos, 14");
		Centro centro2 = new Centro(2, "Escuela de Franc�s", "Crist�bal Col�n, 92");
		
		Asignatura inglesB1 = new Asignatura(1, "Ingl�s B1", 60);
		Asignatura inglesB2 = new Asignatura(2, "Ingl�s B2", 60);
		Asignatura francesA2 = new Asignatura(3, "Franc�s A2", 60);
		Asignatura francesB1 = new Asignatura(4, "Franc�s B1", 60);
		
		Alumno aa = new Alumno(1, "Ana", "Abel", "Paseo de Am�rica, 15", centro1, inglesB1, 7.0);
		Alumno bb = new Alumno(2, "Benito", "Bueno", "Reyes Cat�licos, 16", centro1, inglesB2, 6.0);
		Alumno cc = new Alumno(3, "Carmen", "Cano", "	Reyes Cat�licos, 2", centro1, inglesB1, 5.0);
		Alumno dd = new Alumno(4, "Esteban", "Escalera", "Isabel la Cat�lica, 28", centro2, francesB1, 9.0);
		Alumno ee = new Alumno(5, "Francisco", "Farf�n", "Crist�bal Col�n, s/n", centro2, francesA2, 8.5);
		
		System.out.println("Las DIRECCIONES de los centros son... ");
		System.out.println(centro1.getNombreCentro() + ": " + centro1.getDireccionCentro());
		System.out.println(centro2.getNombreCentro() + ": " + centro2.getDireccionCentro());
		
		System.out.println();
		
		System.out.println(cc.getNombreAlumno() + " est� matriculada en la " + cc.getCentro().getNombreCentro() + " que se ubica en " + cc.getCentro().getDireccionCentro() + ".");
		
		System.out.println();
		
		System.out.println("La nota que Benito ha sacado en el B2 es un " + bb.getNotaAlumno() + ".");
	}

}
