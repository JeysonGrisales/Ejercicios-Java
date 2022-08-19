import javax.swing.JOptionPane;

public class ciclos {
	public void viaje() {
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		String documento = (JOptionPane.showInputDialog("Ingrese su documento"));
		String telefono = (JOptionPane.showInputDialog("Ingrese su numero"));
		String comprobante= "", ciudad;
		
		String menu = "menu de personas/n/n";
		menu += "1 Medellin .... 6 de Octubre - 8:00am/n";
		menu += "2 Bogota .... 10 de Noviembre - 6:00pm";
		menu += "3 Caragena .... 5 de Abril - 2:00pm/n";
		menu += "4 Barranquilla .... 4 de Mayo 4:00am/n";
		menu +="Salir /n";
		menu += "Ingrese una opcion/n";

		
		
			int noExiste = 0;
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (codigo) {
			case 1: System.out.println("Medellin 6 de Octubre - 8:00am");
			break;
			case 2: System.out.println("Bogota 10 de Noviembre - 6:00pm");
			break;
			case 3: System.out.println("3 Caragena 5 de Abril - 2:00pm");
			break;
			case 4: System.out.println("4 Barranquilla .... 4 de Mayo 4:00am");
			break;
			case 5: System.out.println("adios");
			break;
			default: System.out.println("No exite el codigo");
			noExiste = 1;
			break;
			}
			
			comprobante="<<<<<<<<<<<<<<<<COMPROBNATE>>>>>>>>>>>>>>>>>";
			comprobante+= "Nombre: " +  nombre;
			comprobante+= "Telefono " + telefono;
			comprobante+= 
			
		
	}
	
}
