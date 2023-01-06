public class RespostaDoPromotor implements TipoResposta {

    private static RespostaDoPromotor respostaDoPromotor = new RespostaDoPromotor();

    private RespostaDoPromotor(){};

    public static RespostaDoPromotor getRespostaDoPromotor(){
        return respostaDoPromotor;
    }
}
