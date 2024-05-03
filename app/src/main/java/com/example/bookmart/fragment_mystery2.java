package com.example.bookmart;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class fragment_mystery2 extends Fragment {
    private RecyclerView recyclerViewCategoryList;
    private ExploreCategoryAdapter adapter;

    public fragment_mystery2() {
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
        recommendedList.add(new BookDomain("To Forge a Hollow Crown", "toforgeahollowcrown",160.0,"60","399","\"In the shadow of the throne, desire knows no bounds. \"From the moment I united the rebels with Theron's formidable warriors, our combined forces have been on a collision course with destiny, all roads leading to Athain. But with every step towards confronting Theron's formidable mother, Empress Nyana, it feels like the universe is testing our love.\n" +
                "\n" +
                "While many in our makeshift army may disapprove of our union, nothing can quell the burning passion between Theron and me. But the challenges we face aren't just from foes. The treacherous desert hides creatures of legend, shadows of our past, and even another elven warrior who, with her own aspirations for the throne, stands between us and our dream of a free world.\n" +
                "\n" +
                "Can our love survive the myriad forces working to pull us apart? Or will the empire's weight prove too much, threatening to tear us apart forever?\n" +
                "\n" +
                "Content To Forge a Hollow Crown is a dark and steamy read recommended for readers 18+ due to explicit language, violence, and sexual situations. To Forge a Hollow Crown is the final installment in the Sands of Maeoris series.","Atley Wikes","1"));
        recommendedList.add(new BookDomain("In His Hands", "inhishands",95.00,"25","126","Consent is everything...and with consent, everything is possible.\n" +
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
        recommendedList.add(new BookDomain("Midnight Rider", "midnightrider",245.00,"44","436","Savor the magic of New York Times bestselling author Diana Palmer in a dazzlingly sensual story of turn-of-the-century Texas, of a man as enigmatic and forbidding as the sun-drenched land-and the woman who dares to cross into the uncharted territory of his heart.\n" +
                "\n" +
                "To Bernadette Barron, Eduardo Cortes was the enemy. A noble count with a sprawling ranch in the grand state of Texas, Cortes challenged her with dark, penetrating eyes that seemed to pierce her very soul. Could he see the burning truth: that she loved him? It is a secret Bernadette vows to keep-- especially now that she is to become his wife. For theirs is a marriage bargain, pure and simple. He needs a rich wife to save his ranch; she needs a titled husband.\n" +
                "\n" +
                "Yet desire will turn a marriage of convenience into a passionate battle of wills, and change an innocent girl into a woman aware of her own powers of attraction. For it is love's fiery initiation that will make Bernadette aware of her own capacity for pleasure as well as her husband's skill at providing it. And it is the sheer force of her own love that will give her newfound strength to battle against the odds to claim a man and a love she will not be denied...","Diana Palmer","1"));
        recommendedList.add(new BookDomain("Once Upon a Dream", "onceuponadream",118.00,"16","140","Lush. Evocative. Romantic. Enter the sensual world of modern day fairy tales with three novellas by USA Today bestselling author Sierra Simone.\n" +
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
        recommendedList.add(new BookDomain("Pop Tarts and Mistletoe", "poptartsandmistletoe",200.00,"20","250","Being stuck at the airport wasn't part of my holiday plans.I was on my way to stay with my best friend and his family for the holidays when a freak snowstorm hit. Now I'm stuck, all planes are grounded, and there are no hotel rooms available. I also have no clue of when I'd be able to get on another plane, so here I sit. Then I saw her. She stood in front of a vending machine, scrounging through her purse. When she found her last bit of change, she carefully made her selection. A disappointed look came over her face and she began to punch and kick the vending machine trying to get whatever she'd selected to drop. When it did, she threw her hands in the air as if she'd just made the winning touchdown. Then she bent down and pulled out a package of pop tarts. Pop tarts? Who buys pop tarts from a vending machine? She was feisty and cute, and I knew I needed to meet her. So, I invited her to sit with me. The night passed quickly, with flights heading out the next morning. It was then I realized I'd missed an opportunity as I watched her disappear into the airport crowd. However, Father Christmas smiled down on me once again when I discovered that the beautiful holiday angel, I'd met earlier was my best friends sister, and I only had a few days to make her mine.","S.L. Sterling","1"));
        recommendedList.add(new BookDomain("All That We Are Together", "allthatwearetogether",81.00,"10","90","Three years without even seeing him. Three years without Axel.\n" +
                "\n" +
                "How do you move on from a broken heart?\n" +
                "\n" +
                "Three years have passed since Axel Nguyen shattered Leah Jones' heart into a million pieces, and Leah has spent every moment of those three years distracting herself from the devastation. She tries to move on with Landon, a guy she meets in college, but she can only truly escape thoughts of Axel when she's painting. At least one good thing has come out of all of it: her dream of exhibiting her work is finally coming true.\n" +
                "\n" +
                "Axel is achingly aware every day of how much he misses Leah. The moment he learns about Leah's exhibit, Axel can't think about anything else but to go see her. Being in the same room with Leah, as beautiful and magnetic as he remembers, leaves Axel desperate and Leah breathless in his presence. He offers to be her agent; she accepts. One work trip to Paris later leaves Leah and Axel full of pent-up attraction and wondering if their whirlwind romance is a forever kind of love or if it's better off left in the past.\n" +
                "\n" +
                "International bestselling author Alice Kellen concludes her emotional new adult duology with an evocative and passionate love story for readers of Colleen Hoover, Anna Todd, and books to make you ugly cry.","Allice Kellen","1"));
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
