package day31_Constructors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {

        Offer offer1=new Offer();
        offer1.setInfo("VA","Amazon",
                "SDET",120000,true,true,true,true);
        System.out.println(offer1);

        Offer offer2=new Offer();
        offer2.setInfo("California","Sony","QA",120000,
                true,false,false,true);
        System.out.println(offer2);

        Offer offer3=new Offer();
        offer3.setInfo("Florida","Apple","QA",125000,
                true,true,true,false);
        System.out.println(offer3);

        Offer offer4=new Offer();
        offer4.setInfo("TX","CapitalOne",
                "SM",112000,false,false,true,true);
        System.out.println(offer4);

        Offer offer5=new Offer();
        offer5.setInfo("WA","Bank Of America","BA",150000,
                true,true,false,true);

        System.out.println(offer5);
        System.out.println("-------------------------------------------------------");

        Offer[] myOffers={offer1,offer2,offer3,offer4,offer5};
        ArrayList<Offer> fullTimeOffers= new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime); // removes if the offer is not full time;
        System.out.println("fullTimeOffers = " + fullTimeOffers.size());

        ArrayList<Offer>localOffers= new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("VA")); //removes the offer if the offer is not from Virginia
        System.out.println("localOffers = " + localOffers.size());


        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName+" : "+localOffer.salary);
        }

    }
}
