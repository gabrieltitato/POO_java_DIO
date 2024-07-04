package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora{

	public void copiar() {
		System.out.println("COPIANDO MULTIFUNCIONAL");
	}

	public void digitalizar() {
		System.out.println("DIGITALIZANDO MULTIFUNCIONAL");	
	}

	public void imprimir() {
		System.out.println("IMPRIMINDO MULTIFUNCIONAL");	
	}
}
