package com.example.mysubmission

object PrinceData {
    private val princeNames = arrayOf("Azura",
        "Boethiah",
        "Clavicus Vile",
        "Hermaeus Mora",
        "Hircine",
        "Malacath",
        "Mehrunes Dagon",
        "Mephala",
        "Meridia",
        "Molag Bal",
        "Namira",
        "Nocturnal",
        "Peryte",
        "Sanguine",
        "Sheogorath",
        "Vaermina")

    private val princeDetails = arrayOf("Azura is the Daedric Prince whose sphere is dusk and dawn. Azura is always depicted as a female and is also known as \"Mother of the Rose,\" \"Queen of the Night Sky,\" and the Anticipation of Sotha Sil. Her artifact is Azura's Star.",
        "Boethiah is the Prince of Plots, who rules over deceit, conspiracy, secret plots of murder, assassination, treason, and unlawful overthrow of authority. Boethiah is depicted (often female) as a great caped warrior, typically taking a stoic pose and is also known as the Anticipation of Almalexia.",
        "Clavicus Vile is the Daedric Prince whose sphere is the granting of power and wishes through ritual invocations and pacts. Clavicus has a companion named Barbas, who may be a distinct part of Vile while being part of his being.",
        "Hermaeus Mora is the Daedric Prince of knowledge and memory. His sphere is the scrying of the tides of fate, of the past and future as read in the stars and heavens, and in his dominion are the treasures of knowledge and memory.",
        "Hircine is the Daedric Prince whose sphere is the Hunt, the Sport of Daedra, the Great Game, and the Chase; he is known as the Huntsman and the Father of Manbeasts.[4] Hircine created the various lycanthropic diseases which transform mortals into beasts, and is, therefore, the father of were-creatures.",
        "Jyggalag is the Prince of Order and is one of the more obscure princes. He was cursed by the other Daedric Princes, who were allegedly afraid of him, to become Sheogorath, only returning to his original form during the Greymarch. He is depicted as a crystalline knight",
        "Malacath is the Daedric Prince whose sphere is the patronage of the spurned and ostracized, the keeper of the Sworn Oath, and the Bloody Curse. He forms one corner of the House of Troubles in Dunmer religion, as well as being a particular enemy of the Nords. ",
        "Mehrunes Dagon is the Daedric Prince of Destruction, Change, Revolution, Energy, and Ambition. He is associated with natural dangers like fire, earthquakes, and floods. He is an especially important deity in Morrowind, where he represents its near-inhospitable terrain and is part of the House of Troubles.",
        "Mephala is a Daedric Prince known by the names Webspinner, Spinner, Spider, and is associated with sex and secret murder by the Dunmer, and is the Anticipation of Vivec. Her realm of Oblivion is known as the Spiral Skein. The Morag Tong is a cult of assassins that was, at least initially, devoted to her worship.",
        "Meridia is associated with the energies of living things, and bears hatred for the undead. Her realm is known as the Colored Rooms. She is associated with a race of lesser Daedra known as Aurorans, and was the patron of Umaril and the Ayleids.",
        "Molag Bal is the Daedric Prince whose sphere is the domination and enslavement of mortals. His realm is called Coldharbour, a twisted dark imitation of Tamriel. He is associated with many forms of domination, and is known by some as the King of Rape.",
        "Namira is the Daedric Prince whose sphere is the ancient darkness. She is associated with all things generally considered repulsive, including various creatures such as spiders or slugs and disease that cause any kind of unattractive physical abnormalities.",
        "Nocturnal is the Daedric Prince whose sphere is the night and darkness, also known as the Night Mistress. She is said to not court worshippers, treating them with indifference, although it also seems that the Nightingales are her sworn servants.",
        "Peryite, also known as the Taskmaster, is the Daedric Prince whose sphere is Pestilence, and he is charged with ordering the lowest levels of Oblivion. He is often depicted as a green dragon. Peryite's realm of Oblivion is known as \"The Pits.\" It is here in which the lowest orders of Oblivion are guarded.",
        "Sanguine is the Daedric Prince whose sphere is hedonistic revelry, debauchery, and passionate indulgences of darker natures. Sanguine rules over the Myriad Realms of Revelry, which are places that Sanguine allows any visitors to customize to their whims.",
        "Sheogorath is the infamous Prince of Madness, whose motives are unknowable. His realm in Oblivion is the Shivering Isles, and he is served by the Golden Saints and Dark Seducers.[66] He forms one of the corners of the House of Troubles in Dunmeri theology.",
        "Vaermina is the Daedric Prince whose sphere is the realm of dreams and nightmares, and evil omens. Her plane of Oblivion is Quagmire. It is described as a nightmare realm, where every few minutes reality shifts and becomes ever more horrifying.")

    private val princeImages = intArrayOf(R.drawable.azura,
        R.drawable.boethiah,
        R.drawable.clavicus_vile,
        R.drawable.hermaeus_mora,
        R.drawable.hircine,
        R.drawable.malacath,
        R.drawable.mehrunes_dagon,
        R.drawable.mephala,
        R.drawable.meridia,
        R.drawable.molag_bal,
        R.drawable.namira,
        R.drawable.nocturnal,
        R.drawable.peryte,
        R.drawable.sanguine,
        R.drawable.sheogorath,
        R.drawable.vaermina)

    val listData: ArrayList<Prince>
        get() {
            val list = arrayListOf<Prince>()
            for (position in princeNames.indices) {
                val prince = Prince()
                prince.name = princeNames[position]
                prince.detail = princeDetails[position]
                prince.photo = princeImages[position]
                list.add(prince)
            }
            return list
        }
}