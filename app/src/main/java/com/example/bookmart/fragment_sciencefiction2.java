package com.example.bookmart;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class fragment_sciencefiction2 extends Fragment {
    private RecyclerView recyclerViewCategoryList;
    private ExploreCategoryAdapter adapter;

    public fragment_sciencefiction2() {
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

        recommendedList.add(new BookDomain("The Treeline", "thetreeline",240.00,"20","300","The Treeline: The Last Forest and the Future of Life on Earth\n" +
                "\n" +
                "In the tradition of Elizabeth Kolbert and Barry Lopez, a powerful, poetic and deeply absorbing account of the \"lung\" at the top of the world.\n" +
                "\n" +
                "For the last fifty years, the trees of the boreal forest have been moving north. Ben Rawlence's The Treeline takes us along this critical frontier of our warming planet from Norway to Siberia, Alaska to Greenland, to meet the scientists, residents and trees confronting huge geological changes. Only the hardest species survive at these latitudes including the ice-loving Dahurian larch of Siberia, the antiseptic Spruce that purifies our atmosphere, the Downy birch conquering Scandinavia, the healing Balsam poplar that Native Americans use as a cure- all and the noble Scots Pine that lives longer when surrounded by its family.\n" +
                "\n" +
                "It is a journey of wonder and awe at the incredible creativity and resilience of these species and the mysterious workings of the forest upon which we rely for the air we breathe. Blending reportage with the latest science, The Treeline is a story of what might soon be the last forest left and what that means for the future of all life on earth.\n","Ben Rawlence","1"));
        recommendedList.add(new BookDomain("Into Siberia", "intosiberia",405.0,"25","540","Into Siberia: George Kennan's Epic Journey Through the Brutal, Frozen Heart of Russia\n" +
                "\n" +
                "In the late nineteenth century, close diplomatic relations existed between the United States and Russia. All that changed when George Kennan went to Siberia in 1885 to investigate the exile system and his eyes were opened to the brutality Russia was wielding to suppress dissent.\n" +
                "\n" +
                "Over ten months Kennan traveled eight thousand miles, mostly in horse-drawn carriages, sleighs or on horseback. He endured suffocating sandstorms in the summer and blizzards in the winter. His interviews with convicts and political exiles revealed how Russia ran on the fuel of inflicted pain and fear. Prisoners in the mines were chained day and night to their wheelbarrows as punishment. Babies in exile parties froze to death in their mothers' arms. Kennan came to call the exiles' experience in Siberia a \"perfect hell of misery.\"\n" +
                "\n" +
                "After returning to the United States, Kennan set out to generate public outrage over the plight of the exiles, writing the renowned Siberia and the Exile System. He then went on a nine-year lecture tour to describe the suffering of the Siberian exiles, intensifying the newly emerging diplomatic conflicts between the two countries which last to this day. In a book that ranks with the greatest adventure stories, Gregory Wallance's Into Siberia is a thrilling work of history about one man's harrowing journey and the light it shone on some of history's most heinous human rights abuses.\n","Gregory J. Wallance","1"));
        recommendedList.add(new BookDomain("The Chronicles of Narnia", "thechroniclesofnarnia",146.00,"10","162","Journeys to the end of the world, fantastic creatures, and epic battles between good and evil- what more could any reader ask for in one book? The book that has it all is The Lion, The Witch and The Wardrobe, written in 1949 by Clive Staples Lewis. But Lewis did not stop there. Six more books followed, and together the became known as The Chronicles of Narnia. \n \n" +
                "For the past fifty years, The Chronicles of Narnia have transcended the action and fantasy genre to become part of the canon of classic literature. Each of the seven books is a masterpiece, drawing the reader into a land where magic meets reality, and the result is a fictional world whose scope has fascinated generations. \n \n" +
                "This edition presents all seven books- unabridged- in one impressive volume. The books are presented here in chronical order, each chapter graced with an illustration by the original artist, Pauline Baynes. Deceptively simple and direct, The Chronicles of Narnia continue to captivate fans with adventures, characters, and truth that speak to readers of all ages, even fifty years after they were first published.","C.S. Lewis","1"));
        recommendedList.add(new BookDomain("The Hidden Oracle, The Trials of Apollo- 1", "thehiddenoracle1",191.00,"17","230","How do you punish an immortal?\n \n" +
                "By making him human. \n \n" +
                "After angering his father Zeus, the god Apollo is cast down from Olympus. Weak and disoriented, he lands in New York City as a regular teenage boy. Now, without his godly powers, the four-thousand-year-old deity must learn to survive in the modern world until he can somehow find a way to regain Zeus’s favor.\n \n" +
                "But apollo has many enemies- gods, monsters and mortals who would love to see the former Olympian permanently destroyed. Apollo needs help, and he can think of only one place to go… and enclave of modern demigods known as Camp Half-Blood.","Rick Riordan","1"));
        recommendedList.add(new BookDomain("Neptune Island", "neptuneisland",3230.00,"5","3400","","Carla Thorne","1"));
        recommendedList.add(new BookDomain("Christopher Columbus and the Lost City of Atlantis", "christophercolumbusandthelastcityofatlantis",662.00,"30","945","History remembers Christopher Columbus as a steadfast explorer who crossed the Atlantic to discover America. But what if I told you that’s not the real truth? That he was, in fact, a notorious adventurer who defied kings and gods in pursuit of a legendary treasure? Join him and his companions as they voyage to the lost city of Atlantis, where the fate of two worlds hangs in the balance.","E.J. Robinson","1"));
        recommendedList.add(new BookDomain("Midnight is the Darkest Hour", "midnightisthedarkesthour",639.0,"20","799","From the critically acclaimed author of In My Dreams I Hold A Knife and The Last Housewife comes a gothic Southern thriller about a killer haunting a small Louisiana town, where two outcasts-the preacher's daughter and the boy from the wrong side of the tracks-hold the key to uncovering the truth.\n" +
                "\n" +
                "For fans of Verity and A Flicker in the Dark, this is a twisted tale of murder, obsessive love, and the beastly urges that lie dormant within us all...even the God-fearing folk of Bottom Springs, Louisiana. In her small hometown, librarian Ruth Cornier has always felt like an outsider, even as her beloved father rains fire-and-brimstone warnings from the pulpit at Holy Fire Baptist.\n" +
                "\n" +
                "Unfortunately for Ruth, the only things the townspeople fear more than the God and the Devil are the myths that haunt the area, like the story of the Low Man, a vampiric figure said to steal into sinners' bedrooms and kill them on moonless nights. When a skull is found deep in the swamp next to mysterious carved symbols, Bottom Springs is thrown into uproar-and Ruth realizes only she and Everett, an old friend with a dark past, have the power to comb the town's secret underbelly in search of true evil.\n" +
                "\n" +
                "A dark and powerful novel like fans have come to expect from Ashley Winstead, Midnight is the Darkest Hour is an examination of the ways we've come to expect love, religion, and stories to save us, the lengths we have to go to in order to take back power, and the monstrous work of being a girl in this world.","Ashley Winstead","1"));
        recommendedList.add(new BookDomain("The Cruel Dark", "thecrueldark",405.0,"25","540","Millicent Foxboro is haunted.\n" +
                "\n" +
                "Not by ghosts but by the anguish of her past and the uncertainty of her future. After all, even in the progressive year of 1928, most people would balk at hiring a woman who'd spent two months in a mental ward for traumatic amnesia. So when an uncommon assistantship to a reclusive Professor of mythology falls into her lap with an ungodly salary attached, her desperation for stability overrides her cautious nature.\n" +
                "\n" +
                "To Millie's dismay, the widowed Professor Callum Hughes and his estate, Willowfield, are more than she bargained for. The once magnificent home, known for its sprawling gardens and dazzling parties, is falling to pieces after the death of the professor's fragile wife. What's more, the staff has been reduced to the only three people not frightened away by rumors of ghosts, leaving the halls empty and languishing in bitter memories.\n" +
                "\n" +
                "The professor himself is a grim, intense man with unclear expectations, unpredictable moods, and hungry eyes that ignite Millie's own dormant passions. The closer she finds herself drawn to Professor Hughes and his strange world of flowers and folklore, the more the house closes in, threatening to reveal her secrets. But the professor is keeping secrets of his own and the most dangerous of all is hers to discover.","Bea Northwick","1"));


        // Add more recommended items here
        return recommendedList;
    }
}
