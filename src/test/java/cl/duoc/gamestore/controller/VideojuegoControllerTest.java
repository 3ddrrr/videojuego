package cl.duoc.gamestore.controller;

import cl.duoc.gamestore.model.Videojuego;
import cl.duoc.gamestore.service.VideojuegoService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

//anotacion que indica que solo probará el videojuego controller sisi
@WebMvcTest(VideojuegoController.class)

public class VideojuegoControllerTest {

}
