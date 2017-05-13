package miPaquete;

public class Berserker extends Estado{
	
	private int cantCalmas;
	
	public Berserker() {
		this.cantCalmas = 0;
		this.estadoActual = EstadoVikingo.BERSERKER;
	}
	
	@Override
	public Estado meditar() {
		this.cantCalmas++;
		if(cantCalmas == 3)
			return new Natural();
		return this;
	}

	@Override
	public Estado recibirAtaque(double porcentajeDeAtaque) {
		this.cantCalmas = 0;
		return this;
	}
}
