public class RespostaNeutra implements TipoResposta {

    private static RespostaNeutra respostaNeutra = new RespostaNeutra();

    private RespostaNeutra() {
    }

    public static RespostaNeutra getNeutralAnswer() {
        return respostaNeutra;
    }
}