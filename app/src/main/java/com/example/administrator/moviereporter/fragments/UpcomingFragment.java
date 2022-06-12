package com.example.administrator.moviereporter.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.moviereporter.R;
import com.example.administrator.moviereporter.adapters.MovieRecyclerViewAdapter;
import com.example.administrator.moviereporter.models.Movie;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpcomingFragment extends Fragment {

    @BindView(R.id.rvMovies)
    RecyclerView rvMovies;
    private List<Movie> movies;

    public UpcomingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_upcoming, container, false);
        ButterKnife.bind(this, view);

        initializeData();
        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());
        rvMovies.setHasFixedSize(true);
        rvMovies.setLayoutManager(llm);

        MovieRecyclerViewAdapter adapter = new MovieRecyclerViewAdapter(this.getContext(), movies);
        rvMovies.setAdapter(adapter);

        return view;
    }

    private void initializeData() {

        movies = new ArrayList<>();
        movies.add(new Movie("121","Jurrasic World Dominion","Four years after the destruction of Isla Nublar, dinosaurs now live--and hunt--alongside humans all over the world. This fragile balance will reshape the future and determine, once and for all, whether human beings are to remain the apex predators on a planet they now share with history's most fearsome creatures in a new Era.","/MV5BMmI1Y2UxNTAtZTdhNi00YWI2LWFjZDEtZjA2OTI5OTA0YjJmXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_FMjpg_UX342_.jpg","/MV5BZTRlODkxOGMtNmYxZS00OTAzLWE5NjQtYmI5ODhiNmE0NWU5XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_FMjpg_UX780.jpg"));
        movies.add(new Movie("122","LIGHTYEAR","While spending years attempting to return home, marooned Space Ranger Buzz Lightyear encounters an army of ruthless robots commanded by Zurg who are attempting to steal his fuel source.","/MV5BYTg2Zjk0ZTctM2ZmMi00MDRmLWJjOGYtNWM0YjBmZTBjMjRkXkEyXkFqcGdeQXVyMTM1MTE1NDMx._V1_UX342.jpg","/MV5BZWQ5ZDdlMWYtOWMwZS00YzQzLTkwMzctNjk1NDFmNzJjNjI0XkEyXkFqcGdeQXVyMTEzMTI1Mjk3._V1_UX780_.jpg"));
        movies.add(new Movie("123","SPIDERHEAD","In the near future, convicts are offered the chance to volunteer as medical subjects to shorten their sentence. One such subject for a new drug capable of generating feelings of love begins questioning the reality of his emotions.","/MV5BNDVkZTc4OTktNTAyOC00MzQxLThiZjMtM2M3MTlmYzFjY2FkXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX342.jpg","/MV5BOTNiN2U4OTAtMGEyZS00ZDU4LTkwOGQtZDY0Y2E3MzNmMGVkXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_FMjpg_UX780.jpg"));
        movies.add(new Movie("124","Elvis","From his childhood in Tupelo, Mississippi to his rise to stardom starting in Memphis, Tennessee and his conquering of Las Vegas, Nevada, Elvis Presley becomes the first rock 'n roll star and changes the world with his music.","/MV5BMjk0YWFlZDQtZjIzYi00Y2Q3LTkxMjktNmMzNzc1NzFmMzhjXkEyXkFqcGdeQXVyNjc0NzQzNTM@._V1_UX342.jpg","/MV5BOWVlNTYzYTItZjM3OS00YTIzLThhM2UtMjZkZmQ1YWFjYzVlXkEyXkFqcGdeQXVyMTQyMTMwOTk0._V1_UX780.jpg"));
        movies.add(new Movie("125","Thor: Love and Thunder","Thor enlists the help of Valkyrie, Korg and ex-girlfriend Jane Foster to fight Gorr the God Butcher, who intends to make the gods extinct.","/MV5BYmMxZWRiMTgtZjM0Ny00NDQxLWIxYWQtZDdlNDNkOTEzYTdlXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX342.jpg","/MV5BMzZkNTFjMjUtNmMyOS00N2I0LWJkMjgtNGVjMjMzZTY5NzM4XkEyXkFqcGdeQXVyMTQzOTk3NTI0._V1_U780.jpg"));
        movies.add(new Movie("126","Paws of Fury: The Legend of Hank","Hank, a loveable dog with a head full of dreams about becoming a samurai, sets off in search of his destiny.","/MV5BOTYzZjI1ODUtODZiZi00YTBiLWE2OGUtOTZmNDIxZGMwMjcxXkEyXkFqcGdeQXVyMTM1MTE1NDMx._V1_UX342.jpg","/MV5BMTljODQ0NjMtNTQzMy00Zjc4LWIzOGItNTYzYjhmMWY2MWE3XkEyXkFqcGdeQXVyNTQwOTcxOTg@._V1_UX780.jpg"));
    }

}
