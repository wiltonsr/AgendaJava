
package models;

import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventoTest {

    Evento umEvento;
    Date umaData, outraData;
    
    @Before
    public void setUpClass() throws Exception{
        Date umaData = new Date(1, 12082013, 4, 4,5,3);
        Date outraData = new Date(2, 13082013, 4, 4,5,3);
        umEvento = new Evento("Natal", umaData, outraData, 00, 01, 23, 59, "Brasília", "Finalmente");
    }
    
    @Test
    public void testGetHoraInicio() {
        assertEquals(00,umEvento.getHoraInicio());
    }
    
    @Test
    public void testSetHoraInicio() {
        umEvento.setHoraInicio(15);
        assertEquals(umEvento.getHoraInicio(), 15);
    }

    @Test
    public void testGetMinInicio() {
        assertEquals(01, umEvento.getMinInicio());
    }

    @Test
    public void testSetMinInicio() {
        umEvento.setMinInicio(55);
        assertEquals(umEvento.getMinInicio(), 55);
    }

    @Test
    public void testGetHoraFim() {
        assertEquals(23, umEvento.getHoraFim());
    }

    @Test
    public void testSetHoraFim() {
        umEvento.setHoraFim(14);
        assertEquals(umEvento.getHoraFim(), 14);
    }

    @Test
    public void testGetMinFim() {
        assertEquals(00, umEvento.getMinFim());
    }

   
    @Test
    public void testSetMinFim() {
        umEvento.setMinFim(30);
        assertEquals(umEvento.getMinFim(), 30);
    }


    @Test
    public void testGetDescricao() {
        assertEquals("Finalmente", umEvento.getDescricao());
    }

 
    @Test
    public void testSetDescricao() {
        umEvento.setDescricao("Acabou");
        assertEquals(umEvento.getDescricao(), "Acabou");
    }

    @Test
    public void testGetDataFim() {
        Date outraData = new Date(2, 13082013, 4, 4,5,3);
        assertEquals(outraData, umEvento.getDataFim());
    }

    @Test
    public void testSetDataFim() {
        Date outraData = new Date(2013, 12, 26);
        umEvento.setDataFim(outraData);
        assertEquals(umEvento.getDataFim(), outraData);
    }

    @Test
    public void testGetDataInicio() {
        Date umaData = new Date(1, 12082013, 4, 4,5,3);
        assertEquals(umaData, umEvento.getDataInicio());
    }

    @Test
    public void testSetDataInicio() {
        Date umaData = new Date(2013, 12, 25);
        umEvento.setDataInicio(umaData);
        assertEquals(umEvento.getDataInicio(), umaData);
    }

    @Test
    public void testGetLocalEvento() {
        assertEquals("Brasília", umEvento.getLocalEvento());
    }

    @Test
    public void testSetLocalEvento() {
        umEvento.setLocalEvento("Acre");
        assertEquals(umEvento.getLocalEvento(), "Acre");
    }

    @Test
    public void testGetNomeEvento() {
        assertEquals("Natal", umEvento.getNomeEvento());
    }

    @Test
    public void testSetNomeEvento() {
        umEvento.setNomeEvento("Pascoa");
        assertEquals(umEvento.getNomeEvento(), "Pascoa");
    }
  
    
}
