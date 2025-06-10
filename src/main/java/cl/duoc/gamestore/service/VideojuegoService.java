package cl.duoc.gamestore.service;

import cl.duoc.gamestore.model.Videojuego;
import cl.duoc.gamestore.repository.VideojuegoRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class VideojuegoService {
    //instancia del repo
    private VideojuegoRepository repo;
    //constructor
    public VideojuegoService(VideojuegoRepository repo) {
        this.repo = repo;
    }

    //buscar todo get
    public List<Videojuego> findAll() {
        return repo.findAll();
    }

    //guardar post
    public Videojuego save(Videojuego v) {
        return repo.save(v);
    }

    //eliminar delete
    public void delete(Long id) {
        repo.deleteById(id);
    }


}
