package coco;
import java.util.Scanner;
public class Triangle {
	private String nome;
	private int id;
	private double salario;
	
	Scanner t = new Scanner(System.in);
	
	public Triangle(int id, String nome, double salario) {
		
		this.id=id;
		this.nome=nome;
		this.salario=salario;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setPreco(int id) {
		this.id=id;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setEmail(double salario) {
		this.salario=salario;
	}
	
	
	public void Porcentagem(double p) {
		this.salario+=salario*p/100.0;
	}
	
	public String toString() {
		return id+" , "+nome+" , "+String.format("%.2f ",salario);
	}
	

	   
	   }
	   
   
	 
	 

	





