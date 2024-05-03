package com.example.bookmart;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class fragment_romance2 extends Fragment {
    private RecyclerView recyclerViewCategoryList;
    private ExploreCategoryAdapter adapter;

    public fragment_romance2() {
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
        recommendedList.add(new BookDomain("Beauty Found", "beautyfound",540.00,"10","600","EVEN IN HELL, THERE IS BEAUTY TO BE FOUND.\n" +
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
        recommendedList.add(new BookDomain("Bonded Beyond Lies", "bondedbeyondlies",143.00,"3","148","There are moments in time you wish to capture and keep. Others you wish you could forget forever- moments when your life irrecoverably changes. You hope it's a change for the better, but I haven't found that to be true.\n" +
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
        recommendedList.add(new BookDomain("Feast", "feast",147.00,"30","210","Poor Spence-all he wanted to do was fly to Vegas, walk his mother down the aisle, and get back to his shop. Until a very attractive seatmate on the plane has him adjusting his plans to make time for some anonymous stranger sex.\n" +
                "\n" +
                "It's just his bad luck that his anonymous stranger turns out to be his new stepsister.\n" +
                "\n" +
                "When Maddie realizes she's just spent two days banging her new stepbrother, her first reaction is to laugh. Her second is to wish she could do it again. It was very memorable banging, and the prospect of not doing it anymore is a bleak one. Still, she can keep things sibling-like if Spence can.\n" +
                "\n" +
                "Lucky for her, Spence is just as eager as she is to pick up where they left off in Vegas, on the condition they keep it just between them. Telling the family will only make things complicated, after all. And that's fine with Maddie-until she realizes she's falling in love with a man who seems content for her to stay his dirty little secret.\n" +
                "\n" +
                "Dirty she's fine with. A secret? That's a deal breaker.","Hannah Murray","1"));
        recommendedList.add(new BookDomain("Four Fireman For Christmas", "fourfiremanforchristmas",125.00,"12","142","Four Firemen For Christmas: A Reverse Harem, Pregnancy Romance\n" +
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
        recommendedList.add(new BookDomain("Candy Cam", "candycam",291.00,"38","469","The nerd.\n" +
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
        recommendedList.add(new BookDomain("Finding Elizabeth", "findingelizabeth",270.00,"10","300","Hey, can you help us? My name's Grinder, and these are my friends, Nova and Bats. We screwed up. * Ahem * Okay, yes. I screwed up. You see, we met this incredible woman at the start of the trail. She's smart, beautiful, and fun. She loves science, she's everything each of us could want in a partner, and she makes the whole trail bright and sunny, even on a rainy day. Like Nova says, she's our nachos. I know, but I swear it makes sense. It took a bit, but we realized what we all wanted, and what we want is belong to Elizabeth Dawson. Of course, then I had to go and screw everything up. I was supposed to talk to her, and well, we got a little sidetracked. When I woke up, she was gone. She ran away thinking she did something she can't take back. Now we're out here looking for her. We need to find her and let her know everything is alright. That we want to be her guys if she's willing to give us a shot. Thing is, it's a big trail and she could be anywhere. Which is why we need you. So how about it? Can you help us find Elizabeth?\n" +
                "\n" +
                "Finding Elizabeth is the third book of the Trail Magic series, a contemporary reverse harem romance set along the Pacific Crest Trail. Grinder, Nova, and Bats continue their five-month trek from the Mexican border to British Columbia, determined to find Belle before they lose her for good. It's full of laughs, coffee, cheeseburgers, and chances for four young adults to figure out who they are and what they want.","Chris Mor","1"));
        recommendedList.add(new BookDomain("Twisted Obsession", "twistedobsession",102.00,"38","163","Twisted Obsession, Hockey Gods\n" +
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
        recommendedList.add(new BookDomain("Indecent Book Club", "indecentbookclub",60.00,"15","70","Indecent Book Club: Freed\n" +
                "\n" +
                "It's all been building to this moment. The decision that will define Derek's entire life. Will he turn left... or right...A meet has been set to deliver the money, but Derek unravels the final strands of the mystery from the most unlikely of His mother. Answers will lead to more questions. It's a good thing the next Book Club meeting is this weekend. They are always so informative. Derek's heart and mind will have to work together if he is to find his way through. Get This Book and find out what kind of man Derek has become in the Eighth and final Book of the Indecent Book series!","Raven Black","1"));
        recommendedList.add(new BookDomain("One More Night", "onemorenight",323.00,"30","461","Your presence is requested for another installment in the tale of Julia and Clay, two red-hot lovers. Come inside their world of passion and suspense once more for a deliciously erotic and heart- poundingly dangerous story of pearls, handcuffs, thieves, mobsters, poker and pleasure in the city of sin...\n" +
                "\n" +
                "Happy endings don't come easily. They're hard-won and Clay Nichols is going to have to keep earning his...Now living together in New York with her debt safely paid off, sexy bartender Julia Bell and hot-as- hell entertainment lawyer Clay thought their future was clear sailing.\n" +
                "\n" +
                "But life doesn't work that way and the fiery lovers run into a slew of new challenges as Clay tries to put a ring on it. Trouble looms in every corner-trouble from clients, trouble with timing, and, most of all, trouble from her past returns on their trip to Vegas. A dangerous man who knows much more about Julia than he should surfaces in Sin City where they're supposed to be enjoying a weekend getaway. Following her in the casino, watching her every move at the pool, targeting her as she plays poker.\n" +
                "\n" +
                "Too bad Clay is called away repeatedly, leaving Julia alone in a sprawling hotel full of dark corners, back rooms, and unsavory characters. Can Clay save her from danger one more time, and then finally get down on one knee? Or will he be too late for the woman he adores?\n" +
                "\n" +
                "Note: While this can be read as a standalone, you will likely enjoy it much more if you read the two novels that precede it.","Lauren Blakely","1"));



        // Add more recommended items here
        return recommendedList;
    }
}
