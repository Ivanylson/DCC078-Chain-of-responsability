public class Responder {

    private TipoResposta tipoResposta;

    public Responder(TipoResposta tipoResposta){
        this.tipoResposta = tipoResposta;
    }

    public TipoResposta getRespostaDoTipo(){
        return this.tipoResposta;
    }

    public void setTRespostaDoTipo(TipoResposta tipoResposta){
        this.tipoResposta = tipoResposta;
    }

}
