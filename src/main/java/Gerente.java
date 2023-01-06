public class Gerente extends Usuario {
    public Gerente(Usuario usuario){
        answerList.add(RespostaNeutra.getNeutralAnswer());
        setUser(usuario);
    }

    public String getRole(){
        return "Gerente";
    }
}
