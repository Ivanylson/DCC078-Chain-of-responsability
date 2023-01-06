import java.util.ArrayList;

public abstract class Usuario {

    protected ArrayList listaDeRespostas = new ArrayList();
    private Usuario usuario;

    public Usuario getUsuario(){
        return this.usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public abstract String getPapel();

    public String verResposta(Responder responder){
        if(listaDeRespostas.contains(responder.getRespostaDoTipo())){
            return getPapel();
        }else{
            if(usuario != null){
                return usuario.verResposta(responder);
            }else{
                return "Responta em branco";
            }
        }
    }

}
