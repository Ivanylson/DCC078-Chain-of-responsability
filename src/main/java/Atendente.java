public class Atendente extends Usuario {
    public Atendente(Usuario usuario){
        listaDeRespostas.add(RespostaDoPromotor.getRespostaDoPromotor());
        setUsuario(usuario);
    }

    public String getPapel(){
        return "Atendente";
    }
}
