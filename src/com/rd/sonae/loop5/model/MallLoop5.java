package com.rd.sonae.loop5.model;

import com.rd.sonae.R;
import com.rd.sonae.fragment.*;
import com.rd.sonae.loop5.theme.ThemeLoop5;
import com.rd.sonae.model.DirectionsType;
import com.rd.sonae.model.Mall;
import com.rd.sonae.model.MallUID;
import com.rd.sonae.ui.UITabBar;

public class MallLoop5 extends Mall {

    public MallLoop5() {
        super(2, 0, R.string.mall_name, ThemeLoop5.class);

        address = "Loop 5, Gutenbergstraße 5, 64331 Weiterstadt";

        // Welcome screen has video or image?
        welcomeHasVideo = true;
        videoURL = "http://www.rd-agency.com/work/sonae_app/ios/loop5/video_promo_loop5_2pass.mp4";

        /* Voucher with links */
        mMallUID = MallUID.LOOP5;

        //has only german
        onlyOneLang = true;
        lang1 = "de";


         /* Lost & Found */
        lostFoundPhone = "06151-6674 640";
        lostFoundEmail = "customercareloop5@sonaesierra.com";

        /* Social Channels */
        socialChannels.put(SocialChannel.Facebook, "http://www.facebook.com/LOOP5");

        /* Mall Menu Items */
        menuItems.add(new MenuItem(R.drawable.icon_welcome, R.string.welcome, FRWelcome.class));
        menuItems.add(new MenuItem(R.drawable.icon_directions, R.string.directions, FRDirections.class));
        menuItems.add(new MenuItem(R.drawable.icon_services, R.string.services, FRServices.class));
        //menuItems.add(new Mall.MenuItem(R.drawable.icon_childcare, R.string.childcare, FRChildCare.class));
        menuItems.add(new MenuItem(R.drawable.icon_centrerules, R.string.centreRules, FRCentreRules.class));
        menuItems.add(new MenuItem(R.drawable.icon_lostfound, R.string.lostFound, FRLostFound.class));

        /* Services Menu Items */
        services.add(new Service(R.drawable.icon_mall_info, R.string.information, R.string.informationDescription));

        services.add(new Service(R.drawable.icon_pharmacy, R.string.pharmacy, R.string.pharmacyDescription));
        services.add(new Service(R.drawable.icon_childcare, R.string.diaperChanging, R.string.diaperDescription));
        services.add(new Service(R.drawable.icon_bottle_warmer, R.string.bottleWarmer, R.string.bottleWarmerDescription));
        services.add(new Service(R.drawable.icon_park_handicap, R.string.parkHandicap, R.string.parkHandicapDescription));
        services.add(new Service(R.drawable.icon_park_women, R.string.parkWomen, R.string.parkWomenDescription));
        services.add(new Service(R.drawable.icon_atm, R.string.atm, R.string.atmDescription));
        services.add(new Service(R.drawable.icon_children_chair, R.string.childrenChair, R.string.childrenChairDescription));
        services.add(new Service(R.drawable.icon_childrenwc, R.string.childrenWC, R.string.childrenWCDescription));
        services.add(new Service(R.drawable.icon_giftvouchers, R.string.giftVouchers, R.string.giftVouchersDescription));
        services.add(new Service(R.drawable.icon_park_family, R.string.parkFamily, R.string.parkFamilyDescription));
        services.add(new Service(R.drawable.parking, R.string.parking, R.string.parkingDescription));
        services.add(new Service(R.drawable.icon_travelagency, R.string.travelAgency, R.string.travelAgencyDescription));
        services.add(new Service(R.drawable.icon_whell_chair, R.string.whellChair, R.string.whellChairDescription));
        services.add(new Service(R.drawable.icon_lockers, R.string.lockers, R.string.lockersDescription));
        services.add(new Service(R.drawable.icon_toilets_barrier, R.string.toiletsBarrierFree, R.string.toiletsBarrierFreeDescription));
        services.add(new Service(R.drawable.icon_wlan, R.string.wlan, R.string.wlanDescription));


        /* Directions */
        directions.add(new DirectionsType(R.string.directions1, true));
        directions.add(new DirectionsType(R.string.directions2, true));

        /* Centre Rules */
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_nosmoking, R.string.centreRuleNoSmoking));
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_nobike, R.string.centreRuleNoBike));
        centreRules.add(new CentreRule(R.drawable.icon_pocket, R.string.centreRulePocket));
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_nodogs, R.string.centreRuleNoDogs));
        centreRules.add(new CentreRule(R.drawable.icon_block_exits, R.string.centreRuleNoBlockExits));
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_nocameras, R.string.centreRuleNoCameras));
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_noalcohol, R.string.centreRuleNoAlcohol));
        centreRules.add(new CentreRule(R.drawable.icon_no_public_entry, R.string.centreRuleNoPublicEntry));
        centreRules.add(new CentreRule(R.drawable.icon_dangerous_goods, R.string.centreRuleNoDangerousGoods));
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_novandalism, R.string.centreRuleNoVandalism));
        centreRules.add(new CentreRule(R.drawable.icon_survailance, R.string.centreRuleSurveilance));

        /* Available tabs and default order
         * Warning: Order matters
         * 0      == Home
         * 1 to 5 == Default Tabs
         * > 5    == Other available tabs
         */

        /* Home Tab */
        defaultTabs.add(UITabBar.TabType.Featured);

        /* Default tabs */
        defaultTabs.add(UITabBar.TabType.Mall);
        defaultTabs.add(UITabBar.TabType.Map);
        defaultTabs.add(UITabBar.TabType.Search);
        defaultTabs.add(UITabBar.TabType.Promotions);
        defaultTabs.add(UITabBar.TabType.More);

        /* Hidden by Default */
        defaultTabs.add(UITabBar.TabType.Parking);
        defaultTabs.add(UITabBar.TabType.Events);
        defaultTabs.add(UITabBar.TabType.Feedback);
        defaultTabs.add(UITabBar.TabType.FoodBeverages);
        defaultTabs.add(UITabBar.TabType.Services);
        //defaultTabs.add(UITabBar.TabType.Promotions);
        defaultTabs.add(UITabBar.TabType.Card); // Voucher
        defaultTabs.add(UITabBar.TabType.Social);


        /* Map Floors */
        addMap(-1, R.raw.level_l_1);
        addMap(0, R.raw.level_g_0);
        addMap(1, R.raw.level_u_1);
        addMap(2, R.raw.level_u_2);
    }
}
