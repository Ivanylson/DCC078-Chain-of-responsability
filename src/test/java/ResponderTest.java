import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResponderTest {
    Atendente atendente;
    Gerente gerente;
    Proprietario proprietario;

    @BeforeEach
    void setUp(){
        proprietario = new Proprietario(null);
        gerente = new Gerente(proprietario);
        atendente = new Atendente(gerente);
    }

    @Test
    void deveRetornarRespostaPromotor(){
        assertEquals("Atendente", atendente.verResposta(new Responder(RespostaDoPromotor.getRespostaDoPromotor())));
    }

    @Test
    void deveSerRetornarNeutroResposta(){
        assertEquals("Gerente", atendente.verResposta(new Responder(RespostaNeutra.getRespostaNeutra())));
    }

    @Test
    void deveRetornarRespostaDetrator(){
        assertEquals("Proprietario", atendente.verResposta(new Responder(RespostaDoDetrator.getDetratorResposta())));
    }

    @Test
    void deveRetornarRespostaEmBranco(){
        assertEquals("Responta em branco", atendente.verResposta(new Responder(RespostaEmBranco.getRespostaEmBranco())));
    }

}