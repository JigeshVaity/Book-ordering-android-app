package com.example.bookmart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ReleaseAdapter_three extends RecyclerView.Adapter<ReleaseAdapter_three.ViewHolder> {
    private ArrayList<ReleaseDomain_three> categoryDomains;
    private Context context;


    public ReleaseAdapter_three(Context context,ArrayList<ReleaseDomain_three> categoryDomains) {
        this.context = context;
        this.categoryDomains = categoryDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_three, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ReleaseDomain_three category = categoryDomains.get(holder.getAdapterPosition());

        holder.categoryName.setText(category.getTitle());
        holder.categoryName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle item click here
                // Get the position of the item clicked
                int position = holder.getAdapterPosition();
                // Get the item based on its position
                ReleaseDomain_three clickedItem = categoryDomains.get(position);
                // Navigate to the appropriate fragment based on the clicked item
                navigateToFragment(clickedItem);
            }
        });


    }
    private void navigateToFragment(ReleaseDomain_three item) {
        // Create a new instance of the fragment based on the clicked item
        Fragment fragment;
        if (item.getTitle().equals("Action")) {
            fragment = new fragment_action2();
        } else if (item.getTitle().equals("Horror")) {
            fragment = new fragment_horror2();
        }else if (item.getTitle().equals("Romance")) {
            fragment = new fragment_romance2();
        } else if (item.getTitle().equals("Historical")) {
                fragment = new fragment_historical2();
        }else if(item.getTitle().equals("Science Fiction")){
            fragment=new fragment_sciencefiction2();
        }else if(item.getTitle().equals("Health")){
            fragment=new fragment_health2();
        }else if(item.getTitle().equals("Mystery")){
            fragment=new fragment_mystery2();
        }else if(item.getTitle().equals("Comics")){
            fragment=new fragment_comics2();
        }
            else {
            // Handle other categories or set a default fragment
            fragment = new explore();
        }

        // Replace the current fragment with the new fragment
        FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    @Override
    public int getItemCount() {
        return categoryDomains.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView categoryName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryName = itemView.findViewById(R.id.genre);
        }
    }
}