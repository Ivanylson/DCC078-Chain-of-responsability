public class Proprietario extends Usuario {
    public Proprietario(Usuario usuario){
        listaDeRespostas.add(RespostaDoDetrator.getDetratorResposta());
        setUsuario(usuario);
    }

    public String getPapel(){
        return "Proprietario";
    }
}
