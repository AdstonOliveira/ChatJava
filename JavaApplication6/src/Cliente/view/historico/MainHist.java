package Cliente.view.historico;
/**
 * @author Adston at self
*/
public class MainHist {
   LerHistorico ler;
   
      public MainHist(){
         this.ler = new LerHistorico();
      }
         
         
   public LerHistorico getLer() {
      return ler;
   }

   public void setLer(LerHistorico ler) {
      this.ler = ler;
   }

   
      
      
}