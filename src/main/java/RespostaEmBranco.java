public class RespostaEmBranco implements TipoResposta {

    private static RespostaEmBranco respostaEmBranco = new RespostaEmBranco();

    private RespostaEmBranco() {
    }

    public static RespostaEmBranco getBlankAnswer() {
        return respostaEmBranco;
    }
}