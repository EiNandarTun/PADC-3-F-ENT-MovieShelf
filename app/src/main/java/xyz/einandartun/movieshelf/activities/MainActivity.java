package xyz.einandartun.movieshelf.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.einandartun.movieshelf.MovieShelfApp;
import xyz.einandartun.movieshelf.R;
import xyz.einandartun.movieshelf.adapters.MovieShelfAdapter;
import xyz.einandartun.movieshelf.data.models.MoviesModel;
import xyz.einandartun.movieshelf.delegates.MovieActionDelegate;
import xyz.einandartun.movieshelf.events.LoadedMoviesEvent;

public class MainActivity extends AppCompatActivity implements MovieActionDelegate {

//    RecyclerView rvMovieShelf = findViewById(R.id.rv_movie_shelf);

    @BindView(R.id.rv_movie_shelf)
    RecyclerView rvMovieShelf;

    private MovieShelfAdapter mMovieShelfAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ButterKnife.bind(this,this);

        mMovieShelfAdapter = new MovieShelfAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);

        rvMovieShelf.setLayoutManager(linearLayoutManager);

        rvMovieShelf.setAdapter(mMovieShelfAdapter);

        MoviesModel.getsObjInstance().loadMovies();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTapMovieItems() {
        Intent intent = new Intent(getApplicationContext(),MovieDetailsActivity.class );
        startActivity(intent);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public  void onMoviesLoaded(LoadedMoviesEvent event){
        Log.d(MovieShelfApp.LOG_TAG, "on MovieLoaded :" +event.getPopularMoviesVOList().size());
        mMovieShelfAdapter.setMovies(event.getPopularMoviesVOList());
    }
}
