package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner t = new Scanner(System.in);

	
	SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	Date milles = new Date(System.currentTimeMillis());
	Date agora = new Date();
	Date x= data1.parse("20/04/2018");
	Date x1= data2.parse("20/04/2018 00:40:20");
	
	Calendar cal = Calendar.getInstance();
	cal.setTime(x1);
	 int minutos = cal.get(Calendar.MINUTE);
	 int month= 1+cal.get(Calendar.MONTH);
    System.out.println(data2.format(x1));
   
    System.out.println(data2.format(x1));
   
    System.out.println(minutos);
    System.out.println(month);
		
		/*
	       List<Triangle> list = new ArrayList<>();
	     
	       
      System.out.println("Digite o número de funcionário que deseja cadastrar:");
      int n = t.nextInt();
      
      for(int i=1; i<=n;i++) {
    	  System.out.println();
    	  System.out.println("Funcionário "+i+" :");
      System.out.println("Id: ");
      int id = t.nextInt();
      System.out.println("Nome: ");
      String name=t.nextLine();
      t.nextLine();
      System.out.println("Salário: ");
      double salario=t.nextDouble();
      list.add(new Triangle(id,name,salario));
      }
      
      System.out.println();
      System.out.println("Digite o id que terá aumento de salário: ");
      int id=t.nextInt();
      
      Triangle emp=list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
      
      if(emp == null) {
    	  System.out.println("Id inexistente");
      }else {
    	  System.out.println("Digite a porcentagem: ");
    	  double porc=t.nextInt();
    	  emp.Porcentagem(porc);
      }
      
      System.out.println();
      System.out.println("Lista de Empremgados:");
      for(Triangle x : list) {
    	  System.out.println(x);
      }
      */
      
    	 

	       
	       
	      
	t.close();
	}

}
