// ShowDetailFragment.java
package com.example.bookmart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import java.util.List;

import android.graphics.Paint;


public class ShowDetailFragment extends Fragment {
    private TextView addToCartBtn;
    private TextView titleTxt, feeTxt, descriptionTxt, numberOrderTxt, totalPriceTxt, author, discount, originalprice;
    private ImageView plusBtn, minusBtn, bookpic;
    private BookDomain object;

    private ManagementCart managementCart;
    private int numberOrder = 1;
    private List<BookDomain> bookDomains;
    private static final String ARG_FOOD_DOMAIN = "food_domain";

    private TextView morelesstext;

    private TextView descriptiontext;
    private int maxLinesToShow = 3; // Set the number of lines to show initially
    private boolean isExpanded = true;

    public ShowDetailFragment() {
        // Required empty public constructor
    }

    public static ShowDetailFragment newInstance(BookDomain foodDomain) {
        ShowDetailFragment fragment = new ShowDetailFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_FOOD_DOMAIN, foodDomain);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        managementCart = new ManagementCart(requireContext()); // Initialize the managementCart
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.showdetail, container, false);
        initView(view);
        getBundle();
        morelesstext = view.findViewById(R.id.moreless); // Fix the reference to use 'view'
        descriptiontext = view.findViewById(R.id.description);
        morelesstext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleDescription();
            }
        });

        // Set initial max lines
        //descriptionTextView.setMaxLines(maxLinesToShow);
        return view;
    }


    private void getBundle() {
        Bundle args = getArguments();
        if (args != null) {
            object = (BookDomain) args.getSerializable(ARG_FOOD_DOMAIN);


            if (object != null) {
                int drawableResourceId = getResources().getIdentifier(object.getPic(), "drawable", requireContext().getPackageName());

                Glide.with(this)
                        .load(drawableResourceId)
                        .into(bookpic);

                titleTxt.setText(object.getTitle());
                author.setText(object.getAuthor());
                descriptionTxt.setText(object.getDescription());
                discount.setText("("+object.getDis()+"% off)");
                originalprice.setText("₹"+object.getOprice());
                numberOrderTxt.setText(String.valueOf(numberOrder));
                originalprice.setPaintFlags(originalprice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

                if (object.getFee() != null) {
                    feeTxt.setText("₹" + object.getFee());
                } else {
                    feeTxt.setText("Price not available");
                }
                if (object.getFee() != null) {
                    totalPriceTxt.setText("₹" + object.getFee());
                } else {
                    totalPriceTxt.setText("Price not available");
                }
            }

        }
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numberOrder > 1) {
                    numberOrder = numberOrder - 1;
                }
                numberOrderTxt.setText(String.valueOf(numberOrder));
                totalPriceTxt.setText(String.valueOf("₹" + numberOrder * (object.getFee() != null ? object.getFee() : 0)));

            }
        });
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOrder = numberOrder + 1;
                numberOrderTxt.setText(String.valueOf(numberOrder));
                totalPriceTxt.setText(String.valueOf("₹" + numberOrder * (object.getFee() != null ? object.getFee() : 0)));

            }
        });
        addToCartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Your logic to add the item to the cart...
                object.setNumberInCart(numberOrder);
                managementCart.insertFood(object);
            }
        });
    }

    private void initView(View view) {
        addToCartBtn = view.findViewById(R.id.addToCartBtn);
        titleTxt = view.findViewById(R.id.booktitle);
        author = view.findViewById(R.id.bookauthor);
        feeTxt = view.findViewById(R.id.priceTxt);
        descriptionTxt = view.findViewById(R.id.description);
        numberOrderTxt = view.findViewById(R.id.numberItemTxt);
        plusBtn = view.findViewById(R.id.plusCartBtn);
        minusBtn = view.findViewById(R.id.minusCartBtn);
        bookpic = view.findViewById(R.id.bookPic);
        totalPriceTxt = view.findViewById(R.id.totalPriceTxt);
        discount = view.findViewById(R.id.discount);
        originalprice = view.findViewById(R.id.originalprice);
        // Initialize plusBtn and minusBtn
        plusBtn = view.findViewById(R.id.plusCartBtn);
        minusBtn = view.findViewById(R.id.minusCartBtn);


        // Set onClickListener for plusBtn
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event for plusBtn
                // ...
            }
        });

        // Set onClickListener for minusBtn
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event for minusBtn
                // ...
            }
        });

        // Example - set onClickListener for "Show more/less"
        //TextView moreLessTextView = view.findViewById(R.id.moreless);
        //moreLessTextView.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //public void onClick(View v) {
        //  onShowMoreLessClick(v);
        // }
        //});
    }

    private void toggleDescription() {
        isExpanded = !isExpanded;

        if (isExpanded) {
            // Expand text view
            descriptiontext.setMaxLines(maxLinesToShow);
            morelesstext.setText("show more");
        } else {
            // Collapse text view
            descriptiontext.setMaxLines(Integer.MAX_VALUE);
            morelesstext.setText("show less");
        }
    }
}
