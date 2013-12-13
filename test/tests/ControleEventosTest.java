package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import controllers.ControleEventos;
import models.Evento;

import org.junit.*;

public class ControleEventosTest {

	ControleEventos umControle;
	Evento evento1, evento2, evento3;
	
	@Before
	public void setUp() throws Exception{
        evento1 = new Evento("Festa de s�o Jo�o");
        evento2 = new Evento("Natal");
        evento3 = new Evento("Ferias");
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
		Evento eventoNovo = new Evento("Ano Novo");
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
		ArrayList<Evento> listaTest = new ArrayList<Evento>();
        
        listaTest.add(evento1);
        listaTest.add(evento2);
        
        umControle.remover(evento3);
        
        assertEquals(listaTest, umControle.getListaEventos());
	}

	@Test
	public void testPesquisar() {
		assertEquals(evento2, umControle.pesquisar("Natal"));
	}

}
