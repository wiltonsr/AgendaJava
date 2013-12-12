package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import models.Usuario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controllers.ControleUsuarios;

public class ControleUsuariosTest {

	ControleUsuarios umControle;
    Usuario usuario1;
    Usuario usuario2;
    Usuario usuario3;
	
	@BeforeClass
		public void setUp() throws Exception{
	        usuario1 = new Usuario("Carlos",'M');
	        usuario2 = new Usuario("Maria", 'F');
	        usuario3 = new Usuario("Carla", 'F');
	        umControle = new ControleUsuarios();
	        
	        umControle.adicionar(usuario1);
	        umControle.adicionar(usuario2);
	        umControle.adicionar(usuario3);
	}


	@Test
	public void testGetListaUsuarios() {
		ArrayList<Usuario> listaTest = new ArrayList<Usuario>();

        listaTest.add(usuario1);
        listaTest.add(usuario2);
        listaTest.add(usuario3);
            
        assertEquals(listaTest, umControle.getListaUsuarios());
	}

	@Test
	public void testAdicionar() {
		Usuario usuariosNovo = new Usuario("Romeu", 'M');
        ArrayList<Usuario> listaTest = new ArrayList<Usuario>();
        
        listaTest.add(usuario1);
        listaTest.add(usuario2);
        listaTest.add(usuario3);
        listaTest.add(usuariosNovo);
        
        umControle.adicionar(usuariosNovo);
        
        assertEquals(listaTest, umControle.getListaUsuarios());
	}

	@Test
	public void testRemover() {
		Usuario usuariosNovo = new Usuario("Romeu", 'M');
        ArrayList<Usuario> listaTest = new ArrayList<Usuario>();
        
        listaTest.add(usuario1);
        listaTest.add(usuario2);
        
        umControle.remover(usuario3);
        
        assertEquals(listaTest, umControle.getListaUsuarios());
	}

	@Test
	public void testPesquisar() {
		assertEquals(usuario2, umControle.pesquisar("Maria"));
	}

}
