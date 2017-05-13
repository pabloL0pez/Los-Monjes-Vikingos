package miPaquete;

public class Natural extends Estado{
	
	public Natural() {
		this.estadoActual = EstadoVikingo.NATURAL;
	}
	
	@Override
	public Estado meditar() {
		return new Meditacion();
	}

	@Override
	public Estado recibirAtaque(double porcentajeDeAtaque) {
		if(porcentajeDeAtaque > 15)
			return new Berserker();
		return this;
	}
}
