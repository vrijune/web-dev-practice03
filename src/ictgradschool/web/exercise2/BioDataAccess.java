package ictgradschool.web.exercise2;

import java.util.ArrayList;
import java.util.List;

public class BioDataAccess {

    public List<Biography> getBiographies(){
        ArrayList<Biography> biographies = new ArrayList();

        biographies.add(new Biography("Bill Gates", "William Henry Gates III is an American business magnate, software developer, and philanthropist. He is best known as the co-founder of Microsoft Corporation.", 65));
        biographies.add(new Biography("Mark Zuckerberg", "Mark Elliot Zuckerberg is an American media magnate, internet entrepreneur, and philanthropist. He is known for co-founding Facebook, Inc. and serves as its chairman, chief executive officer, and controlling shareholder.",36));
        biographies.add(new Biography("Jeff Bezos","Jeffrey Preston Bezos is an American internet entrepreneur, industrialist, media proprietor, and investor. He is best known as the founder, CEO, and president of the multi-national technology company Amazon.",56));
        biographies.add(new Biography("Elon Musk","Elon Reeve Musk FRS is a business magnate, industrial designer and engineer. He is the founder, CEO, CTO and chief designer of SpaceX; early investor, CEO and product architect of Tesla, Inc.",49));

        return biographies;
    }

}
