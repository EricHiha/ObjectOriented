package Ex3;

import java.util.Random;

public class BilheteUnico {
    int id;
    String usuario;
    double saldo;
    final static double tarifaBase=5.30;
    String tipoTarifa;

    public BilheteUnico(String usuario, String tipoTarifa){
        Random rd = new Random();
        id = rd.nextInt(1000, 9999);
        saldo = rd.nextDouble(0, 1000);
        this.usuario = usuario;
        this.tipoTarifa = tipoTarifa;
    }

    public void carregar(double valor){
        if (valor <= 0){
            return;
        }
        saldo += valor;
    }

    public boolean passarCatraca(){
        double valor = tarifaBase;
        if (tipoTarifa.equalsIgnoreCase("estudante") ||
                tipoTarifa.equalsIgnoreCase("professor")){
            valor = valor/2;
        }

        //verifica se tem saldo disponível
        if (saldo < valor){
            return false;
        }

        saldo = saldo - valor;
        return true;
    }

}


