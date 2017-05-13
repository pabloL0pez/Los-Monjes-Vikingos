package tests;

import org.junit.Test;
import org.junit.Assert;

import miPaquete.Natural;
import miPaquete.Berserker;
import miPaquete.Meditacion;
import miPaquete.Vikingo;

public class testVikingo {

	@Test
	public void testConstruye() {
		Vikingo v1 = new Vikingo(10,10,100);
		Assert.assertEquals(v1.getAtaque(), 10);
		Assert.assertEquals(v1.getDefensa(), 10);
		Assert.assertEquals(v1.getSalud(), 100);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
	}
	
	@Test
	public void testMeditarUnaVezDesdeNatural() {
		Vikingo v1 = new Vikingo(10,10,100);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v1.meditar();
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Meditacion().getEstadoActual());
	}
	
	@Test
	public void testMeditarTresVecesDesdeNatural() {
		Vikingo v1 = new Vikingo(10,10,100);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v1.meditar();
		v1.meditar();
		v1.meditar();
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Meditacion().getEstadoActual());
	}
	
	@Test
	public void testRecibirAtaqueMenorQuincePorCiento() {
		Vikingo v1 = new Vikingo(10,10,100);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v1.recibirAtaque(10);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
	}
	
	@Test
	public void testRecibirAtaqueMayorQuincePorCiento() {
		Vikingo v1 = new Vikingo(10,10,100);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v1.recibirAtaque(20);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Berserker().getEstadoActual());
	}
	
	@Test
	public void testMeditarUnaVezDesdeBerserker() {
		Vikingo v1 = new Vikingo(10,10,100);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v1.recibirAtaque(20);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Berserker().getEstadoActual());
		v1.meditar();
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Berserker().getEstadoActual());
	}
	
	@Test
	public void testMeditarTresVecesDesdeBerserker() {
		Vikingo v1 = new Vikingo(10,10,100);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v1.recibirAtaque(20);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Berserker().getEstadoActual());
		v1.meditar();
		v1.meditar();
		v1.meditar();
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
	}
	
	@Test
	public void testRecibirAtaqueMayorCincoPorCiento() {
		Vikingo v1 = new Vikingo(10,10,100);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v1.meditar();
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Meditacion().getEstadoActual());
		v1.recibirAtaque(6);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
	}
	
	@Test
	public void testRecibirAtaqueMenorCincoPorCiento() {
		Vikingo v1 = new Vikingo(10,10,100);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v1.meditar();
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Meditacion().getEstadoActual());
		v1.recibirAtaque(4);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Meditacion().getEstadoActual());
	}
	
	@Test
	public void testRecibirAtaqueDesdeBerserker() {
		Vikingo v1 = new Vikingo(10,10,100);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v1.recibirAtaque(20);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Berserker().getEstadoActual());
		v1.recibirAtaque(20);
		Assert.assertEquals(v1.getEstado().getEstadoActual(), new Berserker().getEstadoActual());
	}
	
	@Test
	public void testMostrar() {
		Vikingo v1 = new Vikingo(10,10,100);
		v1.recibirAtaque(20);
		v1.mostrar();
		v1.meditar();
		v1.meditar();
		v1.meditar();
		System.out.println();
		v1.mostrar();
		v1.meditar();
		System.out.println();
		v1.mostrar();
	}
}
