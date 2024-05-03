// BookAdapter.java
package com.example.bookmart;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    private ArrayList<BookDomain> recommendedDomains;

    public BookAdapter(ArrayList<BookDomain> recommendedDomains) {
        this.recommendedDomains = recommendedDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_one, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BookDomain book = recommendedDomains.get(position);

        holder.title.setText(book.getTitle());

        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(book.getPic(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.pic);



        holder.cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                if (position != RecyclerView.NO_POSITION && position < recommendedDomains.size()) {
                    BookDomain selectedFood = recommendedDomains.get(position);
                    if (selectedFood != null) {
                        ShowDetailFragment showDetailFragment = ShowDetailFragment.newInstance(selectedFood);
                        FragmentTransaction fragmentTransaction = ((AppCompatActivity) holder.itemView.getContext()).getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, showDetailFragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                    }
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return recommendedDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView pic;

        RelativeLayout cat;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.categoryName);
            pic = itemView.findViewById(R.id.categoryPic);
            cat=itemView.findViewById(R.id.category);

        }
    }

}
