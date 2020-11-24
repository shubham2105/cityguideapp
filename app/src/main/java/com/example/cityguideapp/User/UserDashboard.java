package com.example.cityguideapp.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.cityguideapp.HelperClasses.HomeAdapter.FeaturedAdapter;
import com.example.cityguideapp.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.example.cityguideapp.R;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {

    RecyclerView featuredRecycler;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);
    //hooks

        featuredRecycler = findViewById(R.id.featured_recycler);

        featuredRecycler();




    }

    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass>featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.macdlogo,"Mcdonald's",""));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.dominos_logo,"Domino's Pizza",""));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.subway_logo,"Subway",""));
        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);

    }
}