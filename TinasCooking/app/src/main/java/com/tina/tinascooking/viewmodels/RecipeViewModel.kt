package com.tina.tinascooking.viewmodels

import androidx.lifecycle.ViewModel
import com.tina.tinascooking.dataclasses.Recipe

class RecipeViewModel : ViewModel() {

    private val mousakas = Recipe(
        "Mousakas",
        "https://i.imgur.com/Guz3oLc.jpeg",
        "Heat a frying pan over a high heat. \n" +
                " Drizzle 4 tbsp of the oil over the slices of aubergine and fry them in several batches for 5-7 mins or until golden brown and beginning to soften. \n " +
                "If they look a little dry during cooking, add a dash more olive oil. Set aside on a plate lined with kitchen paper. Heat 1 tbsp of the oil in a large flameproof casserole dish or saucepan over a medium-high heat. \n" +
                " Add the mince and fry for 8-10 mins until a deep golden brown, regularly stirring and breaking up with a wooden spoon. Tip into a bowl and set aside. Add the remaining oil to the casserole. \n" +
                " Tip in the onion along with a pinch of salt and fry gently for 10-12 mins or until softened and turning translucent. Add the garlic, oregano, cinnamon, chilli and bay cooking for a further min. Return the lamb to the pan and pour in the red wine, bring to a bubble and reduce the wine by half. \n " +
                "Stir through the tomatoes, tomato purée and brown sugar, along with 200ml water. Season. Lower the heat and simmer gently, uncovered, for 20 mins, stirring occasionally until the sauce has thickened. Heat oven to 200C/180 fan/gas 4. Bring a large pan of lightly salted water to the boil. Add the potato slices and cook for 6 mins, drain in a colander and leave to steam dry for 10 mins. Melt the butter in a small saucepan, stir in the flour and cook over a medium heat for 1 min. Remove from the heat and whisk in the milk, pouring in a bit at a time, until smooth. Return to the heat and bring to a simmer, cooking for 3 mins. Remove from the heat and whisk through the parmesan, a little grated nutmeg and some seasoning, and finally the whole egg as well as the yolk. Take a large rectangular ovenproof dish. Spoon a third of the meat into the dish and spread out evenly, followed by half the aubergine and half the potato, then the rest of the meat and another layer of aubergines, followed by potatoes. Finish with the béchamel, smoothing the top over with a palette knife. Put in the centre of the oven and cook for 50 mins or until deep golden brown. If it browns too much during cooking, cover the dish. Set aside for 10 mins to cool before serving.",
        isLatest = true,
        isMainCourse = true,
        isDessertCourse = false
    )

    private val cheesecake = Recipe(
        "Oreo Cheesecake",
        "https://i.imgur.com/f88ZsIf.jpeg",
        "Begin by preparing a 9” circular springform tin with baking paper. \n In a food processor or a using a freezer bag and rolling pin, crush up the Oreos to a fine crumb. Mix in a bowl with the melted butter and pour into the tin, pressing down firmly. A top tip is to use a potato masher to apply the right pressure. \n" +
                " Place the tin into the fridge to chill whilst you make the filling. In a clean mixing bowl, whip together the cream cheese, icing sugar and vanilla extract. In a separate bowl whip the cold 'straight from the fridge' whipping cream until it reaches a stiff peak consistency - this means when you remove the whisk the peaks of the whipped cream stand upright. Gently fold the cream into the cream cheese mixture with a spatula. Next carefully fold in the chopped Oreo crumbs (specified in the filling ingredients list). Remove the tin from the fridge and spoon in the filling, using a spatula to smooth the top. Place the mixture back in the fridge to set for 4 hours or overnight. Decorate by placing remaining oreos (specified in the toppings ingredients list) around the edges, you can also pipe whipped cream in between if you choose and sprinkle oreo crumb in the centre. ",
        isLatest = true,
        isMainCourse = false,
        isDessertCourse = true
    )

    private val varenika = Recipe(
        "Varenika",
        "https://i.imgur.com/nSTssVD.jpeg",
        "Combine cottage cheese, 2 eggs, and 1/4 teaspoon pepper in a mixing bowl. Beat with an electric mixer until smooth; set filling aside. Stir together flour, milk powder, baking powder, and 1/2 teaspoon salt in a large bowl. Beat together 2 eggs, water, and oil in a small bowl; combine with flour mixture until smooth. Knead dough on a floured surface until smooth, about 10 times. Divide dough in half and roll out each portion to 1/8-inch thickness. Cut out rounds of dough with a 4-inch round cutter. Place 1 tablespoon cottage cheese filling in the center of each dough round. Moisten the edges and fold over to form a half-moon shape; pinch to seal. Bring a large pot of water to a boil. Add 1/2 of the dumplings and cook until tender, 8 to 10 minutes; remove with a slotted spoon to a plate. Cook remaining dumplings. Melt butter in a medium saucepan over medium-low heat. Stir in ham; cook until ham is light brown. Stir in 3 tablespoons flour, 1/2 teaspoon salt, and 1/8 teaspoon pepper. Pour in milk all at once; cook and stir until thick and bubbly. Serve gravy over dumplings. ",
        isLatest = true,
        isMainCourse = true,
        isDessertCourse = false
    )

    private val baklavas = Recipe(
        "Baklavas",
        "https://i.imgur.com/Uf7LapT.png",
        "Preheat oven to 350 degrees F, Place the sugar and water in a saucepan and heat stove-top, stirring occasionally, until sugar dissolves. Add the honey, orange extract, and whole cloves (cloves are optional here); stir to mix. Bring to a boil, then lower heat and let simmer for about 25 minutes. Remove syrup from heat. Add lemon juice. Remove the whole cloves and let the syrup cool completely (it will thicken a little bit).In the bowl of a food processor fitted with a blade, add the pistachios, walnut, and hazelnuts. Pulse a few times to chop. Transfer to a large mixing bowl and add sugar, cinnamon, and ground cloves. Mix well to combine. Carefully unroll the thawed phyllo pastry and place the sheets in between two clean kitchen towels. This will help keep the phyllo from breaking while you work. Prepare a 9”x 13”x 2” baking pan. Brush the interior of the baking pan with some of the melted butter.\n" +
                "To assemble the baklava, take one sheet of phyllo and place it in the pan (for this size pan, I typically fold my phyllo sheet in half, and it fits perfectly. You can also do a bit of trimming using a pair of kitchen shears). Brush the top of the phyllo sheet with the melted butter. Continue assembling the baklava, one sheet of phyllo pastry at a time using another ⅓ of the phyllo. Again, brush each layer with a bit of the melted butter.\n" +
                "\n" +
                "Distribute the remaining ½ of the nut mixture evenly over the top layer of phyllo.\n" +
                "\n" +
                "Finish the remaining ⅓ of the phyllo pastry following the same process, laying one folded sheet at a time and brushing each layer with melted butter.\n" +
                "\n" +
                "Brush the very top sheet of phyllo with butter. Using a good sharp knife, cut the pastry into diamond shaped pieces (anywhere from 24 to 36 pieces) about ½-inch deep. (See the video to see exactly how I cut baklava) Place the baklava dish on the middle rack of your heated oven. Bake anywhere from 35 to 45 minutes or until the top of the baklava turns golden and a skewer inserted in the center comes out clean. (IMPORTANT…Because ovens vary, be sure to check your baklava half-way through baking)." +
                "\n" +
                "Repeat this process a few more times until you have used up about ⅓ of the phyllo pastry, each layer being brushed with the melted butter. \n As soon as you remove the baklava from the oven, pour the cooled syrup all over the hot baklava. Make sure you disribute the syrup evenly.\n" +
                "Let the baklava cool completely (it's best if you leave it for several hours, or at least 1 hour, to allow the flaky phyll.o layers to absorb the honey syrup completely).\n" +
                "Cut through the pieces you marked earlier. And if you like, garnish with a little sprinkle of pistachio before serving. ",
        isLatest = false,
        isMainCourse = false,
        isDessertCourse = true
    )

    private val corgetteballs = Recipe(
        "Stuffed Courgettes",
        "https://i.imgur.com/9sHd8KG.jpeg",
        "Heat oven to 220C/200C fan/gas 7. Place the courgettes in a single layer in a shallow ovenproof dish, fairly tightly together, cut-side up. Brush lightly with 1 tsp oil and bake for 20 mins. To make the stuffing, mix all the ingredients together in a bowl and season with lots of black pepper. Sprinkle the stuffing on top of the courgettes and drizzle with the remaining olive oil. Bake for a further 10-15 mins or until the courgettes are softened and the topping is golden and crisp. Serve hot with a mixed salad.",
        isLatest = false,
        isMainCourse = true,
        isDessertCourse = false
    )

    private val friedEggs = Recipe(
        "Fried Eggs",
        "https://i.imgur.com/aCxJNxo.jpeg",
        "Heat the butter until it melts but isn’t yet hot enough to brown (or heat the oil). \n Crack the egg onto a small plate or saucer (don’t crack it straight into the pan in case some shell ends up in there as well). Slide it off the saucer into the pan. \n Cover with a lid and leave for 3 minutes over a low heat. Check the white is set and, if not, leave it for another 30 seconds and check again. The whites should be set but you should still have a runny yolk. \n Season with salt and pepper to taste",
        isLatest = true,
        isMainCourse = true,
        isDessertCourse = false
    )

    private val peanutButterCookies = Recipe(
        "Peanut Butter Cookies",
        "https://i.imgur.com/6cDVWn3.jpeg",
        "Heat oven to 180C/160C fan/gas 4 and line 2 large baking trays with baking parchment \n" +
                "Measure the peanut butter and sugar into a bowl. Add ¼ tsp fine table salt and mix well with a wooden spoon. Add the egg and mix again until the mixture forms a dough \n" +
                "Break off cherry tomato sized chunks of dough and place, well spaced apart, on the trays. Press the cookies down with the back of a fork to squash them a little. The cookies can now be frozen for 2 months, cook from frozen adding an extra min or 2 to the cooking time. \n" +
                "Bake for 12 mins, until golden around the edges and paler in the centre. Cool on the trays for 10 mins, then transfer to a wire rack and cool completely. Store in a cookie jar for up to 3 days.",
        isLatest = true,
        isMainCourse = false,
        isDessertCourse = true
    )

    private val omelette = Recipe(
        "Omelette",
        "https://i.imgur.com/zoQm8Hq.jpeg",
        "Season the beaten eggs well with salt and pepper. Heat the oil and butter in a non-stick frying pan over a medium-low heat until the butter has melted and is foaming.\n" +
                "Pour the eggs into the pan, tilt the pan ever so slightly from one side to another to allow the eggs to swirl and cover the surface of the pan completely. Let the mixture cook for about 20 seconds then scrape a line through the middle with a spatula.\n" +
                "Tilt the pan again to allow it to fill back up with the runny egg. Repeat once or twice more until the egg has just set.\n" +
                "At this point you can fill the omelette with whatever you like – some grated cheese, sliced ham, fresh herbs, sautéed mushrooms or smoked salmon all work well. Scatter the filling over the top of the omelette and fold gently in half with the spatula. Slide onto a plate to serve.",
        isLatest = true,
        isMainCourse = true,
        isDessertCourse = false
    )

    private val recipes = listOf(
        mousakas,
        cheesecake,
        varenika,
        baklavas,
        corgetteballs,
        friedEggs,
        peanutButterCookies,
        omelette
    )


    fun getMainCourses() = recipes.filter { it.isMainCourse }


    fun getLatestRecipes() = recipes.filter { it.isLatest }


    fun getDesserts() = recipes.filter { it.isDessertCourse }


    fun getAllRecipes() = recipes //TODO add button for all recipes to appear

}