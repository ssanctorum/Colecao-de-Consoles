import javax.swing.*;

public class PilhaConsoles {

    private Console[] pilhaDeConsoles = new Console[5];
    private int topoDosConsoles = 0;

    public int getTopoDosConsoles() {
        return topoDosConsoles;
    }

    public void pilhaPush(Console console){
        pilhaDeConsoles[topoDosConsoles] = console;
        topoDosConsoles++;

        if (pilhaDeConsoles.length == topoDosConsoles){
            Console[] novaPilhaDeConsoles = new Console [pilhaDeConsoles.length * 2];

            for (int i = 0; i < pilhaDeConsoles.length; i++){
                novaPilhaDeConsoles[i] = pilhaDeConsoles [i];
            }

            pilhaDeConsoles = novaPilhaDeConsoles;
        }
    }

    public void pilhaPop(){


        pilhaDeConsoles[topoDosConsoles-1] = null;
    }

    /// RETIRAR QUAISQUER RESQUICIOS DO JOPTIONPANE, ESSE AQUI NAO ESTA FUNCIONANDO DIREITO; TALVEZ UM FOR NO METODOS DE CERTO
//    public String pilhaListar(){
//        String consolesRetorno = "";
//
//        for (int i = topoDosConsoles-1; i >= 0; i--){
//
//            Console console = pilhaDeConsoles[i];
//            consolesRetorno += console.toString();
//        }
//        return consolesRetorno;
//    }

    /// RETIRAR QUAISQUER RESQUICIOS DO JOPTIONPANE
//    public void pilhaBuscar(String string){
//
//        for (int i = 0; i < topoDosConsoles; i++){
//
//            Console console = pilhaDeConsoles[i];
//
//            if (string.equalsIgnoreCase(console.getNome())){
//                JOptionPane.showMessageDialog(null, console.toString(), "Buscar console", JOptionPane.PLAIN_MESSAGE);
//            }
//        }
//    }
}
