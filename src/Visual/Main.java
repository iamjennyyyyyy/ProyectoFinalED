package Visual;

import java.awt.EventQueue;

import Utiles.MiPersonalizacion;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPersonalizacion.aplicarTema();
					PrincipalP frame = new PrincipalP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
