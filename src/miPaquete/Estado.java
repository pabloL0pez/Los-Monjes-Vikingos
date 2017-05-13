package miPaquete;

public abstract class Estado {
	protected EstadoVikingo estadoActual;
	public abstract Estado meditar();
	public abstract Estado recibirAtaque(double porcentajeDeAtaque);
	
	public EstadoVikingo getEstadoActual() {
		return this.estadoActual;
	}
}
