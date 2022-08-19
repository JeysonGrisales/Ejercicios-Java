import java.util.Scanner;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class operacionesJava {
	public void part2() {
		int a = 2;
		int b = -2;
		int c = 8;
		
		System.out.println("El resultado de A es: " + (a-2+b*(b+3)-c));
		System.out.println("El resultado de B es: " + c);
		System.out.println("El resultado de C es: " + (a*b)+2);
	}
	
	public void part3_4() {
		//numero * valorP = / 100 
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese El Numero Al Que Desea Ver El Porcentaje");
		int num1 = leer.nextInt();
		int porcentaje = 15;
		
		double result = num1 * porcentaje ;
		
		System.out.println("El 15% del valor constante es " + result/100 + "% ");
	}
	
	public void part5() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su salario ");
		int salario = leer.nextInt();
		System.out.println("ingrese el porcentaje del incremento de su salario");
		int incremento = leer.nextInt();
		
		double porcentajePago = incremento;
		
		double division = (porcentajePago / 100) * salario;
		
		double pagoFinal = division + salario;
	
		
		System.out.println("Pago final " + Math.round (pagoFinal) );
	}
	
	public void part6() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su salario");
		int salario = leer.nextInt();
		System.out.println("Ingrese sus horas extras");
		
		int horasExtras = leer.nextInt();
		int pagoFinal = (horasExtras * 3000) + salario;
		System.out.println("Su pago final es: $" + pagoFinal);
	}
	
	public void part7() {
		//costo tratamiento
		//dias hospitalizado $100.000
		//costo medicamentos 
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese costo del tratamiento");
		int tratamiento = leer.nextInt();
		System.out.println("Ingrese dias hospitalizado");
		int diasH = leer.nextInt();
		System.out.println("Costo de medicamentos");
		int costoM = leer.nextInt();
		
		int valorDias = diasH * 100000;
		int precioFinal = tratamiento + valorDias + costoM;
		
		System.out.println("Sus gasto totales son: " + precioFinal);
	}
	
	public void part8() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la Base del triangulo");
		int base = leer.nextInt();
		
		System.out.println("Ingrese la altura del triangulo");
		int altura = leer.nextInt();
		
		int area = (base * altura) / 2;
		System.out.println("El area del triangulo es : " + area);
		
		
	}
	
	public void part9() {
		int a = 5;
		int b = 5;
		
		int valorX = (a + b) / (2*a);
		
		System.out.println("El valor de X es: " + valorX);
		
	}
	
	
	public void part10() {
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese primer numero: ");
		double primerN = leer.nextDouble();
		
		System.out.println("Ingrese segundo numero: ");
		double segundoN = leer.nextDouble();
		
		System.out.println("Ingrese tercer numero: ");
		double tercerN = leer.nextDouble();
		
		System.out.println("La suma de los tres numeros decimales es: " + (primerN + segundoN + tercerN));
		
		
	}
	
	public void part11() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese primer numero: ");
		double primerN = leer.nextDouble();
		
		System.out.println("Ingrese segundo numero: ");
		double segundoN = leer.nextDouble();
		
		System.out.println("Ingrese tercer numero: ");
		double tercerN = leer.nextDouble();
		
		System.out.println("La suma de los tres numeros decimales es: " + (primerN + segundoN + tercerN)*2);
		
	}
	
	public void part12() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su primer nota: ");
		double primerNota = leer.nextDouble();
		
		System.out.println("Ingrese su segunda nota: ");
		double segundaNota = leer.nextDouble();
		
		System.out.println("Ingrese su tercer nota: ");
		double tercerNota = leer.nextDouble();
		
		System.out.println("El promedio de sus notas parciales es de: " + (primerNota + segundaNota + tercerNota)/3);
		
	}
	
	public void part13() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su nombre completo: ");
		String nombre = leer.nextLine();
		
		System.out.println("Ingrese su profesion: ");
		String profesion = leer.nextLine();
		
		System.out.println("Ingrese su documento: ");
		int documento = leer.nextInt();
		
		System.out.println("Ingrese su edad: ");
		int edad = leer.nextInt();
		
		
		
		System.out.println("Datos ingresados: \n" + "Nombre completo:"  + nombre  + "\n" + "Documento: " + documento + "\n" + "Edad: " + edad + "\n" + "Profesion: " + profesion );
		
		
	}
	
	public void part14() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la Base del triangulo");
		int base = leer.nextInt();
		
		System.out.println("Ingrese la altura del triangulo");
		int altura = leer.nextInt();
		
		int area = (base * altura) / 2;
		System.out.println("El area del triangulo es : " + area);
		
	}
	
	public void part15() {
		
		int a = 5;
		int b = 5;
		
		int valorX = (a + b) / (2*a);
		
		System.out.println("El valor de X es: " + valorX);
		
	}
	
	public void part16() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Precio articulo");
		int precioArticulo = leer.nextInt();
		
		System.out.println("Cantidad Articulos");
		int cantidadArticulos = leer.nextInt();
		
		System.out.println("Valor entregado por el Cliente");
		int valorCliente = leer.nextInt();
		
		int total = precioArticulo * cantidadArticulos;
		
		if(valorCliente < total) {
			System.out.println("te hace falta $" + Math.abs (valorCliente - total) + " para pagar");
		}else {
			System.out.println("Compra Realizada, sus vueltas son: $" + Math.abs(total - valorCliente));
		}
	
	}
	
	public void part17() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su nombre completo: ");
		String nombre = leer.nextLine();
		
		System.out.println("Ingrese su profesion: ");
		String profesion = leer.nextLine();
		
		System.out.println("Ingrese su documento: ");
		int documento = leer.nextInt();
		
		System.out.println("Ingrese su edad: ");
		int edad = leer.nextInt();
		
		System.out.println("Ingrese su telefono: ");
		long telefono = leer.nextLong();
		
		
		
		System.out.println("Datos ingresados: \n" + "Nombre completo:"  + nombre  + "\n" + "Documento: " + documento + "\n" + "Edad: " + edad + "\n" + "Profesion: " + profesion + "\n" + "Telefono: " + telefono);
		
		
	}
	
	public void part18() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la Base del triangulo");
		int base = leer.nextInt();
		
		System.out.println("Ingrese la altura del triangulo");
		int altura = leer.nextInt();
		
		int area = (base * altura) / 2;
		System.out.println("El area del triangulo es : " + area);
		
		
	}
	
	public void part19() {
		int a = 5;
		int b = 5;
		
		int valorX = (a + b) / (2*a);
		
		System.out.println("El valor de X es: " + valorX);
		
	}
	
	public void part20() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su salario");
		int salario = leer.nextInt();
		System.out.println("Ingrese sus horas extras");
		
		int horasExtras = leer.nextInt();
		int pagoFinal = (horasExtras * 3000) + salario;
		System.out.println("Su pago final es: $" + pagoFinal);
	}	
	
	public void part21() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese sus horas de trabajo realizadas");
		int horas = leer.nextInt();
		
		int pagoHora = 2000;
		int pagoTotal = pagoHora * horas;
		int descuento = (10 * pagoTotal)/100;
		System.out.println("Su salario total es: $" + (pagoTotal - descuento));
	}
	
	public void part22() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su salario");
		int salario = leer.nextInt();
		System.out.println("Ingrese sus horas extras");
		
		int horasExtras = leer.nextInt();
		int pagoFinal = (horasExtras * 3000) + salario;
		System.out.println("Su pago final es: $" + pagoFinal);
	}
	
	public void part23() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese sus horas de trabajo realizadas");
		int horas = leer.nextInt();
		
		int pagoHora = 2000;
		int pagoTotal = pagoHora * horas;
		int descuento = (10 * pagoTotal)/100;
		System.out.println("Su salario total es: $" + (pagoTotal - descuento));
	}
	
	public void part24() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su salario ");
		int salario = leer.nextInt();
		System.out.println("ingrese el porcentaje del incremento de su salario");
		int incremento = leer.nextInt();
		
		double porcentajePago = incremento;
		
		double division = (porcentajePago / 100) * salario;
		
		double pagoFinal = division + salario;
	
		
		System.out.println("Pago final " + Math.round (pagoFinal) );
	}
	
	public void part25() {
		
	}
}
