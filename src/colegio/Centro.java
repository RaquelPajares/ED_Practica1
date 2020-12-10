package colegio;

public class Centro {

	private int codigoCentro;
	private String nombreCentro; 
	private String direccionCentro; 

	
	public Centro() 
	{
		codigoCentro = 0; 
		nombreCentro = ""; 
		direccionCentro = ""; 

	}
	
	public Centro(int cod, String nom, String dir)
	{
		codigoCentro = cod; 
		nombreCentro = nom; 
		direccionCentro = dir; 
	}
		
	public int getCodigoCentro()
	{
		return codigoCentro;
	}
	
	public void CodigoCentro(int cod)
	{
		codigoCentro = cod; 
	}
	
	public String getNombreCentro()
	{
		return nombreCentro;
	}
	
	public void setNombreCentro(String nom)
	{
		nombreCentro = nom; 
	}
	public String getDireccionCentro()
	{
		return direccionCentro;
	}
	
	public void setDireccionCentro(String dir)
	{
		direccionCentro = dir; 
	}
}
