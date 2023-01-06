public class RespostaDoDetrator implements TipoResposta {

    private static RespostaDoDetrator respostaDoDetrator = new RespostaDoDetrator();

    private RespostaDoDetrator() {
    }

    public static RespostaDoDetrator getDetractorAnswer() {
        return respostaDoDetrator;
    }
}