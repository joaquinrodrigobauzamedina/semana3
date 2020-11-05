package com.appmiguel.petagram2;

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

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPets;
    private PetsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        establishActionbar();

        rvPets = findViewById(R.id.rvPets);
        adapter = new PetsAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        rvPets.setLayoutManager(linearLayoutManager);
        rvPets.setAdapter(adapter);

        adapter.addPets(new Pet(R.drawable.dog_01, "Lola", "3"));
        adapter.addPets(new Pet(R.drawable.dog_02, "Paco", "4"));
        adapter.addPets(new Pet(R.drawable.dog_03, "Lucky", "5"));
        adapter.addPets(new Pet(R.drawable.dog_04, "Piti", "3"));
        adapter.addPets(new Pet(R.drawable.dog_05, "Peludo", "4"));
        adapter.addPets(new Pet(R.drawable.dog_06, "Laika", "5"));
        adapter.addPets(new Pet(R.drawable.dog_07, "Rocky", "3"));
    }
    public void establishActionbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mimenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.icStar) {
            Intent intent = new Intent(this, DetallePets.class);

            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}