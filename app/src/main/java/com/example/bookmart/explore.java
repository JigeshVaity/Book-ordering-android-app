package com.example.bookmart;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;


import com.example.bookmart.R;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class explore extends Fragment {



    private RecyclerView recyclerViewCategoryList_three;

    private RecyclerView.Adapter adapter3;






    //int[] imgList = new int[]{R.drawable.fish1,R.drawable.fish1,R.drawable.fooddish1,R.drawable.brfood,R.drawable.fooddish1};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore, container, false);



        recyclerViewCategoryList_three=view.findViewById(R.id.view3);




        LinearLayoutManager layoutManager3 = new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false);


        recyclerViewCategoryList_three.setLayoutManager(layoutManager3);


        //adapter1 = new CategoryAdapter(getCategoryList());

        adapter3=new ReleaseAdapter_three(requireContext(), getCategoryList_three());



        recyclerViewCategoryList_three.setAdapter(adapter3);

        return view;

    }



    private ArrayList<ReleaseDomain_three> getCategoryList_three() {
        ArrayList<ReleaseDomain_three> categoryList_three = new ArrayList<>();
        categoryList_three.add(new ReleaseDomain_three("Action"));
        categoryList_three.add(new ReleaseDomain_three("Horror"));
        categoryList_three.add(new ReleaseDomain_three("Romance"));
        categoryList_three.add(new ReleaseDomain_three("Historical"));
        categoryList_three.add(new ReleaseDomain_three("Science Fiction"));
        categoryList_three.add(new ReleaseDomain_three("Health"));
        categoryList_three.add(new ReleaseDomain_three("Mystery"));
        categoryList_three.add(new ReleaseDomain_three("Comics"));
        // Add more categories here
        return categoryList_three;
    }


}