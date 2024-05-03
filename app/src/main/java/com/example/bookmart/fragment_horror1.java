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
 * Use the {@link fragment_horror1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_horror1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_horror1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_horror1.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_horror1 newInstance(String param1, String param2) {
        fragment_horror1 fragment = new fragment_horror1();
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
        View view = inflater.inflate(R.layout.fragment_horror1, container, false);

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
        categoryList_two.add(new BookDomain("When Smiles Fade", "whensmilesfade",240.00,"20","300","Young Emma Murphy kills people, but only if they deserve to die.\n" +
                "\n" +
                "Emma's father's coldblooded beatings and the ultimate abuse to which he subjects her, lays the foundation of the person she becomes. As she matures into a resourceful teenager, she is unwilling and unable to stifle her desire for revenge. Reaching her breaking point she can no longer control the impulse to fight back and finally takes matters into her own hands.\n" +
                "\n" +
                "Having learned the art of hatred from her father and the mastery of manipulation from her mother, young Emma now sets out to make a better life for herself, leaving the memory of the abused child she had once been behind her. Hardened by the heartless brutality she encounters and the dangerous situations she must overcome in the course of her journey, she faces every challenge that comes her way in her quest for a normal life for herself and for those she loves.\n" +
                "\n" +
                "Finally a person emerges from within that guides her toward a better life until she learns of a secret that sets her on the path of ultimate redemption.\n" +
                "\n" +
                "*WARNING*18+ Readers Only. Graphic content and subject matter.","Paige Dearth","1"));
        categoryList_two.add(new BookDomain("Midnight is the Darkest Hour", "midnightisthedarkesthour",639.0,"20","799","From the critically acclaimed author of In My Dreams I Hold A Knife and The Last Housewife comes a gothic Southern thriller about a killer haunting a small Louisiana town, where two outcasts-the preacher's daughter and the boy from the wrong side of the tracks-hold the key to uncovering the truth.\n" +
                "\n" +
                "For fans of Verity and A Flicker in the Dark, this is a twisted tale of murder, obsessive love, and the beastly urges that lie dormant within us all...even the God-fearing folk of Bottom Springs, Louisiana. In her small hometown, librarian Ruth Cornier has always felt like an outsider, even as her beloved father rains fire-and-brimstone warnings from the pulpit at Holy Fire Baptist.\n" +
                "\n" +
                "Unfortunately for Ruth, the only things the townspeople fear more than the God and the Devil are the myths that haunt the area, like the story of the Low Man, a vampiric figure said to steal into sinners' bedrooms and kill them on moonless nights. When a skull is found deep in the swamp next to mysterious carved symbols, Bottom Springs is thrown into uproar-and Ruth realizes only she and Everett, an old friend with a dark past, have the power to comb the town's secret underbelly in search of true evil.\n" +
                "\n" +
                "A dark and powerful novel like fans have come to expect from Ashley Winstead, Midnight is the Darkest Hour is an examination of the ways we've come to expect love, religion, and stories to save us, the lengths we have to go to in order to take back power, and the monstrous work of being a girl in this world.","Ashley Winstead","1"));
        categoryList_two.add(new BookDomain("The Cruel Dark", "thecrueldark",405.0,"25","540","Millicent Foxboro is haunted.\n" +
                "\n" +
                "Not by ghosts but by the anguish of her past and the uncertainty of her future. After all, even in the progressive year of 1928, most people would balk at hiring a woman who'd spent two months in a mental ward for traumatic amnesia. So when an uncommon assistantship to a reclusive Professor of mythology falls into her lap with an ungodly salary attached, her desperation for stability overrides her cautious nature.\n" +
                "\n" +
                "To Millie's dismay, the widowed Professor Callum Hughes and his estate, Willowfield, are more than she bargained for. The once magnificent home, known for its sprawling gardens and dazzling parties, is falling to pieces after the death of the professor's fragile wife. What's more, the staff has been reduced to the only three people not frightened away by rumors of ghosts, leaving the halls empty and languishing in bitter memories.\n" +
                "\n" +
                "The professor himself is a grim, intense man with unclear expectations, unpredictable moods, and hungry eyes that ignite Millie's own dormant passions. The closer she finds herself drawn to Professor Hughes and his strange world of flowers and folklore, the more the house closes in, threatening to reveal her secrets. But the professor is keeping secrets of his own and the most dangerous of all is hers to discover.","Bea Northwick","1"));
        categoryList_two.add(new BookDomain("World Departed", "worlddeparted",294.0,"40","489","In the zombie apocalypse, your worst enemy may be yourself.\n" +
                "\n" +
                "From the Until the End of the World and City Series universe comes the story of the virus on the West Coast. Where the end of the world is only the beginning...\n" +
                "\n" +
                "Rose Winter has enough problems. With a marriage going down the tubes and a dreaded anniversary party on the horizon, the last thing she needs is the zombie apocalypse. She wanted to get drunk and sing karaoke, not murder her undead neighbors. It's clear the party's over, however, and now Rose has more problems-a missing husband, an overbearing houseguest, and keeping her family alive.\n" +
                "\n" +
                "Tom Jensen has inflexible rules. Rule number one? Don't deviate from the plan. But when his life is overturned in the space of minutes, his plans die along with everything else. The world is finished, the future is uncertain, and survival means living in the last place he'd planned to be. Maybe his rules weren't meant to be broken, but if he can't change his tune, he risks losing the one thing he has left-his daughter.\n" +
                "\n" +
                "Craig Matthews has a mission: get to Oregon. Doable, maybe, if he could bring himself to leave his apartment. With his food and water near gone and death closer than ever, a chance encounter may lead to finding his friends-if he can first find his courage.\n" +
                "\n" +
                "Unfortunately, the new world doesn't always mean leaving old problems behind, and as the West Coast succumbs to the virus, the survivors face more than the undead-they face themselves. But in an existence where fences offer dubious safety and zombies certain danger, people may save you in more ways than one.","Sarah Lyons Fleming","1"));
        categoryList_two.add(new BookDomain("Wrath Becomes Her", "wrathbecomesher",400.00,"80","2000","Frankenstein meets Inglourious Basterds in this stunning Jewish historical horror novel from the award-winning author of The City Beautiful\n" +
                "\n" +
                "Vera was made for vengeance.\n" +
                "\n" +
                "Lithuania, 1943. A father drowns in the all- consuming grief of a daughter killed by the Nazis. He can't bring Chaya back from the dead, but he can use kishuf an ancient and profane magic - to create a golem in her image. A Nazi killer, to avenge her death.\n" +
                "\n" +
                "When Vera awakens, she can feel her violent purpose thrumming within her. But she can also feel glimpses of a human life lived, of stolen kisses amidst the tragedy, and of a grisly death. And when she meets Akiva, she recognizes the boy with soft lips that gave warm kisses. But these memories aren't hers, and Vera doesn't know if she gets-or deserves to have a life beyond what she was made for.\n" +
                "\n" +
                "Vera's strength feels limitless-until she learns that there are others who would channel kishuf for means far less noble than avenging a daughter's death. As she confronts the very basest of humanity, Vera will need more than what her creator gave Not just a reason to fight, but a reason to live.","Aden Polydoros","1"));
        categoryList_two.add(new BookDomain("This is Where We Talk Things Out", "thisiswherewetalkthingsout",80.0,"20","100","This Is Where We Talk Things Out by Caitlin Marceau, author of Palimpsest: A Collection of Contemporary Horror, follows the gut-wrenching journey of Miller and her estranged mother, Sylvie, who have always had a tense relationship.\n" +
                "\n" +
                "After Miller's father dies, she agrees to a girls' vacation away from the city to reconnect with the only family she has left. Although she's eager to make things work, Miller can't help but worry that her mother is seeing their countryside retreat as a fun weekend getaway instead of what it really is: a last- ditch effort to repair their relationship.\n" +
                "\n" +
                "Unfortunately, that quickly becomes the least of Miller's problems.\n" +
                "\n" +
                "Sylvie's trapped in the past and if Miller's not careful, she will be too. A cross between Stephen King's Misery and Stephanie Wrobel's Darling Rose Gold, This Is Where We Talk Things Out explores the horror of familial trauma, mother-daughter relationships, and what happens when we don't let go.","Caitlin Marceau","1"));
        categoryList_two.add(new BookDomain("No Child of Mine", "nochildofmine",133.0,"50","266","There's something in the dark. And it's starting to whisper...\n" +
                "\n" +
                "Essie Kaur has defined herself by her ambitions, a fiercely independent woman whose only soft spot is her husband, Sanjay. She never imagined herself as a mother. It was never a part of the plan. But then she finds out she's pregnant. As her difficult pregnancy transforms her body and life into something she barely recognizes, her husband spends the nights pacing in the attic, slowly becoming a stranger, and the house begins to whisper.\n" +
                "\n" +
                "As Essie's pregnancy progresses, both her and Sanjay's lives are warped by a curse that has haunted her family for generations, leaving a string of fatherless daughters in its wake. When she's put on bedrest, Essie trades the last aspects of her carefully planned life for isolation in what should be a welcoming home, but she isn't alone. There's something here that means to take everything from her...","Nichelle Giraldes","1"));
        categoryList_two.add(new BookDomain("The Darkness Surrounds Us", "thedarknesssurroundsus",210.0,"40","350","\"An early-autumn treat fit for late-night devouring.\"? Publishers Weekly \"A taut gothic mystery with an intriguing twist.\" ?Susanna Calkins, award-winning author of the Lucy Campion Mysteries and the Speakeasy Murders A Ghostly Window Into the Past Nurse Nellie Lester can't escape death. Fleeing Chicago at the height of the 1918 Spanish flu, she takes a nursing job at a decrepit mansion on a desolate Michigan island. She's convinced the island holds the secret to her mother's murky past. The only problem? Her dead mother seems to have followed her there. Nightly she's haunted by a ghostly presence that appears in her bedroom. But is it her mother or something more sinister? When the frozen body of the prior nurse is unearthed, Nellie suspects her family's history and the nurse's uncanny death are connected to a mysterious group that disappeared from the island twenty-four years earlier. As winter closes in, past and present collide resurrecting a lurid killer, hell-bent on keeping the island's secrets. Will Nellie uncover her mother's shocking past before the killer enacts his final revenge? \"Lukasik blends all the elements needed for a dark suspense a forbidding mansion, ghostly presences, secret passages, a hostile housekeeper, a temperamental employer, and residents unwilling to talk to outsiders. For fans of Rebecca, The Woman in White, and The Death of Mrs. Westaway.\"? Library Journal.","Gail Lukasik","1"));

        // Add more categories here
        return categoryList_two;
    }
}