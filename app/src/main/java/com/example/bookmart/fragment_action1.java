package com.example.bookmart;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_action1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_action1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;






    public fragment_action1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_action1.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_action1 newInstance(String param1, String param2) {
        fragment_action1 fragment = new fragment_action1();
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
        View view = inflater.inflate(R.layout.fragment_action1, container, false);

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



    /*@Override
    public void onBackPressed() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment currentFragment = fragmentManager.findFragmentById(R.id.fragment_container);

        if (currentFragment instanceof BookDetailFragment) {
            replaceFragment(fragment_action1.newInstance(null, null)); // Replace with appropriate arguments
        } else {
            super.onBackPressed();
        }
    }*/

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
        categoryList_two.add(new BookDomain("Dark Rose", "darkrose",985.00,"28","1368","It started by stealth. At first, no one could see what was happening. By the time the alarm was raised it was too late. Ireland had been seized: a financial assault consolidated by a military one. \n \n" +
                "But as the island is overrun, it’s soon clear that the invaders did not anticipate the fierce resolve of their Celtic opponents. Nor the determination of the country’s powerful allies to throw out the occupiers. \n \n" +
                "While a strengthening Irish resistance mounts a fierce guerilla campaign to take their country back, the British bring to bear the full might of the Army, Royal Navy and RAF to liberate their friend and neighbor across the Irish Channel.","Mike Lunnon-Wood","1"));
        categoryList_two.add(new BookDomain("ManHunter", "manhunter",105.00,"35","140","Five years after the meltdown. The residents of LakeTown, a small trading settlement in Oregon, want to live in peace. But warring factions and local bandits have other ideas, constantly raiding the helpless town and stealing their precious water supply. Desperation takes hold and the LakeTowners turn to an unlikely hero for help- Butch Nolan. Nolan is a cold-hearted killer with a score to settle. Having survived the meltdown and his injuries, Nolan knows that revenge still stops for nothing. Not even the end of the world. Mad Max meets Clint Eastwood’s spaghetti westerns in this rollercoaster thrill ride of a sequel to Nolan’s Ark. The perfect treat for fans of post-apocalyptic action.","Mark Gillespie","1"));
        categoryList_two.add(new BookDomain("The Last Kingdom", "thelastkingdom",721.00,"8","783","This is the story of the making of England in the 9th and 10th centuries, the years in which King Alfred the Great, his son and grandson defeated the Danish Vikings who had invaded and occupied three of England’s four kingdoms. \n \n" +
                "The story is seen through the eyes of Uhtred, a dispossessed nobleman, who is captured as a child by the Danes and then raised by them so that, by the time the Northmen begin their assault on Wessex (Alfred’s Kingdom and the last territory in English hands) Uhtred almost thinks of himself as a Dane. He certainly has no love for Alfred, whom he considers a pious weakling and no match for Viking savagery, yet when Alfred unexpectedly defeats the Danes and the Danes themselves turn on Uhtred, he is finally forced to choose sides. By now he is a young man, in love, trained to fight and ready to take his place in the dreaded shield wall. Above all, though, he wishes to recover his father’s land, the enchanting fort of Bebbanburg by the wild northern sea.\n \n" +
                "This thrilling adventure-based on existing records of Bernard Conwell’s ancestors- depicts a time when law and order were ripped violently apart by a pagan assault on Christian England, an assault that came very close to destroying England.","Bernard Cornwell","1"));
        categoryList_two.add(new BookDomain("The Chronicles of Narnia", "thechroniclesofnarnia",146.00,"10","162","Journeys to the end of the world, fantastic creatures, and epic battles between good and evil- what more could any reader ask for in one book? The book that has it all is The Lion, The Witch and The Wardrobe, written in 1949 by Clive Staples Lewis. But Lewis did not stop there. Six more books followed, and together the became known as The Chronicles of Narnia.\n \n" +
                "For the past fifty years, The Chronicles of Narnia have transcended the action and fantasy genre to become part of the canon of classic literature. Each of the seven books is a masterpiece, drawing the reader into a land where magic meets reality, and the result is a fictional world whose scope has fascinated generations.\n \n" +
                "This edition presents all seven books- unabridged- in one impressive volume. The books are presented here in chronical order, each chapter graced with an illustration by the original artist, Pauline Baynes. Deceptively simple and direct, The Chronicles of Narnia continue to captivate fans with adventures, characters, and truth that speak to readers of all ages, even fifty years after they were first published.","C.S. Lewis","1"));
        categoryList_two.add(new BookDomain("The Ming Storm: Assassin’s Creed Novel", "themingstorm",315.00,"33","470","The Ming dynasty becomes a battleground for the Brotherhood of Assassins and the Order of the Templars in the blockbuster action novel from previously unexplored part of the bellowed Assassin’s Creed universe.\n" +
                "\n" +
                "China, 16th century. The Assassins are gone. Zhang Yong, the relentless leader of the Eight Tigers, took advantage of the emperor’s death to eliminate all his opponents, and now the Templars hold all the power. Shao Jun, the last representative of her clan, barely escapes death and has no choice but to flee her homeland. Vowing to avenge her former brothers in arms, she travels to Europe to train with the legendary Ezio Auditore. When she returns to the Middle Kingdom, her saber and her determination alone will not be enough to eliminate Zhang Yong: she will have to surround herself with allies and walk in the shadows to defeat the Eight Tigers.","Yan Lei Sheng","1"));
        categoryList_two.add(new BookDomain("The Hidden Oracle, The Trials of Apollo- 1", "thehiddenoracle1",191.00,"17","230","How do you punish an immortal?\n \n" +
                "By making him human. \n \n" +
                "After angering his father Zeus, the god Apollo is cast down from Olympus. Weak and disoriented, he lands in New York City as a regular teenage boy. Now, without his godly powers, the four-thousand-year-old deity must learn to survive in the modern world until he can somehow find a way to regain Zeus’s favor.\n \n" +
                "But apollo has many enemies- gods, monsters and mortals who would love to see the former Olympian permanently destroyed. Apollo needs help, and he can think of only one place to go… and enclave of modern demigods known as Camp Half-Blood.","Rick Riordan","1"));
        categoryList_two.add(new BookDomain("The Desecration of All Saints", "thedesecrationofallsaints",99.00,"0","99","Mackenzie August is a private detective and he's in a rut. His is a feast-or-famine profession, and seasons of mundane work are wearing him down. What he needs is a stimulating case...\n \n" +
                "Two men come to Mackenzie in secret and request his services. The leader of their church is a venerable and nationally celebrated priest, yet rumors circulate that all is not as it seems. A young clergyman, recently hired, alleges the man is really a villain in disguise. Who can be trusted, the newcomer or the respected priest?\n \n" +
                "Mackenzie is charged with discovering who is telling the truth and who is lying, and do it before the public catches wind. What he discovers, however, is far worse than anyone could've guessed...","Alan Lee","1"));
        categoryList_two.add(new BookDomain("Warrior Saints- Destroyer", "warriorsaintsdestroyer",298.00,"55","662","In the growing supernatural battle between the Creator and the Destroyer, what does it cost to do the right thing? Mary, Deacon, Scout, and Ivy have identified their abilities and understand their work for the Creator. But with every new burst of strength and skill the discover, the Destroyer grows more determined to terminate their efforts. Surrounded by potential enemies who are capable of vicious acts, the Warriors must learn to trust each other and their supernatural help. When violence comes to the halls of Stonehaven Academy, the Warriors react, but who is really on their side? As evil is revealed and sneaks in to every area of their lives, how do the Warriors know what to do or who to trust- especially when the sacrifice is too great? And can they stay the course and endure the aftermath when not everyone survives the fight?","Carla Thorne","1"));
        // Add more categories here
        return categoryList_two;
    }
}