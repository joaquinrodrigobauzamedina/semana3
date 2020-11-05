package com.appmiguel.petagram2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PetsAdapter extends RecyclerView.Adapter<PetsHolder> {

    private List<Pet> petList;

    public PetsAdapter() {
        petList = new ArrayList<>();
    }

    @NonNull
    @Override
    public PetsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new PetsHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PetsHolder holder, int i) {
        PetsHolder.init(petList.get(i));
    }

    @Override
    public int getItemCount() {
        return petList.size();
    }

    public void addPets(Pet pet) {
        petList.add(pet);
        notifyDataSetChanged();
    }

}
