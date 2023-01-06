public class Gerente extends Usuario {
    public Gerente(Usuario usuario){
        listaDeRespostas.add(RespostaNeutra.getRespostaNeutra());
        setUsuario(usuario);
    }

    public String getPapel(){
        return "Gerente";
    }
}
