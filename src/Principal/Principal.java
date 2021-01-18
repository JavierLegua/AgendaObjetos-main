package Principal;

public class Principal {

	public static void main(String[] args) {
		int opc = 0;
		Agenda agenda = new Agenda();
		
		do {
			opc = Agenda.verMenu();
			switch (opc) {
			case 1: {
				System.out.println(agenda.toString());
				break;
			}
			case 2: {
				agenda.anadirContacto();
				break;
			}
			case 3: {
				agenda.borrarContacto();
				break;
			}
			case 4: {

				break;
			}
			case 5: {

				break;
			}
			case 6: {

				break;
			}
			}
		} while (opc != 6);

	}
}