package miPaquete;

public class Meditacion extends Estado{
	
	public Meditacion() {
		this.estadoActual = EstadoVikingo.MEDITACION;
	}
	
	@Override
	public Estado meditar() {
		return this;
	}

	@Override
	public Estado recibirAtaque(double porcentajeDeAtaque) {
		if(porcentajeDeAtaque > 5)
			return new Natural();
		return this;
	}
}
