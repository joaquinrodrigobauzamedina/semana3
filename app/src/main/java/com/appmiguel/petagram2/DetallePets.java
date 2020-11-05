package com.appmiguel.petagram2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DetallePets extends AppCompatActivity {

    private RecyclerView rvPets;
    private PetsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        establishToolbar();

        rvPets = findViewById(R.id.rvPets);
        adapter = new PetsAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvPets.setLayoutManager(linearLayoutManager);
        rvPets.setAdapter(adapter);

        adapter.addPets(new Pet(R.drawable.dog_01, "Lola", "3"));
        adapter.addPets(new Pet(R.drawable.dog_02, "Paco", "4"));
        adapter.addPets(new Pet(R.drawable.dog_03, "Lucky", "5"));
        adapter.addPets(new Pet(R.drawable.dog_06, "Laika", "5"));
        adapter.addPets(new Pet(R.drawable.dog_07, "Rocky", "3"));
    }

    public void establishToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ab.setDisplayHomeAsUpEnabled(true);
    }



}