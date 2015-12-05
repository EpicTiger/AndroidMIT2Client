package com.example.rainer.mit2client;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Adapters.ArticleAdapter;
import Entities.Article;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.content_home_screen, container, false);
        //initializeData(view);

        List<Article> list = inititalizeItemList();
        setAndFillListAdapter(list, view);

        return view;
    }

    private List<Article> inititalizeItemList() {
        List<Article> articles = new ArrayList<>();

        Article article = new Article();
        article.setTitle("IS claimt betrokkenheid bij schietpartij Californië");
        article.setText("De man en vrouw (Syed Rizwan Farook en Tashfeen Malik) die deze week een bloedbad aanrichtten in het Amerikaanse San Bernardino, waren aanhangers van Islamitische Staat (IS).\n" +
                "Dat heeft de terreurorganisatie zaterdag gemeld in een radioboodschap die via internet is uitgezonden.\n" +
                "\n" +
                "Eerder werd al wel een link gelegd tussen de schietpartij en IS, maar was niet zeker of de twee schutters aanhangers van de terreurgroep waren.\n" +
                "\n" +
                "Zo zou een van de daders \"enige vorm van contact'' hebben gehad met zeker twee terreurgroepen. Het gaat om al-Shabaab en het al-Nusra Front, zei een veiligheidsfunctionaris vrijdag (lokale tijd) tegen de Los Angeles Times.\n" +
                "\n" +
                "Het is nog onduidelijk hoe schutter Syed Rizwan Farook contact zou hebben gehad met de extremistische organisaties. De andere dader, Tashfeen Malik, zou op Facebook trouw hebben gezworen aan IS.");

        Article article1 = new Article();
        article1.setTitle("Harde zuidwestenwind op pakjesavond ");
        article1.setText("Zaterdagavond moet rekening gehouden worden met harde wind. In het Waddengebied zou tijdelijk een stormkracht bereikt kunnen worden. Daarbij is kans op zware windstoten tot maximaal 100 kilometer per uur.\n" +
                "\u200BEr staat volgens weerbureau weeronline.nl op pakjesavond een stevige zuidwestenwind.\n" +
                "\n" +
                "De zuidwestenwind voert zeer zachte lucht aan waardoor het tussen de 9 en 11 graden wordt. Zondag, maandag en dinsdag wordt het met temperaturen tussen de 11 en 13 graden iets warmer. Ook de nachten verlopen bijzonder zacht met minima rond 8 graden.\n" +
                "\n" +
                "Na het weekend blijft volgens weeronline.nl het winterweer voorlopig ver weg. Het is wisselvallig met af en toe regen en tussendoor een droge dag. Soms waait het opnieuw stevig. Maandag en dinsdag blijft het zeer zacht met maxima rond 12 graden. Daarna daalt de middagtemperatuur beneden 10 graden.");

        Article article2 = new Article();
        article2.setTitle("Twee daders aanslag Caïro opgepakt door Egyptische politie ");
        article2.setText("De Egyptische politie heeft twee jonge mannen aangehouden voor de aanslag op een restaurant in de hoofdstad Caïro.\n" +
                "Dat heeft het ministerie van Binnenlandse Zaken zaterdag gemeld.\n" +
                "\n" +
                "De mannen, van 18 en 19 jaar oud, hebben bekend dat ze vrijdag molotovcocktails naar het restaurant hebben gegooid, omdat ze daar eerder als klant waren geweigerd.\n" +
                "\n" +
                "Na de aanslag vluchtte het duo naar Suez aan de Rode Zee. Daar werden ze opgepakt. Het restaurant brandde helemaal uit. Zestien mensen kwamen om het leven.");

        Article article3 = new Article();
        article3.setTitle("'Ook Nederlandse sportmarketeer schuldig aan corruptie binnen FIFA' ");
        article3.setText("De Nederlandse sportmarketeer George Taylor was volgens een vroegere medewerker van zijn bedrijf, ISE, betrokken bij de illegale handel in toegangskaarten voor het WK voetbal van 2006 in Duitsland\n" +
                "Dat meldt NRC Handelsblad zaterdag. ISE zou bijna 8.600 tickets op de zwarte markt hebben gebracht, met een totale waarde van twintig miljoen euro.\n" +
                "\n" +
                "Ook zou Taylor op de hoogte zijn geweest van een afspraak om FIFA-voorzitter Sepp Blatter twee miljoen euro smeergeld te bezorgen. Blatter wordt zelf half december gehoord door de ethische commissie van de FIFA. \n" +
                "\n" +
                "De beschuldigingen richting Taylor komen van Benny Alon, een Israëlische oud-profvoetballer en eigenaar van marketingbureau JB Sports Marketing. Hij heeft onderzoek gedaan naar de illegale kaartverkoop voor het WK.\n" +
                "\n" +
                "Taylor heeft per mail laten weten ''geen concrete wetenschap te hebben van de feiten die aan de beschuldigingen ten grondslag liggen\".");

        articles.add(article);
        articles.add(article1);
        articles.add(article2);
        articles.add(article3);

        return articles;
    }

    private void setAndFillListAdapter(List<Article> list, View view) {
        ArticleAdapter adapter = new ArticleAdapter(getActivity(), R.layout.content_home_screen, list);
        ListView listView = (ListView) view.findViewById(R.id.homescreen_listview_artical);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });
    }

//    private void initializeData(View view) {
//
//        TextView fullname = (TextView) view.findViewById(R.id.homescreen_textview_fullname);
//
//        fullname.setText(User.Fullname);
//    }
}
