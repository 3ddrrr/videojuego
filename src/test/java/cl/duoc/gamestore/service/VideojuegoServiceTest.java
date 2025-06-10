package cl.duoc.gamestore.service;

import cl.duoc.gamestore.model.Videojuego;
import cl.duoc.gamestore.repository.VideojuegoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


//librerias para usar mockito
import org.mockito.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*; // mocks simulr inserciones, datos de listas, etc

public class VideojuegoServiceTest {
    //Creando una instancia de mocks=simular para poder inyectarlas donde sea necesario
    @InjectMocks
    private VideojuegoService service;

    //Creando mock del repositorio // objeto simulado
    @Mock
    private VideojuegoRepository repo;

    // crear constructor para inicializar test antes de cada prueba
    public VideojuegoServiceTest() {
        //abre e inicializa los mocks anotados con @mock y el @injectmocks
        MockitoAnnotations.openMocks(this);
    }

    //aplicar testing al findAll, en controller nos enfocamos ahora

    @Test
    @DisplayName("Testing 1 - FindAll Service")
    void testFindAll() {

        //simular la creacion de un objeto de videojuego
        when(repo.findAll()).thenReturn(List.of(new Videojuego(1L,"Sonic Pinball","SEGA Genesis")));

        //llamar al metodo de servicio que será pobado
        List<Videojuego> resultado = service.findAll();

        //Verificacion , como agregamos solo 1 que es sonic, se pone 1
        assertEquals(1, resultado.size());


    }

}
