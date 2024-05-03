package com.example.bookmart;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_romance1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_romance1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_romance1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_romance1.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_romance1 newInstance(String param1, String param2) {
        fragment_romance1 fragment = new fragment_romance1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_romance1, container, false);

        LinearLayout l1=view.findViewById(R.id.ln1);
        LinearLayout l2=view.findViewById(R.id.ln2);
        LinearLayout l3=view.findViewById(R.id.ln3);
        LinearLayout l4=view.findViewById(R.id.ln4);
        LinearLayout l5=view.findViewById(R.id.ln5);
        LinearLayout l6=view.findViewById(R.id.ln6);
        LinearLayout l7=view.findViewById(R.id.ln7);
        LinearLayout l8=view.findViewById(R.id.ln8);


        // Repeat for other image views...

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the current fragment with ShowDetailFragment
                BookDomain bookDomain = getBookDomainForImg1(); // Implement this method to get book info
                replaceFragment(ShowDetailFragment.newInstance(bookDomain));
            }
        });

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the current fragment with ShowDetailFragment
                BookDomain bookDomain = getBookDomainForImg2(); // Implement this method to get book info
                replaceFragment(ShowDetailFragment.newInstance(bookDomain));
            }
        });

        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the current fragment with ShowDetailFragment
                BookDomain bookDomain = getBookDomainForImg3(); // Implement this method to get book info
                replaceFragment(ShowDetailFragment.newInstance(bookDomain));
            }
        });

        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the current fragment with ShowDetailFragment
                BookDomain bookDomain = getBookDomainForImg4(); // Implement this method to get book info
                replaceFragment(ShowDetailFragment.newInstance(bookDomain));
            }
        });

        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the current fragment with ShowDetailFragment
                BookDomain bookDomain = getBookDomainForImg5(); // Implement this method to get book info
                replaceFragment(ShowDetailFragment.newInstance(bookDomain));
            }
        });

        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the current fragment with ShowDetailFragment
                BookDomain bookDomain = getBookDomainForImg6(); // Implement this method to get book info
                replaceFragment(ShowDetailFragment.newInstance(bookDomain));
            }
        });

        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the current fragment with ShowDetailFragment
                BookDomain bookDomain = getBookDomainForImg7(); // Implement this method to get book info
                replaceFragment(ShowDetailFragment.newInstance(bookDomain));
            }
        });

        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the current fragment with ShowDetailFragment
                BookDomain bookDomain = getBookDomainForImg8(); // Implement this method to get book info
                replaceFragment(ShowDetailFragment.newInstance(bookDomain));
            }
        });

        // Repeat for other image views...

        return view;
    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = ((AppCompatActivity) requireContext()).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private BookDomain getBookDomainForImg1() {
        // Assuming you have a list of books
        ArrayList<BookDomain> bookList = getCategoryList_two();

        // Check if the list is not empty
        if (!bookList.isEmpty()) {
            // Get the first book in the list
            return bookList.get(0);
        } else {
            // Handle case when the list is empty
            return null;
        }
    }
    private BookDomain getBookDomainForImg2() {
        // Assuming you have a list of books
        ArrayList<BookDomain> bookList = getCategoryList_two();

        // Check if the list is not empty
        if (!bookList.isEmpty()) {
            // Get the first book in the list
            return bookList.get(1);
        } else {
            // Handle case when the list is empty
            return null;
        }
    }

    private BookDomain getBookDomainForImg3() {
        // Assuming you have a list of books
        ArrayList<BookDomain> bookList = getCategoryList_two();

        // Check if the list is not empty
        if (!bookList.isEmpty()) {
            // Get the first book in the list
            return bookList.get(2);
        } else {
            // Handle case when the list is empty
            return null;
        }
    }

    private BookDomain getBookDomainForImg4() {
        // Assuming you have a list of books
        ArrayList<BookDomain> bookList = getCategoryList_two();

        // Check if the list is not empty
        if (!bookList.isEmpty()) {
            // Get the first book in the list
            return bookList.get(3);
        } else {
            // Handle case when the list is empty
            return null;
        }
    }

    private BookDomain getBookDomainForImg5() {
        // Assuming you have a list of books
        ArrayList<BookDomain> bookList = getCategoryList_two();

        // Check if the list is not empty
        if (!bookList.isEmpty()) {
            // Get the first book in the list
            return bookList.get(4);
        } else {
            // Handle case when the list is empty
            return null;
        }
    }

    private BookDomain getBookDomainForImg6() {
        // Assuming you have a list of books
        ArrayList<BookDomain> bookList = getCategoryList_two();

        // Check if the list is not empty
        if (!bookList.isEmpty()) {
            // Get the first book in the list
            return bookList.get(5);
        } else {
            // Handle case when the list is empty
            return null;
        }
    }

    private BookDomain getBookDomainForImg7() {
        // Assuming you have a list of books
        ArrayList<BookDomain> bookList = getCategoryList_two();

        // Check if the list is not empty
        if (!bookList.isEmpty()) {
            // Get the first book in the list
            return bookList.get(6);
        } else {
            // Handle case when the list is empty
            return null;
        }
    }

    private BookDomain getBookDomainForImg8() {
        // Assuming you have a list of books
        ArrayList<BookDomain> bookList = getCategoryList_two();

        // Check if the list is not empty
        if (!bookList.isEmpty()) {
            // Get the first book in the list
            return bookList.get(7);
        } else {
            // Handle case when the list is empty
            return null;
        }
    }

    private ArrayList<BookDomain> getCategoryList_two() {
        ArrayList<BookDomain> categoryList_two = new ArrayList<>();
        categoryList_two.add(new BookDomain("To Forge a Hollow Crown", "toforgeahollowcrown",160.0,"60","399","\"In the shadow of the throne, desire knows no bounds. \"From the moment I united the rebels with Theron's formidable warriors, our combined forces have been on a collision course with destiny, all roads leading to Athain. But with every step towards confronting Theron's formidable mother, Empress Nyana, it feels like the universe is testing our love.\n" +
                "\n" +
                "While many in our makeshift army may disapprove of our union, nothing can quell the burning passion between Theron and me. But the challenges we face aren't just from foes. The treacherous desert hides creatures of legend, shadows of our past, and even another elven warrior who, with her own aspirations for the throne, stands between us and our dream of a free world.\n" +
                "\n" +
                "Can our love survive the myriad forces working to pull us apart? Or will the empire's weight prove too much, threatening to tear us apart forever?\n" +
                "\n" +
                "Content To Forge a Hollow Crown is a dark and steamy read recommended for readers 18+ due to explicit language, violence, and sexual situations. To Forge a Hollow Crown is the final installment in the Sands of Maeoris series.","Atley Wikes","1"));
        categoryList_two.add(new BookDomain("In His Hands", "inhishands",95.00,"25","126","Consent is everything...and with consent, everything is possible.\n" +
                "\n" +
                "Olivia has one wish-to find a partner who will do consensual non-consent scenes with her. She thought she'd found the perfect man, but he turned out to be more dud than Dom. When their relationship implodes, she moves out, and moves in with her friend Cade. He's happy to have her, but living with him won't be easy. It was easier to ignore her feelings for him, and the fact that he'd always been her ideal Dom, when she'd had a boyfriend. But he'd stopped doing CNC after a scene had gone wrong, so she'd set her sights elsewhere.\n" +
                "\n" +
                "Cade has his own problems. He's been in love with Olivia since they met, but when she started dating someone else, he put his feelings aside and focused on being her friend. But now that she's single again, he's not going to let opportunity pass him by. He's happy to set her straight about his feelings on CNC play-totally still into it, but won't do casual scenes- and more than eager to make all her kinky dreams come truе.\n" +
                "\n" +
                "Olivia finally has the kind of kinky relationship she's always wanted, and her feelings for Cade only grow stronger as time goes on. But when her ex reappears to explain why he ended their relationship, she wonders if she's mistaking her happiness with their CNC play for love-and worries that Cade might be doing the same...\n" +
                "\n" +
                "Reader advisory: This book includes scenes of consensual non-consent, as well as RACK, role-play, sexual fantasy, blood play and rape fantasy.\n" +
                "\n" +
                "Publisher's Note: The story told in this book begins on the same day that Sharing His Submissive ends, and before the events of Show Me Something Good.","Hannah Murray","1"));
        categoryList_two.add(new BookDomain("Midnight Rider", "midnightrider",245.00,"44","436","Savor the magic of New York Times bestselling author Diana Palmer in a dazzlingly sensual story of turn-of-the-century Texas, of a man as enigmatic and forbidding as the sun-drenched land-and the woman who dares to cross into the uncharted territory of his heart.\n" +
                "\n" +
                "To Bernadette Barron, Eduardo Cortes was the enemy. A noble count with a sprawling ranch in the grand state of Texas, Cortes challenged her with dark, penetrating eyes that seemed to pierce her very soul. Could he see the burning truth: that she loved him? It is a secret Bernadette vows to keep-- especially now that she is to become his wife. For theirs is a marriage bargain, pure and simple. He needs a rich wife to save his ranch; she needs a titled husband.\n" +
                "\n" +
                "Yet desire will turn a marriage of convenience into a passionate battle of wills, and change an innocent girl into a woman aware of her own powers of attraction. For it is love's fiery initiation that will make Bernadette aware of her own capacity for pleasure as well as her husband's skill at providing it. And it is the sheer force of her own love that will give her newfound strength to battle against the odds to claim a man and a love she will not be denied...","Diana Palmer","1"));
        categoryList_two.add(new BookDomain("Once Upon a Dream", "onceuponadream",118.00,"16","140","Lush. Evocative. Romantic. Enter the sensual world of modern day fairy tales with three novellas by USA Today bestselling author Sierra Simone.\n" +
                "\n" +
                "Music Box Girl\n" +
                "\n" +
                "A Twelve Dancing Princesses Story\n" +
                "\n" +
                "Every night they dance. Every night he follows.\n" +
                "\n" +
                "Ex-soldier private investigator Cal Dugan has been hired to follow Tamsin and her ballerinas to find out where they go at night. He didn't count on Tamsin's courage or her passion. He didn't count on the way she twists him up inside.\n" +
                "\n" +
                "He solves the riddle of their disappearing act, but he'll never reveal Tamsin's secrets, no matter the cost.\n" +
                "\n" +
                "American Witch\n" +
                "\n" +
                "A Princess and the Pea Story\n" +
                "\n" +
                "Morgan wants to start fresh, but a mystery man at the masked ball lights her up from the inside. His hands, his touch, his scent-they're all too familiar, all too real. He's always been her weakness, but can she deny him when every part of her is on fire for him and only him?\n" +
                "\n" +
                "Red & White\n" +
                "\n" +
                "A Snow-White and Rose-Red Story\n" +
                "\n" +
                "All that art student Scarlett wants to do is wait out a howling snowstorm and kiss her best friend senseless, but all her careful plans fall apart the minute a near-frozen bear stumbles through the door.\n" +
                "\n" +
                "Except he's not a bear-he's very much a man-and there's only one way to warm him up from the cold...","Sierra Simone","1"));
        categoryList_two.add(new BookDomain("Pop Tarts and Mistletoe", "poptartsandmistletoe",200.00,"20","250","Being stuck at the airport wasn't part of my holiday plans.I was on my way to stay with my best friend and his family for the holidays when a freak snowstorm hit. Now I'm stuck, all planes are grounded, and there are no hotel rooms available. I also have no clue of when I'd be able to get on another plane, so here I sit. Then I saw her. She stood in front of a vending machine, scrounging through her purse. When she found her last bit of change, she carefully made her selection. A disappointed look came over her face and she began to punch and kick the vending machine trying to get whatever she'd selected to drop. When it did, she threw her hands in the air as if she'd just made the winning touchdown. Then she bent down and pulled out a package of pop tarts. Pop tarts? Who buys pop tarts from a vending machine? She was feisty and cute, and I knew I needed to meet her. So, I invited her to sit with me. The night passed quickly, with flights heading out the next morning. It was then I realized I'd missed an opportunity as I watched her disappear into the airport crowd. However, Father Christmas smiled down on me once again when I discovered that the beautiful holiday angel, I'd met earlier was my best friends sister, and I only had a few days to make her mine.","S.L. Sterling","1"));
        categoryList_two.add(new BookDomain("All That We Are Together", "allthatwearetogether",81.00,"10","90","Three years without even seeing him. Three years without Axel.\n" +
                "\n" +
                "How do you move on from a broken heart?\n" +
                "\n" +
                "Three years have passed since Axel Nguyen shattered Leah Jones' heart into a million pieces, and Leah has spent every moment of those three years distracting herself from the devastation. She tries to move on with Landon, a guy she meets in college, but she can only truly escape thoughts of Axel when she's painting. At least one good thing has come out of all of it: her dream of exhibiting her work is finally coming true.\n" +
                "\n" +
                "Axel is achingly aware every day of how much he misses Leah. The moment he learns about Leah's exhibit, Axel can't think about anything else but to go see her. Being in the same room with Leah, as beautiful and magnetic as he remembers, leaves Axel desperate and Leah breathless in his presence. He offers to be her agent; she accepts. One work trip to Paris later leaves Leah and Axel full of pent-up attraction and wondering if their whirlwind romance is a forever kind of love or if it's better off left in the past.\n" +
                "\n" +
                "International bestselling author Alice Kellen concludes her emotional new adult duology with an evocative and passionate love story for readers of Colleen Hoover, Anna Todd, and books to make you ugly cry.","Allice Kellen","1"));
        categoryList_two.add(new BookDomain("Beauty Found", "beautyfound",540.00,"10","600","EVEN IN HELL, THERE IS BEAUTY TO BE FOUND.\n" +
                "\n" +
                "There is life before the Hangmen. There is life before your soulmate is found.\n" +
                "\n" +
                "There is life even when all seems lost.\n" +
                "\n" +
                "Shane 'Tank' Rutherford is just seventeen when, escaping his father's lethal fists, he ends up on the streets. Fighting for survival, he finds himself suddenly saved. Saved by a group that takes him under their wing.\n" +
                "\n" +
                "A group that everyone knows the Texas Ku Klux Klan.\n" +
                "\n" +
                "Years later, Tank is disillusioned from the Klan and what they stand for. Recently released from prison, he is lost in a world he no longer knows. He is on his own. Until he picks up a woman hitchhiking on the side of a road. A beauty queen dressed in pink.\n" +
                "\n" +
                "Susan-Lee Stewart is done with the crowns. She's done with the glitz and glamor of pageant life. And she's done with the bruises... the bruises gifted by the one person who should love her unconditionally -her mother.\n" +
                "\n" +
                "Seconds after taking yet another pageant title, Susan-Lee makes a split decision and flees the stage. Flees the glossy life of a pageant queen, flees her violent mother and jumps straight on the back of a tattooed muscled god's motorcycle\n" +
                "\n" +
                "And never looks back.\n" +
                "\n" +
                "As Susan-Lee holds tightly to Tank's waist, neither of them know it's a chance meeting that will change both their lives, and their hearts, forever.\n" +
                "\n" +
                "There are stories of how you find your other half. There are stories of how someone can save your soul when all hope is lost.\n" +
                "\n" +
                "Before they were Tank and Beauty, they were Shane and Susan-Lee. Two lost hearts who, together, were finally found.\n" +
                "\n" +
                "Contemporary dark romance. Contains scenes of violence, offensive language, mature topics and sexual situations.\n" +
                "\n" +
                "Recommended for ages 18 and over.\n" +
                "\n" +
                "The Hades Hangmen series has been taken down from Amazon and is no longer for sale.","Tillie Cole","1"));
        categoryList_two.add(new BookDomain("Bonded Beyond Lies", "bondedbeyondlies",143.00,"3","148","There are moments in time you wish to capture and keep. Others you wish you could forget forever- moments when your life irrecoverably changes. You hope it's a change for the better, but I haven't found that to be true.\n" +
                "\n" +
                "At ten everything changed. I was loved. I was cherished. Then...I wasn't.\n" +
                "\n" +
                "The day I turn eighteen is the second time everything changes. I find my mate and he rejects me. I'm not surprised because the Alpha's son has hated me for years along with the rest of my pack. Being rejected fills me with pain I've never known and makes me feel hollow because it steals my hope.\n" +
                "\n" +
                "I don't know what will happen the next time everything changes, but I'm afraid of what that moment will bring. How will I survive it? When will the pain stop? Can I escape the darkness I've been trapped in for far too long?\n" +
                "\n" +
                "I can only hope the Moon Goddess will give me the strength I need to find my true purpose and no longer be swallowed whole by the pain of my past. When the lies surface, maybe I can be bonded beyond them.\n" +
                "\n" +
                "18+ This is a wolf shifter rejected mates story and there are dark themes and elements in this story (bullying, violence, no SA). If you like alpha heroes and an insta-love story that is sweet and spicy but isn't necessarily simple, then this is for you. No cheating with a guaranteed HEA. This is a PNR romance and there will be more stories within this world in the future.\n" +
                "\n" +
                "We're taught fate knows all. That it leads you down a certain path because that's where you're meant to be. But what if whoever is waiting for you at the end of it chooses not to accept your combined destiny and instead fights it? The authors in this series have decided to find out.","Ember Davis","1"));


        // Add more categories here
        return categoryList_two;
    }

}