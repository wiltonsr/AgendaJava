/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import java.util.ArrayList;
import models.Usuario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wilton
 */
public class ControleUsuariosTest {
    
      ControleUsuarios umControle;
    Usuario usuario1;
    Usuario usuario2;
    Usuario usuario3;
        
        @Before
                public void setUp() throws Exception{
                usuario1 = new Usuario("Wilton");
                usuario2 = new Usuario("Eduardo");
                usuario3 = new Usuario("Paulo");
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
        Usuario usuariosNovo = new Usuario("Wilton");
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
                ArrayList<Usuario> listaTest = new ArrayList<Usuario>();
        
        listaTest.add(usuario1);
        listaTest.add(usuario2);
        
        umControle.remover(usuario3);
        
        assertEquals(listaTest, umControle.getListaUsuarios());
        }

        @Test
        public void testPesquisar() {
                assertEquals(usuario1, umControle.pesquisar("Wilton"));
        }
    
}
