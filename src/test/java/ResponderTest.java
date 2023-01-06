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
        assertEquals("Atendente", atendente.seeAnswer(new Responder(RespostaDoPromotor.getPromoterAnswer())));
    }

    @Test
    void deveSerRetornarNeutroResposta(){
        assertEquals("Gerente", atendente.seeAnswer(new Responder(RespostaNeutra.getNeutralAnswer())));
    }

    @Test
    void deveRetornarRespostaDetrator(){
        assertEquals("Proprietario", atendente.seeAnswer(new Responder(RespostaDoDetrator.getDetractorAnswer())));
    }

    @Test
    void deveRetornarRespostaEmBranco(){
        assertEquals("Responta em branco", atendente.seeAnswer(new Responder(RespostaEmBranco.getBlankAnswer())));
    }

}