public class Proprietario extends Usuario {
    public Proprietario(Usuario usuario){
        answerList.add(RespostaDoDetrator.getDetractorAnswer());
        setUser(usuario);
    }

    public String getRole(){
        return "Proprietario";
    }
}
