package colegio;

public class TestColegio {

	public static void main(String[] args) {
		
		Centro centro1 = new Centro(1, "Escuela de Inglés", "Reyes Católicos, 14");
		Centro centro2 = new Centro(2, "Escuela de Francés", "Cristóbal Colón, 92");
		
		Asignatura inglesB1 = new Asignatura(1, "Inglés B1", 60);
		Asignatura inglesB2 = new Asignatura(2, "Inglés B2", 60);
		Asignatura francesA2 = new Asignatura(3, "Francés A2", 60);
		Asignatura francesB1 = new Asignatura(4, "Francés B1", 60);
		
		Alumno aa = new Alumno(1, "Ana", "Abel", "Paseo de América, 15", centro1, inglesB1, 7.0);
		Alumno bb = new Alumno(2, "Benito", "Bueno", "Reyes Católicos, 16", centro1, inglesB2, 6.0);
		Alumno cc = new Alumno(3, "Carmen", "Cano", "	Reyes Católicos, 2", centro1, inglesB1, 5.0);
		Alumno dd = new Alumno(4, "Esteban", "Escalera", "Isabel la Católica, 28", centro2, francesB1, 9.0);
		Alumno ee = new Alumno(5, "Francisco", "Farfán", "Cristóbal Colón, s/n", centro2, francesA2, 8.5);
		
		System.out.println("Las DIRECCIONES de los centros son... ");
		System.out.println(centro1.getNombreCentro() + ": " + centro1.getDireccionCentro());
		System.out.println(centro2.getNombreCentro() + ": " + centro2.getDireccionCentro());
		
		System.out.println();
		
		System.out.println(cc.getNombreAlumno() + " está matriculada en la " + cc.getCentro().getNombreCentro() + " que se ubica en " + cc.getCentro().getDireccionCentro() + ".");
		
		System.out.println();
		
		System.out.println("La nota que Benito ha sacado en el B2 es un " + bb.getNotaAlumno() + ".");
	}

}
