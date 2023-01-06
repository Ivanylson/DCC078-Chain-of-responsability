public class Responder {

    private TipoResposta tipoResposta;

    public Responder(TipoResposta tipoResposta){
        this.tipoResposta = tipoResposta;
    }

    public TipoResposta getTypeAnswer(){
        return this.tipoResposta;
    }

    public void setTypeAnswer(TipoResposta tipoResposta){
        this.tipoResposta = tipoResposta;
    }

}
