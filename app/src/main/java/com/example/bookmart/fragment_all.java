package com.example.bookmart;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_all#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_all extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_all() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_all.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_all newInstance(String param1, String param2) {
        fragment_all fragment = new fragment_all();
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
        View view = inflater.inflate(R.layout.fragment_all, container, false);

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

    private void mainFragment(Fragment fragment) {
        FragmentManager fragmentManager = ((AppCompatActivity) requireContext()).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_one,fragment);
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
        categoryList_two.add(new BookDomain("Dark Rose", "darkrose",985.00,"28","1368","It started by stealth. At first, no one could see what was happening. By the time the alarm was raised it was too late. Ireland had been seized: a financial assault consolidated by a military one. \n \n" +
                "But as the island is overrun, it’s soon clear that the invaders did not anticipate the fierce resolve of their Celtic opponents. Nor the determination of the country’s powerful allies to throw out the occupiers. \n \n" +
                "While a strengthening Irish resistance mounts a fierce guerilla campaign to take their country back, the British bring to bear the full might of the Army, Royal Navy and RAF to liberate their friend and neighbor across the Irish Channel.","Mike Lunnon-Wood","1"));
        categoryList_two.add(new BookDomain("No Child of Mine", "nochildofmine",133.0,"50","266","There's something in the dark. And it's starting to whisper...\n" +
                "\n" +
                "Essie Kaur has defined herself by her ambitions, a fiercely independent woman whose only soft spot is her husband, Sanjay. She never imagined herself as a mother. It was never a part of the plan. But then she finds out she's pregnant. As her difficult pregnancy transforms her body and life into something she barely recognizes, her husband spends the nights pacing in the attic, slowly becoming a stranger, and the house begins to whisper.\n" +
                "\n" +
                "As Essie's pregnancy progresses, both her and Sanjay's lives are warped by a curse that has haunted her family for generations, leaving a string of fatherless daughters in its wake. When she's put on bedrest, Essie trades the last aspects of her carefully planned life for isolation in what should be a welcoming home, but she isn't alone. There's something here that means to take everything from her...","Nichelle Giraldes","1"));
        categoryList_two.add(new BookDomain("Wrath Becomes Her", "wrathbecomesher",400.00,"80","2000","Frankenstein meets Inglourious Basterds in this stunning Jewish historical horror novel from the award-winning author of The City Beautiful\n" +
                "\n" +
                "Vera was made for vengeance.\n" +
                "\n" +
                "Lithuania, 1943. A father drowns in the all- consuming grief of a daughter killed by the Nazis. He can't bring Chaya back from the dead, but he can use kishuf an ancient and profane magic - to create a golem in her image. A Nazi killer, to avenge her death.\n" +
                "\n" +
                "When Vera awakens, she can feel her violent purpose thrumming within her. But she can also feel glimpses of a human life lived, of stolen kisses amidst the tragedy, and of a grisly death. And when she meets Akiva, she recognizes the boy with soft lips that gave warm kisses. But these memories aren't hers, and Vera doesn't know if she gets-or deserves to have a life beyond what she was made for.\n" +
                "\n" +
                "Vera's strength feels limitless-until she learns that there are others who would channel kishuf for means far less noble than avenging a daughter's death. As she confronts the very basest of humanity, Vera will need more than what her creator gave Not just a reason to fight, but a reason to live.","Aden Polydoros","1"));
        categoryList_two.add(new BookDomain("To Forge a Hollow Crown", "toforgeahollowcrown",160.0,"60","399","\"In the shadow of the throne, desire knows no bounds. \"From the moment I united the rebels with Theron's formidable warriors, our combined forces have been on a collision course with destiny, all roads leading to Athain. But with every step towards confronting Theron's formidable mother, Empress Nyana, it feels like the universe is testing our love.\n" +
                "\n" +
                "While many in our makeshift army may disapprove of our union, nothing can quell the burning passion between Theron and me. But the challenges we face aren't just from foes. The treacherous desert hides creatures of legend, shadows of our past, and even another elven warrior who, with her own aspirations for the throne, stands between us and our dream of a free world.\n" +
                "\n" +
                "Can our love survive the myriad forces working to pull us apart? Or will the empire's weight prove too much, threatening to tear us apart forever?\n" +
                "\n" +
                "Content To Forge a Hollow Crown is a dark and steamy read recommended for readers 18+ due to explicit language, violence, and sexual situations. To Forge a Hollow Crown is the final installment in the Sands of Maeoris series.","Atley Wikes","1"));
        categoryList_two.add(new BookDomain("Warrior Saints- Destroyer", "warriorsaintsdestroyer",298.00,"55","662","In the growing supernatural battle between the Creator and the Destroyer, what does it cost to do the right thing? Mary, Deacon, Scout, and Ivy have identified their abilities and understand their work for the Creator. But with every new burst of strength and skill the discover, the Destroyer grows more determined to terminate their efforts. Surrounded by potential enemies who are capable of vicious acts, the Warriors must learn to trust each other and their supernatural help. When violence comes to the halls of Stonehaven Academy, the Warriors react, but who is really on their side? As evil is revealed and sneaks in to every area of their lives, how do the Warriors know what to do or who to trust- especially when the sacrifice is too great? And can they stay the course and endure the aftermath when not everyone survives the fight?","Carla Thorne","1"));
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
        categoryList_two.add(new BookDomain("The Darkness Surrounds Us", "thedarknesssurroundsus",210.0,"40","350","\"An early-autumn treat fit for late-night devouring.\"? Publishers Weekly \"A taut gothic mystery with an intriguing twist.\" ?Susanna Calkins, award-winning author of the Lucy Campion Mysteries and the Speakeasy Murders A Ghostly Window Into the Past Nurse Nellie Lester can't escape death. Fleeing Chicago at the height of the 1918 Spanish flu, she takes a nursing job at a decrepit mansion on a desolate Michigan island. She's convinced the island holds the secret to her mother's murky past. The only problem? Her dead mother seems to have followed her there. Nightly she's haunted by a ghostly presence that appears in her bedroom. But is it her mother or something more sinister? When the frozen body of the prior nurse is unearthed, Nellie suspects her family's history and the nurse's uncanny death are connected to a mysterious group that disappeared from the island twenty-four years earlier. As winter closes in, past and present collide resurrecting a lurid killer, hell-bent on keeping the island's secrets. Will Nellie uncover her mother's shocking past before the killer enacts his final revenge? \"Lukasik blends all the elements needed for a dark suspense a forbidding mansion, ghostly presences, secret passages, a hostile housekeeper, a temperamental employer, and residents unwilling to talk to outsiders. For fans of Rebecca, The Woman in White, and The Death of Mrs. Westaway.\"? Library Journal.","Gail Lukasik","1"));
        categoryList_two.add(new BookDomain("The Chronicles of Narnia", "thechroniclesofnarnia",146.00,"10","162","Journeys to the end of the world, fantastic creatures, and epic battles between good and evil- what more could any reader ask for in one book? The book that has it all is The Lion, The Witch and The Wardrobe, written in 1949 by Clive Staples Lewis. But Lewis did not stop there. Six more books followed, and together the became known as The Chronicles of Narnia. \n \n" +
                "For the past fifty years, The Chronicles of Narnia have transcended the action and fantasy genre to become part of the canon of classic literature. Each of the seven books is a masterpiece, drawing the reader into a land where magic meets reality, and the result is a fictional world whose scope has fascinated generations. \n \n" +
                "This edition presents all seven books- unabridged- in one impressive volume. The books are presented here in chronical order, each chapter graced with an illustration by the original artist, Pauline Baynes. Deceptively simple and direct, The Chronicles of Narnia continue to captivate fans with adventures, characters, and truth that speak to readers of all ages, even fifty years after they were first published.","C.S. Lewis","1"));


        // Add more categories here
        return categoryList_two;
    }
}