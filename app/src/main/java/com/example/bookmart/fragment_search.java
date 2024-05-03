package com.example.bookmart;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;

import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;


public class fragment_search extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    SearchView s1;
    RecyclerView r1;
    private SearchView searchView;
    private List<BookDomain> itemList;


    public fragment_search() {
        // Required empty public constructor
    }

    public static fragment_search newInstance(String param1, String param2) {
        fragment_search fragment = new fragment_search();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);


        r1 = view.findViewById(R.id.searchrecylerview);
        s1 = view.findViewById(R.id.searchView);
        s1.setIconified(false);
        s1.clearFocus();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext());
        r1.setLayoutManager(layoutManager);
        SearchAdapter searchAdapter = new SearchAdapter(fragment_search.this, getCategoryList());
        //adapter2 = new RecommendedAdapter(getRecommendedList());
        r1.setAdapter(searchAdapter);

        s1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Handle query submission if needed
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchAdapter.filter(newText);
                return true;
            }
        });

        // Rest of your code...

        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        ImageView backButton = view.findViewById(R.id.backbutton);

        // Set OnClickListener for the backButton
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the previous fragment
                requireActivity().onBackPressed();
            }
        });
    }
    private void showKeyboard(View view) {
        if (view.requestFocus()) {
            InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
        }
    }



    private ArrayList<BookDomain> getCategoryList() {
        ArrayList<BookDomain> categoryList = new ArrayList<>();
        categoryList.add(new BookDomain("Dark Rose", "darkrose",985.00,"28","1368","It started by stealth. At first, no one could see what was happening. By the time the alarm was raised it was too late. Ireland had been seized: a financial assault consolidated by a military one. \n \n" +
                "But as the island is overrun, it’s soon clear that the invaders did not anticipate the fierce resolve of their Celtic opponents. Nor the determination of the country’s powerful allies to throw out the occupiers. \n \n" +
                "While a strengthening Irish resistance mounts a fierce guerilla campaign to take their country back, the British bring to bear the full might of the Army, Royal Navy and RAF to liberate their friend and neighbor across the Irish Channel.","Mike Lunnon-Wood","1"));
        categoryList.add(new BookDomain("ManHunter", "manhunter",105.00,"35","140","Five years after the meltdown. The residents of LakeTown, a small trading settlement in Oregon, want to live in peace. But warring factions and local bandits have other ideas, constantly raiding the helpless town and stealing their precious water supply. Desperation takes hold and the LakeTowners turn to an unlikely hero for help- Butch Nolan. Nolan is a cold-hearted killer with a score to settle. Having survived the meltdown and his injuries, Nolan knows that revenge still stops for nothing. Not even the end of the world. Mad Max meets Clint Eastwood’s spaghetti westerns in this rollercoaster thrill ride of a sequel to Nolan’s Ark. The perfect treat for fans of post-apocalyptic action.","Mark Gillespie","1"));
        categoryList.add(new BookDomain("The Last Kingdom", "thelastkingdom",721.00,"8","783","This is the story of the making of England in the 9th and 10th centuries, the years in which King Alfred the Great, his son and grandson defeated the Danish Vikings who had invaded and occupied three of England’s four kingdoms. \n \n" +
                "The story is seen through the eyes of Uhtred, a dispossessed nobleman, who is captured as a child by the Danes and then raised by them so that, by the time the Northmen begin their assault on Wessex (Alfred’s Kingdom and the last territory in English hands) Uhtred almost thinks of himself as a Dane. He certainly has no love for Alfred, whom he considers a pious weakling and no match for Viking savagery, yet when Alfred unexpectedly defeats the Danes and the Danes themselves turn on Uhtred, he is finally forced to choose sides. By now he is a young man, in love, trained to fight and ready to take his place in the dreaded shield wall. Above all, though, he wishes to recover his father’s land, the enchanting fort of Bebbanburg by the wild northern sea.\n \n" +
                "This thrilling adventure-based on existing records of Bernard Conwell’s ancestors- depicts a time when law and order were ripped violently apart by a pagan assault on Christian England, an assault that came very close to destroying England.","Bernard Cornwell","1"));
        categoryList.add(new BookDomain("The Chronicles of Narnia", "thechroniclesofnarnia",146.00,"10","162","Journeys to the end of the world, fantastic creatures, and epic battles between good and evil- what more could any reader ask for in one book? The book that has it all is The Lion, The Witch and The Wardrobe, written in 1949 by Clive Staples Lewis. But Lewis did not stop there. Six more books followed, and together the became known as The Chronicles of Narnia. \n \n" +
                "For the past fifty years, The Chronicles of Narnia have transcended the action and fantasy genre to become part of the canon of classic literature. Each of the seven books is a masterpiece, drawing the reader into a land where magic meets reality, and the result is a fictional world whose scope has fascinated generations. \n \n" +
                "This edition presents all seven books- unabridged- in one impressive volume. The books are presented here in chronical order, each chapter graced with an illustration by the original artist, Pauline Baynes. Deceptively simple and direct, The Chronicles of Narnia continue to captivate fans with adventures, characters, and truth that speak to readers of all ages, even fifty years after they were first published.","C.S. Lewis","1"));
        categoryList.add(new BookDomain("The Ming Storm: Assassin’s Creed Novel", "themingstorm",315.00,"33","470","The Ming dynasty becomes a battleground for the Brotherhood of Assassins and the Order of the Templars in the blockbuster action novel from previously unexplored part of the bellowed Assassin’s Creed universe.\n" +
                "\n" +
                "China, 16th century. The Assassins are gone. Zhang Yong, the relentless leader of the Eight Tigers, took advantage of the emperor’s death to eliminate all his opponents, and now the Templars hold all the power. Shao Jun, the last representative of her clan, barely escapes death and has no choice but to flee her homeland. Vowing to avenge her former brothers in arms, she travels to Europe to train with the legendary Ezio Auditore. When she returns to the Middle Kingdom, her saber and her determination alone will not be enough to eliminate Zhang Yong: she will have to surround herself with allies and walk in the shadows to defeat the Eight Tigers.","Yan Lei Sheng","1"));
        categoryList.add(new BookDomain("The Hidden Oracle, The Trials of Apollo- 1", "thehiddenoracle1",191.00,"17","230","How do you punish an immortal?\n \n" +
                "By making him human. \n \n" +
                "After angering his father Zeus, the god Apollo is cast down from Olympus. Weak and disoriented, he lands in New York City as a regular teenage boy. Now, without his godly powers, the four-thousand-year-old deity must learn to survive in the modern world until he can somehow find a way to regain Zeus’s favor.\n \n" +
                "But apollo has many enemies- gods, monsters and mortals who would love to see the former Olympian permanently destroyed. Apollo needs help, and he can think of only one place to go… and enclave of modern demigods known as Camp Half-Blood.","Rick Riordan","1"));
        categoryList.add(new BookDomain("The Desecration of All Saints", "thedesecrationofallsaints",99.00,"0","99","Mackenzie August is a private detective and he's in a rut. His is a feast-or-famine profession, and seasons of mundane work are wearing him down. What he needs is a stimulating case...\n \n" +
                "Two men come to Mackenzie in secret and request his services. The leader of their church is a venerable and nationally celebrated priest, yet rumors circulate that all is not as it seems. A young clergyman, recently hired, alleges the man is really a villain in disguise. Who can be trusted, the newcomer or the respected priest?\n \n" +
                "Mackenzie is charged with discovering who is telling the truth and who is lying, and do it before the public catches wind. What he discovers, however, is far worse than anyone could've guessed...","Alan Lee","1"));
        categoryList.add(new BookDomain("Warrior Saints- Destroyer", "warriorsaintsdestroyer",298.00,"55","662","In the growing supernatural battle between the Creator and the Destroyer, what does it cost to do the right thing? Mary, Deacon, Scout, and Ivy have identified their abilities and understand their work for the Creator. But with every new burst of strength and skill the discover, the Destroyer grows more determined to terminate their efforts. Surrounded by potential enemies who are capable of vicious acts, the Warriors must learn to trust each other and their supernatural help. When violence comes to the halls of Stonehaven Academy, the Warriors react, but who is really on their side? As evil is revealed and sneaks in to every area of their lives, how do the Warriors know what to do or who to trust- especially when the sacrifice is too great? And can they stay the course and endure the aftermath when not everyone survives the fight?","Carla Thorne","1"));
        categoryList.add(new BookDomain("Christopher Columbus and the Lost City of Atlantis", "christophercolumbusandthelastcityofatlantis",662.00,"30","945","History remembers Christopher Columbus as a steadfast explorer who crossed the Atlantic to discover America. But what if I told you that’s not the real truth? That he was, in fact, a notorious adventurer who defied kings and gods in pursuit of a legendary treasure? Join him and his companions as they voyage to the lost city of Atlantis, where the fate of two worlds hangs in the balance.","E.J. Robinson","1"));
        categoryList.add(new BookDomain("Escaping Conflict", "escapingconflict",276.00,"40","460","The must adapt in order to survive when the lights go out.\n \n" +
                "After leaving college, Elna Pasqualee is determined to bring her family’s California vineyard into the twenty-first century. She hopes her diligent efforts will finally earn her father’s respect and keep visitors safe and comfortable.\n \n" +
                "But all her hopes for the future are dashed with the EMP attack.\n \n" +
                "Broadcast offer only a brief warning before missile strikes wipe out all power and communications across North America. The idyllic setting on the private island quickly sours as food and water to sustain the Pasqualees and their guests grow scarce and life becomes a fight for survival. A fight further complicated when they are cut off from the mainland- and an unexpected assailant threatens their lives. \n \n" +
                "Someone is stalking one of the guests, hiding out on the island and sabotaging Elna’s desperate efforts to sustain their source of fresh water. When her father goes missing and another guest is gravely injured, remaining on the island isn’t an option. \n \n" +
                "But even if they reach the mainland, there are no longer guarantees of safety in a world where science and reason have descended into post-apocalyptic anarchy. \n \n" +
                "And Survival of the fittest reigns supreme.","Grace Hamilton","1"));
        categoryList.add(new BookDomain("Season of Storms", "seasonofstorms",336.00,"15","395","Geralt of Rivia. A witcher whose mission is to protect ordinary people from the monsters created with magic. A mutant who has the task of killing unnatural beings. He uses a magical sign, potions and the pride of every witcher- two swords, steel and silver. But what would happen if Geralt lost his weapons? \n \n" +
                "In  this standalone novel, Geralt fights, travels and loves again, Dandelion sings and flies from trouble to trouble, sorcerers are scheming… and across the whole world clouds are gathering – the season of storms is coming…","Andrzej Sapkowski","1"));
        categoryList.add(new BookDomain("The Revival", "therevival",585.00,"20","731","The world ended. A new one began. But who gets to choose what it looks like? After two violent years spent scavenging for food and territory while struggling to survive, an easy life in Sickness-free England has a certain appeal to Donna. Only one thing- one person- could make her want to return to the ruined chaos of New York City. And she thought he was dead. Jefferson dreamed of starting over- uniting all the warring teens and creating a Utopia. Instead, the discovery of the Cure fuels a massive power struggle in the city, and it turns out, the whole world wants a piece of the pie. With some of their own tribe in trouble, a deranged madman on the loose, and an unspeakable threat looming large, Donna and Jefferson must save not only themselves but what’s left of their world in this conclusion to The young World trilogy. Because what good is living if everything you care about is gone?","Chris Weitz","1"));
        categoryList.add(new BookDomain("Battle on 42nd Street", "battleonfortysecondndstreet",1316.00,"37","2163","At what point does the will to survive on the battlefield give way to bloodlust? The Battle of Crete was one of the most spectacular military campaigns of the twentieth century. For the first time in history, German forces carried out an invasion entirely from the air while poorly equipped Anzac and British forces, and local Cretans, defended the island. During the campaign, one battle stands out for its viciousness. When the Germans approached the Allies defensive line- known as 42nd Street- on 27 May 1941, men from the Australian 2/7 and 2/8 Battalions, New Zealanders from several battalions, and British soldiers counter-attacked with fixed bayonets. By the end, bodies were strewn across the battlefield. Later, a German doctor reported that many of the bodies of the German soldiers had been mutilated. Acclaimed historian Peeter Monteath draws on records and recollections of Australian, New Zealand, British, and German forces and local Cretans to reveal the truth behind one of the most gruesome battles of the Second World War.","Peter Monteath","1"));
        categoryList.add(new BookDomain("Greatest Enemy", "greatestenemy",374.00,"14","434","“Jason Kasper’s American Mercenary series boils with bold action, exotic locales, and spellbinding intrigue”. Mark Greaney, #1 NYT Bestselling author of the Gray Man Series. \n \n" +
                "David Rivers is an Army Ranger- a combat veteran of the wars in Afghanistan and Iraq. He has almost completed his final year at West Point when his world is turned upside down by a sudden discharge from military service. Angry and confused, David soon hits rock bottom. \n \n" +
                "And that’s when they appear. \n \n" +
                "Three mysterious men. Men who know David’s dark secret- they know that he has murdered someone in cold blood. \n \n" +
                "And they wat him to do it again.","Carla Thorne","1"));
        categoryList.add(new BookDomain("Neptune Island", "neptuneisland",3230.00,"5","3400","","Carla Thorne","1"));
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
        categoryList.add(new BookDomain("The Cruel Dark", "thecrueldark",405.0,"25","540","Millicent Foxboro is haunted.\n" +
                "\n" +
                "Not by ghosts but by the anguish of her past and the uncertainty of her future. After all, even in the progressive year of 1928, most people would balk at hiring a woman who'd spent two months in a mental ward for traumatic amnesia. So when an uncommon assistantship to a reclusive Professor of mythology falls into her lap with an ungodly salary attached, her desperation for stability overrides her cautious nature.\n" +
                "\n" +
                "To Millie's dismay, the widowed Professor Callum Hughes and his estate, Willowfield, are more than she bargained for. The once magnificent home, known for its sprawling gardens and dazzling parties, is falling to pieces after the death of the professor's fragile wife. What's more, the staff has been reduced to the only three people not frightened away by rumors of ghosts, leaving the halls empty and languishing in bitter memories.\n" +
                "\n" +
                "The professor himself is a grim, intense man with unclear expectations, unpredictable moods, and hungry eyes that ignite Millie's own dormant passions. The closer she finds herself drawn to Professor Hughes and his strange world of flowers and folklore, the more the house closes in, threatening to reveal her secrets. But the professor is keeping secrets of his own and the most dangerous of all is hers to discover.","Bea Northwick","1"));
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
        categoryList.add(new BookDomain("Wrath Becomes Her", "wrathbecomesher",400.00,"80","2000","Frankenstein meets Inglourious Basterds in this stunning Jewish historical horror novel from the award-winning author of The City Beautiful\n" +
                "\n" +
                "Vera was made for vengeance.\n" +
                "\n" +
                "Lithuania, 1943. A father drowns in the all- consuming grief of a daughter killed by the Nazis. He can't bring Chaya back from the dead, but he can use kishuf an ancient and profane magic - to create a golem in her image. A Nazi killer, to avenge her death.\n" +
                "\n" +
                "When Vera awakens, she can feel her violent purpose thrumming within her. But she can also feel glimpses of a human life lived, of stolen kisses amidst the tragedy, and of a grisly death. And when she meets Akiva, she recognizes the boy with soft lips that gave warm kisses. But these memories aren't hers, and Vera doesn't know if she gets-or deserves to have a life beyond what she was made for.\n" +
                "\n" +
                "Vera's strength feels limitless-until she learns that there are others who would channel kishuf for means far less noble than avenging a daughter's death. As she confronts the very basest of humanity, Vera will need more than what her creator gave Not just a reason to fight, but a reason to live.","Aden Polydoros","1"));
        categoryList.add(new BookDomain("This is Where We Talk Things Out", "thisiswherewetalkthingsout",80.0,"20","100","This Is Where We Talk Things Out by Caitlin Marceau, author of Palimpsest: A Collection of Contemporary Horror, follows the gut-wrenching journey of Miller and her estranged mother, Sylvie, who have always had a tense relationship.\n" +
                "\n" +
                "After Miller's father dies, she agrees to a girls' vacation away from the city to reconnect with the only family she has left. Although she's eager to make things work, Miller can't help but worry that her mother is seeing their countryside retreat as a fun weekend getaway instead of what it really is: a last- ditch effort to repair their relationship.\n" +
                "\n" +
                "Unfortunately, that quickly becomes the least of Miller's problems.\n" +
                "\n" +
                "Sylvie's trapped in the past and if Miller's not careful, she will be too. A cross between Stephen King's Misery and Stephanie Wrobel's Darling Rose Gold, This Is Where We Talk Things Out explores the horror of familial trauma, mother-daughter relationships, and what happens when we don't let go.","Caitlin Marceau","1"));
        categoryList.add(new BookDomain("No Child of Mine", "nochildofmine",133.0,"50","266","There's something in the dark. And it's starting to whisper...\n" +
                "\n" +
                "Essie Kaur has defined herself by her ambitions, a fiercely independent woman whose only soft spot is her husband, Sanjay. She never imagined herself as a mother. It was never a part of the plan. But then she finds out she's pregnant. As her difficult pregnancy transforms her body and life into something she barely recognizes, her husband spends the nights pacing in the attic, slowly becoming a stranger, and the house begins to whisper.\n" +
                "\n" +
                "As Essie's pregnancy progresses, both her and Sanjay's lives are warped by a curse that has haunted her family for generations, leaving a string of fatherless daughters in its wake. When she's put on bedrest, Essie trades the last aspects of her carefully planned life for isolation in what should be a welcoming home, but she isn't alone. There's something here that means to take everything from her...","Nichelle Giraldes","1"));
        categoryList.add(new BookDomain("The Darkness Surrounds Us", "thedarknesssurroundsus",210.0,"40","350","\"An early-autumn treat fit for late-night devouring.\"? Publishers Weekly \"A taut gothic mystery with an intriguing twist.\" ?Susanna Calkins, award-winning author of the Lucy Campion Mysteries and the Speakeasy Murders A Ghostly Window Into the Past Nurse Nellie Lester can't escape death. Fleeing Chicago at the height of the 1918 Spanish flu, she takes a nursing job at a decrepit mansion on a desolate Michigan island. She's convinced the island holds the secret to her mother's murky past. The only problem? Her dead mother seems to have followed her there. Nightly she's haunted by a ghostly presence that appears in her bedroom. But is it her mother or something more sinister? When the frozen body of the prior nurse is unearthed, Nellie suspects her family's history and the nurse's uncanny death are connected to a mysterious group that disappeared from the island twenty-four years earlier. As winter closes in, past and present collide resurrecting a lurid killer, hell-bent on keeping the island's secrets. Will Nellie uncover her mother's shocking past before the killer enacts his final revenge? \"Lukasik blends all the elements needed for a dark suspense a forbidding mansion, ghostly presences, secret passages, a hostile housekeeper, a temperamental employer, and residents unwilling to talk to outsiders. For fans of Rebecca, The Woman in White, and The Death of Mrs. Westaway.\"? Library Journal.","Gail Lukasik","1"));
        categoryList.add(new BookDomain("The House of Whispers", "thehouseofwhispers",270.0,"10","300","A notorious murderer haunting the streets of Bedeville stumbles upon a mysterious woman, becoming obsessed as he spends his nights endlessly toying with her and turning her world into a living nightmare.\n" +
                "\n" +
                "This dark and twisted retelling of Jack the Ripper mixed with Jekyll and Hyde takes place in a fantasy world filled with magic, mischief, and murder.\n" +
                "?\n" +
                "TRIGGER WARNING: This book contains dark romance, drugs, addiction, mental disorder, explicit language, detailed sexual scenes, gore, blood, death, mention of sexual assault, and attempted suicide.","C. Hebert","1"));
        categoryList.add(new BookDomain("Tag, You’re Dead", "tagyouredead",252.0,"35","387","From the bestselling author of Come Out, Come Out, Whatever You Are and Good Girls Die First comes an entertaining new thriller filled with knife-edged tension, twists you won't see coming, and contestants who will do anything to win?even something deadly. When teen social media influencer Anton Frazer stages a live-streamed, citywide game of Tag where the prize is to become one of his live-in personal assistants, his fans go wild. Outfitted with body cams, GPS trackers, and pressure sensors to keep tally of who's disqualified, contestants are split into Chasers and Runners then let lose into the night-covered urban jungle to hunt each other down. While the whole world watches. Four contestants, however, have alternative motives for joining the game, secret reasons to want to win despite the risk: money, obsession, fame...and revenge. One of them will stop at nothing to be the victor at the end of this adrenaline- and fear-fueled night. Praise for COME OUT, COME OUT, WHATEVER YOU ARE \"Mystery-loving readers will keep turning the pages to uncover the characters' secrets and learn the truth...A fun read for readers who prefer mild suspense and enjoy reality TV settings.\"? Kirkus Reviews Praise for GOOD GIRLS DIE FIRST \"Foxfield's focus on social niches and escalating suspense will appeal to fans of Karen McManus.\"? Publishers Weekly \"This gothic-inspired thriller with nods to Agatha Christie and Daphne du Maurier will keep readers on the edge of their seats and turning pages as quickly as they can. It is immersing, puzzling, and unpredictable, with a surprise ending that's sure to have teens talking.\" ? School Library Journal \"Undeniably creepy from the start... With a macabre escape and a surprising amount of heart, this will leave readers feeling oddly optimistic and perhaps a little kinder to themselves...\" ? The Bulletin of the Center for Children's Books, STARRED Review the most gripping thriller of the year; hugely entertaining, high-octane and read-in-a-single- sitting.\"? ReadingZone","Kathryn Foxfield","1"));
        categoryList.add(new BookDomain("Where He Can’t Find You", "wherehecantfindyou",630.0,"10","700","From USA Today bestselling horror/thriller author Darcy Coates comes the chilling legend of a monster no one can escape.\n" +
                "\n" +
                "DON'T WALK ALONE, OR THE STITCHER WILL FIND YOU.\n" +
                "\n" +
                "Abby Ward lives in a town haunted by disappearances. People vanish, and when they're found, their bodies have been dismembered and sewn back together in unnatural ways. But is it the work of a human killer...or something far darker?\n" +
                "\n" +
                "DON'T STAY OUT LATE, OR THE STITCHER WILL TAKE YOU.\n" +
                "\n" +
                "She and her younger sister live by a strict set of rules designed to keep them safe?which is why it's such a shock when Hope is taken. Desperate to get her back, Abby tells the police everything she knows, but they claim their hands are tied.\n" +
                "\n" +
                "DON'T CLOSE YOUR EYES, OR THE STITCHER WILL REMAKE YOU.\n" +
                "\n" +
                "With every hour precious, Abby and her friends are caught in a desperate game of cat and mouse. They have to get Hope back. Quickly. Before too much of her is cut away. And before everything they care about is swallowed up by the darkness waiting in the tunnels beneath the home they thought they knew.","Darcy Coates","1"));
        categoryList.add(new BookDomain("The Lover", "thelover",80.0,"0","80","During a brutal winter, a young woman longing for love finds more than she expected in the woods, in this wickedly sensuous short story by Silvia Moreno- Garcia, the New York Times bestselling author of Mexican Gothic.\n" +
                "\n" +
                "Judith knows her sister, Alice, is the pretty one-but that doesn't stop her from wishing for love. When a handsome and gentlemanly hunter appears in their village, seeking lodging from the cold, she believes her lover has finally arrived. He does, indeed, choose to stay-but as Alice's husband, not her own. When another stranger comes out of the woods, looking every bit a vagrant, he offers Judith something mysterious and enticingly strange. Against reason and decency, she welcomes both men into her life, in different ways. As forbidden longings ensnare each of them, an unrelenting winter storm and an evasive wolf on the prowl have everyone on edge...and ravenous. By spring thaw, will any of their hungers be satisfied?","Silvia Moreno-Garcia","1"));
        categoryList.add(new BookDomain("All That Consumes Us", "allthatconsumesus",214.0,"50","429","Ninth House meets The Dead and the Dark in this gothic dark academia novel that delves into the human capacity for great love, great art, and great evil. Magni animi numquam moriuntur. Great minds never die.\n" +
                "\n" +
                "The students in Corbin College's elite academic society, Magni Viri, have it all-free tuition, inspirational professors, and dream jobs once they graduate. When first-gen college student Tara is offered a chance to enroll, she doesn't hesitate.? Except once she's settled into the gorgeous Victorian dormitory, something strange starts to happen. She's finally writing, but her stories are dark and twisted. Her dreams feel as if they could bury her alive. An unseen presence seems to stalk her through the halls. And a chilling secret awaits Tara at the heart of Magni Viri-one that just might turn her nightmares into reality; one that might destroy her before she has a chance to escape.\n" +
                "\n" +
                "All That Consumes Us will pull readers into a hypnotizing, dark reverie that blurs the lines of reality and shows that the addictive nature of ambition- and its inevitable price- always claims the due.","Erica Waters","1"));
        categoryList.add(new BookDomain("She is a Haunting", "sheisahaunting",133.0,"10","156","A house with a terrifying appetite haunts a broken family in this atmospheric horror, perfect for fans of Mexican Gothic.\n" +
                "\n" +
                "When Jade Nguyen arrives in Vietnam for a visit with her estranged father, she has one goal: survive five weeks pretending to be a happy family in the French colonial house Ba is restoring. She's always lied to fit in, so if she's straight enough, Vietnamese enough, American enough, she can get out with the college money he promised.\n" +
                "\n" +
                "But the house has other plans. Night after night, Jade wakes up paralyzed. The walls exude a thrumming sound, while bugs leave their legs and feelers in places they don't belong. She finds curious traces of her ancestors in the gardens they once tended. And at night Jade can't ignore the ghost of the beautiful bride who leaves her cryptic warnings: Don't eat.\n" +
                "\n" +
                "Neither Ba nor her sweet sister Lily believe that there is anything strange happening. With help from a delinquent girl, Jade will prove this house-the home her family has always wanted-will not rest until it destroys them. Maybe, this time, she can keep her family together. As she roots out the house's rot, she must also face the truth of who she is and who she must become to save them all.","Trang Thanh Trah","1"));
        categoryList.add(new BookDomain("The Island", "theisland",147.0,"30","210","They said goodbye to their friends and family for the weekend. They weren't counting on forever.\n" +
                "\n" +
                "Jagged Island: a private amusement park for the very rich-or the very influential. Liam, James, Will, Ava, Harper, and Paisley-social media influencers with millions of followers-have been invited for an exclusive weekend before the park opens. They'll make posts and videos for their channels and report every second of their VIP treatment.\n" +
                "\n" +
                "When the teens arrive, they're stunned: the resort is even better than they'd imagined. Their hotel rooms are unreal, the park's themed rides are incredible, and the island is hauntingly beautiful. They're given a jam-packed itinerary for the weekend.\n" +
                "\n" +
                "But soon they'll discover that something's missing from their schedule: getting off the island alive.","Natasha Preston","1"));
        categoryList.add(new BookDomain("To Forge a Hollow Crown", "toforgeahollowcrown",160.0,"60","399","\"In the shadow of the throne, desire knows no bounds. \"From the moment I united the rebels with Theron's formidable warriors, our combined forces have been on a collision course with destiny, all roads leading to Athain. But with every step towards confronting Theron's formidable mother, Empress Nyana, it feels like the universe is testing our love.\n" +
                "\n" +
                "While many in our makeshift army may disapprove of our union, nothing can quell the burning passion between Theron and me. But the challenges we face aren't just from foes. The treacherous desert hides creatures of legend, shadows of our past, and even another elven warrior who, with her own aspirations for the throne, stands between us and our dream of a free world.\n" +
                "\n" +
                "Can our love survive the myriad forces working to pull us apart? Or will the empire's weight prove too much, threatening to tear us apart forever?\n" +
                "\n" +
                "Content To Forge a Hollow Crown is a dark and steamy read recommended for readers 18+ due to explicit language, violence, and sexual situations. To Forge a Hollow Crown is the final installment in the Sands of Maeoris series.","Atley Wikes","1"));
        categoryList.add(new BookDomain("In His Hands", "inhishands",95.00,"25","126","Consent is everything...and with consent, everything is possible.\n" +
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
        categoryList.add(new BookDomain("Midnight Rider", "midnightrider",245.00,"44","436","Savor the magic of New York Times bestselling author Diana Palmer in a dazzlingly sensual story of turn-of-the-century Texas, of a man as enigmatic and forbidding as the sun-drenched land-and the woman who dares to cross into the uncharted territory of his heart.\n" +
                "\n" +
                "To Bernadette Barron, Eduardo Cortes was the enemy. A noble count with a sprawling ranch in the grand state of Texas, Cortes challenged her with dark, penetrating eyes that seemed to pierce her very soul. Could he see the burning truth: that she loved him? It is a secret Bernadette vows to keep-- especially now that she is to become his wife. For theirs is a marriage bargain, pure and simple. He needs a rich wife to save his ranch; she needs a titled husband.\n" +
                "\n" +
                "Yet desire will turn a marriage of convenience into a passionate battle of wills, and change an innocent girl into a woman aware of her own powers of attraction. For it is love's fiery initiation that will make Bernadette aware of her own capacity for pleasure as well as her husband's skill at providing it. And it is the sheer force of her own love that will give her newfound strength to battle against the odds to claim a man and a love she will not be denied...","Diana Palmer","1"));
        categoryList.add(new BookDomain("Once Upon a Dream", "onceuponadream",118.00,"16","140","Lush. Evocative. Romantic. Enter the sensual world of modern day fairy tales with three novellas by USA Today bestselling author Sierra Simone.\n" +
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
        categoryList.add(new BookDomain("Pop Tarts and Mistletoe", "poptartsandmistletoe",200.00,"20","250","Being stuck at the airport wasn't part of my holiday plans.I was on my way to stay with my best friend and his family for the holidays when a freak snowstorm hit. Now I'm stuck, all planes are grounded, and there are no hotel rooms available. I also have no clue of when I'd be able to get on another plane, so here I sit. Then I saw her. She stood in front of a vending machine, scrounging through her purse. When she found her last bit of change, she carefully made her selection. A disappointed look came over her face and she began to punch and kick the vending machine trying to get whatever she'd selected to drop. When it did, she threw her hands in the air as if she'd just made the winning touchdown. Then she bent down and pulled out a package of pop tarts. Pop tarts? Who buys pop tarts from a vending machine? She was feisty and cute, and I knew I needed to meet her. So, I invited her to sit with me. The night passed quickly, with flights heading out the next morning. It was then I realized I'd missed an opportunity as I watched her disappear into the airport crowd. However, Father Christmas smiled down on me once again when I discovered that the beautiful holiday angel, I'd met earlier was my best friends sister, and I only had a few days to make her mine.","S.L. Sterling","1"));
        categoryList.add(new BookDomain("All That We Are Together", "allthatwearetogether",81.00,"10","90","Three years without even seeing him. Three years without Axel.\n" +
                "\n" +
                "How do you move on from a broken heart?\n" +
                "\n" +
                "Three years have passed since Axel Nguyen shattered Leah Jones' heart into a million pieces, and Leah has spent every moment of those three years distracting herself from the devastation. She tries to move on with Landon, a guy she meets in college, but she can only truly escape thoughts of Axel when she's painting. At least one good thing has come out of all of it: her dream of exhibiting her work is finally coming true.\n" +
                "\n" +
                "Axel is achingly aware every day of how much he misses Leah. The moment he learns about Leah's exhibit, Axel can't think about anything else but to go see her. Being in the same room with Leah, as beautiful and magnetic as he remembers, leaves Axel desperate and Leah breathless in his presence. He offers to be her agent; she accepts. One work trip to Paris later leaves Leah and Axel full of pent-up attraction and wondering if their whirlwind romance is a forever kind of love or if it's better off left in the past.\n" +
                "\n" +
                "International bestselling author Alice Kellen concludes her emotional new adult duology with an evocative and passionate love story for readers of Colleen Hoover, Anna Todd, and books to make you ugly cry.","Allice Kellen","1"));
        categoryList.add(new BookDomain("Beauty Found", "beautyfound",540.00,"10","600","EVEN IN HELL, THERE IS BEAUTY TO BE FOUND.\n" +
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
        categoryList.add(new BookDomain("Bonded Beyond Lies", "bondedbeyondlies",143.00,"3","148","There are moments in time you wish to capture and keep. Others you wish you could forget forever- moments when your life irrecoverably changes. You hope it's a change for the better, but I haven't found that to be true.\n" +
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
        categoryList.add(new BookDomain("Feast", "feast",147.00,"30","210","Poor Spence-all he wanted to do was fly to Vegas, walk his mother down the aisle, and get back to his shop. Until a very attractive seatmate on the plane has him adjusting his plans to make time for some anonymous stranger sex.\n" +
                "\n" +
                "It's just his bad luck that his anonymous stranger turns out to be his new stepsister.\n" +
                "\n" +
                "When Maddie realizes she's just spent two days banging her new stepbrother, her first reaction is to laugh. Her second is to wish she could do it again. It was very memorable banging, and the prospect of not doing it anymore is a bleak one. Still, she can keep things sibling-like if Spence can.\n" +
                "\n" +
                "Lucky for her, Spence is just as eager as she is to pick up where they left off in Vegas, on the condition they keep it just between them. Telling the family will only make things complicated, after all. And that's fine with Maddie-until she realizes she's falling in love with a man who seems content for her to stay his dirty little secret.\n" +
                "\n" +
                "Dirty she's fine with. A secret? That's a deal breaker.","Hannah Murray","1"));
        categoryList.add(new BookDomain("Four Fireman For Christmas", "fourfiremanforchristmas",125.00,"12","142","Four Firemen For Christmas: A Reverse Harem, Pregnancy Romance\n" +
                "\n" +
                "Raise your hand if you've ever been rescued from a job search by four hunky firefighters...Just me?l guess that's this year's Christmas miracle... I need a job-desperately. That's how I find myself in a coffee shop right before Christmas, frantically searching... Until a freaking fire breaks out, and my determined self is dragged out of the burning building by four irresistible firemen.\n" +
                "\n" +
                "Suddenly the job doesn't seem as important as the four alpha males devoted to bringing me to safety.\n" +
                "\n" +
                "Derek is young and... well let's say, drop dead freaking gorgeous. I think he likes the danger, or it seems to follow him around... But he would never leave a friend behind in the line of fire.\n" +
                "\n" +
                "Alex is smart, quiet and thinks about his actions before he makes a move. But his calculated attitude makes me crazy... I want to sass my way into his carefully curated routine.\n" +
                "\n" +
                "Samuel likes to win. He is constantly one-upping and besting his friends. And why he gets even more competitive when it comes to me. Not that I'm complaining.\n" +
                "\n" +
                "Henry doesn't stop at being in charge... He wants to be in control. I can't help but respect him... and want him, despite our twenty-year age gap that should keep me away.\n" +
                "\n" +
                "The four men come together to get me a job at their fire station. But where there's heat, there's fire... And the next thing I know, this sassy, sweet, curvy girl- me-is falling for all four firefighters...\n" +
                "\n" +
                "And pregnant by one of them in time for Christmas...\n" +
                "\n" +
                "FOUR FIREMEN FOR CHRISTMAS is a why choose Christmas-themed spicy standalone. Bring on the heat with this festive story (comes with a sweet pregnant heroine)!","Ajme Williams","1"));
        categoryList.add(new BookDomain("Candy Cam", "candycam",291.00,"38","469","The nerd.\n" +
                "\n" +
                "That's what I've always been. The quiet, shy girl that liked school and wasn't part of the popular cliques. I found science and math more mentally challenging than memorizing cheer and dance routines, and that didn't earn me any social points in high school. I was too pretty for the brainy boys and scared away the jocks. I was the girl in between. And it sucked. I had so much to offer and no one to experiment with. Getting drunk by raiding my parents' liquor stash with my best friend didn't count. My lack of social life wasn't because my parents kept me under lock and key. My mom tried to nudge me to participate in class events. She even suggested parties. I was terrified.\n" +
                "\n" +
                "College-my fresh start. I was determined to lose my shyness like a layer of skin. I was ready to come out and experience everything life had to offer. No one would know me at a culturally diverse university.\n" +
                "\n" +
                "Then I met my new best friend. She was identical to me, but then so different. Smart. Beautiful. Outgoing. A web development major. I became the test subject in her group project-a social media site for those looking to partner up. One place for those of all interests to come together. The success of your match came down to the profile. What better place to come out of my shell than behind a screen. I set one up.\n" +
                "\n" +
                "He was everything and more. Smart. Driven. Sexy. A domineering personality. It didn't even bother me that he was older. He was okay with us taking things slow. Working our way up from a simple email to the Candy Cam aspect of the site. It was perfect. But online never stays online for long. He wanted to meet. I didn't. I was so confident online, but in real life I was quiet and awkward. Then my roommate invited me home for the weekend. \n" +
                "\n" +
                "That perfect man-turns out he's my roommate's dad.\n" +
                "\n" +
                "PLEASE THIS WAS PREVIOUSLY A KINDLE VELLA STORY.","Charisse Spiers","1"));
        categoryList.add(new BookDomain("Finding Elizabeth", "findingelizabeth",270.00,"10","300","Hey, can you help us? My name's Grinder, and these are my friends, Nova and Bats. We screwed up. * Ahem * Okay, yes. I screwed up. You see, we met this incredible woman at the start of the trail. She's smart, beautiful, and fun. She loves science, she's everything each of us could want in a partner, and she makes the whole trail bright and sunny, even on a rainy day. Like Nova says, she's our nachos. I know, but I swear it makes sense. It took a bit, but we realized what we all wanted, and what we want is belong to Elizabeth Dawson. Of course, then I had to go and screw everything up. I was supposed to talk to her, and well, we got a little sidetracked. When I woke up, she was gone. She ran away thinking she did something she can't take back. Now we're out here looking for her. We need to find her and let her know everything is alright. That we want to be her guys if she's willing to give us a shot. Thing is, it's a big trail and she could be anywhere. Which is why we need you. So how about it? Can you help us find Elizabeth?\n" +
                "\n" +
                "Finding Elizabeth is the third book of the Trail Magic series, a contemporary reverse harem romance set along the Pacific Crest Trail. Grinder, Nova, and Bats continue their five-month trek from the Mexican border to British Columbia, determined to find Belle before they lose her for good. It's full of laughs, coffee, cheeseburgers, and chances for four young adults to figure out who they are and what they want.","Chris Mor","1"));
        categoryList.add(new BookDomain("Twisted Obsession", "twistedobsession",102.00,"38","163","Twisted Obsession, Hockey Gods\n" +
                "\n" +
                "My name is Melody Cameron... Or so I've been told.\n" +
                "\n" +
                "When I wake up in the hospital with no memories, I'm shipped off to Denver to live with a distant cousin who knows nothing about me.\n" +
                "\n" +
                "If family can't help me remember my past, who will?\n" +
                "\n" +
                "I don't expect it to be a gorgeous hockey player ten years younger than me. He knows things about me he has no right to know.\n" +
                "\n" +
                "Yet, he still keeps secrets. He makes me work for every answer while he unlocks my desire-and fear.\n" +
                "\n" +
                "Still. I'm blind. Naive.\n" +
                "\n" +
                "And when his twisted obsession becomes apparent, it's too late. For both of us.","S. Massery","1"));
        categoryList.add(new BookDomain("Indecent Book Club", "indecentbookclub",60.00,"15","70","Indecent Book Club: Freed\n" +
                "\n" +
                "It's all been building to this moment. The decision that will define Derek's entire life. Will he turn left... or right...A meet has been set to deliver the money, but Derek unravels the final strands of the mystery from the most unlikely of His mother. Answers will lead to more questions. It's a good thing the next Book Club meeting is this weekend. They are always so informative. Derek's heart and mind will have to work together if he is to find his way through. Get This Book and find out what kind of man Derek has become in the Eighth and final Book of the Indecent Book series!","Raven Black","1"));
        categoryList.add(new BookDomain("One More Night", "onemorenight",323.00,"30","461","Your presence is requested for another installment in the tale of Julia and Clay, two red-hot lovers. Come inside their world of passion and suspense once more for a deliciously erotic and heart- poundingly dangerous story of pearls, handcuffs, thieves, mobsters, poker and pleasure in the city of sin...\n" +
                "\n" +
                "Happy endings don't come easily. They're hard-won and Clay Nichols is going to have to keep earning his...Now living together in New York with her debt safely paid off, sexy bartender Julia Bell and hot-as- hell entertainment lawyer Clay thought their future was clear sailing.\n" +
                "\n" +
                "But life doesn't work that way and the fiery lovers run into a slew of new challenges as Clay tries to put a ring on it. Trouble looms in every corner-trouble from clients, trouble with timing, and, most of all, trouble from her past returns on their trip to Vegas. A dangerous man who knows much more about Julia than he should surfaces in Sin City where they're supposed to be enjoying a weekend getaway. Following her in the casino, watching her every move at the pool, targeting her as she plays poker.\n" +
                "\n" +
                "Too bad Clay is called away repeatedly, leaving Julia alone in a sprawling hotel full of dark corners, back rooms, and unsavory characters. Can Clay save her from danger one more time, and then finally get down on one knee? Or will he be too late for the woman he adores?\n" +
                "\n" +
                "Note: While this can be read as a standalone, you will likely enjoy it much more if you read the two novels that precede it.","Lauren Blakely","1"));
        categoryList.add(new BookDomain("The Treeline", "thetreeline",240.00,"20","300","The Treeline: The Last Forest and the Future of Life on Earth\n" +
                "\n" +
                "In the tradition of Elizabeth Kolbert and Barry Lopez, a powerful, poetic and deeply absorbing account of the \"lung\" at the top of the world.\n" +
                "\n" +
                "For the last fifty years, the trees of the boreal forest have been moving north. Ben Rawlence's The Treeline takes us along this critical frontier of our warming planet from Norway to Siberia, Alaska to Greenland, to meet the scientists, residents and trees confronting huge geological changes. Only the hardest species survive at these latitudes including the ice-loving Dahurian larch of Siberia, the antiseptic Spruce that purifies our atmosphere, the Downy birch conquering Scandinavia, the healing Balsam poplar that Native Americans use as a cure- all and the noble Scots Pine that lives longer when surrounded by its family.\n" +
                "\n" +
                "It is a journey of wonder and awe at the incredible creativity and resilience of these species and the mysterious workings of the forest upon which we rely for the air we breathe. Blending reportage with the latest science, The Treeline is a story of what might soon be the last forest left and what that means for the future of all life on earth.\n","Ben Rawlence","1"));
        categoryList.add(new BookDomain("Empire of Ice and Stone", "empireoficeandstone",639.0,"20","799","Empire of Ice and Stone: The Disastrous and Heroic Voyage of the Karluk\n" +
                "\n" +
                "The true, harrowing story of the ill-fated 1913 Canadian Arctic Expedition and the two men who came to define it.\n" +
                "\n" +
                "In the summer of 1913, the wooden-hulled brigantine Karluk departed Canada for the Arctic Ocean. At the helm was Captain Bob Bartlett, considered the world's greatest living ice navigator. The expedition's visionary leader was a flamboyant impresario named Vilhjalmur Stefansson hungry for fame.\n" +
                "\n" +
                "Just six weeks after the Karluk departed, giant ice floes closed in around her. As the ship became icebound, Stefansson disembarked with five companions and struck out on what he claimed was a 10-day caribou hunting trip. Most on board would never see him again.\n" +
                "\n" +
                "Twenty-two men and an Inuit woman with two small daughters now stood on a mile-square ice floe, their ship and their original leader gone. Under Bartlett's leadership they built make-shift shelters, surviving the freezing darkness of Polar night. Captain Bartlett now made a difficult and courageous decision. He would take one of the young Inuit hunters and attempt a 1000-mile journey to save the shipwrecked survivors. It was their only hope.\n" +
                "\n" +
                "Set against the backdrop of the Titanic disaster and World War I, filled with heroism, tragedy, and scientific discovery, Buddy Levy's Empire of Ice and Stone tells the story of two men and two distinctively different brands of leadership? one selfless, one self- serving? and how they would forever be bound by one of the most audacious and disastrous expeditions in polar history, considered the last great voyage of the Heroic Age of Discovery.\n","Buddy Levy","1"));
        categoryList.add(new BookDomain("Into Siberia", "intosiberia",405.0,"25","540","Into Siberia: George Kennan's Epic Journey Through the Brutal, Frozen Heart of Russia\n" +
                "\n" +
                "In the late nineteenth century, close diplomatic relations existed between the United States and Russia. All that changed when George Kennan went to Siberia in 1885 to investigate the exile system and his eyes were opened to the brutality Russia was wielding to suppress dissent.\n" +
                "\n" +
                "Over ten months Kennan traveled eight thousand miles, mostly in horse-drawn carriages, sleighs or on horseback. He endured suffocating sandstorms in the summer and blizzards in the winter. His interviews with convicts and political exiles revealed how Russia ran on the fuel of inflicted pain and fear. Prisoners in the mines were chained day and night to their wheelbarrows as punishment. Babies in exile parties froze to death in their mothers' arms. Kennan came to call the exiles' experience in Siberia a \"perfect hell of misery.\"\n" +
                "\n" +
                "After returning to the United States, Kennan set out to generate public outrage over the plight of the exiles, writing the renowned Siberia and the Exile System. He then went on a nine-year lecture tour to describe the suffering of the Siberian exiles, intensifying the newly emerging diplomatic conflicts between the two countries which last to this day. In a book that ranks with the greatest adventure stories, Gregory Wallance's Into Siberia is a thrilling work of history about one man's harrowing journey and the light it shone on some of history's most heinous human rights abuses.\n","Gregory J. Wallance","1"));
        categoryList.add(new BookDomain("A History of Crime and American Criminal Justice System", "ahistoryofcrimeandamericancriminaljusticesystem",294.0,"40","489","This book offers a history of crime and the criminal justice system in America, written particularly for students of criminal justice and those interested in the history of crime and punishment. It follows the evolution of the criminal justice system chronologically and, when necessary, offers parallels between related criminal justice issues in different historical eras. From its antecedents in England to revolutionary times, to the American Civil War, right through the twentieth century to the age of terrorism, this book combines a wealth of resources with keen historical judgement to offer a fascinating account of the development of criminal justice in America. A new chapter brings the story up to date, looking at criminal justice through the Obama era and the early days of the Trump administration.\n" +
                "\n" +
                "Each chapter is broken down into four crucial components related to the American criminal justice system from the historical lawmakers and the judiciary; law enforcement; corrections; and crime and punishment. A range of pedagogical features, including timelines of key events, learning objectives, critical thinking questions and sources, as well as a full glossary of key terms and a Who's Who in Criminal Justice History, ensures that readers are well-equipped to navigate the immense body of knowledge related to criminal justice history.\n" +
                "\n" +
                "Essential reading for Criminal Justice majors and historians alike, this book will be a fascinating text for anyone interested in the development of the American criminal justice system from ancient times to the present day.\n","Mitchel P. Roth","1"));
        categoryList.add(new BookDomain("Wrath Becomes Her", "wrathbecomesher",400.00,"80","2000","Frankenstein meets Inglourious Basterds in this stunning Jewish historical horror novel from the award-winning author of The City Beautiful\n" +
                "\n" +
                "Vera was made for vengeance.\n" +
                "\n" +
                "Lithuania, 1943. A father drowns in the all- consuming grief of a daughter killed by the Nazis. He can't bring Chaya back from the dead, but he can use kishuf an ancient and profane magic - to create a golem in her image. A Nazi killer, to avenge her death.\n" +
                "\n" +
                "When Vera awakens, she can feel her violent purpose thrumming within her. But she can also feel glimpses of a human life lived, of stolen kisses amidst the tragedy, and of a grisly death. And when she meets Akiva, she recognizes the boy with soft lips that gave warm kisses. But these memories aren't hers, and Vera doesn't know if she gets-or deserves to have a life beyond what she was made for.\n" +
                "\n" +
                "Vera's strength feels limitless-until she learns that there are others who would channel kishuf for means far less noble than avenging a daughter's death. As she confronts the very basest of humanity, Vera will need more than what her creator gave Not just a reason to fight, but a reason to live.","Aden Polydoros","1"));
        categoryList.add(new BookDomain("A History of Crime and American Criminal Justice System", "ahistoryofcrimeandamericancriminaljusticesystem",294.0,"40","489","This book offers a history of crime and the criminal justice system in America, written particularly for students of criminal justice and those interested in the history of crime and punishment. It follows the evolution of the criminal justice system chronologically and, when necessary, offers parallels between related criminal justice issues in different historical eras. From its antecedents in England to revolutionary times, to the American Civil War, right through the twentieth century to the age of terrorism, this book combines a wealth of resources with keen historical judgement to offer a fascinating account of the development of criminal justice in America. A new chapter brings the story up to date, looking at criminal justice through the Obama era and the early days of the Trump administration.\n" +
                "\n" +
                "Each chapter is broken down into four crucial components related to the American criminal justice system from the historical lawmakers and the judiciary; law enforcement; corrections; and crime and punishment. A range of pedagogical features, including timelines of key events, learning objectives, critical thinking questions and sources, as well as a full glossary of key terms and a Who's Who in Criminal Justice History, ensures that readers are well-equipped to navigate the immense body of knowledge related to criminal justice history.\n" +
                "\n" +
                "Essential reading for Criminal Justice majors and historians alike, this book will be a fascinating text for anyone interested in the development of the American criminal justice system from ancient times to the present day.\n","Mitchel P. Roth","1"));
        categoryList.add(new BookDomain("No Child of Mine", "nochildofmine",133.0,"50","266","There's something in the dark. And it's starting to whisper...\n" +
                "\n" +
                "Essie Kaur has defined herself by her ambitions, a fiercely independent woman whose only soft spot is her husband, Sanjay. She never imagined herself as a mother. It was never a part of the plan. But then she finds out she's pregnant. As her difficult pregnancy transforms her body and life into something she barely recognizes, her husband spends the nights pacing in the attic, slowly becoming a stranger, and the house begins to whisper.\n" +
                "\n" +
                "As Essie's pregnancy progresses, both her and Sanjay's lives are warped by a curse that has haunted her family for generations, leaving a string of fatherless daughters in its wake. When she's put on bedrest, Essie trades the last aspects of her carefully planned life for isolation in what should be a welcoming home, but she isn't alone. There's something here that means to take everything from her...","Nichelle Giraldes","1"));
        categoryList.add(new BookDomain("A Modern Legal History of Treasure", "amodernleganhistoryoftreasure",210.0,"40","350","This book examines treasure law and practice from the rise of the new science of archaeology in the early Victorian period to the present day. Drawing on largely-unexamined state records and other archives, the book covers several legal England and Wales, Scotland, Ireland pre- and post-independence, and post-partition Northern Ireland. From the Mold gold cape (1833) to the Broighter hoard (1896), from Sutton Hoo (1939) to the Galloway hoard (2014), the law of treasure trove, and the Treasure Act 1996, are considered through the prism of notable archaeological discoveries, and from the perspectives of finders, landowners, archaeologists, museum professionals, collectors, the state, and the public. Literally and metaphorically, treasure law is revealed as a ground-breaking chapter in the history of the legal protection of cultural property and cultural heritage in Britain and Ireland.","N.M. Dawson","1"));

        // Add more categories here
        return categoryList;
    }

}