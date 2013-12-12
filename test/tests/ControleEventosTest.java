package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import controllers.ControleEventos;
import models.Evento;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ControleEventosTest {

	ControleEventos umControle;
	Evento evento1, evento2, evento3;
	
	@BeforeClass
	public void setUp() throws Exception{
        evento1 = new Evento("Festa de são João","F");
        evento2 = new Evento("Maria", 'F');
        evento3 = new Evento("Carla", 'F');
        umControle = new ControleEventos();
        
        umControle.adicionar(evento1);
        umControle.adicionar(evento2);
        umControle.adicionar(evento3);
    }

	@Test
	public void testGetListaEventos() {
		ArrayList<Evento> listaTest = new ArrayList<Evento>();

        listaTest.add(evento1);
        listaTest.add(evento2);
        listaTest.add(evento3);
            
        assertEquals(listaTest, umControle.getListaEventos());
	}

	@Test
	public void testAdicionar() {
		Evento eventoNovo = new Evento("Romeu", 'M');
        ArrayList<Evento> listaTest = new ArrayList<Evento>();
        
        listaTest.add(evento1);
        listaTest.add(evento2);
        listaTest.add(evento3);
        listaTest.add(eventoNovo);
        
        umControle.adicionar(eventoNovo);
        
        assertEquals(listaTest, umControle.getListaEventos());
	}

	@Test
	public void testRemover() {
		Evento eventoNovo = new Evento("Romeu", 'M');
        ArrayList<Evento> listaTest = new ArrayList<Evento>();
        
        listaTest.add(evento1);
        listaTest.add(evento2);
        
        umControle.remover(evento3);
        
        assertEquals(listaTest, umControle.getListaEventos());
	}

	@Test
	public void testPesquisar() {
		assertEquals(evento2, umControle.pesquisar("Maria"));
	}

}
