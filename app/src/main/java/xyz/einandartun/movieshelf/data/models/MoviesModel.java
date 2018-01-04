package xyz.einandartun.movieshelf.data.models;

import xyz.einandartun.movieshelf.network.HttpUrlConnectionDataAgent;
import xyz.einandartun.movieshelf.network.MoviesShelfDataAgent;

/**
 * Created by einandartun on 12/27/17.
 */

public class MoviesModel {

    private static MoviesModel sObjInstance;
    private MoviesShelfDataAgent mMoviesShelfDataAgent;


    private MoviesModel() {
        mMoviesShelfDataAgent = HttpUrlConnectionDataAgent.getsObjInstance();
    }

    public static MoviesModel getsObjInstance(){
        if (sObjInstance == null){
            sObjInstance = new MoviesModel();
        }
        return sObjInstance;
    }

    public  void loadMovies(){
        mMoviesShelfDataAgent.loadMovies();
    }
}
