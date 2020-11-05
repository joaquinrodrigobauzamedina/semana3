package com.appmiguel.petagram2;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PetsHolder extends RecyclerView.ViewHolder {

    private static ImageView imgPet;
    public  static ImageButton btnbone;
    private static TextView namePet;
    private static TextView rating;
    private static ImageButton btnBoneYellow;

    public PetsHolder(@NonNull View itemView) {
        super(itemView);

        imgPet = itemView.findViewById(R.id.imgPet);
        btnbone = itemView.findViewById(R.id.btnBone);
        namePet = itemView.findViewById(R.id.namePet);
        rating = itemView.findViewById(R.id.rating);
        btnBoneYellow = itemView.findViewById(R.id.btnBoneYellow);
    }

    public static void init(Pet pet) {
        imgPet.setImageResource((pet.getFoto()));
        namePet.setText(pet.getNombre());
        rating.setText(pet.getRating());


    }
}
