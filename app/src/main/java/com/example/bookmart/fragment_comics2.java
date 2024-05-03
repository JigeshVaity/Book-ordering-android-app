package com.example.bookmart;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class fragment_comics2 extends Fragment {
    private RecyclerView recyclerViewCategoryList;
    private ExploreCategoryAdapter adapter;

    public fragment_comics2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_action2, container, false);

        recyclerViewCategoryList = view.findViewById(R.id.rec1);

        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());
        recyclerViewCategoryList.setLayoutManager(layoutManager);

        // Create an instance of ExploreCategoryAdapter and provide the data and fragment reference
        adapter = new ExploreCategoryAdapter(getRecommendedList(), this);

        recyclerViewCategoryList.setAdapter(adapter);

        return view;
    }

    private ArrayList<BookDomain> getRecommendedList() {
        ArrayList<BookDomain> recommendedList = new ArrayList<>();

        recommendedList.add(new BookDomain("Dark Rose", "darkrose",985.00,"28","1368","It started by stealth. At first, no one could see what was happening. By the time the alarm was raised it was too late. Ireland had been seized: a financial assault consolidated by a military one. \n \n" +
                "But as the island is overrun, it’s soon clear that the invaders did not anticipate the fierce resolve of their Celtic opponents. Nor the determination of the country’s powerful allies to throw out the occupiers. \n \n" +
                "While a strengthening Irish resistance mounts a fierce guerilla campaign to take their country back, the British bring to bear the full might of the Army, Royal Navy and RAF to liberate their friend and neighbor across the Irish Channel.","Mike Lunnon-Wood","1"));
        recommendedList.add(new BookDomain("ManHunter", "manhunter",105.00,"35","140","Five years after the meltdown. The residents of LakeTown, a small trading settlement in Oregon, want to live in peace. But warring factions and local bandits have other ideas, constantly raiding the helpless town and stealing their precious water supply. Desperation takes hold and the LakeTowners turn to an unlikely hero for help- Butch Nolan. Nolan is a cold-hearted killer with a score to settle. Having survived the meltdown and his injuries, Nolan knows that revenge still stops for nothing. Not even the end of the world. Mad Max meets Clint Eastwood’s spaghetti westerns in this rollercoaster thrill ride of a sequel to Nolan’s Ark. The perfect treat for fans of post-apocalyptic action.","Mark Gillespie","1"));
        recommendedList.add(new BookDomain("The Last Kingdom", "thelastkingdom",721.00,"8","783","This is the story of the making of England in the 9th and 10th centuries, the years in which King Alfred the Great, his son and grandson defeated the Danish Vikings who had invaded and occupied three of England’s four kingdoms. \n \n" +
                "The story is seen through the eyes of Uhtred, a dispossessed nobleman, who is captured as a child by the Danes and then raised by them so that, by the time the Northmen begin their assault on Wessex (Alfred’s Kingdom and the last territory in English hands) Uhtred almost thinks of himself as a Dane. He certainly has no love for Alfred, whom he considers a pious weakling and no match for Viking savagery, yet when Alfred unexpectedly defeats the Danes and the Danes themselves turn on Uhtred, he is finally forced to choose sides. By now he is a young man, in love, trained to fight and ready to take his place in the dreaded shield wall. Above all, though, he wishes to recover his father’s land, the enchanting fort of Bebbanburg by the wild northern sea.\n \n" +
                "This thrilling adventure-based on existing records of Bernard Conwell’s ancestors- depicts a time when law and order were ripped violently apart by a pagan assault on Christian England, an assault that came very close to destroying England.","Bernard Cornwell","1"));
        recommendedList.add(new BookDomain("The Chronicles of Narnia", "thechroniclesofnarnia",146.00,"10","162","Journeys to the end of the world, fantastic creatures, and epic battles between good and evil- what more could any reader ask for in one book? The book that has it all is The Lion, The Witch and The Wardrobe, written in 1949 by Clive Staples Lewis. But Lewis did not stop there. Six more books followed, and together the became known as The Chronicles of Narnia. \n \n" +
                "For the past fifty years, The Chronicles of Narnia have transcended the action and fantasy genre to become part of the canon of classic literature. Each of the seven books is a masterpiece, drawing the reader into a land where magic meets reality, and the result is a fictional world whose scope has fascinated generations. \n \n" +
                "This edition presents all seven books- unabridged- in one impressive volume. The books are presented here in chronical order, each chapter graced with an illustration by the original artist, Pauline Baynes. Deceptively simple and direct, The Chronicles of Narnia continue to captivate fans with adventures, characters, and truth that speak to readers of all ages, even fifty years after they were first published.","C.S. Lewis","1"));
        recommendedList.add(new BookDomain("The Ming Storm: Assassin’s Creed Novel", "themingstorm",315.00,"33","470","The Ming dynasty becomes a battleground for the Brotherhood of Assassins and the Order of the Templars in the blockbuster action novel from previously unexplored part of the bellowed Assassin’s Creed universe.\n" +
                "\n" +
                "China, 16th century. The Assassins are gone. Zhang Yong, the relentless leader of the Eight Tigers, took advantage of the emperor’s death to eliminate all his opponents, and now the Templars hold all the power. Shao Jun, the last representative of her clan, barely escapes death and has no choice but to flee her homeland. Vowing to avenge her former brothers in arms, she travels to Europe to train with the legendary Ezio Auditore. When she returns to the Middle Kingdom, her saber and her determination alone will not be enough to eliminate Zhang Yong: she will have to surround herself with allies and walk in the shadows to defeat the Eight Tigers.","Yan Lei Sheng","1"));
        recommendedList.add(new BookDomain("The Hidden Oracle, The Trials of Apollo- 1", "thehiddenoracle1",191.00,"17","230","How do you punish an immortal?\n \n" +
                "By making him human. \n \n" +
                "After angering his father Zeus, the god Apollo is cast down from Olympus. Weak and disoriented, he lands in New York City as a regular teenage boy. Now, without his godly powers, the four-thousand-year-old deity must learn to survive in the modern world until he can somehow find a way to regain Zeus’s favor.\n \n" +
                "But apollo has many enemies- gods, monsters and mortals who would love to see the former Olympian permanently destroyed. Apollo needs help, and he can think of only one place to go… and enclave of modern demigods known as Camp Half-Blood.","Rick Riordan","1"));
        recommendedList.add(new BookDomain("The Desecration of All Saints", "thedesecrationofallsaints",99.00,"0","99","Mackenzie August is a private detective and he's in a rut. His is a feast-or-famine profession, and seasons of mundane work are wearing him down. What he needs is a stimulating case...\n \n" +
                "Two men come to Mackenzie in secret and request his services. The leader of their church is a venerable and nationally celebrated priest, yet rumors circulate that all is not as it seems. A young clergyman, recently hired, alleges the man is really a villain in disguise. Who can be trusted, the newcomer or the respected priest?\n \n" +
                "Mackenzie is charged with discovering who is telling the truth and who is lying, and do it before the public catches wind. What he discovers, however, is far worse than anyone could've guessed...","Alan Lee","1"));
        recommendedList.add(new BookDomain("Warrior Saints- Destroyer", "warriorsaintsdestroyer",298.00,"55","662","In the growing supernatural battle between the Creator and the Destroyer, what does it cost to do the right thing? Mary, Deacon, Scout, and Ivy have identified their abilities and understand their work for the Creator. But with every new burst of strength and skill the discover, the Destroyer grows more determined to terminate their efforts. Surrounded by potential enemies who are capable of vicious acts, the Warriors must learn to trust each other and their supernatural help. When violence comes to the halls of Stonehaven Academy, the Warriors react, but who is really on their side? As evil is revealed and sneaks in to every area of their lives, how do the Warriors know what to do or who to trust- especially when the sacrifice is too great? And can they stay the course and endure the aftermath when not everyone survives the fight?","Carla Thorne","1"));
        recommendedList.add(new BookDomain("Christopher Columbus and the Lost City of Atlantis", "christophercolumbusandthelastcityofatlantis",662.00,"30","945","History remembers Christopher Columbus as a steadfast explorer who crossed the Atlantic to discover America. But what if I told you that’s not the real truth? That he was, in fact, a notorious adventurer who defied kings and gods in pursuit of a legendary treasure? Join him and his companions as they voyage to the lost city of Atlantis, where the fate of two worlds hangs in the balance.","E.J. Robinson","1"));
        recommendedList.add(new BookDomain("Escaping Conflict", "escapingconflict",276.00,"40","460","The must adapt in order to survive when the lights go out.\n \n" +
                "After leaving college, Elna Pasqualee is determined to bring her family’s California vineyard into the twenty-first century. She hopes her diligent efforts will finally earn her father’s respect and keep visitors safe and comfortable.\n \n" +
                "But all her hopes for the future are dashed with the EMP attack.\n \n" +
                "Broadcast offer only a brief warning before missile strikes wipe out all power and communications across North America. The idyllic setting on the private island quickly sours as food and water to sustain the Pasqualees and their guests grow scarce and life becomes a fight for survival. A fight further complicated when they are cut off from the mainland- and an unexpected assailant threatens their lives. \n \n" +
                "Someone is stalking one of the guests, hiding out on the island and sabotaging Elna’s desperate efforts to sustain their source of fresh water. When her father goes missing and another guest is gravely injured, remaining on the island isn’t an option. \n \n" +
                "But even if they reach the mainland, there are no longer guarantees of safety in a world where science and reason have descended into post-apocalyptic anarchy. \n \n" +
                "And Survival of the fittest reigns supreme.","Grace Hamilton","1"));
        recommendedList.add(new BookDomain("Season of Storms", "seasonofstorms",336.00,"15","395","Geralt of Rivia. A witcher whose mission is to protect ordinary people from the monsters created with magic. A mutant who has the task of killing unnatural beings. He uses a magical sign, potions and the pride of every witcher- two swords, steel and silver. But what would happen if Geralt lost his weapons? \n \n" +
                "In  this standalone novel, Geralt fights, travels and loves again, Dandelion sings and flies from trouble to trouble, sorcerers are scheming… and across the whole world clouds are gathering – the season of storms is coming…","Andrzej Sapkowski","1"));
        recommendedList.add(new BookDomain("The Revival", "therevival",585.00,"20","731","The world ended. A new one began. But who gets to choose what it looks like? After two violent years spent scavenging for food and territory while struggling to survive, an easy life in Sickness-free England has a certain appeal to Donna. Only one thing- one person- could make her want to return to the ruined chaos of New York City. And she thought he was dead. Jefferson dreamed of starting over- uniting all the warring teens and creating a Utopia. Instead, the discovery of the Cure fuels a massive power struggle in the city, and it turns out, the whole world wants a piece of the pie. With some of their own tribe in trouble, a deranged madman on the loose, and an unspeakable threat looming large, Donna and Jefferson must save not only themselves but what’s left of their world in this conclusion to The young World trilogy. Because what good is living if everything you care about is gone?","Chris Weitz","1"));
        recommendedList.add(new BookDomain("Battle on 42nd Street", "battleonfortysecondndstreet",1316.00,"37","2163","At what point does the will to survive on the battlefield give way to bloodlust? The Battle of Crete was one of the most spectacular military campaigns of the twentieth century. For the first time in history, German forces carried out an invasion entirely from the air while poorly equipped Anzac and British forces, and local Cretans, defended the island. During the campaign, one battle stands out for its viciousness. When the Germans approached the Allies defensive line- known as 42nd Street- on 27 May 1941, men from the Australian 2/7 and 2/8 Battalions, New Zealanders from several battalions, and British soldiers counter-attacked with fixed bayonets. By the end, bodies were strewn across the battlefield. Later, a German doctor reported that many of the bodies of the German soldiers had been mutilated. Acclaimed historian Peeter Monteath draws on records and recollections of Australian, New Zealand, British, and German forces and local Cretans to reveal the truth behind one of the most gruesome battles of the Second World War.","Peter Monteath","1"));
        recommendedList.add(new BookDomain("Greatest Enemy", "greatestenemy",374.00,"14","434","“Jason Kasper’s American Mercenary series boils with bold action, exotic locales, and spellbinding intrigue”. Mark Greaney, #1 NYT Bestselling author of the Gray Man Series. \n \n" +
                "David Rivers is an Army Ranger- a combat veteran of the wars in Afghanistan and Iraq. He has almost completed his final year at West Point when his world is turned upside down by a sudden discharge from military service. Angry and confused, David soon hits rock bottom. \n \n" +
                "And that’s when they appear. \n \n" +
                "Three mysterious men. Men who know David’s dark secret- they know that he has murdered someone in cold blood. \n \n" +
                "And they wat him to do it again.","Carla Thorne","1"));
        recommendedList.add(new BookDomain("Neptune Island", "neptuneisland",3230.00,"5","3400","","Carla Thorne","1"));

        // Add more recommended items here
        return recommendedList;
    }
}
