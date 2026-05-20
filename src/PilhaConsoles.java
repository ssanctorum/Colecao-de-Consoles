public class PilhaConsoles {

    private Console[] pilhaDeConsoles = new Console[5];
    private int topoDosConsoles = 0;

    public void pilhaPush(Console newConsole){
        pilhaDeConsoles[topoDosConsoles] = newConsole;
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

    }

}
