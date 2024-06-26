package usuario;

import equipamento.smartphone.Iphone;

public class Intercao {
    
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.atender();
        iphone.pausar();
        iphone.atualizarPagina();
        //iphone.pausar();
    }
    
}
