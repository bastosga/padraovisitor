import org.example.Carro;
import org.example.Moto;
import org.example.VeiculoVisitor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class VeiculoTest {
    @Test
    void deveExibirInfoMoto() {
        Moto moto = new Moto("Honda", "XRE");
        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Moto{Marca=Honda, Modelo='XRE'}", visitor.exibir(moto));
    }
    @Test
    void deveExibirInfoCarro() {
        Carro carro = new Carro("Ford", "Focus");
        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Carro{Marca=Ford, Modelo='Focus'}", visitor.exibir(carro));
    }

}