package com.example.bookmart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerViewCategoryList;
    private RecyclerView.Adapter adapter1;

    private RecyclerView recyclerViewCategoryList_two;

    private RecyclerView.Adapter adapter2;

    private Boolean flag1=false;
    private Boolean flag2=false;
    private Boolean flag3=false;
    private Boolean flag4=false;
    private Boolean flag5=false;
    private Boolean flag6=false;
    private Boolean flag7=false;
    private Boolean flag8=false;
    private Boolean flag9=false;
    private Boolean flag10=false;
    private Boolean flag11=false;


    private ImageView searchEditText1;
    private TextView text1,text2,text3,text4,text5;

    private FrameLayout frameOne;





    //int[] imgList = new int[]{R.drawable.fish1,R.drawable.fish1,R.drawable.fooddish1,R.drawable.brfood,R.drawable.fooddish1};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        recyclerViewCategoryList = view.findViewById(R.id.view1);
        recyclerViewCategoryList_two=view.findViewById(R.id.view2);



        LinearLayoutManager layoutManager1 = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerViewCategoryList.setLayoutManager(layoutManager1);
        recyclerViewCategoryList_two.setLayoutManager(layoutManager2);


        //adapter1 = new CategoryAdapter(getCategoryList());
        adapter1 = new BookAdapter(getCategoryList());
        adapter2=new BookAdapter(getCategoryList_two());
        searchEditText1=view.findViewById(R.id.searchEditText1);

        recyclerViewCategoryList.setAdapter(adapter1);
        recyclerViewCategoryList_two.setAdapter(adapter2);
        text1 = view.findViewById(R.id.text1);
        text2 = view.findViewById(R.id.text2);
        text3 = view.findViewById(R.id.text3);
        text4=view.findViewById(R.id.text4);
        text5 = view.findViewById(R.id.text5);

        frameOne =view.findViewById(R.id.frame_one);



        /*text1.setBackgroundResource(R.drawable.btnbox);
        //text1.setTextColor(getResources().getColor(R.color.your_selected_text_color));
        // Set initial fragment
        switchFragment(new fragment_all());*/

        if (flag1==false && flag2==false && flag3==false &&flag4==false&& flag5==false && flag6==false && flag7==false && flag8==false && flag9==false && flag10==false && flag11==false){
            text1.setBackgroundResource(R.drawable.btnbox);
            //text1.setTextColor(getResources().getColor(R.color.your_selected_text_color));
            // Set initial fragment
            switchFragment(new fragment_all());

        }



        if(flag1==true){
            text1.setBackgroundResource(R.drawable.btnbox);
            //text1.setTextColor(getResources().getColor(R.color.your_selected_text_color));
            // Set initial fragment
            switchFragment(new fragment_all());

        }

        if(flag2==true){
            text2.setBackgroundResource(R.drawable.btnbox);
            //text1.setTextColor(getResources().getColor(R.color.your_selected_text_color));
            // Set initial fragment
            switchFragment(new fragment_action1());

        }

        if(flag3==true){
            text3.setBackgroundResource(R.drawable.btnbox);
            //text1.setTextColor(getResources().getColor(R.color.your_selected_text_color));
            // Set initial fragment
            switchFragment(new fragment_horror1());

        }

        if(flag4==true){
            text4.setBackgroundResource(R.drawable.btnbox);
            //text1.setTextColor(getResources().getColor(R.color.your_selected_text_color));
            // Set initial fragment
            switchFragment(new fragment_romance1());

        }

        if(flag5==true){
            text5.setBackgroundResource(R.drawable.btnbox);
            //text1.setTextColor(getResources().getColor(R.color.your_selected_text_color));
            // Set initial fragment
            switchFragment(new fragment_historical1());

        }






        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for text1
                setBackgroundColorAndSwitchFragment(text1, new fragment_all());
                flag1=true;
                flag2=false;
                flag3=false;
                flag4=false;
                flag5=false;
                flag6=false;
                flag7=false;
                flag8=false;
                flag9=false;
                flag10=false;
                flag11=false;
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for text2
                setBackgroundColorAndSwitchFragment(text2, new fragment_action1());
                flag1=false;
                flag2=true;
                flag3=false;
                flag4=false;
                flag5=false;
                flag6=false;
                flag7=false;
                flag8=false;
                flag9=false;
                flag10=false;
                flag11=false;
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for text3
                setBackgroundColorAndSwitchFragment(text3, new fragment_horror1());
                flag1=false;
                flag2=false;
                flag3=true;
                flag4=false;
                flag5=false;
                flag6=false;
                flag7=false;
                flag8=false;
                flag9=false;
                flag10=false;
                flag11=false;
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for text3
                setBackgroundColorAndSwitchFragment(text4, new fragment_romance1());
                flag1=false;
                flag2=false;
                flag3=false;
                flag4=true;
                flag5=false;
                flag6=false;
                flag7=false;
                flag8=false;
                flag9=false;
                flag10=false;
                flag11=false;
            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for text3
                setBackgroundColorAndSwitchFragment(text5, new fragment_historical1());
                flag1=false;
                flag2=false;
                flag3=false;
                flag4=false;
                flag5=true;
                flag6=false;
                flag7=false;
                flag8=false;
                flag9=false;
                flag10=false;
                flag11=false;
            }
        });


        searchEditText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YourFragment" with the fragment you want to switch to
                Fragment newFragment = new fragment_search();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, newFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });




        return view;

    }
    private void setBackgroundColorAndSwitchFragment(TextView textView, Fragment fragment) {
        // Reset background color for all TextViews
        text1.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        text2.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        text3.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        text4.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        text5.setBackgroundColor(getResources().getColor(android.R.color.transparent));


        // Set background color for the clicked TextView
        textView.setBackgroundResource(R.drawable.btnbox);


        // Switch to the desired fragment
        switchFragment(fragment);
    }


    private void switchFragment(Fragment fragment) {
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_one, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    /*private ArrayList<ReleaseDomain> getCategoryList() {
        ArrayList<ReleaseDomain> categoryList = new ArrayList<>();
        categoryList.add(new ReleaseDomain("aditya", R.drawable.shivajimaharaj));
        categoryList.add(new ReleaseDomain("patil", R.drawable.shivajimaharaj));
        categoryList.add(new ReleaseDomain("aditya patil", R.drawable.shivajimaharaj));
        categoryList.add(new ReleaseDomain("jigesh", R.drawable.shivajimaharaj));
        categoryList.add(new ReleaseDomain("tushar", R.drawable.shivajimaharaj));
        // Add more categories here
        return categoryList;

    }*/
    private ArrayList<BookDomain> getCategoryList() {
        ArrayList<BookDomain> categoryList = new ArrayList<>();
        categoryList.add(new BookDomain("ManHunter", "manhunter",105.00,"35","140","Five years after the meltdown. The residents of LakeTown, a small trading settlement in Oregon, want to live in peace. But warring factions and local bandits have other ideas, constantly raiding the helpless town and stealing their precious water supply. Desperation takes hold and the LakeTowners turn to an unlikely hero for help- Butch Nolan. Nolan is a cold-hearted killer with a score to settle. Having survived the meltdown and his injuries, Nolan knows that revenge still stops for nothing. Not even the end of the world. Mad Max meets Clint Eastwood’s spaghetti westerns in this rollercoaster thrill ride of a sequel to Nolan’s Ark. The perfect treat for fans of post-apocalyptic action.","Mark Gillespie","1"));
        categoryList.add(new BookDomain("The Last Kingdom", "thelastkingdom",721.00,"8","783","This is the story of the making of England in the 9th and 10th centuries, the years in which King Alfred the Great, his son and grandson defeated the Danish Vikings who had invaded and occupied three of England’s four kingdoms. \n \n" +
                "The story is seen through the eyes of Uhtred, a dispossessed nobleman, who is captured as a child by the Danes and then raised by them so that, by the time the Northmen begin their assault on Wessex (Alfred’s Kingdom and the last territory in English hands) Uhtred almost thinks of himself as a Dane. He certainly has no love for Alfred, whom he considers a pious weakling and no match for Viking savagery, yet when Alfred unexpectedly defeats the Danes and the Danes themselves turn on Uhtred, he is finally forced to choose sides. By now he is a young man, in love, trained to fight and ready to take his place in the dreaded shield wall. Above all, though, he wishes to recover his father’s land, the enchanting fort of Bebbanburg by the wild northern sea.\n \n" +
                "This thrilling adventure-based on existing records of Bernard Conwell’s ancestors- depicts a time when law and order were ripped violently apart by a pagan assault on Christian England, an assault that came very close to destroying England.","Bernard Cornwell","1"));
        categoryList.add(new BookDomain("The Ming Storm: Assassin’s Creed Novel", "themingstorm",315.00,"33","470","The Ming dynasty becomes a battleground for the Brotherhood of Assassins and the Order of the Templars in the blockbuster action novel from previously unexplored part of the bellowed Assassin’s Creed universe.\n" +
                "\n" +
                "China, 16th century. The Assassins are gone. Zhang Yong, the relentless leader of the Eight Tigers, took advantage of the emperor’s death to eliminate all his opponents, and now the Templars hold all the power. Shao Jun, the last representative of her clan, barely escapes death and has no choice but to flee her homeland. Vowing to avenge her former brothers in arms, she travels to Europe to train with the legendary Ezio Auditore. When she returns to the Middle Kingdom, her saber and her determination alone will not be enough to eliminate Zhang Yong: she will have to surround herself with allies and walk in the shadows to defeat the Eight Tigers.","Yan Lei Sheng","1"));
        categoryList.add(new BookDomain("When Smiles Fade", "whensmilesfade",240.00,"20","300","Young Emma Murphy kills people, but only if they deserve to die.\n" +
                "\n" +
                "Emma's father's coldblooded beatings and the ultimate abuse to which he subjects her, lays the foundation of the person she becomes. As she matures into a resourceful teenager, she is unwilling and unable to stifle her desire for revenge. Reaching her breaking point she can no longer control the impulse to fight back and finally takes matters into her own hands.\n" +
                "\n" +
                "Having learned the art of hatred from her father and the mastery of manipulation from her mother, young Emma now sets out to make a better life for herself, leaving the memory of the abused child she had once been behind her. Hardened by the heartless brutality she encounters and the dangerous situations she must overcome in the course of her journey, she faces every challenge that comes her way in her quest for a normal life for herself and for those she loves.\n" +
                "\n" +
                "Finally a person emerges from within that guides her toward a better life until she learns of a secret that sets her on the path of ultimate redemption.\n" +
                "\n" +
                "*WARNING*18+ Readers Only. Graphic content and subject matter.","Paige Dearth","1"));
        categoryList.add(new BookDomain("Midnight is the Darkest Hour", "midnightisthedarkesthour",639.0,"20","799","From the critically acclaimed author of In My Dreams I Hold A Knife and The Last Housewife comes a gothic Southern thriller about a killer haunting a small Louisiana town, where two outcasts-the preacher's daughter and the boy from the wrong side of the tracks-hold the key to uncovering the truth.\n" +
                "\n" +
                "For fans of Verity and A Flicker in the Dark, this is a twisted tale of murder, obsessive love, and the beastly urges that lie dormant within us all...even the God-fearing folk of Bottom Springs, Louisiana. In her small hometown, librarian Ruth Cornier has always felt like an outsider, even as her beloved father rains fire-and-brimstone warnings from the pulpit at Holy Fire Baptist.\n" +
                "\n" +
                "Unfortunately for Ruth, the only things the townspeople fear more than the God and the Devil are the myths that haunt the area, like the story of the Low Man, a vampiric figure said to steal into sinners' bedrooms and kill them on moonless nights. When a skull is found deep in the swamp next to mysterious carved symbols, Bottom Springs is thrown into uproar-and Ruth realizes only she and Everett, an old friend with a dark past, have the power to comb the town's secret underbelly in search of true evil.\n" +
                "\n" +
                "A dark and powerful novel like fans have come to expect from Ashley Winstead, Midnight is the Darkest Hour is an examination of the ways we've come to expect love, religion, and stories to save us, the lengths we have to go to in order to take back power, and the monstrous work of being a girl in this world.","Ashley Winstead","1"));
        categoryList.add(new BookDomain("All That We Are Together", "allthatwearetogether",81.00,"10","90","Three years without even seeing him. Three years without Axel.\n" +
                "\n" +
                "How do you move on from a broken heart?\n" +
                "\n" +
                "Three years have passed since Axel Nguyen shattered Leah Jones' heart into a million pieces, and Leah has spent every moment of those three years distracting herself from the devastation. She tries to move on with Landon, a guy she meets in college, but she can only truly escape thoughts of Axel when she's painting. At least one good thing has come out of all of it: her dream of exhibiting her work is finally coming true.\n" +
                "\n" +
                "Axel is achingly aware every day of how much he misses Leah. The moment he learns about Leah's exhibit, Axel can't think about anything else but to go see her. Being in the same room with Leah, as beautiful and magnetic as he remembers, leaves Axel desperate and Leah breathless in his presence. He offers to be her agent; she accepts. One work trip to Paris later leaves Leah and Axel full of pent-up attraction and wondering if their whirlwind romance is a forever kind of love or if it's better off left in the past.\n" +
                "\n" +
                "International bestselling author Alice Kellen concludes her emotional new adult duology with an evocative and passionate love story for readers of Colleen Hoover, Anna Todd, and books to make you ugly cry.","Allice Kellen","1"));
        categoryList.add(new BookDomain("Midnight Rider", "midnightrider",245.00,"44","436","Savor the magic of New York Times bestselling author Diana Palmer in a dazzlingly sensual story of turn-of-the-century Texas, of a man as enigmatic and forbidding as the sun-drenched land-and the woman who dares to cross into the uncharted territory of his heart.\n" +
                "\n" +
                "To Bernadette Barron, Eduardo Cortes was the enemy. A noble count with a sprawling ranch in the grand state of Texas, Cortes challenged her with dark, penetrating eyes that seemed to pierce her very soul. Could he see the burning truth: that she loved him? It is a secret Bernadette vows to keep-- especially now that she is to become his wife. For theirs is a marriage bargain, pure and simple. He needs a rich wife to save his ranch; she needs a titled husband.\n" +
                "\n" +
                "Yet desire will turn a marriage of convenience into a passionate battle of wills, and change an innocent girl into a woman aware of her own powers of attraction. For it is love's fiery initiation that will make Bernadette aware of her own capacity for pleasure as well as her husband's skill at providing it. And it is the sheer force of her own love that will give her newfound strength to battle against the odds to claim a man and a love she will not be denied...","Diana Palmer","1"));
        categoryList.add(new BookDomain("World Departed", "worlddeparted",294.0,"40","489","In the zombie apocalypse, your worst enemy may be yourself.\n" +
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

        // Add more categories here
        return categoryList;
    }

    private ArrayList<BookDomain> getCategoryList_two() {
        ArrayList<BookDomain> categoryList_two = new ArrayList<>();
        categoryList_two.add(new BookDomain("This is Where We Talk Things Out", "thisiswherewetalkthingsout",80.0,"20","100","This Is Where We Talk Things Out by Caitlin Marceau, author of Palimpsest: A Collection of Contemporary Horror, follows the gut-wrenching journey of Miller and her estranged mother, Sylvie, who have always had a tense relationship.\n" +
                "\n" +
                "After Miller's father dies, she agrees to a girls' vacation away from the city to reconnect with the only family she has left. Although she's eager to make things work, Miller can't help but worry that her mother is seeing their countryside retreat as a fun weekend getaway instead of what it really is: a last- ditch effort to repair their relationship.\n" +
                "\n" +
                "Unfortunately, that quickly becomes the least of Miller's problems.\n" +
                "\n" +
                "Sylvie's trapped in the past and if Miller's not careful, she will be too. A cross between Stephen King's Misery and Stephanie Wrobel's Darling Rose Gold, This Is Where We Talk Things Out explores the horror of familial trauma, mother-daughter relationships, and what happens when we don't let go.","Caitlin Marceau","1"));
        categoryList_two.add(new BookDomain("The Hidden Oracle, The Trials of Apollo- 1", "thehiddenoracle1",191.00,"17","230","How do you punish an immortal?\n \n" +
                "By making him human. \n \n" +
                "After angering his father Zeus, the god Apollo is cast down from Olympus. Weak and disoriented, he lands in New York City as a regular teenage boy. Now, without his godly powers, the four-thousand-year-old deity must learn to survive in the modern world until he can somehow find a way to regain Zeus’s favor.\n \n" +
                "But apollo has many enemies- gods, monsters and mortals who would love to see the former Olympian permanently destroyed. Apollo needs help, and he can think of only one place to go… and enclave of modern demigods known as Camp Half-Blood.","Rick Riordan","1"));
        categoryList_two.add(new BookDomain("Midnight is the Darkest Hour", "midnightisthedarkesthour",639.0,"20","799","From the critically acclaimed author of In My Dreams I Hold A Knife and The Last Housewife comes a gothic Southern thriller about a killer haunting a small Louisiana town, where two outcasts-the preacher's daughter and the boy from the wrong side of the tracks-hold the key to uncovering the truth.\n" +
                "\n" +
                "For fans of Verity and A Flicker in the Dark, this is a twisted tale of murder, obsessive love, and the beastly urges that lie dormant within us all...even the God-fearing folk of Bottom Springs, Louisiana. In her small hometown, librarian Ruth Cornier has always felt like an outsider, even as her beloved father rains fire-and-brimstone warnings from the pulpit at Holy Fire Baptist.\n" +
                "\n" +
                "Unfortunately for Ruth, the only things the townspeople fear more than the God and the Devil are the myths that haunt the area, like the story of the Low Man, a vampiric figure said to steal into sinners' bedrooms and kill them on moonless nights. When a skull is found deep in the swamp next to mysterious carved symbols, Bottom Springs is thrown into uproar-and Ruth realizes only she and Everett, an old friend with a dark past, have the power to comb the town's secret underbelly in search of true evil.\n" +
                "\n" +
                "A dark and powerful novel like fans have come to expect from Ashley Winstead, Midnight is the Darkest Hour is an examination of the ways we've come to expect love, religion, and stories to save us, the lengths we have to go to in order to take back power, and the monstrous work of being a girl in this world.","Ashley Winstead","1"));
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
        categoryList_two.add(new BookDomain("The Desecration of All Saints", "thedesecrationofallsaints",99.00,"0","99","Mackenzie August is a private detective and he's in a rut. His is a feast-or-famine profession, and seasons of mundane work are wearing him down. What he needs is a stimulating case...\n \n" +
                "Two men come to Mackenzie in secret and request his services. The leader of their church is a venerable and nationally celebrated priest, yet rumors circulate that all is not as it seems. A young clergyman, recently hired, alleges the man is really a villain in disguise. Who can be trusted, the newcomer or the respected priest?\n \n" +
                "Mackenzie is charged with discovering who is telling the truth and who is lying, and do it before the public catches wind. What he discovers, however, is far worse than anyone could've guessed...","Alan Lee","1"));
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
        categoryList_two.add(new BookDomain("Warrior Saints- Destroyer", "warriorsaintsdestroyer",298.00,"55","662","In the growing supernatural battle between the Creator and the Destroyer, what does it cost to do the right thing? Mary, Deacon, Scout, and Ivy have identified their abilities and understand their work for the Creator. But with every new burst of strength and skill the discover, the Destroyer grows more determined to terminate their efforts. Surrounded by potential enemies who are capable of vicious acts, the Warriors must learn to trust each other and their supernatural help. When violence comes to the halls of Stonehaven Academy, the Warriors react, but who is really on their side? As evil is revealed and sneaks in to every area of their lives, how do the Warriors know what to do or who to trust- especially when the sacrifice is too great? And can they stay the course and endure the aftermath when not everyone survives the fight?","Carla Thorne","1"));

        categoryList_two.add(new BookDomain("The Cruel Dark", "thecrueldark",405.0,"25","540","Millicent Foxboro is haunted.\n" +
                "\n" +
                "Not by ghosts but by the anguish of her past and the uncertainty of her future. After all, even in the progressive year of 1928, most people would balk at hiring a woman who'd spent two months in a mental ward for traumatic amnesia. So when an uncommon assistantship to a reclusive Professor of mythology falls into her lap with an ungodly salary attached, her desperation for stability overrides her cautious nature.\n" +
                "\n" +
                "To Millie's dismay, the widowed Professor Callum Hughes and his estate, Willowfield, are more than she bargained for. The once magnificent home, known for its sprawling gardens and dazzling parties, is falling to pieces after the death of the professor's fragile wife. What's more, the staff has been reduced to the only three people not frightened away by rumors of ghosts, leaving the halls empty and languishing in bitter memories.\n" +
                "\n" +
                "The professor himself is a grim, intense man with unclear expectations, unpredictable moods, and hungry eyes that ignite Millie's own dormant passions. The closer she finds herself drawn to Professor Hughes and his strange world of flowers and folklore, the more the house closes in, threatening to reveal her secrets. But the professor is keeping secrets of his own and the most dangerous of all is hers to discover.","Bea Northwick","1"));

        // Add more categories here
        return categoryList_two;
    }


}