package colegio;

public class Alumno {

	private int numeroMatricula;
	private String nombreAlumno; 
	private String apellidoAlumno; 
	private String direccionAlumno;
	private Centro centro;
	private Asignatura asignatura;
	private double notaAlumno;
	
	public Alumno() 
	{
		numeroMatricula = 0; 
		nombreAlumno = ""; 
		apellidoAlumno = ""; 
		direccionAlumno = "";
		centro = new Centro();
		asignatura = new Asignatura();
		notaAlumno = 0;
	}
	
	public Alumno(int num, String nom, String ape, String dir, Centro cent, Asignatura asi, double nota)
	{
		numeroMatricula = num; 
		nombreAlumno = nom; 
		apellidoAlumno = ape; 
		direccionAlumno = dir; 
		centro = cent;
		asignatura = asi; 
		notaAlumno = nota;
	}
		
	public int getNumeroMatricula()
	{
		return numeroMatricula;
	}
	
	public void setNumeroMatricula(int num)
	{
		numeroMatricula = num; 
	}
	
	public String getNombreAlumno()
	{
		return nombreAlumno;
	}
	
	public void setNombreAlumno(String nom)
	{
		nombreAlumno = nom; 
	}
	public String getApellidoAlumno()
	{
		return apellidoAlumno;
	}
	
	public void setApellidoAlumno(String ape)
	{
		apellidoAlumno = ape; 
	}
	
	public String getDireccionAlumno()
	{
		return direccionAlumno;
	}
	
	public void setDireccionAlumno(String dir)
	{
		direccionAlumno = dir; 
	}
	
	public Centro getCentro()
	{
		return centro;
	}
	
	public void setCentro(Centro cent)
	{
		centro = cent; 
	}
	
	public Asignatura getAsignatura()
	{
		return asignatura;
	}
	
	public void setAsignatura(Asignatura asi)
	{
		asignatura = asi; 
	}
	
	public double getNotaAlumno()
	{
		return notaAlumno;
	}
	
	public void setNotaAlumno(int nota)
	{
		notaAlumno = nota; 
	}
	
}
