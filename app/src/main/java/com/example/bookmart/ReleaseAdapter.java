package com.example.bookmart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ReleaseAdapter extends RecyclerView.Adapter<ReleaseAdapter.ViewHolder> {
    private ArrayList<ReleaseDomain> categoryDomains;
    private Context context;


    public ReleaseAdapter(Context context,ArrayList<ReleaseDomain> categoryDomains) {
        this.context = context;
        this.categoryDomains = categoryDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_one, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ReleaseDomain category = categoryDomains.get(holder.getAdapterPosition());

        holder.categoryName.setText(category.getTitle());

        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(String.valueOf(category.getPic()), "drawable", holder.itemView.getContext().getPackageName());

        // Resize the image using Glide
        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .centerInside()
                .into(holder.categoryPic);

      /* holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                switch (position) {
                    case 0:
                        // Navigate to the PracticeFragment
                        navigateToAllFragment();
                        break;
                    case 1:
                        // Navigate to another fragment based on position 1
                        navigateToActionFragment();
                        break;


                    default:
                        // Handle the default case or navigate to a default fragment
                        break;
                }
            }

        });*/
    }


   /* private void navigateToAllFragment() {
        // Create an instance of the PracticeFragment
        fragment_all practiceFragment = new fragment_all();

        // Get the FragmentManager and start a new FragmentTransaction
        FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace the current fragment with the PracticeFragment
        fragmentTransaction.replace(R.id.fragment_container, practiceFragment);

        // Add the transaction to the back stack (optional)
        fragmentTransaction.addToBackStack(null);

        // Commit the transaction
        fragmentTransaction.commit();
    }
    private void navigateToActionFragment() {
        // Create an instance of the PracticeFragment
        fragment_action1 practiceFragment = new fragment_action1();

        // Get the FragmentManager and start a new FragmentTransaction
        FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace the current fragment with the PracticeFragment
        fragmentTransaction.replace(R.id.fragment_container, practiceFragment);

        // Add the transaction to the back stack (optional)
        fragmentTransaction.addToBackStack(null);

        // Commit the transaction
        fragmentTransaction.commit();
    }*/


    @Override
    public int getItemCount() {
        return categoryDomains.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView categoryPic;
        public TextView categoryName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryPic = itemView.findViewById(R.id.categoryPic);
            categoryName = itemView.findViewById(R.id.categoryName);
        }
    }
}