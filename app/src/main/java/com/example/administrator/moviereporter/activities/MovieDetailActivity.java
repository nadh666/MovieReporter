package com.example.administrator.moviereporter.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.moviereporter.models.Movie;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.example.administrator.moviereporter.R;

public class MovieDetailActivity extends AppCompatActivity {

    Movie movie;
    @BindView(R.id.ivMovieBackdrop)
    ImageView ivMovieBackdrop;
    @BindView(R.id.tvOverview)
    TextView tvOverview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            movie = (Movie) extras.getSerializable("MOVIE");
            this.setTitle(movie.getTitle());
            tvOverview.setText(movie.getOverview());

            Picasso.with(this)
                    .load(movie.getBackdropPath())
                    .into(ivMovieBackdrop);

        }
    }
}
