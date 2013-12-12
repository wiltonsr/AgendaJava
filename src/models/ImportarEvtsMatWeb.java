
package models;

import java.io.IOException;  
import java.util.HashMap;  
import java.util.Map;  
import javax.swing.JOptionPane;
  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.select.Elements;    
/**
 *
 * @author Wilton
 */
public class ImportarEvtsMatWeb {
    
    public static void main(String[] args) throws IOException {  
          
        Map<String, String> query = new HashMap<String, String>();  
        query.put("cepEntrada", JOptionPane.showInputDialog(args));  
        query.put("tipoCep", "");  
        query.put("cepTemp", "");  
        query.put("metodo", "buscarCep");  
          
        Document doc = Jsoup.connect("http://m.correios.com.br/movel/buscaCepConfirma.do")  
                            .data(query)  
                            .post();  
  
        Elements elemetos = doc.select(".respostadestaque");  
  
        if (elemetos.size() == 4) {  
            System.out.println("Logradouro: " + elemetos.get(0).text());  
            System.out.println("Bairro: " + elemetos.get(1).text());  
            System.out.println("Localidade/UF: " + elemetos.get(2).text());  
            System.out.println("CEP: " + elemetos.get(3).text());  
        } else {  
            System.out.println("Dados não encontrado");  
        }  
    }  
    
}
