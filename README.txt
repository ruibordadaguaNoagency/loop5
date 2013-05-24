To have tabs in proper position:


Edit file : com.rd.sonae.ui.UITabBar

and replace with

        Featured(ACFeatured.class),
        Mall(R.drawable.icon_mall_inactive, R.drawable.icon_mall_active, R.drawable.icon_mall, R.string.mall_name, ACMall.class),
        Promotions(R.drawable.icon_promotions_inactive, R.drawable.icon_promotions_active, R.drawable.icon_promotions, R.string.promotions, ACPromotions.class),
        Search(R.drawable.icon_search_inactive, R.drawable.icon_search_active, R.drawable.icon_search, R.string.search, ACSearch.class),
        Parking(R.drawable.icon_park_inactive, R.drawable.icon_park_active, R.drawable.icon_park, R.string.parking, ACParking.class),
        More(R.drawable.icon_more_inactive, R.drawable.icon_more_active, R.drawable.icon_more, R.string.more, ACTabBarCustomization.class),
        Events(R.drawable.icon_events_inactive, R.drawable.icon_events_active, R.drawable.icon_events, R.string.events, ACEvents.class),
        Map(R.drawable.icon_map_inactive, R.drawable.icon_map_active, R.drawable.icon_map, R.string.map, ACMap.class),
        Feedback(R.drawable.icon_feedback_inactive, R.drawable.icon_feedback_active, R.drawable.icon_feedback, R.string.feedback, ACFeedback.class),
        FoodBeverages(R.drawable.icon_foodbeverages_inactive, R.drawable.icon_foodbeverages_active, R.drawable.icon_foodbeverages, R.string.gastronomy, ACGastronomy.class),
        Services(R.drawable.icon_services_inactive, R.drawable.icon_services_active, R.drawable.icon_services, R.string.services, ACServices.class),
        Card(R.drawable.icon_card_inactive, R.drawable.icon_card_active, R.drawable.icon_card, R.string.voucher, ACVoucher.class),
        Social(R.drawable.icon_social_inactive, R.drawable.icon_social_active, R.drawable.icon_social, R.string.social, ACSocial.class);