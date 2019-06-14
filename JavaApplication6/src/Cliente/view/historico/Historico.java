package Cliente.view.historico;
import Cliente.Cliente;
import java.io.File;
import java.util.ArrayList;

/**
 * @author Adston at self
 */
public abstract class Historico {
   protected String path = ".\\ips\\";
   protected String file = "historico.txt";
   protected File classFile;
   protected static ArrayList<String> conteudo = new ArrayList();
   protected Cliente cliente; 

   
   
   
}