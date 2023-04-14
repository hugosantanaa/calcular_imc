
package Model;

import javax.swing.ImageIcon;


public class calcular_DAO {
    static double altura=0, peso=0, calcular;
    

    public static void CalculosImc(){
        
        altura = Double.parseDouble(View.Tela_GUI.txt_altura.getText());
        peso = Double.parseDouble(View.Tela_GUI.txt_peso.getText());
        
        calcular = peso/(altura*altura);
       
        
        if(calcular < 18.5){
         ImageIcon Fotos = new ImageIcon("src/images/AbaixoPeso.png");
         View.Tela_GUI.imagens_lbl.setIcon(Fotos);
         
        }else if (calcular > 18.5 && calcular < 24.9){
         ImageIcon Fotos = new ImageIcon("src/images/Peso Normal.png");
         View.Tela_GUI.imagens_lbl.setIcon(Fotos);
    }else if (calcular >25 && calcular <29.9){
        ImageIcon Fotos = new ImageIcon("src/images/Sobrepeso.png");
         View.Tela_GUI.imagens_lbl.setIcon(Fotos);
        
    }else if (calcular > 30 && calcular < 34.9){
        ImageIcon Fotos = new ImageIcon("src/images/ObesidadeI.png");
         View.Tela_GUI.imagens_lbl.setIcon(Fotos);
    }else if (calcular > 35 && calcular <  39.9){
        ImageIcon Fotos = new ImageIcon("src/images/ObesidadeII.png");
         View.Tela_GUI.imagens_lbl.setIcon(Fotos);
    }else if (calcular > 40){
        ImageIcon Fotos = new ImageIcon("src/images/ObesidadeIII.png");
         View.Tela_GUI.imagens_lbl.setIcon(Fotos);
    }else{
        
    }
    
}
}
