public class Atendente extends Usuario {
    public Atendente(Usuario usuario){
        answerList.add(RespostaDoPromotor.getPromoterAnswer());
        setUser(usuario);
    }

    public String getRole(){
        return "Atendente";
    }
}
