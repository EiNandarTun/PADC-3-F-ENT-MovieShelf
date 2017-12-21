package xyz.einandartun.movieshelf.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.einandartun.movieshelf.R;
import xyz.einandartun.movieshelf.delegates.MovieActionDelegate;

/**
 * Created by einandartun on 12/7/17.
 */

public class MovieShelfViewHolder extends RecyclerView.ViewHolder {

    private MovieActionDelegate mMovieActionDelegate;

    public MovieShelfViewHolder(View itemView, MovieActionDelegate movieActionDelegate) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        mMovieActionDelegate = movieActionDelegate;
    }

    @OnClick(R.id.cv_movies_items_root)
    public void onTapMoviesItem(){
        mMovieActionDelegate.onTapMovieItems();
    }
}
