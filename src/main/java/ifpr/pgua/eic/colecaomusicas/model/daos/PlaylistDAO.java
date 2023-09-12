package ifpr.pgua.eic.colecaomusicas.model.daos;

import com.github.hugoperlin.results.Resultado;

import ifpr.pgua.eic.colecaomusicas.model.entities.Playlist;

public interface PlaylistDAO {
    //c
    Resultado criar(Playlist playlist);

    //r
    Resultado listar();
    
    //u
    Resultado atualizar(int id, Playlist novo);

    //d
    Resultado delete(int id);
}
