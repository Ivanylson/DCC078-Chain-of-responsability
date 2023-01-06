import java.util.ArrayList;

public abstract class Usuario {

    protected ArrayList answerList = new ArrayList();
    private Usuario usuario;

    public Usuario getUser(){
        return this.usuario;
    }

    public void setUser(Usuario usuario){
        this.usuario = usuario;
    }

    public abstract String getRole();

    public String seeAnswer(Responder responder){
        if(answerList.contains(responder.getTypeAnswer())){
            return getRole();
        }else{
            if(usuario != null){
                return usuario.seeAnswer(responder);
            }else{
                return "Responta em branco";
            }
        }
    }

}
