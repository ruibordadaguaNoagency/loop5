package com.rd.sonae.loop5.model;

import com.rd.sonae.R;
import com.rd.sonae.fragment.*;
import com.rd.sonae.loop5.theme.ThemeLoop5;
import com.rd.sonae.model.Mall;
import com.rd.sonae.ui.UITabBar;

public class MallLoop5 extends Mall {

    public MallLoop5() {
        super(2, R.string.mall_name, ThemeLoop5.class);

        address = "Loop 5, Gutenbergstraße 5, 64331 Weiterstadt";

        // Welcome screen has video or image?
        welcomeHasVideo = false;

        /* Lost & Found */
        lostFoundPhone = "+49 6151 667410";
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
        services.add(new Service(R.drawable.icon_wardrobe, R.string.wardrobe, R.string.wardrobeDescription));
        services.add(new Service(R.drawable.icon_atm, R.string.atm, R.string.atmDescription));
        services.add(new Service(R.drawable.icon_giftvouchers, R.string.giftVouchers, R.string.giftVouchersDescription));
        services.add(new Service(R.drawable.icon_giftwrapping, R.string.giftWrapping, R.string.giftWrappingDescription));
        services.add(new Service(R.drawable.icon_wlan, R.string.wlan, R.string.wlanDescription));
        services.add(new Service(R.drawable.icon_childrenwc, R.string.childrenWC, R.string.childrenWCDescription));
        services.add(new Service(R.drawable.icon_travelagency, R.string.travelAgency, R.string.travelAgencyDescription));
        services.add(new Service(R.drawable.icon_infostore, R.string.infoStore, R.string.infoStoreDescription));
        services.add(new Service(R.drawable.icon_dentist, R.string.dentist, R.string.dentistDescription));

        /* Directions */
        directions.add(R.string.directions1);
        directions.add(R.string.directions2);
        directions.add(R.string.directions3);

        /* Centre Rules */
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_nobike, R.string.centreRule1));
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_nosmoking, R.string.centreRule2));
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_nodogs, R.string.centreRule3));
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_nocameras, R.string.centreRule4));
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_noalcohol, R.string.centreRule5));
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_novandalism, R.string.centreRule6));
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_surveilance, R.string.centreRule7));
        centreRules.add(new CentreRule(R.drawable.icon_centrerule_surveilance, R.string.centreRule8));

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
        defaultTabs.add(UITabBar.TabType.Promotions); // defaultTabs.add(UITabBar.TabType.FoodBeverages);
        defaultTabs.add(UITabBar.TabType.More);

        /* Hidden by Default */
        defaultTabs.add(UITabBar.TabType.Parking);
        defaultTabs.add(UITabBar.TabType.Events);
        defaultTabs.add(UITabBar.TabType.Feedback);
        defaultTabs.add(UITabBar.TabType.Services);
        defaultTabs.add(UITabBar.TabType.Card);
        defaultTabs.add(UITabBar.TabType.Social);

        /* Map Floors */
        addMap(-1, R.raw.level_l_1);
        addMap(0, R.raw.level_g_0);
        addMap(1, R.raw.level_u_1);
        addMap(2, R.raw.level_u_2);
        addMap(3, R.raw.level_u_3);
        addMap(4, R.raw.level_u_4);
    }
}
