package miPaquete;

public class Vikingo {

	private Estado estado;
	private int ataque;
	private int defensa;
	private int salud;
	
	/*
	 * Creo que no está bien, pero anda. El problema es que si se agrega un nuevo cambio de estado, es necesario modificar el método
	 * modificarAtributos()... No sé bien como hacer para que los atributos se modifiquen al hacer el cambio de estado, fuera de 
	 * la clase Vikingo (o sea dentro de las diferentes clases Estado). Pero bueh +95% de coverage, man.
	 */
	private final int ataqueBase;
	private final int defensaBase;
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getAtaqueBase() {
		return ataqueBase;
	}

	public int getDefensaBase() {
		return defensaBase;
	}

	public Vikingo(int ataque, int defensa, int salud) {
		this.ataque = ataque;
		this.defensa = defensa;
		this.salud = salud;
		this.estado = new Natural();
		
		this.ataqueBase = ataque;
		this.defensaBase = defensa;
	}
	
	public void meditar() {
		this.estado = this.estado.meditar();
		modificarAtributos();
	}
	
	public void recibirAtaque(int ataque) {
		this.estado = this.estado.recibirAtaque((ataque * 100) / this.salud);
		modificarAtributos();
	}
	
	private void modificarAtributos() {
		if(this.estado.getEstadoActual() == EstadoVikingo.BERSERKER) {
			this.setAtaque(this.getAtaqueBase() * 3);
			this.setDefensa(1);
		} else if(this.estado.getEstadoActual() == EstadoVikingo.MEDITACION) {
			this.setAtaque(1);
			this.setDefensa(this.getDefensaBase() * 5);
		} else if(this.estado.getEstadoActual() == EstadoVikingo.NATURAL) {
			this.setAtaque(this.getAtaqueBase());
			this.setDefensa(this.getDefensaBase());
		}
	}
	
	public void mostrar() {
		System.out.println("Vikingo");
		System.out.println("ESTADO ACTUAL: " + this.estado.estadoActual);
		System.out.println("ATAQUE: " + this.ataque);
		System.out.println("DEFENSA: " + this.defensa);
	}
}
