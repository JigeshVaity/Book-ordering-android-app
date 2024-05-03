package com.example.bookmart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ExploreCategoryDomain> recommendedDomains;

    public ExploreAdapter(Context context, ArrayList<ExploreCategoryDomain> recommendedDomains) {
        this.context = context;
        this.recommendedDomains = recommendedDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_showbooks, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ExploreCategoryDomain book = recommendedDomains.get(position);

        holder.bookName.setText(book.getBookName());
        holder.bookauthor.setText(book.getBookauthor());
        holder.bookdescription.setText(book.getBookdescription());
        holder.discount.setText(book.getDiscount());
        holder.bookoriginalprice.setText(book.getBookoriginalprice());
        holder.bookprice.setText(book.getBookprice());

        int drawableResourceId = context.getResources().getIdentifier(book.getBookPic(), "drawable", context.getPackageName());
        Glide.with(context).load(drawableResourceId).into(holder.bookPic);

        // Set onClickListener on the item view

    }



    @Override
    public int getItemCount() {
        return recommendedDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView bookPic;
        TextView bookName, bookauthor, bookdescription, bookprice, discount, bookoriginalprice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            bookprice = itemView.findViewById(R.id.bookprice);
            bookName = itemView.findViewById(R.id.bookName);
            bookauthor = itemView.findViewById(R.id.bookauthor);
            bookdescription = itemView.findViewById(R.id.bookdescription);
            discount = itemView.findViewById(R.id.discount);
            bookoriginalprice = itemView.findViewById(R.id.bookoriginalprice);
            bookPic = itemView.findViewById(R.id.bookPic);
        }
    }
}
