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
public class NowPlayingFragment extends Fragment {

    @BindView(R.id.rvMovies)
    RecyclerView rvMovies;
    private List<Movie> movies;

    public NowPlayingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_now_playing, container, false);
        ButterKnife.bind(this, view);

        initializeData();

        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());
        rvMovies.setHasFixedSize(true);
        rvMovies.setLayoutManager(llm);

        MovieRecyclerViewAdapter adapter = new MovieRecyclerViewAdapter(getContext(), movies);
        rvMovies.setAdapter(adapter);

        return view;
    }

    private void initializeData() {

        movies = new ArrayList<>();
        movies.add(new Movie("101","Top Gun: Maverick","After more than thirty years of service as one of the Navy's top aviators, Pete Mitchell is where he belongs, pushing the envelope as a courageous test pilot and dodging the advancement in rank that would ground him.","/MV5BMmIwZDMyYWUtNTU0ZS00ODJhLTg2ZmEtMTk5ZmYzODcxODYxXkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_UX342.jpg","/MV5BMzNkODU5M2EtZGE2Zi00ZTg0LWI1NDEtYjYwNjk4Zjc5MDJmXkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_U780.jpg"));
        movies.add(new Movie("103","Downton Abbey","Follow-up to the 2019 feature film in which the Crawley family and Downton staff received a royal visit from the King and Queen of Great Britain.","/MV5BMmYzMWFkMTMtZGMwMS00NjI0LWE2YTItYTU4ODlkMWE0Y2Q4XkEyXkFqcGdeQXVyMTQyMTMwOTk0._V1_UX780.jpg","/MV5BYmE1MjM5ZDctMmFjMi00MzNkLTlhMDEtYzBhNDkyOTI4NGY1XkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_UX342.jpg"));
        movies.add(new Movie("104","The Lost City","A reclusive romance novelist on a book tour with her cover model gets swept up in a kidnapping attempt that lands them both in a cutthroat jungle adventure.","/MV5BOTkxMGM1MzQtNDJlNi00NmY1LTk4ZDktYzY2ODZjMjQ1ZGEzXkEyXkFqcGdeQXVyMTQyMTMwOTk0._V1_UX342.jpg","/MV5BODA4MDI5MWQtOGQ1MC00Zjk3LTgyMjYtMDUwZTQwZThlYTI1XkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_U780.jpg"));
        movies.add(new Movie("105","Vikram","Amar is assigned to investigate a case of serial killings. When Amar investigates the case, he realizes it is not what it seems to be and following down this path will lead to nothing but war between everyone involved.","/MV5BMmJhYTYxMGEtNjQ5NS00MWZiLWEwN2ItYjJmMWE2YTU1YWYxXkEyXkFqcGdeQXVyMTEzNzg0Mjkx._V1_UX342.jpg","/MV5BOTYxOWU3OWYtOGM4NC00NDhlLTlmZTYtMGUxM2YwZmFhOGFlXkEyXkFqcGdeQXVyMTA3MDk2NDg2._V1_UX780.jpg"));
        movies.add(new Movie("106","Sonic the Hedgehog 2","When the manic Dr Robotnik returns to Earth with a new ally, Knuckles the Echidna, Sonic and his new friend Tails is all that stands in their way.","/MV5BMGI1NjA1MjUtNGQxNC00NDYyLThjODgtZjFkZjQ4OGM0NDc5XkEyXkFqcGdeQXVyMTM0NTUzNDIy._V1_UX342.jpg","/MV5BMzExMWVjODMtYjgzOC00ZDljLTgxMTktYWQ0NGNiOTcxNGYxXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_UX780.jpg")); }

}
