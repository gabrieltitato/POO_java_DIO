package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.Multifuncional;

public class Fabrica {
	public static void main(String[] args) {
		Multifuncional em = new Multifuncional();
		
		Deskjet deskjet = new Deskjet();
		
		Impressora impressora = deskjet;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
