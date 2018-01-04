package xyz.einandartun.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import xyz.einandartun.movieshelf.R;
import xyz.einandartun.movieshelf.data.vo.PopularMoviesVO;
import xyz.einandartun.movieshelf.delegates.MovieActionDelegate;
import xyz.einandartun.movieshelf.viewholders.MovieShelfViewHolder;

/**
 * Created by einandartun on 12/7/17.
 */

public class MovieShelfAdapter extends RecyclerView.Adapter<MovieShelfViewHolder> {

    private MovieActionDelegate mMovieActionDelegate;
    private List<PopularMoviesVO> mPopularMoviesVOList;

    public MovieShelfAdapter(MovieActionDelegate movieActionDelegate) {
        mMovieActionDelegate = movieActionDelegate;
        mPopularMoviesVOList = new ArrayList<>();
    }

    @Override
    public MovieShelfViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewMovieShelf = layoutInflater.inflate(R.layout.item_movie_shelf,parent,false);
        MovieShelfViewHolder movieShelfViewHolder = new MovieShelfViewHolder(viewMovieShelf, mMovieActionDelegate);

        return movieShelfViewHolder;
    }

    @Override
    public void onBindViewHolder(MovieShelfViewHolder holder, int position) {
        holder.setMovies(mPopularMoviesVOList.get(position));
    }

    @Override
    public int getItemCount() {
        return mPopularMoviesVOList.size();
    }

    public  void setMovies(List<PopularMoviesVO> popularMoviesVOList){
        mPopularMoviesVOList = popularMoviesVOList;
        notifyDataSetChanged();
    }
}
