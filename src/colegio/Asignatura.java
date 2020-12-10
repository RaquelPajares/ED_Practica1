package colegio;

public class Asignatura {

	private int codigoAsignatura;
	private String nombreAsignatura; 
	private int horasAsignatura; 

	public Asignatura() 
	{
		
		codigoAsignatura = 0; 
		nombreAsignatura = ""; 
		horasAsignatura = 0; 		
	}
	
	public Asignatura(int cod, String nom, int hora)
	{
		codigoAsignatura = cod; 
		nombreAsignatura = nom; 
		horasAsignatura = hora; 
	}
		
	public int getCodigoAsignatura()
	{
		return codigoAsignatura;
	}
	
	public void setCodigoAsignatura(int cod)
	{
		codigoAsignatura = cod; 
	}
	
	public String getNombreAsignatura()
	{
		return nombreAsignatura;
	}
	
	public void setNombreAsignatura(String nom)
	{
		nombreAsignatura = nom; 
	}
	public int getHorasAsignatura()
	{
		return horasAsignatura;
	}
	
	public void setHorasAsignatura(int hora)
	{
		horasAsignatura = hora; 
	}
	
}
