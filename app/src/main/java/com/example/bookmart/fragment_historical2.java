package com.example.bookmart;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class fragment_historical2 extends Fragment {
    private RecyclerView recyclerViewCategoryList;
    private ExploreCategoryAdapter adapter;

    public fragment_historical2() {
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
        recommendedList.add(new BookDomain("Empire of Ice and Stone", "empireoficeandstone",639.0,"20","799","Empire of Ice and Stone: The Disastrous and Heroic Voyage of the Karluk\n" +
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
        recommendedList.add(new BookDomain("Into Siberia", "intosiberia",405.0,"25","540","Into Siberia: George Kennan's Epic Journey Through the Brutal, Frozen Heart of Russia\n" +
                "\n" +
                "In the late nineteenth century, close diplomatic relations existed between the United States and Russia. All that changed when George Kennan went to Siberia in 1885 to investigate the exile system and his eyes were opened to the brutality Russia was wielding to suppress dissent.\n" +
                "\n" +
                "Over ten months Kennan traveled eight thousand miles, mostly in horse-drawn carriages, sleighs or on horseback. He endured suffocating sandstorms in the summer and blizzards in the winter. His interviews with convicts and political exiles revealed how Russia ran on the fuel of inflicted pain and fear. Prisoners in the mines were chained day and night to their wheelbarrows as punishment. Babies in exile parties froze to death in their mothers' arms. Kennan came to call the exiles' experience in Siberia a \"perfect hell of misery.\"\n" +
                "\n" +
                "After returning to the United States, Kennan set out to generate public outrage over the plight of the exiles, writing the renowned Siberia and the Exile System. He then went on a nine-year lecture tour to describe the suffering of the Siberian exiles, intensifying the newly emerging diplomatic conflicts between the two countries which last to this day. In a book that ranks with the greatest adventure stories, Gregory Wallance's Into Siberia is a thrilling work of history about one man's harrowing journey and the light it shone on some of history's most heinous human rights abuses.\n","Gregory J. Wallance","1"));
        recommendedList.add(new BookDomain("A History of Crime and American Criminal Justice System", "ahistoryofcrimeandamericancriminaljusticesystem",294.0,"40","489","This book offers a history of crime and the criminal justice system in America, written particularly for students of criminal justice and those interested in the history of crime and punishment. It follows the evolution of the criminal justice system chronologically and, when necessary, offers parallels between related criminal justice issues in different historical eras. From its antecedents in England to revolutionary times, to the American Civil War, right through the twentieth century to the age of terrorism, this book combines a wealth of resources with keen historical judgement to offer a fascinating account of the development of criminal justice in America. A new chapter brings the story up to date, looking at criminal justice through the Obama era and the early days of the Trump administration.\n" +
                "\n" +
                "Each chapter is broken down into four crucial components related to the American criminal justice system from the historical lawmakers and the judiciary; law enforcement; corrections; and crime and punishment. A range of pedagogical features, including timelines of key events, learning objectives, critical thinking questions and sources, as well as a full glossary of key terms and a Who's Who in Criminal Justice History, ensures that readers are well-equipped to navigate the immense body of knowledge related to criminal justice history.\n" +
                "\n" +
                "Essential reading for Criminal Justice majors and historians alike, this book will be a fascinating text for anyone interested in the development of the American criminal justice system from ancient times to the present day.\n","Mitchel P. Roth","1"));
        recommendedList.add(new BookDomain("Wrath Becomes Her", "wrathbecomesher",400.00,"80","2000","Frankenstein meets Inglourious Basterds in this stunning Jewish historical horror novel from the award-winning author of The City Beautiful\n" +
                "\n" +
                "Vera was made for vengeance.\n" +
                "\n" +
                "Lithuania, 1943. A father drowns in the all- consuming grief of a daughter killed by the Nazis. He can't bring Chaya back from the dead, but he can use kishuf an ancient and profane magic - to create a golem in her image. A Nazi killer, to avenge her death.\n" +
                "\n" +
                "When Vera awakens, she can feel her violent purpose thrumming within her. But she can also feel glimpses of a human life lived, of stolen kisses amidst the tragedy, and of a grisly death. And when she meets Akiva, she recognizes the boy with soft lips that gave warm kisses. But these memories aren't hers, and Vera doesn't know if she gets-or deserves to have a life beyond what she was made for.\n" +
                "\n" +
                "Vera's strength feels limitless-until she learns that there are others who would channel kishuf for means far less noble than avenging a daughter's death. As she confronts the very basest of humanity, Vera will need more than what her creator gave Not just a reason to fight, but a reason to live.","Aden Polydoros","1"));
        recommendedList.add(new BookDomain("A History of Crime and American Criminal Justice System", "ahistoryofcrimeandamericancriminaljusticesystem",294.0,"40","489","This book offers a history of crime and the criminal justice system in America, written particularly for students of criminal justice and those interested in the history of crime and punishment. It follows the evolution of the criminal justice system chronologically and, when necessary, offers parallels between related criminal justice issues in different historical eras. From its antecedents in England to revolutionary times, to the American Civil War, right through the twentieth century to the age of terrorism, this book combines a wealth of resources with keen historical judgement to offer a fascinating account of the development of criminal justice in America. A new chapter brings the story up to date, looking at criminal justice through the Obama era and the early days of the Trump administration.\n" +
                "\n" +
                "Each chapter is broken down into four crucial components related to the American criminal justice system from the historical lawmakers and the judiciary; law enforcement; corrections; and crime and punishment. A range of pedagogical features, including timelines of key events, learning objectives, critical thinking questions and sources, as well as a full glossary of key terms and a Who's Who in Criminal Justice History, ensures that readers are well-equipped to navigate the immense body of knowledge related to criminal justice history.\n" +
                "\n" +
                "Essential reading for Criminal Justice majors and historians alike, this book will be a fascinating text for anyone interested in the development of the American criminal justice system from ancient times to the present day.\n","Mitchel P. Roth","1"));
        recommendedList.add(new BookDomain("No Child of Mine", "nochildofmine",133.0,"50","266","There's something in the dark. And it's starting to whisper...\n" +
                "\n" +
                "Essie Kaur has defined herself by her ambitions, a fiercely independent woman whose only soft spot is her husband, Sanjay. She never imagined herself as a mother. It was never a part of the plan. But then she finds out she's pregnant. As her difficult pregnancy transforms her body and life into something she barely recognizes, her husband spends the nights pacing in the attic, slowly becoming a stranger, and the house begins to whisper.\n" +
                "\n" +
                "As Essie's pregnancy progresses, both her and Sanjay's lives are warped by a curse that has haunted her family for generations, leaving a string of fatherless daughters in its wake. When she's put on bedrest, Essie trades the last aspects of her carefully planned life for isolation in what should be a welcoming home, but she isn't alone. There's something here that means to take everything from her...","Nichelle Giraldes","1"));
        recommendedList.add(new BookDomain("A Modern Legal History of Treasure", "amodernleganhistoryoftreasure",210.0,"40","350","This book examines treasure law and practice from the rise of the new science of archaeology in the early Victorian period to the present day. Drawing on largely-unexamined state records and other archives, the book covers several legal England and Wales, Scotland, Ireland pre- and post-independence, and post-partition Northern Ireland. From the Mold gold cape (1833) to the Broighter hoard (1896), from Sutton Hoo (1939) to the Galloway hoard (2014), the law of treasure trove, and the Treasure Act 1996, are considered through the prism of notable archaeological discoveries, and from the perspectives of finders, landowners, archaeologists, museum professionals, collectors, the state, and the public. Literally and metaphorically, treasure law is revealed as a ground-breaking chapter in the history of the legal protection of cultural property and cultural heritage in Britain and Ireland.","N.M. Dawson","1"));


        // Add more recommended items here
        return recommendedList;
    }
}
