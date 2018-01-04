package xyz.einandartun.movieshelf.events;

import java.util.List;

import xyz.einandartun.movieshelf.data.vo.PopularMoviesVO;

/**
 * Created by einandartun on 1/4/18.
 */

public class LoadedMoviesEvent {
    private List<PopularMoviesVO> popularMoviesVOList;

    public LoadedMoviesEvent(List<PopularMoviesVO> popularMoviesVO) {
        this.popularMoviesVOList = popularMoviesVO;
    }

    public List<PopularMoviesVO> getPopularMoviesVOList() {
        return popularMoviesVOList;
    }
}
