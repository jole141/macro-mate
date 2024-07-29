package com.zeus;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Scrape {

    public static String split1 = "<tbody>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/salt\" class=\"tag known\" rel=\"nofollow\">Salt</a></td>\n" +
            "<td style=\"text-align:right\">782</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sugar\" class=\"tag known\" rel=\"nofollow\">Sugar</a></td>\n" +
            "<td style=\"text-align:right\">676</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/water\" class=\"tag known\" rel=\"nofollow\">Water</a></td>\n" +
            "<td style=\"text-align:right\">564</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/oil-and-fat\" class=\"tag known\" rel=\"nofollow\">Oil and fat</a></td>\n" +
            "<td style=\"text-align:right\">532</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/flavouring\" class=\"tag known\" rel=\"nofollow\">Flavouring</a></td>\n" +
            "<td style=\"text-align:right\">525</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/added-sugar\" class=\"tag known\" rel=\"nofollow\">Added sugar</a></td>\n" +
            "<td style=\"text-align:right\">522</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dairy\" class=\"tag known\" rel=\"nofollow\">Dairy</a></td>\n" +
            "<td style=\"text-align:right\">492</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-oil-and-fat\" class=\"tag known\" rel=\"nofollow\">Vegetable oil and fat</a></td>\n" +
            "<td style=\"text-align:right\">489</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/disaccharide\" class=\"tag known\" rel=\"nofollow\">Disaccharide</a></td>\n" +
            "<td style=\"text-align:right\">445</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cereal\" class=\"tag known\" rel=\"nofollow\">Cereal</a></td>\n" +
            "<td style=\"text-align:right\">423</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable\" class=\"tag known\" rel=\"nofollow\">Vegetable</a></td>\n" +
            "<td style=\"text-align:right\">403</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fruit\" class=\"tag known\" rel=\"nofollow\">Fruit</a></td>\n" +
            "<td style=\"text-align:right\">348</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/flour\" class=\"tag known\" rel=\"nofollow\">Flour</a></td>\n" +
            "<td style=\"text-align:right\">330</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat\" class=\"tag known\" rel=\"nofollow\">Wheat</a></td>\n" +
            "<td style=\"text-align:right\">319</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/root-vegetable\" class=\"tag known\" rel=\"nofollow\">Root vegetable</a></td>\n" +
            "<td style=\"text-align:right\">318</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-oil\" class=\"tag known\" rel=\"nofollow\">Vegetable oil</a></td>\n" +
            "<td style=\"text-align:right\">305</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/glucose\" class=\"tag known\" rel=\"nofollow\">Glucose</a></td>\n" +
            "<td style=\"text-align:right\">299</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/starch\" class=\"tag known\" rel=\"nofollow\">Starch</a></td>\n" +
            "<td style=\"text-align:right\">297</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milk\" class=\"tag known\" rel=\"nofollow\">Milk</a></td>\n" +
            "<td style=\"text-align:right\">266</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural flavouring</a></td>\n" +
            "<td style=\"text-align:right\">263</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cereal-flour\" class=\"tag known\" rel=\"nofollow\">Cereal flour</a></td>\n" +
            "<td style=\"text-align:right\">260</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spice\" class=\"tag known\" rel=\"nofollow\">Spice</a></td>\n" +
            "<td style=\"text-align:right\">254</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/emulsifier\" class=\"tag known\" rel=\"nofollow\">Emulsifier</a></td>\n" +
            "<td style=\"text-align:right\">252</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-flour\" class=\"tag known\" rel=\"nofollow\">Wheat flour</a></td>\n" +
            "<td style=\"text-align:right\">248</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e330\" class=\"tag known\" rel=\"nofollow\">E330</a></td>\n" +
            "<td style=\"text-align:right\">232</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/monosaccharide\" class=\"tag known\" rel=\"nofollow\">Monosaccharide</a></td>\n" +
            "<td style=\"text-align:right\">224</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/herb\" class=\"tag known\" rel=\"nofollow\">Herb</a></td>\n" +
            "<td style=\"text-align:right\">203</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sunflower-oil\" class=\"tag known\" rel=\"nofollow\">Sunflower oil</a></td>\n" +
            "<td style=\"text-align:right\">198</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/seed\" class=\"tag known\" rel=\"nofollow\">Seed</a></td>\n" +
            "<td style=\"text-align:right\">193</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/colour\" class=\"tag known\" rel=\"nofollow\">Colour</a></td>\n" +
            "<td style=\"text-align:right\">188</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/preservative\" class=\"tag known\" rel=\"nofollow\">Preservative</a></td>\n" +
            "<td style=\"text-align:right\">185</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/acid\" class=\"tag known\" rel=\"nofollow\">Acid</a></td>\n" +
            "<td style=\"text-align:right\">184</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cocoa\" class=\"tag known\" rel=\"nofollow\">Cocoa</a></td>\n" +
            "<td style=\"text-align:right\">181</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e322\" class=\"tag known\" rel=\"nofollow\">E322</a></td>\n" +
            "<td style=\"text-align:right\">173</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/plant\" class=\"tag known\" rel=\"nofollow\">Plant</a></td>\n" +
            "<td style=\"text-align:right\">164</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/onion\" class=\"tag known\" rel=\"nofollow\">Onion</a></td>\n" +
            "<td style=\"text-align:right\">161</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/antioxidant\" class=\"tag known\" rel=\"nofollow\">Antioxidant</a></td>\n" +
            "<td style=\"text-align:right\">159</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/egg\" class=\"tag known\" rel=\"nofollow\">Egg</a></td>\n" +
            "<td style=\"text-align:right\">156</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milk-powder\" class=\"tag known\" rel=\"nofollow\">Milk powder</a></td>\n" +
            "<td style=\"text-align:right\">155</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/thickener\" class=\"tag known\" rel=\"nofollow\">Thickener</a></td>\n" +
            "<td style=\"text-align:right\">155</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dextrose\" class=\"tag known\" rel=\"nofollow\">Dextrose</a></td>\n" +
            "<td style=\"text-align:right\">154</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e322i\" class=\"tag known\" rel=\"nofollow\">E322i</a></td>\n" +
            "<td style=\"text-align:right\">143</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/yeast\" class=\"tag known\" rel=\"nofollow\">Yeast</a></td>\n" +
            "<td style=\"text-align:right\">141</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/garlic\" class=\"tag known\" rel=\"nofollow\">Garlic</a></td>\n" +
            "<td style=\"text-align:right\">139</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/stabiliser\" class=\"tag known\" rel=\"nofollow\">Stabiliser</a></td>\n" +
            "<td style=\"text-align:right\">139</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pepper\" class=\"tag known\" rel=\"nofollow\">Pepper</a></td>\n" +
            "<td style=\"text-align:right\">138</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/glucose-syrup\" class=\"tag known\" rel=\"nofollow\">Glucose syrup</a></td>\n" +
            "<td style=\"text-align:right\">136</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rapeseed-oil\" class=\"tag known\" rel=\"nofollow\">Rapeseed oil</a></td>\n" +
            "<td style=\"text-align:right\">134</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/citrus-fruit\" class=\"tag known\" rel=\"nofollow\">Citrus fruit</a></td>\n" +
            "<td style=\"text-align:right\">127</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/animal\" class=\"tag known\" rel=\"nofollow\">Animal</a></td>\n" +
            "<td style=\"text-align:right\">124</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tomato\" class=\"tag known\" rel=\"nofollow\">Tomato</a></td>\n" +
            "<td style=\"text-align:right\">118</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nut\" class=\"tag known\" rel=\"nofollow\">Nut</a></td>\n" +
            "<td style=\"text-align:right\">117</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/protein\" class=\"tag known\" rel=\"nofollow\">Protein</a></td>\n" +
            "<td style=\"text-align:right\">117</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/corn-starch\" class=\"tag known\" rel=\"nofollow\">Corn starch</a></td>\n" +
            "<td style=\"text-align:right\">116</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cocoa-butter\" class=\"tag known\" rel=\"nofollow\">Cocoa butter</a></td>\n" +
            "<td style=\"text-align:right\">113</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fruit-juice\" class=\"tag known\" rel=\"nofollow\">Fruit juice</a></td>\n" +
            "<td style=\"text-align:right\">112</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/acidity-regulator\" class=\"tag known\" rel=\"nofollow\">Acidity regulator</a></td>\n" +
            "<td style=\"text-align:right\">112</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cocoa-paste\" class=\"tag known\" rel=\"nofollow\">Cocoa paste</a></td>\n" +
            "<td style=\"text-align:right\">110</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/palm-oil-and-fat\" class=\"tag known\" rel=\"nofollow\">Palm oil and fat</a></td>\n" +
            "<td style=\"text-align:right\">109</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/meat\" class=\"tag known\" rel=\"nofollow\">Meat</a></td>\n" +
            "<td style=\"text-align:right\">108</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vinegar\" class=\"tag known\" rel=\"nofollow\">Vinegar</a></td>\n" +
            "<td style=\"text-align:right\">108</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/skimmed-milk-powder\" class=\"tag known\" rel=\"nofollow\">Skimmed milk powder</a></td>\n" +
            "<td style=\"text-align:right\">108</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soya-lecithin\" class=\"tag known\" rel=\"nofollow\">Soya lecithin</a></td>\n" +
            "<td style=\"text-align:right\">108</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/raising-agent\" class=\"tag known\" rel=\"nofollow\">Raising agent</a></td>\n" +
            "<td style=\"text-align:right\">106</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rice\" class=\"tag known\" rel=\"nofollow\">Rice</a></td>\n" +
            "<td style=\"text-align:right\">104</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e500\" class=\"tag known\" rel=\"nofollow\">E500</a></td>\n" +
            "<td style=\"text-align:right\">103</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cream\" class=\"tag known\" rel=\"nofollow\">Cream</a></td>\n" +
            "<td style=\"text-align:right\">101</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e300\" class=\"tag known\" rel=\"nofollow\">E300</a></td>\n" +
            "<td style=\"text-align:right\">100</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/modified-starch\" class=\"tag known\" rel=\"nofollow\">Modified starch</a></td>\n" +
            "<td style=\"text-align:right\">96</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fat\" class=\"tag known\" rel=\"nofollow\">Fat</a></td>\n" +
            "<td style=\"text-align:right\">94</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/malt\" class=\"tag known\" rel=\"nofollow\">Malt</a></td>\n" +
            "<td style=\"text-align:right\">94</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ferment\" class=\"tag known\" rel=\"nofollow\">Ferment</a></td>\n" +
            "<td style=\"text-align:right\">94</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork\" class=\"tag known\" rel=\"nofollow\">Pork</a></td>\n" +
            "<td style=\"text-align:right\">94</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/colza-oil\" class=\"tag known\" rel=\"nofollow\">Colza oil</a></td>\n" +
            "<td style=\"text-align:right\">89</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lemon\" class=\"tag known\" rel=\"nofollow\">Lemon</a></td>\n" +
            "<td style=\"text-align:right\">89</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tree-nut\" class=\"tag known\" rel=\"nofollow\">Tree nut</a></td>\n" +
            "<td style=\"text-align:right\">88</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e415\" class=\"tag known\" rel=\"nofollow\">E415</a></td>\n" +
            "<td style=\"text-align:right\">85</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sea-salt\" class=\"tag known\" rel=\"nofollow\">Sea salt</a></td>\n" +
            "<td style=\"text-align:right\">85</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e250\" class=\"tag known\" rel=\"nofollow\">E250</a></td>\n" +
            "<td style=\"text-align:right\">84</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cocoa-powder\" class=\"tag known\" rel=\"nofollow\">Cocoa powder</a></td>\n" +
            "<td style=\"text-align:right\">83</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/corn\" class=\"tag known\" rel=\"nofollow\">Corn</a></td>\n" +
            "<td style=\"text-align:right\">83</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e412\" class=\"tag known\" rel=\"nofollow\">E412</a></td>\n" +
            "<td style=\"text-align:right\">82</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/legume\" class=\"tag known\" rel=\"nofollow\">Legume</a></td>\n" +
            "<td style=\"text-align:right\">81</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-meat\" class=\"tag known\" rel=\"nofollow\">Pork meat</a></td>\n" +
            "<td style=\"text-align:right\">81</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/carrot\" class=\"tag known\" rel=\"nofollow\">Carrot</a></td>\n" +
            "<td style=\"text-align:right\">80</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lactose\" class=\"tag known\" rel=\"nofollow\">Lactose</a></td>\n" +
            "<td style=\"text-align:right\">79</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soya\" class=\"tag known\" rel=\"nofollow\">Soya</a></td>\n" +
            "<td style=\"text-align:right\">79</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e471\" class=\"tag known\" rel=\"nofollow\">E471</a></td>\n" +
            "<td style=\"text-align:right\">76</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/butter\" class=\"tag known\" rel=\"nofollow\">Butter</a></td>\n" +
            "<td style=\"text-align:right\">74</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/potato-starch\" class=\"tag known\" rel=\"nofollow\">Potato starch</a></td>\n" +
            "<td style=\"text-align:right\">74</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/berries\" class=\"tag known\" rel=\"nofollow\">Berries</a></td>\n" +
            "<td style=\"text-align:right\">74</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/palm-oil\" class=\"tag known\" rel=\"nofollow\">Palm oil</a></td>\n" +
            "<td style=\"text-align:right\">73</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/animal-protein\" class=\"tag known\" rel=\"nofollow\">Animal protein</a></td>\n" +
            "<td style=\"text-align:right\">73</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/apple\" class=\"tag known\" rel=\"nofollow\">Apple</a></td>\n" +
            "<td style=\"text-align:right\">73</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milk-proteins\" class=\"tag known\" rel=\"nofollow\">Milk proteins</a></td>\n" +
            "<td style=\"text-align:right\">72</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chocolate\" class=\"tag known\" rel=\"nofollow\">Chocolate</a></td>\n" +
            "<td style=\"text-align:right\">71</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cane-sugar\" class=\"tag known\" rel=\"nofollow\">Cane sugar</a></td>\n" +
            "<td style=\"text-align:right\">70</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-milk-powder\" class=\"tag known\" rel=\"nofollow\">Whole milk powder</a></td>\n" +
            "<td style=\"text-align:right\">69</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fructose\" class=\"tag known\" rel=\"nofollow\">Fructose</a></td>\n" +
            "<td style=\"text-align:right\">69</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e450\" class=\"tag known\" rel=\"nofollow\">E450</a></td>\n" +
            "<td style=\"text-align:right\">69</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/malted-barley\" class=\"tag known\" rel=\"nofollow\">Malted barley</a></td>\n" +
            "<td style=\"text-align:right\">68</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cheese\" class=\"tag known\" rel=\"nofollow\">Cheese</a></td>\n" +
            "<td style=\"text-align:right\">68</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/olive-oil\" class=\"tag known\" rel=\"nofollow\">Olive oil</a></td>\n" +
            "<td style=\"text-align:right\">67</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/microbial-culture\" class=\"tag known\" rel=\"nofollow\">Microbial culture</a></td>\n" +
            "<td style=\"text-align:right\">67</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lactic-ferments\" class=\"tag known\" rel=\"nofollow\">Lactic ferments</a></td>\n" +
            "<td style=\"text-align:right\">64</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fish\" class=\"tag known\" rel=\"nofollow\">Fish</a></td>\n" +
            "<td style=\"text-align:right\">64</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e440a\" class=\"tag known\" rel=\"nofollow\">E440a</a></td>\n" +
            "<td style=\"text-align:right\">62</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/maltodextrins\" class=\"tag known\" rel=\"nofollow\">Maltodextrins</a></td>\n" +
            "<td style=\"text-align:right\">61</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whey\" class=\"tag known\" rel=\"nofollow\">Whey</a></td>\n" +
            "<td style=\"text-align:right\">61</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e407\" class=\"tag known\" rel=\"nofollow\">E407</a></td>\n" +
            "<td style=\"text-align:right\">61</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/enzyme\" class=\"tag known\" rel=\"nofollow\">Enzyme</a></td>\n" +
            "<td style=\"text-align:right\">61</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milkfat\" class=\"tag known\" rel=\"nofollow\">Milkfat</a></td>\n" +
            "<td style=\"text-align:right\">60</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/parsley\" class=\"tag known\" rel=\"nofollow\">Parsley</a></td>\n" +
            "<td style=\"text-align:right\">58</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/glucose-fructose-syrup\" class=\"tag known\" rel=\"nofollow\">Glucose-fructose syrup</a></td>\n" +
            "<td style=\"text-align:right\">58</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mustard\" class=\"tag known\" rel=\"nofollow\">Mustard</a></td>\n" +
            "<td style=\"text-align:right\">57</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fat-reduced-cocoa-powder\" class=\"tag known\" rel=\"nofollow\">Fat reduced cocoa powder</a></td>\n" +
            "<td style=\"text-align:right\">55</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vanilla-flavouring\" class=\"tag known\" rel=\"nofollow\">Vanilla flavouring</a></td>\n" +
            "<td style=\"text-align:right\">55</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/potato\" class=\"tag known\" rel=\"nofollow\">Potato</a></td>\n" +
            "<td style=\"text-align:right\">54</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/gluten\" class=\"tag known\" rel=\"nofollow\">Gluten</a></td>\n" +
            "<td style=\"text-align:right\">54</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e202\" class=\"tag known\" rel=\"nofollow\">E202</a></td>\n" +
            "<td style=\"text-align:right\">54</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-fat\" class=\"tag known\" rel=\"nofollow\">Vegetable fat</a></td>\n" +
            "<td style=\"text-align:right\">53</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/alcohol\" class=\"tag known\" rel=\"nofollow\">Alcohol</a></td>\n" +
            "<td style=\"text-align:right\">52</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vitamins\" class=\"tag known\" rel=\"nofollow\">Vitamins</a></td>\n" +
            "<td style=\"text-align:right\">52</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/gelling-agent\" class=\"tag known\" rel=\"nofollow\">Gelling agent</a></td>\n" +
            "<td style=\"text-align:right\">52</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coagulating-enzyme\" class=\"tag known\" rel=\"nofollow\">Coagulating enzyme</a></td>\n" +
            "<td style=\"text-align:right\">51</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rice-flour\" class=\"tag known\" rel=\"nofollow\">Rice flour</a></td>\n" +
            "<td style=\"text-align:right\">51</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/orange\" class=\"tag known\" rel=\"nofollow\">Orange</a></td>\n" +
            "<td style=\"text-align:right\">48</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-lemon-juice\" class=\"tag known\" rel=\"nofollow\">Concentrated lemon juice</a></td>\n" +
            "<td style=\"text-align:right\">48</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/butterfat\" class=\"tag known\" rel=\"nofollow\">Butterfat</a></td>\n" +
            "<td style=\"text-align:right\">48</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-milk\" class=\"tag known\" rel=\"nofollow\">Whole milk</a></td>\n" +
            "<td style=\"text-align:right\">47</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e500ii\" class=\"tag known\" rel=\"nofollow\">E500ii</a></td>\n" +
            "<td style=\"text-align:right\">47</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/oat\" class=\"tag known\" rel=\"nofollow\">Oat</a></td>\n" +
            "<td style=\"text-align:right\">46</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rennet\" class=\"tag known\" rel=\"nofollow\">Rennet</a></td>\n" +
            "<td style=\"text-align:right\">46</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-vanilla-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural vanilla flavouring</a></td>\n" +
            "<td style=\"text-align:right\">46</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-protein\" class=\"tag known\" rel=\"nofollow\">Vegetable protein</a></td>\n" +
            "<td style=\"text-align:right\">46</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e301\" class=\"tag known\" rel=\"nofollow\">E301</a></td>\n" +
            "<td style=\"text-align:right\">45</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/yeast-extract\" class=\"tag known\" rel=\"nofollow\">Yeast extract</a></td>\n" +
            "<td style=\"text-align:right\">45</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/modified-corn-starch\" class=\"tag known\" rel=\"nofollow\">Modified corn starch</a></td>\n" +
            "<td style=\"text-align:right\">44</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/minerals\" class=\"tag known\" rel=\"nofollow\">Minerals</a></td>\n" +
            "<td style=\"text-align:right\">44</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/almond\" class=\"tag known\" rel=\"nofollow\">Almond</a></td>\n" +
            "<td style=\"text-align:right\">43</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/honey\" class=\"tag known\" rel=\"nofollow\">Honey</a></td>\n" +
            "<td style=\"text-align:right\">43</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hazelnut\" class=\"tag known\" rel=\"nofollow\">Hazelnut</a></td>\n" +
            "<td style=\"text-align:right\">43</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/flavour-enhancer\" class=\"tag known\" rel=\"nofollow\">Flavour enhancer</a></td>\n" +
            "<td style=\"text-align:right\">42</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/virgin-olive-oil\" class=\"tag known\" rel=\"nofollow\">Virgin olive oil</a></td>\n" +
            "<td style=\"text-align:right\">42</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chili-pepper\" class=\"tag known\" rel=\"nofollow\">Chili pepper</a></td>\n" +
            "<td style=\"text-align:right\">42</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/skimmed-milk\" class=\"tag known\" rel=\"nofollow\">Skimmed milk</a></td>\n" +
            "<td style=\"text-align:right\">41</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sugar-syrup\" class=\"tag known\" rel=\"nofollow\">Sugar syrup</a></td>\n" +
            "<td style=\"text-align:right\">41</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e410\" class=\"tag known\" rel=\"nofollow\">E410</a></td>\n" +
            "<td style=\"text-align:right\">41</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/extra-virgin-olive-oil\" class=\"tag known\" rel=\"nofollow\">Extra virgin olive oil</a></td>\n" +
            "<td style=\"text-align:right\">40</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bell-pepper\" class=\"tag known\" rel=\"nofollow\">Bell pepper</a></td>\n" +
            "<td style=\"text-align:right\">40</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/palm-fat\" class=\"tag known\" rel=\"nofollow\">Palm fat</a></td>\n" +
            "<td style=\"text-align:right\">40</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/grape\" class=\"tag known\" rel=\"nofollow\">Grape</a></td>\n" +
            "<td style=\"text-align:right\">40</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/black-pepper\" class=\"tag known\" rel=\"nofollow\">Black pepper</a></td>\n" +
            "<td style=\"text-align:right\">39</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/poultry\" class=\"tag known\" rel=\"nofollow\">Poultry</a></td>\n" +
            "<td style=\"text-align:right\">38</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mustard-seed\" class=\"tag known\" rel=\"nofollow\">Mustard seed</a></td>\n" +
            "<td style=\"text-align:right\">38</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e503\" class=\"tag known\" rel=\"nofollow\">E503</a></td>\n" +
            "<td style=\"text-align:right\">37</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/celery\" class=\"tag known\" rel=\"nofollow\">Celery</a></td>\n" +
            "<td style=\"text-align:right\">37</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sweetener\" class=\"tag known\" rel=\"nofollow\">Sweetener</a></td>\n" +
            "<td style=\"text-align:right\">37</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fiber\" class=\"tag known\" rel=\"nofollow\">Fiber</a></td>\n" +
            "<td style=\"text-align:right\">36</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/invert-sugar\" class=\"tag known\" rel=\"nofollow\">Invert sugar</a></td>\n" +
            "<td style=\"text-align:right\">36</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sunflower-lecithin\" class=\"tag known\" rel=\"nofollow\">Sunflower lecithin</a></td>\n" +
            "<td style=\"text-align:right\">36</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vanilla\" class=\"tag known\" rel=\"nofollow\">Vanilla</a></td>\n" +
            "<td style=\"text-align:right\">36</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/durum-wheat\" class=\"tag known\" rel=\"nofollow\">Durum wheat</a></td>\n" +
            "<td style=\"text-align:right\">34</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soya-bean\" class=\"tag known\" rel=\"nofollow\">Soya bean</a></td>\n" +
            "<td style=\"text-align:right\">34</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sunflower\" class=\"tag known\" rel=\"nofollow\">Sunflower</a></td>\n" +
            "<td style=\"text-align:right\">34</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lemon-juice\" class=\"tag known\" rel=\"nofollow\">Lemon juice</a></td>\n" +
            "<td style=\"text-align:right\">34</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/thyme\" class=\"tag known\" rel=\"nofollow\">Thyme</a></td>\n" +
            "<td style=\"text-align:right\">33</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e621\" class=\"tag known\" rel=\"nofollow\">E621</a></td>\n" +
            "<td style=\"text-align:right\">33</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spice-extract\" class=\"tag known\" rel=\"nofollow\">Spice extract</a></td>\n" +
            "<td style=\"text-align:right\">33</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-gluten\" class=\"tag known\" rel=\"nofollow\">Wheat gluten</a></td>\n" +
            "<td style=\"text-align:right\">33</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/durum-wheat-semolina\" class=\"tag known\" rel=\"nofollow\">Durum wheat semolina</a></td>\n" +
            "<td style=\"text-align:right\">32</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e270\" class=\"tag known\" rel=\"nofollow\">E270</a></td>\n" +
            "<td style=\"text-align:right\">32</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/invert-sugar-syrup\" class=\"tag known\" rel=\"nofollow\">Invert sugar syrup</a></td>\n" +
            "<td style=\"text-align:right\">32</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-fiber\" class=\"tag known\" rel=\"nofollow\">Vegetable fiber</a></td>\n" +
            "<td style=\"text-align:right\">32</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/basil\" class=\"tag known\" rel=\"nofollow\">Basil</a></td>\n" +
            "<td style=\"text-align:right\">32</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coconut\" class=\"tag known\" rel=\"nofollow\">Coconut</a></td>\n" +
            "<td style=\"text-align:right\">32</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/barley\" class=\"tag known\" rel=\"nofollow\">Barley</a></td>\n" +
            "<td style=\"text-align:right\">32</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/semolina\" class=\"tag known\" rel=\"nofollow\">Semolina</a></td>\n" +
            "<td style=\"text-align:right\">32</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beef\" class=\"tag known\" rel=\"nofollow\">Beef</a></td>\n" +
            "<td style=\"text-align:right\">31</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/egg-yolk\" class=\"tag known\" rel=\"nofollow\">Egg yolk</a></td>\n" +
            "<td style=\"text-align:right\">31</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/oily-fish\" class=\"tag known\" rel=\"nofollow\">Oily fish</a></td>\n" +
            "<td style=\"text-align:right\">31</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-starch\" class=\"tag known\" rel=\"nofollow\">Wheat starch</a></td>\n" +
            "<td style=\"text-align:right\">31</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rice-starch\" class=\"tag known\" rel=\"nofollow\">Rice starch</a></td>\n" +
            "<td style=\"text-align:right\">31</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/iodised-salt\" class=\"tag known\" rel=\"nofollow\">Iodised salt</a></td>\n" +
            "<td style=\"text-align:right\">30</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wholemeal-flour\" class=\"tag known\" rel=\"nofollow\">Wholemeal flour</a></td>\n" +
            "<td style=\"text-align:right\">30</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/yogurt\" class=\"tag known\" rel=\"nofollow\">Yogurt</a></td>\n" +
            "<td style=\"text-align:right\">30</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/egg-white\" class=\"tag known\" rel=\"nofollow\">Egg white</a></td>\n" +
            "<td style=\"text-align:right\">30</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e160c\" class=\"tag known\" rel=\"nofollow\">E160c</a></td>\n" +
            "<td style=\"text-align:right\">30</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/paprika\" class=\"tag known\" rel=\"nofollow\">Paprika</a></td>\n" +
            "<td style=\"text-align:right\">30</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e160a\" class=\"tag known\" rel=\"nofollow\">E160a</a></td>\n" +
            "<td style=\"text-align:right\">30</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e422\" class=\"tag known\" rel=\"nofollow\">E422</a></td>\n" +
            "<td style=\"text-align:right\">30</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/animal-fat\" class=\"tag known\" rel=\"nofollow\">Animal fat</a></td>\n" +
            "<td style=\"text-align:right\">29</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/glazing-agent\" class=\"tag known\" rel=\"nofollow\">Glazing agent</a></td>\n" +
            "<td style=\"text-align:right\">29</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/raspberry\" class=\"tag known\" rel=\"nofollow\">Raspberry</a></td>\n" +
            "<td style=\"text-align:right\">29</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hops\" class=\"tag known\" rel=\"nofollow\">Hops</a></td>\n" +
            "<td style=\"text-align:right\">29</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/puree\" class=\"tag known\" rel=\"nofollow\">Purée</a></td>\n" +
            "<td style=\"text-align:right\">29</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dough\" class=\"tag known\" rel=\"nofollow\">Dough</a></td>\n" +
            "<td style=\"text-align:right\">28</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whey-powder\" class=\"tag known\" rel=\"nofollow\">Whey powder</a></td>\n" +
            "<td style=\"text-align:right\">28</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/corn-flour\" class=\"tag known\" rel=\"nofollow\">Corn flour</a></td>\n" +
            "<td style=\"text-align:right\">28</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/barley-malt-extract\" class=\"tag known\" rel=\"nofollow\">Barley malt extract</a></td>\n" +
            "<td style=\"text-align:right\">28</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrolysed-vegetable-protein\" class=\"tag known\" rel=\"nofollow\">Hydrolysed vegetable protein</a></td>\n" +
            "<td style=\"text-align:right\">28</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/unrefined-sugar\" class=\"tag known\" rel=\"nofollow\">Unrefined sugar</a></td>\n" +
            "<td style=\"text-align:right\">28</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coriander\" class=\"tag known\" rel=\"nofollow\">Coriander</a></td>\n" +
            "<td style=\"text-align:right\">28</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/unrefined-cane-sugar\" class=\"tag known\" rel=\"nofollow\">Unrefined cane sugar</a></td>\n" +
            "<td style=\"text-align:right\">27</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e414\" class=\"tag known\" rel=\"nofollow\">E414</a></td>\n" +
            "<td style=\"text-align:right\">27</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wine\" class=\"tag known\" rel=\"nofollow\">Wine</a></td>\n" +
            "<td style=\"text-align:right\">27</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e120\" class=\"tag known\" rel=\"nofollow\">E120</a></td>\n" +
            "<td style=\"text-align:right\">27</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e428\" class=\"tag known\" rel=\"nofollow\">E428</a></td>\n" +
            "<td style=\"text-align:right\">27</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coconut-oil\" class=\"tag known\" rel=\"nofollow\">Coconut oil</a></td>\n" +
            "<td style=\"text-align:right\">27</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cinnamon\" class=\"tag known\" rel=\"nofollow\">Cinnamon</a></td>\n" +
            "<td style=\"text-align:right\">27</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/oat-flakes\" class=\"tag known\" rel=\"nofollow\">Oat flakes</a></td>\n" +
            "<td style=\"text-align:right\">27</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sauce\" class=\"tag known\" rel=\"nofollow\">Sauce</a></td>\n" +
            "<td style=\"text-align:right\">26</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cow-s-milk\" class=\"tag known\" rel=\"nofollow\">Cow's milk</a></td>\n" +
            "<td style=\"text-align:right\">26</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e290\" class=\"tag known\" rel=\"nofollow\">E290</a></td>\n" +
            "<td style=\"text-align:right\">26</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e375\" class=\"tag known\" rel=\"nofollow\">E375</a></td>\n" +
            "<td style=\"text-align:right\">26</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e420\" class=\"tag known\" rel=\"nofollow\">E420</a></td>\n" +
            "<td style=\"text-align:right\">25</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e450i\" class=\"tag known\" rel=\"nofollow\">E450i</a></td>\n" +
            "<td style=\"text-align:right\">25</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/palm\" class=\"tag known\" rel=\"nofollow\">Palm</a></td>\n" +
            "<td style=\"text-align:right\">25</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/alcohol-vinegar\" class=\"tag known\" rel=\"nofollow\">Alcohol vinegar</a></td>\n" +
            "<td style=\"text-align:right\">25</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sesame\" class=\"tag known\" rel=\"nofollow\">Sesame</a></td>\n" +
            "<td style=\"text-align:right\">25</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soy-protein\" class=\"tag known\" rel=\"nofollow\">Soy protein</a></td>\n" +
            "<td style=\"text-align:right\">25</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/peanut\" class=\"tag known\" rel=\"nofollow\">Peanut</a></td>\n" +
            "<td style=\"text-align:right\">25</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e950\" class=\"tag known\" rel=\"nofollow\">E950</a></td>\n" +
            "<td style=\"text-align:right\">24</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/thiamin\" class=\"tag known\" rel=\"nofollow\">Thiamin</a></td>\n" +
            "<td style=\"text-align:right\">24</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tapioca\" class=\"tag known\" rel=\"nofollow\">Tapioca</a></td>\n" +
            "<td style=\"text-align:right\">24</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chopped-tomatoes\" class=\"tag known\" rel=\"nofollow\">Chopped tomatoes</a></td>\n" +
            "<td style=\"text-align:right\">24</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tomato-concentrate\" class=\"tag known\" rel=\"nofollow\">Tomato concentrate</a></td>\n" +
            "<td style=\"text-align:right\">24</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vitamin-d\" class=\"tag known\" rel=\"nofollow\">Vitamin D</a></td>\n" +
            "<td style=\"text-align:right\">23</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e466\" class=\"tag known\" rel=\"nofollow\">E466</a></td>\n" +
            "<td style=\"text-align:right\">23</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coating\" class=\"tag known\" rel=\"nofollow\">Coating</a></td>\n" +
            "<td style=\"text-align:right\">23</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spirit-vinegar\" class=\"tag known\" rel=\"nofollow\">Spirit vinegar</a></td>\n" +
            "<td style=\"text-align:right\">23</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vanilla-extract\" class=\"tag known\" rel=\"nofollow\">Vanilla extract</a></td>\n" +
            "<td style=\"text-align:right\">23</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/orange-juice\" class=\"tag known\" rel=\"nofollow\">Orange juice</a></td>\n" +
            "<td style=\"text-align:right\">23</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mango\" class=\"tag known\" rel=\"nofollow\">Mango</a></td>\n" +
            "<td style=\"text-align:right\">23</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tomato-puree\" class=\"tag known\" rel=\"nofollow\">Tomato purée</a></td>\n" +
            "<td style=\"text-align:right\">23</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e101\" class=\"tag known\" rel=\"nofollow\">E101</a></td>\n" +
            "<td style=\"text-align:right\">23</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pasteurised-milk\" class=\"tag known\" rel=\"nofollow\">Pasteurised milk</a></td>\n" +
            "<td style=\"text-align:right\">23</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mushroom\" class=\"tag known\" rel=\"nofollow\">Mushroom</a></td>\n" +
            "<td style=\"text-align:right\">22</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-egg\" class=\"tag known\" rel=\"nofollow\">Whole egg</a></td>\n" +
            "<td style=\"text-align:right\">22</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/turmeric\" class=\"tag known\" rel=\"nofollow\">Turmeric</a></td>\n" +
            "<td style=\"text-align:right\">22</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/garlic-powder\" class=\"tag known\" rel=\"nofollow\">Garlic powder</a></td>\n" +
            "<td style=\"text-align:right\">22</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken\" class=\"tag known\" rel=\"nofollow\">Chicken</a></td>\n" +
            "<td style=\"text-align:right\">22</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wine-vinegar\" class=\"tag known\" rel=\"nofollow\">Wine vinegar</a></td>\n" +
            "<td style=\"text-align:right\">22</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e331\" class=\"tag known\" rel=\"nofollow\">E331</a></td>\n" +
            "<td style=\"text-align:right\">22</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e316\" class=\"tag known\" rel=\"nofollow\">E316</a></td>\n" +
            "<td style=\"text-align:right\">21</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beef-meat\" class=\"tag known\" rel=\"nofollow\">Beef meat</a></td>\n" +
            "<td style=\"text-align:right\">21</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/strawberry\" class=\"tag known\" rel=\"nofollow\">Strawberry</a></td>\n" +
            "<td style=\"text-align:right\">21</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-wheat-flour\" class=\"tag known\" rel=\"nofollow\">Whole wheat flour</a></td>\n" +
            "<td style=\"text-align:right\">21</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e150a\" class=\"tag known\" rel=\"nofollow\">E150a</a></td>\n" +
            "<td style=\"text-align:right\">21</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/folate\" class=\"tag known\" rel=\"nofollow\">Folate</a></td>\n" +
            "<td style=\"text-align:right\">21</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nutmeg\" class=\"tag known\" rel=\"nofollow\">Nutmeg</a></td>\n" +
            "<td style=\"text-align:right\">21</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/herbs-and-spices\" class=\"tag known\" rel=\"nofollow\">Herbs and spices</a></td>\n" +
            "<td style=\"text-align:right\">20</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e150\" class=\"tag known\" rel=\"nofollow\">E150</a></td>\n" +
            "<td style=\"text-align:right\">20</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/peach\" class=\"tag known\" rel=\"nofollow\">Peach</a></td>\n" +
            "<td style=\"text-align:right\">20</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e296\" class=\"tag known\" rel=\"nofollow\">E296</a></td>\n" +
            "<td style=\"text-align:right\">20</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/folic-acid\" class=\"tag known\" rel=\"nofollow\">Folic acid</a></td>\n" +
            "<td style=\"text-align:right\">20</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sulfite\" class=\"tag known\" rel=\"nofollow\">Sulfite</a></td>\n" +
            "<td style=\"text-align:right\">20</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mineral-water\" class=\"tag known\" rel=\"nofollow\">Mineral water</a></td>\n" +
            "<td style=\"text-align:right\">20</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fresh-cream\" class=\"tag known\" rel=\"nofollow\">Fresh cream</a></td>\n" +
            "<td style=\"text-align:right\">20</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rosemary\" class=\"tag known\" rel=\"nofollow\">Rosemary</a></td>\n" +
            "<td style=\"text-align:right\">20</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/iron\" class=\"tag known\" rel=\"nofollow\">Iron</a></td>\n" +
            "<td style=\"text-align:right\">20</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/apple-juice\" class=\"tag known\" rel=\"nofollow\">Apple juice</a></td>\n" +
            "<td style=\"text-align:right\">20</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e1404\" class=\"tag known\" rel=\"nofollow\">E1404</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-wine\" class=\"tag known\" rel=\"nofollow\">White wine</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/humectant\" class=\"tag known\" rel=\"nofollow\">Humectant</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e955\" class=\"tag known\" rel=\"nofollow\">E955</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e903\" class=\"tag known\" rel=\"nofollow\">E903</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milk-chocolate\" class=\"tag known\" rel=\"nofollow\">Milk chocolate</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/baker-s-yeast\" class=\"tag known\" rel=\"nofollow\">Baker's yeast</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rapeseed\" class=\"tag known\" rel=\"nofollow\">Rapeseed</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vitamin-b6\" class=\"tag known\" rel=\"nofollow\">Vitamin B6</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fresh-egg\" class=\"tag known\" rel=\"nofollow\">Fresh egg</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soya-flour\" class=\"tag known\" rel=\"nofollow\">Soya flour</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/smoke\" class=\"tag known\" rel=\"nofollow\">Smoke</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-pepper\" class=\"tag known\" rel=\"nofollow\">White pepper</a></td>\n" +
            "<td style=\"text-align:right\">19</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e211\" class=\"tag known\" rel=\"nofollow\">E211</a></td>\n" +
            "<td style=\"text-align:right\">18</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/blueberry\" class=\"tag known\" rel=\"nofollow\">Blueberry</a></td>\n" +
            "<td style=\"text-align:right\">18</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e503ii\" class=\"tag known\" rel=\"nofollow\">E503ii</a></td>\n" +
            "<td style=\"text-align:right\">18</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e252\" class=\"tag known\" rel=\"nofollow\">E252</a></td>\n" +
            "<td style=\"text-align:right\">18</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e392\" class=\"tag known\" rel=\"nofollow\">E392</a></td>\n" +
            "<td style=\"text-align:right\">18</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sunflower-seed\" class=\"tag known\" rel=\"nofollow\">Sunflower seed</a></td>\n" +
            "<td style=\"text-align:right\">17</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e100\" class=\"tag known\" rel=\"nofollow\">E100</a></td>\n" +
            "<td style=\"text-align:right\">17</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lemon-juice-concentrate\" class=\"tag known\" rel=\"nofollow\">Lemon juice concentrate</a></td>\n" +
            "<td style=\"text-align:right\">17</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ginger\" class=\"tag known\" rel=\"nofollow\">Ginger</a></td>\n" +
            "<td style=\"text-align:right\">17</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pineapple\" class=\"tag known\" rel=\"nofollow\">Pineapple</a></td>\n" +
            "<td style=\"text-align:right\">17</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/crushed-tomato\" class=\"tag known\" rel=\"nofollow\">Crushed tomato</a></td>\n" +
            "<td style=\"text-align:right\">17</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-lemon-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural lemon flavouring</a></td>\n" +
            "<td style=\"text-align:right\">17</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e160ai\" class=\"tag known\" rel=\"nofollow\">E160ai</a></td>\n" +
            "<td style=\"text-align:right\">16</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lactose-and-milk-proteins\" class=\"tag known\" rel=\"nofollow\">Lactose and milk proteins</a></td>\n" +
            "<td style=\"text-align:right\">16</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bacon\" class=\"tag known\" rel=\"nofollow\">Bacon</a></td>\n" +
            "<td style=\"text-align:right\">16</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-meat\" class=\"tag known\" rel=\"nofollow\">Chicken meat</a></td>\n" +
            "<td style=\"text-align:right\">16</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/broth\" class=\"tag known\" rel=\"nofollow\">Broth</a></td>\n" +
            "<td style=\"text-align:right\">16</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e163\" class=\"tag known\" rel=\"nofollow\">E163</a></td>\n" +
            "<td style=\"text-align:right\">16</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/shellfish\" class=\"tag known\" rel=\"nofollow\">Shellfish</a></td>\n" +
            "<td style=\"text-align:right\">16</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e341\" class=\"tag known\" rel=\"nofollow\">E341</a></td>\n" +
            "<td style=\"text-align:right\">16</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cucumber\" class=\"tag known\" rel=\"nofollow\">Cucumber</a></td>\n" +
            "<td style=\"text-align:right\">16</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-fat\" class=\"tag known\" rel=\"nofollow\">Pork fat</a></td>\n" +
            "<td style=\"text-align:right\">16</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e282\" class=\"tag known\" rel=\"nofollow\">E282</a></td>\n" +
            "<td style=\"text-align:right\">16</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tea\" class=\"tag known\" rel=\"nofollow\">Tea</a></td>\n" +
            "<td style=\"text-align:right\">16</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coconut-fat\" class=\"tag known\" rel=\"nofollow\">Coconut fat</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fat-reduced-cocoa\" class=\"tag known\" rel=\"nofollow\">Fat reduced cocoa</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rye\" class=\"tag known\" rel=\"nofollow\">Rye</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/carbonated-water\" class=\"tag known\" rel=\"nofollow\">Carbonated water</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/blackcurrant\" class=\"tag known\" rel=\"nofollow\">Blackcurrant</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pea\" class=\"tag known\" rel=\"nofollow\">Pea</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/flour-treatment-agent\" class=\"tag known\" rel=\"nofollow\">Flour treatment agent</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/shallot\" class=\"tag known\" rel=\"nofollow\">Shallot</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pear\" class=\"tag known\" rel=\"nofollow\">Pear</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/oregano\" class=\"tag known\" rel=\"nofollow\">Oregano</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/leek\" class=\"tag known\" rel=\"nofollow\">Leek</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sodium\" class=\"tag known\" rel=\"nofollow\">Sodium</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/condensed-milk\" class=\"tag known\" rel=\"nofollow\">Condensed milk</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-bell-pepper\" class=\"tag known\" rel=\"nofollow\">Red bell pepper</a></td>\n" +
            "<td style=\"text-align:right\">15</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/semi-skimmed-milk\" class=\"tag known\" rel=\"nofollow\">Semi-skimmed milk</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coffee\" class=\"tag known\" rel=\"nofollow\">Coffee</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/banana\" class=\"tag known\" rel=\"nofollow\">Banana</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bread-crumbs\" class=\"tag known\" rel=\"nofollow\">Bread crumbs</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/margarine\" class=\"tag known\" rel=\"nofollow\">Margarine</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e160\" class=\"tag known\" rel=\"nofollow\">E160</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/clove\" class=\"tag known\" rel=\"nofollow\">Clove</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ham\" class=\"tag known\" rel=\"nofollow\">Ham</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chocolate-powder\" class=\"tag known\" rel=\"nofollow\">Chocolate powder</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/anti-caking-agent\" class=\"tag known\" rel=\"nofollow\">Anti-caking agent</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-mineral-water\" class=\"tag known\" rel=\"nofollow\">Natural mineral water</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e306\" class=\"tag known\" rel=\"nofollow\">E306</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cumin-seeds\" class=\"tag known\" rel=\"nofollow\">Cumin seeds</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/salt-from-guerande\" class=\"tag known\" rel=\"nofollow\">Salt from Guérande</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e262\" class=\"tag known\" rel=\"nofollow\">E262</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rye-flour\" class=\"tag known\" rel=\"nofollow\">Rye flour</a></td>\n" +
            "<td style=\"text-align:right\">14</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/palm-kernel-oil-and-fat\" class=\"tag known\" rel=\"nofollow\">Palm kernel oil and fat</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-fish\" class=\"tag known\" rel=\"nofollow\">White fish</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-malt\" class=\"tag known\" rel=\"nofollow\">Wheat malt</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vitamin-b12\" class=\"tag known\" rel=\"nofollow\">Vitamin B12</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e224\" class=\"tag known\" rel=\"nofollow\">E224</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/agave-syrup\" class=\"tag known\" rel=\"nofollow\">Agave syrup</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fruit-pectin\" class=\"tag known\" rel=\"nofollow\">Fruit pectin</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e951\" class=\"tag known\" rel=\"nofollow\">E951</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vitamin-c\" class=\"tag known\" rel=\"nofollow\">Vitamin C</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/flax\" class=\"tag known\" rel=\"nofollow\">Flax</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spinach\" class=\"tag known\" rel=\"nofollow\">Spinach</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/modified-tapioca-starch\" class=\"tag known\" rel=\"nofollow\">Modified tapioca starch</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/flavouring-preparation\" class=\"tag known\" rel=\"nofollow\">Flavouring preparation</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/champignon\" class=\"tag known\" rel=\"nofollow\">Champignon</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vanillin\" class=\"tag known\" rel=\"nofollow\">Vanillin</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bay-leaf\" class=\"tag known\" rel=\"nofollow\">Bay leaf</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e464\" class=\"tag known\" rel=\"nofollow\">E464</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/courgette\" class=\"tag known\" rel=\"nofollow\">Courgette</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n";

    public static String split2 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/tomato-powder\" class=\"tag known\" rel=\"nofollow\">Tomato powder</a></td>\n" +
            "<td style=\"text-align:right\">13</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vitamin-e\" class=\"tag known\" rel=\"nofollow\">Vitamin E</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/caramelised-sugar\" class=\"tag known\" rel=\"nofollow\">Caramelised sugar</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/smoke-flavouring\" class=\"tag known\" rel=\"nofollow\">Smoke flavouring</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cornmeal\" class=\"tag known\" rel=\"nofollow\">Cornmeal</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/raisin\" class=\"tag known\" rel=\"nofollow\">Raisin</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sodium-citrate\" class=\"tag known\" rel=\"nofollow\">Sodium citrate</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brown-rice\" class=\"tag known\" rel=\"nofollow\">Brown rice</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e451\" class=\"tag known\" rel=\"nofollow\">E451</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pantothenic-acid\" class=\"tag known\" rel=\"nofollow\">Pantothenic Acid</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chives\" class=\"tag known\" rel=\"nofollow\">Chives</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/olives\" class=\"tag known\" rel=\"nofollow\">Olives</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beetroot\" class=\"tag known\" rel=\"nofollow\">Beetroot</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e170\" class=\"tag known\" rel=\"nofollow\">E170</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/filling\" class=\"tag known\" rel=\"nofollow\">Filling</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/shea-butter\" class=\"tag known\" rel=\"nofollow\">Shea butter</a></td>\n" +
            "<td style=\"text-align:right\">12</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/orange-zest\" class=\"tag known\" rel=\"nofollow\">Orange zest</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:W%C3%BCrze\" class=\"tag known\" rel=\"nofollow\">de:Würze</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/salmon\" class=\"tag known\" rel=\"nofollow\">Salmon</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/elder\" class=\"tag known\" rel=\"nofollow\">Elder</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fresh-milk\" class=\"tag known\" rel=\"nofollow\">Fresh milk</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tomato-juice\" class=\"tag known\" rel=\"nofollow\">Tomato juice</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cashew-nuts\" class=\"tag known\" rel=\"nofollow\">Cashew nuts</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pumpkin\" class=\"tag known\" rel=\"nofollow\">Pumpkin</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/carob-seeds\" class=\"tag known\" rel=\"nofollow\">Carob seeds</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sourdough\" class=\"tag known\" rel=\"nofollow\">Sourdough</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dijon-mustard\" class=\"tag known\" rel=\"nofollow\">Dijon mustard</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetarian-rennet\" class=\"tag known\" rel=\"nofollow\">Vegetarian rennet</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/palm-kernel-oil\" class=\"tag known\" rel=\"nofollow\">Palm kernel oil</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/microbial-rennet\" class=\"tag known\" rel=\"nofollow\">Microbial rennet</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tuna\" class=\"tag known\" rel=\"nofollow\">Tuna</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/salad\" class=\"tag known\" rel=\"nofollow\">Salad</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-apple-juice\" class=\"tag known\" rel=\"nofollow\">Concentrated apple juice</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dill\" class=\"tag known\" rel=\"nofollow\">Dill</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e160b\" class=\"tag known\" rel=\"nofollow\">E160b</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sweet-whey\" class=\"tag known\" rel=\"nofollow\">Sweet whey</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/flax-seed\" class=\"tag known\" rel=\"nofollow\">Flax seed</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chocolate-pieces\" class=\"tag known\" rel=\"nofollow\">Chocolate pieces</a></td>\n" +
            "<td style=\"text-align:right\">11</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/apricot\" class=\"tag known\" rel=\"nofollow\">Apricot</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e171\" class=\"tag known\" rel=\"nofollow\">E171</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e965\" class=\"tag known\" rel=\"nofollow\">E965</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e452\" class=\"tag known\" rel=\"nofollow\">E452</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mango-puree\" class=\"tag known\" rel=\"nofollow\">Mango puree</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mint\" class=\"tag known\" rel=\"nofollow\">Mint</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/marjoram\" class=\"tag known\" rel=\"nofollow\">Marjoram</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sweet-whey-powder\" class=\"tag known\" rel=\"nofollow\">Sweet whey powder</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soy-sauce\" class=\"tag known\" rel=\"nofollow\">Soy sauce</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e200\" class=\"tag known\" rel=\"nofollow\">E200</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e476\" class=\"tag known\" rel=\"nofollow\">E476</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/safflower\" class=\"tag known\" rel=\"nofollow\">Safflower</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/raw-milk\" class=\"tag known\" rel=\"nofollow\">Raw milk</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e917\" class=\"tag known\" rel=\"nofollow\">E917</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e509\" class=\"tag known\" rel=\"nofollow\">E509</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/barley-flour\" class=\"tag known\" rel=\"nofollow\">Barley flour</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e472e\" class=\"tag known\" rel=\"nofollow\">E472e</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/must\" class=\"tag known\" rel=\"nofollow\">Must</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sesame-seeds\" class=\"tag known\" rel=\"nofollow\">Sesame seeds</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mollusc\" class=\"tag known\" rel=\"nofollow\">Mollusc</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/powdered-egg-white\" class=\"tag known\" rel=\"nofollow\">Powdered egg white</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/gherkin\" class=\"tag known\" rel=\"nofollow\">Gherkin</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/raspberry-puree\" class=\"tag known\" rel=\"nofollow\">Raspberry puree</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fennel\" class=\"tag known\" rel=\"nofollow\">Fennel</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e170i\" class=\"tag known\" rel=\"nofollow\">E170i</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/blackberry\" class=\"tag known\" rel=\"nofollow\">Blackberry</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e260\" class=\"tag known\" rel=\"nofollow\">E260</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sucrose\" class=\"tag known\" rel=\"nofollow\">Sucrose</a></td>\n" +
            "<td style=\"text-align:right\">10</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/grape-sugar\" class=\"tag known\" rel=\"nofollow\">Grape sugar</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/anchovy\" class=\"tag known\" rel=\"nofollow\">Anchovy</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/condensed-skimmed-milk\" class=\"tag known\" rel=\"nofollow\">Condensed skimmed milk</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-bran\" class=\"tag known\" rel=\"nofollow\">Wheat bran</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vitamin-a\" class=\"tag known\" rel=\"nofollow\">Vitamin A</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/crustacean\" class=\"tag known\" rel=\"nofollow\">Crustacean</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-orange-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural orange flavouring</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fruit-juice-concentrate\" class=\"tag known\" rel=\"nofollow\">Fruit juice concentrate</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e150d\" class=\"tag known\" rel=\"nofollow\">E150d</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/syrup\" class=\"tag known\" rel=\"nofollow\">Syrup</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/turkey\" class=\"tag known\" rel=\"nofollow\">Turkey</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/carob-seed-flour\" class=\"tag known\" rel=\"nofollow\">Carob seed flour</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/emulsifying-salts\" class=\"tag known\" rel=\"nofollow\">Emulsifying salts</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beech-wood-smoke\" class=\"tag known\" rel=\"nofollow\">Beech wood smoke</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fresh-whole-milk\" class=\"tag known\" rel=\"nofollow\">Fresh whole milk</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:condimente\" class=\"tag user_defined\" rel=\"nofollow\">ro:condimente</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/poultry-fat\" class=\"tag known\" rel=\"nofollow\">Poultry fat</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lentils\" class=\"tag known\" rel=\"nofollow\">Lentils</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e339\" class=\"tag known\" rel=\"nofollow\">E339</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e501\" class=\"tag known\" rel=\"nofollow\">E501</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nutmeg-nut\" class=\"tag known\" rel=\"nofollow\">Nutmeg nut</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dark-chocolate\" class=\"tag known\" rel=\"nofollow\">Dark chocolate</a></td>\n" +
            "<td style=\"text-align:right\">9</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/liquorice\" class=\"tag known\" rel=\"nofollow\">Liquorice</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-wine-vinegar\" class=\"tag known\" rel=\"nofollow\">White wine vinegar</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-glucose-syrup\" class=\"tag known\" rel=\"nofollow\">Wheat glucose syrup</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bulking-agent\" class=\"tag known\" rel=\"nofollow\">Bulking agent</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e338\" class=\"tag known\" rel=\"nofollow\">E338</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/double-concentrated-tomato\" class=\"tag known\" rel=\"nofollow\">Double concentrated tomato</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pasteurised-cow-s-milk\" class=\"tag known\" rel=\"nofollow\">Pasteurised cow's milk</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/herring\" class=\"tag known\" rel=\"nofollow\">Herring</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chickpea\" class=\"tag known\" rel=\"nofollow\">Chickpea</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/aubergine\" class=\"tag known\" rel=\"nofollow\">Aubergine</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/orange-juice-from-concentrate\" class=\"tag known\" rel=\"nofollow\">Orange juice from concentrate</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/potato-flakes\" class=\"tag known\" rel=\"nofollow\">Potato flakes</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/apple-fiber\" class=\"tag known\" rel=\"nofollow\">Apple fiber</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brown-sugar\" class=\"tag known\" rel=\"nofollow\">Brown sugar</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/turkey-meat\" class=\"tag known\" rel=\"nofollow\">Turkey meat</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/molasses\" class=\"tag known\" rel=\"nofollow\">Molasses</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cheese-powder\" class=\"tag known\" rel=\"nofollow\">Cheese powder</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hazelnut-paste\" class=\"tag known\" rel=\"nofollow\">Hazelnut paste</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pumpkin-seed\" class=\"tag known\" rel=\"nofollow\">Pumpkin seed</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cholecalciferol\" class=\"tag known\" rel=\"nofollow\">Cholecalciferol</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/reconstituted-skimmed-milk\" class=\"tag known\" rel=\"nofollow\">Reconstituted skimmed milk</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/walnut\" class=\"tag known\" rel=\"nofollow\">Walnut</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/malted-wheat-flour\" class=\"tag known\" rel=\"nofollow\">Malted wheat flour</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:oregano\" class=\"tag user_defined\" rel=\"nofollow\">de:oregano</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/atlantic-salmon\" class=\"tag known\" rel=\"nofollow\">Atlantic salmon</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/black-tea\" class=\"tag known\" rel=\"nofollow\">Black tea</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e327\" class=\"tag known\" rel=\"nofollow\">E327</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e631\" class=\"tag known\" rel=\"nofollow\">E631</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e401\" class=\"tag known\" rel=\"nofollow\">E401</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/buckwheat\" class=\"tag known\" rel=\"nofollow\">Buckwheat</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/biotin\" class=\"tag known\" rel=\"nofollow\">Biotin</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/oil\" class=\"tag known\" rel=\"nofollow\">Oil</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/duck\" class=\"tag known\" rel=\"nofollow\">Duck</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/atlantic-herring\" class=\"tag known\" rel=\"nofollow\">Atlantic herring</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tapioca-starch\" class=\"tag user_defined\" rel=\"nofollow\">tapioca-starch</a></td>\n" +
            "<td style=\"text-align:right\">8</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cayenne-pepper\" class=\"tag known\" rel=\"nofollow\">Cayenne pepper</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spirulina\" class=\"tag known\" rel=\"nofollow\">Spirulina</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/baking-powder\" class=\"tag known\" rel=\"nofollow\">Baking powder</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-protein\" class=\"tag known\" rel=\"nofollow\">Wheat protein</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lime-juice\" class=\"tag known\" rel=\"nofollow\">Lime juice</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-breast\" class=\"tag known\" rel=\"nofollow\">Pork breast</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/corn-flakes\" class=\"tag known\" rel=\"nofollow\">Corn flakes</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-fiber\" class=\"tag known\" rel=\"nofollow\">Wheat fiber</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e627\" class=\"tag known\" rel=\"nofollow\">E627</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pasteurised-whole-milk\" class=\"tag known\" rel=\"nofollow\">Pasteurised whole milk</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/casing\" class=\"tag known\" rel=\"nofollow\">Casing</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-egg\" class=\"tag known\" rel=\"nofollow\">Chicken egg</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e161b\" class=\"tag known\" rel=\"nofollow\">E161b</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zinc\" class=\"tag known\" rel=\"nofollow\">Zinc</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/raspberry-juice\" class=\"tag known\" rel=\"nofollow\">Raspberry juice</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-juice\" class=\"tag known\" rel=\"nofollow\">Vegetable juice</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/green-olives\" class=\"tag known\" rel=\"nofollow\">Green olives</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whey-protein\" class=\"tag known\" rel=\"nofollow\">Whey protein</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/alaska-pollock\" class=\"tag known\" rel=\"nofollow\">Alaska pollock</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/condiment\" class=\"tag known\" rel=\"nofollow\">Condiment</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lard\" class=\"tag known\" rel=\"nofollow\">Lard</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e524\" class=\"tag known\" rel=\"nofollow\">E524</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/curry\" class=\"tag known\" rel=\"nofollow\">Curry</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/herring-fillet\" class=\"tag known\" rel=\"nofollow\">Herring fillet</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-chili-pepper\" class=\"tag known\" rel=\"nofollow\">Red chili pepper</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e334\" class=\"tag known\" rel=\"nofollow\">E334</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/raw-cow-s-milk\" class=\"tag known\" rel=\"nofollow\">Raw cow's milk</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e1103\" class=\"tag known\" rel=\"nofollow\">E1103</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cherry\" class=\"tag known\" rel=\"nofollow\">Cherry</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/green-lentils\" class=\"tag known\" rel=\"nofollow\">Green lentils</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/animal-based-rennet\" class=\"tag known\" rel=\"nofollow\">Animal-based rennet</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dehydrated-onion\" class=\"tag known\" rel=\"nofollow\">Dehydrated onion</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e133\" class=\"tag known\" rel=\"nofollow\">E133</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/herb-extract\" class=\"tag known\" rel=\"nofollow\">Herb extract</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e904\" class=\"tag known\" rel=\"nofollow\">E904</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/emmental\" class=\"tag known\" rel=\"nofollow\">Emmental</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/green-peas\" class=\"tag known\" rel=\"nofollow\">Green peas</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whey-product\" class=\"tag known\" rel=\"nofollow\">Whey product</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/green-bean\" class=\"tag known\" rel=\"nofollow\">Green bean</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pea-protein\" class=\"tag known\" rel=\"nofollow\">Pea protein</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e223\" class=\"tag known\" rel=\"nofollow\">E223</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pasta\" class=\"tag known\" rel=\"nofollow\">Pasta</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e461\" class=\"tag known\" rel=\"nofollow\">E461</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/breast\" class=\"tag known\" rel=\"nofollow\">Breast</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/garden-peas\" class=\"tag known\" rel=\"nofollow\">Garden peas</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-raspberry-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural raspberry flavouring</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/caramel-syrup\" class=\"tag known\" rel=\"nofollow\">Caramel syrup</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soya-oil\" class=\"tag known\" rel=\"nofollow\">Soya oil</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e901\" class=\"tag known\" rel=\"nofollow\">E901</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e1105\" class=\"tag known\" rel=\"nofollow\">E1105</a></td>\n" +
            "<td style=\"text-align:right\">7</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/green-bell-pepper\" class=\"tag known\" rel=\"nofollow\">Green bell pepper</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/high-oleic-sunflower-oil\" class=\"tag known\" rel=\"nofollow\">High oleic sunflower oil</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coconut-flakes\" class=\"tag known\" rel=\"nofollow\">Coconut flakes</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/green-pepper\" class=\"tag known\" rel=\"nofollow\">Green pepper</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/juice\" class=\"tag known\" rel=\"nofollow\">Juice</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicory\" class=\"tag known\" rel=\"nofollow\">Chicory</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/strawberry-puree\" class=\"tag known\" rel=\"nofollow\">Strawberry puree</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e102\" class=\"tag known\" rel=\"nofollow\">E102</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dehydrated-glucose-syrup\" class=\"tag known\" rel=\"nofollow\">Dehydrated glucose syrup</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/glaze\" class=\"tag known\" rel=\"nofollow\">Glaze</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cooking-water\" class=\"tag known\" rel=\"nofollow\">Cooking water</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e333\" class=\"tag known\" rel=\"nofollow\">E333</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milk-fat-substitute\" class=\"tag known\" rel=\"nofollow\">Milk fat substitute</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e304\" class=\"tag known\" rel=\"nofollow\">E304</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/biscuit\" class=\"tag known\" rel=\"nofollow\">Biscuit</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whipping-cream\" class=\"tag known\" rel=\"nofollow\">Whipping cream</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e511\" class=\"tag known\" rel=\"nofollow\">E511</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mild-yogurt\" class=\"tag known\" rel=\"nofollow\">Mild yogurt</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wholemeal-rye-flour\" class=\"tag known\" rel=\"nofollow\">Wholemeal rye flour</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:sahnepulver\" class=\"tag user_defined\" rel=\"nofollow\">de:sahnepulver</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/passion-fruit\" class=\"tag user_defined\" rel=\"nofollow\">passion-fruit</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lardon\" class=\"tag known\" rel=\"nofollow\">Lardon</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/apple-juice-from-concentrate\" class=\"tag known\" rel=\"nofollow\">Apple juice from concentrate</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e385\" class=\"tag known\" rel=\"nofollow\">E385</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e110\" class=\"tag known\" rel=\"nofollow\">E110</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pineapple-juice\" class=\"tag known\" rel=\"nofollow\">Pineapple juice</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-powdered-egg\" class=\"tag known\" rel=\"nofollow\">Whole powdered egg</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/gum-base\" class=\"tag known\" rel=\"nofollow\">Gum base</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-gelatin\" class=\"tag known\" rel=\"nofollow\">Pork gelatin</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrate\" class=\"tag known\" rel=\"nofollow\">Concentrate</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rice-syrup\" class=\"tag known\" rel=\"nofollow\">Rice syrup</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-fat\" class=\"tag known\" rel=\"nofollow\">Chicken fat</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e445\" class=\"tag known\" rel=\"nofollow\">E445</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/corn-syrup\" class=\"tag known\" rel=\"nofollow\">Corn syrup</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/grapefruit\" class=\"tag known\" rel=\"nofollow\">Grapefruit</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-grape-must\" class=\"tag known\" rel=\"nofollow\">Concentrated grape must</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/caffeine\" class=\"tag known\" rel=\"nofollow\">Caffeine</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-flakes\" class=\"tag known\" rel=\"nofollow\">Wheat flakes</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cranberry\" class=\"tag known\" rel=\"nofollow\">Cranberry</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-liver\" class=\"tag known\" rel=\"nofollow\">Pork liver</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lemongrass\" class=\"tag known\" rel=\"nofollow\">Lemongrass</a></td>\n" +
            "<td style=\"text-align:right\">6</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/malt-extract\" class=\"tag known\" rel=\"nofollow\">Malt extract</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e1510\" class=\"tag known\" rel=\"nofollow\">E1510</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e965ii\" class=\"tag known\" rel=\"nofollow\">E965ii</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e472c\" class=\"tag known\" rel=\"nofollow\">E472c</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hop-extract\" class=\"tag known\" rel=\"nofollow\">Hop extract</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lysozyme-from-eggs\" class=\"tag known\" rel=\"nofollow\">Lysozyme from eggs</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e420ii\" class=\"tag known\" rel=\"nofollow\">E420ii</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e500i\" class=\"tag known\" rel=\"nofollow\">E500i</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tofu\" class=\"tag known\" rel=\"nofollow\">Tofu</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e141\" class=\"tag known\" rel=\"nofollow\">E141</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:allergenes-presents\" class=\"tag user_defined\" rel=\"nofollow\">fr:allergenes-presents</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-beetroot\" class=\"tag known\" rel=\"nofollow\">Red beetroot</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e516\" class=\"tag known\" rel=\"nofollow\">E516</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/duck-liver\" class=\"tag known\" rel=\"nofollow\">Duck liver</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:fett-i\" class=\"tag user_defined\" rel=\"nofollow\">de:fett-i</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-orange-juice\" class=\"tag known\" rel=\"nofollow\">Concentrated orange juice</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/black-olive\" class=\"tag known\" rel=\"nofollow\">Black olive</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/edam\" class=\"tag known\" rel=\"nofollow\">Edam</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cod\" class=\"tag known\" rel=\"nofollow\">Cod</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/superior-quality-durum-wheat-semolina\" class=\"tag known\" rel=\"nofollow\">Superior quality durum wheat semolina</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sheeps-casing\" class=\"tag known\" rel=\"nofollow\">Sheeps casing</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lactic-and-aging-ferments\" class=\"tag known\" rel=\"nofollow\">Lactic and aging ferments</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/acerola\" class=\"tag known\" rel=\"nofollow\">Acerola</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/savory\" class=\"tag known\" rel=\"nofollow\">Savory</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cardamom\" class=\"tag known\" rel=\"nofollow\">Cardamom</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/potato-powder\" class=\"tag known\" rel=\"nofollow\">Potato powder</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cooked-rice\" class=\"tag known\" rel=\"nofollow\">Cooked rice</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e470b\" class=\"tag known\" rel=\"nofollow\">E470b</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/inulin\" class=\"tag known\" rel=\"nofollow\">Inulin</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/oat-flour\" class=\"tag known\" rel=\"nofollow\">Oat flour</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/herbes-de-provence\" class=\"tag known\" rel=\"nofollow\">Herbes de Provence</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fruit-concentrates\" class=\"tag known\" rel=\"nofollow\">Fruit concentrates</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pyridoxine-hydrochloride\" class=\"tag known\" rel=\"nofollow\">Pyridoxine hydrochloride</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/capers\" class=\"tag known\" rel=\"nofollow\">Capers</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-malt-flour\" class=\"tag known\" rel=\"nofollow\">Wheat malt flour</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/smoked-lardoons\" class=\"tag known\" rel=\"nofollow\">Smoked lardoons</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/grape-juice\" class=\"tag known\" rel=\"nofollow\">Grape juice</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coagulant\" class=\"tag known\" rel=\"nofollow\">Coagulant</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e460\" class=\"tag known\" rel=\"nofollow\">E460</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tr\" class=\"tag user_defined\" rel=\"nofollow\">de:tr</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fructose-syrup\" class=\"tag known\" rel=\"nofollow\">Fructose syrup</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tomato-pulp\" class=\"tag known\" rel=\"nofollow\">Tomato pulp</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vermouth\" class=\"tag user_defined\" rel=\"nofollow\">fr:vermouth</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/redcurrant\" class=\"tag known\" rel=\"nofollow\">Redcurrant</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/egg-powder\" class=\"tag known\" rel=\"nofollow\">Egg powder</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e551\" class=\"tag known\" rel=\"nofollow\">E551</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-pepper-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural pepper flavouring</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/apple-puree\" class=\"tag known\" rel=\"nofollow\">Apple purée</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:l\" class=\"tag user_defined\" rel=\"nofollow\">fr:l</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e967\" class=\"tag known\" rel=\"nofollow\">E967</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e472b\" class=\"tag known\" rel=\"nofollow\">E472b</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fruit-extract\" class=\"tag known\" rel=\"nofollow\">Fruit extract</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e220\" class=\"tag known\" rel=\"nofollow\">E220</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:denree-alimentaire-colorante\" class=\"tag known\" rel=\"nofollow\">fr:Denrée alimentaire colorante</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/refined-sunflower-oil\" class=\"tag known\" rel=\"nofollow\">Refined sunflower oil</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-yogurt\" class=\"tag known\" rel=\"nofollow\">Whole yogurt</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cyanocobalamin\" class=\"tag known\" rel=\"nofollow\">Cyanocobalamin</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/essential-oil\" class=\"tag known\" rel=\"nofollow\">Essential oil</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:joghurterzeugnis\" class=\"tag known\" rel=\"nofollow\">de:Joghurterzeugnis</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-rind\" class=\"tag known\" rel=\"nofollow\">Pork rind</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bread\" class=\"tag known\" rel=\"nofollow\">Bread</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e262i\" class=\"tag known\" rel=\"nofollow\">E262i</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/melted-cheese\" class=\"tag known\" rel=\"nofollow\">Melted cheese</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/buckwheat-flour\" class=\"tag known\" rel=\"nofollow\">Buckwheat flour</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-fruits\" class=\"tag known\" rel=\"nofollow\">Red fruits</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/elderberry\" class=\"tag known\" rel=\"nofollow\">Elderberry</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cheddar\" class=\"tag known\" rel=\"nofollow\">Cheddar</a></td>\n" +
            "<td style=\"text-align:right\">5</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/quinoa\" class=\"tag known\" rel=\"nofollow\">Quinoa</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/quark\" class=\"tag known\" rel=\"nofollow\">Quark</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fleur-de-sel-from-guerande\" class=\"tag known\" rel=\"nofollow\">Fleur de sel from Guérande</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mackerel\" class=\"tag known\" rel=\"nofollow\">Mackerel</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/peach-puree\" class=\"tag known\" rel=\"nofollow\">Peach puree</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cow-cheese\" class=\"tag known\" rel=\"nofollow\">Cow cheese</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/barley-malt-flour\" class=\"tag known\" rel=\"nofollow\">Barley malt flour</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/goat-milk\" class=\"tag known\" rel=\"nofollow\">Goat milk</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/aniseed\" class=\"tag known\" rel=\"nofollow\">Aniseed</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e162\" class=\"tag known\" rel=\"nofollow\">E162</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coriander-leaf\" class=\"tag known\" rel=\"nofollow\">Coriander leaf</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/asparagus\" class=\"tag known\" rel=\"nofollow\">Asparagus</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wholemeal-cereal\" class=\"tag known\" rel=\"nofollow\">Wholemeal cereal</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/crushed-peeled-tomato\" class=\"tag known\" rel=\"nofollow\">Crushed peeled tomato</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/parboiled-rice\" class=\"tag known\" rel=\"nofollow\">Parboiled rice</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nigari\" class=\"tag known\" rel=\"nofollow\">Nigari</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e332\" class=\"tag known\" rel=\"nofollow\">E332</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-beans\" class=\"tag known\" rel=\"nofollow\">White beans</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/passion-fruit-juice\" class=\"tag known\" rel=\"nofollow\">Passion fruit juice</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/guava\" class=\"tag known\" rel=\"nofollow\">Guava</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milk-minerals\" class=\"tag known\" rel=\"nofollow\">Milk minerals</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/table-vinegar\" class=\"tag known\" rel=\"nofollow\">Table vinegar</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/roselle-flower\" class=\"tag known\" rel=\"nofollow\">Roselle flower</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brown-sugar-syrup\" class=\"tag known\" rel=\"nofollow\">Brown sugar syrup</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/icing-sugar\" class=\"tag known\" rel=\"nofollow\">Icing sugar</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e320\" class=\"tag known\" rel=\"nofollow\">E320</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/honey-from-france\" class=\"tag known\" rel=\"nofollow\">Honey from France</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chestnut\" class=\"tag known\" rel=\"nofollow\">Chestnut</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sucre\" class=\"tag user_defined\" rel=\"nofollow\">sucre</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/free-range-eggs\" class=\"tag known\" rel=\"nofollow\">Free range eggs</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-vanilla-extract\" class=\"tag known\" rel=\"nofollow\">Natural vanilla extract</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sherry-vinegar\" class=\"tag known\" rel=\"nofollow\">Sherry vinegar</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/collagen\" class=\"tag known\" rel=\"nofollow\">Collagen</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e952\" class=\"tag known\" rel=\"nofollow\">E952</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:aceite-de-semillas-y-sal\" class=\"tag user_defined\" rel=\"nofollow\">es:aceite-de-semillas-y-sal</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e475\" class=\"tag known\" rel=\"nofollow\">E475</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:matiere-grasse-de-lait-anhydre\" class=\"tag known\" rel=\"nofollow\">fr:Matière grasse de lait anhydre</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/parmesan\" class=\"tag known\" rel=\"nofollow\">Parmesan</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/firming-agent\" class=\"tag known\" rel=\"nofollow\">Firming agent</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/paprika-powder\" class=\"tag known\" rel=\"nofollow\">Paprika powder</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vanilla-pod\" class=\"tag known\" rel=\"nofollow\">Vanilla pod</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spelt\" class=\"tag known\" rel=\"nofollow\">Spelt</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-pineapple-juice\" class=\"tag known\" rel=\"nofollow\">Concentrated pineapple juice</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/reconstituted-lime-juice\" class=\"tag known\" rel=\"nofollow\">Reconstituted lime juice</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/calcium\" class=\"tag known\" rel=\"nofollow\">Calcium</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/parsnip\" class=\"tag known\" rel=\"nofollow\">Parsnip</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/malted-wholemeal-rye-flour\" class=\"tag known\" rel=\"nofollow\">Malted wholemeal rye flour</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lemon-peel\" class=\"tag known\" rel=\"nofollow\">Lemon peel</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/poultry-skin\" class=\"tag known\" rel=\"nofollow\">Poultry skin</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mackerel-fillet\" class=\"tag known\" rel=\"nofollow\">Mackerel fillet</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:sl%C4%83nin%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:slănină</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/iodine\" class=\"tag known\" rel=\"nofollow\">Iodine</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e481\" class=\"tag known\" rel=\"nofollow\">E481</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wholemeal-oat\" class=\"tag known\" rel=\"nofollow\">Wholemeal oat</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tamarind\" class=\"tag known\" rel=\"nofollow\">Tamarind</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beef-fat\" class=\"tag known\" rel=\"nofollow\">Beef fat</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e635\" class=\"tag known\" rel=\"nofollow\">E635</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fleur-de-sel\" class=\"tag known\" rel=\"nofollow\">Fleur de sel</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pine-nuts\" class=\"tag known\" rel=\"nofollow\">Pine nuts</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e350\" class=\"tag known\" rel=\"nofollow\">E350</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cherry-tomato\" class=\"tag known\" rel=\"nofollow\">Cherry tomato</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sweetcorn\" class=\"tag known\" rel=\"nofollow\">Sweetcorn</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e406\" class=\"tag known\" rel=\"nofollow\">E406</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/radish\" class=\"tag known\" rel=\"nofollow\">Radish</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cabbage\" class=\"tag known\" rel=\"nofollow\">Cabbage</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:zwiebeln-gegrillt\" class=\"tag known\" rel=\"nofollow\">de:Zwiebeln gegrillt</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mango-chutney\" class=\"tag user_defined\" rel=\"nofollow\">de:mango-chutney</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sage\" class=\"tag known\" rel=\"nofollow\">Sage</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-germ\" class=\"tag known\" rel=\"nofollow\">Wheat germ</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/caraway\" class=\"tag known\" rel=\"nofollow\">Caraway</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rapeseed-lecithin\" class=\"tag known\" rel=\"nofollow\">Rapeseed lecithin</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brandy\" class=\"tag known\" rel=\"nofollow\">Brandy</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e326\" class=\"tag known\" rel=\"nofollow\">E326</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e1400\" class=\"tag known\" rel=\"nofollow\">E1400</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n";

    public static String split3 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/e150b\" class=\"tag known\" rel=\"nofollow\">E150b</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fromage-blanc\" class=\"tag known\" rel=\"nofollow\">Fromage blanc</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/grana-padano\" class=\"tag known\" rel=\"nofollow\">Grana Padano</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/thiamin-mononitrate\" class=\"tag known\" rel=\"nofollow\">Thiamin mononitrate</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-dextrose\" class=\"tag known\" rel=\"nofollow\">Wheat dextrose</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/deactivated-yeast\" class=\"tag known\" rel=\"nofollow\">Deactivated yeast</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bourbon-vanilla\" class=\"tag known\" rel=\"nofollow\">Bourbon vanilla</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rye-sourdough\" class=\"tag known\" rel=\"nofollow\">Rye sourdough</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:b1\" class=\"tag user_defined\" rel=\"nofollow\">fr:b1</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lemon-oil\" class=\"tag known\" rel=\"nofollow\">Lemon oil</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/corn-dextrose\" class=\"tag known\" rel=\"nofollow\">Corn dextrose</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/poultry-meat\" class=\"tag known\" rel=\"nofollow\">Poultry meat</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coconut-milk\" class=\"tag known\" rel=\"nofollow\">Coconut milk</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-by-product\" class=\"tag known\" rel=\"nofollow\">Pork by-product</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e325\" class=\"tag known\" rel=\"nofollow\">E325</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/veal\" class=\"tag known\" rel=\"nofollow\">Veal</a></td>\n" +
            "<td style=\"text-align:right\">4</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/extract\" class=\"tag known\" rel=\"nofollow\">Extract</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tea-extract\" class=\"tag known\" rel=\"nofollow\">Tea extract</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bifidus\" class=\"tag known\" rel=\"nofollow\">Bifidus</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/reduced-iron\" class=\"tag known\" rel=\"nofollow\">Reduced iron</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-basil-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural basil flavouring</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/blend-of-honeys\" class=\"tag known\" rel=\"nofollow\">Blend of honeys</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%9A%D0%BE%D0%BC%D0%BF%D0%BB%D0%B5%D0%BA%D1%81%D0%BD%D0%B0%D1%8F%20%D0%BF%D0%B8%D1%89%D0%B5%D0%B2%D0%B0%D1%8F%20%D0%B4%D0%BE%D0%B1%D0%B0%D0%B2%D0%BA%D0%B0\" class=\"tag known\" rel=\"nofollow\">ru:Комплексная пищевая добавка</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/port\" class=\"tag known\" rel=\"nofollow\">Port</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e530\" class=\"tag known\" rel=\"nofollow\">E530</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-flour-type-0\" class=\"tag known\" rel=\"nofollow\">Wheat flour type 0</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cocoa-butter-substitute\" class=\"tag known\" rel=\"nofollow\">Cocoa butter substitute</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-d-orge-malte-toaste\" class=\"tag known\" rel=\"nofollow\">fr:Farine d'orge malté toasté</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:bleuets\" class=\"tag known\" rel=\"nofollow\">fr:Bleuets</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/date\" class=\"tag known\" rel=\"nofollow\">Date</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milk-solids\" class=\"tag known\" rel=\"nofollow\">Milk solids</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/potassium-iodide\" class=\"tag known\" rel=\"nofollow\">Potassium iodide</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/veal-meat\" class=\"tag known\" rel=\"nofollow\">Veal meat</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cooked-ham\" class=\"tag known\" rel=\"nofollow\">Cooked ham</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/orange-extract\" class=\"tag known\" rel=\"nofollow\">Orange extract</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrolysed-proteins\" class=\"tag known\" rel=\"nofollow\">Hydrolysed proteins</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/buttermilk\" class=\"tag known\" rel=\"nofollow\">Buttermilk</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-collagen\" class=\"tag known\" rel=\"nofollow\">Pork collagen</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rice-semolina\" class=\"tag known\" rel=\"nofollow\">Rice semolina</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lemon-powder\" class=\"tag known\" rel=\"nofollow\">Lemon powder</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/albacore\" class=\"tag known\" rel=\"nofollow\">Albacore</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eau-des-alpes\" class=\"tag user_defined\" rel=\"nofollow\">fr:eau-des-alpes</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-chocolate\" class=\"tag known\" rel=\"nofollow\">White chocolate</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/egg-yolk-powder\" class=\"tag known\" rel=\"nofollow\">Egg yolk powder</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-fillet\" class=\"tag known\" rel=\"nofollow\">Pork fillet</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e442\" class=\"tag known\" rel=\"nofollow\">E442</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mashed-potato\" class=\"tag known\" rel=\"nofollow\">Mashed potato</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rice-bran\" class=\"tag known\" rel=\"nofollow\">Rice bran</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/broad-bean-flour\" class=\"tag known\" rel=\"nofollow\">Broad bean flour</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/esters-of-fatty-acids-and-polyglycerol\" class=\"tag user_defined\" rel=\"nofollow\">esters-of-fatty-acids-and-polyglycerol</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/armagnac\" class=\"tag known\" rel=\"nofollow\">Armagnac</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e350ii\" class=\"tag known\" rel=\"nofollow\">E350ii</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrolysed-pea-protein\" class=\"tag known\" rel=\"nofollow\">Hydrolysed pea protein</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e251\" class=\"tag known\" rel=\"nofollow\">E251</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e501i\" class=\"tag known\" rel=\"nofollow\">E501i</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cocoa-solids\" class=\"tag known\" rel=\"nofollow\">Cocoa solids</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/duck-fat\" class=\"tag known\" rel=\"nofollow\">Duck fat</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fond-de-porc\" class=\"tag known\" rel=\"nofollow\">fr:Fond de porc</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/peppermint\" class=\"tag known\" rel=\"nofollow\">Peppermint</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pomace-brandy\" class=\"tag known\" rel=\"nofollow\">Pomace brandy</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hot-chili-peppers\" class=\"tag known\" rel=\"nofollow\">Hot chili peppers</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/streptococcus-thermophilus\" class=\"tag known\" rel=\"nofollow\">Streptococcus thermophilus</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bourbon-vanilla-extract\" class=\"tag known\" rel=\"nofollow\">Bourbon vanilla extract</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fumet-de-poisson\" class=\"tag known\" rel=\"nofollow\">fr:Fumet de poisson</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cane-sugar-syrup\" class=\"tag known\" rel=\"nofollow\">Cane sugar syrup</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e153\" class=\"tag known\" rel=\"nofollow\">E153</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/noodle\" class=\"tag known\" rel=\"nofollow\">Noodle</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e575\" class=\"tag known\" rel=\"nofollow\">E575</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e131\" class=\"tag known\" rel=\"nofollow\">E131</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-puree\" class=\"tag known\" rel=\"nofollow\">Concentrated purée</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/passionfruit\" class=\"tag known\" rel=\"nofollow\">Passionfruit</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fig\" class=\"tag known\" rel=\"nofollow\">Fig</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cep\" class=\"tag known\" rel=\"nofollow\">Cep</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/liquid-smoke\" class=\"tag known\" rel=\"nofollow\">Liquid smoke</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:boyau-naturel-de-porc\" class=\"tag known\" rel=\"nofollow\">fr:Boyau naturel de porc</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-loin\" class=\"tag known\" rel=\"nofollow\">Pork loin</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/filtered-water\" class=\"tag known\" rel=\"nofollow\">Filtered water</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/carob-germ-flour\" class=\"tag user_defined\" rel=\"nofollow\">carob-germ-flour</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-wine-vinegar\" class=\"tag known\" rel=\"nofollow\">Red wine vinegar</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/strawberry-juice\" class=\"tag known\" rel=\"nofollow\">Strawberry juice</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lettuce\" class=\"tag known\" rel=\"nofollow\">Lettuce</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/330\" class=\"tag user_defined\" rel=\"nofollow\">330</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/deodorized-sunflower-oil\" class=\"tag known\" rel=\"nofollow\">Deodorized sunflower oil</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cracked-black-pepper\" class=\"tag known\" rel=\"nofollow\">Cracked black pepper</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:puree-et-puree-concentree\" class=\"tag known\" rel=\"nofollow\">fr:Purée et purée concentrée</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/superior-cooked-ham\" class=\"tag known\" rel=\"nofollow\">Superior cooked ham</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:e1414\" class=\"tag user_defined\" rel=\"nofollow\">ru:e1414</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/low-fat-milk\" class=\"tag known\" rel=\"nofollow\">Low-fat milk</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sterilised-milk\" class=\"tag known\" rel=\"nofollow\">Sterilised milk</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/grape-must\" class=\"tag known\" rel=\"nofollow\">Grape must</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-colours\" class=\"tag known\" rel=\"nofollow\">Natural colours</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/special-bread\" class=\"tag known\" rel=\"nofollow\">Special bread</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/long-grain-rice\" class=\"tag known\" rel=\"nofollow\">Long grain rice</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:additifs-alimentaires\" class=\"tag known\" rel=\"nofollow\">fr:Additifs alimentaires</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eclats-de-noisettes\" class=\"tag known\" rel=\"nofollow\">fr:Éclats de noisettes</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-carrot-juice\" class=\"tag known\" rel=\"nofollow\">Concentrated carrot juice</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/psyllium\" class=\"tag known\" rel=\"nofollow\">Psyllium</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/potato-flour\" class=\"tag known\" rel=\"nofollow\">Potato flour</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brazil-nut\" class=\"tag known\" rel=\"nofollow\">Brazil nut</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:1\" class=\"tag user_defined\" rel=\"nofollow\">fr:1</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:lactobacillus-bulgaricus\" class=\"tag user_defined\" rel=\"nofollow\">it:lactobacillus-bulgaricus</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rye-malt\" class=\"tag known\" rel=\"nofollow\">Rye malt</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/shiitake\" class=\"tag known\" rel=\"nofollow\">Shiitake</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-demi-ecreme-uht\" class=\"tag known\" rel=\"nofollow\">fr:Lait demi écrémé uht</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/non-hydrogenated-sunflower-oil\" class=\"tag known\" rel=\"nofollow\">Non-hydrogenated sunflower oil</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tarragon\" class=\"tag known\" rel=\"nofollow\">Tarragon</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e421\" class=\"tag known\" rel=\"nofollow\">E421</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ricotta\" class=\"tag known\" rel=\"nofollow\">Ricotta</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/uht-pasteurised-milk\" class=\"tag known\" rel=\"nofollow\">UHT pasteurised milk</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rooibos\" class=\"tag known\" rel=\"nofollow\">Rooibos</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/unrefined-sea-salt\" class=\"tag known\" rel=\"nofollow\">Unrefined sea salt</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/single-cream\" class=\"tag known\" rel=\"nofollow\">Single cream</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-sheep-casing\" class=\"tag known\" rel=\"nofollow\">Natural sheep casing</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sweet-potato\" class=\"tag known\" rel=\"nofollow\">Sweet potato</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-margarine\" class=\"tag known\" rel=\"nofollow\">Vegetable margarine</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/boiled-egg\" class=\"tag known\" rel=\"nofollow\">Boiled egg</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%97%D0%B0%D0%BA%D0%B2%D0%B0%D1%81%D0%BA%D0%B0%20%D0%BD%D0%B0%20%D0%BA%D0%B5%D1%84%D0%B8%D1%80%D0%BD%D1%8B%D1%85%20%D0%B3%D1%80%D0%B8%D0%B1%D0%BA%D0%B0%D1%85\" class=\"tag known\" rel=\"nofollow\">ru:Закваска на кефирных грибках</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e473\" class=\"tag known\" rel=\"nofollow\">E473</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/enhancer\" class=\"tag known\" rel=\"nofollow\">Enhancer</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sodium-chloride\" class=\"tag known\" rel=\"nofollow\">Sodium chloride</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-sourdough\" class=\"tag known\" rel=\"nofollow\">Wheat sourdough</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ingredients\" class=\"tag user_defined\" rel=\"nofollow\">ingredients</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:weichweizenmehl\" class=\"tag known\" rel=\"nofollow\">de:Weichweizenmehl</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:en-poudre\" class=\"tag user_defined\" rel=\"nofollow\">fr:en-poudre</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/melon\" class=\"tag known\" rel=\"nofollow\">Melon</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/celery-seed\" class=\"tag known\" rel=\"nofollow\">Celery seed</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e1100\" class=\"tag known\" rel=\"nofollow\">E1100</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chokeberry\" class=\"tag known\" rel=\"nofollow\">Chokeberry</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrogenated-vegetable-oil\" class=\"tag known\" rel=\"nofollow\">Hydrogenated vegetable oil</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:petales-de-bleuet\" class=\"tag known\" rel=\"nofollow\">fr:Pétales de bleuet</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrogenated-oil\" class=\"tag known\" rel=\"nofollow\">Hydrogenated oil</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/corn-oil\" class=\"tag known\" rel=\"nofollow\">Corn oil</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/plant-extracts\" class=\"tag known\" rel=\"nofollow\">Plant extracts</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/star-anise\" class=\"tag known\" rel=\"nofollow\">Star anise</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beans\" class=\"tag known\" rel=\"nofollow\">Beans</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/uht-pasteurised-whole-milk\" class=\"tag known\" rel=\"nofollow\">UHT pasteurised whole milk</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/algae\" class=\"tag known\" rel=\"nofollow\">Algae</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/burnt-sugar\" class=\"tag user_defined\" rel=\"nofollow\">burnt-sugar</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chickpea-flour\" class=\"tag known\" rel=\"nofollow\">Chickpea flour</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/palm-kernel-fat\" class=\"tag known\" rel=\"nofollow\">Palm kernel fat</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/carrot-juice\" class=\"tag known\" rel=\"nofollow\">Carrot juice</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mint-flavouring\" class=\"tag known\" rel=\"nofollow\">Mint flavouring</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-mint-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural mint flavouring</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/plantain\" class=\"tag known\" rel=\"nofollow\">Plantain</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-grain-oat-flakes\" class=\"tag known\" rel=\"nofollow\">Whole grain oat flakes</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-plant-colour\" class=\"tag known\" rel=\"nofollow\">Concentrated plant colour</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e504\" class=\"tag known\" rel=\"nofollow\">E504</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cornflower\" class=\"tag known\" rel=\"nofollow\">Cornflower</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-agave-syrup\" class=\"tag known\" rel=\"nofollow\">Concentrated agave syrup</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/balsamic-vinegar\" class=\"tag known\" rel=\"nofollow\">Balsamic vinegar</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e307a\" class=\"tag known\" rel=\"nofollow\">E307a</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mayonnaise\" class=\"tag known\" rel=\"nofollow\">Mayonnaise</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sardine\" class=\"tag known\" rel=\"nofollow\">Sardine</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-wine\" class=\"tag known\" rel=\"nofollow\">Red wine</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:senfmehl\" class=\"tag user_defined\" rel=\"nofollow\">de:senfmehl</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/corn-kernel\" class=\"tag known\" rel=\"nofollow\">Corn kernel</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pear-juice\" class=\"tag known\" rel=\"nofollow\">Pear juice</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/duck-foie-gras\" class=\"tag known\" rel=\"nofollow\">Duck foie gras</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/squid\" class=\"tag known\" rel=\"nofollow\">Squid</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e1442\" class=\"tag known\" rel=\"nofollow\">E1442</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lovage\" class=\"tag known\" rel=\"nofollow\">Lovage</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e508\" class=\"tag known\" rel=\"nofollow\">E508</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/carbonated-natural-mineral-water\" class=\"tag known\" rel=\"nofollow\">Carbonated natural mineral water</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-glucose-fructose-syrup\" class=\"tag known\" rel=\"nofollow\">Wheat glucose-fructose syrup</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sel\" class=\"tag user_defined\" rel=\"nofollow\">sel</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pasteurized-skimmed-milk\" class=\"tag known\" rel=\"nofollow\">Pasteurized skimmed milk</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sour-cream\" class=\"tag known\" rel=\"nofollow\">Sour cream</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/roasted-peanuts\" class=\"tag known\" rel=\"nofollow\">Roasted peanuts</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/liqueur-wine\" class=\"tag known\" rel=\"nofollow\">Liqueur wine</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e332ii\" class=\"tag known\" rel=\"nofollow\">E332ii</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/plum\" class=\"tag known\" rel=\"nofollow\">Plum</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pure-vanilla-extract\" class=\"tag known\" rel=\"nofollow\">Pure vanilla extract</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bone\" class=\"tag known\" rel=\"nofollow\">Bone</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/acacia-honey\" class=\"tag known\" rel=\"nofollow\">Acacia honey</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e460i\" class=\"tag known\" rel=\"nofollow\">E460i</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/parboiled-long-grain-rice\" class=\"tag known\" rel=\"nofollow\">Parboiled long grain rice</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sugar-beet-syrup\" class=\"tag known\" rel=\"nofollow\">Sugar beet syrup</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/garlic-puree\" class=\"tag known\" rel=\"nofollow\">Garlic puree</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/aromatic-caramel\" class=\"tag known\" rel=\"nofollow\">Aromatic caramel</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/green-tea\" class=\"tag known\" rel=\"nofollow\">Green tea</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e413\" class=\"tag known\" rel=\"nofollow\">E413</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/elderberry-extract\" class=\"tag known\" rel=\"nofollow\">Elderberry extract</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/liquorice-extract\" class=\"tag known\" rel=\"nofollow\">Liquorice extract</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/smoked-bacon\" class=\"tag known\" rel=\"nofollow\">Smoked bacon</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/shrimp\" class=\"tag known\" rel=\"nofollow\">Shrimp</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dry-roasted-almonds\" class=\"tag known\" rel=\"nofollow\">Dry roasted almonds</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brown-flax-seeds\" class=\"tag known\" rel=\"nofollow\">Brown flax seeds</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mozzarella\" class=\"tag user_defined\" rel=\"nofollow\">fr:mozzarella</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/potato-protein\" class=\"tag known\" rel=\"nofollow\">Potato protein</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/yellow-bell-pepper\" class=\"tag known\" rel=\"nofollow\">Yellow bell pepper</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/black-carrot\" class=\"tag known\" rel=\"nofollow\">Black carrot</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:levain-de-seigle-devitalise\" class=\"tag known\" rel=\"nofollow\">fr:Levain de seigle dévitalisé</a></td>\n" +
            "<td style=\"text-align:right\">3</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e953\" class=\"tag known\" rel=\"nofollow\">E953</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:thym-poudre\" class=\"tag user_defined\" rel=\"nofollow\">fr:thym-poudre</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e553b\" class=\"tag known\" rel=\"nofollow\">E553b</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pineapple-segments\" class=\"tag known\" rel=\"nofollow\">Pineapple segments</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cinnamon-powder\" class=\"tag known\" rel=\"nofollow\">Cinnamon powder</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B2%D0%BE%D1%81%D1%81%D1%82%D0%B0%D0%BD%D0%BE%D0%B2%D0%BB%D0%B5%D0%BD%D0%BD%D0%B0%D1%8F-%D0%BC%D0%BE%D0%BB%D0%BE%D1%87%D0%BD%D0%B0%D1%8F-%D1%81%D1%8B%D0%B2%D0%BE%D1%80%D0%BE%D1%82%D0%BA%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:восстановленная-молочная-сыворотка</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rehydrated-onion\" class=\"tag known\" rel=\"nofollow\">Rehydrated onion</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-lentils\" class=\"tag known\" rel=\"nofollow\">Red lentils</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/liquid-egg-white\" class=\"tag known\" rel=\"nofollow\">Liquid egg white</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:decor-au-cacao-maigre\" class=\"tag known\" rel=\"nofollow\">fr:Décor au cacao maigre</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melange-de-salades\" class=\"tag known\" rel=\"nofollow\">fr:Mélange de salades</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sucre-de-canne-roux-d-amerique-du-sud\" class=\"tag user_defined\" rel=\"nofollow\">fr:sucre-de-canne-roux-d-amerique-du-sud</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/free-range-chicken-eggs\" class=\"tag known\" rel=\"nofollow\">Free range chicken eggs</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/salted-butter\" class=\"tag known\" rel=\"nofollow\">Salted butter</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kann-sellerie\" class=\"tag user_defined\" rel=\"nofollow\">de:kann-sellerie</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chili-puree\" class=\"tag known\" rel=\"nofollow\">Chili puree</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gekochter-hinterschinken\" class=\"tag user_defined\" rel=\"nofollow\">de:gekochter-hinterschinken</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chocolate-filling\" class=\"tag known\" rel=\"nofollow\">Chocolate filling</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cream-from-normandy\" class=\"tag known\" rel=\"nofollow\">Cream from Normandy</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:carotene-et-extraits-de-paprika-et-de-curcuma\" class=\"tag user_defined\" rel=\"nofollow\">fr:carotene-et-extraits-de-paprika-et-de-curcuma</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/carrot-extract\" class=\"tag known\" rel=\"nofollow\">Carrot extract</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:paprika-rot\" class=\"tag user_defined\" rel=\"nofollow\">de:paprika-rot</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:sirope-de-glucosa-de-maiz\" class=\"tag known\" rel=\"nofollow\">es:Sirope de glucosa de maíz</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:haricots-blancs-secs-trempes\" class=\"tag known\" rel=\"nofollow\">fr:Haricots blancs secs trempés</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/anchovy-filets\" class=\"tag known\" rel=\"nofollow\">Anchovy filets</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-oregano-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural oregano flavouring</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soy-base\" class=\"tag known\" rel=\"nofollow\">Soy base</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beet-sugar\" class=\"tag known\" rel=\"nofollow\">Beet sugar</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:putenfleisch\" class=\"tag known\" rel=\"nofollow\">de:Putenfleisch</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chocolate-cream\" class=\"tag known\" rel=\"nofollow\">Chocolate cream</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/caramelised-sugar-syrup\" class=\"tag known\" rel=\"nofollow\">Caramelised sugar syrup</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dried-apple\" class=\"tag known\" rel=\"nofollow\">Dried apple</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/guava-puree\" class=\"tag known\" rel=\"nofollow\">Guava puree</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e451i\" class=\"tag known\" rel=\"nofollow\">E451i</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/yeast-extract-powder\" class=\"tag known\" rel=\"nofollow\">Yeast extract powder</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:1-de-matiere-grasse\" class=\"tag user_defined\" rel=\"nofollow\">fr:1-de-matiere-grasse</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/unrefined-sea-salt-from-the-atlantic\" class=\"tag known\" rel=\"nofollow\">Unrefined sea salt from the Atlantic</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/marinade\" class=\"tag known\" rel=\"nofollow\">Marinade</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/high-fructose-corn-syrup\" class=\"tag known\" rel=\"nofollow\">High fructose corn syrup</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pasteurized-creme-fraiche\" class=\"tag known\" rel=\"nofollow\">Pasteurized crème fraîche</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/skimmed-milk-yogurt-powder\" class=\"tag known\" rel=\"nofollow\">Skimmed milk yogurt powder</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soy-preparation\" class=\"tag known\" rel=\"nofollow\">Soy preparation</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/citrus-flavouring\" class=\"tag known\" rel=\"nofollow\">Citrus flavouring</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e553\" class=\"tag known\" rel=\"nofollow\">E553</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/quinine\" class=\"tag known\" rel=\"nofollow\">Quinine</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chia\" class=\"tag known\" rel=\"nofollow\">Chia</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:specialite-panee-au-poulet\" class=\"tag user_defined\" rel=\"nofollow\">fr:specialite-panee-au-poulet</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e141ii\" class=\"tag known\" rel=\"nofollow\">E141ii</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dehydrated-soy-protein\" class=\"tag known\" rel=\"nofollow\">Dehydrated soy protein</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/b12\" class=\"tag user_defined\" rel=\"nofollow\">b12</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pulp\" class=\"tag known\" rel=\"nofollow\">Pulp</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/exhausted-vanilla-pod\" class=\"tag known\" rel=\"nofollow\">Exhausted vanilla pod</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beetroot-juice\" class=\"tag known\" rel=\"nofollow\">Beetroot juice</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fruit-vinegar\" class=\"tag known\" rel=\"nofollow\">Fruit vinegar</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:oignons-frits-et-sauce-gout-barbecue\" class=\"tag user_defined\" rel=\"nofollow\">fr:oignons-frits-et-sauce-gout-barbecue</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dextrine-de-ble\" class=\"tag known\" rel=\"nofollow\">fr:Dextrine de blé</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-bone\" class=\"tag known\" rel=\"nofollow\">Pork bone</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cereal-crispies\" class=\"tag known\" rel=\"nofollow\">Cereal crispies</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/corn-maltodextrin\" class=\"tag known\" rel=\"nofollow\">Corn maltodextrin</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pre-fried-onions\" class=\"tag known\" rel=\"nofollow\">Pre fried onions</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:aromatizant\" class=\"tag user_defined\" rel=\"nofollow\">ro:aromatizant</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:epaississant-e415\" class=\"tag known\" rel=\"nofollow\">fr:Épaississant e415</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-citrus-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural citrus flavouring</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wholemeal-oat-flour\" class=\"tag known\" rel=\"nofollow\">Wholemeal oat flour</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/potassium\" class=\"tag known\" rel=\"nofollow\">Potassium</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rose-petals\" class=\"tag known\" rel=\"nofollow\">Rose petals</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:corretore-di-acidita\" class=\"tag user_defined\" rel=\"nofollow\">it:corretore-di-acidita</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pureed-green-bean\" class=\"tag known\" rel=\"nofollow\">Pureed green bean</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beer\" class=\"tag known\" rel=\"nofollow\">Beer</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-shoulder\" class=\"tag known\" rel=\"nofollow\">Pork shoulder</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:poten%C8%9Bator-de-arom%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:potențator-de-aromă</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-tomato-puree\" class=\"tag known\" rel=\"nofollow\">Concentrated tomato purée</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/puffed-rice\" class=\"tag known\" rel=\"nofollow\">Puffed rice</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydroxypropyl-methyl-cellulose-cellulose-gum\" class=\"tag user_defined\" rel=\"nofollow\">hydroxypropyl-methyl-cellulose-cellulose-gum</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/prune\" class=\"tag known\" rel=\"nofollow\">Prune</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:natron\" class=\"tag user_defined\" rel=\"nofollow\">de:natron</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mace\" class=\"tag known\" rel=\"nofollow\">Mace</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/modified-rice-starch\" class=\"tag known\" rel=\"nofollow\">Modified rice starch</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e472a\" class=\"tag known\" rel=\"nofollow\">E472a</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-cabbage\" class=\"tag known\" rel=\"nofollow\">White cabbage</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:salade-composee\" class=\"tag known\" rel=\"nofollow\">fr:Salade composée</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-lime-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural lime flavouring</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:zutaten\" class=\"tag user_defined\" rel=\"nofollow\">de:zutaten</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gorge-et-foie-de-porc\" class=\"tag user_defined\" rel=\"nofollow\">fr:gorge-et-foie-de-porc</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eau-minerale-naturelle-gazeifiee\" class=\"tag known\" rel=\"nofollow\">fr:Eau minérale naturelle gazéifiée</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/light-cream\" class=\"tag known\" rel=\"nofollow\">Light cream</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/juniper\" class=\"tag known\" rel=\"nofollow\">Juniper</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/goat-cheese\" class=\"tag known\" rel=\"nofollow\">Goat cheese</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sale\" class=\"tag user_defined\" rel=\"nofollow\">fr:sale</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/poppy\" class=\"tag known\" rel=\"nofollow\">Poppy</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:e170\" class=\"tag user_defined\" rel=\"nofollow\">ru:e170</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e954\" class=\"tag known\" rel=\"nofollow\">E954</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/may-contain-traces-of\" class=\"tag user_defined\" rel=\"nofollow\">may-contain-traces-of</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ail-seche\" class=\"tag known\" rel=\"nofollow\">fr:Ail séché</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-asparagus\" class=\"tag known\" rel=\"nofollow\">White asparagus</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/xanthan-gum-and-guar-gum\" class=\"tag known\" rel=\"nofollow\">Xanthan gum and guar gum</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:acide-lactique-l\" class=\"tag user_defined\" rel=\"nofollow\">fr:acide-lactique-l</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/maltose\" class=\"tag known\" rel=\"nofollow\">Maltose</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-garlic-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural garlic flavouring</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mixed-spices\" class=\"tag known\" rel=\"nofollow\">Mixed spices</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/strawberry-juice-concentrate\" class=\"tag known\" rel=\"nofollow\">Strawberry juice concentrate</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/camomile\" class=\"tag known\" rel=\"nofollow\">Camomile</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/instant-coffee\" class=\"tag known\" rel=\"nofollow\">Instant coffee</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pasteurized-semi-skimmed-milk\" class=\"tag known\" rel=\"nofollow\">Pasteurized semi-skimmed milk</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fruit-preservative\" class=\"tag known\" rel=\"nofollow\">Fruit preservative</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nibbed-and-ground-hazelnuts\" class=\"tag known\" rel=\"nofollow\">Nibbed and ground hazelnuts</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-onion\" class=\"tag known\" rel=\"nofollow\">Red onion</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/thiamin-hydrochloride\" class=\"tag known\" rel=\"nofollow\">Thiamin hydrochloride</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e340\" class=\"tag known\" rel=\"nofollow\">E340</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:aceitunas-rellenas\" class=\"tag user_defined\" rel=\"nofollow\">es:aceitunas-rellenas</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/quot\" class=\"tag user_defined\" rel=\"nofollow\">quot</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e433\" class=\"tag known\" rel=\"nofollow\">E433</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:des-ingredients\" class=\"tag user_defined\" rel=\"nofollow\">fr:des-ingredients</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:laurier-poudre\" class=\"tag user_defined\" rel=\"nofollow\">fr:laurier-poudre</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milk-mineral-concentrate\" class=\"tag known\" rel=\"nofollow\">Milk mineral concentrate</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/grated-emmental-cheese\" class=\"tag known\" rel=\"nofollow\">Grated emmental cheese</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/apricot-kernels\" class=\"tag known\" rel=\"nofollow\">Apricot kernels</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fruits-preparation\" class=\"tag known\" rel=\"nofollow\">Fruits preparation</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/menthol\" class=\"tag known\" rel=\"nofollow\">Menthol</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sweet-paprika\" class=\"tag known\" rel=\"nofollow\">Sweet paprika</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B6%D0%B8%D1%80-%D0%B7%D0%B0%D0%BC%D0%B5%D0%BD%D0%B8%D1%82%D0%B5%D0%BB%D1%8C-%D0%BA%D0%B0%D0%BA%D0%B0%D0%BE-%D0%BC%D0%B0%D1%81%D0%BB%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:жир-заменитель-какао-масла</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-apple-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural apple flavouring</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/calvados\" class=\"tag known\" rel=\"nofollow\">Calvados</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cultured-grade-a-non-fat-milk\" class=\"tag user_defined\" rel=\"nofollow\">cultured-grade-a-non-fat-milk</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vin-de-riz-de-cuisine\" class=\"tag user_defined\" rel=\"nofollow\">fr:vin-de-riz-de-cuisine</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:qualite-sans-arete\" class=\"tag user_defined\" rel=\"nofollow\">fr:qualite-sans-arete</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:H%C3%A4hnchenfleisch\" class=\"tag known\" rel=\"nofollow\">de:Hähnchenfleisch</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/totally-hydrogenated-palm-fat\" class=\"tag known\" rel=\"nofollow\">Totally hydrogenated palm fat</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:et-100-du-total-des-ingredients-sont\" class=\"tag user_defined\" rel=\"nofollow\">fr:et-100-du-total-des-ingredients-sont</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/clementine\" class=\"tag known\" rel=\"nofollow\">Clementine</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:maigre\" class=\"tag user_defined\" rel=\"nofollow\">fr:maigre</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:certains-ingredients-ne-sont-pas-francais\" class=\"tag user_defined\" rel=\"nofollow\">fr:certains-ingredients-ne-sont-pas-francais</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-beans\" class=\"tag known\" rel=\"nofollow\">Red beans</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e504i\" class=\"tag known\" rel=\"nofollow\">E504i</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chromium\" class=\"tag known\" rel=\"nofollow\">Chromium</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nectarine\" class=\"tag known\" rel=\"nofollow\">Nectarine</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ferments-lactiques-et-flore-de-surface\" class=\"tag user_defined\" rel=\"nofollow\">fr:ferments-lactiques-et-flore-de-surface</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:amidon-din-porumb\" class=\"tag user_defined\" rel=\"nofollow\">ro:amidon-din-porumb</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/orange-essential-oil\" class=\"tag known\" rel=\"nofollow\">Orange essential oil</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e339ii\" class=\"tag known\" rel=\"nofollow\">E339ii</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/and-sunflower-oil\" class=\"tag user_defined\" rel=\"nofollow\">and-sunflower-oil</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:aubergines-du-sud-ouest\" class=\"tag user_defined\" rel=\"nofollow\">fr:aubergines-du-sud-ouest</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-durum-wheat-semolina\" class=\"tag known\" rel=\"nofollow\">Whole durum wheat semolina</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/exhausted-ground-vanilla-pod\" class=\"tag known\" rel=\"nofollow\">Exhausted ground vanilla pod</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:zer-praf\" class=\"tag user_defined\" rel=\"nofollow\">ro:zer-praf</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/modified-wheat-starch\" class=\"tag known\" rel=\"nofollow\">Modified wheat starch</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pasteurise\" class=\"tag user_defined\" rel=\"nofollow\">fr:pasteurise</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:magros-de-cerdo\" class=\"tag user_defined\" rel=\"nofollow\">es:magros-de-cerdo</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/jalapeno\" class=\"tag known\" rel=\"nofollow\">Jalapeno</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lychee\" class=\"tag known\" rel=\"nofollow\">Lychee</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zante-currant\" class=\"tag known\" rel=\"nofollow\">Zante currant</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mountain-honey\" class=\"tag known\" rel=\"nofollow\">Mountain honey</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pepper-extract\" class=\"tag known\" rel=\"nofollow\">Pepper extract</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-whey-protein\" class=\"tag known\" rel=\"nofollow\">Concentrated whey protein</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-broth\" class=\"tag known\" rel=\"nofollow\">Vegetable broth</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:sucre\" class=\"tag user_defined\" rel=\"nofollow\">it:sucre</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:bio-ui\" class=\"tag user_defined\" rel=\"nofollow\">nl:bio-ui</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:b%C5%91r%C3%B6s-baromfizsirad%C3%A9k\" class=\"tag user_defined\" rel=\"nofollow\">hu:bőrös-baromfizsiradék</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D0%BB%D0%BE%D0%B4-%D1%8F%D1%87%D0%BC%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9-%D1%81%D0%B2%D0%B5%D1%82%D0%BB%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:солод-ячменный-светлый</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ground-hazelnuts\" class=\"tag known\" rel=\"nofollow\">Ground hazelnuts</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:chair-de-poisson\" class=\"tag known\" rel=\"nofollow\">fr:Chair de poisson</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-framboise-a-base-de-concentre\" class=\"tag known\" rel=\"nofollow\">fr:Jus de framboise à base de concentré</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e242\" class=\"tag known\" rel=\"nofollow\">E242</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/unsalted-butter\" class=\"tag known\" rel=\"nofollow\">Unsalted butter</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/palm-olein\" class=\"tag known\" rel=\"nofollow\">Palm olein</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/couscous\" class=\"tag known\" rel=\"nofollow\">Couscous</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mais-doux-en-grains\" class=\"tag known\" rel=\"nofollow\">fr:Maïs doux en grains</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sure\" class=\"tag user_defined\" rel=\"nofollow\">fr:sure</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/grapefruit-juice\" class=\"tag known\" rel=\"nofollow\">Grapefruit juice</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e407a\" class=\"tag known\" rel=\"nofollow\">E407a</a></td>\n";

    public static String split4 = "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zinc-sulfate\" class=\"tag known\" rel=\"nofollow\">Zinc sulfate</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/blackcurrant-juice-from-concentrate\" class=\"tag known\" rel=\"nofollow\">Blackcurrant juice from concentrate</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-blackcurrant-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural blackcurrant flavouring</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-beetroot-juice\" class=\"tag known\" rel=\"nofollow\">Red beetroot juice</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mixed-condiments\" class=\"tag known\" rel=\"nofollow\">Mixed condiments</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/black-carrot-juice\" class=\"tag known\" rel=\"nofollow\">Black carrot juice</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ferric-diphosphate\" class=\"tag known\" rel=\"nofollow\">Ferric diphosphate</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soy-milk\" class=\"tag known\" rel=\"nofollow\">Soy milk</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:s%C3%BC%C3%9Flupinensamen-gekocht\" class=\"tag user_defined\" rel=\"nofollow\">de:süßlupinensamen-gekocht</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-skin\" class=\"tag known\" rel=\"nofollow\">Chicken skin</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cognac\" class=\"tag known\" rel=\"nofollow\">Cognac</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/watermelon\" class=\"tag known\" rel=\"nofollow\">Watermelon</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mozzarella\" class=\"tag known\" rel=\"nofollow\">Mozzarella</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:protein%C4%83-animal%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:proteină-animală</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lupin-bean\" class=\"tag known\" rel=\"nofollow\">Lupin bean</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ketchup\" class=\"tag known\" rel=\"nofollow\">Ketchup</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pea-fiber\" class=\"tag known\" rel=\"nofollow\">Pea fiber</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/papaya\" class=\"tag known\" rel=\"nofollow\">Papaya</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fenugreek\" class=\"tag known\" rel=\"nofollow\">Fenugreek</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:emulsificatori\" class=\"tag user_defined\" rel=\"nofollow\">ro:emulsificatori</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cornet-biscuit\" class=\"tag known\" rel=\"nofollow\">fr:Cornet biscuit</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pasteurised-goat-milk\" class=\"tag known\" rel=\"nofollow\">Pasteurised goat milk</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/acacia-fibre\" class=\"tag known\" rel=\"nofollow\">Acacia fibre</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/atlantic-mackerel\" class=\"tag known\" rel=\"nofollow\">Atlantic mackerel</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/duck-meat\" class=\"tag known\" rel=\"nofollow\">Duck meat</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kulturchampignons\" class=\"tag user_defined\" rel=\"nofollow\">de:kulturchampignons</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cane-invert-syrup\" class=\"tag known\" rel=\"nofollow\">Cane invert syrup</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/kiwi\" class=\"tag known\" rel=\"nofollow\">Kiwi</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e336\" class=\"tag known\" rel=\"nofollow\">E336</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zinc-gluconate\" class=\"tag known\" rel=\"nofollow\">Zinc gluconate</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:legume-deshydrate\" class=\"tag known\" rel=\"nofollow\">fr:Légume déshydraté</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tomato-sauce\" class=\"tag known\" rel=\"nofollow\">Tomato sauce</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/millet\" class=\"tag known\" rel=\"nofollow\">Millet</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e235\" class=\"tag known\" rel=\"nofollow\">E235</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:v%C3%B6r%C3%B6sbab\" class=\"tag user_defined\" rel=\"nofollow\">hu:vörösbab</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beetroot-juice-concentrate\" class=\"tag known\" rel=\"nofollow\">Beetroot juice concentrate</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:couenne-de-porc\" class=\"tag known\" rel=\"nofollow\">fr:Couenne de porc</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hard-boiled-egg\" class=\"tag known\" rel=\"nofollow\">Hard-boiled egg</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e960\" class=\"tag known\" rel=\"nofollow\">E960</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lupin-flour\" class=\"tag known\" rel=\"nofollow\">Lupin flour</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/canola-oil\" class=\"tag known\" rel=\"nofollow\">Canola oil</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:frauenmantel\" class=\"tag user_defined\" rel=\"nofollow\">de:frauenmantel</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e640\" class=\"tag known\" rel=\"nofollow\">E640</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e1422\" class=\"tag known\" rel=\"nofollow\">E1422</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/salami\" class=\"tag known\" rel=\"nofollow\">Salami</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:blanc-d-oeuf-liquide-pasteurise\" class=\"tag known\" rel=\"nofollow\">fr:Blanc d'œuf liquide pasteurisé</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/apple-extract\" class=\"tag known\" rel=\"nofollow\">Apple extract</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brown-rice-syrup\" class=\"tag known\" rel=\"nofollow\">Brown rice syrup</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ground-coffee\" class=\"tag known\" rel=\"nofollow\">Ground coffee</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:f%C5%B1szerkever%C3%A9k\" class=\"tag user_defined\" rel=\"nofollow\">hu:fűszerkeverék</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beef-gelatin\" class=\"tag known\" rel=\"nofollow\">Beef gelatin</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cooked-potato\" class=\"tag known\" rel=\"nofollow\">Cooked potato</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ingredients\" class=\"tag user_defined\" rel=\"nofollow\">fr:ingredients</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/processed-with-alkali\" class=\"tag user_defined\" rel=\"nofollow\">processed-with-alkali</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e535\" class=\"tag known\" rel=\"nofollow\">E535</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:ingrediente\" class=\"tag user_defined\" rel=\"nofollow\">ro:ingrediente</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dried-fruits\" class=\"tag known\" rel=\"nofollow\">Dried fruits</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:ammoniumcarbonate\" class=\"tag user_defined\" rel=\"nofollow\">de:ammoniumcarbonate</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ferments-d-affinage\" class=\"tag known\" rel=\"nofollow\">fr:Ferments d'affinage</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mozzarella\" class=\"tag user_defined\" rel=\"nofollow\">de:mozzarella</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/oyster-mushroom\" class=\"tag known\" rel=\"nofollow\">Oyster mushroom</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:weizenvollkornflocken\" class=\"tag known\" rel=\"nofollow\">de:Weizenvollkornflocken</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:natursauerteig\" class=\"tag known\" rel=\"nofollow\">de:Natursauerteig</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:verdickungsmittel-johannisbrotkernmehl-und-pektin\" class=\"tag user_defined\" rel=\"nofollow\">de:verdickungsmittel-johannisbrotkernmehl-und-pektin</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/broad-bean\" class=\"tag known\" rel=\"nofollow\">Broad bean</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pineapple-juice-from-concentrate\" class=\"tag known\" rel=\"nofollow\">Pineapple juice from concentrate</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tapioca-flour\" class=\"tag known\" rel=\"nofollow\">Tapioca flour</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-sausage\" class=\"tag known\" rel=\"nofollow\">Pork sausage</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:controlee\" class=\"tag user_defined\" rel=\"nofollow\">fr:controlee</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/canola\" class=\"tag known\" rel=\"nofollow\">Canola</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:aroma-vanillin\" class=\"tag known\" rel=\"nofollow\">de:Aroma Vanillin</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/magnesium\" class=\"tag known\" rel=\"nofollow\">Magnesium</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/gluten-free-oats\" class=\"tag known\" rel=\"nofollow\">Gluten free oats</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/blend-of-eu-and-non-eu-honeys\" class=\"tag known\" rel=\"nofollow\">Blend of EU and non-EU honeys</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:vitamine-c-ed-e\" class=\"tag user_defined\" rel=\"nofollow\">it:vitamine-c-ed-e</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rum\" class=\"tag known\" rel=\"nofollow\">Rum</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:nat%C3%BCrliche-bourbon-vanille-aromen\" class=\"tag user_defined\" rel=\"nofollow\">de:natürliche-bourbon-vanille-aromen</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e579\" class=\"tag known\" rel=\"nofollow\">E579</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-citron-issu-de-concentre\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-de-citron-issu-de-concentre</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-liver\" class=\"tag known\" rel=\"nofollow\">Chicken liver</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huiles-vegetales-vierges\" class=\"tag user_defined\" rel=\"nofollow\">fr:huiles-vegetales-vierges</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/celery-powder\" class=\"tag known\" rel=\"nofollow\">Celery powder</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/allspice\" class=\"tag known\" rel=\"nofollow\">Allspice</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fromage-blanc-au-lait-entier-pasteurise\" class=\"tag user_defined\" rel=\"nofollow\">fr:fromage-blanc-au-lait-entier-pasteurise</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fortified-wheat-flour\" class=\"tag known\" rel=\"nofollow\">Fortified wheat flour</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-thigh\" class=\"tag known\" rel=\"nofollow\">Chicken thigh</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e172\" class=\"tag known\" rel=\"nofollow\">E172</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e321\" class=\"tag known\" rel=\"nofollow\">E321</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pink-peppercorn\" class=\"tag known\" rel=\"nofollow\">Pink peppercorn</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cottonseed-oil\" class=\"tag known\" rel=\"nofollow\">Cottonseed oil</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:agen%C8%9Bi-gelatinizan%C8%9Bi\" class=\"tag user_defined\" rel=\"nofollow\">ro:agenți-gelatinizanți</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rye-flakes\" class=\"tag known\" rel=\"nofollow\">Rye flakes</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/thai-rice\" class=\"tag known\" rel=\"nofollow\">Thai rice</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/millet-flour\" class=\"tag known\" rel=\"nofollow\">Millet flour</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spirulina-concentrate\" class=\"tag known\" rel=\"nofollow\">Spirulina concentrate</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brine\" class=\"tag known\" rel=\"nofollow\">Brine</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e261\" class=\"tag known\" rel=\"nofollow\">E261</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pea-starch\" class=\"tag known\" rel=\"nofollow\">Pea starch</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sweetened-condensed-milk\" class=\"tag known\" rel=\"nofollow\">Sweetened condensed milk</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e262ii\" class=\"tag known\" rel=\"nofollow\">E262ii</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mout-de-raisin-cuit\" class=\"tag known\" rel=\"nofollow\">fr:Moût de raisin cuit</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lactose-et-mineraux-du-lait\" class=\"tag known\" rel=\"nofollow\">fr:Lactose et minéraux du lait</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/suiker\" class=\"tag user_defined\" rel=\"nofollow\">suiker</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%BE%D1%80%D1%81%D0%BA%D0%B0%D1%8F-%D0%BA%D0%B0%D0%BF%D1%83%D1%81%D1%82%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:морская-капуста</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/acacia-honey-from-france\" class=\"tag known\" rel=\"nofollow\">Acacia honey from France</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B7%D0%B5%D0%BB%D0%B5%D0%BD%D1%8C-%D1%81%D0%B5%D0%BB%D1%8C%D0%B4%D0%B5%D1%80%D0%B5%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:зелень-сельдерея</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fennel-seed\" class=\"tag known\" rel=\"nofollow\">Fennel seed</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/296\" class=\"tag user_defined\" rel=\"nofollow\">296</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e536\" class=\"tag known\" rel=\"nofollow\">E536</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sugar-beet-fibre\" class=\"tag known\" rel=\"nofollow\">Sugar beet fibre</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:filets-de-limande-du-nord\" class=\"tag user_defined\" rel=\"nofollow\">fr:filets-de-limande-du-nord</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e319\" class=\"tag known\" rel=\"nofollow\">E319</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-liquid-pasteurised-egg\" class=\"tag known\" rel=\"nofollow\">Whole liquid pasteurised egg</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e341ii\" class=\"tag known\" rel=\"nofollow\">E341ii</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-flavor-of-turmeric\" class=\"tag known\" rel=\"nofollow\">Natural flavor of turmeric</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soy-sauce-powder\" class=\"tag known\" rel=\"nofollow\">Soy sauce powder</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spinach-powder\" class=\"tag known\" rel=\"nofollow\">Spinach powder</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/marc-de-champagne\" class=\"tag known\" rel=\"nofollow\">Marc de Champagne</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/basmati-rice\" class=\"tag known\" rel=\"nofollow\">Basmati rice</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/atlantic-cod\" class=\"tag known\" rel=\"nofollow\">Atlantic cod</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:vollkornweizen-crispies\" class=\"tag user_defined\" rel=\"nofollow\">de:vollkornweizen-crispies</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:feine-milchschokolade\" class=\"tag known\" rel=\"nofollow\">de:Feine Milchschokolade</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:si-necessaire-pour-reguler-l-acidite\" class=\"tag user_defined\" rel=\"nofollow\">fr:si-necessaire-pour-reguler-l-acidite</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bechamel-sauce\" class=\"tag known\" rel=\"nofollow\">Bechamel sauce</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ground-almonds\" class=\"tag known\" rel=\"nofollow\">Ground almonds</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/small-white-onions\" class=\"tag known\" rel=\"nofollow\">Small white onions</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brewer-s-yeast\" class=\"tag known\" rel=\"nofollow\">Brewer's yeast</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:verdickungsmittel-johannisbrotkernmehl\" class=\"tag user_defined\" rel=\"nofollow\">de:verdickungsmittel-johannisbrotkernmehl</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:past\" class=\"tag user_defined\" rel=\"nofollow\">de:past</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/buffalo-milk\" class=\"tag known\" rel=\"nofollow\">Buffalo milk</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/juniper-berry\" class=\"tag known\" rel=\"nofollow\">Juniper berry</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/superior-quality-long-grain-parboiled-rice\" class=\"tag known\" rel=\"nofollow\">Superior quality long grain parboiled rice</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e468\" class=\"tag known\" rel=\"nofollow\">E468</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e503i\" class=\"tag known\" rel=\"nofollow\">E503i</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cider-vinegar\" class=\"tag known\" rel=\"nofollow\">Cider vinegar</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D1%83%D0%BA%D0%B0-%D0%BF%D1%88%D0%B5%D0%BD%D0%B8%D1%87%D0%BD%D0%B0%D1%8F-%D1%85%D0%BB%D0%B5%D0%B1%D0%BE%D0%BF%D0%B5%D0%BA%D0%B0%D1%80%D0%BD%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:мука-пшеничная-хлебопекарная</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beef-broth\" class=\"tag known\" rel=\"nofollow\">Beef broth</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-ecreme-reconstitue\" class=\"tag known\" rel=\"nofollow\">fr:Lait écrémé reconstitué</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/reconstituted-passion-fruit-juice\" class=\"tag user_defined\" rel=\"nofollow\">reconstituted-passion-fruit-juice</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:ficat-de-g%C3%A2sc%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:ficat-de-gâscă</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/aloe-vera\" class=\"tag known\" rel=\"nofollow\">Aloe vera</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:H%C3%BChnerei-Trockeneiwei%C3%9F\" class=\"tag known\" rel=\"nofollow\">de:Hühnerei-Trockeneiweiß</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:joghurtpulver\" class=\"tag known\" rel=\"nofollow\">de:Joghurtpulver</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lobster\" class=\"tag known\" rel=\"nofollow\">Lobster</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:piment-doux\" class=\"tag user_defined\" rel=\"nofollow\">fr:piment-doux</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/microbial-coagulating-enzyme\" class=\"tag known\" rel=\"nofollow\">Microbial coagulating enzyme</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/neapolitan-wafer\" class=\"tag known\" rel=\"nofollow\">Neapolitan wafer</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mustard-oil\" class=\"tag known\" rel=\"nofollow\">Mustard oil</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spring-onion\" class=\"tag known\" rel=\"nofollow\">Spring onion</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:charbon\" class=\"tag user_defined\" rel=\"nofollow\">fr:charbon</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bread-improver\" class=\"tag known\" rel=\"nofollow\">Bread improver</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/semi-whole-durum-wheat-semolina\" class=\"tag known\" rel=\"nofollow\">Semi-whole durum wheat semolina</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/celeriac\" class=\"tag known\" rel=\"nofollow\">Celeriac</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e920\" class=\"tag known\" rel=\"nofollow\">E920</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/yellowfin-tuna\" class=\"tag known\" rel=\"nofollow\">Yellowfin tuna</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e492\" class=\"tag known\" rel=\"nofollow\">E492</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E8%AA%BF%E5%91%B3%E5%8A%91\" class=\"tag user_defined\" rel=\"nofollow\">zh:調味劑</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mallow\" class=\"tag known\" rel=\"nofollow\">Mallow</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/butter-flavouring\" class=\"tag known\" rel=\"nofollow\">Butter flavouring</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:buttermilchpulver\" class=\"tag user_defined\" rel=\"nofollow\">de:buttermilchpulver</a></td>\n" +
            "<td style=\"text-align:right\">2</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chocolate-ice-cream\" class=\"tag known\" rel=\"nofollow\">Chocolate ice cream</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e505\" class=\"tag known\" rel=\"nofollow\">E505</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:f%C3%A4rbendes-konzentrat-aus-karotten-und-saflorbl%C3%BCten\" class=\"tag user_defined\" rel=\"nofollow\">de:färbendes-konzentrat-aus-karotten-und-saflorblüten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hake\" class=\"tag known\" rel=\"nofollow\">Hake</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milk-chocolates-contains-vegetable-fats-in-addition-to-cocoa-butter\" class=\"tag user_defined\" rel=\"nofollow\">milk-chocolates-contains-vegetable-fats-in-addition-to-cocoa-butter</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:zsel%C3%A9sit%C5%91-anyag\" class=\"tag user_defined\" rel=\"nofollow\">hu:zselésitő-anyag</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/free-range-egg-yolk\" class=\"tag known\" rel=\"nofollow\">Free range egg yolk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:caramel\" class=\"tag user_defined\" rel=\"nofollow\">ro:caramel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/b-carotene\" class=\"tag user_defined\" rel=\"nofollow\">b-carotene</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ukraine\" class=\"tag user_defined\" rel=\"nofollow\">fr:ukraine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D1%82%D0%B0%D0%B1%D0%B8%D0%BB%D0%B8%D0%B7%D0%B0%D1%82%D0%BE%D1%80-%D1%8D%D0%BC%D1%83%D0%BB%D1%8C%D0%B3%D0%B0%D1%82%D0%BE%D1%80\" class=\"tag user_defined\" rel=\"nofollow\">ru:стабилизатор-эмульгатор</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:chapelure-de-ble\" class=\"tag known\" rel=\"nofollow\">fr:Chapelure de blé</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:pose-med-sukker-85-og-kanel\" class=\"tag user_defined\" rel=\"nofollow\">nb:pose-med-sukker-85-og-kanel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tagliatelles-aux-oeufs-cuites\" class=\"tag user_defined\" rel=\"nofollow\">fr:tagliatelles-aux-oeufs-cuites</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:caramel-aromatique-au-beurre-sale\" class=\"tag user_defined\" rel=\"nofollow\">fr:caramel-aromatique-au-beurre-sale</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vitamine-b1-vitamine-b5\" class=\"tag user_defined\" rel=\"nofollow\">fr:vitamine-b1-vitamine-b5</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/caprylyl-methicone\" class=\"tag user_defined\" rel=\"nofollow\">caprylyl-methicone</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:si-produit-dans-l-usine-indiquee-avec-la-lettre\" class=\"tag user_defined\" rel=\"nofollow\">fr:si-produit-dans-l-usine-indiquee-avec-la-lettre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/enthalt-weizen-und-gerste\" class=\"tag user_defined\" rel=\"nofollow\">enthalt-weizen-und-gerste</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/boletus-edulis\" class=\"tag known\" rel=\"nofollow\">Boletus edulis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n";

    public static String split5 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/eggs-from-caged-hens\" class=\"tag known\" rel=\"nofollow\">Eggs from caged hens</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melange-de-vitamine-joylent\" class=\"tag user_defined\" rel=\"nofollow\">fr:melange-de-vitamine-joylent</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sulfiltes\" class=\"tag user_defined\" rel=\"nofollow\">fr:sulfiltes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nitrite-curing-salt\" class=\"tag known\" rel=\"nofollow\">Nitrite curing salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:epautre\" class=\"tag user_defined\" rel=\"nofollow\">fr:epautre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rh-30\" class=\"tag user_defined\" rel=\"nofollow\">rh-30</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:guinness-eland-irlaa\" class=\"tag user_defined\" rel=\"nofollow\">fr:guinness-eland-irlaa</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mentha-rotundifolla\" class=\"tag user_defined\" rel=\"nofollow\">fr:mentha-rotundifolla</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/european-hake\" class=\"tag known\" rel=\"nofollow\">European hake</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:och-potatisst%C3%A4rkelse\" class=\"tag user_defined\" rel=\"nofollow\">sv:och-potatisstärkelse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/light-brown-sugar\" class=\"tag user_defined\" rel=\"nofollow\">light-brown-sugar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lentille-jaune\" class=\"tag user_defined\" rel=\"nofollow\">fr:lentille-jaune</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:1-framboise-ecrasee\" class=\"tag user_defined\" rel=\"nofollow\">fr:1-framboise-ecrasee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/eau\" class=\"tag user_defined\" rel=\"nofollow\">eau</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tagete\" class=\"tag user_defined\" rel=\"nofollow\">fr:tagete</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:bio-rozemarijnextract\" class=\"tag user_defined\" rel=\"nofollow\">nl:bio-rozemarijnextract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:louis-martin\" class=\"tag user_defined\" rel=\"nofollow\">fr:louis-martin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:infusion-de-chinotto-de-sentinelle-slow-food-de-savone\" class=\"tag user_defined\" rel=\"nofollow\">fr:infusion-de-chinotto-de-sentinelle-slow-food-de-savone</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-sugar\" class=\"tag known\" rel=\"nofollow\">White sugar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/barley-groats\" class=\"tag known\" rel=\"nofollow\">Barley groats</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ghee-oil\" class=\"tag user_defined\" rel=\"nofollow\">ghee-oil</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D0%BB%D1%8C-%D0%BC%D0%B0%D0%BB%D1%8C%D1%82%D0%BE%D0%B4%D0%B5%D0%BA%D1%81%D1%82%D1%80%D0%B8%D0%BD\" class=\"tag user_defined\" rel=\"nofollow\">ru:соль-мальтодекстрин</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vermicelles-de-chocolat\" class=\"tag user_defined\" rel=\"nofollow\">fr:vermicelles-de-chocolat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D0%B0%D1%81%D1%82%D0%B5%D1%80%D0%B8%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D1%81%D0%BB%D0%B8%D0%B2%D0%BA%D0%B8\" class=\"tag user_defined\" rel=\"nofollow\">ru:пастеризованные-сливки</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/a-consommer-de-preference-avant-le\" class=\"tag user_defined\" rel=\"nofollow\">a-consommer-de-preference-avant-le</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:sel-de-gu%C3%A9rande\" class=\"tag user_defined\" rel=\"nofollow\">de:sel-de-guérande</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:bourbonvanilleschotenextrakt\" class=\"tag known\" rel=\"nofollow\">de:Bourbonvanilleschotenextrakt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:allergene\" class=\"tag user_defined\" rel=\"nofollow\">fr:allergene</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/celtic-sea-salt\" class=\"tag known\" rel=\"nofollow\">Celtic sea salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%B0%D1%81%D0%BB%D0%BE-%D0%BF%D0%BE%D0%B4%D1%81%D0%BE%D0%BB%D0%BD%D0%B5%D1%87%D0%BD%D0%BE%D0%B5-%D1%80%D0%B0%D1%84%D0%B8%D0%BD%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5-%D0%B4%D0%B7%D0%BE%D0%B4%D0%BE%D1%80%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5-%D0%BF%D0%B5%D1%80%D0%B2%D1%8B%D0%B9-%D1%81%D0%BE%D1%80%D1%82\" class=\"tag user_defined\" rel=\"nofollow\">ru:масло-подсолнечное-рафинированное-дзодорированное-первый-сорт</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:f\" class=\"tag user_defined\" rel=\"nofollow\">fr:f</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dragonfruit-extract\" class=\"tag user_defined\" rel=\"nofollow\">dragonfruit-extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/proteins-mix\" class=\"tag known\" rel=\"nofollow\">Proteins mix</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/a-19\" class=\"tag user_defined\" rel=\"nofollow\">a-19</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/arachides\" class=\"tag user_defined\" rel=\"nofollow\">arachides</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wholemeal-rye-flakes\" class=\"tag known\" rel=\"nofollow\">Wholemeal rye flakes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:islande-et-feroe\" class=\"tag user_defined\" rel=\"nofollow\">fr:islande-et-feroe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/maodified-maize-starch\" class=\"tag user_defined\" rel=\"nofollow\">maodified-maize-starch</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fully-hydrogenated-vegetable-oils\" class=\"tag known\" rel=\"nofollow\">Fully hydrogenated vegetable oils</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BC%D0%B5%D1%81%D1%8C-%D1%82%D0%BE%D0%BA%D0%BE%D1%84%D0%B5%D1%80%D0%BE%D0%BB%D0%BE%D0%B2\" class=\"tag user_defined\" rel=\"nofollow\">ru:смесь-токоферолов</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:fasole-ro%C8%99ie-boabe\" class=\"tag user_defined\" rel=\"nofollow\">hu:fasole-roșie-boabe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chromium-nicotinate\" class=\"tag known\" rel=\"nofollow\">Chromium nicotinate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:amidon-de-gr%C3%A2u\" class=\"tag user_defined\" rel=\"nofollow\">ro:amidon-de-grâu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:blanc\" class=\"tag user_defined\" rel=\"nofollow\">fr:blanc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-strawberry-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural strawberry flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:matricaria-chamomilla\" class=\"tag user_defined\" rel=\"nofollow\">fr:matricaria-chamomilla</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:sardinen%EF%AC%81lets\" class=\"tag user_defined\" rel=\"nofollow\">de:sardinenﬁlets</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pl:czerwona-szalotka-w-proszku\" class=\"tag user_defined\" rel=\"nofollow\">pl:czerwona-szalotka-w-proszku</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:s%C3%BCssungsmitr-aspartam\" class=\"tag user_defined\" rel=\"nofollow\">de:süssungsmitr-aspartam</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%81%8B%E3%82%84%E3%81%8F%EF%BC%88%E5%91%B3%E4%BB%98%E6%B2%B9%E6%8F%9A%E3%81%92\" class=\"tag user_defined\" rel=\"nofollow\">ja:かやく（味付油揚げ</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/1420\" class=\"tag user_defined\" rel=\"nofollow\">1420</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:cacao-degresat%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:cacao-degresată</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mint-leaf\" class=\"tag known\" rel=\"nofollow\">Mint leaf</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ce-produit-est-fabrique-a-partir-de-viande-de-volaille\" class=\"tag user_defined\" rel=\"nofollow\">fr:ce-produit-est-fabrique-a-partir-de-viande-de-volaille</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:naturel\" class=\"tag user_defined\" rel=\"nofollow\">fr:naturel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:trockenhefe\" class=\"tag known\" rel=\"nofollow\">de:Trockenhefe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/powdered-almonds\" class=\"tag known\" rel=\"nofollow\">Powdered almonds</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/contains-a-wheat-ingredient\" class=\"tag user_defined\" rel=\"nofollow\">contains-a-wheat-ingredient</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B2%D0%BA%D1%83%D1%81%D0%BE%D0%B0%D1%80%D0%BE%D0%BC%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B0%D1%8F-%D0%B4%D0%BE%D0%B1%D0%B0%D0%B2%D0%BA%D0%B0-%D0%B2%D0%B5%D1%82%D1%87%D0%B8%D0%BD%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:вкусоароматическая-добавка-ветчина</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fruit-purees\" class=\"tag user_defined\" rel=\"nofollow\">fruit-purees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:contient-de-l-extrait-de-vanille\" class=\"tag user_defined\" rel=\"nofollow\">fr:contient-de-l-extrait-de-vanille</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:kalcium-d-pantoten%C3%A1t-pantot%C3%A9nsav\" class=\"tag user_defined\" rel=\"nofollow\">hu:kalcium-d-pantotenát-pantoténsav</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/apple-flavouring\" class=\"tag known\" rel=\"nofollow\">Apple flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gratinage\" class=\"tag known\" rel=\"nofollow\">fr:Gratinage</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jarret-et-gorge-de-porc\" class=\"tag user_defined\" rel=\"nofollow\">fr:jarret-et-gorge-de-porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%8F%D0%B4%D1%80%D0%BE-%D0%BF%D0%BE%D0%B4%D1%81%D0%BE%D0%BB%D0%BD%D0%B5%D1%87%D0%BD%D0%B8%D0%BA%D0%B0-%D0%BE%D0%B1%D0%B6%D0%B0%D1%80%D0%B5%D0%BD%D0%BD%D0%BE%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:ядро-подсолнечника-обжаренное</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gousses-de-vanille-bour\" class=\"tag user_defined\" rel=\"nofollow\">fr:gousses-de-vanille-bour</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:eiwei%C3%9Fmischung\" class=\"tag user_defined\" rel=\"nofollow\">de:eiweißmischung</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-onion-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural onion flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:feuilles-de-iugrec-deshydratees\" class=\"tag user_defined\" rel=\"nofollow\">fr:feuilles-de-iugrec-deshydratees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:iv-c02\" class=\"tag user_defined\" rel=\"nofollow\">fr:iv-c02</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:haricots-mange-tout\" class=\"tag user_defined\" rel=\"nofollow\">fr:haricots-mange-tout</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chromium-chloride\" class=\"tag known\" rel=\"nofollow\">Chromium chloride</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:farina-di-grano-tenero-di-tipo-0\" class=\"tag user_defined\" rel=\"nofollow\">it:farina-di-grano-tenero-di-tipo-0</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E9%A6%99%E8%BE%9B%E6%96%99%E6%8A%BD%E5%87%BA%E7%89%A9\" class=\"tag user_defined\" rel=\"nofollow\">ja:香辛料抽出物</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/unsweetened-chocolatet\" class=\"tag user_defined\" rel=\"nofollow\">unsweetened-chocolatet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rehydrated-egg-white\" class=\"tag known\" rel=\"nofollow\">Rehydrated egg white</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/501\" class=\"tag user_defined\" rel=\"nofollow\">501</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extraits-de-carotte-noire-et-d-hibiscus\" class=\"tag user_defined\" rel=\"nofollow\">fr:extraits-de-carotte-noire-et-d-hibiscus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:prune-rubinel\" class=\"tag user_defined\" rel=\"nofollow\">fr:prune-rubinel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E8%8C%B6%E8%91%89\" class=\"tag user_defined\" rel=\"nofollow\">zh:茶葉</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:emulsifiant-sodium-de-stearate\" class=\"tag user_defined\" rel=\"nofollow\">fr:emulsifiant-sodium-de-stearate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/caribbean-spiny-lobster\" class=\"tag known\" rel=\"nofollow\">Caribbean spiny lobster</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/of-c-to-best-store-bread-it-is-recommended-to-close-it-cam-in-the-package-and-store-it-in-a-cool-and-dry-place\" class=\"tag user_defined\" rel=\"nofollow\">of-c-to-best-store-bread-it-is-recommended-to-close-it-cam-in-the-package-and-store-it-in-a-cool-and-dry-place</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:karamellisierter-glucose-fructose-sirup\" class=\"tag user_defined\" rel=\"nofollow\">de:karamellisierter-glucose-fructose-sirup</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bacon-burger\" class=\"tag user_defined\" rel=\"nofollow\">bacon-burger</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ingredient-jus-de-pomme\" class=\"tag user_defined\" rel=\"nofollow\">fr:ingredient-jus-de-pomme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:spirituose-arrak\" class=\"tag user_defined\" rel=\"nofollow\">de:spirituose-arrak</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eau-de-vie-de-vin\" class=\"tag known\" rel=\"nofollow\">fr:Eau de vie de vin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/popping-corn\" class=\"tag user_defined\" rel=\"nofollow\">popping-corn</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:din%C3%A1trium-s-ribonukleotidok\" class=\"tag user_defined\" rel=\"nofollow\">hu:dinátrium-s-ribonukleotidok</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-grape-juice\" class=\"tag known\" rel=\"nofollow\">Concentrated grape juice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dont-83-de-tequila\" class=\"tag user_defined\" rel=\"nofollow\">fr:dont-83-de-tequila</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:in-brine\" class=\"tag user_defined\" rel=\"nofollow\">de:in-brine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-de-chataignes\" class=\"tag user_defined\" rel=\"nofollow\">fr:creme-de-chataignes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:%D9%85%D8%A7%D8%A1-%D9%85%D8%B9%D8%AF%D9%86%DB%8C-%D8%B7%D8%A8%D9%8A%D8%B9%D9%8A-%D8%B9%D9%8A%D9%86-%D8%B3%D8%A7%D9%8A%D8%B3-195-%D8%B3%DA%A9%D8%B1%D8%A7-4-9\" class=\"tag user_defined\" rel=\"nofollow\">fr:ماء-معدنی-طبيعي-عين-سايس-195-سکرا-4-9</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gr%C3%BCne-paprika\" class=\"tag user_defined\" rel=\"nofollow\">de:grüne-paprika</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E5%B0%8F%E6%9D%BE%E8%8F%9C\" class=\"tag user_defined\" rel=\"nofollow\">ja:小松菜</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-de-ble-tendre-type-0\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-de-ble-tendre-type-0</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fratelli\" class=\"tag user_defined\" rel=\"nofollow\">fratelli</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/esters-of-fatty-acids\" class=\"tag user_defined\" rel=\"nofollow\">esters-of-fatty-acids</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:29-romarin\" class=\"tag user_defined\" rel=\"nofollow\">fr:29-romarin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rice-protein\" class=\"tag known\" rel=\"nofollow\">Rice protein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fabrique-avec-du-porc-et-du-canard\" class=\"tag user_defined\" rel=\"nofollow\">fr:fabrique-avec-du-porc-et-du-canard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n";

    public static String split6 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:naturel-de-poivre\" class=\"tag user_defined\" rel=\"nofollow\">fr:naturel-de-poivre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D1%82%D0%B0%D0%B1-%D1%80%D1%8B\" class=\"tag user_defined\" rel=\"nofollow\">ru:стаб-ры</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/electrolytic-iron\" class=\"tag user_defined\" rel=\"nofollow\">electrolytic-iron</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mi\" class=\"tag user_defined\" rel=\"nofollow\">de:mi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/101\" class=\"tag user_defined\" rel=\"nofollow\">101</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e435\" class=\"tag known\" rel=\"nofollow\">E435</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D1%83%D0%BA%D0%B0-%D0%BF%D1%88%D0%B5%D0%BD%D0%B8%D1%87%D0%BD%D0%B0%D1%8F-%D1%85%D0%BB%D0%B5%D0%B1%D0%BE%D0%BF%D0%B5%D0%BA%D0%B0%D1%80%D0%BD%D0%B0%D1%8F-1-%D1%81%D0%BE%D1%80%D1%82\" class=\"tag user_defined\" rel=\"nofollow\">ru:мука-пшеничная-хлебопекарная-1-сорт</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/laurel-extract\" class=\"tag known\" rel=\"nofollow\">Laurel extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:clavon-lsaveutsduclavon\" class=\"tag user_defined\" rel=\"nofollow\">fr:clavon-lsaveutsduclavon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:el41\" class=\"tag user_defined\" rel=\"nofollow\">fr:el41</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/seasoned-bread-dough\" class=\"tag user_defined\" rel=\"nofollow\">seasoned-bread-dough</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cockles\" class=\"tag known\" rel=\"nofollow\">Cockles</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-poisson\" class=\"tag known\" rel=\"nofollow\">fr:Jus de poisson</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cyclopterus-lumpus\" class=\"tag user_defined\" rel=\"nofollow\">fr:cyclopterus-lumpus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dinkelmehl-type-630\" class=\"tag user_defined\" rel=\"nofollow\">dinkelmehl-type-630</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:zah%C4%83r\" class=\"tag user_defined\" rel=\"nofollow\">hu:zahăr</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fruits-rouges-lyophilises\" class=\"tag known\" rel=\"nofollow\">fr:Fruits rouges lyophilisés</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-egg-yolk\" class=\"tag known\" rel=\"nofollow\">Chicken egg yolk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:eradsenen-40-u\" class=\"tag user_defined\" rel=\"nofollow\">de:eradsenen-40-u</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-seedless-grape\" class=\"tag known\" rel=\"nofollow\">White seedless grape</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/l-see-bottle-for-production-and-expiry-date-eep-in-a-coong-%D8%AA%D8%AA%D8%B1%D8%B3%D8%B9-%D9%84%D8%AD%D8%AA%D8%A7%D8%AC-%D9%88-%D8%A7%D9%84%D8%A7%D9%86%D8%AA%D9%87%D8%A7%D8%A1-%D8%A7%D9%86%D8%B8%D8%B1-%D8%A7%D9%84%D9%89-%D8%A7%D9%84%D8%B2%D8%AC%D9%87%D8%A9-bottled-at-source-perrier-by-nws-sud-30310-vergeze-france-57-30310-lorie\" class=\"tag user_defined\" rel=\"nofollow\">l-see-bottle-for-production-and-expiry-date-eep-in-a-coong-تترسع-لحتاج-و-الانتهاء-انظر-الى-الزجهة-bottled-at-source-perrier-by-nws-sud-30310-vergeze-france-57-30310-lorie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/smoked-cured-ham\" class=\"tag known\" rel=\"nofollow\">Smoked cured ham</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:vanilllin\" class=\"tag user_defined\" rel=\"nofollow\">de:vanilllin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sultanas\" class=\"tag user_defined\" rel=\"nofollow\">sultanas</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cooked-chickpeas\" class=\"tag known\" rel=\"nofollow\">Cooked chickpeas</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/celery-leaves\" class=\"tag known\" rel=\"nofollow\">Celery leaves</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lemon-zest\" class=\"tag known\" rel=\"nofollow\">Lemon zest</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e142\" class=\"tag known\" rel=\"nofollow\">E142</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e450ii\" class=\"tag known\" rel=\"nofollow\">E450ii</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/and-salt\" class=\"tag user_defined\" rel=\"nofollow\">and-salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mandel\" class=\"tag user_defined\" rel=\"nofollow\">mandel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gabelspaghetti-gekocht\" class=\"tag user_defined\" rel=\"nofollow\">de:gabelspaghetti-gekocht</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ferrous-sulfate-niacin\" class=\"tag user_defined\" rel=\"nofollow\">ferrous-sulfate-niacin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-d-avoine-extrudee\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-d-avoine-extrudee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/egg-lysosyme\" class=\"tag user_defined\" rel=\"nofollow\">egg-lysosyme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fromage-a-pate-molle\" class=\"tag user_defined\" rel=\"nofollow\">fr:fromage-a-pate-molle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:peroreatde-petit-lait\" class=\"tag user_defined\" rel=\"nofollow\">fr:peroreatde-petit-lait</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:weizenr%C3%B6stmalz\" class=\"tag user_defined\" rel=\"nofollow\">de:weizenröstmalz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:avoine-hachee\" class=\"tag user_defined\" rel=\"nofollow\">fr:avoine-hachee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:arome-naturel-de-vanille-de-madagascar\" class=\"tag known\" rel=\"nofollow\">fr:Arôme naturel de vanille de madagascar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/store-sa\" class=\"tag user_defined\" rel=\"nofollow\">store-sa</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ble-integral\" class=\"tag user_defined\" rel=\"nofollow\">fr:ble-integral</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fr-70-71m-pojds\" class=\"tag user_defined\" rel=\"nofollow\">fr:fr-70-71m-pojds</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/free-range-chicken-egg-yolk\" class=\"tag known\" rel=\"nofollow\">Free range chicken egg yolk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:arome-naturel-de-cannelle-de-ceylan\" class=\"tag user_defined\" rel=\"nofollow\">fr:arome-naturel-de-cannelle-de-ceylan</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dont-ail-0\" class=\"tag user_defined\" rel=\"nofollow\">fr:dont-ail-0</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D0%BB%D1%8C-lt\" class=\"tag user_defined\" rel=\"nofollow\">ru:соль-lt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:stekt-n%C3%B6tf%C3%A4rs\" class=\"tag user_defined\" rel=\"nofollow\">sv:stekt-nötfärs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:extract-de-rosmarin\" class=\"tag user_defined\" rel=\"nofollow\">ro:extract-de-rosmarin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sauce-au-yaourt\" class=\"tag user_defined\" rel=\"nofollow\">fr:sauce-au-yaourt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soft-white-cheese\" class=\"tag known\" rel=\"nofollow\">Soft white cheese</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:kaavaojuomajauhie-sjokoladedrikkpulver\" class=\"tag user_defined\" rel=\"nofollow\">nb:kaavaojuomajauhie-sjokoladedrikkpulver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:plasma-de-porc\" class=\"tag known\" rel=\"nofollow\">fr:Plasma de porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/raw-ham\" class=\"tag known\" rel=\"nofollow\">Raw ham</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sorbet-mangue\" class=\"tag user_defined\" rel=\"nofollow\">fr:sorbet-mangue</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:distel%C3%B6l\" class=\"tag user_defined\" rel=\"nofollow\">de:distelöl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:f%C3%A4rbendes-karottenkonzentrat-und-hibiskuskonzentrat\" class=\"tag user_defined\" rel=\"nofollow\">de:färbendes-karottenkonzentrat-und-hibiskuskonzentrat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cinnamon-sticks\" class=\"tag user_defined\" rel=\"nofollow\">cinnamon-sticks</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:izfokoz%C3%B3k\" class=\"tag user_defined\" rel=\"nofollow\">hu:izfokozók</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gr%C3%BCnkohl-6-aus-dynamischem-anbau-1-milchsauer-vergoren\" class=\"tag user_defined\" rel=\"nofollow\">de:grünkohl-6-aus-dynamischem-anbau-1-milchsauer-vergoren</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/oat-fibre\" class=\"tag known\" rel=\"nofollow\">Oat fibre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:emulsificator\" class=\"tag user_defined\" rel=\"nofollow\">ro:emulsificator</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B0%D1%80%D0%B0%D1%85%D0%B8%D1%81-%D0%B8%D0%B7%D0%BC%D0%B5%D0%BB%D1%8C%D1%87%D1%91%D0%BD%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:арахис-измельчённый</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kakao-extrakt\" class=\"tag known\" rel=\"nofollow\">de:Kakao-Extrakt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:molkeneiweibkonzentrat\" class=\"tag user_defined\" rel=\"nofollow\">de:molkeneiweibkonzentrat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D1%8B%D1%80-%D1%80%D0%B0%D1%81%D1%81%D0%BE%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:сыр-рассольный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/baby-spinach\" class=\"tag known\" rel=\"nofollow\">Baby spinach</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bamboo-fibre\" class=\"tag known\" rel=\"nofollow\">Bamboo fibre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:protein%C4%83-vegetal%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:proteină-vegetală</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:e10\" class=\"tag user_defined\" rel=\"nofollow\">ru:e10</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:farbstoff-ammonsulfit-zuckerkul%C3%B6r\" class=\"tag user_defined\" rel=\"nofollow\">de:farbstoff-ammonsulfit-zuckerkulör</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sausage-mix\" class=\"tag user_defined\" rel=\"nofollow\">sausage-mix</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D0%B0%D1%81%D1%82%D0%B5%D1%80%D0%B8%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5-%D0%BA%D0%BE%D1%80%D0%BE%D0%B2%D1%8C%D0%B5-%D0%BC%D0%BE%D0%BB%D0%BE%D0%BA%D0%BE\" class=\"tag user_defined\" rel=\"nofollow\">ru:пастеризованное-коровье-молоко</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:gelatina-alimentare\" class=\"tag user_defined\" rel=\"nofollow\">it:gelatina-alimentare</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-en-poudre-enrichi-en-matiere-grasse\" class=\"tag known\" rel=\"nofollow\">fr:Lait en poudre enrichi en matière grasse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:cereales-croustillantes\" class=\"tag user_defined\" rel=\"nofollow\">it:cereales-croustillantes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:e122\" class=\"tag user_defined\" rel=\"nofollow\">ru:e122</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tara\" class=\"tag user_defined\" rel=\"nofollow\">fr:tara</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:pasteurisiert\" class=\"tag user_defined\" rel=\"nofollow\">de:pasteurisiert</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ci-77492\" class=\"tag user_defined\" rel=\"nofollow\">ci-77492</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:geh%C3%A4rtete-pflanzliche-fette\" class=\"tag user_defined\" rel=\"nofollow\">de:gehärtete-pflanzliche-fette</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eucalyptus\" class=\"tag user_defined\" rel=\"nofollow\">fr:eucalyptus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tomatenmark-14-einfach-konzentriert\" class=\"tag user_defined\" rel=\"nofollow\">de:tomatenmark-14-einfach-konzentriert</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:formaggio-stracchino-nonno-nanni\" class=\"tag user_defined\" rel=\"nofollow\">it:formaggio-stracchino-nonno-nanni</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:crispies\" class=\"tag user_defined\" rel=\"nofollow\">fr:crispies</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:limettes\" class=\"tag user_defined\" rel=\"nofollow\">fr:limettes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n";
    public static String split7 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:p-pe-acide-citrique\" class=\"tag user_defined\" rel=\"nofollow\">fr:p-pe-acide-citrique</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:f%C3%A4rbendes-lebensmittelkonzentrat-aus-%C3%A4pfeln-und-k%C3%BCrbis\" class=\"tag user_defined\" rel=\"nofollow\">de:färbendes-lebensmittelkonzentrat-aus-äpfeln-und-kürbis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:acide-citrique-variete-vaccinium-macrocarpon\" class=\"tag user_defined\" rel=\"nofollow\">fr:acide-citrique-variete-vaccinium-macrocarpon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/produit-de-thdllande-no-de-lot\" class=\"tag user_defined\" rel=\"nofollow\">produit-de-thdllande-no-de-lot</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dried-apple-pieces\" class=\"tag known\" rel=\"nofollow\">Dried apple pieces</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:aubergines-prefrites-avec-peau\" class=\"tag user_defined\" rel=\"nofollow\">fr:aubergines-prefrites-avec-peau</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lamb\" class=\"tag known\" rel=\"nofollow\">Lamb</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-cabbage\" class=\"tag known\" rel=\"nofollow\">Red cabbage</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:filetes-de-sardina\" class=\"tag user_defined\" rel=\"nofollow\">es:filetes-de-sardina</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:extract-de-ardei\" class=\"tag user_defined\" rel=\"nofollow\">ro:extract-de-ardei</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e222\" class=\"tag known\" rel=\"nofollow\">E222</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sprouted-sunflower-seeds\" class=\"tag user_defined\" rel=\"nofollow\">sprouted-sunflower-seeds</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/seaweed\" class=\"tag known\" rel=\"nofollow\">Seaweed</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:s%C3%BCbungsrnittel\" class=\"tag user_defined\" rel=\"nofollow\">de:sübungsrnittel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:sert%C3%A9s-zselatin\" class=\"tag user_defined\" rel=\"nofollow\">hu:sertés-zselatin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:menthe-pomme\" class=\"tag user_defined\" rel=\"nofollow\">fr:menthe-pomme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:haricots-azuki\" class=\"tag user_defined\" rel=\"nofollow\">fr:haricots-azuki</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/a\" class=\"tag user_defined\" rel=\"nofollow\">a</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-concentre-d-os-et-viande-de-boeuf\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-concentre-d-os-et-viande-de-boeuf</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/diphosphates-and-sodium-carbonates\" class=\"tag known\" rel=\"nofollow\">Diphosphates and sodium carbonates</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:puree-de-corossol\" class=\"tag user_defined\" rel=\"nofollow\">fr:puree-de-corossol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/acerola-powder\" class=\"tag known\" rel=\"nofollow\">Acerola powder</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BA%D1%80%D1%83%D0%BF%D0%B0-%D1%85%D0%BB%D0%BE%D0%BF%D1%8C%D1%8F-%D0%BE%D0%B2%D1%81%D1%8F%D0%BD%D1%8B%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:крупа-хлопья-овсяные</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:feuchthaltenmittel\" class=\"tag user_defined\" rel=\"nofollow\">de:feuchthaltenmittel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/casionally\" class=\"tag user_defined\" rel=\"nofollow\">casionally</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/emulsifier-soy-lecithin\" class=\"tag user_defined\" rel=\"nofollow\">emulsifier-soy-lecithin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:natriumpyrofosfat\" class=\"tag user_defined\" rel=\"nofollow\">sv:natriumpyrofosfat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:fruktjuice-fr%C3%A0n-koncentrat\" class=\"tag user_defined\" rel=\"nofollow\">sv:fruktjuice-fràn-koncentrat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-d-ognons-verts\" class=\"tag user_defined\" rel=\"nofollow\">fr:extrait-d-ognons-verts</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melange-de-concentre-proteique\" class=\"tag user_defined\" rel=\"nofollow\">fr:melange-de-concentre-proteique</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:arome-grenade\" class=\"tag user_defined\" rel=\"nofollow\">fr:arome-grenade</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E6%9F%91%E6%A9%98%E6%9E%9C%E8%86%A0\" class=\"tag user_defined\" rel=\"nofollow\">zh:柑橘果膠</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ginger-powder-cheese-powder-mix\" class=\"tag user_defined\" rel=\"nofollow\">ginger-powder-cheese-powder-mix</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zwarte-thee\" class=\"tag user_defined\" rel=\"nofollow\">zwarte-thee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sauce-cocktail\" class=\"tag user_defined\" rel=\"nofollow\">fr:sauce-cocktail</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/shea-oil\" class=\"tag known\" rel=\"nofollow\">Shea oil</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:les-ingredients-de-vos-bons-petits-cubes\" class=\"tag user_defined\" rel=\"nofollow\">fr:les-ingredients-de-vos-bons-petits-cubes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:lait\" class=\"tag user_defined\" rel=\"nofollow\">it:lait</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pin\" class=\"tag user_defined\" rel=\"nofollow\">fr:pin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:preparation-d-epices\" class=\"tag user_defined\" rel=\"nofollow\">fr:preparation-d-epices</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:boulgour-fin-rehydrate\" class=\"tag user_defined\" rel=\"nofollow\">fr:boulgour-fin-rehydrate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:ceap%C4%83-pudr%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:ceapă-pudră</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/g-fabrique-et-conftonne-par\" class=\"tag user_defined\" rel=\"nofollow\">g-fabrique-et-conftonne-par</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:boyau-collagenique-comestible\" class=\"tag user_defined\" rel=\"nofollow\">fr:boyau-collagenique-comestible</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ci-19140\" class=\"tag user_defined\" rel=\"nofollow\">ci-19140</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:une-pincee-d-extrait-de-spiruline\" class=\"tag user_defined\" rel=\"nofollow\">fr:une-pincee-d-extrait-de-spiruline</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bergamot-orange-flavouring\" class=\"tag known\" rel=\"nofollow\">Bergamot orange flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/limited-company-headquartered-in-parma\" class=\"tag user_defined\" rel=\"nofollow\">limited-company-headquartered-in-parma</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-raisin-clarifie-a-base-de-concentre\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-de-raisin-clarifie-a-base-de-concentre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-clementine\" class=\"tag known\" rel=\"nofollow\">fr:Jus de clémentine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%85%D0%BB%D0%B5%D0%B1%D0%BE%D0%BF%D0%B5%D0%BA%D0%B0%D1%80%D0%BD%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:хлебопекарная</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D0%B5%D1%87%D0%B5%D0%BD%D1%8C%D0%B5-%D1%81%D0%B0%D1%85%D0%B0%D1%80%D0%BD%D0%BE%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:печенье-сахарное</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sirop-de-glucose-de-ble-en-poudre\" class=\"tag known\" rel=\"nofollow\">fr:Sirop de glucose de blé en poudre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/xanthan-gum-salt\" class=\"tag user_defined\" rel=\"nofollow\">xanthan-gum-salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/any-dreadfully-dull-dish-to-make-it-really-chippa\" class=\"tag user_defined\" rel=\"nofollow\">any-dreadfully-dull-dish-to-make-it-really-chippa</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:cipolla-disidritata\" class=\"tag user_defined\" rel=\"nofollow\">it:cipolla-disidritata</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:c\" class=\"tag user_defined\" rel=\"nofollow\">fr:c</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:bio-pastinaak\" class=\"tag user_defined\" rel=\"nofollow\">nl:bio-pastinaak</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eau-de-source-sainte-helene\" class=\"tag user_defined\" rel=\"nofollow\">fr:eau-de-source-sainte-helene</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:preparazione-al-gusto-di-caffe\" class=\"tag user_defined\" rel=\"nofollow\">it:preparazione-al-gusto-di-caffe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tierisches-lab-hergestellt-in-der-schweiz-schweizer-hartk%C3%A4se-mit-schweizer-rohmilch-hergestellt\" class=\"tag user_defined\" rel=\"nofollow\">de:tierisches-lab-hergestellt-in-der-schweiz-schweizer-hartkäse-mit-schweizer-rohmilch-hergestellt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:brasse-st\" class=\"tag user_defined\" rel=\"nofollow\">fr:brasse-st</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-spice-extract\" class=\"tag known\" rel=\"nofollow\">Natural spice extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:malt-de-ble\" class=\"tag user_defined\" rel=\"nofollow\">it:malt-de-ble</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lactose-lactoserum-en-poudre\" class=\"tag user_defined\" rel=\"nofollow\">fr:lactose-lactoserum-en-poudre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/glace-cherry\" class=\"tag known\" rel=\"nofollow\">Glacé cherry</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:galette-de-ble-noir\" class=\"tag user_defined\" rel=\"nofollow\">fr:galette-de-ble-noir</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e525\" class=\"tag known\" rel=\"nofollow\">E525</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dont-48-framboises\" class=\"tag user_defined\" rel=\"nofollow\">fr:dont-48-framboises</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:agent-antioxydant\" class=\"tag user_defined\" rel=\"nofollow\">fr:agent-antioxydant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:vaniljeekstrakt\" class=\"tag user_defined\" rel=\"nofollow\">nb:vaniljeekstrakt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D0%BB%D1%8C-%D0%BA%D1%80%D1%83%D0%BF%D0%BD%D0%BE%D0%B3%D0%BE-%D0%BF%D0%BE%D0%BC%D0%BE%D0%BB%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:соль-крупного-помола</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bamboo-shoot\" class=\"tag known\" rel=\"nofollow\">Bamboo shoot</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D0%B8%D1%89%D0%B5%D0%B2%D0%BE%D0%B9-%D0%BD%D0%B0%D1%82%D1%83%D1%80%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9-%D0%B0%D0%BD%D1%82%D0%B8%D0%BE%D0%BA%D0%B8%D1%81%D0%BB%D0%B8%D1%82%D0%B5%D0%BB%D1%8C\" class=\"tag user_defined\" rel=\"nofollow\">ru:пищевой-натуральный-антиокислитель</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D0%BE%D0%BB%D0%B8%D1%84%D0%BE%D1%81%D1%84%D0%B0%D1%82\" class=\"tag user_defined\" rel=\"nofollow\">ru:полифосфат</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/split-pea\" class=\"tag known\" rel=\"nofollow\">Split pea</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-d-epices-dont-celeri\" class=\"tag user_defined\" rel=\"nofollow\">fr:extrait-d-epices-dont-celeri</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:batonnet-sorbet-cassis-enrobage-framboise\" class=\"tag user_defined\" rel=\"nofollow\">fr:batonnet-sorbet-cassis-enrobage-framboise</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:haricots-verts-coupes\" class=\"tag known\" rel=\"nofollow\">fr:Haricots verts coupés</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/polyhydroxystearic-acid\" class=\"tag user_defined\" rel=\"nofollow\">polyhydroxystearic-acid</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/via-haba\" class=\"tag user_defined\" rel=\"nofollow\">via-haba</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/citric\" class=\"tag user_defined\" rel=\"nofollow\">citric</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/proteines-i-eiwitten-og\" class=\"tag user_defined\" rel=\"nofollow\">proteines-i-eiwitten-og</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pourcentage-de-matieres-grasses-inferieur-a\" class=\"tag user_defined\" rel=\"nofollow\">fr:pourcentage-de-matieres-grasses-inferieur-a</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-7-lake\" class=\"tag user_defined\" rel=\"nofollow\">red-7-lake</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ensemble-reduisons-l-impact-environnemental\" class=\"tag user_defined\" rel=\"nofollow\">ensemble-reduisons-l-impact-environnemental</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/set\" class=\"tag user_defined\" rel=\"nofollow\">set</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:3-1\" class=\"tag user_defined\" rel=\"nofollow\">fr:3-1</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mais-sans-gluten\" class=\"tag user_defined\" rel=\"nofollow\">fr:mais-sans-gluten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:piments-verts-doux\" class=\"tag user_defined\" rel=\"nofollow\">fr:piments-verts-doux</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sunflower-vegetable-oils\" class=\"tag user_defined\" rel=\"nofollow\">sunflower-vegetable-oils</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fibre-ingredients-tomates\" class=\"tag user_defined\" rel=\"nofollow\">fr:fibre-ingredients-tomates</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrolysed-corn-protein\" class=\"tag known\" rel=\"nofollow\">Hydrolysed corn protein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%80%D0%B0%D1%84%D0%B8%D0%BD%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:рафинированные</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tute-dynan-ique-cetti\" class=\"tag user_defined\" rel=\"nofollow\">fr:tute-dynan-ique-cetti</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/scallop\" class=\"tag known\" rel=\"nofollow\">Scallop</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:filets-de-poulet\" class=\"tag known\" rel=\"nofollow\">fr:Filets de poulet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:feves-de-soja-sel\" class=\"tag user_defined\" rel=\"nofollow\">fr:feves-de-soja-sel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gras-de-canard\" class=\"tag user_defined\" rel=\"nofollow\">fr:gras-de-canard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beef-bones\" class=\"tag known\" rel=\"nofollow\">Beef bones</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:1-de-matieres-grasses\" class=\"tag user_defined\" rel=\"nofollow\">fr:1-de-matieres-grasses</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:nettov%C3%A6gten-dog-stadig-1-1-kg\" class=\"tag user_defined\" rel=\"nofollow\">nb:nettovægten-dog-stadig-1-1-kg</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gew%C3%BCrzextrakte-veganes-produkt\" class=\"tag user_defined\" rel=\"nofollow\">de:gewürzextrakte-veganes-produkt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:monoglutamat-de-sodiu\" class=\"tag user_defined\" rel=\"nofollow\">ro:monoglutamat-de-sodiu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miel-de-montagne-d-espagne\" class=\"tag known\" rel=\"nofollow\">fr:Miel de montagne d'Espagne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tomatenpaprika\" class=\"tag user_defined\" rel=\"nofollow\">de:tomatenpaprika</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:davon-40-edel-kakao\" class=\"tag user_defined\" rel=\"nofollow\">de:davon-40-edel-kakao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:destrosio\" class=\"tag user_defined\" rel=\"nofollow\">fr:destrosio</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%B0%D1%81%D0%BB%D0%BE%D1%81%D0%BC%D0%BE%D0%BB%D1%8B-%D0%BF%D0%B0%D0%BF%D1%80%D0%B8%D0%BA%D0%B8\" class=\"tag user_defined\" rel=\"nofollow\">ru:маслосмолы-паприки</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:guanylate-et-inosinate-disodiques\" class=\"tag user_defined\" rel=\"nofollow\">fr:guanylate-et-inosinate-disodiques</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huile-de-colza-5\" class=\"tag user_defined\" rel=\"nofollow\">fr:huile-de-colza-5</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:arom\" class=\"tag user_defined\" rel=\"nofollow\">nb:arom</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:reinweinstein\" class=\"tag user_defined\" rel=\"nofollow\">de:reinweinstein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zinc-picolinate\" class=\"tag user_defined\" rel=\"nofollow\">zinc-picolinate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:vanilliini\" class=\"tag user_defined\" rel=\"nofollow\">nb:vanilliini</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e450vii\" class=\"tag known\" rel=\"nofollow\">E450vii</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-de-bufflonne-pasteurise-provenant-de-l\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-de-bufflonne-pasteurise-provenant-de-l</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bromelain\" class=\"tag user_defined\" rel=\"nofollow\">bromelain</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/contents-may-settle-during-shipping-and-handling\" class=\"tag user_defined\" rel=\"nofollow\">contents-may-settle-during-shipping-and-handling</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-de-soja\" class=\"tag user_defined\" rel=\"nofollow\">fr:creme-de-soja</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:poudre-de-lait-ecreme\" class=\"tag user_defined\" rel=\"nofollow\">it:poudre-de-lait-ecreme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nutritional-value-per-100-ml-per-bottle\" class=\"tag user_defined\" rel=\"nofollow\">nutritional-value-per-100-ml-per-bottle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fond-de-volaille-aromatise-viande-pt-graisse-de-poulet\" class=\"tag user_defined\" rel=\"nofollow\">fr:fond-de-volaille-aromatise-viande-pt-graisse-de-poulet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:cremepulver\" class=\"tag user_defined\" rel=\"nofollow\">de:cremepulver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/less-than-20-ppm-gluten\" class=\"tag user_defined\" rel=\"nofollow\">less-than-20-ppm-gluten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BB%D0%B8%D0%B2%D0%BA%D0%B8-%D0%BF%D0%B0%D1%81%D1%82%D0%B5%D1%80%D0%B8%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:сливки-пастеризованные</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:nettogewicht-f0418108-250qe-o\" class=\"tag user_defined\" rel=\"nofollow\">de:nettogewicht-f0418108-250qe-o</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mark-5\" class=\"tag user_defined\" rel=\"nofollow\">mark-5</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:zuckerkul%C3%B6r-150d\" class=\"tag user_defined\" rel=\"nofollow\">de:zuckerkulör-150d</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lemon-balm\" class=\"tag known\" rel=\"nofollow\">Lemon balm</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/live-active-cultures\" class=\"tag user_defined\" rel=\"nofollow\">live-active-cultures</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vinaigrette\" class=\"tag known\" rel=\"nofollow\">Vinaigrette</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:bvo-egokoevera-uag-lnjdairhclta-ohne-zuckerzusatzll-1-enthalt-von-natur-aus-zucker\" class=\"tag user_defined\" rel=\"nofollow\">fr:bvo-egokoevera-uag-lnjdairhclta-ohne-zuckerzusatzll-1-enthalt-von-natur-aus-zucker</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kann-mandeln-und-erdn%C3%BCsse-enthalten\" class=\"tag user_defined\" rel=\"nofollow\">de:kann-mandeln-und-erdnüsse-enthalten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ci-42090\" class=\"tag user_defined\" rel=\"nofollow\">ci-42090</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E4%B8%83%E5%91%B3%E5%94%90%E8%BE%9B%E5%AD%90\" class=\"tag user_defined\" rel=\"nofollow\">ja:七味唐辛子</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-de-lait-pasteurisee-sel-3-max\" class=\"tag user_defined\" rel=\"nofollow\">fr:creme-de-lait-pasteurisee-sel-3-max</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:si-g\" class=\"tag user_defined\" rel=\"nofollow\">fr:si-g</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cafe-soluble\" class=\"tag user_defined\" rel=\"nofollow\">cafe-soluble</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:nat%C3%BCrliches-apfelsaft-aroma\" class=\"tag user_defined\" rel=\"nofollow\">de:natürliches-apfelsaft-aroma</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:bio-palmvet\" class=\"tag user_defined\" rel=\"nofollow\">nl:bio-palmvet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fermenti-lattici\" class=\"tag user_defined\" rel=\"nofollow\">fr:fermenti-lattici</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farines-de-ble-diastasee\" class=\"tag user_defined\" rel=\"nofollow\">fr:farines-de-ble-diastasee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:colanuss-extrakt\" class=\"tag user_defined\" rel=\"nofollow\">de:colanuss-extrakt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:papillons-de-confiserie\" class=\"tag user_defined\" rel=\"nofollow\">fr:papillons-de-confiserie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:keta-et-rouge-et-rose\" class=\"tag user_defined\" rel=\"nofollow\">fr:keta-et-rouge-et-rose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%84%D0%B5%D1%80%D0%BC%D0%B5%D0%BD%D1%82%D1%8B-%D0%BC%D0%B8%D0%BA%D1%80%D0%BE%D0%B1%D0%BD%D0%BE%D0%B3%D0%BE-%D0%BF%D1%80%D0%BE%D0%B8%D1%81%D1%85%D0%BE%D0%B6%D0%B4%D0%B5%D0%BD%D0%B8%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:ферменты-микробного-происхождения</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:contient-des-sucres-naturellement-presents\" class=\"tag user_defined\" rel=\"nofollow\">fr:contient-des-sucres-naturellement-presents</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beef-collagen-casing\" class=\"tag user_defined\" rel=\"nofollow\">beef-collagen-casing</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cracked-coriander-seed\" class=\"tag user_defined\" rel=\"nofollow\">cracked-coriander-seed</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:pulykah%C3%BAs\" class=\"tag user_defined\" rel=\"nofollow\">hu:pulykahús</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sauce-soja-fermentee\" class=\"tag user_defined\" rel=\"nofollow\">fr:sauce-soja-fermentee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lithothamnium-calcareum\" class=\"tag known\" rel=\"nofollow\">Lithothamnium calcareum</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:bleu-dans-les-cubes-bleu\" class=\"tag user_defined\" rel=\"nofollow\">fr:bleu-dans-les-cubes-bleu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:carbonat-hidrogen-de-sodiu\" class=\"tag user_defined\" rel=\"nofollow\">ro:carbonat-hidrogen-de-sodiu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:ehrenpreis\" class=\"tag user_defined\" rel=\"nofollow\">de:ehrenpreis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-chocolate-chunks-contains\" class=\"tag user_defined\" rel=\"nofollow\">white-chocolate-chunks-contains</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/trimethylsiloxysilicate\" class=\"tag user_defined\" rel=\"nofollow\">trimethylsiloxysilicate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:must-din-struguri\" class=\"tag user_defined\" rel=\"nofollow\">ro:must-din-struguri</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:granella-di-nocciola\" class=\"tag user_defined\" rel=\"nofollow\">it:granella-di-nocciola</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-partiellement-ecreme-a-1\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-partiellement-ecreme-a-1</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:energy-1901-kj-454\" class=\"tag user_defined\" rel=\"nofollow\">fr:energy-1901-kj-454</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vin-rouge-issu-de-vieilles-vignes-de-grenache\" class=\"tag user_defined\" rel=\"nofollow\">fr:vin-rouge-issu-de-vieilles-vignes-de-grenache</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/barley-malt-and-corn-extract\" class=\"tag user_defined\" rel=\"nofollow\">barley-malt-and-corn-extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:weizenmehl-type-812\" class=\"tag user_defined\" rel=\"nofollow\">de:weizenmehl-type-812</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hazelnut-oil\" class=\"tag known\" rel=\"nofollow\">Hazelnut oil</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/contains-traces-of\" class=\"tag user_defined\" rel=\"nofollow\">contains-traces-of</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mild-ges%C3%A4uert\" class=\"tag user_defined\" rel=\"nofollow\">de:mild-gesäuert</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/plant-concentrates\" class=\"tag known\" rel=\"nofollow\">Plant concentrates</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:estratto-di-vaniglia-bacche\" class=\"tag user_defined\" rel=\"nofollow\">it:estratto-di-vaniglia-bacche</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:noisettes-decortiquees\" class=\"tag known\" rel=\"nofollow\">fr:Noisettes décortiquées</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%BE%D0%BB%D0%BE%D0%BA%D0%BE-%D1%81-%D1%81%D0%B0%D1%85%D0%B0%D1%80%D0%BE%D0%BC\" class=\"tag user_defined\" rel=\"nofollow\">ru:молоко-с-сахаром</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/aloe-vera-juice\" class=\"tag known\" rel=\"nofollow\">Aloe vera juice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vitamin-e-for-added-freshness\" class=\"tag user_defined\" rel=\"nofollow\">vitamin-e-for-added-freshness</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:fermenti-latticci-vivi\" class=\"tag user_defined\" rel=\"nofollow\">it:fermenti-latticci-vivi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D1%80%D0%BE%D0%B4%D1%83%D0%BA%D1%82-%D0%BC%D0%BE%D0%BB%D0%BE%D1%87%D0%BD%D1%8B%D0%B9-%D1%81%D0%B3%D1%83%D1%89%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9-%D1%81-%D1%81%D0%B0%D1%85%D0%B0%D1%80%D0%BE%D0%BC\" class=\"tag user_defined\" rel=\"nofollow\">ru:продукт-молочный-сгущенный-с-сахаром</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/reistarke\" class=\"tag user_defined\" rel=\"nofollow\">reistarke</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/norway-lobster\" class=\"tag known\" rel=\"nofollow\">Norway lobster</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:wei%C3%9F\" class=\"tag user_defined\" rel=\"nofollow\">de:weiß</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pudre-de-serum-de-lait\" class=\"tag user_defined\" rel=\"nofollow\">fr:pudre-de-serum-de-lait</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/iceberg-lettuce\" class=\"tag known\" rel=\"nofollow\">Iceberg lettuce</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tamarindensaft\" class=\"tag user_defined\" rel=\"nofollow\">de:tamarindensaft</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:contain-ble-entier\" class=\"tag user_defined\" rel=\"nofollow\">fr:contain-ble-entier</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jeunes-pousses-de-redchard\" class=\"tag user_defined\" rel=\"nofollow\">fr:jeunes-pousses-de-redchard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%8D%D0%BA%D1%81%D1%82%D1%80%D0%B0%D0%BA%D1%82-%D1%86%D0%B8%D0%BA%D0%BE%D1%80%D0%B8%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:экстракт-цикория</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:iaurt-partial-degresat\" class=\"tag user_defined\" rel=\"nofollow\">ro:iaurt-partial-degresat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:graisse-de-pou-et\" class=\"tag user_defined\" rel=\"nofollow\">fr:graisse-de-pou-et</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cane-sugar-molasses\" class=\"tag known\" rel=\"nofollow\">Cane sugar molasses</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cire-de-camauba\" class=\"tag user_defined\" rel=\"nofollow\">fr:cire-de-camauba</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:chilis\" class=\"tag user_defined\" rel=\"nofollow\">de:chilis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pleurotus-ostreatus\" class=\"tag known\" rel=\"nofollow\">Pleurotus ostreatus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:juice\" class=\"tag user_defined\" rel=\"nofollow\">sv:juice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-lemon-extract\" class=\"tag known\" rel=\"nofollow\">Concentrated lemon extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:essig-aus-agraralkohol\" class=\"tag user_defined\" rel=\"nofollow\">de:essig-aus-agraralkohol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:conservante-iisozima-da-uovo\" class=\"tag user_defined\" rel=\"nofollow\">it:conservante-iisozima-da-uovo</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B4%D0%BB%D1%8F-%D1%81%D1%8B%D1%80%D0%B0-%D1%81-%D0%B2%D0%B5%D1%82%D1%87%D0%B8%D0%BD%D0%BE%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:для-сыра-с-ветчиной</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:a%D1%80%D0%BE%D0%BC%D0%B0%D1%82%D0%B8%D0%B7%D0%B0%D1%82%D0%BE%D1%80\" class=\"tag user_defined\" rel=\"nofollow\">ru:aроматизатор</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coriander-seed\" class=\"tag known\" rel=\"nofollow\">Coriander seed</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/antioxidationsmittel-kaliummetabisulfit\" class=\"tag user_defined\" rel=\"nofollow\">antioxidationsmittel-kaliummetabisulfit</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ribofalvine\" class=\"tag user_defined\" rel=\"nofollow\">fr:ribofalvine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:koncentrat-av-morot-och-svartvinb%C3%A4r\" class=\"tag user_defined\" rel=\"nofollow\">sv:koncentrat-av-morot-och-svartvinbär</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:noccioli-dolci-di-albicocca\" class=\"tag user_defined\" rel=\"nofollow\">it:noccioli-dolci-di-albicocca</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:schmand\" class=\"tag known\" rel=\"nofollow\">de:Schmand</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:homogenisiert\" class=\"tag user_defined\" rel=\"nofollow\">de:homogenisiert</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:si-n\" class=\"tag user_defined\" rel=\"nofollow\">fr:si-n</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:quinoa-gepufft\" class=\"tag user_defined\" rel=\"nofollow\">de:quinoa-gepufft</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:tapad%C3%A1sg%C3%A1tl%C3%B3-anyag\" class=\"tag user_defined\" rel=\"nofollow\">hu:tapadásgátló-anyag</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pommes-de-terre-prefrites\" class=\"tag known\" rel=\"nofollow\">fr:Pommes de terre préfrites</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:peche-aux-chaluts-en-ocean-pacifique-nord-ouest-et-nord-est\" class=\"tag user_defined\" rel=\"nofollow\">fr:peche-aux-chaluts-en-ocean-pacifique-nord-ouest-et-nord-est</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:och-plantkoncentrat\" class=\"tag user_defined\" rel=\"nofollow\">sv:och-plantkoncentrat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B4%D0%B8%D1%81%D1%82%D0%B8%D0%BB%D0%BB%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D0%BC%D0%BE%D0%BD%D0%BE%D0%B3%D0%BB%D0%B8%D1%86%D0%B5%D1%80%D0%B8%D0%B4%D1%8B\" class=\"tag user_defined\" rel=\"nofollow\">ru:дистиллированные-моноглицериды</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BB%D0%B8%D0%BC%D0%BE%D0%BD%D0%BD%D1%8B%D0%B9-%D0%B0%D1%80%D0%BE%D0%BC%D0%B0%D1%82%D0%B8%D0%B7%D0%B0%D1%82%D0%BE%D1%80\" class=\"tag user_defined\" rel=\"nofollow\">ru:лимонный-ароматизатор</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:preparation-speciale-chartreuse-verte-des-peres-chartreux\" class=\"tag user_defined\" rel=\"nofollow\">fr:preparation-speciale-chartreuse-verte-des-peres-chartreux</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lime-flavouring\" class=\"tag known\" rel=\"nofollow\">Lime flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-concentre-de-sureau-et-concentre-de-betterave-rouge\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-concentre-de-sureau-et-concentre-de-betterave-rouge</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-ecreme-en-poudre-reconstitue\" class=\"tag known\" rel=\"nofollow\">fr:Lait écrémé en poudre reconstitué</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:aroma-sabor-jamon\" class=\"tag user_defined\" rel=\"nofollow\">es:aroma-sabor-jamon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D0%B0%D1%85%D1%82%D0%B0-%D1%81%D1%83%D1%85%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:пахта-сухая</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sorrel\" class=\"tag known\" rel=\"nofollow\">Sorrel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:currypuler\" class=\"tag user_defined\" rel=\"nofollow\">de:currypuler</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:eicheln\" class=\"tag user_defined\" rel=\"nofollow\">de:eicheln</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:en\" class=\"tag user_defined\" rel=\"nofollow\">fr:en</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:filets-tournants-et-souleves\" class=\"tag user_defined\" rel=\"nofollow\">fr:filets-tournants-et-souleves</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:getreideflocken\" class=\"tag known\" rel=\"nofollow\">de:Getreideflocken</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/liquid-sugar\" class=\"tag known\" rel=\"nofollow\">Liquid sugar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n";

    public static String split8 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:comprenant-des-extraits-naturels-de-fruits\" class=\"tag user_defined\" rel=\"nofollow\">fr:comprenant-des-extraits-naturels-de-fruits</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:zucchero-caramellizzato\" class=\"tag user_defined\" rel=\"nofollow\">it:zucchero-caramellizzato</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kurkumaaroma\" class=\"tag user_defined\" rel=\"nofollow\">de:kurkumaaroma</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ca:carbonat-acid-de-sodi-i-difosfat-de-disodi\" class=\"tag known\" rel=\"nofollow\">ca:Carbonat àcid de sodi i difosfat de disodi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/polyglycol\" class=\"tag user_defined\" rel=\"nofollow\">polyglycol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-pasteurise-de-brebis\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-pasteurise-de-brebis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-quinoa\" class=\"tag known\" rel=\"nofollow\">White quinoa</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sirop-de-sucres-issus-de-fruits\" class=\"tag known\" rel=\"nofollow\">fr:Sirop de sucres issus de fruits</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-chocolate-chunks\" class=\"tag user_defined\" rel=\"nofollow\">white-chocolate-chunks</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/organic-buckwheat\" class=\"tag user_defined\" rel=\"nofollow\">organic-buckwheat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/microbial-milk-coagulant\" class=\"tag user_defined\" rel=\"nofollow\">microbial-milk-coagulant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B3%D0%BB%D1%8E%D0%BA%D0%BE%D0%B7%D0%B0-%D1%81%D0%B8%D1%80%D0%BE%D0%BF\" class=\"tag user_defined\" rel=\"nofollow\">ru:глюкоза-сироп</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:f%C3%A4rbendes-lebensmittel-holundersaftkonzentrat\" class=\"tag user_defined\" rel=\"nofollow\">de:färbendes-lebensmittel-holundersaftkonzentrat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:e471\" class=\"tag user_defined\" rel=\"nofollow\">zh:e471</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rehydrated-soy-protein\" class=\"tag known\" rel=\"nofollow\">Rehydrated soy protein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:chocolat-au-lait-aux-noisettes-gjanduja\" class=\"tag user_defined\" rel=\"nofollow\">fr:chocolat-au-lait-aux-noisettes-gjanduja</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kristallisierter-zuckerrohrsaft\" class=\"tag user_defined\" rel=\"nofollow\">de:kristallisierter-zuckerrohrsaft</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%B8%D0%BC%D0%B1%D0%B8%D0%BE%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B0%D1%8F-%D1%81%D0%B0%D0%BC%D0%BE%D0%BA%D0%BE%D0%BD%D1%81%D0%B5%D1%80%D0%B2%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%B0%D1%8F-%D0%B7%D0%B0%D0%BA%D0%B2%D0%B0%D1%81%D0%BA%D0%B0-%D0%BC%D0%BE%D0%BB%D0%BE%D1%87%D0%BD%D0%BE%D0%BA%D0%B8%D1%81%D0%BB%D0%BE%D0%B3%D0%BE-%D1%81%D0%B8%D0%BC%D0%B1%D0%B8%D0%BE%D0%B7%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:симбиотическая-самоконсервированная-закваска-молочнокислого-симбиоза</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-flavouring\" class=\"tag known\" rel=\"nofollow\">Chicken flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pl:suszony-szczypior\" class=\"tag user_defined\" rel=\"nofollow\">pl:suszony-szczypior</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e418\" class=\"tag known\" rel=\"nofollow\">E418</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:granule-d-oignon\" class=\"tag user_defined\" rel=\"nofollow\">fr:granule-d-oignon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:gyorsfagyasztott-z%C3%B6lds%C3%A9gkever%C3%A9k-v%C3%A1ltoz%C3%B3-ar%C3%A1nyban\" class=\"tag user_defined\" rel=\"nofollow\">hu:gyorsfagyasztott-zöldségkeverék-változó-arányban</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D1%82%D0%B5%D0%B0%D1%80%D0%BE%D0%B8%D0%BB-2-%D0%BB%D0%B0%D0%BA%D1%82%D0%B8%D0%BB%D0%B0%D1%82-%D0%BA%D0%B0%D0%BB%D1%8C%D1%86%D0%B8%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:стеароил-2-лактилат-кальция</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:fermenterat-vete-mj%C3%B6l\" class=\"tag user_defined\" rel=\"nofollow\">sv:fermenterat-vete-mjöl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rice-bran-oil\" class=\"tag known\" rel=\"nofollow\">Rice bran oil</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fish-sauce\" class=\"tag known\" rel=\"nofollow\">Fish sauce</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pasteurised-semi-skimmed-cow-s-milk\" class=\"tag known\" rel=\"nofollow\">Pasteurised semi-skimmed cow's milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:b\" class=\"tag user_defined\" rel=\"nofollow\">fr:b</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/green-asparagus\" class=\"tag known\" rel=\"nofollow\">Green asparagus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-lettuce\" class=\"tag user_defined\" rel=\"nofollow\">red-lettuce</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:g-ingredienser\" class=\"tag user_defined\" rel=\"nofollow\">nb:g-ingredienser</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:reduisez-la-quantite-d-eau-de-moitie-et-le-temps-de-cuisson-a-20mn\" class=\"tag user_defined\" rel=\"nofollow\">fr:reduisez-la-quantite-d-eau-de-moitie-et-le-temps-de-cuisson-a-20mn</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vin-blanc-bourgogne-aligote\" class=\"tag user_defined\" rel=\"nofollow\">fr:vin-blanc-bourgogne-aligote</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:7-3-cacao-maigre\" class=\"tag user_defined\" rel=\"nofollow\">fr:7-3-cacao-maigre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tm\" class=\"tag user_defined\" rel=\"nofollow\">de:tm</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:persikojuice-fr%C3%A5n-koncentrat\" class=\"tag user_defined\" rel=\"nofollow\">sv:persikojuice-från-koncentrat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lamb-meat\" class=\"tag known\" rel=\"nofollow\">Lamb meat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fromage-a-raclette\" class=\"tag user_defined\" rel=\"nofollow\">fr:fromage-a-raclette</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:rosa-damascena\" class=\"tag user_defined\" rel=\"nofollow\">fr:rosa-damascena</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sweetened-condensed-semi-skimmed-milk\" class=\"tag known\" rel=\"nofollow\">Sweetened condensed semi-skimmed milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dont-0\" class=\"tag user_defined\" rel=\"nofollow\">fr:dont-0</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/oxyde-de-zinc\" class=\"tag user_defined\" rel=\"nofollow\">oxyde-de-zinc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eau-de-source-dromeline\" class=\"tag user_defined\" rel=\"nofollow\">fr:eau-de-source-dromeline</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:sokeri\" class=\"tag user_defined\" rel=\"nofollow\">nb:sokeri</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:f%C4%83in%C4%83-de-mal%C8%9B-pr%C4%83jit\" class=\"tag user_defined\" rel=\"nofollow\">ro:făină-de-malț-prăjit</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e337\" class=\"tag known\" rel=\"nofollow\">E337</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:eibisch\" class=\"tag user_defined\" rel=\"nofollow\">de:eibisch</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-cola-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural cola flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:bonite\" class=\"tag known\" rel=\"nofollow\">fr:Bonite</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:5-%E9%B3%A5%E5%98%8C%E5%91%A4%E6%A0%B8%E7%94%98%E7%A3%B7%E4%BA%8C%E9%85%B8%E9%88%89\" class=\"tag user_defined\" rel=\"nofollow\">zh:5-鳥嘌呤核甘磷二酸鈉</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/strawberry-flavouring\" class=\"tag known\" rel=\"nofollow\">Strawberry flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miel-d-oranger-d-espagne\" class=\"tag known\" rel=\"nofollow\">fr:Miel d'oranger d'espagne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/contains-less-than-1-of-corn-starch\" class=\"tag user_defined\" rel=\"nofollow\">contains-less-than-1-of-corn-starch</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:poudes-a-lever\" class=\"tag user_defined\" rel=\"nofollow\">fr:poudes-a-lever</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:sirop-glucoz%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:sirop-glucoză</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BB%D0%BE%D1%81%D0%BE%D1%81%D1%8C\" class=\"tag user_defined\" rel=\"nofollow\">ru:лосось</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ice-cream\" class=\"tag known\" rel=\"nofollow\">Ice cream</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:past%C4%83-de-tomate\" class=\"tag user_defined\" rel=\"nofollow\">ro:pastă-de-tomate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cooking-cream\" class=\"tag user_defined\" rel=\"nofollow\">cooking-cream</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:pulp%C4%83-porc-cu-sl%C4%83nin%C4%83-%C8%99i-%C8%99orici\" class=\"tag user_defined\" rel=\"nofollow\">ro:pulpă-porc-cu-slănină-și-șorici</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:pate-de-noisettes\" class=\"tag user_defined\" rel=\"nofollow\">it:pate-de-noisettes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sequestrant\" class=\"tag known\" rel=\"nofollow\">Sequestrant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:oranges-douces\" class=\"tag user_defined\" rel=\"nofollow\">fr:oranges-douces</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/demerara-sugar\" class=\"tag known\" rel=\"nofollow\">Demerara sugar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:nees\" class=\"tag user_defined\" rel=\"nofollow\">fr:nees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cheddar-cheese-and-paprika-crumb\" class=\"tag user_defined\" rel=\"nofollow\">cheddar-cheese-and-paprika-crumb</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D0%BB%D1%8C-%D0%BF%D0%BE%D0%B2%D0%B0%D1%80%D0%B5%D0%BD%D0%BD%D0%B0%D1%8F-%D0%BF%D0%B8%D1%89%D0%B5%D0%B2%D0%B0%D1%8F-%D0%B2%D1%8B%D0%B2%D0%B0%D1%80%D0%BE%D1%87%D0%BD%D0%B0%D1%8F-%D0%B9%D0%BE%D0%B4%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:соль-поваренная-пищевая-выварочная-йодированная</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:quenelles-de-volaille\" class=\"tag user_defined\" rel=\"nofollow\">fr:quenelles-de-volaille</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:sussungsmittel\" class=\"tag user_defined\" rel=\"nofollow\">de:sussungsmittel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:perles-de-confiserie-3-couleurs\" class=\"tag user_defined\" rel=\"nofollow\">fr:perles-de-confiserie-3-couleurs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:passion-mangue\" class=\"tag user_defined\" rel=\"nofollow\">fr:passion-mangue</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:vegetabilisk-e471\" class=\"tag user_defined\" rel=\"nofollow\">sv:vegetabilisk-e471</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/orange-blossom-honey\" class=\"tag known\" rel=\"nofollow\">Orange blossom honey</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:f%C4%83in%C4%83-de-secar%C4%83-integral%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:făină-de-secară-integrală</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:salsa-ai-cetrioli\" class=\"tag user_defined\" rel=\"nofollow\">it:salsa-ai-cetrioli</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:au-dos-du-paquet\" class=\"tag user_defined\" rel=\"nofollow\">it:au-dos-du-paquet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:agents-de-couverture\" class=\"tag user_defined\" rel=\"nofollow\">fr:agents-de-couverture</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:froide-en-dessert-et-chaude\" class=\"tag user_defined\" rel=\"nofollow\">fr:froide-en-dessert-et-chaude</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:schl%C3%BCsselblume\" class=\"tag user_defined\" rel=\"nofollow\">de:schlüsselblume</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-egg-yolk-powder\" class=\"tag known\" rel=\"nofollow\">Chicken egg yolk powder</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:glutam%C3%A1t\" class=\"tag user_defined\" rel=\"nofollow\">hu:glutamát</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sarrasin-sans-gluten\" class=\"tag user_defined\" rel=\"nofollow\">fr:sarrasin-sans-gluten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:med-emulgat-soyalecitin\" class=\"tag user_defined\" rel=\"nofollow\">nb:med-emulgat-soyalecitin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lavender\" class=\"tag known\" rel=\"nofollow\">Lavender</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:aubergine-variete-longue-categorie-ii\" class=\"tag user_defined\" rel=\"nofollow\">fr:aubergine-variete-longue-categorie-ii</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D1%8B%D0%B2%D0%BE%D1%80%D0%BE%D1%82%D0%BA%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:сыворотка</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:amidon-modificat-de-porumb\" class=\"tag user_defined\" rel=\"nofollow\">hu:amidon-modificat-de-porumb</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-fraiche-liquide\" class=\"tag known\" rel=\"nofollow\">fr:Crème fraîche liquide</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/desiccated-coconut\" class=\"tag known\" rel=\"nofollow\">Desiccated coconut</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:instant-kaffee\" class=\"tag user_defined\" rel=\"nofollow\">de:instant-kaffee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ice\" class=\"tag known\" rel=\"nofollow\">Ice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ngs-potato-whey-powder-imiik\" class=\"tag user_defined\" rel=\"nofollow\">fr:ngs-potato-whey-powder-imiik</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:bon\" class=\"tag user_defined\" rel=\"nofollow\">fr:bon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tomatenmark-14\" class=\"tag user_defined\" rel=\"nofollow\">de:tomatenmark-14</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dried-gluten-free-sourdough\" class=\"tag user_defined\" rel=\"nofollow\">dried-gluten-free-sourdough</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:un-filet-d-huiles-vegetales-de-colza\" class=\"tag user_defined\" rel=\"nofollow\">fr:un-filet-d-huiles-vegetales-de-colza</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:matiere-grasse-de-lait-anhydre\" class=\"tag user_defined\" rel=\"nofollow\">it:matiere-grasse-de-lait-anhydre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:delikatess-schinkenwurst\" class=\"tag user_defined\" rel=\"nofollow\">de:delikatess-schinkenwurst</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:schinus-terebinthifolius\" class=\"tag user_defined\" rel=\"nofollow\">fr:schinus-terebinthifolius</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-carotte-et-d-hibiscus-concentre\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-de-carotte-et-d-hibiscus-concentre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/curing-salt\" class=\"tag known\" rel=\"nofollow\">Curing salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:native-maisst%C3%A4rke\" class=\"tag user_defined\" rel=\"nofollow\">de:native-maisstärke</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:meion\" class=\"tag user_defined\" rel=\"nofollow\">fr:meion</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:riesen-champignons-klasse-i\" class=\"tag user_defined\" rel=\"nofollow\">de:riesen-champignons-klasse-i</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:feuilles-de-the-vert\" class=\"tag user_defined\" rel=\"nofollow\">fr:feuilles-de-the-vert</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:da-uovo\" class=\"tag user_defined\" rel=\"nofollow\">it:da-uovo</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:orangenzellen\" class=\"tag user_defined\" rel=\"nofollow\">de:orangenzellen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/powdered-sugar\" class=\"tag known\" rel=\"nofollow\">Powdered sugar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:specialite-laitiere-a-tartiner-et-a-cuisiner\" class=\"tag user_defined\" rel=\"nofollow\">fr:specialite-laitiere-a-tartiner-et-a-cuisiner</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:produs-din-zer\" class=\"tag user_defined\" rel=\"nofollow\">ro:produs-din-zer</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/barbecue-flavouring\" class=\"tag known\" rel=\"nofollow\">Barbecue flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/via-mantova\" class=\"tag user_defined\" rel=\"nofollow\">via-mantova</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melange-d-au-moins-trois-varietes-de-salades-parmi-jeunes-pousses-de-laitue\" class=\"tag user_defined\" rel=\"nofollow\">fr:melange-d-au-moins-trois-varietes-de-salades-parmi-jeunes-pousses-de-laitue</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:salz-sauerungsmittel\" class=\"tag user_defined\" rel=\"nofollow\">de:salz-sauerungsmittel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:substances-vegetales\" class=\"tag user_defined\" rel=\"nofollow\">fr:substances-vegetales</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e900\" class=\"tag known\" rel=\"nofollow\">E900</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/retinyl-acetate\" class=\"tag known\" rel=\"nofollow\">Retinyl acetate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/citron-vert\" class=\"tag user_defined\" rel=\"nofollow\">citron-vert</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-carotte-noire-concentre\" class=\"tag known\" rel=\"nofollow\">fr:Jus de carotte noire concentré</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:t\" class=\"tag user_defined\" rel=\"nofollow\">de:t</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gouda-ringe\" class=\"tag user_defined\" rel=\"nofollow\">de:gouda-ringe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/68-77-f\" class=\"tag user_defined\" rel=\"nofollow\">68-77-f</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:morceaux-de-foie-gras-de-canard\" class=\"tag known\" rel=\"nofollow\">fr:Morceaux de foie gras de canard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sulfites-amel\" class=\"tag user_defined\" rel=\"nofollow\">fr:sulfites-amel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:a-l-encre-de-seiche\" class=\"tag user_defined\" rel=\"nofollow\">fr:a-l-encre-de-seiche</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%81%8B%E3%81%BE%E3%81%BC%E3%81%93%EF%BC%89\" class=\"tag user_defined\" rel=\"nofollow\">ja:かまぼこ）</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/liquid-egg-yolk\" class=\"tag known\" rel=\"nofollow\">Liquid egg yolk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:avoine-sirop-de-malt-d-orge\" class=\"tag user_defined\" rel=\"nofollow\">fr:avoine-sirop-de-malt-d-orge</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:les-conseils-du-chef\" class=\"tag user_defined\" rel=\"nofollow\">fr:les-conseils-du-chef</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrolysed-soy-protein\" class=\"tag known\" rel=\"nofollow\">Hydrolysed soy protein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/humboldt-squid\" class=\"tag known\" rel=\"nofollow\">Humboldt squid</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chia-seed\" class=\"tag known\" rel=\"nofollow\">Chia seed</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brown-rice-flour\" class=\"tag known\" rel=\"nofollow\">Brown rice flour</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e172ii\" class=\"tag known\" rel=\"nofollow\">E172ii</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B1%D0%B0%D1%80%D0%B1%D0%B0%D1%80%D0%B8%D1%81\" class=\"tag user_defined\" rel=\"nofollow\">ru:барбарис</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:ap%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">hu:apă</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:menthol-2-4mg\" class=\"tag user_defined\" rel=\"nofollow\">fr:menthol-2-4mg</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dyxsis\" class=\"tag user_defined\" rel=\"nofollow\">dyxsis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:e259\" class=\"tag user_defined\" rel=\"nofollow\">fr:e259</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:acidifian%C8%9Bi\" class=\"tag user_defined\" rel=\"nofollow\">ro:acidifianți</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:caffe-instantaneo\" class=\"tag user_defined\" rel=\"nofollow\">it:caffe-instantaneo</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/the-noir-aromatise-bergamote-ingredients\" class=\"tag user_defined\" rel=\"nofollow\">the-noir-aromatise-bergamote-ingredients</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mandarin-juice\" class=\"tag known\" rel=\"nofollow\">Mandarin juice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beef-and-ale-pie-filling\" class=\"tag user_defined\" rel=\"nofollow\">beef-and-ale-pie-filling</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wholegrain\" class=\"tag user_defined\" rel=\"nofollow\">wholegrain</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:boia-ardei-dulce\" class=\"tag user_defined\" rel=\"nofollow\">hu:boia-ardei-dulce</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/no1\" class=\"tag known\" rel=\"nofollow\">No1</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bacon-burger-contain\" class=\"tag user_defined\" rel=\"nofollow\">bacon-burger-contain</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gouda\" class=\"tag user_defined\" rel=\"nofollow\">fr:gouda</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:vollmilchpulver-laktose\" class=\"tag user_defined\" rel=\"nofollow\">de:vollmilchpulver-laktose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:glasnudeln\" class=\"tag user_defined\" rel=\"nofollow\">de:glasnudeln</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:bourbon-vanilleschotenertraie-0\" class=\"tag user_defined\" rel=\"nofollow\">de:bourbon-vanilleschotenertraie-0</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/of-milk-mozzarella\" class=\"tag user_defined\" rel=\"nofollow\">of-milk-mozzarella</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:foie-de-porc\" class=\"tag user_defined\" rel=\"nofollow\">de:foie-de-porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E4%B9%BE%E7%87%A5%E9%A6%AC%E9%88%B4%E8%96%AF\" class=\"tag user_defined\" rel=\"nofollow\">zh:乾燥馬鈴薯</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:amidon-onset-era-l-abri-de-la-chaleur-et-de-l-humidite\" class=\"tag user_defined\" rel=\"nofollow\">fr:amidon-onset-era-l-abri-de-la-chaleur-et-de-l-humidite</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sel-epices\" class=\"tag user_defined\" rel=\"nofollow\">fr:sel-epices</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sesame-complet\" class=\"tag known\" rel=\"nofollow\">fr:Sésame complet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milcheiweiss\" class=\"tag user_defined\" rel=\"nofollow\">milcheiweiss</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-reconstitue-a-2\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-reconstitue-a-2</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whisky\" class=\"tag known\" rel=\"nofollow\">Whisky</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:issue-de-lait-de-vache\" class=\"tag user_defined\" rel=\"nofollow\">fr:issue-de-lait-de-vache</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/barley-malt-syrup\" class=\"tag known\" rel=\"nofollow\">Barley malt syrup</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:piure-de-piersici\" class=\"tag user_defined\" rel=\"nofollow\">ro:piure-de-piersici</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e329\" class=\"tag known\" rel=\"nofollow\">E329</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/frying-oil\" class=\"tag known\" rel=\"nofollow\">Frying oil</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:calibre-40\" class=\"tag user_defined\" rel=\"nofollow\">fr:calibre-40</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cassia\" class=\"tag known\" rel=\"nofollow\">Cassia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:poivre-noir-baies-de-genievre-cardamome-clous-de-girofle-extrait-de-racine-d-angelique\" class=\"tag user_defined\" rel=\"nofollow\">fr:poivre-noir-baies-de-genievre-cardamome-clous-de-girofle-extrait-de-racine-d-angelique</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:viande-de-poulet-traitee-en-salaison\" class=\"tag known\" rel=\"nofollow\">fr:Viande de poulet traitée en salaison</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lime-oil\" class=\"tag known\" rel=\"nofollow\">Lime oil</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tahini\" class=\"tag known\" rel=\"nofollow\">Tahini</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:f%C3%A4rbendes-karottenkonzentrat\" class=\"tag user_defined\" rel=\"nofollow\">de:färbendes-karottenkonzentrat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e959\" class=\"tag known\" rel=\"nofollow\">E959</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:599-mandarines\" class=\"tag user_defined\" rel=\"nofollow\">fr:599-mandarines</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:grains-de-nougatine\" class=\"tag user_defined\" rel=\"nofollow\">fr:grains-de-nougatine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n";

    public static String split9 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/artificial-flavouring\" class=\"tag known\" rel=\"nofollow\">Artificial flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:goudapulver\" class=\"tag user_defined\" rel=\"nofollow\">de:goudapulver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:indemnes\" class=\"tag user_defined\" rel=\"nofollow\">fr:indemnes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extraits-aqueux\" class=\"tag user_defined\" rel=\"nofollow\">fr:extraits-aqueux</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/volkoren-tarwemeel\" class=\"tag user_defined\" rel=\"nofollow\">volkoren-tarwemeel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:calvados-modifie\" class=\"tag user_defined\" rel=\"nofollow\">fr:calvados-modifie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E7%B3%96%E9%A1%9E\" class=\"tag user_defined\" rel=\"nofollow\">ja:糖類</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dont-42\" class=\"tag user_defined\" rel=\"nofollow\">fr:dont-42</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/carmin\" class=\"tag user_defined\" rel=\"nofollow\">carmin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:le-contenu-dans-une-casserole-tout-en-remuant\" class=\"tag user_defined\" rel=\"nofollow\">fr:le-contenu-dans-une-casserole-tout-en-remuant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-glycerin\" class=\"tag user_defined\" rel=\"nofollow\">vegetable-glycerin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pumpkin-seed-protein\" class=\"tag user_defined\" rel=\"nofollow\">pumpkin-seed-protein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miel-cremeux-recolte-en-france\" class=\"tag user_defined\" rel=\"nofollow\">fr:miel-cremeux-recolte-en-france</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:fructo-01igosaccharide-sirup\" class=\"tag user_defined\" rel=\"nofollow\">de:fructo-01igosaccharide-sirup</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e519\" class=\"tag known\" rel=\"nofollow\">E519</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/smoked-sausage\" class=\"tag known\" rel=\"nofollow\">Smoked sausage</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:streptococcus-thermophilus-e-lactobacillus-blugaricus\" class=\"tag user_defined\" rel=\"nofollow\">it:streptococcus-thermophilus-e-lactobacillus-blugaricus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:maionese-olio-di-semi-di-girasole\" class=\"tag user_defined\" rel=\"nofollow\">it:maionese-olio-di-semi-di-girasole</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/green-chili-pepper\" class=\"tag known\" rel=\"nofollow\">Green chili pepper</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:trennmittel-maisst%C3%A4rke\" class=\"tag user_defined\" rel=\"nofollow\">de:trennmittel-maisstärke</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/di\" class=\"tag user_defined\" rel=\"nofollow\">di</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sprouted-sesame-seeds\" class=\"tag user_defined\" rel=\"nofollow\">sprouted-sesame-seeds</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fabrique-dans-un-atelier-utilisant-egalement\" class=\"tag user_defined\" rel=\"nofollow\">fr:fabrique-dans-un-atelier-utilisant-egalement</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:figues-sechee-pulled\" class=\"tag user_defined\" rel=\"nofollow\">fr:figues-sechee-pulled</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:a-conserver-au-refrigerateur-et-a-consommer-rapidement-amsomar-de-preference-avant-la-date-figurant-sur-le-fond-de-la-bols-service-consommateurs\" class=\"tag user_defined\" rel=\"nofollow\">fr:a-conserver-au-refrigerateur-et-a-consommer-rapidement-amsomar-de-preference-avant-la-date-figurant-sur-le-fond-de-la-bols-service-consommateurs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:naturbelassen\" class=\"tag user_defined\" rel=\"nofollow\">de:naturbelassen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:arome-raisin\" class=\"tag user_defined\" rel=\"nofollow\">fr:arome-raisin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:korinthen\" class=\"tag user_defined\" rel=\"nofollow\">de:korinthen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-de-ble-integrale\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-de-ble-integrale</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:guinness-th-tm-for-ign-extra-stout-bier-cervesa-extra-a-in-irelan-y\" class=\"tag user_defined\" rel=\"nofollow\">fr:guinness-th-tm-for-ign-extra-stout-bier-cervesa-extra-a-in-irelan-y</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ploce-sauscges-aking-tray-in-the-middle-oven-and-cook\" class=\"tag user_defined\" rel=\"nofollow\">ploce-sauscges-aking-tray-in-the-middle-oven-and-cook</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%BE%D1%80%D0%BA%D0%BE%D0%B2%D1%8C-%D1%81%D1%82%D0%BE%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:морковь-столовая</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e559\" class=\"tag known\" rel=\"nofollow\">E559</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vinaigrette-au-vinaigre-balsamique\" class=\"tag user_defined\" rel=\"nofollow\">fr:vinaigrette-au-vinaigre-balsamique</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mild-whole-kefir\" class=\"tag known\" rel=\"nofollow\">Mild whole kefir</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wax-bean\" class=\"tag known\" rel=\"nofollow\">Wax bean</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:Quellkohlens%C3%A4ure\" class=\"tag known\" rel=\"nofollow\">de:Quellkohlensäure</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:riz-rond-complet\" class=\"tag known\" rel=\"nofollow\">fr:Riz rond complet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:br%C3%A2nzeturi\" class=\"tag user_defined\" rel=\"nofollow\">ro:brânzeturi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/safflower-concentrate\" class=\"tag known\" rel=\"nofollow\">Safflower concentrate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:matieres-grasses-let-acides-gras-satcres-glgcides-sgcres-proteines\" class=\"tag user_defined\" rel=\"nofollow\">fr:matieres-grasses-let-acides-gras-satcres-glgcides-sgcres-proteines</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:pari-all-5-nel-gelato-alla-panna\" class=\"tag user_defined\" rel=\"nofollow\">it:pari-all-5-nel-gelato-alla-panna</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gelee-decor\" class=\"tag user_defined\" rel=\"nofollow\">fr:gelee-decor</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:derivado-lacteo-en-polvo\" class=\"tag known\" rel=\"nofollow\">es:Derivado lacteo en polvo</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:sel\" class=\"tag user_defined\" rel=\"nofollow\">it:sel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/garam-masala\" class=\"tag known\" rel=\"nofollow\">Garam masala</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:%C3%A9pices\" class=\"tag user_defined\" rel=\"nofollow\">de:épices</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:ro%C8%99ii-uscate\" class=\"tag user_defined\" rel=\"nofollow\">ro:roșii-uscate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huile-de-palme-completement-hydrogenee\" class=\"tag user_defined\" rel=\"nofollow\">fr:huile-de-palme-completement-hydrogenee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/blanches-almonds\" class=\"tag known\" rel=\"nofollow\">Blanches almonds</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-thyme-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural thyme flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:branntweinessig-speisesalz\" class=\"tag user_defined\" rel=\"nofollow\">de:branntweinessig-speisesalz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mini-cone-vanille\" class=\"tag user_defined\" rel=\"nofollow\">fr:mini-cone-vanille</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-smoke-and-grill-flavors\" class=\"tag user_defined\" rel=\"nofollow\">natural-smoke-and-grill-flavors</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tentacules-de-calamar\" class=\"tag user_defined\" rel=\"nofollow\">fr:tentacules-de-calamar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e225\" class=\"tag known\" rel=\"nofollow\">E225</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/black-radish\" class=\"tag known\" rel=\"nofollow\">Black radish</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:suc-de-piersici-din-suc-concentrat-de-piersici\" class=\"tag user_defined\" rel=\"nofollow\">ro:suc-de-piersici-din-suc-concentrat-de-piersici</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e941\" class=\"tag known\" rel=\"nofollow\">E941</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/keep-out-of-reach-of-children\" class=\"tag user_defined\" rel=\"nofollow\">keep-out-of-reach-of-children</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D1%80%D0%BE%D0%B4%D1%83%D0%BA%D1%82-%D1%82%D0%B2%D0%BE%D1%80%D0%BE%D0%B6%D0%BD%D1%8B%D0%B9-%D1%81-%D0%B7%D0%B0%D0%BC%D0%B5%D0%BD%D0%B8%D1%82%D0%B5%D0%BB%D0%B5%D0%BC-%D0%BC%D0%BE%D0%BB%D0%BE%D1%87%D0%BD%D0%BE%D0%B3%D0%BE-%D0%B6%D0%B8%D1%80%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:продукт-творожный-с-заменителем-молочного-жира</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:arome-vodka-pomme\" class=\"tag user_defined\" rel=\"nofollow\">fr:arome-vodka-pomme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:de-concentrat\" class=\"tag user_defined\" rel=\"nofollow\">fr:de-concentrat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pates-a-lasagne-seche\" class=\"tag user_defined\" rel=\"nofollow\">fr:pates-a-lasagne-seche</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:limettenauszug\" class=\"tag user_defined\" rel=\"nofollow\">de:limettenauszug</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cognac-hors-age\" class=\"tag user_defined\" rel=\"nofollow\">fr:cognac-hors-age</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:cupua%C3%A7up%C3%BCree\" class=\"tag user_defined\" rel=\"nofollow\">de:cupuaçupüree</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:zumo-de-uva-y-limon-a-partir-de-concentrado\" class=\"tag user_defined\" rel=\"nofollow\">es:zumo-de-uva-y-limon-a-partir-de-concentrado</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ou-noix-d-arbres\" class=\"tag user_defined\" rel=\"nofollow\">ou-noix-d-arbres</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sheep-s-milk-cheese\" class=\"tag known\" rel=\"nofollow\">Sheep's-milk cheese</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/flaked-almonds\" class=\"tag known\" rel=\"nofollow\">Flaked almonds</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-de-lait-pasteurisee\" class=\"tag user_defined\" rel=\"nofollow\">fr:creme-de-lait-pasteurisee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/maltose-syrup\" class=\"tag known\" rel=\"nofollow\">Maltose syrup</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:no-innholdet-synker-sammen-under-transport\" class=\"tag user_defined\" rel=\"nofollow\">nb:no-innholdet-synker-sammen-under-transport</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/poudre-de-cacao\" class=\"tag user_defined\" rel=\"nofollow\">poudre-de-cacao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BA%D0%BE%D0%BF%D1%87%D1%91%D0%BD%D0%B0%D1%8F-%D0%BA%D0%B8%D0%BB%D1%8C%D0%BA%D0%B0-%D0%B8-%D1%81%D0%B0%D0%BB%D0%B0%D0%BA%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:копчёная-килька-и-салака</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:huhnfleisch-gegart\" class=\"tag user_defined\" rel=\"nofollow\">de:huhnfleisch-gegart</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dont-feuilles-de-basilic-deshydratees\" class=\"tag user_defined\" rel=\"nofollow\">fr:dont-feuilles-de-basilic-deshydratees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:i2%C5%93en-von-gluten-und-h%C3%BChnerei-eiweib-k%C3%B4nnen-nicht-ausgeschlossen-werden\" class=\"tag user_defined\" rel=\"nofollow\">de:i2œen-von-gluten-und-hühnerei-eiweib-kônnen-nicht-ausgeschlossen-werden</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/apple-vinegar\" class=\"tag known\" rel=\"nofollow\">Apple vinegar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%83%93%E3%82%BF%E3%83%9F%E3%83%B3%EF%BD%82%EF%BC%91\" class=\"tag user_defined\" rel=\"nofollow\">ja:ビタミンｂ１</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:emulgator-lecitin%C4%83-de-soia\" class=\"tag user_defined\" rel=\"nofollow\">ro:emulgator-lecitină-de-soia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-pasteurise-partiellement-ecreme\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-pasteurise-partiellement-ecreme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:schafsaitliing\" class=\"tag user_defined\" rel=\"nofollow\">de:schafsaitliing</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:oeufs-frais-14-stabilisants\" class=\"tag user_defined\" rel=\"nofollow\">fr:oeufs-frais-14-stabilisants</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:eier-aus-freilandhaltung\" class=\"tag user_defined\" rel=\"nofollow\">de:eier-aus-freilandhaltung</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:fruits-a-coque\" class=\"tag user_defined\" rel=\"nofollow\">it:fruits-a-coque</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mandarin\" class=\"tag known\" rel=\"nofollow\">Mandarin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/isododecane\" class=\"tag user_defined\" rel=\"nofollow\">isododecane</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:bei-unter-10-cmindestens-haltbar-bis\" class=\"tag user_defined\" rel=\"nofollow\">de:bei-unter-10-cmindestens-haltbar-bis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrogenated-palm-kernel-oil\" class=\"tag known\" rel=\"nofollow\">Hydrogenated palm kernel oil</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-mineral-water-co2-mineral-content-mg\" class=\"tag user_defined\" rel=\"nofollow\">natural-mineral-water-co2-mineral-content-mg</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/roscoff-onions\" class=\"tag known\" rel=\"nofollow\">Roscoff onions</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:oeufs-entiers-extra-frais\" class=\"tag known\" rel=\"nofollow\">fr:Œufs entiers extra-frais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/almond-paste\" class=\"tag known\" rel=\"nofollow\">Almond paste</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vanille-bourbon-naturelle\" class=\"tag user_defined\" rel=\"nofollow\">fr:vanille-bourbon-naturelle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gesch%C3%A4lt\" class=\"tag user_defined\" rel=\"nofollow\">de:geschält</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:zucker-knoblauch\" class=\"tag user_defined\" rel=\"nofollow\">de:zucker-knoblauch</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:bio-dille\" class=\"tag user_defined\" rel=\"nofollow\">nl:bio-dille</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lemon-flavouring\" class=\"tag known\" rel=\"nofollow\">Lemon flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:2-crevettes-decortiquees\" class=\"tag user_defined\" rel=\"nofollow\">fr:2-crevettes-decortiquees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sweet-peppers\" class=\"tag user_defined\" rel=\"nofollow\">sweet-peppers</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:guma-xantan\" class=\"tag user_defined\" rel=\"nofollow\">ro:guma-xantan</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:lupineneiweiss\" class=\"tag user_defined\" rel=\"nofollow\">de:lupineneiweiss</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:sorte\" class=\"tag user_defined\" rel=\"nofollow\">de:sorte</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/green-tea-essence\" class=\"tag user_defined\" rel=\"nofollow\">green-tea-essence</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:de-carignan-et-d-un-peu-de-syrah\" class=\"tag user_defined\" rel=\"nofollow\">fr:de-carignan-et-d-un-peu-de-syrah</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:f%C4%83in%C4%83-neagr%C4%83-de-gr%C3%A2u-tip-1350\" class=\"tag user_defined\" rel=\"nofollow\">ro:făină-neagră-de-grâu-tip-1350</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-de-riz-complet\" class=\"tag user_defined\" rel=\"nofollow\">fr:creme-de-riz-complet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/crepe\" class=\"tag known\" rel=\"nofollow\">Crêpe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ci-15850\" class=\"tag user_defined\" rel=\"nofollow\">ci-15850</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/recenstituted\" class=\"tag user_defined\" rel=\"nofollow\">recenstituted</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:puree-de-peche-de-vigne\" class=\"tag user_defined\" rel=\"nofollow\">fr:puree-de-peche-de-vigne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:monogliceride-%C8%99i-digliceride-ale-acizilor-gra%C8%99i\" class=\"tag user_defined\" rel=\"nofollow\">ro:monogliceride-și-digliceride-ale-acizilor-grași</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:argentine-et-chlamys-opercularis\" class=\"tag user_defined\" rel=\"nofollow\">fr:argentine-et-chlamys-opercularis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melons-confits\" class=\"tag known\" rel=\"nofollow\">fr:Melons confits</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:viande-precuite-8-equivalent-viand-crue\" class=\"tag user_defined\" rel=\"nofollow\">fr:viande-precuite-8-equivalent-viand-crue</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-d-orange-de-gargano-qualita-biondo\" class=\"tag user_defined\" rel=\"nofollow\">fr:extrait-d-orange-de-gargano-qualita-biondo</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%B0%D1%85%D0%B0%D1%80%D0%B8%D0%BD%D0%B0%D1%82-%D0%BD%D0%B0%D1%82%D1%80%D0%B8%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:сахаринат-натрия</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:malt-d-orge-reglisse\" class=\"tag user_defined\" rel=\"nofollow\">fr:malt-d-orge-reglisse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sheep-s-cheese-pecorino-romano\" class=\"tag user_defined\" rel=\"nofollow\">sheep-s-cheese-pecorino-romano</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:rood\" class=\"tag user_defined\" rel=\"nofollow\">nl:rood</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%80%D0%B8%D1%81-%D1%8D%D0%BA%D1%81%D1%82%D1%80%D1%83%D0%B4%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:рис-экструдированный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:orangel%C3%B6l\" class=\"tag user_defined\" rel=\"nofollow\">de:orangelöl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:agen%C8%9Bi-de-gelificare\" class=\"tag user_defined\" rel=\"nofollow\">ro:agenți-de-gelificare</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:schweinesaitling\" class=\"tag user_defined\" rel=\"nofollow\">de:schweinesaitling</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:orange-amere\" class=\"tag user_defined\" rel=\"nofollow\">fr:orange-amere</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:x2-steack-a-griller\" class=\"tag user_defined\" rel=\"nofollow\">fr:x2-steack-a-griller</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mono-and-diglicerides-of-fatty-acids\" class=\"tag user_defined\" rel=\"nofollow\">mono-and-diglicerides-of-fatty-acids</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pt:gordura-de-coco\" class=\"tag user_defined\" rel=\"nofollow\">pt:gordura-de-coco</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pates-alimentaire-conchiglie-cuites-aromatisees-au-curcuma\" class=\"tag user_defined\" rel=\"nofollow\">fr:pates-alimentaire-conchiglie-cuites-aromatisees-au-curcuma</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/412\" class=\"tag user_defined\" rel=\"nofollow\">412</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:calmar-geant\" class=\"tag known\" rel=\"nofollow\">fr:Calmar géant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BA%D0%BE%D0%BD%D1%86%D0%B5%D0%BD%D1%82%D1%80%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B9-%D1%81%D0%BE%D0%BA-%D0%BE%D0%B1%D0%BB%D0%B5%D0%BF%D0%B8%D1%85%D0%B8\" class=\"tag user_defined\" rel=\"nofollow\">ru:концентрированный-сок-облепихи</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/kirsch\" class=\"tag known\" rel=\"nofollow\">Kirsch</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:lecithines\" class=\"tag user_defined\" rel=\"nofollow\">it:lecithines</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/island-of-re-fleur-de-sel-sea-salt\" class=\"tag user_defined\" rel=\"nofollow\">island-of-re-fleur-de-sel-sea-salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:puree-concentree-de-framboise\" class=\"tag user_defined\" rel=\"nofollow\">fr:puree-concentree-de-framboise</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B4%D0%B5%D0%B7%D0%BE%D0%B4%D0%BE%D1%80%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D1%80%D0%B0%D1%81%D1%82%D0%B8%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5-%D0%B6%D0%B8%D1%80%D1%8B-%D0%B8-%D0%BC%D0%B0%D1%81%D0%BB%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:дезодорированные-растительные-жиры-и-масла</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E9%AD%9A%E4%BB%8B%E3%82%A8%E3%82%AD%E3%82%B9\" class=\"tag user_defined\" rel=\"nofollow\">ja:魚介エキス</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:jossa-emulgointiaine-soijalesitiini\" class=\"tag user_defined\" rel=\"nofollow\">nb:jossa-emulgointiaine-soijalesitiini</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-naturel-de-poivre\" class=\"tag known\" rel=\"nofollow\">fr:Extrait naturel de poivre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/casein\" class=\"tag known\" rel=\"nofollow\">Casein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/223\" class=\"tag user_defined\" rel=\"nofollow\">223</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/d-calcium-pantothenate\" class=\"tag user_defined\" rel=\"nofollow\">d-calcium-pantothenate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:2-8\" class=\"tag user_defined\" rel=\"nofollow\">fr:2-8</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B0%D1%80%D0%BE%D0%BC%D0%B0%D1%82%D0%B8%D0%B7%D0%B0%D1%82%D0%BE%D1%80-%D0%BD%D0%B0%D1%82%D1%83%D1%80%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9-%D0%BA%D0%BB%D1%8E%D0%BA%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:ароматизатор-натуральный-клюквенный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D1%80%D0%BE%D0%B4%D1%83%D0%BA%D1%82-%D0%BC%D0%BE%D0%BB%D0%BE%D0%BA%D0%BE%D1%81%D0%BE%D0%B4%D0%B5%D1%80%D0%B6%D0%B0%D1%89%D0%B8%D0%B9-%D1%81%D0%B3%D1%83%D1%89%D0%B5%D0%BD%D0%BA%D0%B0-%D0%B2%D0%B0%D1%80%D0%B5%D0%BD%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:продукт-молокосодержащий-сгущенка-вареная</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:latte-scremato-condensato-zuccherato\" class=\"tag user_defined\" rel=\"nofollow\">it:latte-scremato-condensato-zuccherato</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/green-rooibos\" class=\"tag user_defined\" rel=\"nofollow\">green-rooibos</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:corsee\" class=\"tag user_defined\" rel=\"nofollow\">fr:corsee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:st%C3%BCckchen\" class=\"tag user_defined\" rel=\"nofollow\">de:stückchen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/gluten-free-breadcrumbs\" class=\"tag user_defined\" rel=\"nofollow\">gluten-free-breadcrumbs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-cuisson-de-moule\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-de-cuisson-de-moule</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/liver\" class=\"tag known\" rel=\"nofollow\">Liver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/iodised-sea-salt\" class=\"tag known\" rel=\"nofollow\">Iodised sea salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chokeberry-juice\" class=\"tag known\" rel=\"nofollow\">Chokeberry juice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gew%C3%BCrzaroma\" class=\"tag user_defined\" rel=\"nofollow\">de:gewürzaroma</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:f%C3%A2ina\" class=\"tag user_defined\" rel=\"nofollow\">ro:fâina</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:feves-de-cacao-natif\" class=\"tag user_defined\" rel=\"nofollow\">fr:feves-de-cacao-natif</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/black-beans\" class=\"tag known\" rel=\"nofollow\">Black beans</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sugared-cranberries\" class=\"tag known\" rel=\"nofollow\">Sugared cranberries</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:cetrioli-sottaceto\" class=\"tag user_defined\" rel=\"nofollow\">it:cetrioli-sottaceto</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/the-academy-of-nutrition-and-dietetics-recommends-a-healthy-diet-including-20-35-grams-of-fiber-a-day\" class=\"tag user_defined\" rel=\"nofollow\">the-academy-of-nutrition-and-dietetics-recommends-a-healthy-diet-including-20-35-grams-of-fiber-a-day</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:truite-fumee-27-et-saumon\" class=\"tag user_defined\" rel=\"nofollow\">fr:truite-fumee-27-et-saumon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:agents-de-brillance\" class=\"tag user_defined\" rel=\"nofollow\">fr:agents-de-brillance</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:billettes-de-cereales\" class=\"tag known\" rel=\"nofollow\">fr:Billettes de céréales</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dark-chocolate-filling\" class=\"tag user_defined\" rel=\"nofollow\">dark-chocolate-filling</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e122\" class=\"tag known\" rel=\"nofollow\">E122</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/emulgent\" class=\"tag user_defined\" rel=\"nofollow\">emulgent</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lb\" class=\"tag user_defined\" rel=\"nofollow\">fr:lb</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:nat%C3%BCrliches-aroma-inklusive-koffein\" class=\"tag user_defined\" rel=\"nofollow\">de:natürliches-aroma-inklusive-koffein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nutritional-informati-typical-values-er-preservatives\" class=\"tag user_defined\" rel=\"nofollow\">nutritional-informati-typical-values-er-preservatives</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:coquillettes-precuites\" class=\"tag user_defined\" rel=\"nofollow\">fr:coquillettes-precuites</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/senia-712-94657-ovnet\" class=\"tag user_defined\" rel=\"nofollow\">senia-712-94657-ovnet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:%C3%ADzes%C3%ADt%C5%91-n%C3%B6v%C3%A9nyi-r%C3%A9szek\" class=\"tag user_defined\" rel=\"nofollow\">hu:ízesítő-növényi-részek</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:poids-net\" class=\"tag user_defined\" rel=\"nofollow\">fr:poids-net</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pl:go%C5%BAdzik\" class=\"tag user_defined\" rel=\"nofollow\">pl:goździk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fabricado-por\" class=\"tag user_defined\" rel=\"nofollow\">fr:fabricado-por</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bittersweet-chocolate\" class=\"tag user_defined\" rel=\"nofollow\">bittersweet-chocolate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/onion-extract\" class=\"tag known\" rel=\"nofollow\">Onion Extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/o\" class=\"tag user_defined\" rel=\"nofollow\">o</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-de-brebis-a-3-de-matiere-grasse\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-de-brebis-a-3-de-matiere-grasse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/kvass-wort-concentrate\" class=\"tag known\" rel=\"nofollow\">Kvass wort concentrate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:palmk%C3%A4rneolja\" class=\"tag user_defined\" rel=\"nofollow\">sv:palmkärneolja</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:beurre-de-cacao\" class=\"tag user_defined\" rel=\"nofollow\">it:beurre-de-cacao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-de-celeri\" class=\"tag known\" rel=\"nofollow\">fr:Extrait de céleri</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sel-de-salies\" class=\"tag user_defined\" rel=\"nofollow\">fr:sel-de-salies</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:cherry-roma-tomaten\" class=\"tag user_defined\" rel=\"nofollow\">de:cherry-roma-tomaten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pl:przyprawa-pho\" class=\"tag user_defined\" rel=\"nofollow\">pl:przyprawa-pho</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fructose-de-betterave-sucriere\" class=\"tag user_defined\" rel=\"nofollow\">fr:fructose-de-betterave-sucriere</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/energ-18-fi-285g-and-na-consurium-mode\" class=\"tag user_defined\" rel=\"nofollow\">energ-18-fi-285g-and-na-consurium-mode</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pepites-de-chocolat-1\" class=\"tag user_defined\" rel=\"nofollow\">fr:pepites-de-chocolat-1</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:nettovekten-er-likevel-1-1-kg\" class=\"tag user_defined\" rel=\"nofollow\">nb:nettovekten-er-likevel-1-1-kg</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/blue-cheese\" class=\"tag known\" rel=\"nofollow\">Blue cheese</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-precuite-de-quinoa\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-precuite-de-quinoa</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dextrine-de-pomme-de-terre\" class=\"tag user_defined\" rel=\"nofollow\">fr:dextrine-de-pomme-de-terre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/boked-ail-the-guaranteed-taste-everyone-loves\" class=\"tag user_defined\" rel=\"nofollow\">boked-ail-the-guaranteed-taste-everyone-loves</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:o\" class=\"tag user_defined\" rel=\"nofollow\">de:o</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:difosfa%C8%9Bi-%C8%99i-trifosfa%C8%9Bi-de-sodiu\" class=\"tag user_defined\" rel=\"nofollow\">ro:difosfați-și-trifosfați-de-sodiu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sprouted-flaxseed\" class=\"tag user_defined\" rel=\"nofollow\">sprouted-flaxseed</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:s%C3%A4urungsmittel-citronens%C3%A4ure\" class=\"tag user_defined\" rel=\"nofollow\">de:säurungsmittel-citronensäure</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BA%D1%83%D0%BD%D0%B6%D1%83%D1%82-%D0%BE%D0%B1%D0%B6%D0%B0%D1%80%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:кунжут-обжаренный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:voir-la-lettre-pres-de-la-date-sur-le-couvercle\" class=\"tag user_defined\" rel=\"nofollow\">fr:voir-la-lettre-pres-de-la-date-sur-le-couvercle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BE%D1%82%D0%B1%D0%BE%D1%80%D0%BD%D1%8B%D0%B5-%D0%BF%D0%B0%D1%81%D1%82%D0%B5%D1%80%D0%B8%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D1%81%D0%BB%D0%B8%D0%B2%D0%BA%D0%B8\" class=\"tag user_defined\" rel=\"nofollow\">ru:отборные-пастеризованные-сливки</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:zer-pudr%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:zer-pudră</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cuite\" class=\"tag user_defined\" rel=\"nofollow\">fr:cuite</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%84%D0%B5%D1%80%D0%BC%D0%B5%D0%BD%D1%82%D0%BD%D0%B0%D1%8F-%D0%B3%D1%80%D1%83%D0%BF%D0%BF%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:ферментная-группа</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:saveur-d-aloe\" class=\"tag user_defined\" rel=\"nofollow\">fr:saveur-d-aloe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E5%A2%97%E7%B2%98%E5%89%A4%EF%BC%88%E3%82%A2%E3%83%A9%E3%83%93%E3%82%A2%E3%82%AC%E3%83%A0%EF%BC%89\" class=\"tag user_defined\" rel=\"nofollow\">ja:増粘剤（アラビアガム）</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soya-auce\" class=\"tag user_defined\" rel=\"nofollow\">soya-auce</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/elderflower\" class=\"tag known\" rel=\"nofollow\">Elderflower</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:burro\" class=\"tag user_defined\" rel=\"nofollow\">fr:burro</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ethylhexylglycerin\" class=\"tag user_defined\" rel=\"nofollow\">ethylhexylglycerin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:petales-de-ble\" class=\"tag known\" rel=\"nofollow\">fr:Pétales de blé</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:principe-actif\" class=\"tag user_defined\" rel=\"nofollow\">fr:principe-actif</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B0%D1%86%D0%B5%D1%82%D0%B0%D1%82-%D0%BA%D0%B0%D0%BB%D1%8C%D1%86%D0%B8%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:ацетат-кальция</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:maisgeschmack\" class=\"tag user_defined\" rel=\"nofollow\">de:maisgeschmack</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lii-fl-a-consommer-de-preference-voir-date-sur-remballge\" class=\"tag user_defined\" rel=\"nofollow\">lii-fl-a-consommer-de-preference-voir-date-sur-remballge</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/huile-essentieiie-de-menthe-poivree-du-piemont-ingredienten\" class=\"tag user_defined\" rel=\"nofollow\">huile-essentieiie-de-menthe-poivree-du-piemont-ingredienten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%83%99%E3%83%8B%E3%82%B3%E3%82%A6%E3%82%B8%E8%89%B2%E7%B4%A0\" class=\"tag user_defined\" rel=\"nofollow\">ja:ベニコウジ色素</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:6-6-korinthen\" class=\"tag user_defined\" rel=\"nofollow\">de:6-6-korinthen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/by-cow-s-milk\" class=\"tag user_defined\" rel=\"nofollow\">by-cow-s-milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/iodized-speisesaltz\" class=\"tag user_defined\" rel=\"nofollow\">iodized-speisesaltz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%84%D0%B0%D1%80%D1%88-%D1%80%D1%8B%D0%B1%D0%BD%D1%8B%D0%B9-%D1%81%D1%83%D1%80%D0%B8%D0%BC%D0%B8\" class=\"tag user_defined\" rel=\"nofollow\">ru:фарш-рыбный-сурими</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pandan-leaf\" class=\"tag user_defined\" rel=\"nofollow\">pandan-leaf</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:conservateurs-de-croute\" class=\"tag user_defined\" rel=\"nofollow\">fr:conservateurs-de-croute</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:k%C3%A4rnmj%C3%B6lkspulver\" class=\"tag user_defined\" rel=\"nofollow\">sv:kärnmjölkspulver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:concentre-de-proteines-de-soja\" class=\"tag known\" rel=\"nofollow\">fr:Concentré de protéines de soja</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B3%D0%B5%D0%BC%D0%B8%D1%86%D0%B5%D0%BB%D0%BB%D1%8E%D0%BB%D0%BE%D0%B7%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:гемицеллюлоза</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:epices-curcuma-et-paprika\" class=\"tag user_defined\" rel=\"nofollow\">fr:epices-curcuma-et-paprika</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gardenia\" class=\"tag user_defined\" rel=\"nofollow\">fr:gardenia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/d-pantothenate-calcium\" class=\"tag known\" rel=\"nofollow\">D-pantothenate calcium</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:hydroxide\" class=\"tag user_defined\" rel=\"nofollow\">de:hydroxide</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cnstal\" class=\"tag user_defined\" rel=\"nofollow\">fr:cnstal</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pates-alimentaires-torsades-cuites-aromatisees-a-la-tomate-et-a-la-betterave\" class=\"tag user_defined\" rel=\"nofollow\">fr:pates-alimentaires-torsades-cuites-aromatisees-a-la-tomate-et-a-la-betterave</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-oi\" class=\"tag user_defined\" rel=\"nofollow\">vegetable-oi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E9%BB%83%E8%89%B24%E8%99%9F\" class=\"tag user_defined\" rel=\"nofollow\">zh:黃色4號</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%EF%BC%88%E5%8E%9F%E6%9D%90%E6%96%99%E3%81%AE%E4%B8%80%E9%83%A8%E3%81%AB%E4%B9%B3%E6%88%90%E5%88%86\" class=\"tag user_defined\" rel=\"nofollow\">ja:（原材料の一部に乳成分</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:e202-correcteur-d-acidite-e330\" class=\"tag user_defined\" rel=\"nofollow\">fr:e202-correcteur-d-acidite-e330</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:arabicakaffe\" class=\"tag user_defined\" rel=\"nofollow\">sv:arabicakaffe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/maltodextrose\" class=\"tag user_defined\" rel=\"nofollow\">maltodextrose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gel-de-l-aloe-vera\" class=\"tag user_defined\" rel=\"nofollow\">fr:gel-de-l-aloe-vera</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:segments-de-mandarines\" class=\"tag user_defined\" rel=\"nofollow\">fr:segments-de-mandarines</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/skimmied-milk\" class=\"tag user_defined\" rel=\"nofollow\">skimmied-milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BA%D1%80%D0%B0%D1%85%D0%BC%D0%B0%D0%BB-%D1%82%D0%B0%D0%BF%D0%B8%D0%BE%D0%BA%D0%BE%D0%B2%D1%8B%D0%B9-%D0%BC%D0%BE%D0%B4%D0%B8%D1%84%D0%B8%D1%86%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:крахмал-тапиоковый-модифицированный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:446mi\" class=\"tag user_defined\" rel=\"nofollow\">fr:446mi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/quinoa-flour\" class=\"tag known\" rel=\"nofollow\">Quinoa flour</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:nitrito-di-sodio\" class=\"tag user_defined\" rel=\"nofollow\">fr:nitrito-di-sodio</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:en-accompagnement-de-viandes\" class=\"tag user_defined\" rel=\"nofollow\">fr:en-accompagnement-de-viandes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/gist\" class=\"tag user_defined\" rel=\"nofollow\">gist</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:b%C5%91r%C3%B6s-libazsirad%C3%A9k\" class=\"tag user_defined\" rel=\"nofollow\">hu:bőrös-libazsiradék</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:teguments-de-graines-de-moutarde\" class=\"tag user_defined\" rel=\"nofollow\">fr:teguments-de-graines-de-moutarde</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:traces-eventuelles-d-autres-fruits-a-coque\" class=\"tag user_defined\" rel=\"nofollow\">it:traces-eventuelles-d-autres-fruits-a-coque</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E9%A3%9F%E7%94%A8%E8%89%B2%E7%B4%A0\" class=\"tag user_defined\" rel=\"nofollow\">zh:食用色素</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:verarbeitungshilfsstoffe\" class=\"tag user_defined\" rel=\"nofollow\">de:verarbeitungshilfsstoffe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/to-preserve-freshness\" class=\"tag user_defined\" rel=\"nofollow\">to-preserve-freshness</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%82%B9%E3%83%BC%E3%83%97%EF%BC%88%E9%A3%9F%E5%A1%A9\" class=\"tag user_defined\" rel=\"nofollow\">ja:スープ（食塩</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:quelques-graines-de-lin-moulues\" class=\"tag user_defined\" rel=\"nofollow\">fr:quelques-graines-de-lin-moulues</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:graines-d-epeautre-du-nord\" class=\"tag user_defined\" rel=\"nofollow\">fr:graines-d-epeautre-du-nord</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/garlic-paste\" class=\"tag known\" rel=\"nofollow\">Garlic paste</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ammonium-salts-of-phosphatidic-acids\" class=\"tag user_defined\" rel=\"nofollow\">ammonium-salts-of-phosphatidic-acids</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/churned-butter\" class=\"tag known\" rel=\"nofollow\">Churned butter</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:disphosphate-disodique\" class=\"tag user_defined\" rel=\"nofollow\">fr:disphosphate-disodique</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:junger-gouda\" class=\"tag user_defined\" rel=\"nofollow\">de:junger-gouda</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/yellow-61\" class=\"tag user_defined\" rel=\"nofollow\">yellow-61</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:minimum-dans-le-chocolat-seul\" class=\"tag user_defined\" rel=\"nofollow\">it:minimum-dans-le-chocolat-seul</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E6%A4%8D%E7%89%A9%E6%80%A7%E3%81%9F%E3%82%93%E7%99%BD\" class=\"tag user_defined\" rel=\"nofollow\">ja:植物性たん白</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/see-ingredients-underlined\" class=\"tag user_defined\" rel=\"nofollow\">see-ingredients-underlined</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-de-vache-ecreme\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-de-vache-ecreme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/store-at-controlled-room-temperature-20-25-c\" class=\"tag user_defined\" rel=\"nofollow\">store-at-controlled-room-temperature-20-25-c</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:pepparmintsolja\" class=\"tag user_defined\" rel=\"nofollow\">sv:pepparmintsolja</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e160e\" class=\"tag known\" rel=\"nofollow\">E160e</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:preparazione-a-base-di-biscotto-ai-4-cereali\" class=\"tag user_defined\" rel=\"nofollow\">it:preparazione-a-base-di-biscotto-ai-4-cereali</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/166\" class=\"tag user_defined\" rel=\"nofollow\">166</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:milcheiweib\" class=\"tag user_defined\" rel=\"nofollow\">de:milcheiweib</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/you-are-pregnant-and-nursing-a-baby\" class=\"tag user_defined\" rel=\"nofollow\">you-are-pregnant-and-nursing-a-baby</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D1%80%D0%BE%D0%B4%D1%83%D0%BA%D1%82-%D1%82%D0%B2%D0%BE%D1%80%D0%BE%D0%B6%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:продукт-творожный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miettes-75-et-pattes\" class=\"tag user_defined\" rel=\"nofollow\">fr:miettes-75-et-pattes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D1%80%D0%B1%D0%B0%D1%82-%D0%BD%D0%B0%D1%82%D1%80%D0%B8%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:сорбат-натрия</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:chips-de-noix-de-coco-grilles\" class=\"tag user_defined\" rel=\"nofollow\">fr:chips-de-noix-de-coco-grilles</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pear-puree\" class=\"tag known\" rel=\"nofollow\">Pear puree</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:milch-aus-eu-l%C3%A4ndern\" class=\"tag user_defined\" rel=\"nofollow\">de:milch-aus-eu-ländern</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:infusion-et-arome-nature\" class=\"tag user_defined\" rel=\"nofollow\">fr:infusion-et-arome-nature</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:chair-de-morue\" class=\"tag known\" rel=\"nofollow\">fr:Chair de morue</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n";
    public static String split10 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/koolzaadolie\" class=\"tag user_defined\" rel=\"nofollow\">koolzaadolie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:carragenine\" class=\"tag user_defined\" rel=\"nofollow\">it:carragenine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:druvsocker\" class=\"tag user_defined\" rel=\"nofollow\">nb:druvsocker</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/the-locust-bean-gum\" class=\"tag user_defined\" rel=\"nofollow\">the-locust-bean-gum</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:crepine-de-porc\" class=\"tag user_defined\" rel=\"nofollow\">fr:crepine-de-porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:echine\" class=\"tag user_defined\" rel=\"nofollow\">fr:echine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:liquide\" class=\"tag user_defined\" rel=\"nofollow\">fr:liquide</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:s%C3%BCbungsmittel\" class=\"tag user_defined\" rel=\"nofollow\">de:sübungsmittel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:verarbeitunghilfsstoffe\" class=\"tag user_defined\" rel=\"nofollow\">de:verarbeitunghilfsstoffe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pepites-de-chocolat-avec-edulcorant\" class=\"tag user_defined\" rel=\"nofollow\">fr:pepites-de-chocolat-avec-edulcorant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:johannisbeersaft-aus-konzentrat\" class=\"tag user_defined\" rel=\"nofollow\">de:johannisbeersaft-aus-konzentrat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/foaming-agent\" class=\"tag known\" rel=\"nofollow\">Foaming agent</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chinese-hibiscus\" class=\"tag known\" rel=\"nofollow\">Chinese hibiscus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E6%98%86%E5%B8%83%E3%83%91%E3%82%A6%E3%83%80%E3%83%BC\" class=\"tag user_defined\" rel=\"nofollow\">ja:昆布パウダー</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:585882-se\" class=\"tag user_defined\" rel=\"nofollow\">fr:585882-se</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eeau\" class=\"tag user_defined\" rel=\"nofollow\">fr:eeau</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:xylitol-29\" class=\"tag user_defined\" rel=\"nofollow\">sv:xylitol-29</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:alchemille\" class=\"tag user_defined\" rel=\"nofollow\">fr:alchemille</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cheese-seasoning\" class=\"tag user_defined\" rel=\"nofollow\">cheese-seasoning</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sheeps-milk\" class=\"tag known\" rel=\"nofollow\">Sheeps milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/l\" class=\"tag user_defined\" rel=\"nofollow\">l</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/farbstoff-e150d\" class=\"tag user_defined\" rel=\"nofollow\">farbstoff-e150d</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:2-pomme-presse\" class=\"tag user_defined\" rel=\"nofollow\">fr:2-pomme-presse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:batons-de-soja\" class=\"tag user_defined\" rel=\"nofollow\">fr:batons-de-soja</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:acidiiant\" class=\"tag user_defined\" rel=\"nofollow\">fr:acidiiant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cauliflower\" class=\"tag known\" rel=\"nofollow\">Cauliflower</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:set-et-poivre\" class=\"tag user_defined\" rel=\"nofollow\">fr:set-et-poivre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mungobohnensprossen\" class=\"tag user_defined\" rel=\"nofollow\">de:mungobohnensprossen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:grasa-vacuna-refinada\" class=\"tag user_defined\" rel=\"nofollow\">es:grasa-vacuna-refinada</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e1450\" class=\"tag known\" rel=\"nofollow\">E1450</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pain-de-mie-complet\" class=\"tag known\" rel=\"nofollow\">fr:Pain de mie complet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-a-2-de-matieres-grasses\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-a-2-de-matieres-grasses</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E9%A6%99%E5%91%B3%E6%B2%B9%EF%BC%89\" class=\"tag user_defined\" rel=\"nofollow\">ja:香味油）</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sat\" class=\"tag user_defined\" rel=\"nofollow\">sat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bamboo\" class=\"tag known\" rel=\"nofollow\">Bamboo</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:k%C3%A4sew%C3%BCrze\" class=\"tag user_defined\" rel=\"nofollow\">de:käsewürze</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:feuilles-de-framboisier\" class=\"tag user_defined\" rel=\"nofollow\">fr:feuilles-de-framboisier</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pl:teksturowany-gluten-pszenny\" class=\"tag user_defined\" rel=\"nofollow\">pl:teksturowany-gluten-pszenny</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:120\" class=\"tag user_defined\" rel=\"nofollow\">fr:120</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pate-de-cacao-beurre-de-cacao\" class=\"tag user_defined\" rel=\"nofollow\">fr:pate-de-cacao-beurre-de-cacao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dried-fenugreek-leaf\" class=\"tag known\" rel=\"nofollow\">Dried fenugreek leaf</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lime\" class=\"tag known\" rel=\"nofollow\">Lime</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BA%D0%BE%D0%BD%D1%81%D0%B5%D1%80%D0%B2%D0%B0%D0%BD%D1%82-%D1%81%D0%BE%D1%80%D0%B1%D0%B0%D1%82-%D0%BD%D0%B0%D1%82%D1%80%D0%B8%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:консервант-сорбат-натрия</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:r%C3%A5lakrits\" class=\"tag user_defined\" rel=\"nofollow\">sv:rålakrits</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:de-production-suisse\" class=\"tag user_defined\" rel=\"nofollow\">fr:de-production-suisse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ingredient-issu-de-l\" class=\"tag user_defined\" rel=\"nofollow\">fr:ingredient-issu-de-l</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%80%D0%B0%D0%BF%D1%81%D0%BE%D0%B2%D0%BE%D0%B5-%D0%BC%D1%83%D0%BA%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:рапсовое-муке</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:dillspitzen\" class=\"tag user_defined\" rel=\"nofollow\">de:dillspitzen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sel-poivre-gris-moulu\" class=\"tag user_defined\" rel=\"nofollow\">fr:sel-poivre-gris-moulu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:des-aromes-naturels-dans-les-cubes-chorizo-et-jambon-cru\" class=\"tag user_defined\" rel=\"nofollow\">fr:des-aromes-naturels-dans-les-cubes-chorizo-et-jambon-cru</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:kukoricakem%C3%A9nylt%C3%B3\" class=\"tag user_defined\" rel=\"nofollow\">hu:kukoricakeményltó</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrogenated-vegetable-fat\" class=\"tag known\" rel=\"nofollow\">Hydrogenated vegetable fat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/turnip-rape\" class=\"tag known\" rel=\"nofollow\">Turnip-rape</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:voir-sur-l-emballage\" class=\"tag user_defined\" rel=\"nofollow\">fr:voir-sur-l-emballage</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%84%D1%80%D0%B0%D0%BA%D1%86%D0%B8%D0%BE%D0%BD%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:фракционированное</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:carboxymethyle-cellulose\" class=\"tag user_defined\" rel=\"nofollow\">fr:carboxymethyle-cellulose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:raisins-secs-sultanine-11\" class=\"tag user_defined\" rel=\"nofollow\">fr:raisins-secs-sultanine-11</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:citronens%C3%A0ure\" class=\"tag user_defined\" rel=\"nofollow\">de:citronensàure</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cranberry-canneberge\" class=\"tag user_defined\" rel=\"nofollow\">fr:cranberry-canneberge</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-de-fromet\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-de-fromet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BE\" class=\"tag user_defined\" rel=\"nofollow\">ru:о</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pl:kurku-ma-w-proszku\" class=\"tag user_defined\" rel=\"nofollow\">pl:kurku-ma-w-proszku</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rice-starch-raising-agents\" class=\"tag user_defined\" rel=\"nofollow\">rice-starch-raising-agents</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:decor-de-confiserie-colore\" class=\"tag user_defined\" rel=\"nofollow\">fr:decor-de-confiserie-colore</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/s0-2530\" class=\"tag user_defined\" rel=\"nofollow\">s0-2530</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/taurine\" class=\"tag known\" rel=\"nofollow\">Taurine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:estratto-di-carota-nera\" class=\"tag user_defined\" rel=\"nofollow\">it:estratto-di-carota-nera</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/not-volume\" class=\"tag user_defined\" rel=\"nofollow\">not-volume</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:farina-di-soia-emulsionante\" class=\"tag user_defined\" rel=\"nofollow\">it:farina-di-soia-emulsionante</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/poppyseed\" class=\"tag known\" rel=\"nofollow\">Poppyseed</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:s%C3%A4uerungskultur\" class=\"tag user_defined\" rel=\"nofollow\">de:säuerungskultur</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:agrumes-a-base-de-concentres\" class=\"tag user_defined\" rel=\"nofollow\">fr:agrumes-a-base-de-concentres</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:ammoniumsalze-von-phosphatids%C3%A4uren\" class=\"tag user_defined\" rel=\"nofollow\">de:ammoniumsalze-von-phosphatidsäuren</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:amomum-tsaoko\" class=\"tag user_defined\" rel=\"nofollow\">fr:amomum-tsaoko</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jambon-de-porc-issu-d-animaux-nourris-sans-ogm\" class=\"tag known\" rel=\"nofollow\">fr:Jambon de porc issu d'animaux nourris sans ogm</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:yogourt-au-lait-pasteurise\" class=\"tag known\" rel=\"nofollow\">fr:Yogourt au lait pasteurisé</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:feuilles-de-mauve\" class=\"tag user_defined\" rel=\"nofollow\">fr:feuilles-de-mauve</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dublin-8\" class=\"tag user_defined\" rel=\"nofollow\">fr:dublin-8</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/formed-meat-from-chicken-breast-fillet\" class=\"tag user_defined\" rel=\"nofollow\">formed-meat-from-chicken-breast-fillet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:foie-de-porc-francais\" class=\"tag user_defined\" rel=\"nofollow\">fr:foie-de-porc-francais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ail-semoule\" class=\"tag known\" rel=\"nofollow\">fr:Ail semoule</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:telemea-maturat%C4%83-ob%C8%9Binut%C4%83-din-lapte-de-vac%C4%83-pasteurizat\" class=\"tag user_defined\" rel=\"nofollow\">ro:telemea-maturată-obținută-din-lapte-de-vacă-pasteurizat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:e-extra\" class=\"tag user_defined\" rel=\"nofollow\">fr:e-extra</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/forest-mushroom\" class=\"tag known\" rel=\"nofollow\">Forest mushroom</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B0%D1%86%D0%B5%D1%81%D1%83%D0%BB%D1%8C%D1%84%D0%B0%D0%BC-%D0%BA%D0%B0%D0%BB%D0%B8%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:ацесульфам-калия</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ce-cvcnt-fin\" class=\"tag user_defined\" rel=\"nofollow\">fr:ce-cvcnt-fin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%85%D0%BB%D0%BE%D1%80%D0%B8%D1%81%D1%82%D0%BE%D0%B3%D0%BE-%D0%BA%D0%B0%D0%BB%D1%8C%D1%86%D0%B8%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:хлористого-кальция</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:concentre-proteique-de-lactoserum\" class=\"tag user_defined\" rel=\"nofollow\">fr:concentre-proteique-de-lactoserum</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:amerique-centrale-et-amerique-du-sud\" class=\"tag user_defined\" rel=\"nofollow\">fr:amerique-centrale-et-amerique-du-sud</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-apple\" class=\"tag known\" rel=\"nofollow\">Red apple</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/camomile-flower\" class=\"tag known\" rel=\"nofollow\">Camomile flower</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%B0%D1%81%D0%BB%D0%BE-%D1%80%D0%B0%D0%BF%D1%81%D0%BE%D0%B2%D0%BE%D0%B5-%D1%80%D0%B0%D1%84%D0%B8%D0%BD%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:масло-рапсовое-рафинированное</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soya-lecithine\" class=\"tag user_defined\" rel=\"nofollow\">soya-lecithine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:iv%C3%B3viz\" class=\"tag user_defined\" rel=\"nofollow\">hu:ivóviz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:enth%C3%A0lt-soja-sulfite\" class=\"tag user_defined\" rel=\"nofollow\">de:enthàlt-soja-sulfite</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/stevia-extract\" class=\"tag user_defined\" rel=\"nofollow\">stevia-extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:pate-de-cacao\" class=\"tag user_defined\" rel=\"nofollow\">it:pate-de-cacao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-de-ble-malte-lt\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-de-ble-malte-lt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lles-feroe\" class=\"tag user_defined\" rel=\"nofollow\">fr:lles-feroe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:oranges-semi-confites\" class=\"tag user_defined\" rel=\"nofollow\">fr:oranges-semi-confites</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milkcap\" class=\"tag known\" rel=\"nofollow\">Milkcap</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/alfalfa-protein\" class=\"tag user_defined\" rel=\"nofollow\">alfalfa-protein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E9%85%B8%E5%8C%96%E9%98%B2%E6%AD%A2%E5%89%A4%EF%BC%88%E3%83%93%E3%82%BF%E3%83%9F%E3%83%B3%EF%BD%85%EF%BC%89\" class=\"tag user_defined\" rel=\"nofollow\">ja:酸化防止剤（ビタミンｅ）</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:puree-de-e-sechees-i-de\" class=\"tag user_defined\" rel=\"nofollow\">fr:puree-de-e-sechees-i-de</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%81%95%E3%81%B0\" class=\"tag user_defined\" rel=\"nofollow\">ja:さば</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tonijn-stukken\" class=\"tag user_defined\" rel=\"nofollow\">de:tonijn-stukken</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:aiguillettes-de-poulet\" class=\"tag known\" rel=\"nofollow\">fr:Aiguillettes de poulet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:suc-concentrat-de-vi%C8%99ine\" class=\"tag user_defined\" rel=\"nofollow\">ro:suc-concentrat-de-vișine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:e223-sulfit\" class=\"tag user_defined\" rel=\"nofollow\">sv:e223-sulfit</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/strong-mustard\" class=\"tag known\" rel=\"nofollow\">Strong mustard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:coulis-de-tomate-de-provence-a-l-ancienne\" class=\"tag user_defined\" rel=\"nofollow\">fr:coulis-de-tomate-de-provence-a-l-ancienne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fleurs-de-lilas\" class=\"tag user_defined\" rel=\"nofollow\">fr:fleurs-de-lilas</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:i\" class=\"tag user_defined\" rel=\"nofollow\">de:i</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/buckwheat-flour-from-certified-agriculture\" class=\"tag user_defined\" rel=\"nofollow\">buckwheat-flour-from-certified-agriculture</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/veal-fond\" class=\"tag known\" rel=\"nofollow\">Veal fond</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:peperoniwurst\" class=\"tag user_defined\" rel=\"nofollow\">de:peperoniwurst</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cereals-containing-gluten\" class=\"tag known\" rel=\"nofollow\">Cereals containing gluten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:origan-deshydrate\" class=\"tag known\" rel=\"nofollow\">fr:Origan déshydraté</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lovage-leaves\" class=\"tag known\" rel=\"nofollow\">Lovage leaves</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brown-rice-crisps\" class=\"tag user_defined\" rel=\"nofollow\">brown-rice-crisps</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:viande-de-boeuf-en-poudre\" class=\"tag known\" rel=\"nofollow\">fr:Viande de boeuf en poudre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coconut-rasp\" class=\"tag user_defined\" rel=\"nofollow\">coconut-rasp</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:de-mais-de-triticale\" class=\"tag user_defined\" rel=\"nofollow\">fr:de-mais-de-triticale</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:leche-semidesnatada-sin-lactosa\" class=\"tag user_defined\" rel=\"nofollow\">es:leche-semidesnatada-sin-lactosa</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sorghum-flour\" class=\"tag known\" rel=\"nofollow\">Sorghum flour</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:con-frumento\" class=\"tag user_defined\" rel=\"nofollow\">it:con-frumento</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/weizenmehl\" class=\"tag user_defined\" rel=\"nofollow\">weizenmehl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:2-mures-ecrasees\" class=\"tag user_defined\" rel=\"nofollow\">fr:2-mures-ecrasees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mung-bean\" class=\"tag known\" rel=\"nofollow\">Mung bean</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sauce-aux-fruits-rouges\" class=\"tag known\" rel=\"nofollow\">fr:Sauce aux fruits rouges</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:sirop-de-glucoza-fructoza\" class=\"tag user_defined\" rel=\"nofollow\">ro:sirop-de-glucoza-fructoza</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B4%D0%BB%D1%8F-%D1%81%D1%8B%D1%80%D0%B0-%D1%81%D0%BB%D0%B8%D0%B2%D0%BE%D1%87%D0%BD%D0%BE%D0%B3%D0%BE\" class=\"tag user_defined\" rel=\"nofollow\">ru:для-сыра-сливочного</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/skim-milk-and-pasteurized-cream\" class=\"tag known\" rel=\"nofollow\">Skim milk and pasteurized cream</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D0%BE%D1%80%D0%BE%D1%88%D0%BE%D0%BA-%D1%8F%D0%B8%D1%87%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:порошок-яичный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pate-fine\" class=\"tag user_defined\" rel=\"nofollow\">fr:pate-fine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:italienischer-hartk%C3%A4se\" class=\"tag user_defined\" rel=\"nofollow\">de:italienischer-hartkäse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:Nat%C3%BCrliche%20Quellkohlens%C3%A4ure\" class=\"tag known\" rel=\"nofollow\">de:Natürliche Quellkohlensäure</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:%D8%AD%D9%85%D8%B6-%D8%A7%D9%84%D8%B3%D8%AA%D8%B1%D9%8A%D9%83-e330\" class=\"tag user_defined\" rel=\"nofollow\">fr:حمض-الستريك-e330</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:verdickungsmittel-ohannisbrotkernmehl-und-pektin\" class=\"tag user_defined\" rel=\"nofollow\">de:verdickungsmittel-ohannisbrotkernmehl-und-pektin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huile-essentielle-de-menthe\" class=\"tag known\" rel=\"nofollow\">fr:Huile essentielle de menthe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-banana-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural banana flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jaunes-et-verts\" class=\"tag user_defined\" rel=\"nofollow\">fr:jaunes-et-verts</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/manufactured-in-a-workshop-which-uses-the-soybean-and-lupin\" class=\"tag user_defined\" rel=\"nofollow\">manufactured-in-a-workshop-which-uses-the-soybean-and-lupin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mures-sauvages-sans-pepins\" class=\"tag user_defined\" rel=\"nofollow\">fr:mures-sauvages-sans-pepins</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:sojacrisipies\" class=\"tag user_defined\" rel=\"nofollow\">de:sojacrisipies</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tomates-sechees\" class=\"tag user_defined\" rel=\"nofollow\">fr:tomates-sechees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:autres\" class=\"tag user_defined\" rel=\"nofollow\">fr:autres</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:dovleac\" class=\"tag user_defined\" rel=\"nofollow\">ro:dovleac</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/linden-honey\" class=\"tag known\" rel=\"nofollow\">Linden honey</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/italy\" class=\"tag user_defined\" rel=\"nofollow\">italy</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D1%8B%D1%80-%D0%BF%D0%BE%D0%BB%D1%83%D1%82%D0%B2%D0%B5%D1%80%D0%B4%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:сыр-полутвердый</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nettle\" class=\"tag known\" rel=\"nofollow\">Nettle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:acide-citrique-regulateur-de-l-acidite\" class=\"tag user_defined\" rel=\"nofollow\">fr:acide-citrique-regulateur-de-l-acidite</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:natriumsaccharin\" class=\"tag user_defined\" rel=\"nofollow\">de:natriumsaccharin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:sojafasern\" class=\"tag user_defined\" rel=\"nofollow\">de:sojafasern</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:volume\" class=\"tag user_defined\" rel=\"nofollow\">fr:volume</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%82%BC%E3%83%A9%E3%83%81%E3%83%B3%E3%82%92%E5%90%AB%E3%82%80%EF%BC%89\" class=\"tag user_defined\" rel=\"nofollow\">ja:ゼラチンを含む）</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bifidus-actiregularis\" class=\"tag known\" rel=\"nofollow\">Bifidus actiregularis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:sare-de-mare-f%C4%83r%C4%83-adaos-de-iod\" class=\"tag user_defined\" rel=\"nofollow\">ro:sare-de-mare-fără-adaos-de-iod</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:bio-ma%C3%AFsmeel\" class=\"tag user_defined\" rel=\"nofollow\">nl:bio-maïsmeel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:1-demi-mangue-mixee\" class=\"tag user_defined\" rel=\"nofollow\">fr:1-demi-mangue-mixee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/slippery-jack\" class=\"tag known\" rel=\"nofollow\">Slippery jack</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:schnittfester-mozzarella\" class=\"tag user_defined\" rel=\"nofollow\">de:schnittfester-mozzarella</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brown-cane-sugar\" class=\"tag known\" rel=\"nofollow\">Brown cane sugar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:oeuf-issu-de-poule-elevee-en-plein-air\" class=\"tag user_defined\" rel=\"nofollow\">fr:oeuf-issu-de-poule-elevee-en-plein-air</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%82%AF%E3%83%81%E3%83%8A%E3%82%B7%E8%89%B2%E7%B4%A0\" class=\"tag user_defined\" rel=\"nofollow\">ja:クチナシ色素</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kernmehl\" class=\"tag user_defined\" rel=\"nofollow\">de:kernmehl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cocoa-bean\" class=\"tag known\" rel=\"nofollow\">Cocoa bean</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B0%D0%BC%D0%B8%D0%BD%D0%BE%D0%BA%D0%B8%D1%81%D0%BB%D0%BE%D1%82%D0%B0-l-%D1%86%D0%B8%D1%81%D1%82%D0%B5%D0%B8%D0%BD\" class=\"tag user_defined\" rel=\"nofollow\">ru:аминокислота-l-цистеин</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:latte-italiano\" class=\"tag user_defined\" rel=\"nofollow\">it:latte-italiano</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E7%A3%B7%E9%85%B8%E9%88%A3\" class=\"tag user_defined\" rel=\"nofollow\">zh:磷酸鈣</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:johannisbrotkemmehl-natriumalginat\" class=\"tag user_defined\" rel=\"nofollow\">de:johannisbrotkemmehl-natriumalginat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:pasteur\" class=\"tag user_defined\" rel=\"nofollow\">de:pasteur</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:grasa-anhidra-de-leche\" class=\"tag user_defined\" rel=\"nofollow\">es:grasa-anhidra-de-leche</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:5-dont-eucres\" class=\"tag user_defined\" rel=\"nofollow\">fr:5-dont-eucres</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:4-pommes-pressees\" class=\"tag user_defined\" rel=\"nofollow\">fr:4-pommes-pressees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-peach-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural peach flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-spice-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural spice flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extraits-naturels-d-orange\" class=\"tag known\" rel=\"nofollow\">fr:Extraits naturels d'orange</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/garlic-and-parsley-butter\" class=\"tag user_defined\" rel=\"nofollow\">garlic-and-parsley-butter</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:feuilles-de-thym\" class=\"tag user_defined\" rel=\"nofollow\">fr:feuilles-de-thym</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:viande-de-dinde-avec-peau\" class=\"tag user_defined\" rel=\"nofollow\">fr:viande-de-dinde-avec-peau</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:flocken\" class=\"tag user_defined\" rel=\"nofollow\">de:flocken</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/waarvan-verzadigde-vetzuren-og\" class=\"tag user_defined\" rel=\"nofollow\">waarvan-verzadigde-vetzuren-og</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:a-consommer-de-preference-avant-la-date-iffiquee-sur-la-capsule\" class=\"tag user_defined\" rel=\"nofollow\">fr:a-consommer-de-preference-avant-la-date-iffiquee-sur-la-capsule</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pt:leite-magro-em-po-ou-concentrado\" class=\"tag user_defined\" rel=\"nofollow\">pt:leite-magro-em-po-ou-concentrado</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:decoupe-de-poulet-fermier-cou-nu-jaune\" class=\"tag user_defined\" rel=\"nofollow\">fr:decoupe-de-poulet-fermier-cou-nu-jaune</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:puree-de-tomate-mi-reduite\" class=\"tag known\" rel=\"nofollow\">fr:Purée de tomate mi-réduite</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:iors-ouver-are\" class=\"tag user_defined\" rel=\"nofollow\">fr:iors-ouver-are</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dog-rose\" class=\"tag known\" rel=\"nofollow\">Dog rose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/artichoke\" class=\"tag known\" rel=\"nofollow\">Artichoke</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miel-de-chataignier\" class=\"tag known\" rel=\"nofollow\">fr:Miel de châtaignier</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sour-cherry\" class=\"tag known\" rel=\"nofollow\">Sour cherry</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:8400-kl20s40\" class=\"tag user_defined\" rel=\"nofollow\">nl:8400-kl20s40</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/forest-honey\" class=\"tag known\" rel=\"nofollow\">Forest honey</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tomate-10-eau\" class=\"tag user_defined\" rel=\"nofollow\">fr:tomate-10-eau</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huiles-et-stearines-vegetales\" class=\"tag user_defined\" rel=\"nofollow\">fr:huiles-et-stearines-vegetales</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:b6-thiamine\" class=\"tag user_defined\" rel=\"nofollow\">fr:b6-thiamine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sauce-de-soja\" class=\"tag user_defined\" rel=\"nofollow\">sauce-de-soja</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ou-moins\" class=\"tag user_defined\" rel=\"nofollow\">ou-moins</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%B0%D1%81%D0%BB%D0%BE-%D0%BF%D0%BE%D0%B4%D1%81%D0%BE%D0%BB%D0%BD%D0%B5%D1%87%D0%BD%D0%BE%D0%B5-%D0%BD%D0%B5%D1%80%D0%B0%D1%84%D0%B8%D0%BD%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:масло-подсолнечное-нерафинированное</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%85%D0%BB%D0%BE%D0%BF%D1%8C%D1%8F-%D0%BA%D1%83%D0%BA%D1%83%D1%80%D1%83%D0%B7%D1%8B\" class=\"tag user_defined\" rel=\"nofollow\">ru:хлопья-кукурузы</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it-s-fair-to-say-we-know-a-thong-and-two-about-sausages\" class=\"tag user_defined\" rel=\"nofollow\">it-s-fair-to-say-we-know-a-thong-and-two-about-sausages</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n";
    public static String split11 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-legere-a-12-de-matieres-grasses\" class=\"tag user_defined\" rel=\"nofollow\">fr:creme-legere-a-12-de-matieres-grasses</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/arabica-coffee\" class=\"tag known\" rel=\"nofollow\">Arabica coffee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ingrediens\" class=\"tag user_defined\" rel=\"nofollow\">fr:ingrediens</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:arome-vimto\" class=\"tag user_defined\" rel=\"nofollow\">fr:arome-vimto</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sel-marin-certifiee\" class=\"tag user_defined\" rel=\"nofollow\">fr:sel-marin-certifiee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:contient-de-l-amidon-de-pomme-de-terre-et-de-mais\" class=\"tag user_defined\" rel=\"nofollow\">fr:contient-de-l-amidon-de-pomme-de-terre-et-de-mais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:curcuma-poudre\" class=\"tag user_defined\" rel=\"nofollow\">fr:curcuma-poudre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:estratto-di-bacca-di-vaniglia-0\" class=\"tag user_defined\" rel=\"nofollow\">it:estratto-di-bacca-di-vaniglia-0</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pommes-de-terre-vitelottes\" class=\"tag user_defined\" rel=\"nofollow\">fr:pommes-de-terre-vitelottes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sodium-energy-fat-benzoate\" class=\"tag user_defined\" rel=\"nofollow\">sodium-energy-fat-benzoate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:min\" class=\"tag user_defined\" rel=\"nofollow\">ro:min</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:anidride-carbo\" class=\"tag user_defined\" rel=\"nofollow\">it:anidride-carbo</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pour-la-cuisson\" class=\"tag user_defined\" rel=\"nofollow\">fr:pour-la-cuisson</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cafe-moulu-pur-arabica\" class=\"tag known\" rel=\"nofollow\">fr:Café moulu pur arabica</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:nettovikten-%C3%A4r-dock-alltidh\" class=\"tag user_defined\" rel=\"nofollow\">nb:nettovikten-är-dock-alltidh</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:alecontenu-non-utilise-dans-un-pot-avec-couvercle\" class=\"tag user_defined\" rel=\"nofollow\">fr:alecontenu-non-utilise-dans-un-pot-avec-couvercle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:spiskummin-och-oregano\" class=\"tag user_defined\" rel=\"nofollow\">sv:spiskummin-och-oregano</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:din-lapte\" class=\"tag user_defined\" rel=\"nofollow\">ro:din-lapte</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:bourbonvanilleschote-gemahlen\" class=\"tag user_defined\" rel=\"nofollow\">de:bourbonvanilleschote-gemahlen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/geproduceerd-en-pasulie-leone-s-d\" class=\"tag user_defined\" rel=\"nofollow\">geproduceerd-en-pasulie-leone-s-d</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-de-chataigne\" class=\"tag user_defined\" rel=\"nofollow\">fr:creme-de-chataigne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-de-poulet\" class=\"tag known\" rel=\"nofollow\">fr:Extrait de poulet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vin-issu-des-cepages-syrah-et-grenache\" class=\"tag user_defined\" rel=\"nofollow\">fr:vin-issu-des-cepages-syrah-et-grenache</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:5-fett\" class=\"tag user_defined\" rel=\"nofollow\">de:5-fett</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/phenoxyethanol\" class=\"tag user_defined\" rel=\"nofollow\">phenoxyethanol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-dextrin-gluten-free\" class=\"tag user_defined\" rel=\"nofollow\">wheat-dextrin-gluten-free</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mer-celtique-et-manche-avec-sennes\" class=\"tag user_defined\" rel=\"nofollow\">fr:mer-celtique-et-manche-avec-sennes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:viande-de-veau-fermier-d-aquitaine-et-du-limousin\" class=\"tag user_defined\" rel=\"nofollow\">fr:viande-de-veau-fermier-d-aquitaine-et-du-limousin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eclats-de-biscuits-aux-amandes\" class=\"tag user_defined\" rel=\"nofollow\">fr:eclats-de-biscuits-aux-amandes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/raspberry-flavouring\" class=\"tag known\" rel=\"nofollow\">Raspberry flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:granella-di-meringhe\" class=\"tag user_defined\" rel=\"nofollow\">it:granella-di-meringhe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/631\" class=\"tag user_defined\" rel=\"nofollow\">631</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soy-protein-isolate\" class=\"tag known\" rel=\"nofollow\">Soy protein isolate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D0%BA-%D0%BA%D0%BB%D1%83%D0%B1%D0%BD%D0%B8%D1%87%D0%BD%D1%8B%D0%B9-%D0%BA%D0%BE%D0%BD%D1%86%D0%B5%D0%BD%D1%82%D1%80%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:сок-клубничный-концентрированный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pur-boeuf\" class=\"tag known\" rel=\"nofollow\">fr:Pur boeuf</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:noix-de-saint-jacques-sans-corail\" class=\"tag known\" rel=\"nofollow\">fr:Noix de Saint-Jacques sans corail</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/thai-long-grain-rice\" class=\"tag known\" rel=\"nofollow\">Thai long grain rice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miel-de-montagne-de-france\" class=\"tag known\" rel=\"nofollow\">fr:Miel de montagne de France</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/orange-pulp\" class=\"tag known\" rel=\"nofollow\">Orange pulp</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:aromes-naturels-saccharose-sirop-de-glucose\" class=\"tag user_defined\" rel=\"nofollow\">fr:aromes-naturels-saccharose-sirop-de-glucose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:epinards-en-branches\" class=\"tag known\" rel=\"nofollow\">fr:Épinards en branches</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pepites-de-cranberries\" class=\"tag user_defined\" rel=\"nofollow\">fr:pepites-de-cranberries</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:rose\" class=\"tag user_defined\" rel=\"nofollow\">fr:rose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pentosodium-triphosphate\" class=\"tag user_defined\" rel=\"nofollow\">pentosodium-triphosphate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mohr-informationen\" class=\"tag user_defined\" rel=\"nofollow\">de:mohr-informationen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:arome-naturel-de-muscade\" class=\"tag known\" rel=\"nofollow\">fr:Arôme naturel de muscade</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/packaged-by-weight\" class=\"tag user_defined\" rel=\"nofollow\">packaged-by-weight</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:champignons-de-paris-blanc\" class=\"tag user_defined\" rel=\"nofollow\">fr:champignons-de-paris-blanc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lactose-et-derives-du-lait\" class=\"tag user_defined\" rel=\"nofollow\">fr:lactose-et-derives-du-lait</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tri-and-polyphosphates\" class=\"tag user_defined\" rel=\"nofollow\">tri-and-polyphosphates</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:poivre-moutarde\" class=\"tag user_defined\" rel=\"nofollow\">fr:poivre-moutarde</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/aspic\" class=\"tag known\" rel=\"nofollow\">Aspic</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tomaten-paprika-dip\" class=\"tag user_defined\" rel=\"nofollow\">de:tomaten-paprika-dip</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cacao-minimum\" class=\"tag known\" rel=\"nofollow\">fr:Cacao minimum</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n";

    public static String split12 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/candied-orange-peel\" class=\"tag known\" rel=\"nofollow\">Candied orange peel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:3\" class=\"tag user_defined\" rel=\"nofollow\">fr:3</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/patagonian-scallop\" class=\"tag known\" rel=\"nofollow\">Patagonian scallop</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:%D9%88-e242\" class=\"tag user_defined\" rel=\"nofollow\">fr:و-e242</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/copper\" class=\"tag known\" rel=\"nofollow\">Copper</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/su-e\" class=\"tag user_defined\" rel=\"nofollow\">su-e</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beeswax-white-and-yellow\" class=\"tag user_defined\" rel=\"nofollow\">beeswax-white-and-yellow</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B3%D0%BB%D1%8E%D1%82%D0%B5%D0%BD-%D0%BF%D1%88%D0%B5%D0%BD%D0%B8%D1%87%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:глютен-пшеничный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mono-et-diglycerides-d-acides-gras-et-esters-monoacetyltartrique-et-diacetyltartrique-des-mono-et-diglycerides-d-acides-gras\" class=\"tag user_defined\" rel=\"nofollow\">fr:mono-et-diglycerides-d-acides-gras-et-esters-monoacetyltartrique-et-diacetyltartrique-des-mono-et-diglycerides-d-acides-gras</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/semi-skimmed-mild-yogurt\" class=\"tag known\" rel=\"nofollow\">Semi-skimmed mild yogurt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pates-iinguine\" class=\"tag user_defined\" rel=\"nofollow\">fr:pates-iinguine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B4%D1%80%D0%BE%D0%B6%D0%B6%D0%B8-%D1%81%D1%83%D1%85\" class=\"tag user_defined\" rel=\"nofollow\">ru:дрожжи-сух</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%88%D0%BE%D0%BA%D0%BE%D0%BB%D0%B0%D0%B4%D0%BD%D0%B0%D1%8F-%D0%B3%D0%BB%D0%B0%D0%B7%D1%83%D1%80%D1%8C-%D1%81-%D1%80%D0%B0%D1%81%D1%82%D0%B8%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%BC-%D0%B6%D0%B8%D1%80%D0%BE%D0%BC\" class=\"tag user_defined\" rel=\"nofollow\">ru:шоколадная-глазурь-с-растительным-жиром</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tracos-possfblog-do-gluten\" class=\"tag user_defined\" rel=\"nofollow\">fr:tracos-possfblog-do-gluten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:colorant-de-la-croute\" class=\"tag known\" rel=\"nofollow\">fr:Colorant de la croûte</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kr%C3%A4uterauszug\" class=\"tag user_defined\" rel=\"nofollow\">de:kräuterauszug</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:sw\" class=\"tag user_defined\" rel=\"nofollow\">de:sw</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:fruktose-zwiebelextrakt\" class=\"tag user_defined\" rel=\"nofollow\">de:fruktose-zwiebelextrakt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/electrolyte\" class=\"tag user_defined\" rel=\"nofollow\">electrolyte</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mono-et-diglycerides-diacides-gras\" class=\"tag user_defined\" rel=\"nofollow\">fr:mono-et-diglycerides-diacides-gras</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/protect-from-moisture\" class=\"tag user_defined\" rel=\"nofollow\">protect-from-moisture</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:du-pacifique\" class=\"tag user_defined\" rel=\"nofollow\">fr:du-pacifique</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/banana-flavouring\" class=\"tag known\" rel=\"nofollow\">Banana flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:tournesol\" class=\"tag user_defined\" rel=\"nofollow\">it:tournesol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:la-lettre-indiquee-avec-la-date-de-durabilite-minimale-et-le-numero-de-lot-correspond-a-la-zone-de-peche-du-colin-d-alaska\" class=\"tag user_defined\" rel=\"nofollow\">fr:la-lettre-indiquee-avec-la-date-de-durabilite-minimale-et-le-numero-de-lot-correspond-a-la-zone-de-peche-du-colin-d-alaska</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-cow-s-milk\" class=\"tag known\" rel=\"nofollow\">Whole cow's milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fagricu\" class=\"tag user_defined\" rel=\"nofollow\">fr:fagricu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BE%D1%82%D0%B2%D0%B5%D1%80%D0%B4%D0%B8%D1%82%D0%B5%D0%BB%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:отвердителя</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%B0%D0%B9%D1%80%D0%B0-%D1%82\" class=\"tag user_defined\" rel=\"nofollow\">ru:сайра-т</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/skipjack-tuna\" class=\"tag known\" rel=\"nofollow\">Skipjack tuna</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ingredients-de-la-preparation-deshydratee\" class=\"tag user_defined\" rel=\"nofollow\">fr:ingredients-de-la-preparation-deshydratee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-fresh-eggs\" class=\"tag known\" rel=\"nofollow\">Whole fresh eggs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vin-jaune\" class=\"tag user_defined\" rel=\"nofollow\">fr:vin-jaune</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pates-alimentaires-fusilli-cuites-cuisinees\" class=\"tag user_defined\" rel=\"nofollow\">fr:pates-alimentaires-fusilli-cuites-cuisinees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru-contenance\" class=\"tag user_defined\" rel=\"nofollow\">ru-contenance</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/curcuma\" class=\"tag user_defined\" rel=\"nofollow\">curcuma</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sachet-de-biscuits-feuilletes-sales\" class=\"tag user_defined\" rel=\"nofollow\">fr:sachet-de-biscuits-feuilletes-sales</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/gluten-free-pasta\" class=\"tag user_defined\" rel=\"nofollow\">gluten-free-pasta</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:2-orange-pressee\" class=\"tag user_defined\" rel=\"nofollow\">fr:2-orange-pressee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:term%C3%A9szetes-van%C3%ADlia\" class=\"tag user_defined\" rel=\"nofollow\">hu:természetes-vanília</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:carni-bovine-cotte-35-equivalente-a-140g-di-carne-cruda-magra\" class=\"tag user_defined\" rel=\"nofollow\">it:carni-bovine-cotte-35-equivalente-a-140g-di-carne-cruda-magra</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-ecrem%C4%97-reconstitue-a-base-de-lait-en-poudre\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-ecremė-reconstitue-a-base-de-lait-en-poudre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:filets-maillants-et-similaires\" class=\"tag user_defined\" rel=\"nofollow\">fr:filets-maillants-et-similaires</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e212\" class=\"tag known\" rel=\"nofollow\">E212</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/stone-ground-corn\" class=\"tag user_defined\" rel=\"nofollow\">stone-ground-corn</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lait\" class=\"tag user_defined\" rel=\"nofollow\">lait</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mais-doux-en-grains-sans-ogm\" class=\"tag known\" rel=\"nofollow\">fr:Maïs doux en grains sans ogm</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E5%B0%8F%E8%98%87%E6%89%93\" class=\"tag user_defined\" rel=\"nofollow\">zh:小蘇打</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%BE%D0%BB%D0%BE%D0%BA%D0%BE%D1%81%D0%B2%D0%B5%D1%80%D1%82%D1%8B%D0%B2%D0%B0%D1%8E%D1%89%D0%B8%D0%B9-%D1%84%D0%B5%D1%80%D0%BC%D0%B5%D0%BD%D1%82%D0%BD%D1%8B%D0%B9-%D0%BF%D1%80%D0%B5%D0%BF%D0%B0%D1%80%D0%B0%D1%82\" class=\"tag user_defined\" rel=\"nofollow\">ru:молокосвертывающий-ферментный-препарат</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mout-devaisin-concentre\" class=\"tag user_defined\" rel=\"nofollow\">fr:mout-devaisin-concentre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BE%D0%B1%D0%B6%D0%B0%D1%80%D0%B5%D0%BD%D0%BD%D0%BE%D0%B5-%D1%8F%D0%B4%D1%80%D0%BE-%D0%BF%D0%BE%D0%B4%D1%81%D0%BE%D0%BB%D0%BD%D0%B5%D1%87%D0%BD%D0%B8%D0%BA%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:обжаренное-ядро-подсолнечника</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:hergestellt-in-den-vereinigten-arabischen-emiraten\" class=\"tag user_defined\" rel=\"nofollow\">de:hergestellt-in-den-vereinigten-arabischen-emiraten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:lecitin%C4%83-din-floarea-soarelui\" class=\"tag user_defined\" rel=\"nofollow\">ro:lecitină-din-floarea-soarelui</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pholiota\" class=\"tag known\" rel=\"nofollow\">Pholiota</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whey-cheddar-cheese\" class=\"tag user_defined\" rel=\"nofollow\">whey-cheddar-cheese</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-and-artificia-flavors\" class=\"tag user_defined\" rel=\"nofollow\">natural-and-artificia-flavors</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-cranberry-a-base-de-concentre\" class=\"tag known\" rel=\"nofollow\">fr:Jus de cranberry à base de concentré</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:carottes-des-landes\" class=\"tag user_defined\" rel=\"nofollow\">fr:carottes-des-landes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gebratener-fr%C3%BChst%C3%BCcksspeck\" class=\"tag user_defined\" rel=\"nofollow\">de:gebratener-frühstücksspeck</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%B5%D0%BC%D0%B5%D0%BD%D0%B0-%D0%BA%D1%83%D0%BD%D0%B6%D1%83%D1%82%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:семена-кунжута</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/46\" class=\"tag user_defined\" rel=\"nofollow\">46</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:kem%C3%A9ny%C3%ADt%C5%91-emulge%C3%A1l%C3%B3szer\" class=\"tag user_defined\" rel=\"nofollow\">hu:keményítő-emulgeálószer</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:puree-de-pommes-concentree\" class=\"tag known\" rel=\"nofollow\">fr:Purée de pommes concentrée</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/roast-chicken\" class=\"tag known\" rel=\"nofollow\">Roast chicken</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:viande-de-tet-de-boeuf\" class=\"tag user_defined\" rel=\"nofollow\">fr:viande-de-tet-de-boeuf</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e221\" class=\"tag known\" rel=\"nofollow\">E221</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/arome-bergamote\" class=\"tag user_defined\" rel=\"nofollow\">arome-bergamote</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:branntweinessig-modifizierte-maisst%C3%A4rke\" class=\"tag user_defined\" rel=\"nofollow\">de:branntweinessig-modifizierte-maisstärke</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-protein\" class=\"tag known\" rel=\"nofollow\">Chicken protein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lemon-pulp\" class=\"tag known\" rel=\"nofollow\">Lemon pulp</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:quot\" class=\"tag user_defined\" rel=\"nofollow\">de:quot</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/503\" class=\"tag user_defined\" rel=\"nofollow\">503</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:beurre-de-cacao-pate-de-cacao\" class=\"tag user_defined\" rel=\"nofollow\">fr:beurre-de-cacao-pate-de-cacao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ascoli-piceno\" class=\"tag user_defined\" rel=\"nofollow\">ascoli-piceno</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pain-suedois\" class=\"tag user_defined\" rel=\"nofollow\">fr:pain-suedois</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jambon-de-porc-francais\" class=\"tag known\" rel=\"nofollow\">fr:Jambon de porc français</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%B0%D1%81%D1%81%D0%BE%D0%B2%D0%B0%D1%8F-%D0%B4%D0%BE%D0%BB%D1%8F-%D1%85%D0%BB%D0%BE%D1%80%D0%B8%D1%81%D1%82%D0%BE%D0%B3%D0%BE-%D0%BD%D0%B0%D1%82%D1%80%D0%B8%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:массовая-доля-хлористого-натрия</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:hasein%C3%BCsse\" class=\"tag user_defined\" rel=\"nofollow\">de:haseinüsse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/meat-patty\" class=\"tag known\" rel=\"nofollow\">Meat patty</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/extra-fine-green-beans\" class=\"tag known\" rel=\"nofollow\">Extra-fine green beans</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:boli-%D9%85%D8%A8%D8%B3%D8%AA%D8%B1%D8%A7%D8%AA\" class=\"tag user_defined\" rel=\"nofollow\">fr:boli-مبسترات</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:beurre-lait-entier-en-poudre\" class=\"tag user_defined\" rel=\"nofollow\">fr:beurre-lait-entier-en-poudre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:l-l-carnitin\" class=\"tag user_defined\" rel=\"nofollow\">de:l-l-carnitin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e345\" class=\"tag known\" rel=\"nofollow\">E345</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/red-and-yellow-peppers\" class=\"tag known\" rel=\"nofollow\">Red and yellow peppers</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:oblate\" class=\"tag user_defined\" rel=\"nofollow\">de:oblate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miel-de-foret-d-italie\" class=\"tag known\" rel=\"nofollow\">fr:Miel de foret d'italie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:moutarde-a-l-ancienne\" class=\"tag known\" rel=\"nofollow\">fr:Moutarde à l'ancienne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:%C8%99oric\" class=\"tag user_defined\" rel=\"nofollow\">ro:șoric</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lecithine-de-soja-aromes\" class=\"tag user_defined\" rel=\"nofollow\">fr:lecithine-de-soja-aromes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:trennungsmittel\" class=\"tag user_defined\" rel=\"nofollow\">de:trennungsmittel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:quot\" class=\"tag user_defined\" rel=\"nofollow\">it:quot</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:polifosfa%C8%9Bi\" class=\"tag user_defined\" rel=\"nofollow\">ro:polifosfați</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:d-autres-cereales-contenant-du-gluten-et-de-fruits-a-coque\" class=\"tag user_defined\" rel=\"nofollow\">fr:d-autres-cereales-contenant-du-gluten-et-de-fruits-a-coque</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beef-heart\" class=\"tag known\" rel=\"nofollow\">Beef heart</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:8-20149-milano\" class=\"tag user_defined\" rel=\"nofollow\">de:8-20149-milano</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:frische-vollmilch-pasteurisiert-nicht-homogenisiert\" class=\"tag user_defined\" rel=\"nofollow\">de:frische-vollmilch-pasteurisiert-nicht-homogenisiert</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pcivre-de\" class=\"tag user_defined\" rel=\"nofollow\">fr:pcivre-de</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:traubens%C3%BC%C3%9Fe\" class=\"tag user_defined\" rel=\"nofollow\">de:traubensüße</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cooked-beef-meat\" class=\"tag known\" rel=\"nofollow\">Cooked beef meat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:sare\" class=\"tag user_defined\" rel=\"nofollow\">hu:sare</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:180-crevettes\" class=\"tag user_defined\" rel=\"nofollow\">fr:180-crevettes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zwarte-thee-met-bergamotaroma-ingredienten\" class=\"tag user_defined\" rel=\"nofollow\">zwarte-thee-met-bergamotaroma-ingredienten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vinaigre-balsamique-demce-de-vin\" class=\"tag user_defined\" rel=\"nofollow\">fr:vinaigre-balsamique-demce-de-vin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:peche-en-pacifique-nord-ouest-ou\" class=\"tag user_defined\" rel=\"nofollow\">fr:peche-en-pacifique-nord-ouest-ou</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B3%D0%B8%D0%B4%D1%80%D0%BE%D0%B3%D0%B5%D0%BD%D0%B8%D0%B7%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5-%D0%BF%D0%B0%D0%BB%D1%8C%D0%BC%D0%BE%D1%8F%D0%B4%D1%80%D0%BE%D0%B2%D0%BE%D0%B5-%D0%BC%D0%B0%D1%81%D0%BB%D0%BE\" class=\"tag user_defined\" rel=\"nofollow\">ru:гидрогенизированное-пальмоядровое-масло</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:raisin-sultanine\" class=\"tag user_defined\" rel=\"nofollow\">fr:raisin-sultanine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:produit\" class=\"tag user_defined\" rel=\"nofollow\">fr:produit</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/magermilchpulver\" class=\"tag user_defined\" rel=\"nofollow\">magermilchpulver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/het-gemiddelde-geviicht-van-een-pastille-is\" class=\"tag user_defined\" rel=\"nofollow\">het-gemiddelde-geviicht-van-een-pastille-is</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E7%B4%B0%E7%A3%A8%E7%83%8F%E9%BE%8D%E8%8C%B6%E8%91%89\" class=\"tag user_defined\" rel=\"nofollow\">zh:細磨烏龍茶葉</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spices-garlic\" class=\"tag user_defined\" rel=\"nofollow\">spices-garlic</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:amidon-modifie-de-mais-huile-de-tournesol\" class=\"tag user_defined\" rel=\"nofollow\">fr:amidon-modifie-de-mais-huile-de-tournesol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gouda\" class=\"tag user_defined\" rel=\"nofollow\">de:gouda</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:conserver-au-sec\" class=\"tag user_defined\" rel=\"nofollow\">fr:conserver-au-sec</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vermicelle-de-riz\" class=\"tag user_defined\" rel=\"nofollow\">fr:vermicelle-de-riz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n";

    public static String split13 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/casings-made-from-beef-collagen\" class=\"tag user_defined\" rel=\"nofollow\">casings-made-from-beef-collagen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:concentrat-colorant-din-plante-si-fructe\" class=\"tag user_defined\" rel=\"nofollow\">ro:concentrat-colorant-din-plante-si-fructe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:puo-contenere-tracce-di\" class=\"tag user_defined\" rel=\"nofollow\">it:puo-contenere-tracce-di</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:arome-sel\" class=\"tag user_defined\" rel=\"nofollow\">fr:arome-sel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kollagenhydrolysat\" class=\"tag user_defined\" rel=\"nofollow\">de:kollagenhydrolysat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:fermenti-latici\" class=\"tag user_defined\" rel=\"nofollow\">it:fermenti-latici</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mozzarella-milk\" class=\"tag user_defined\" rel=\"nofollow\">mozzarella-milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:bicarbonate-et-pyrophosphate-de-sodium\" class=\"tag user_defined\" rel=\"nofollow\">fr:bicarbonate-et-pyrophosphate-de-sodium</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:vete-sk%C3%A5llning-och-f%C3%B6rj%C3%A4st-vete-mj%C3%B6l\" class=\"tag user_defined\" rel=\"nofollow\">sv:vete-skållning-och-förjäst-vete-mjöl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sucre-raffine\" class=\"tag user_defined\" rel=\"nofollow\">fr:sucre-raffine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chard\" class=\"tag known\" rel=\"nofollow\">Chard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nature-identical-flavour\" class=\"tag user_defined\" rel=\"nofollow\">nature-identical-flavour</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:3-puree-de-banane\" class=\"tag user_defined\" rel=\"nofollow\">fr:3-puree-de-banane</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-rice\" class=\"tag known\" rel=\"nofollow\">White rice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cooked-carrot\" class=\"tag known\" rel=\"nofollow\">Cooked carrot</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:pecorino-k%C3%A4se\" class=\"tag user_defined\" rel=\"nofollow\">de:pecorino-käse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e263\" class=\"tag known\" rel=\"nofollow\">E263</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fruit-juice-based-on-concentrates\" class=\"tag user_defined\" rel=\"nofollow\">fruit-juice-based-on-concentrates</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/no:vitamin-d\" class=\"tag user_defined\" rel=\"nofollow\">no:vitamin-d</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cyclopentasiloxane\" class=\"tag user_defined\" rel=\"nofollow\">cyclopentasiloxane</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:kan-sporen-van-schaaldieren-en-soja-bevatten\" class=\"tag user_defined\" rel=\"nofollow\">fr:kan-sporen-van-schaaldieren-en-soja-bevatten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ail\" class=\"tag user_defined\" rel=\"nofollow\">ail</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:nsel\" class=\"tag user_defined\" rel=\"nofollow\">fr:nsel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:reine-eingesottene-butter\" class=\"tag user_defined\" rel=\"nofollow\">de:reine-eingesottene-butter</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:7-tmodifiesel\" class=\"tag user_defined\" rel=\"nofollow\">fr:7-tmodifiesel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-fat-palm\" class=\"tag user_defined\" rel=\"nofollow\">vegetable-fat-palm</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:sert%C3%A9sszalonna\" class=\"tag user_defined\" rel=\"nofollow\">hu:sertésszalonna</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/f-2\" class=\"tag user_defined\" rel=\"nofollow\">f-2</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:designs\" class=\"tag user_defined\" rel=\"nofollow\">de:designs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:polvre\" class=\"tag user_defined\" rel=\"nofollow\">fr:polvre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coconut-water\" class=\"tag known\" rel=\"nofollow\">Coconut water</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:arome-naturel-de-sucre-roux\" class=\"tag known\" rel=\"nofollow\">fr:Arôme naturel de sucre roux</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:texturant\" class=\"tag user_defined\" rel=\"nofollow\">fr:texturant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-dill-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural dill flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:druesukke-salt\" class=\"tag user_defined\" rel=\"nofollow\">nb:druesukke-salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sheep-s-and-goats-milk\" class=\"tag user_defined\" rel=\"nofollow\">sheep-s-and-goats-milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:caille-lait\" class=\"tag user_defined\" rel=\"nofollow\">fr:caille-lait</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sunflower-oil-values\" class=\"tag user_defined\" rel=\"nofollow\">sunflower-oil-values</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/of-milk-curd\" class=\"tag user_defined\" rel=\"nofollow\">of-milk-curd</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ble\" class=\"tag user_defined\" rel=\"nofollow\">ble</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ce-produit-contient-du-jambon-fabrique-a-partir-de-viande-de-porc\" class=\"tag user_defined\" rel=\"nofollow\">fr:ce-produit-contient-du-jambon-fabrique-a-partir-de-viande-de-porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:fulgi-de-nuc%C4%83-de-cocos\" class=\"tag user_defined\" rel=\"nofollow\">ro:fulgi-de-nucă-de-cocos</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wakame\" class=\"tag known\" rel=\"nofollow\">Wakame</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D0%BB%D0%BE%D0%B4-%D1%8F%D1%87%D0%BC%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9-%D0%BC%D0%BE%D0%BB%D0%BE%D1%82%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:солод-ячменный-молотый</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-betterave-rouge-concentre\" class=\"tag known\" rel=\"nofollow\">fr:Jus de betterave rouge concentré</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:filetes-de-sardinas\" class=\"tag user_defined\" rel=\"nofollow\">es:filetes-de-sardinas</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:ignwer\" class=\"tag user_defined\" rel=\"nofollow\">de:ignwer</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-spices\" class=\"tag known\" rel=\"nofollow\">Natural spices</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kr%C3%A4uteressig\" class=\"tag user_defined\" rel=\"nofollow\">de:kräuteressig</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lactose-free-milk\" class=\"tag known\" rel=\"nofollow\">Lactose-free milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bourbon-vanilla-natural-flavouring\" class=\"tag known\" rel=\"nofollow\">Bourbon vanilla natural flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:ant%C3%AFoxidatiunsmittel-kaliummetabisulfit\" class=\"tag user_defined\" rel=\"nofollow\">de:antïoxidatiunsmittel-kaliummetabisulfit</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:calvados-denature\" class=\"tag user_defined\" rel=\"nofollow\">fr:calvados-denature</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pl:any%C5%BC\" class=\"tag user_defined\" rel=\"nofollow\">pl:anyż</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/piments\" class=\"tag user_defined\" rel=\"nofollow\">piments</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lactic\" class=\"tag user_defined\" rel=\"nofollow\">lactic</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:chair-de-morue-emiettee\" class=\"tag user_defined\" rel=\"nofollow\">fr:chair-de-morue-emiettee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:soja-ble\" class=\"tag user_defined\" rel=\"nofollow\">fr:soja-ble</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:riz-long-complet-precuit-par-etuvage\" class=\"tag user_defined\" rel=\"nofollow\">fr:riz-long-complet-precuit-par-etuvage</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melange-de-riz-precuit-avec-des-aiguillettes-de-poulet-cuites-traitees-en-salaison-dans-une-sauce-a-base-de-champignons-de-paris-et-de-creme\" class=\"tag user_defined\" rel=\"nofollow\">fr:melange-de-riz-precuit-avec-des-aiguillettes-de-poulet-cuites-traitees-en-salaison-dans-une-sauce-a-base-de-champignons-de-paris-et-de-creme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/extruded-rice\" class=\"tag known\" rel=\"nofollow\">Extruded rice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/flour-locust-bean-seeds\" class=\"tag user_defined\" rel=\"nofollow\">flour-locust-bean-seeds</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:proteines-de-lalt\" class=\"tag user_defined\" rel=\"nofollow\">fr:proteines-de-lalt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:12-oeufs-de-categorie-a-de-poules-elevees-en-cage\" class=\"tag user_defined\" rel=\"nofollow\">fr:12-oeufs-de-categorie-a-de-poules-elevees-en-cage</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:f%C4%83in%C4%83-neagr%C4%83-de-gr%C3%A2u\" class=\"tag user_defined\" rel=\"nofollow\">ro:făină-neagră-de-grâu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:youn-t-houe-00-smolt-sweets\" class=\"tag user_defined\" rel=\"nofollow\">it:youn-t-houe-00-smolt-sweets</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/iron-fumarate\" class=\"tag known\" rel=\"nofollow\">Iron fumarate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:papayas\" class=\"tag user_defined\" rel=\"nofollow\">de:papayas</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:bio-augurken\" class=\"tag user_defined\" rel=\"nofollow\">nl:bio-augurken</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beef-casing\" class=\"tag known\" rel=\"nofollow\">Beef casing</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/grapefruit-juice-based-on-concentrate\" class=\"tag known\" rel=\"nofollow\">Grapefruit juice based on concentrate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:6-et-de-pasteque-2-a-base-de-jus-concentre\" class=\"tag user_defined\" rel=\"nofollow\">fr:6-et-de-pasteque-2-a-base-de-jus-concentre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:du-saumon-keta-et-rose\" class=\"tag user_defined\" rel=\"nofollow\">fr:du-saumon-keta-et-rose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e526\" class=\"tag known\" rel=\"nofollow\">E526</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:elange-au-gingembre\" class=\"tag user_defined\" rel=\"nofollow\">fr:elange-au-gingembre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:fibr%C4%83-vegetal%C4%83-de-maz%C4%83re\" class=\"tag user_defined\" rel=\"nofollow\">ro:fibră-vegetală-de-mazăre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/naturliches-krauter-aroma\" class=\"tag user_defined\" rel=\"nofollow\">naturliches-krauter-aroma</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%83%AA%E3%83%B3%E9%85%B8%E5%A1%A9%EF%BC%88%EF%BD%8E%EF%BD%81%EF%BC%89\" class=\"tag user_defined\" rel=\"nofollow\">ja:リン酸塩（ｎａ）</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mozzarella-rapee\" class=\"tag user_defined\" rel=\"nofollow\">fr:mozzarella-rapee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/oat-bran\" class=\"tag known\" rel=\"nofollow\">Oat bran</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:ebb%C5%91l-chili\" class=\"tag user_defined\" rel=\"nofollow\">hu:ebből-chili</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/semi-sweet-chocolate-chips\" class=\"tag user_defined\" rel=\"nofollow\">semi-sweet-chocolate-chips</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eclats-de-caramel-au-beurre-sale\" class=\"tag known\" rel=\"nofollow\">fr:Éclats de caramel au beurre salé</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:rensk%C3%A5ret-svinekj%C3%B8tt-av-skinke\" class=\"tag user_defined\" rel=\"nofollow\">nb:renskåret-svinekjøtt-av-skinke</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:viande-de-porc\" class=\"tag user_defined\" rel=\"nofollow\">de:viande-de-porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:base-aromatisante\" class=\"tag user_defined\" rel=\"nofollow\">fr:base-aromatisante</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/almonds-pieces\" class=\"tag known\" rel=\"nofollow\">Almonds pieces</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E9%85%B5%E6%AF%8D%E8%90%83%E5%8F%96%E7%89%A9\" class=\"tag user_defined\" rel=\"nofollow\">zh:酵母萃取物</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-de-coquillages\" class=\"tag user_defined\" rel=\"nofollow\">fr:extrait-de-coquillages</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrogenated-polyisobutene\" class=\"tag user_defined\" rel=\"nofollow\">hydrogenated-polyisobutene</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:acide-ascorbique-et-farine-de-malt-de-ble\" class=\"tag user_defined\" rel=\"nofollow\">fr:acide-ascorbique-et-farine-de-malt-de-ble</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:formaggio-edamer\" class=\"tag user_defined\" rel=\"nofollow\">it:formaggio-edamer</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melange-de-miels-de-montagne-originaires-et-non-originaires-de-l-union-europeenne\" class=\"tag user_defined\" rel=\"nofollow\">fr:melange-de-miels-de-montagne-originaires-et-non-originaires-de-l-union-europeenne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vitamine-b\" class=\"tag user_defined\" rel=\"nofollow\">fr:vitamine-b</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rabbit-meat\" class=\"tag known\" rel=\"nofollow\">Rabbit meat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kutua\" class=\"tag user_defined\" rel=\"nofollow\">de:kutua</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:e316\" class=\"tag user_defined\" rel=\"nofollow\">nb:e316</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lambs-lettuce\" class=\"tag user_defined\" rel=\"nofollow\">lambs-lettuce</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rooibos-tea\" class=\"tag user_defined\" rel=\"nofollow\">rooibos-tea</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pyridoxine-chlorhydrate\" class=\"tag user_defined\" rel=\"nofollow\">fr:pyridoxine-chlorhydrate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:natives-olivenat-extra\" class=\"tag user_defined\" rel=\"nofollow\">de:natives-olivenat-extra</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mixed-fruit-juices-from-concentrate\" class=\"tag user_defined\" rel=\"nofollow\">mixed-fruit-juices-from-concentrate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:zone-de-peche-fao\" class=\"tag user_defined\" rel=\"nofollow\">fr:zone-de-peche-fao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:derivati\" class=\"tag user_defined\" rel=\"nofollow\">it:derivati</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/water-rapeseed-oil\" class=\"tag user_defined\" rel=\"nofollow\">water-rapeseed-oil</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hemp-protein\" class=\"tag user_defined\" rel=\"nofollow\">hemp-protein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/contains-lactobacillus-casei-shirota\" class=\"tag user_defined\" rel=\"nofollow\">contains-lactobacillus-casei-shirota</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:diphosphates-antioxydant\" class=\"tag user_defined\" rel=\"nofollow\">fr:diphosphates-antioxydant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mulgent\" class=\"tag user_defined\" rel=\"nofollow\">mulgent</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:bibernelle\" class=\"tag user_defined\" rel=\"nofollow\">de:bibernelle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whey-demineralized-powder\" class=\"tag user_defined\" rel=\"nofollow\">whey-demineralized-powder</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tiges-de-citronnelle\" class=\"tag user_defined\" rel=\"nofollow\">fr:tiges-de-citronnelle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-fruits-a-base-de-concentre-15-maximum\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-de-fruits-a-base-de-concentre-15-maximum</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:poivrons-du-sud-ouest\" class=\"tag user_defined\" rel=\"nofollow\">fr:poivrons-du-sud-ouest</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-balsamic-vinegar\" class=\"tag known\" rel=\"nofollow\">White balsamic vinegar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sucres-extraits-de-fruits\" class=\"tag known\" rel=\"nofollow\">fr:Sucres extraits de fruits</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sechees\" class=\"tag user_defined\" rel=\"nofollow\">fr:sechees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:olives-vertes-denoyautees\" class=\"tag known\" rel=\"nofollow\">fr:Olives vertes dénoyautées</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:1-banane-ecrasee\" class=\"tag user_defined\" rel=\"nofollow\">fr:1-banane-ecrasee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:yogurt-intero-con-fermenti-lattici\" class=\"tag user_defined\" rel=\"nofollow\">it:yogurt-intero-con-fermenti-lattici</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sucre-grain\" class=\"tag user_defined\" rel=\"nofollow\">fr:sucre-grain</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:maltodextrine-de-ble\" class=\"tag known\" rel=\"nofollow\">fr:Maltodextrine de blé</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:moulue\" class=\"tag user_defined\" rel=\"nofollow\">fr:moulue</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:anis-vert-grains\" class=\"tag user_defined\" rel=\"nofollow\">fr:anis-vert-grains</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/304\" class=\"tag user_defined\" rel=\"nofollow\">304</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e336i\" class=\"tag known\" rel=\"nofollow\">E336i</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huile-vierge-de-lin\" class=\"tag user_defined\" rel=\"nofollow\">fr:huile-vierge-de-lin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/contient-des-stabilisants-autorises\" class=\"tag user_defined\" rel=\"nofollow\">contient-des-stabilisants-autorises</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kaltegepresst\" class=\"tag user_defined\" rel=\"nofollow\">de:kaltegepresst</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/and-r\" class=\"tag user_defined\" rel=\"nofollow\">and-r</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huile-vegetale-raffinee\" class=\"tag known\" rel=\"nofollow\">fr:Huile végétale raffinée</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ouille-d-olive\" class=\"tag user_defined\" rel=\"nofollow\">fr:ouille-d-olive</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/monoglycerides\" class=\"tag user_defined\" rel=\"nofollow\">monoglycerides</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-pomme-5\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-de-pomme-5</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dhal\" class=\"tag user_defined\" rel=\"nofollow\">dhal</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrogenated-palm-oil\" class=\"tag known\" rel=\"nofollow\">Hydrogenated palm oil</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ginseng\" class=\"tag known\" rel=\"nofollow\">Ginseng</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:f%C3%BCllstoff-mikrokristtaline-cellulose\" class=\"tag user_defined\" rel=\"nofollow\">de:füllstoff-mikrokristtaline-cellulose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tocopheryl-acetate\" class=\"tag user_defined\" rel=\"nofollow\">tocopheryl-acetate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%82%D0%BC%D0%B8%D0%BD\" class=\"tag user_defined\" rel=\"nofollow\">ru:тмин</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/glut-y-and-dairy-produced-in-a-facility-that-also-processes-products-containing-eggs\" class=\"tag user_defined\" rel=\"nofollow\">glut-y-and-dairy-produced-in-a-facility-that-also-processes-products-containing-eggs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pp\" class=\"tag user_defined\" rel=\"nofollow\">fr:pp</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:riz-de-type-japonica\" class=\"tag user_defined\" rel=\"nofollow\">fr:riz-de-type-japonica</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:riz-complet-6\" class=\"tag user_defined\" rel=\"nofollow\">fr:riz-complet-6</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:pholiota-nameko-mutabi\" class=\"tag user_defined\" rel=\"nofollow\">it:pholiota-nameko-mutabi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tabasco\" class=\"tag user_defined\" rel=\"nofollow\">fr:tabasco</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:antiossidante\" class=\"tag user_defined\" rel=\"nofollow\">fr:antiossidante</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:schwarzes-johannisbeer\" class=\"tag user_defined\" rel=\"nofollow\">de:schwarzes-johannisbeer</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B2%D0%BE%D0%B4%D0%B0-%D0%BC%D0%B8%D0%BD%D0%B5%D1%80%D0%B0%D0%BB%D1%8C%D0%BD%D0%B0%D1%8F-%D0%BF%D0%B8%D1%82%D1%8C%D0%B5%D0%B2%D0%B0%D1%8F-%D0%BF%D1%80%D0%B8%D1%80%D0%BE%D0%B4%D0%BD%D0%B0%D1%8F-%D1%81%D1%82%D0%BE%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F-%D0%B3%D0%B8%D0%B4%D1%80%D0%BE%D0%BA%D0%B0%D1%80%D0%B1%D0%BE%D0%BD%D0%B0%D1%82%D0%BD%D0%B0%D1%8F-%D0%BA%D0%B0%D0%BB%D1%8C%D1%86%D0%B8%D0%B5%D0%B2%D0%BE-%D0%BC%D0%B0%D0%B3%D0%BD%D0%B8%D0%B5%D0%B2%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:вода-минеральная-питьевая-природная-столовая-гидрокарбонатная-кальциево-магниевая</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:semoule-de-ble-dur-de-qualite-eau\" class=\"tag user_defined\" rel=\"nofollow\">fr:semoule-de-ble-dur-de-qualite-eau</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sussmolkenpulver\" class=\"tag user_defined\" rel=\"nofollow\">sussmolkenpulver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:bifidobacterias-y-otros-fermentos-lacticos\" class=\"tag known\" rel=\"nofollow\">es:Bifidobacterias y otros fermentos lácticos</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/www-pastiglieteone-com-pastigtieleone-lot-no\" class=\"tag user_defined\" rel=\"nofollow\">www-pastiglieteone-com-pastigtieleone-lot-no</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:himbeergeist\" class=\"tag user_defined\" rel=\"nofollow\">de:himbeergeist</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:de\" class=\"tag user_defined\" rel=\"nofollow\">fr:de</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/alaskan-pollock-fillet\" class=\"tag known\" rel=\"nofollow\">Alaskan Pollock fillet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:matiere-grasse-de-lait-anhydride\" class=\"tag user_defined\" rel=\"nofollow\">fr:matiere-grasse-de-lait-anhydride</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/kvass-wort\" class=\"tag known\" rel=\"nofollow\">Kvass wort</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:salami\" class=\"tag user_defined\" rel=\"nofollow\">de:salami</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BA%D0%BE%D0%BD%D0%B4%D0%B8%D1%82%D0%B5%D1%80%D1%81%D0%BA%D0%B0%D1%8F-%D0%B4%D0%B5%D0%BA%D0%BE%D1%80%D0%B0%D1%82%D0%B8%D0%B2%D0%BD%D0%B0%D1%8F-%D0%BF%D0%BE%D1%81%D1%8B%D0%BF%D0%BA%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:кондитерская-декоративная-посыпка</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:citrate-de-sodium-conservateur\" class=\"tag user_defined\" rel=\"nofollow\">fr:citrate-de-sodium-conservateur</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/avoine\" class=\"tag user_defined\" rel=\"nofollow\">avoine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BB%D0%B0%D0%B4%D0%BA%D0%B0%D1%8F-%D0%BF%D0%B8%D1%89%D0%B5%D0%B2%D0%B0%D1%8F-%D1%81%D0%BC%D0%B5%D1%81%D1%8C-%D0%BC%D0%B0%D1%80%D0%BC%D0%B8%D0%BA%D1%81-25\" class=\"tag user_defined\" rel=\"nofollow\">ru:сладкая-пищевая-смесь-мармикс-25</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:organisme-genetiquement-modifie\" class=\"tag user_defined\" rel=\"nofollow\">fr:organisme-genetiquement-modifie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tannenhonig\" class=\"tag user_defined\" rel=\"nofollow\">de:tannenhonig</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cow-s-skimmed-milk-powder\" class=\"tag user_defined\" rel=\"nofollow\">cow-s-skimmed-milk-powder</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kakaopaste\" class=\"tag user_defined\" rel=\"nofollow\">de:kakaopaste</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rogenkleie\" class=\"tag user_defined\" rel=\"nofollow\">rogenkleie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cheese-grana-padano-dairy\" class=\"tag user_defined\" rel=\"nofollow\">cheese-grana-padano-dairy</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:grasso-butirrico\" class=\"tag user_defined\" rel=\"nofollow\">it:grasso-butirrico</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/onion-flavouring\" class=\"tag known\" rel=\"nofollow\">Onion flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e475-flavoring-dried-glucose-syrup-dried-skimmed-milk-stabiliser\" class=\"tag user_defined\" rel=\"nofollow\">e475-flavoring-dried-glucose-syrup-dried-skimmed-milk-stabiliser</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tillia\" class=\"tag user_defined\" rel=\"nofollow\">fr:tillia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hefe\" class=\"tag user_defined\" rel=\"nofollow\">hefe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:arome-amande-amere\" class=\"tag user_defined\" rel=\"nofollow\">fr:arome-amande-amere</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:risstivelse\" class=\"tag user_defined\" rel=\"nofollow\">nb:risstivelse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E7%99%BD%E6%AF%AB%E7%83%8F%E9%BE%8D%E8%8C%B6\" class=\"tag user_defined\" rel=\"nofollow\">zh:白毫烏龍茶</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ferments-lactiques-selectionnes-dont-bifidus\" class=\"tag user_defined\" rel=\"nofollow\">fr:ferments-lactiques-selectionnes-dont-bifidus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:usturoi-uscat\" class=\"tag user_defined\" rel=\"nofollow\">ro:usturoi-uscat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/burnet\" class=\"tag known\" rel=\"nofollow\">Burnet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:haricots-noirs-fermentes\" class=\"tag user_defined\" rel=\"nofollow\">fr:haricots-noirs-fermentes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:rhamnosus\" class=\"tag user_defined\" rel=\"nofollow\">fr:rhamnosus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-raisin-rouge\" class=\"tag known\" rel=\"nofollow\">fr:Jus de raisin rouge</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:e124\" class=\"tag user_defined\" rel=\"nofollow\">ru:e124</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sugarcane\" class=\"tag known\" rel=\"nofollow\">Sugarcane</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/65-ml\" class=\"tag user_defined\" rel=\"nofollow\">65-ml</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B3%D1%80%D0%B5%D1%87%D0%BD%D0%B5%D0%B2%D0%B0%D1%8F-%D0%BA%D1%80%D1%83%D0%BF%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:гречневая-крупа</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/malt-flour\" class=\"tag known\" rel=\"nofollow\">Malt flour</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sesame-et-sesame-noir\" class=\"tag user_defined\" rel=\"nofollow\">fr:sesame-et-sesame-noir</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/feta\" class=\"tag known\" rel=\"nofollow\">Feta</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/creme-fraiche\" class=\"tag known\" rel=\"nofollow\">Crème fraîche</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-cocoa-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural cocoa flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-fraiche-6-1-poireaux\" class=\"tag user_defined\" rel=\"nofollow\">fr:creme-fraiche-6-1-poireaux</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/raising-agent-e450\" class=\"tag user_defined\" rel=\"nofollow\">raising-agent-e450</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:1-bourbon-vanillepulver\" class=\"tag user_defined\" rel=\"nofollow\">de:1-bourbon-vanillepulver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/do-not-use-if-printed-inner-seal-imprinted-with-sealed-for-your-protection-is-broken-and-missing\" class=\"tag user_defined\" rel=\"nofollow\">do-not-use-if-printed-inner-seal-imprinted-with-sealed-for-your-protection-is-broken-and-missing</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:2000-kal-hergestelt-in-italien-fu-egidie-galbani-sr\" class=\"tag user_defined\" rel=\"nofollow\">de:2000-kal-hergestelt-in-italien-fu-egidie-galbani-sr</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:aromes-dont-arome-de-peche-de-vigne\" class=\"tag user_defined\" rel=\"nofollow\">fr:aromes-dont-arome-de-peche-de-vigne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pologne\" class=\"tag user_defined\" rel=\"nofollow\">fr:pologne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ingredients-riz-blanc-precuit\" class=\"tag user_defined\" rel=\"nofollow\">fr:ingredients-riz-blanc-precuit</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:blanc-d-oeuf-frais\" class=\"tag known\" rel=\"nofollow\">fr:Blanc d'œuf frais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:natriumnitriit\" class=\"tag user_defined\" rel=\"nofollow\">de:natriumnitriit</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:L%C3%A5gpast%C3%B6riserad%20mj%C3%B6lk\" class=\"tag known\" rel=\"nofollow\">sv:Lågpastöriserad mjölk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dl-alpha-tocopheryl-acetate\" class=\"tag known\" rel=\"nofollow\">DL-alpha tocopheryl acetate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/marigold\" class=\"tag known\" rel=\"nofollow\">Marigold</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:marillenp%C3%BCree\" class=\"tag user_defined\" rel=\"nofollow\">de:marillenpüree</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:zer-dulce-praf\" class=\"tag user_defined\" rel=\"nofollow\">ro:zer-dulce-praf</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:contient-au-minimum-49-d-huile-de-colza\" class=\"tag user_defined\" rel=\"nofollow\">fr:contient-au-minimum-49-d-huile-de-colza</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rusk\" class=\"tag known\" rel=\"nofollow\">Rusk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:vekaopulver-sd-inneh%C3%A5llet-sjunker-hop-under-transport\" class=\"tag user_defined\" rel=\"nofollow\">nb:vekaopulver-sd-innehållet-sjunker-hop-under-transport</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pl:imbir-w-proszku-czerwona-papryka-chili-mielona\" class=\"tag user_defined\" rel=\"nofollow\">pl:imbir-w-proszku-czerwona-papryka-chili-mielona</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/salz\" class=\"tag user_defined\" rel=\"nofollow\">salz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sauce-aux-epices\" class=\"tag user_defined\" rel=\"nofollow\">fr:sauce-aux-epices</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melange-de-pates-alimentaires-cuisinees\" class=\"tag known\" rel=\"nofollow\">fr:Mélange de pâtes alimentaires cuisinées</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:viande-de-poulet-rotie\" class=\"tag known\" rel=\"nofollow\">fr:Viande de poulet rôtie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:interieur-cone\" class=\"tag known\" rel=\"nofollow\">fr:Intérieur cône</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:verdickungmittel-johannisbrotkernmehl-und-pektin\" class=\"tag user_defined\" rel=\"nofollow\">de:verdickungmittel-johannisbrotkernmehl-und-pektin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cod-liver\" class=\"tag known\" rel=\"nofollow\">Cod liver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:monodiglyceriden-van-vetzuren\" class=\"tag user_defined\" rel=\"nofollow\">nl:monodiglyceriden-van-vetzuren</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:5-de-vodka\" class=\"tag user_defined\" rel=\"nofollow\">fr:5-de-vodka</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:cu-con%C8%9Binut-sc%C4%83zut-de-gr%C4%83sime\" class=\"tag user_defined\" rel=\"nofollow\">ro:cu-conținut-scăzut-de-grăsime</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ingredients-100-jus-de-pomme\" class=\"tag user_defined\" rel=\"nofollow\">fr:ingredients-100-jus-de-pomme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vinaigre-de-vin-rouge-au-jus-de-framboise\" class=\"tag user_defined\" rel=\"nofollow\">fr:vinaigre-de-vin-rouge-au-jus-de-framboise</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:graines-de-tournesol-basilic\" class=\"tag user_defined\" rel=\"nofollow\">fr:graines-de-tournesol-basilic</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:g-glucides-15\" class=\"tag user_defined\" rel=\"nofollow\">fr:g-glucides-15</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:un-peu-de-concombre-presse\" class=\"tag user_defined\" rel=\"nofollow\">fr:un-peu-de-concombre-presse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:triphosphate-de-pentasodium\" class=\"tag user_defined\" rel=\"nofollow\">fr:triphosphate-de-pentasodium</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:voir-sur-le-bouchon\" class=\"tag user_defined\" rel=\"nofollow\">fr:voir-sur-le-bouchon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dietary-supplement\" class=\"tag user_defined\" rel=\"nofollow\">dietary-supplement</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%BE%D0%BB%D0%BE%D0%BA%D0%BE-%D0%B2%D0%BE%D1%81%D1%81%D1%82%D0%B0%D0%BD%D0%BE%D0%BB%D0%B5%D0%BD%D0%BD%D0%BE%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:молоко-восстаноленное</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/less-than-2-of\" class=\"tag user_defined\" rel=\"nofollow\">less-than-2-of</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:os-et-extrait-de-veau\" class=\"tag user_defined\" rel=\"nofollow\">fr:os-et-extrait-de-veau</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dried-vegetables\" class=\"tag known\" rel=\"nofollow\">Dried vegetables</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-concentre-de-fruits-de-la-passion\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-concentre-de-fruits-de-la-passion</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/min\" class=\"tag user_defined\" rel=\"nofollow\">min</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/phylloquinone\" class=\"tag known\" rel=\"nofollow\">Phylloquinone</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/voir-le-fard-j-ten\" class=\"tag user_defined\" rel=\"nofollow\">voir-le-fard-j-ten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/deep-sea-shrimp\" class=\"tag known\" rel=\"nofollow\">Deep-sea shrimp</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cookie-pepite-de-chocolat\" class=\"tag user_defined\" rel=\"nofollow\">fr:cookie-pepite-de-chocolat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cloruro-di-potassio\" class=\"tag user_defined\" rel=\"nofollow\">fr:cloruro-di-potassio</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:chair-et-puree-de-tomates-pelees\" class=\"tag user_defined\" rel=\"nofollow\">fr:chair-et-puree-de-tomates-pelees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:figues-violettes\" class=\"tag user_defined\" rel=\"nofollow\">fr:figues-violettes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ferments-lactiques-dont-lb\" class=\"tag user_defined\" rel=\"nofollow\">fr:ferments-lactiques-dont-lb</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:anchois-engraulis-encrasicolus\" class=\"tag user_defined\" rel=\"nofollow\">fr:anchois-engraulis-encrasicolus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%B0%D0%B9%D1%80%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:сайра</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:naturhopfendolden\" class=\"tag user_defined\" rel=\"nofollow\">de:naturhopfendolden</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:distribue-en-fra-e-par-maxi-sec\" class=\"tag user_defined\" rel=\"nofollow\">fr:distribue-en-fra-e-par-maxi-sec</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/barn-eggs\" class=\"tag known\" rel=\"nofollow\">Barn eggs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E6%B2%B9%E6%8F%9A%E3%81%92%E3%82%81%E3%82%93%EF%BC%88%E5%B0%8F%E9%BA%A6%E7%B2%89\" class=\"tag user_defined\" rel=\"nofollow\">ja:油揚げめん（小麦粉</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soup-mix\" class=\"tag user_defined\" rel=\"nofollow\">soup-mix</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mildges%C3%A4uerte-butter\" class=\"tag user_defined\" rel=\"nofollow\">de:mildgesäuerte-butter</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:unt-de-cacao-10\" class=\"tag user_defined\" rel=\"nofollow\">ro:unt-de-cacao-10</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:arome-vanille\" class=\"tag user_defined\" rel=\"nofollow\">it:arome-vanille</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/96\" class=\"tag user_defined\" rel=\"nofollow\">96</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:puree-et-pulpe-de-tomates\" class=\"tag known\" rel=\"nofollow\">fr:Purée et pulpe de tomates</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/arabische-gomt-tragantgom\" class=\"tag user_defined\" rel=\"nofollow\">arabische-gomt-tragantgom</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:couleur\" class=\"tag user_defined\" rel=\"nofollow\">fr:couleur</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/huile-vegetale\" class=\"tag user_defined\" rel=\"nofollow\">huile-vegetale</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sorbitols-et-glycerol\" class=\"tag known\" rel=\"nofollow\">fr:Sorbitols et glycérol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pulpe-de-pomme\" class=\"tag known\" rel=\"nofollow\">fr:Pulpe de pomme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:sfoglia\" class=\"tag user_defined\" rel=\"nofollow\">it:sfoglia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beel-stock\" class=\"tag user_defined\" rel=\"nofollow\">beel-stock</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whiskey\" class=\"tag known\" rel=\"nofollow\">Whiskey</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:nitrite-de-sodium-epaississant\" class=\"tag user_defined\" rel=\"nofollow\">fr:nitrite-de-sodium-epaississant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:farbstoff-ammonsul%EF%AC%81t-zuckerkul%C3%B6r\" class=\"tag user_defined\" rel=\"nofollow\">de:farbstoff-ammonsulﬁt-zuckerkulör</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/horse\" class=\"tag known\" rel=\"nofollow\">Horse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:tepert%C5%91\" class=\"tag user_defined\" rel=\"nofollow\">hu:tepertő</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/prunes-from-agen\" class=\"tag known\" rel=\"nofollow\">Prunes from Agen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bergamotaroma\" class=\"tag user_defined\" rel=\"nofollow\">bergamotaroma</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/low-fat-yogurt\" class=\"tag known\" rel=\"nofollow\">Low fat yogurt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-tarragon-flavouring\" class=\"tag known\" rel=\"nofollow\">Natural tarragon flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:encre-de-seiche\" class=\"tag user_defined\" rel=\"nofollow\">fr:encre-de-seiche</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E6%8A%97%E6%B0%A7%E5%8C%96%E5%8A%91\" class=\"tag user_defined\" rel=\"nofollow\">zh:抗氧化劑</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:del-peso-dichiarato\" class=\"tag user_defined\" rel=\"nofollow\">it:del-peso-dichiarato</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e228\" class=\"tag known\" rel=\"nofollow\">E228</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:salsa-rosa\" class=\"tag user_defined\" rel=\"nofollow\">it:salsa-rosa</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:raisins-sultana\" class=\"tag user_defined\" rel=\"nofollow\">fr:raisins-sultana</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:agen%C8%9Bi-de-cre%C8%99tere\" class=\"tag user_defined\" rel=\"nofollow\">ro:agenți-de-creștere</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/black-kalonji-seed\" class=\"tag user_defined\" rel=\"nofollow\">black-kalonji-seed</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:pectine\" class=\"tag user_defined\" rel=\"nofollow\">ro:pectine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:r%C3%A4uchertofu\" class=\"tag user_defined\" rel=\"nofollow\">de:räuchertofu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:protein%C4%83-animal%C4%83-din-porc\" class=\"tag user_defined\" rel=\"nofollow\">ro:proteină-animală-din-porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:crema-di-latte-pastorizzata\" class=\"tag user_defined\" rel=\"nofollow\">fr:crema-di-latte-pastorizzata</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/may-contain-peut-contenir\" class=\"tag user_defined\" rel=\"nofollow\">may-contain-peut-contenir</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrogen-baking-agent-sodium-carbonate\" class=\"tag user_defined\" rel=\"nofollow\">hydrogen-baking-agent-sodium-carbonate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BA%D0%B0%D0%BF%D1%83%D1%81%D1%82%D0%B0-%D0%BC%D0%BE%D1%80%D1%81%D0%BA%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:капуста-морская</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fume-naturellement-au-bois\" class=\"tag user_defined\" rel=\"nofollow\">fr:fume-naturellement-au-bois</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:entialten\" class=\"tag user_defined\" rel=\"nofollow\">de:entialten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n";

    public static String split14 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ingredients-viande-de-boeuf\" class=\"tag user_defined\" rel=\"nofollow\">fr:ingredients-viande-de-boeuf</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:s%C3%BCbmolkenpulver\" class=\"tag user_defined\" rel=\"nofollow\">de:sübmolkenpulver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:un-arome-naturel-de-fromage-dans-les-cubes-chevre\" class=\"tag user_defined\" rel=\"nofollow\">fr:un-arome-naturel-de-fromage-dans-les-cubes-chevre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E9%BA%A5%E8%8A%BD%E7%B3%8A%E7%B2%BE\" class=\"tag user_defined\" rel=\"nofollow\">zh:麥芽糊精</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vert\" class=\"tag user_defined\" rel=\"nofollow\">fr:vert</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:james-s-gate\" class=\"tag user_defined\" rel=\"nofollow\">fr:james-s-gate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:emulgator-sonnenblumen-lecithine\" class=\"tag user_defined\" rel=\"nofollow\">de:emulgator-sonnenblumen-lecithine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:21-raisins-blancs\" class=\"tag user_defined\" rel=\"nofollow\">fr:21-raisins-blancs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-complete-de-segle\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-complete-de-segle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:tapioca\" class=\"tag user_defined\" rel=\"nofollow\">ro:tapioca</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:dextrose\" class=\"tag user_defined\" rel=\"nofollow\">it:dextrose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:aromi\" class=\"tag user_defined\" rel=\"nofollow\">fr:aromi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/smoked-salt\" class=\"tag known\" rel=\"nofollow\">Smoked salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sirop-de-fructose-de-mais\" class=\"tag user_defined\" rel=\"nofollow\">fr:sirop-de-fructose-de-mais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-de-cookie\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-de-cookie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/canola-in-varying-proportions\" class=\"tag user_defined\" rel=\"nofollow\">canola-in-varying-proportions</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:viande-et-gras-de-porc\" class=\"tag known\" rel=\"nofollow\">fr:Viande et gras de porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:lapte-de-vaca-pasteurizat\" class=\"tag user_defined\" rel=\"nofollow\">ro:lapte-de-vaca-pasteurizat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e540\" class=\"tag known\" rel=\"nofollow\">E540</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cal-100\" class=\"tag user_defined\" rel=\"nofollow\">fr:cal-100</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:wasser-sojasauce\" class=\"tag user_defined\" rel=\"nofollow\">de:wasser-sojasauce</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:edamer-40-fett-i\" class=\"tag user_defined\" rel=\"nofollow\">de:edamer-40-fett-i</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:f%C4%83in%C4%83-alb%C4%83-de-gr%C3%A2u-650\" class=\"tag user_defined\" rel=\"nofollow\">ro:făină-albă-de-grâu-650</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:agent-epaissisants\" class=\"tag user_defined\" rel=\"nofollow\">fr:agent-epaissisants</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/diglycerides-of-fatty-acids\" class=\"tag user_defined\" rel=\"nofollow\">diglycerides-of-fatty-acids</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:agen%C8%9Bi-de-af%C3%A2nare\" class=\"tag user_defined\" rel=\"nofollow\">ro:agenți-de-afânare</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/and-yeast\" class=\"tag user_defined\" rel=\"nofollow\">and-yeast</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:amidon-content\" class=\"tag user_defined\" rel=\"nofollow\">fr:amidon-content</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:fosfa%C8%9Bi-de-potasiu\" class=\"tag user_defined\" rel=\"nofollow\">ro:fosfați-de-potasiu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:geliermitteln\" class=\"tag user_defined\" rel=\"nofollow\">de:geliermitteln</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gr%C3%BCner-mateextrakt\" class=\"tag user_defined\" rel=\"nofollow\">de:grüner-mateextrakt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e341iii\" class=\"tag known\" rel=\"nofollow\">E341iii</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/collegno\" class=\"tag user_defined\" rel=\"nofollow\">collegno</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pommes-de-terre-du-val-de-loire\" class=\"tag user_defined\" rel=\"nofollow\">fr:pommes-de-terre-du-val-de-loire</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/the-equivalent-of-426ml-of-fresh-liquid-milk-in-every-227g-of-milk-chocolate\" class=\"tag user_defined\" rel=\"nofollow\">the-equivalent-of-426ml-of-fresh-liquid-milk-in-every-227g-of-milk-chocolate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:rocamadour\" class=\"tag user_defined\" rel=\"nofollow\">fr:rocamadour</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:salade-verte\" class=\"tag user_defined\" rel=\"nofollow\">fr:salade-verte</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/palm-vegetable-oil\" class=\"tag user_defined\" rel=\"nofollow\">palm-vegetable-oil</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:2-raisins-presses\" class=\"tag user_defined\" rel=\"nofollow\">fr:2-raisins-presses</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:gabona%C5%91rlem%C3%A9nyek\" class=\"tag user_defined\" rel=\"nofollow\">hu:gabonaőrlemények</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:acido-iattico\" class=\"tag user_defined\" rel=\"nofollow\">it:acido-iattico</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:sul-prodotto-finito\" class=\"tag user_defined\" rel=\"nofollow\">it:sul-prodotto-finito</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miels-d-acacia-originaires-et-non-originaires-de-l-ue\" class=\"tag user_defined\" rel=\"nofollow\">fr:miels-d-acacia-originaires-et-non-originaires-de-l-ue</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/skimmed-cocoa-powder\" class=\"tag known\" rel=\"nofollow\">Skimmed cocoa powder</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bifidobacterium-lactis\" class=\"tag known\" rel=\"nofollow\">Bifidobacterium lactis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/actic-acid\" class=\"tag user_defined\" rel=\"nofollow\">actic-acid</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%8D%D0%BA%D1%81%D1%82%D1%80%D0%B0%D0%BA%D1%82-%D0%BF%D0%B5%D1%80%D1%86%D0%B0-%D1%87%D0%B5%D1%80%D0%BD%D0%BE%D0%B3%D0%BE\" class=\"tag user_defined\" rel=\"nofollow\">ru:экстракт-перца-черного</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:e133\" class=\"tag user_defined\" rel=\"nofollow\">ru:e133</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/caramel-flavouring\" class=\"tag known\" rel=\"nofollow\">Caramel flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:foule-de-manioc\" class=\"tag user_defined\" rel=\"nofollow\">fr:foule-de-manioc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:164-kal-bel-4bis-7-mindestens-haltbar-bis-refereromenge-fr-einen-dutscnittichen-siehe-oberseite\" class=\"tag user_defined\" rel=\"nofollow\">de:164-kal-bel-4bis-7-mindestens-haltbar-bis-refereromenge-fr-einen-dutscnittichen-siehe-oberseite</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e1441\" class=\"tag known\" rel=\"nofollow\">E1441</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:aromi\" class=\"tag user_defined\" rel=\"nofollow\">nb:aromi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:b3\" class=\"tag user_defined\" rel=\"nofollow\">fr:b3</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:royaume-uni\" class=\"tag user_defined\" rel=\"nofollow\">fr:royaume-uni</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jeunes-pousses\" class=\"tag user_defined\" rel=\"nofollow\">fr:jeunes-pousses</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:semoule-semi-complete-de-ble-dur\" class=\"tag user_defined\" rel=\"nofollow\">fr:semoule-semi-complete-de-ble-dur</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:weinbranntweinessig\" class=\"tag user_defined\" rel=\"nofollow\">de:weinbranntweinessig</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bitter-almond\" class=\"tag known\" rel=\"nofollow\">Bitter almond</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:ryp%C3%A4lesokeri\" class=\"tag user_defined\" rel=\"nofollow\">nb:rypälesokeri</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bamboo-shoos\" class=\"tag user_defined\" rel=\"nofollow\">bamboo-shoos</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sans-sucres-ajoutes-conformement-a-la\" class=\"tag user_defined\" rel=\"nofollow\">fr:sans-sucres-ajoutes-conformement-a-la</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:verdickungsmtel\" class=\"tag user_defined\" rel=\"nofollow\">de:verdickungsmtel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/citrus-fruit-extract\" class=\"tag known\" rel=\"nofollow\">Citrus fruit extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:g-jauhe-painuu-kasaan-kujetuksen-aikana\" class=\"tag user_defined\" rel=\"nofollow\">nb:g-jauhe-painuu-kasaan-kujetuksen-aikana</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:polyglycerides-d-acides-gras\" class=\"tag user_defined\" rel=\"nofollow\">fr:polyglycerides-d-acides-gras</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pate-de-mure\" class=\"tag user_defined\" rel=\"nofollow\">fr:pate-de-mure</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sesamzaad\" class=\"tag user_defined\" rel=\"nofollow\">sesamzaad</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:levain-de-seigle-deshydrate-desactive\" class=\"tag user_defined\" rel=\"nofollow\">fr:levain-de-seigle-deshydrate-desactive</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:n20\" class=\"tag user_defined\" rel=\"nofollow\">fr:n20</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sel-marin-gris-alimentaire\" class=\"tag user_defined\" rel=\"nofollow\">fr:sel-marin-gris-alimentaire</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/apple-filling\" class=\"tag user_defined\" rel=\"nofollow\">apple-filling</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lasagne\" class=\"tag known\" rel=\"nofollow\">Lasagne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/their-products\" class=\"tag user_defined\" rel=\"nofollow\">their-products</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pickles-flavour\" class=\"tag user_defined\" rel=\"nofollow\">pickles-flavour</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:fibr%C4%83-vegetal%C4%83-de-bambus\" class=\"tag user_defined\" rel=\"nofollow\">ro:fibră-vegetală-de-bambus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lltte-qae-tica-n\" class=\"tag user_defined\" rel=\"nofollow\">fr:lltte-qae-tica-n</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:poulet-traite-en-salaison\" class=\"tag known\" rel=\"nofollow\">fr:Poulet traité en salaison</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:epaissisants\" class=\"tag user_defined\" rel=\"nofollow\">fr:epaissisants</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:bestreuung-in-ver%C3%A4nderlichen-gewichtsanteilen\" class=\"tag user_defined\" rel=\"nofollow\">de:bestreuung-in-veränderlichen-gewichtsanteilen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pimenton-de-murcia-dop-et-pimenton-de-la-vera-dop\" class=\"tag user_defined\" rel=\"nofollow\">fr:pimenton-de-murcia-dop-et-pimenton-de-la-vera-dop</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:billettes-de-riz-soufflees\" class=\"tag user_defined\" rel=\"nofollow\">fr:billettes-de-riz-soufflees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/finegrained-salt\" class=\"tag known\" rel=\"nofollow\">Finegrained salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:viande-de-porc-traitee-en-salaison\" class=\"tag known\" rel=\"nofollow\">fr:Viande de porc traitée en salaison</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:plata-base-de-haricots-aux-tomates-et-piments-fumes-0-lngredienetomates\" class=\"tag user_defined\" rel=\"nofollow\">fr:plata-base-de-haricots-aux-tomates-et-piments-fumes-0-lngredienetomates</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fruit-and-plant-concentrates\" class=\"tag known\" rel=\"nofollow\">Fruit and plant concentrates</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E9%B9%BF%E8%A7%92%E8%8F%9C%E8%86%A0\" class=\"tag user_defined\" rel=\"nofollow\">zh:鹿角菜膠</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:pane-all-avena\" class=\"tag user_defined\" rel=\"nofollow\">it:pane-all-avena</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-lacto-fermentes-de\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-lacto-fermentes-de</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/butteroil-from-milk\" class=\"tag user_defined\" rel=\"nofollow\">butteroil-from-milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/selenium\" class=\"tag known\" rel=\"nofollow\">Selenium</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:el\" class=\"tag user_defined\" rel=\"nofollow\">fr:el</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fonds-de-tarte-et-crumbles\" class=\"tag user_defined\" rel=\"nofollow\">fr:fonds-de-tarte-et-crumbles</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:med-emulgeringsmedel-sojalecitin\" class=\"tag user_defined\" rel=\"nofollow\">sv:med-emulgeringsmedel-sojalecitin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coppa\" class=\"tag known\" rel=\"nofollow\">Coppa</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whey-milk\" class=\"tag user_defined\" rel=\"nofollow\">whey-milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-deble-poudre-de-lact-entier\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-deble-poudre-de-lact-entier</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:marinade-barbecue\" class=\"tag known\" rel=\"nofollow\">fr:Marinade barbecue</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kase-brotzeitbei%C3%9Fer-werden-aus-111-g-schweinefleisch-und-14g-emmentaler-hergestellt\" class=\"tag user_defined\" rel=\"nofollow\">de:kase-brotzeitbeißer-werden-aus-111-g-schweinefleisch-und-14g-emmentaler-hergestellt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:rouge\" class=\"tag user_defined\" rel=\"nofollow\">fr:rouge</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:dont-jambon\" class=\"tag user_defined\" rel=\"nofollow\">de:dont-jambon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:rote-bete-saft-1\" class=\"tag user_defined\" rel=\"nofollow\">de:rote-bete-saft-1</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vit\" class=\"tag user_defined\" rel=\"nofollow\">vit</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:cartofi-pudr%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:cartofi-pudră</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:l-histidin\" class=\"tag user_defined\" rel=\"nofollow\">de:l-histidin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:infusions\" class=\"tag user_defined\" rel=\"nofollow\">fr:infusions</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:bonbon-au-cacao-maigre\" class=\"tag known\" rel=\"nofollow\">fr:Bonbon au cacao maigre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vinaigre-de-vin-rouge-eleve-en-fut-de-chene\" class=\"tag user_defined\" rel=\"nofollow\">fr:vinaigre-de-vin-rouge-eleve-en-fut-de-chene</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-bovin\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-bovin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:porto-ruby\" class=\"tag user_defined\" rel=\"nofollow\">fr:porto-ruby</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-de-brebis-et-chevre-pasteurise\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-de-brebis-et-chevre-pasteurise</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E8%AA%BF%E5%91%B3%E7%B2%89\" class=\"tag user_defined\" rel=\"nofollow\">zh:調味粉</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:iagredients\" class=\"tag user_defined\" rel=\"nofollow\">fr:iagredients</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/american-lobster\" class=\"tag known\" rel=\"nofollow\">American lobster</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cuisse-et-filet-de-poulet\" class=\"tag user_defined\" rel=\"nofollow\">fr:cuisse-et-filet-de-poulet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tomatenpaprikastreifen\" class=\"tag user_defined\" rel=\"nofollow\">de:tomatenpaprikastreifen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vanillie\" class=\"tag user_defined\" rel=\"nofollow\">fr:vanillie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zout\" class=\"tag user_defined\" rel=\"nofollow\">zout</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:oeufs-extra-frais\" class=\"tag known\" rel=\"nofollow\">fr:Œufs extra-frais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:irlandia\" class=\"tag user_defined\" rel=\"nofollow\">fr:irlandia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cafe-moulu-en-dosettes-individuelles-souples\" class=\"tag user_defined\" rel=\"nofollow\">fr:cafe-moulu-en-dosettes-individuelles-souples</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%BE%D0%BB%D0%BE%D0%BA%D0%BE%D1%81%D0%B2%D1%91%D1%80%D1%82%D1%8B%D0%B2%D0%B0%D1%8E%D1%89%D0%B5%D0%B3%D0%BE-%D1%84%D0%B5%D1%80%D0%BC%D0%B5%D0%BD%D1%82%D0%B0-%D0%B6%D0%B8%D0%B2%D0%BE%D1%82%D0%BD%D0%BE%D0%B3%D0%BE-%D0%BF%D1%80%D0%BE%D0%B8%D1%81%D1%85%D0%BE%D0%B6%D0%B4%D0%B5%D0%BD%D0%B8%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:молокосвёртывающего-фермента-животного-происхождения</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-concentre-de-peche\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-concentre-de-peche</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:piper-alb-pudr%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">hu:piper-alb-pudră</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fromage-de-chevre-affine\" class=\"tag user_defined\" rel=\"nofollow\">fr:fromage-de-chevre-affine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sale-a\" class=\"tag user_defined\" rel=\"nofollow\">fr:sale-a</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:puree-de-tomates-reconstituee\" class=\"tag known\" rel=\"nofollow\">fr:Purée de tomates reconstituée</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mate\" class=\"tag known\" rel=\"nofollow\">Mate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/protein-blend\" class=\"tag user_defined\" rel=\"nofollow\">protein-blend</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E5%A4%A7%E8%B1%86%E9%A3%9F%E7%89%A9%E7%B9%8A%E7%B6%AD%EF%BC%89\" class=\"tag user_defined\" rel=\"nofollow\">ja:大豆食物繊維）</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/kelel\" class=\"tag user_defined\" rel=\"nofollow\">kelel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:erfrischungsgetr%C3%A4nk-mit-citrusgeschmack\" class=\"tag user_defined\" rel=\"nofollow\">de:erfrischungsgetränk-mit-citrusgeschmack</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pain-moelleux-garni-d-une-saucisse-de-strasbourg-accompagnee-d-oignons-frits\" class=\"tag user_defined\" rel=\"nofollow\">fr:pain-moelleux-garni-d-une-saucisse-de-strasbourg-accompagnee-d-oignons-frits</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:nativ\" class=\"tag user_defined\" rel=\"nofollow\">de:nativ</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:via-favie-gioia\" class=\"tag user_defined\" rel=\"nofollow\">de:via-favie-gioia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/epaissjssants\" class=\"tag user_defined\" rel=\"nofollow\">epaissjssants</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rose-wine\" class=\"tag known\" rel=\"nofollow\">Rosé wine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%8F%D0%B4%D1%80%D0%B0-%D1%81%D0%B5%D0%BC%D1%8F%D0%BD-%D0%BF%D0%BE%D0%B4%D1%81%D0%BE%D0%BB%D0%BD%D0%B5%D1%87%D0%BD%D0%B8%D0%BA%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:ядра-семян-подсолнечника</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-kefir\" class=\"tag known\" rel=\"nofollow\">Whole kefir</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pl:suszona-kolendra\" class=\"tag user_defined\" rel=\"nofollow\">pl:suszona-kolendra</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beef-extract\" class=\"tag known\" rel=\"nofollow\">Beef extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:monophosphate-de-calcium\" class=\"tag user_defined\" rel=\"nofollow\">fr:monophosphate-de-calcium</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:arome-de-malte-d-orge\" class=\"tag user_defined\" rel=\"nofollow\">fr:arome-de-malte-d-orge</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/buttermilk-powder-from-milk\" class=\"tag user_defined\" rel=\"nofollow\">buttermilk-powder-from-milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:billes-de-cereales-croustillantes\" class=\"tag user_defined\" rel=\"nofollow\">fr:billes-de-cereales-croustillantes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:dinatriumguanyat\" class=\"tag user_defined\" rel=\"nofollow\">de:dinatriumguanyat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:wassel\" class=\"tag user_defined\" rel=\"nofollow\">de:wassel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pink-salmon\" class=\"tag known\" rel=\"nofollow\">Pink salmon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pectine-de-fruits-jus-de-citron-concentre\" class=\"tag user_defined\" rel=\"nofollow\">fr:pectine-de-fruits-jus-de-citron-concentre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:piments-mixndes\" class=\"tag user_defined\" rel=\"nofollow\">fr:piments-mixndes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:non-reference-avant-ie\" class=\"tag user_defined\" rel=\"nofollow\">fr:non-reference-avant-ie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D1%83%D0%BA%D0%B0-%D0%BF%D1%88%D0%B5%D0%BD%D0%B8%D1%87%D0%BD%D0%B0%D1%8F-%D0%BE-%D0%BD%D0%B0%D0%B7%D0%BD%D0%B0%D1%87%D0%B5%D0%BD%D0%B8%D1%8F-%D1%82%D0%B8%D0%BF%D0%B0-%D0%BC55-23\" class=\"tag user_defined\" rel=\"nofollow\">ru:мука-пшеничная-о-назначения-типа-м55-23</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:chaluts\" class=\"tag user_defined\" rel=\"nofollow\">fr:chaluts</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-concentre-de-pommes\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-concentre-de-pommes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fromage-italien\" class=\"tag user_defined\" rel=\"nofollow\">fr:fromage-italien</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/farine-de-mais\" class=\"tag user_defined\" rel=\"nofollow\">farine-de-mais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ham-costs-of-label-rouge-pork\" class=\"tag user_defined\" rel=\"nofollow\">ham-costs-of-label-rouge-pork</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:succhi-e-puree-di-frutta\" class=\"tag user_defined\" rel=\"nofollow\">it:succhi-e-puree-di-frutta</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:chili-paprika\" class=\"tag user_defined\" rel=\"nofollow\">hu:chili-paprika</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e155\" class=\"tag known\" rel=\"nofollow\">E155</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:contient-des-ingredients-du-ble-et-de-l-orge\" class=\"tag user_defined\" rel=\"nofollow\">fr:contient-des-ingredients-du-ble-et-de-l-orge</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huilde-de-tournesol\" class=\"tag user_defined\" rel=\"nofollow\">fr:huilde-de-tournesol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:infusion-de-the-vert-a-base-d-infusion-forte\" class=\"tag user_defined\" rel=\"nofollow\">fr:infusion-de-the-vert-a-base-d-infusion-forte</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:legume-deshidratate\" class=\"tag user_defined\" rel=\"nofollow\">ro:legume-deshidratate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/the-ingredients-highlighted-can-provoke-gras-reactions-in-allergic-and-intolerant-people\" class=\"tag user_defined\" rel=\"nofollow\">the-ingredients-highlighted-can-provoke-gras-reactions-in-allergic-and-intolerant-people</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cheese-flavouring\" class=\"tag known\" rel=\"nofollow\">Cheese flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-tea\" class=\"tag user_defined\" rel=\"nofollow\">white-tea</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:aus-mitch\" class=\"tag user_defined\" rel=\"nofollow\">de:aus-mitch</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:graisse-de-porc\" class=\"tag known\" rel=\"nofollow\">fr:Graisse de porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/processed-in-citric-acid-and-sodium-benzoate\" class=\"tag user_defined\" rel=\"nofollow\">processed-in-citric-acid-and-sodium-benzoate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mo-monteux-vaucluse-france-www\" class=\"tag user_defined\" rel=\"nofollow\">fr:mo-monteux-vaucluse-france-www</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/farine-de-ble\" class=\"tag user_defined\" rel=\"nofollow\">farine-de-ble</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-de-seigile\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-de-seigile</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:90-mm-cat-1\" class=\"tag user_defined\" rel=\"nofollow\">fr:90-mm-cat-1</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e1101\" class=\"tag known\" rel=\"nofollow\">E1101</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BE%D0%B2%D0%B0%D1%80%D0%B5%D0%BD%D0%BD%D0%B0%D1%8F-%D0%BB%D1%8F-%D1%81%D1%8B%D1%80%D0%B0-%D1%81-%D0%B2%D0%B5%D1%82%D1%87%D0%B8%D0%BD%D0%BE%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:оваренная-ля-сыра-с-ветчиной</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/koolhydraten-970-dont-sucres\" class=\"tag user_defined\" rel=\"nofollow\">koolhydraten-970-dont-sucres</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/synthetic-beeswax\" class=\"tag user_defined\" rel=\"nofollow\">synthetic-beeswax</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sauce-soja-sans-gluten\" class=\"tag user_defined\" rel=\"nofollow\">fr:sauce-soja-sans-gluten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:sui-prodotto-finito\" class=\"tag user_defined\" rel=\"nofollow\">it:sui-prodotto-finito</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:conjonctif-de-canard\" class=\"tag user_defined\" rel=\"nofollow\">fr:conjonctif-de-canard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:famigliola-gialla\" class=\"tag user_defined\" rel=\"nofollow\">it:famigliola-gialla</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pl:kluski-ry%C5%BCowe\" class=\"tag user_defined\" rel=\"nofollow\">pl:kluski-ryżowe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:marrube\" class=\"tag user_defined\" rel=\"nofollow\">fr:marrube</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:jalapeno-chili\" class=\"tag user_defined\" rel=\"nofollow\">de:jalapeno-chili</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:viande-e-boeuf\" class=\"tag user_defined\" rel=\"nofollow\">fr:viande-e-boeuf</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:a-la-mise-en-oeuvre\" class=\"tag user_defined\" rel=\"nofollow\">fr:a-la-mise-en-oeuvre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sungold-new-zeoland\" class=\"tag user_defined\" rel=\"nofollow\">fr:sungold-new-zeoland</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fried-onion\" class=\"tag known\" rel=\"nofollow\">Fried onion</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:rahm-und-molkenrahm\" class=\"tag user_defined\" rel=\"nofollow\">de:rahm-und-molkenrahm</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/kefir\" class=\"tag known\" rel=\"nofollow\">Kefir</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:ricotta-k%C3%A4se\" class=\"tag user_defined\" rel=\"nofollow\">de:ricotta-käse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:carbonatesd-ammonium\" class=\"tag user_defined\" rel=\"nofollow\">fr:carbonatesd-ammonium</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ch\" class=\"tag user_defined\" rel=\"nofollow\">fr:ch</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:bio-paprika\" class=\"tag user_defined\" rel=\"nofollow\">nl:bio-paprika</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/crocant\" class=\"tag known\" rel=\"nofollow\">Crocant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:poulet-separe-desossee-mecaniquement\" class=\"tag user_defined\" rel=\"nofollow\">fr:poulet-separe-desossee-mecaniquement</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:lactoserum-en-poudre\" class=\"tag user_defined\" rel=\"nofollow\">it:lactoserum-en-poudre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:liquide-de-couverture\" class=\"tag user_defined\" rel=\"nofollow\">fr:liquide-de-couverture</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/almond-flour\" class=\"tag known\" rel=\"nofollow\">Almond flour</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:epautre-souffle\" class=\"tag user_defined\" rel=\"nofollow\">fr:epautre-souffle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:contient-des-sucres-naturellement-presents-idees-recettes\" class=\"tag user_defined\" rel=\"nofollow\">fr:contient-des-sucres-naturellement-presents-idees-recettes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/valeyr-nutritive-movepne-pat\" class=\"tag user_defined\" rel=\"nofollow\">valeyr-nutritive-movepne-pat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:boyau-comestible-de-porc\" class=\"tag user_defined\" rel=\"nofollow\">fr:boyau-comestible-de-porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eclats-de-pistache-caramelisees\" class=\"tag user_defined\" rel=\"nofollow\">fr:eclats-de-pistache-caramelisees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:modifizierte-starke\" class=\"tag user_defined\" rel=\"nofollow\">de:modifizierte-starke</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/syrah\" class=\"tag known\" rel=\"nofollow\">Syrah</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:extract-de-%C8%9Belin%C4%83-%C8%99i-praz\" class=\"tag user_defined\" rel=\"nofollow\">ro:extract-de-țelină-și-praz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lecithine-de-soja\" class=\"tag user_defined\" rel=\"nofollow\">lecithine-de-soja</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:crevettes-decortiquees\" class=\"tag known\" rel=\"nofollow\">fr:Crevettes décortiquées</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:2-5-tansforme-de-mais\" class=\"tag user_defined\" rel=\"nofollow\">fr:2-5-tansforme-de-mais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/eau-de-source\" class=\"tag user_defined\" rel=\"nofollow\">eau-de-source</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:grappa\" class=\"tag user_defined\" rel=\"nofollow\">fr:grappa</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cow-s-pasteurized-milk\" class=\"tag user_defined\" rel=\"nofollow\">cow-s-pasteurized-milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:pflanzentette\" class=\"tag user_defined\" rel=\"nofollow\">de:pflanzentette</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:piri-piri-pfefferschoten\" class=\"tag user_defined\" rel=\"nofollow\">de:piri-piri-pfefferschoten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:agent-cremeux\" class=\"tag known\" rel=\"nofollow\">fr:Agent crémeux</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:jodiertes-speisezalz\" class=\"tag user_defined\" rel=\"nofollow\">de:jodiertes-speisezalz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/eqg\" class=\"tag user_defined\" rel=\"nofollow\">eqg</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/turmeric-powder\" class=\"tag known\" rel=\"nofollow\">Turmeric powder</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:aceite-de-semillas-y-oliva\" class=\"tag user_defined\" rel=\"nofollow\">es:aceite-de-semillas-y-oliva</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ce-produit-contient-60-de-pate-et-40-de-garniture\" class=\"tag user_defined\" rel=\"nofollow\">fr:ce-produit-contient-60-de-pate-et-40-de-garniture</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:fedtfattig-kakao\" class=\"tag user_defined\" rel=\"nofollow\">nb:fedtfattig-kakao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:poivron-bicolore-cal-70\" class=\"tag user_defined\" rel=\"nofollow\">fr:poivron-bicolore-cal-70</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:vollkornhaferflocken-kleinblatt\" class=\"tag user_defined\" rel=\"nofollow\">de:vollkornhaferflocken-kleinblatt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:25-a\" class=\"tag user_defined\" rel=\"nofollow\">fr:25-a</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:schafssaitling\" class=\"tag user_defined\" rel=\"nofollow\">de:schafssaitling</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wild-rocket\" class=\"tag known\" rel=\"nofollow\">Wild rocket</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/place-s-on-o-rack\" class=\"tag user_defined\" rel=\"nofollow\">place-s-on-o-rack</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/baby-chard\" class=\"tag user_defined\" rel=\"nofollow\">baby-chard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spices-and-spices-extracts\" class=\"tag known\" rel=\"nofollow\">Spices and spices extracts</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:molkeneiwei%C3%9Fk%C3%A4se-aus-pasteurisierter-molke\" class=\"tag user_defined\" rel=\"nofollow\">de:molkeneiweißkäse-aus-pasteurisierter-molke</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bran\" class=\"tag known\" rel=\"nofollow\">Bran</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n";

    public static String split15 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/roggenvolkornmehl\" class=\"tag user_defined\" rel=\"nofollow\">roggenvolkornmehl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gras-de-porc-francais\" class=\"tag user_defined\" rel=\"nofollow\">fr:gras-de-porc-francais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ei-50d\" class=\"tag user_defined\" rel=\"nofollow\">fr:ei-50d</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melange-cereales-fruits-rouges\" class=\"tag user_defined\" rel=\"nofollow\">fr:melange-cereales-fruits-rouges</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tef-f-ogts-et-gefere\" class=\"tag user_defined\" rel=\"nofollow\">fr:tef-f-ogts-et-gefere</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:molkefermenten\" class=\"tag user_defined\" rel=\"nofollow\">de:molkefermenten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lai-cru-entier-de-brebis\" class=\"tag user_defined\" rel=\"nofollow\">fr:lai-cru-entier-de-brebis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pork-belly\" class=\"tag known\" rel=\"nofollow\">Pork belly</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/algae-extract\" class=\"tag known\" rel=\"nofollow\">Algae extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/marc-de-bourgogne\" class=\"tag known\" rel=\"nofollow\">Marc de Bourgogne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D1%80%D0%BE%D1%82%D0%B5%D0%B0%D0%B7%D0%B0-%D0%B8-%D0%B0%D0%BB%D1%8C%D1%84%D0%B0-%D0%B0%D0%BC%D0%B8%D0%BB%D0%B0%D0%B7%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:протеаза-и-альфа-амилаза</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/marshmallow\" class=\"tag known\" rel=\"nofollow\">Marshmallow</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sauce-a-la-parisienne\" class=\"tag user_defined\" rel=\"nofollow\">fr:sauce-a-la-parisienne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/branntweinessig\" class=\"tag user_defined\" rel=\"nofollow\">branntweinessig</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:se-turmeric\" class=\"tag user_defined\" rel=\"nofollow\">fr:se-turmeric</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%82%B4%E3%83%9C%E3%82%A6\" class=\"tag user_defined\" rel=\"nofollow\">ja:ゴボウ</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sauce-d-assaisonnement-mixee\" class=\"tag user_defined\" rel=\"nofollow\">fr:sauce-d-assaisonnement-mixee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lime-juice-concentrate\" class=\"tag known\" rel=\"nofollow\">Lime juice concentrate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E7%A2%B3%E9%85%B8%E6%B0%AB%E9%88%89\" class=\"tag user_defined\" rel=\"nofollow\">zh:碳酸氫鈉</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:engelsk-sirap\" class=\"tag user_defined\" rel=\"nofollow\">sv:engelsk-sirap</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:d-elevage-en-plein-air\" class=\"tag known\" rel=\"nofollow\">fr:D'élevage en plein air</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:gr%C4%83sime-vegetal%C4%83-total-hidrogenat%C4%83-de-cocos\" class=\"tag user_defined\" rel=\"nofollow\">ro:grăsime-vegetală-total-hidrogenată-de-cocos</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:keta\" class=\"tag user_defined\" rel=\"nofollow\">fr:keta</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/unrefined-salt\" class=\"tag known\" rel=\"nofollow\">Unrefined salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/451\" class=\"tag user_defined\" rel=\"nofollow\">451</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bacon-and-egg-bites\" class=\"tag user_defined\" rel=\"nofollow\">bacon-and-egg-bites</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:du-sel-dans-les-cubes-chevre\" class=\"tag user_defined\" rel=\"nofollow\">fr:du-sel-dans-les-cubes-chevre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ferments-iactiques\" class=\"tag user_defined\" rel=\"nofollow\">fr:ferments-iactiques</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:coulis-de-tomates\" class=\"tag known\" rel=\"nofollow\">fr:Coulis de tomates</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:peche-en-pacifique-nord-est\" class=\"tag user_defined\" rel=\"nofollow\">fr:peche-en-pacifique-nord-est</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:dl-alpha-tocopherc\" class=\"tag user_defined\" rel=\"nofollow\">de:dl-alpha-tocopherc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-entier-pasteurise-de-nos-vaches\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-entier-pasteurise-de-nos-vaches</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:ciocolat%C4%83-am%C4%83ruie-8-%C3%AEn-crem%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:ciocolată-amăruie-8-în-cremă</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/onion-white-pepper\" class=\"tag user_defined\" rel=\"nofollow\">onion-white-pepper</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ceufs-de-lompe\" class=\"tag user_defined\" rel=\"nofollow\">fr:ceufs-de-lompe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/niacine\" class=\"tag user_defined\" rel=\"nofollow\">niacine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/black-tea-extract\" class=\"tag known\" rel=\"nofollow\">Black tea extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B3y%D0%B0%D1%80%D0%BE%D0%B2%D0%B0%D1%8F-%D0%BA%D0%B0%D0%BC%D0%B5%D0%B4%D1%8C\" class=\"tag user_defined\" rel=\"nofollow\">ru:гyаровая-камедь</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:indispensables-pour-lier-les-ingredients\" class=\"tag user_defined\" rel=\"nofollow\">fr:indispensables-pour-lier-les-ingredients</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:esteri-ai-acidului-acetic-cu-mono-si-digliceride\" class=\"tag user_defined\" rel=\"nofollow\">ro:esteri-ai-acidului-acetic-cu-mono-si-digliceride</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:o%C8%9Bet-de-alcool\" class=\"tag user_defined\" rel=\"nofollow\">hu:oțet-de-alcool</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/500\" class=\"tag user_defined\" rel=\"nofollow\">500</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:de-savoureux-petits-pois\" class=\"tag user_defined\" rel=\"nofollow\">fr:de-savoureux-petits-pois</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:%D8%A7%D9%84%D9%85%D9%83%D9%88%D9%86%D8%A7%D8%AA\" class=\"tag user_defined\" rel=\"nofollow\">fr:المكونات</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrogenated-fat\" class=\"tag known\" rel=\"nofollow\">Hydrogenated fat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:a-consommer-de-preference-avant-le\" class=\"tag user_defined\" rel=\"nofollow\">it:a-consommer-de-preference-avant-le</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-de-ble-complete-t150\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-de-ble-complete-t150</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E7%84%A1%E7%B1%BD%E8%91%A1%E8%90%84%E4%B9%BE\" class=\"tag user_defined\" rel=\"nofollow\">zh:無籽葡萄乾</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sels-mineraux-des-eaux-du-bassin-de-vichy\" class=\"tag user_defined\" rel=\"nofollow\">fr:sels-mineraux-des-eaux-du-bassin-de-vichy</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wild-garlic\" class=\"tag known\" rel=\"nofollow\">Wild garlic</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:grains-de-poivre-du-sichuan\" class=\"tag user_defined\" rel=\"nofollow\">fr:grains-de-poivre-du-sichuan</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:f%C3%BCllung-mit-vanillegeschmack\" class=\"tag user_defined\" rel=\"nofollow\">de:füllung-mit-vanillegeschmack</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D0%BA-%D0%BA%D0%BB%D1%8E%D0%BA%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:сок-клюквенный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:vaniljefr%C3%B8\" class=\"tag user_defined\" rel=\"nofollow\">nb:vaniljefrø</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:bio-mosterd-zaad\" class=\"tag user_defined\" rel=\"nofollow\">nl:bio-mosterd-zaad</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sorbitan-sesquioleate\" class=\"tag user_defined\" rel=\"nofollow\">sorbitan-sesquioleate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gras\" class=\"tag user_defined\" rel=\"nofollow\">fr:gras</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/made-from-corn\" class=\"tag user_defined\" rel=\"nofollow\">made-from-corn</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/citric-acid-and-rosemary\" class=\"tag user_defined\" rel=\"nofollow\">citric-acid-and-rosemary</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-issue-de-lait-de-vache\" class=\"tag user_defined\" rel=\"nofollow\">fr:creme-issue-de-lait-de-vache</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/comme-arabique\" class=\"tag user_defined\" rel=\"nofollow\">comme-arabique</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:preparazione-al-gusto-di-vaniglia\" class=\"tag user_defined\" rel=\"nofollow\">it:preparazione-al-gusto-di-vaniglia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e510\" class=\"tag known\" rel=\"nofollow\">E510</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:raclette-fondue\" class=\"tag user_defined\" rel=\"nofollow\">fr:raclette-fondue</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-ecreme-de-vache\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-ecreme-de-vache</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fourrage-confiture-de-myrtille\" class=\"tag user_defined\" rel=\"nofollow\">fr:fourrage-confiture-de-myrtille</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:med-emulgeringsmedel-sojalecitin\" class=\"tag user_defined\" rel=\"nofollow\">nb:med-emulgeringsmedel-sojalecitin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:s%C3%A5uerungsmittel\" class=\"tag user_defined\" rel=\"nofollow\">de:såuerungsmittel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/citrus-fibre\" class=\"tag known\" rel=\"nofollow\">Citrus fibre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-raspberry-juice\" class=\"tag known\" rel=\"nofollow\">Concentrated raspberry juice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%8D%D0%BC-%D1%80-e472e\" class=\"tag user_defined\" rel=\"nofollow\">ru:эм-р-e472e</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/flacour\" class=\"tag user_defined\" rel=\"nofollow\">flacour</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hard-ripened-cheeses\" class=\"tag user_defined\" rel=\"nofollow\">hard-ripened-cheeses</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%83%93%E3%82%BF%E3%83%9F%E3%83%B3%EF%BD%82%EF%BC%92\" class=\"tag user_defined\" rel=\"nofollow\">ja:ビタミンｂ２</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hydrolysed-maize-and-soya-protein\" class=\"tag user_defined\" rel=\"nofollow\">hydrolysed-maize-and-soya-protein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:composicion-centesimal\" class=\"tag user_defined\" rel=\"nofollow\">es:composicion-centesimal</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/horse-meat\" class=\"tag known\" rel=\"nofollow\">Horse meat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:noir\" class=\"tag user_defined\" rel=\"nofollow\">fr:noir</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:france\" class=\"tag user_defined\" rel=\"nofollow\">fr:france</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mascarpone\" class=\"tag known\" rel=\"nofollow\">Mascarpone</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bourbon-vanilla-beans\" class=\"tag known\" rel=\"nofollow\">Bourbon vanilla beans</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fromage-suisse-a-pate-molle\" class=\"tag user_defined\" rel=\"nofollow\">fr:fromage-suisse-a-pate-molle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/benefiber-guarantees-your-salistaction-and-vour-monay-har\" class=\"tag user_defined\" rel=\"nofollow\">benefiber-guarantees-your-salistaction-and-vour-monay-har</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/water-chestnut\" class=\"tag known\" rel=\"nofollow\">Water chestnut</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kr%C3%A4utertee\" class=\"tag user_defined\" rel=\"nofollow\">de:kräutertee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:ok-ingredienser\" class=\"tag user_defined\" rel=\"nofollow\">nb:ok-ingredienser</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mikrokrista-line-cellulose\" class=\"tag user_defined\" rel=\"nofollow\">de:mikrokrista-line-cellulose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/by-barilla-g\" class=\"tag user_defined\" rel=\"nofollow\">by-barilla-g</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B2%D0%BB%D0%B0%D0%B3%D0%BE%D1%83%D0%B4%D0%B5%D1%80%D0%B6%D0%B8%D0%B2%D0%B0%D1%8E%D1%89%D0%B8%D0%B9-a%D0%B3%D0%B5%D0%BD%D1%82\" class=\"tag user_defined\" rel=\"nofollow\">ru:влагоудерживающий-aгент</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:conservation\" class=\"tag user_defined\" rel=\"nofollow\">fr:conservation</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:se-conserve-deuxjours-au\" class=\"tag user_defined\" rel=\"nofollow\">fr:se-conserve-deuxjours-au</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:citra%C8%9Bl-de-sodiu\" class=\"tag user_defined\" rel=\"nofollow\">ro:citrațl-de-sodiu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:se-conserve-3-jours-ouverture-au-refrigerateur\" class=\"tag user_defined\" rel=\"nofollow\">fr:se-conserve-3-jours-ouverture-au-refrigerateur</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:black-mulberries\" class=\"tag user_defined\" rel=\"nofollow\">fr:black-mulberries</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/exhausteuide-conservateur\" class=\"tag user_defined\" rel=\"nofollow\">exhausteuide-conservateur</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jaune-d-oeuf-liquide-pasteurise\" class=\"tag known\" rel=\"nofollow\">fr:Jaune d'œuf liquide pasteurisé</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jaune-d-oeuf-issu-de-poule-elevee-en-plein-air\" class=\"tag user_defined\" rel=\"nofollow\">fr:jaune-d-oeuf-issu-de-poule-elevee-en-plein-air</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%83%D0%BB%D1%83%D1%87%D1%88%D0%B8%D1%82%D0%B5%D0%BB%D1%8C-%D1%85%D0%BB%D0%B5%D0%B1%D0%BE%D0%BF%D0%B5%D0%BA%D0%B0%D1%80%D0%BD%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:улучшитель-хлебопекарная</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:icorrespond-a-13-de-noisettes-broyees-dans-la-pate-de-noisettescacao\" class=\"tag user_defined\" rel=\"nofollow\">fr:icorrespond-a-13-de-noisettes-broyees-dans-la-pate-de-noisettescacao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/walnut-kernel\" class=\"tag known\" rel=\"nofollow\">Walnut kernel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:fermenti-lattici-specifici-vivi\" class=\"tag user_defined\" rel=\"nofollow\">it:fermenti-lattici-specifici-vivi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:vollmilchpuiver\" class=\"tag user_defined\" rel=\"nofollow\">de:vollmilchpuiver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cream-milk\" class=\"tag user_defined\" rel=\"nofollow\">cream-milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-almonds\" class=\"tag known\" rel=\"nofollow\">Whole almonds</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/broccoli\" class=\"tag known\" rel=\"nofollow\">Broccoli</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:elabore-et-mis-en-bouteilleenv-france-dingswaarde\" class=\"tag user_defined\" rel=\"nofollow\">fr:elabore-et-mis-en-bouteilleenv-france-dingswaarde</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:usturoi-deshidratat-pudr%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">hu:usturoi-deshidratat-pudră</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farce-aux-legumes\" class=\"tag user_defined\" rel=\"nofollow\">fr:farce-aux-legumes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:noirmoutier-et-guerande\" class=\"tag user_defined\" rel=\"nofollow\">fr:noirmoutier-et-guerande</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e1201\" class=\"tag known\" rel=\"nofollow\">E1201</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ergocalciferol\" class=\"tag known\" rel=\"nofollow\">Ergocalciferol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:fiber-fr%C3%A5n-sockerbeta\" class=\"tag user_defined\" rel=\"nofollow\">sv:fiber-från-sockerbeta</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:plantes-aromatiques-deshydratees\" class=\"tag known\" rel=\"nofollow\">fr:Plantes aromatiques déshydratées</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:traces-eventuelles-d-ceufs\" class=\"tag user_defined\" rel=\"nofollow\">fr:traces-eventuelles-d-ceufs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dandelion\" class=\"tag known\" rel=\"nofollow\">Dandelion</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:granuli-di-patata\" class=\"tag user_defined\" rel=\"nofollow\">it:granuli-di-patata</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicory-root\" class=\"tag known\" rel=\"nofollow\">Chicory root</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:base-aromatisante-fromage\" class=\"tag known\" rel=\"nofollow\">fr:Base aromatisante fromage</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lecithines-de-soja-cacao-maigre-en-poudre\" class=\"tag user_defined\" rel=\"nofollow\">fr:lecithines-de-soja-cacao-maigre-en-poudre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pecan-nut\" class=\"tag known\" rel=\"nofollow\">Pecan nut</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:matiere-seche-issue-du-lait\" class=\"tag user_defined\" rel=\"nofollow\">fr:matiere-seche-issue-du-lait</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-et-creme\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-et-creme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:nat%C3%BCrliches-minzenaroma\" class=\"tag user_defined\" rel=\"nofollow\">de:natürliches-minzenaroma</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mini-cone-chocolat\" class=\"tag user_defined\" rel=\"nofollow\">fr:mini-cone-chocolat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:nacl\" class=\"tag user_defined\" rel=\"nofollow\">ru:nacl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:nettopaino-on-kuitenkin-aina-1-1-kg\" class=\"tag user_defined\" rel=\"nofollow\">nb:nettopaino-on-kuitenkin-aina-1-1-kg</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/manganese\" class=\"tag known\" rel=\"nofollow\">Manganese</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D0%BA-%D1%8F%D0%B1%D0%BB%D0%BE%D1%87%D0%BD%D1%8B%D0%B9-%D0%BA%D0%BE%D0%BD%D1%86%D0%B5%D0%BD%D1%82%D1%80%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:сок-яблочный-концентрированный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:45\" class=\"tag user_defined\" rel=\"nofollow\">fr:45</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:remplacez-l-agneau-par-des-blancs-de-poulet-eminces\" class=\"tag user_defined\" rel=\"nofollow\">fr:remplacez-l-agneau-par-des-blancs-de-poulet-eminces</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:edulcolorants\" class=\"tag user_defined\" rel=\"nofollow\">fr:edulcolorants</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pepites-a-base-de-fruits\" class=\"tag user_defined\" rel=\"nofollow\">fr:pepites-a-base-de-fruits</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:karottenpulver\" class=\"tag known\" rel=\"nofollow\">de:Karottenpulver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:s%C3%A4uerungsmittel-%C3%A4pfels%C3%A4ure-farbstoff-e171\" class=\"tag user_defined\" rel=\"nofollow\">de:säuerungsmittel-äpfelsäure-farbstoff-e171</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miel-de-sapin\" class=\"tag known\" rel=\"nofollow\">fr:Miel de sapin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kakaonmasse\" class=\"tag user_defined\" rel=\"nofollow\">de:kakaonmasse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:vollbier\" class=\"tag user_defined\" rel=\"nofollow\">de:vollbier</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cola-totalement-hydrogene\" class=\"tag user_defined\" rel=\"nofollow\">fr:cola-totalement-hydrogene</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e132\" class=\"tag known\" rel=\"nofollow\">E132</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/potato-starch-and-powdered-cellulose-added-to-prevent-caking\" class=\"tag user_defined\" rel=\"nofollow\">potato-starch-and-powdered-cellulose-added-to-prevent-caking</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-sec-min\" class=\"tag user_defined\" rel=\"nofollow\">fr:extrait-sec-min</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-thermise-de-chevre-entier\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-thermise-de-chevre-entier</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-yeast\" class=\"tag known\" rel=\"nofollow\">Natural yeast</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/duck-gizzard\" class=\"tag known\" rel=\"nofollow\">Duck gizzard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:getrocknete-berberitzen\" class=\"tag user_defined\" rel=\"nofollow\">de:getrocknete-berberitzen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E9%AD%9A%E7%B2%89\" class=\"tag user_defined\" rel=\"nofollow\">ja:魚粉</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/peanut-flour\" class=\"tag known\" rel=\"nofollow\">Peanut flour</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:karamellisierte-und-gezuckerte-kondensmilch\" class=\"tag user_defined\" rel=\"nofollow\">de:karamellisierte-und-gezuckerte-kondensmilch</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fresh-onions\" class=\"tag known\" rel=\"nofollow\">Fresh onions</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miel-de-sapin-recolte-en-france\" class=\"tag known\" rel=\"nofollow\">fr:Miel de sapin récolté en France</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lemon-curd\" class=\"tag user_defined\" rel=\"nofollow\">lemon-curd</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E7%B6%AD%E7%94%9F%E7%B4%A0-c-%E9%88%89%E7%9B%A3\" class=\"tag user_defined\" rel=\"nofollow\">zh:維生素-c-鈉監</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:300\" class=\"tag user_defined\" rel=\"nofollow\">fr:300</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:marrons-glaces\" class=\"tag user_defined\" rel=\"nofollow\">fr:marrons-glaces</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/energy-280-kj\" class=\"tag user_defined\" rel=\"nofollow\">energy-280-kj</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/angus-beef\" class=\"tag known\" rel=\"nofollow\">Angus beef</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/su\" class=\"tag user_defined\" rel=\"nofollow\">su</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:flocons-d-orge-flocons-de-ble-malte-grilles\" class=\"tag user_defined\" rel=\"nofollow\">fr:flocons-d-orge-flocons-de-ble-malte-grilles</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/butter-natural-flavouring\" class=\"tag known\" rel=\"nofollow\">Butter natural flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:schafgarbe\" class=\"tag user_defined\" rel=\"nofollow\">de:schafgarbe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/colour-160a\" class=\"tag user_defined\" rel=\"nofollow\">colour-160a</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:poudre-au-beurre\" class=\"tag known\" rel=\"nofollow\">fr:Poudre au beurre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B2%D0%B5%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%BE-%D0%B4%D0%BB%D1%8F-%D0%BE%D0%B1%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%BA%D0%B8-%D0%BC%D1%83%D0%BA%D0%B8\" class=\"tag user_defined\" rel=\"nofollow\">ru:вещество-для-обработки-муки</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:echalote-deshydratee\" class=\"tag known\" rel=\"nofollow\">fr:Échalote déshydratée</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/round-rice\" class=\"tag known\" rel=\"nofollow\">Round rice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cooked-green-lentils\" class=\"tag known\" rel=\"nofollow\">Cooked green lentils</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/non-hydrogenated-vegetable-fats\" class=\"tag known\" rel=\"nofollow\">Non-hydrogenated vegetable fats</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/black-pepper-extract\" class=\"tag known\" rel=\"nofollow\">Black pepper extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nestle-milo-breakfast-cereal\" class=\"tag user_defined\" rel=\"nofollow\">nestle-milo-breakfast-cereal</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nutrition-information-typical-value-energy-fat\" class=\"tag user_defined\" rel=\"nofollow\">nutrition-information-typical-value-energy-fat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:pudr%C4%83-de-tomate\" class=\"tag user_defined\" rel=\"nofollow\">ro:pudră-de-tomate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/poultry-liver\" class=\"tag known\" rel=\"nofollow\">Poultry liver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:carne-de-g%C3%A2sc%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:carne-de-gâscă</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-peche-et-arome\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-de-peche-et-arome</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:nat%C3%BCrliches-zitronen\" class=\"tag user_defined\" rel=\"nofollow\">de:natürliches-zitronen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:appellation-cotes-du-rhone-certifiee\" class=\"tag user_defined\" rel=\"nofollow\">fr:appellation-cotes-du-rhone-certifiee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:peche-en-atlantique-nord-ouest\" class=\"tag user_defined\" rel=\"nofollow\">fr:peche-en-atlantique-nord-ouest</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tum-all\" class=\"tag user_defined\" rel=\"nofollow\">tum-all</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:les-personnes-souffrant-d-hypertension-doivent-eviter-toute-consommation-excessive\" class=\"tag user_defined\" rel=\"nofollow\">fr:les-personnes-souffrant-d-hypertension-doivent-eviter-toute-consommation-excessive</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/emulsifiants-et-aromes\" class=\"tag user_defined\" rel=\"nofollow\">emulsifiants-et-aromes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/organic-tomato\" class=\"tag known\" rel=\"nofollow\">Organic tomato</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:koml%C3%B3-k%C3%A9sz%C3%ADtm%C3%A9nyek\" class=\"tag user_defined\" rel=\"nofollow\">hu:komló-készítmények</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E7%A0%82%E7%B3%96\" class=\"tag user_defined\" rel=\"nofollow\">zh:砂糖</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:algue-arame\" class=\"tag user_defined\" rel=\"nofollow\">fr:algue-arame</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wild-rice\" class=\"tag known\" rel=\"nofollow\">Wild rice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vitamin-k\" class=\"tag known\" rel=\"nofollow\">Vitamin K</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:batonnet-sorbet-mangue-jus-de-la-passion-enrobage-fruits-exotiques\" class=\"tag user_defined\" rel=\"nofollow\">fr:batonnet-sorbet-mangue-jus-de-la-passion-enrobage-fruits-exotiques</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/egg-protein\" class=\"tag known\" rel=\"nofollow\">Egg protein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cereales\" class=\"tag user_defined\" rel=\"nofollow\">cereales</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:de-l-eau-de-cuisson\" class=\"tag user_defined\" rel=\"nofollow\">fr:de-l-eau-de-cuisson</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:emulgator-sojalecithin\" class=\"tag user_defined\" rel=\"nofollow\">de:emulgator-sojalecithin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-d-olive\" class=\"tag user_defined\" rel=\"nofollow\">fr:extrait-d-olive</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:colin\" class=\"tag user_defined\" rel=\"nofollow\">fr:colin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kohlensaure\" class=\"tag user_defined\" rel=\"nofollow\">de:kohlensaure</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B1%D0%B5%D1%82%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:бета</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:d\" class=\"tag user_defined\" rel=\"nofollow\">fr:d</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E8%84%82%E8%82%AA%E9%85%B8%E7%94%98%E6%B2%B9%E8%84%82\" class=\"tag user_defined\" rel=\"nofollow\">zh:脂肪酸甘油脂</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B2%D0%BA%D1%83%D1%81%D0%BE%D0%B0%D1%80%D0%BE%D0%BC%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B0%D1%8F-%D0%B4%D0%BE%D0%B1%D0%B0%D0%B2%D0%BA%D0%B0-%D1%81%D0%BB%D0%B8%D0%B2%D0%BE%D1%87%D0%BD%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:вкусоароматическая-добавка-сливочная</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:inosinato-sodico\" class=\"tag user_defined\" rel=\"nofollow\">es:inosinato-sodico</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cs:Sma%C5%BEen%C3%BD%20lilek\" class=\"tag known\" rel=\"nofollow\">cs:Smažený lilek</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:21\" class=\"tag user_defined\" rel=\"nofollow\">fr:21</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melange-de-fruits-exotiques\" class=\"tag user_defined\" rel=\"nofollow\">fr:melange-de-fruits-exotiques</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:batoane-de-vanilie-bourbon\" class=\"tag user_defined\" rel=\"nofollow\">ro:batoane-de-vanilie-bourbon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:keka-ttver\" class=\"tag user_defined\" rel=\"nofollow\">de:keka-ttver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dan-on-com\" class=\"tag user_defined\" rel=\"nofollow\">fr:dan-on-com</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:sz%C3%A1razbab\" class=\"tag user_defined\" rel=\"nofollow\">hu:szárazbab</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%83%91%E3%83%97%E3%83%AA%E3%82%AB%E8%89%B2%E7%B4%A0\" class=\"tag user_defined\" rel=\"nofollow\">ja:パプリカ色素</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lean-duck-liver\" class=\"tag known\" rel=\"nofollow\">Lean duck liver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:epices-moulues\" class=\"tag known\" rel=\"nofollow\">fr:Épices moulues</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-de-racine-d-angelique\" class=\"tag user_defined\" rel=\"nofollow\">fr:extrait-de-racine-d-angelique</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%83%D0%BB%D1%83%D1%87%D1%88%D0%B8%D1%82%D0%B5%D0%BB%D1%8C-%D1%82%D0%B5%D1%81%D1%82%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:улучшитель-теста</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:%D9%85%D9%86%D9%83%D9%87%D8%A7%D8%AA\" class=\"tag user_defined\" rel=\"nofollow\">fr:منكهات</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soybean-oi\" class=\"tag user_defined\" rel=\"nofollow\">soybean-oi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:stqfe-ln-best-oefore\" class=\"tag user_defined\" rel=\"nofollow\">fr:stqfe-ln-best-oefore</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:arome\" class=\"tag user_defined\" rel=\"nofollow\">de:arome</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ce-produit-ne-convient-pas-aux-personnes-atteintes-de-galactosemie\" class=\"tag user_defined\" rel=\"nofollow\">fr:ce-produit-ne-convient-pas-aux-personnes-atteintes-de-galactosemie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:%D8%A8%D9%86%D8%B2%D9%88%D8%A7%D8%AA-%D8%A7%D9%84%D8%B5%D9%88%D8%AF%D9%8A%D9%88%D9%85-e211\" class=\"tag user_defined\" rel=\"nofollow\">fr:بنزوات-الصوديوم-e211</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/smoked-cooked-lardoons\" class=\"tag known\" rel=\"nofollow\">Smoked cooked lardoons</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:b-carotene\" class=\"tag user_defined\" rel=\"nofollow\">fr:b-carotene</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:vitamins\" class=\"tag user_defined\" rel=\"nofollow\">hu:vitamins</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:fettreds-kakao\" class=\"tag user_defined\" rel=\"nofollow\">nb:fettreds-kakao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kakaocremef%C3%BCllung\" class=\"tag user_defined\" rel=\"nofollow\">de:kakaocremefüllung</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/crab\" class=\"tag known\" rel=\"nofollow\">Crab</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%82%A8%E3%83%93%E3%81%A8%E3%81%9F%E3%81%A3%E3%81%B7%E3%82%8A%E9%87%8E%E8%8F%9C\" class=\"tag user_defined\" rel=\"nofollow\">ja:エビとたっぷり野菜</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/exhausted-vanilla-seeds\" class=\"tag known\" rel=\"nofollow\">Exhausted vanilla seeds</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:l\" class=\"tag user_defined\" rel=\"nofollow\">de:l</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:origanum-vulgare\" class=\"tag user_defined\" rel=\"nofollow\">fr:origanum-vulgare</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:hergestellt-mit-mikrobiellem-lab\" class=\"tag user_defined\" rel=\"nofollow\">de:hergestellt-mit-mikrobiellem-lab</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%80%D0%B0%D1%84%D0%B8%D0%BD%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D1%80%D0%B0%D1%81%D1%82%D0%B8%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5-%D0%BC%D0%B0%D1%81%D0%BB%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:рафинированные-растительные-масла</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-soy-and-corn-hydrolysate\" class=\"tag user_defined\" rel=\"nofollow\">vegetable-soy-and-corn-hydrolysate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fish-gelatine\" class=\"tag known\" rel=\"nofollow\">Fish gelatine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:callos-y-patas-de-vacuno\" class=\"tag user_defined\" rel=\"nofollow\">es:callos-y-patas-de-vacuno</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coconut-milk-powder\" class=\"tag known\" rel=\"nofollow\">Coconut milk powder</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gesier-de-canard-maigre\" class=\"tag user_defined\" rel=\"nofollow\">fr:gesier-de-canard-maigre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-de-brebis-a-3-de-matieres-grasses\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-de-brebis-a-3-de-matieres-grasses</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E5%B0%8F%E9%BA%A5%E6%BE%B1%E7%B2%89\" class=\"tag user_defined\" rel=\"nofollow\">zh:小麥澱粉</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/acesulfame\" class=\"tag user_defined\" rel=\"nofollow\">acesulfame</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:issue-de-fruits\" class=\"tag user_defined\" rel=\"nofollow\">fr:issue-de-fruits</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:anis-2-o\" class=\"tag user_defined\" rel=\"nofollow\">fr:anis-2-o</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tatal-hardness-39-656-mg\" class=\"tag user_defined\" rel=\"nofollow\">tatal-hardness-39-656-mg</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:aiguillette-de-poulet\" class=\"tag known\" rel=\"nofollow\">fr:Aiguillette de poulet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/quail\" class=\"tag known\" rel=\"nofollow\">Quail</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:riz-thai-long-grain-de-qualite-superieure\" class=\"tag known\" rel=\"nofollow\">fr:Riz thaï long grain de qualité supérieure</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e900a\" class=\"tag known\" rel=\"nofollow\">E900a</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BD%D0%B0%D1%82%D1%83%D1%80%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9-%D0%BA%D1%80%D0%B0%D1%81%D0%B8%D1%82%D0%B5%D0%BB%D1%8C-%D0%B1%D0%B5%D1%82%D0%B0-%D0%BA%D0%B0%D1%80%D0%BE%D1%82%D0%B8%D0%BD\" class=\"tag user_defined\" rel=\"nofollow\">ru:натуральный-краситель-бета-каротин</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sel-vinaigre-de-cidre-de-pomme\" class=\"tag user_defined\" rel=\"nofollow\">fr:sel-vinaigre-de-cidre-de-pomme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/piment-vinaigre\" class=\"tag user_defined\" rel=\"nofollow\">piment-vinaigre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-broth\" class=\"tag known\" rel=\"nofollow\">Chicken broth</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n";

    public static String split16 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:potimarrons-du-val-de-loire\" class=\"tag user_defined\" rel=\"nofollow\">fr:potimarrons-du-val-de-loire</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:contient-gluten\" class=\"tag user_defined\" rel=\"nofollow\">it:contient-gluten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rosemary-seasoning\" class=\"tag user_defined\" rel=\"nofollow\">rosemary-seasoning</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mature-cheddar\" class=\"tag known\" rel=\"nofollow\">Mature cheddar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:de-chene-et-de-caryer\" class=\"tag user_defined\" rel=\"nofollow\">fr:de-chene-et-de-caryer</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:skipjack\" class=\"tag user_defined\" rel=\"nofollow\">de:skipjack</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cs:%C5%A1vestkov%C3%BD-destil%C3%A1t\" class=\"tag user_defined\" rel=\"nofollow\">cs:švestkový-destilát</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:crabe-vert\" class=\"tag user_defined\" rel=\"nofollow\">fr:crabe-vert</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/palm-vegetable-oils\" class=\"tag user_defined\" rel=\"nofollow\">palm-vegetable-oils</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/orange-blossom-flavouring\" class=\"tag known\" rel=\"nofollow\">Orange blossom flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:acidophilus\" class=\"tag user_defined\" rel=\"nofollow\">fr:acidophilus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pour-agneau-rogan-josh\" class=\"tag user_defined\" rel=\"nofollow\">fr:pour-agneau-rogan-josh</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E8%AA%BF%E5%91%B3%E6%96%99%EF%BC%88%E3%82%A2%E3%83%9F%E3%83%8E%E9%85%B8%E7%AD%89%EF%BC%89\" class=\"tag user_defined\" rel=\"nofollow\">ja:調味料（アミノ酸等）</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pate-de-praline\" class=\"tag known\" rel=\"nofollow\">fr:Pâte de praliné</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:banane-cavendish-categorie-1-calibre-14cm-mini\" class=\"tag user_defined\" rel=\"nofollow\">fr:banane-cavendish-categorie-1-calibre-14cm-mini</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ascorbato-di-sodio\" class=\"tag user_defined\" rel=\"nofollow\">fr:ascorbato-di-sodio</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/highly-fat-reduced-cocoa\" class=\"tag known\" rel=\"nofollow\">Highly fat reduced cocoa</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ananas-flavouring\" class=\"tag known\" rel=\"nofollow\">Ananas flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/brown-beans\" class=\"tag known\" rel=\"nofollow\">Brown beans</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:une-consommation-excessive-peut-avoir-des-effets-iayatifo\" class=\"tag user_defined\" rel=\"nofollow\">fr:une-consommation-excessive-peut-avoir-des-effets-iayatifo</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:arbonates-de-sodium\" class=\"tag user_defined\" rel=\"nofollow\">fr:arbonates-de-sodium</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:poireaux-45-pommes-de-terre\" class=\"tag user_defined\" rel=\"nofollow\">fr:poireaux-45-pommes-de-terre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:f%C3%A4rbendes-lebensmittel-rote-beetesaftkonzentrat-und-holundersaftkonzentrat\" class=\"tag user_defined\" rel=\"nofollow\">de:färbendes-lebensmittel-rote-beetesaftkonzentrat-und-holundersaftkonzentrat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/yellow-corn\" class=\"tag known\" rel=\"nofollow\">Yellow corn</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:420q\" class=\"tag user_defined\" rel=\"nofollow\">fr:420q</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:achillee\" class=\"tag user_defined\" rel=\"nofollow\">fr:achillee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:orangenweinbrandlik%C3%B6r\" class=\"tag user_defined\" rel=\"nofollow\">de:orangenweinbrandlikör</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:conservante\" class=\"tag user_defined\" rel=\"nofollow\">fr:conservante</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cocoa-fat\" class=\"tag known\" rel=\"nofollow\">Cocoa fat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:moules-decoquillees-4\" class=\"tag user_defined\" rel=\"nofollow\">fr:moules-decoquillees-4</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:camembert\" class=\"tag user_defined\" rel=\"nofollow\">de:camembert</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:riz-sauve-ingredlents-agricoles\" class=\"tag user_defined\" rel=\"nofollow\">fr:riz-sauve-ingredlents-agricoles</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e129\" class=\"tag known\" rel=\"nofollow\">E129</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:preparation-a-base-de-cacao\" class=\"tag user_defined\" rel=\"nofollow\">fr:preparation-a-base-de-cacao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rocket\" class=\"tag known\" rel=\"nofollow\">Rocket</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/331\" class=\"tag user_defined\" rel=\"nofollow\">331</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-dessert-au-chocolat-ingredients-lait-entier\" class=\"tag user_defined\" rel=\"nofollow\">fr:creme-dessert-au-chocolat-ingredients-lait-entier</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:legumes-verts\" class=\"tag known\" rel=\"nofollow\">fr:Légumes verts</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rose-hip\" class=\"tag known\" rel=\"nofollow\">Rose hip</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mechanically-separated-meat-of-turkey\" class=\"tag known\" rel=\"nofollow\">Mechanically separated meat of turkey</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:original-jamaica-rum\" class=\"tag user_defined\" rel=\"nofollow\">de:original-jamaica-rum</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soluble-fibre\" class=\"tag known\" rel=\"nofollow\">Soluble fibre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:peche-en-ocean-atlantique-centre-est\" class=\"tag user_defined\" rel=\"nofollow\">fr:peche-en-ocean-atlantique-centre-est</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E8%8C%B6%E8%91%89%E8%90%83%E5%8F%96%E7%89%A9\" class=\"tag user_defined\" rel=\"nofollow\">zh:茶葉萃取物</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%BE%D0%BD%D0%BE\" class=\"tag user_defined\" rel=\"nofollow\">ru:моно</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:wei%C3%9Fe-joghurtschokolade\" class=\"tag user_defined\" rel=\"nofollow\">de:weiße-joghurtschokolade</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/acidifiant\" class=\"tag user_defined\" rel=\"nofollow\">acidifiant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fumee-de-bois-d-erable\" class=\"tag user_defined\" rel=\"nofollow\">fr:fumee-de-bois-d-erable</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:italia\" class=\"tag user_defined\" rel=\"nofollow\">de:italia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vanilla-seeds\" class=\"tag known\" rel=\"nofollow\">Vanilla seeds</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:schweinehinterschinken\" class=\"tag user_defined\" rel=\"nofollow\">de:schweinehinterschinken</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:bio-azijn\" class=\"tag user_defined\" rel=\"nofollow\">nl:bio-azijn</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sheep\" class=\"tag known\" rel=\"nofollow\">Sheep</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e425\" class=\"tag known\" rel=\"nofollow\">E425</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cithines-de-soja\" class=\"tag user_defined\" rel=\"nofollow\">fr:cithines-de-soja</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:sodio-nitrito\" class=\"tag user_defined\" rel=\"nofollow\">it:sodio-nitrito</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/262\" class=\"tag user_defined\" rel=\"nofollow\">262</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e444\" class=\"tag known\" rel=\"nofollow\">E444</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:protein%C4%83-vegetal%C4%83-de-soia\" class=\"tag user_defined\" rel=\"nofollow\">ro:proteină-vegetală-de-soia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:5-nel-prodotto-finito\" class=\"tag user_defined\" rel=\"nofollow\">it:5-nel-prodotto-finito</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:maigre-et-gras\" class=\"tag user_defined\" rel=\"nofollow\">fr:maigre-et-gras</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:panais-du-val-de-loire\" class=\"tag user_defined\" rel=\"nofollow\">fr:panais-du-val-de-loire</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:de-production-etrangere\" class=\"tag user_defined\" rel=\"nofollow\">fr:de-production-etrangere</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:grillees-et-hachees\" class=\"tag user_defined\" rel=\"nofollow\">fr:grillees-et-hachees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:vanille-aroma\" class=\"tag user_defined\" rel=\"nofollow\">de:vanille-aroma</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:schinkenbr%C3%BChwurststreifen\" class=\"tag user_defined\" rel=\"nofollow\">de:schinkenbrühwurststreifen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:enzymes-coagulantes-naturelles\" class=\"tag user_defined\" rel=\"nofollow\">fr:enzymes-coagulantes-naturelles</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:ardei\" class=\"tag user_defined\" rel=\"nofollow\">ro:ardei</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:emulsifiant\" class=\"tag user_defined\" rel=\"nofollow\">it:emulsifiant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rambutan\" class=\"tag known\" rel=\"nofollow\">Rambutan</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:beurre-issu-de-l\" class=\"tag user_defined\" rel=\"nofollow\">fr:beurre-issu-de-l</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:natun-thunfisch-skipjack\" class=\"tag user_defined\" rel=\"nofollow\">de:natun-thunfisch-skipjack</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gemahlene\" class=\"tag user_defined\" rel=\"nofollow\">de:gemahlene</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:ciocolat%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:ciocolată</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hemp-seed\" class=\"tag known\" rel=\"nofollow\">Hemp seed</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pqivre\" class=\"tag user_defined\" rel=\"nofollow\">fr:pqivre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:glutenhaltiges-getreide\" class=\"tag user_defined\" rel=\"nofollow\">de:glutenhaltiges-getreide</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/free-range-chicken\" class=\"tag known\" rel=\"nofollow\">Free range chicken</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:oignon-grille-en-poudre\" class=\"tag known\" rel=\"nofollow\">fr:Oignon grillé en poudre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/corn-salad\" class=\"tag known\" rel=\"nofollow\">Corn salad</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:reines-bourbon-vanille-aus-madagaskar\" class=\"tag user_defined\" rel=\"nofollow\">de:reines-bourbon-vanille-aus-madagaskar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-grape\" class=\"tag known\" rel=\"nofollow\">White grape</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:prepare-a-partir-de-double-distillation-de-plusieurs-plantes-et-aromates-dont-la-recette-est-gardee-secrete\" class=\"tag user_defined\" rel=\"nofollow\">fr:prepare-a-partir-de-double-distillation-de-plusieurs-plantes-et-aromates-dont-la-recette-est-gardee-secrete</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nl:moutmeel\" class=\"tag known\" rel=\"nofollow\">nl:Moutmeel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sweet-cherry\" class=\"tag known\" rel=\"nofollow\">Sweet cherry</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:specialite-cerealiere-gout-epinard\" class=\"tag user_defined\" rel=\"nofollow\">fr:specialite-cerealiere-gout-epinard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:boulettes-pre-frites-a-base-de-pois-chiches-et-legumes-decongelees\" class=\"tag user_defined\" rel=\"nofollow\">fr:boulettes-pre-frites-a-base-de-pois-chiches-et-legumes-decongelees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/thai-brown-rice\" class=\"tag known\" rel=\"nofollow\">Thaï brown rice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D0%BA%D0%BE%D1%81%D0%BE%D0%B4%D0%B5%D1%80%D0%B6%D0%B0%D1%89%D0%B0%D1%8F-%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:сокосодержащая-основа</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-flavour-kirsch\" class=\"tag user_defined\" rel=\"nofollow\">natural-flavour-kirsch</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:5-%E6%AC%A1%E9%BB%83%E5%98%8C%E5%91%A4%E6%A0%B8%E7%94%98%E7%A3%B7%E4%BA%8C%E9%85%B8%E9%88%89\" class=\"tag user_defined\" rel=\"nofollow\">zh:5-次黃嘌呤核甘磷二酸鈉</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dates-du-jour-de-ponte\" class=\"tag user_defined\" rel=\"nofollow\">fr:dates-du-jour-de-ponte</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hard-cheese\" class=\"tag known\" rel=\"nofollow\">Hard cheese</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:farina-di-girano-tenero-tipo-0\" class=\"tag user_defined\" rel=\"nofollow\">it:farina-di-girano-tenero-tipo-0</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:presure-caprine\" class=\"tag user_defined\" rel=\"nofollow\">fr:presure-caprine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/piri-piri-seasoning\" class=\"tag user_defined\" rel=\"nofollow\">piri-piri-seasoning</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:v%C3%B6r%C3%B6shagyma-p%C3%A9p\" class=\"tag user_defined\" rel=\"nofollow\">hu:vöröshagyma-pép</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:chorizo-et-jambon-cru\" class=\"tag user_defined\" rel=\"nofollow\">fr:chorizo-et-jambon-cru</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mediterranean-salt\" class=\"tag known\" rel=\"nofollow\">Mediterranean salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:caffe-in-polvere-0\" class=\"tag user_defined\" rel=\"nofollow\">it:caffe-in-polvere-0</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:solidos-totales\" class=\"tag user_defined\" rel=\"nofollow\">es:solidos-totales</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:de-soja-et-de-fruits-a-coque\" class=\"tag user_defined\" rel=\"nofollow\">fr:de-soja-et-de-fruits-a-coque</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:issus-d-huiles-vegetales\" class=\"tag user_defined\" rel=\"nofollow\">fr:issus-d-huiles-vegetales</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:sole\" class=\"tag user_defined\" rel=\"nofollow\">it:sole</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:citra%C8%9Bi-de-sodiu\" class=\"tag user_defined\" rel=\"nofollow\">ro:citrați-de-sodiu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rapeseed-vegetable-oil\" class=\"tag user_defined\" rel=\"nofollow\">rapeseed-vegetable-oil</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soya-bean-paste\" class=\"tag known\" rel=\"nofollow\">Soya bean paste</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e\" class=\"tag user_defined\" rel=\"nofollow\">e</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:s%C3%BAritett-paradicsom\" class=\"tag user_defined\" rel=\"nofollow\">hu:súritett-paradicsom</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/grade-a-reduced-fat-milk\" class=\"tag user_defined\" rel=\"nofollow\">grade-a-reduced-fat-milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:ingrediente\" class=\"tag user_defined\" rel=\"nofollow\">hu:ingrediente</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:haselnus-eme-scias-reisgrieb\" class=\"tag user_defined\" rel=\"nofollow\">de:haselnus-eme-scias-reisgrieb</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:sara-iodat%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:sara-iodată</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:flocons-de-pomme-de-terre-gt\" class=\"tag user_defined\" rel=\"nofollow\">fr:flocons-de-pomme-de-terre-gt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tr%C3%ACnkwasser\" class=\"tag user_defined\" rel=\"nofollow\">de:trìnkwasser</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:eritroaszkorb%C3%A1t\" class=\"tag user_defined\" rel=\"nofollow\">hu:eritroaszkorbát</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:crusca\" class=\"tag user_defined\" rel=\"nofollow\">it:crusca</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:rechauffer-2-a-3-minutes-a-la-casserole-a-feu-doux\" class=\"tag user_defined\" rel=\"nofollow\">fr:rechauffer-2-a-3-minutes-a-la-casserole-a-feu-doux</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huile-de-cameline-vierge\" class=\"tag user_defined\" rel=\"nofollow\">fr:huile-de-cameline-vierge</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:durchschnittiche-nahrwerte-po-10-brennwert-fett-gavon-ges%C3%A4ttigte-fetsunen-kohienhydrate-gavon-zucke-elwei%C3%9F-sal-682-j\" class=\"tag user_defined\" rel=\"nofollow\">de:durchschnittiche-nahrwerte-po-10-brennwert-fett-gavon-gesättigte-fetsunen-kohienhydrate-gavon-zucke-elweiß-sal-682-j</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ingredtents\" class=\"tag user_defined\" rel=\"nofollow\">fr:ingredtents</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/orange-leaves\" class=\"tag known\" rel=\"nofollow\">Orange leaves</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cacao-nibs\" class=\"tag user_defined\" rel=\"nofollow\">cacao-nibs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:cocos\" class=\"tag user_defined\" rel=\"nofollow\">sv:cocos</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:olio-di-oliva-di-categoria-superiore-ottenuto-dirattamente-dalle-olive-e-unicamente-mediante-procedimenti-meccanici\" class=\"tag user_defined\" rel=\"nofollow\">it:olio-di-oliva-di-categoria-superiore-ottenuto-dirattamente-dalle-olive-e-unicamente-mediante-procedimenti-meccanici</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/active-yogurt-cultures\" class=\"tag user_defined\" rel=\"nofollow\">active-yogurt-cultures</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:ok-indholdet-synker-sammen-undertransport\" class=\"tag user_defined\" rel=\"nofollow\">nb:ok-indholdet-synker-sammen-undertransport</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:see-packaging-voedingswaarde-per\" class=\"tag user_defined\" rel=\"nofollow\">fr:see-packaging-voedingswaarde-per</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%85%D0%BB%D0%BE%D1%80%D0%B8%D1%81%D1%82%D1%8B%D0%B9-%D0%BD%D0%B0%D1%82%D1%80%D0%B8%D0%B9-gt\" class=\"tag user_defined\" rel=\"nofollow\">ru:хлористый-натрий-gt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-de-riz\" class=\"tag known\" rel=\"nofollow\">fr:Crème de riz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sea-buckthorn\" class=\"tag known\" rel=\"nofollow\">Sea-buckthorn</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e518\" class=\"tag known\" rel=\"nofollow\">E518</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:leinsamen-dunkel\" class=\"tag user_defined\" rel=\"nofollow\">de:leinsamen-dunkel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/propellent-gas\" class=\"tag known\" rel=\"nofollow\">Propellent gas</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:piments-verts-doux-marines\" class=\"tag user_defined\" rel=\"nofollow\">fr:piments-verts-doux-marines</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ground-roasted-coffee\" class=\"tag known\" rel=\"nofollow\">Ground roasted coffee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:rhizoma-kaempferiae\" class=\"tag user_defined\" rel=\"nofollow\">fr:rhizoma-kaempferiae</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fer\" class=\"tag user_defined\" rel=\"nofollow\">fer</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vin-blanc-vendanges-tardives\" class=\"tag user_defined\" rel=\"nofollow\">fr:vin-blanc-vendanges-tardives</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:oeufs-par-kilo-de-semoule\" class=\"tag user_defined\" rel=\"nofollow\">fr:oeufs-par-kilo-de-semoule</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sweetmint\" class=\"tag known\" rel=\"nofollow\">Sweetmint</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-breast\" class=\"tag known\" rel=\"nofollow\">Chicken breast</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:ca%C8%99caval\" class=\"tag user_defined\" rel=\"nofollow\">ro:cașcaval</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/minimum-31-cocoa\" class=\"tag user_defined\" rel=\"nofollow\">minimum-31-cocoa</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:bandnudeln-gegart\" class=\"tag user_defined\" rel=\"nofollow\">de:bandnudeln-gegart</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:melisse\" class=\"tag user_defined\" rel=\"nofollow\">de:melisse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:veronique\" class=\"tag user_defined\" rel=\"nofollow\">fr:veronique</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mini-wassermelone\" class=\"tag user_defined\" rel=\"nofollow\">de:mini-wassermelone</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:feuchthal-temittel-glycerin\" class=\"tag user_defined\" rel=\"nofollow\">de:feuchthal-temittel-glycerin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:carvi-coriandre\" class=\"tag user_defined\" rel=\"nofollow\">fr:carvi-coriandre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E6%98%86%E5%B8%83%E3%82%A8%E3%82%AD%E3%82%B9\" class=\"tag user_defined\" rel=\"nofollow\">ja:昆布エキス</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:salt-gt\" class=\"tag user_defined\" rel=\"nofollow\">sv:salt-gt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-de-mais-sucre-sel-extrait-de-malt-d-orge-emulsifiant\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-de-mais-sucre-sel-extrait-de-malt-d-orge-emulsifiant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:scandinavie\" class=\"tag user_defined\" rel=\"nofollow\">fr:scandinavie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:flavonoides\" class=\"tag user_defined\" rel=\"nofollow\">fr:flavonoides</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:andorn\" class=\"tag user_defined\" rel=\"nofollow\">de:andorn</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/parfum-naturels\" class=\"tag user_defined\" rel=\"nofollow\">parfum-naturels</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mattodextrine\" class=\"tag user_defined\" rel=\"nofollow\">fr:mattodextrine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:pritaminpaprika\" class=\"tag user_defined\" rel=\"nofollow\">hu:pritaminpaprika</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/grill-to-medium\" class=\"tag user_defined\" rel=\"nofollow\">grill-to-medium</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:biscotto-ai-4-cereali\" class=\"tag user_defined\" rel=\"nofollow\">it:biscotto-ai-4-cereali</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:in-eigenem-saft-und-aufguss-tuna\" class=\"tag user_defined\" rel=\"nofollow\">de:in-eigenem-saft-und-aufguss-tuna</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:marille\" class=\"tag user_defined\" rel=\"nofollow\">de:marille</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%B0%D1%81%D0%BB%D0%BE-%D1%80%D0%B0%D0%BF%D1%81%D0%BE%D0%B2%D0%BE%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:масло-рапсовое</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:raisins-au-rhum\" class=\"tag user_defined\" rel=\"nofollow\">fr:raisins-au-rhum</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:raclette\" class=\"tag user_defined\" rel=\"nofollow\">fr:raclette</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:caroteni\" class=\"tag user_defined\" rel=\"nofollow\">ro:caroteni</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ci-77499\" class=\"tag user_defined\" rel=\"nofollow\">ci-77499</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e460ii\" class=\"tag known\" rel=\"nofollow\">E460ii</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sorbet-cassis\" class=\"tag user_defined\" rel=\"nofollow\">fr:sorbet-cassis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/barley-flakes\" class=\"tag known\" rel=\"nofollow\">Barley flakes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/we-ve-been-proudly-making-them-for-over-a-hundred-years-by-staying-true-to-our-secret-irish-recipe-we-create-that-delicious-d-enjoy-o-cook-packaging-at-oven-to-190-c\" class=\"tag user_defined\" rel=\"nofollow\">we-ve-been-proudly-making-them-for-over-a-hundred-years-by-staying-true-to-our-secret-irish-recipe-we-create-that-delicious-d-enjoy-o-cook-packaging-at-oven-to-190-c</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:haricots-rouges-kidney\" class=\"tag user_defined\" rel=\"nofollow\">fr:haricots-rouges-kidney</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:glucose-de-ble\" class=\"tag known\" rel=\"nofollow\">fr:Glucose de blé</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ci-77891\" class=\"tag user_defined\" rel=\"nofollow\">ci-77891</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/and-we-should-do\" class=\"tag user_defined\" rel=\"nofollow\">and-we-should-do</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:amidon-modificat-din-cartofi\" class=\"tag user_defined\" rel=\"nofollow\">ro:amidon-modificat-din-cartofi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mungbohnenst%C3%A4rke\" class=\"tag user_defined\" rel=\"nofollow\">de:mungbohnenstärke</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-a-base-de-concentre-et-extraits-de-citron\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-a-base-de-concentre-et-extraits-de-citron</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/flakes\" class=\"tag user_defined\" rel=\"nofollow\">flakes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/phosphate\" class=\"tag known\" rel=\"nofollow\">Phosphate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/comte\" class=\"tag known\" rel=\"nofollow\">Comté</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hco-420\" class=\"tag user_defined\" rel=\"nofollow\">hco-420</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:demi-gras\" class=\"tag user_defined\" rel=\"nofollow\">fr:demi-gras</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cheese-sauce\" class=\"tag known\" rel=\"nofollow\">Cheese sauce</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:rindflesh\" class=\"tag user_defined\" rel=\"nofollow\">de:rindflesh</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:enth%C3%A4lt-senfmehl\" class=\"tag user_defined\" rel=\"nofollow\">de:enthält-senfmehl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rock-salt\" class=\"tag known\" rel=\"nofollow\">Rock salt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coconut-chips\" class=\"tag known\" rel=\"nofollow\">Coconut chips</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melange-de-13-herbes-ricola-comme-extrait-25mg\" class=\"tag user_defined\" rel=\"nofollow\">fr:melange-de-13-herbes-ricola-comme-extrait-25mg</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:irlande\" class=\"tag user_defined\" rel=\"nofollow\">fr:irlande</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fresh-butter\" class=\"tag known\" rel=\"nofollow\">Fresh butter</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/habanero-chili\" class=\"tag known\" rel=\"nofollow\">Habanero chili</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:semi-di-colza\" class=\"tag user_defined\" rel=\"nofollow\">it:semi-di-colza</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cocoa-butter-cocoa-mass\" class=\"tag user_defined\" rel=\"nofollow\">cocoa-butter-cocoa-mass</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:b%C3%BCffelmilchmozzarella\" class=\"tag user_defined\" rel=\"nofollow\">de:büffelmilchmozzarella</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BC%D0%B5%D1%81%D1%8C-%D0%BF%D1%80%D1%8F%D0%BD%D0%BE%D1%81%D1%82%D0%B5%D0%B9-%D0%B4%D0%BB%D1%8F-%D0%BA%D0%BE%D1%80%D0%B5%D0%B9%D1%81%D0%BA%D0%B8%D1%85-%D1%81%D0%B0%D0%BB%D0%B0%D1%82%D0%BE%D0%B2\" class=\"tag user_defined\" rel=\"nofollow\">ru:смесь-пряностей-для-корейских-салатов</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-grape-juice\" class=\"tag known\" rel=\"nofollow\">White grape juice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/essentjele-olie-van-piedmontese-pepermunt\" class=\"tag user_defined\" rel=\"nofollow\">essentjele-olie-van-piedmontese-pepermunt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:peches-en-atlantique-nord-est\" class=\"tag user_defined\" rel=\"nofollow\">fr:peches-en-atlantique-nord-est</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/calf-rennet\" class=\"tag known\" rel=\"nofollow\">Calf rennet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:legume-%C8%99i-extracte-de-legume\" class=\"tag user_defined\" rel=\"nofollow\">ro:legume-și-extracte-de-legume</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:1-demi-kiwi-mixe\" class=\"tag user_defined\" rel=\"nofollow\">fr:1-demi-kiwi-mixe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/no:meierism%C3%B8r\" class=\"tag user_defined\" rel=\"nofollow\">no:meierismør</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zinc-oxide\" class=\"tag known\" rel=\"nofollow\">Zinc oxide</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:carmel-ordinaire\" class=\"tag user_defined\" rel=\"nofollow\">fr:carmel-ordinaire</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:farine-de-riz\" class=\"tag user_defined\" rel=\"nofollow\">it:farine-de-riz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miel-de-fleurs-sauvages-recolte-en-france\" class=\"tag user_defined\" rel=\"nofollow\">fr:miel-de-fleurs-sauvages-recolte-en-france</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:versez-le-contenu-dans-un-plat-pour-micro-ondes-et-couvrez-i-minute\" class=\"tag user_defined\" rel=\"nofollow\">fr:versez-le-contenu-dans-un-plat-pour-micro-ondes-et-couvrez-i-minute</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:rapport-collagene-sur-proteines-de-viande-inferieur-a\" class=\"tag user_defined\" rel=\"nofollow\">fr:rapport-collagene-sur-proteines-de-viande-inferieur-a</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:malt-de-millet\" class=\"tag user_defined\" rel=\"nofollow\">fr:malt-de-millet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:amidon-de-pomme-de-terres-sel\" class=\"tag user_defined\" rel=\"nofollow\">fr:amidon-de-pomme-de-terres-sel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-grain-spelt-flakes\" class=\"tag known\" rel=\"nofollow\">Whole grain spelt flakes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miel-de-citronnier\" class=\"tag known\" rel=\"nofollow\">fr:Miel de citronnier</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tagliatelle\" class=\"tag known\" rel=\"nofollow\">Tagliatelle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gorge-de-porc\" class=\"tag known\" rel=\"nofollow\">fr:Gorge de porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:malto-d-orzo-solubile\" class=\"tag user_defined\" rel=\"nofollow\">it:malto-d-orzo-solubile</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:calibre-gros\" class=\"tag user_defined\" rel=\"nofollow\">fr:calibre-gros</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gorge-de-porc-issue-de-porc-du-sud-ouest\" class=\"tag user_defined\" rel=\"nofollow\">fr:gorge-de-porc-issue-de-porc-du-sud-ouest</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ail-poudre\" class=\"tag user_defined\" rel=\"nofollow\">fr:ail-poudre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kr%C3%A4utermarinade\" class=\"tag user_defined\" rel=\"nofollow\">de:kräutermarinade</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:9-farine-de-sarrasin\" class=\"tag user_defined\" rel=\"nofollow\">fr:9-farine-de-sarrasin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:echalote-basilic\" class=\"tag user_defined\" rel=\"nofollow\">fr:echalote-basilic</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:para-elaborar-100-g-de-producto\" class=\"tag user_defined\" rel=\"nofollow\">es:para-elaborar-100-g-de-producto</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E8%91%B5%E8%8A%B1%E6%B2%B9\" class=\"tag user_defined\" rel=\"nofollow\">zh:葵花油</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pt:pode-conter\" class=\"tag user_defined\" rel=\"nofollow\">pt:pode-conter</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:germe-riz\" class=\"tag user_defined\" rel=\"nofollow\">fr:germe-riz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/millet-seed\" class=\"tag known\" rel=\"nofollow\">Millet seed</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/waarvan-suikers\" class=\"tag user_defined\" rel=\"nofollow\">waarvan-suikers</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:farine-de-mais\" class=\"tag user_defined\" rel=\"nofollow\">it:farine-de-mais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/shortcrust-dough\" class=\"tag known\" rel=\"nofollow\">Shortcrust dough</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:antioxidant\" class=\"tag user_defined\" rel=\"nofollow\">fr:antioxidant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:flocons-de-sarrasin-complet-precuits-a-la-vapeur\" class=\"tag user_defined\" rel=\"nofollow\">fr:flocons-de-sarrasin-complet-precuits-a-la-vapeur</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fromage-blanc-a-0-de-matiere-grasse\" class=\"tag user_defined\" rel=\"nofollow\">fr:fromage-blanc-a-0-de-matiere-grasse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:585882-se-587888-cw\" class=\"tag user_defined\" rel=\"nofollow\">fr:585882-se-587888-cw</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:suola\" class=\"tag user_defined\" rel=\"nofollow\">nb:suola</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:3-nel-prodotto-finito\" class=\"tag user_defined\" rel=\"nofollow\">it:3-nel-prodotto-finito</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mer-du-nord\" class=\"tag user_defined\" rel=\"nofollow\">fr:mer-du-nord</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/la:helix-pomatia\" class=\"tag known\" rel=\"nofollow\">la:Helix pomatia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cellulose-de-methyle\" class=\"tag user_defined\" rel=\"nofollow\">fr:cellulose-de-methyle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cooked-pasta\" class=\"tag known\" rel=\"nofollow\">Cooked pasta</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/concentrated-mushroom-juice\" class=\"tag known\" rel=\"nofollow\">Concentrated mushroom juice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:buchenholzreiberauch\" class=\"tag user_defined\" rel=\"nofollow\">de:buchenholzreiberauch</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-de-riz-8\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-de-riz-8</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/origan\" class=\"tag user_defined\" rel=\"nofollow\">origan</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:amidons-modifies-de-mais-et-de-pomme-de-terre\" class=\"tag known\" rel=\"nofollow\">fr:Amidons modifiés de maïs et de pomme de terre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/starter-culture\" class=\"tag user_defined\" rel=\"nofollow\">starter-culture</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:zestes-et-jus-de-citron-frais\" class=\"tag user_defined\" rel=\"nofollow\">fr:zestes-et-jus-de-citron-frais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:specialite-cerealiere\" class=\"tag user_defined\" rel=\"nofollow\">fr:specialite-cerealiere</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sorbet-framboise\" class=\"tag user_defined\" rel=\"nofollow\">fr:sorbet-framboise</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:des-ingredients-sont\" class=\"tag user_defined\" rel=\"nofollow\">fr:des-ingredients-sont</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:epaule\" class=\"tag user_defined\" rel=\"nofollow\">fr:epaule</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e957\" class=\"tag known\" rel=\"nofollow\">E957</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sans-graisses-hydroge\" class=\"tag user_defined\" rel=\"nofollow\">fr:sans-graisses-hydroge</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%85%D0%BB%D0%BE%D0%BF%D1%8C%D1%8F-%D0%BF%D1%88%D0%B5%D0%BD%D0%B8%D1%87%D0%BD%D1%8B%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:хлопья-пшеничные</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/monoglycerides-of-fatty-acids\" class=\"tag user_defined\" rel=\"nofollow\">monoglycerides-of-fatty-acids</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rabbit\" class=\"tag known\" rel=\"nofollow\">Rabbit</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cyenne\" class=\"tag user_defined\" rel=\"nofollow\">fr:cyenne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:orangensaft-aus-orangen\" class=\"tag user_defined\" rel=\"nofollow\">de:orangensaft-aus-orangen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:agent\" class=\"tag user_defined\" rel=\"nofollow\">fr:agent</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:getr%C3%A4nkegrundstoff\" class=\"tag user_defined\" rel=\"nofollow\">de:getränkegrundstoff</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:adulcoranti\" class=\"tag user_defined\" rel=\"nofollow\">it:adulcoranti</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/acerola-juice\" class=\"tag known\" rel=\"nofollow\">Acerola juice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:m\" class=\"tag user_defined\" rel=\"nofollow\">fr:m</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:yaourt-0-de-matieres-grasses\" class=\"tag user_defined\" rel=\"nofollow\">fr:yaourt-0-de-matieres-grasses</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D0%BA%D0%B8-%D0%B0%D0%BF%D0%B5%D0%BB%D1%8C%D1%81%D0%B8%D0%BD%D0%B0-%D0%B8-%D0%BC%D0%B0%D0%BD%D0%B3%D0%BE-%D0%BA%D0%BE%D0%BD%D1%86%D0%B5%D0%BD%D1%82%D1%80%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:соки-апельсина-и-манго-концентрированные</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:881u\" class=\"tag user_defined\" rel=\"nofollow\">fr:881u</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:syringa-vulgaris\" class=\"tag user_defined\" rel=\"nofollow\">fr:syringa-vulgaris</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-et-puree-d-abricot\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-et-puree-d-abricot</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sirop-de-malitol\" class=\"tag user_defined\" rel=\"nofollow\">fr:sirop-de-malitol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:s%C3%BC%C3%9Fungsmittel-natriumcyclamat-und-natriumsaccharin\" class=\"tag user_defined\" rel=\"nofollow\">de:süßungsmittel-natriumcyclamat-und-natriumsaccharin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:no-ingredienser\" class=\"tag user_defined\" rel=\"nofollow\">nb:no-ingredienser</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:getrocknete\" class=\"tag user_defined\" rel=\"nofollow\">de:getrocknete</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pearl-barley\" class=\"tag known\" rel=\"nofollow\">Pearl barley</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n";

    public static String split20 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/ci-77491\" class=\"tag user_defined\" rel=\"nofollow\">ci-77491</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gefriergetrocknete-sanddornbeeren\" class=\"tag user_defined\" rel=\"nofollow\">de:gefriergetrocknete-sanddornbeeren</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/contains-less-than-1-of\" class=\"tag user_defined\" rel=\"nofollow\">contains-less-than-1-of</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/weinessig\" class=\"tag user_defined\" rel=\"nofollow\">weinessig</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:nat%C3%BCrliches-mineralwasser-mit-eigener-quellkohlens%C3%A4ure-versetzt\" class=\"tag user_defined\" rel=\"nofollow\">de:natürliches-mineralwasser-mit-eigener-quellkohlensäure-versetzt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:getamo\" class=\"tag user_defined\" rel=\"nofollow\">fr:getamo</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:oignons-frits-et-sauce-facon-cocktail\" class=\"tag user_defined\" rel=\"nofollow\">fr:oignons-frits-et-sauce-facon-cocktail</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fond\" class=\"tag known\" rel=\"nofollow\">Fond</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:latte-parzialmente-scremato-uht-a-lunga-conservazione\" class=\"tag user_defined\" rel=\"nofollow\">it:latte-parzialmente-scremato-uht-a-lunga-conservazione</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/salted-butter-caramel\" class=\"tag known\" rel=\"nofollow\">Salted butter caramel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%B0%D1%81%D0%BB%D0%BE-%D0%BF%D0%BE%D0%B4%D1%81%D0%BE%D0%BB%D0%BD%D0%B5%D1%87%D0%BD%D0%BE%D0%B5-%D1%80%D0%B0%D1%84%D0%B8%D0%BD%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5%D0%B4%D0%B5%D0%B7%D0%BE%D0%B4%D0%BE%D1%80%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5\" class=\"tag user_defined\" rel=\"nofollow\">ru:масло-подсолнечное-рафинированноедезодорированное</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sauce-blanche\" class=\"tag known\" rel=\"nofollow\">fr:Sauce blanche</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:bisque-de-homard\" class=\"tag user_defined\" rel=\"nofollow\">fr:bisque-de-homard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:5-protelnes\" class=\"tag user_defined\" rel=\"nofollow\">fr:5-protelnes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:vanilin\" class=\"tag user_defined\" rel=\"nofollow\">de:vanilin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e501ii\" class=\"tag known\" rel=\"nofollow\">E501ii</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:kcofr-fat-2-g\" class=\"tag user_defined\" rel=\"nofollow\">fr:kcofr-fat-2-g</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:traces\" class=\"tag user_defined\" rel=\"nofollow\">fr:traces</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miel-toutes-fleurs\" class=\"tag known\" rel=\"nofollow\">fr:Miel toutes fleurs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D1%83%D1%85%D0%BE%D0%B9-%D0%B3%D0%BB%D1%8E%D0%BA%D0%BE%D0%B7%D0%BD%D1%8B%D0%B9-%D1%81%D0%B8%D1%80%D0%BE%D0%BF\" class=\"tag user_defined\" rel=\"nofollow\">ru:сухой-глюкозный-сироп</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:foly%C3%A9kony-f%C3%BCstaroma\" class=\"tag user_defined\" rel=\"nofollow\">hu:folyékony-füstaroma</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:riso-fino\" class=\"tag user_defined\" rel=\"nofollow\">it:riso-fino</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:couenne-et-gras-de-porc-issus-d-animaux-nourris-sans-ogm\" class=\"tag user_defined\" rel=\"nofollow\">fr:couenne-et-gras-de-porc-issus-d-animaux-nourris-sans-ogm</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sucre-de-canne-fermente\" class=\"tag user_defined\" rel=\"nofollow\">fr:sucre-de-canne-fermente</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BA%D0%B0%D0%BC%D0%B5%D0%B4%D1%8C-%D1%82%D0%B0%D1%80%D1%8B\" class=\"tag user_defined\" rel=\"nofollow\">ru:камедь-тары</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/flower-honey\" class=\"tag known\" rel=\"nofollow\">Flower honey</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huile-d-olive-de-categorie-superieure\" class=\"tag user_defined\" rel=\"nofollow\">fr:huile-d-olive-de-categorie-superieure</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:johannesbrotkernmehl\" class=\"tag user_defined\" rel=\"nofollow\">de:johannesbrotkernmehl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sirop-de-glucose-caramelise\" class=\"tag user_defined\" rel=\"nofollow\">fr:sirop-de-glucose-caramelise</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/20%E2%84%85\" class=\"tag user_defined\" rel=\"nofollow\">20℅</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ravioli\" class=\"tag known\" rel=\"nofollow\">Ravioli</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/produced-in-the-campolungo-industrial-zone-plant\" class=\"tag user_defined\" rel=\"nofollow\">produced-in-the-campolungo-industrial-zone-plant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-de-poisson\" class=\"tag known\" rel=\"nofollow\">fr:Extrait de poisson</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/gomme-adragante\" class=\"tag user_defined\" rel=\"nofollow\">gomme-adragante</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:iactat-de-potasiu\" class=\"tag user_defined\" rel=\"nofollow\">ro:iactat-de-potasiu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/filtered-whey-powder\" class=\"tag known\" rel=\"nofollow\">Filtered whey powder</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-ecreme-0\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-ecreme-0</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gr%C3%BCn\" class=\"tag user_defined\" rel=\"nofollow\">de:grün</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:m%C3%BCffelmilch\" class=\"tag user_defined\" rel=\"nofollow\">de:müffelmilch</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:copertura-al-cacao-magro\" class=\"tag user_defined\" rel=\"nofollow\">it:copertura-al-cacao-magro</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/copra-fat\" class=\"tag user_defined\" rel=\"nofollow\">copra-fat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:citrique-e330\" class=\"tag user_defined\" rel=\"nofollow\">fr:citrique-e330</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D0%B0%D0%BB%D0%B8%D0%BD%D0%B0-%D1%81%D0%B2%D0%B5%D0%B6%D0%B0%D1%8F-%D0%B8%D0%BF%D0%B8-%D0%B1%D1%8B%D1%81%D1%82%D1%80%D0%BE%D0%B7%D0%B0%D0%BC%D0%BE%D1%80%D0%BE%D0%B6%D0%B5%D0%BD%D0%BD%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:малина-свежая-ипи-быстрозамороженная</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ingredient\" class=\"tag user_defined\" rel=\"nofollow\">fr:ingredient</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:trennmittel-magnesiumsalze-von-speisefetts%C3%A4uren\" class=\"tag user_defined\" rel=\"nofollow\">de:trennmittel-magnesiumsalze-von-speisefettsäuren</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/omelette\" class=\"tag known\" rel=\"nofollow\">Omelette</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tf-ffist\" class=\"tag user_defined\" rel=\"nofollow\">fr:tf-ffist</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cocoa-processed-with-alkali\" class=\"tag known\" rel=\"nofollow\">Cocoa processed with alkali</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-coating\" class=\"tag user_defined\" rel=\"nofollow\">white-coating</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/treated-with-ethyl-alcohol-on-the-surface\" class=\"tag user_defined\" rel=\"nofollow\">treated-with-ethyl-alcohol-on-the-surface</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:levure-sans-ogm\" class=\"tag user_defined\" rel=\"nofollow\">fr:levure-sans-ogm</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:flocons-de-ble-malte\" class=\"tag known\" rel=\"nofollow\">fr:Flocons de blé malté</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/linden\" class=\"tag known\" rel=\"nofollow\">Linden</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:maltodextine\" class=\"tag user_defined\" rel=\"nofollow\">fr:maltodextine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lait-des-alpes\" class=\"tag user_defined\" rel=\"nofollow\">fr:lait-des-alpes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:sare-mare\" class=\"tag user_defined\" rel=\"nofollow\">ro:sare-mare</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:bref-not-germon-oriain-important\" class=\"tag user_defined\" rel=\"nofollow\">it:bref-not-germon-oriain-important</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B2%D1%8B%D1%81%D1%83%D1%88%D0%B5%D0%BD%D0%BD%D0%B0%D1%8F-%D0%BF%D1%88%D0%B5%D0%BD%D0%B8%D1%87%D0%BD%D0%B0%D1%8F-%D0%BC%D1%83%D0%BA%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:высушенная-пшеничная-мука</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sel-arome-cacao\" class=\"tag user_defined\" rel=\"nofollow\">fr:sel-arome-cacao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/importe\" class=\"tag user_defined\" rel=\"nofollow\">importe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melange-de-fruits\" class=\"tag user_defined\" rel=\"nofollow\">fr:melange-de-fruits</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:conseil-de-conservation-craint-la-chaleur-et-l-humidite\" class=\"tag user_defined\" rel=\"nofollow\">it:conseil-de-conservation-craint-la-chaleur-et-l-humidite</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BC%D0%B5%D1%81%D1%8C-%D0%B7%D0%B5%D1%80%D0%BD%D0%BE%D0%B2%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:смесь-зерновая</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gek%C3%B6rnte-br%C3%BChe\" class=\"tag user_defined\" rel=\"nofollow\">de:gekörnte-brühe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:joghurt-mild-7\" class=\"tag user_defined\" rel=\"nofollow\">de:joghurt-mild-7</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:pane-di-farina-tipo-0\" class=\"tag user_defined\" rel=\"nofollow\">it:pane-di-farina-tipo-0</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:dextrose\" class=\"tag user_defined\" rel=\"nofollow\">nb:dextrose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-concentre-de-ginseng\" class=\"tag user_defined\" rel=\"nofollow\">fr:extrait-concentre-de-ginseng</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:aromes-poudre-d-oignon\" class=\"tag user_defined\" rel=\"nofollow\">fr:aromes-poudre-d-oignon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:stearoyl-2-iactylate-de-sodium\" class=\"tag user_defined\" rel=\"nofollow\">fr:stearoyl-2-iactylate-de-sodium</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:algue-calcaire-lithothamnium-calcareum\" class=\"tag user_defined\" rel=\"nofollow\">fr:algue-calcaire-lithothamnium-calcareum</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:coac%C4%83ze-negre-deshidratate\" class=\"tag user_defined\" rel=\"nofollow\">ro:coacăze-negre-deshidratate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-33-mg\" class=\"tag user_defined\" rel=\"nofollow\">fr:creme-33-mg</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huile-vierge-de-tournesol\" class=\"tag user_defined\" rel=\"nofollow\">fr:huile-vierge-de-tournesol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B8%D0%B7%D0%B3%D0%BE%D1%82%D0%BE%D0%B2%D0%BB%D0%B5%D0%BD-%D0%B8%D0%B7-%D0%BA%D0%BE%D0%BD%D1%86%D0%B5%D0%BD%D1%82%D1%80%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B3%D0%BE-%D1%81%D0%BE%D0%BA%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:изготовлен-из-концентрированного-сока</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:vanilin\" class=\"tag user_defined\" rel=\"nofollow\">nb:vanilin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:6-et-celeri-feuille\" class=\"tag user_defined\" rel=\"nofollow\">fr:6-et-celeri-feuille</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/citron\" class=\"tag user_defined\" rel=\"nofollow\">citron</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/eau-de-vie\" class=\"tag known\" rel=\"nofollow\">Eau de vie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:in-der-creme\" class=\"tag user_defined\" rel=\"nofollow\">de:in-der-creme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cette-puree-peut-etre-consommee\" class=\"tag user_defined\" rel=\"nofollow\">fr:cette-puree-peut-etre-consommee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:perles-de-sucre\" class=\"tag user_defined\" rel=\"nofollow\">fr:perles-de-sucre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soft-wheat-flour-type\" class=\"tag user_defined\" rel=\"nofollow\">soft-wheat-flour-type</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:muscade-dont-lait\" class=\"tag user_defined\" rel=\"nofollow\">fr:muscade-dont-lait</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BF%D0%B8%D1%89%D0%B5%D0%B2%D1%8B%D0%B5-%D0%B4%D0%BE%D0%B1%D0%B0%D0%B2%D0%BA%D0%B8\" class=\"tag user_defined\" rel=\"nofollow\">ru:пищевые-добавки</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pasteurized-free-range-egg-sugar-blueberries\" class=\"tag user_defined\" rel=\"nofollow\">pasteurized-free-range-egg-sugar-blueberries</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/seasalt\" class=\"tag user_defined\" rel=\"nofollow\">seasalt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tron\" class=\"tag user_defined\" rel=\"nofollow\">tron</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/contient-des-cereales-contenant-du-gluten\" class=\"tag user_defined\" rel=\"nofollow\">contient-des-cereales-contenant-du-gluten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:vollmilchschokolade%C3%BCberzug\" class=\"tag user_defined\" rel=\"nofollow\">de:vollmilchschokoladeüberzug</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:vete-gluten\" class=\"tag user_defined\" rel=\"nofollow\">sv:vete-gluten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pl:pieprz-czarny-mielony\" class=\"tag user_defined\" rel=\"nofollow\">pl:pieprz-czarny-mielony</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:si-k\" class=\"tag user_defined\" rel=\"nofollow\">fr:si-k</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:puree-d-ognons\" class=\"tag user_defined\" rel=\"nofollow\">fr:puree-d-ognons</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mango-nettle\" class=\"tag user_defined\" rel=\"nofollow\">mango-nettle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sour-cream-powder\" class=\"tag known\" rel=\"nofollow\">Sour cream powder</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:surgele\" class=\"tag user_defined\" rel=\"nofollow\">fr:surgele</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:rote-gem%C3%BCsepaprika\" class=\"tag user_defined\" rel=\"nofollow\">de:rote-gemüsepaprika</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eau-minerale-naturelle-gazeifiee-faustine\" class=\"tag user_defined\" rel=\"nofollow\">fr:eau-minerale-naturelle-gazeifiee-faustine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dextrine-de-pommes-de-terre\" class=\"tag user_defined\" rel=\"nofollow\">fr:dextrine-de-pommes-de-terre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:in-scheiben\" class=\"tag user_defined\" rel=\"nofollow\">de:in-scheiben</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/apple-pieces\" class=\"tag known\" rel=\"nofollow\">Apple pieces</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mindestens-48-0179947-472-fett-i-tr\" class=\"tag user_defined\" rel=\"nofollow\">de:mindestens-48-0179947-472-fett-i-tr</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:graisses-vegetales-non-hydrogenees-de-palme-et-de-coprah\" class=\"tag user_defined\" rel=\"nofollow\">fr:graisses-vegetales-non-hydrogenees-de-palme-et-de-coprah</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:flocons-d-epeautre\" class=\"tag known\" rel=\"nofollow\">fr:Flocons d'épeautre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n";

    public static String split17 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/acqua\" class=\"tag user_defined\" rel=\"nofollow\">acqua</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:sm%C3%A2nt%C3%A2n%C4%83-praf\" class=\"tag user_defined\" rel=\"nofollow\">ro:smântână-praf</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:emulsionnant\" class=\"tag user_defined\" rel=\"nofollow\">fr:emulsionnant</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cherry-juice\" class=\"tag known\" rel=\"nofollow\">Cherry juice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/poultry-broth\" class=\"tag known\" rel=\"nofollow\">Poultry broth</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-concentre-d-ananas\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-concentre-d-ananas</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:t%C5%91kehalm%C3%A1j\" class=\"tag user_defined\" rel=\"nofollow\">hu:tőkehalmáj</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:0-8-9\" class=\"tag user_defined\" rel=\"nofollow\">fr:0-8-9</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/for-freshness\" class=\"tag user_defined\" rel=\"nofollow\">for-freshness</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/extra-mature-cheddar\" class=\"tag known\" rel=\"nofollow\">Extra mature cheddar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/argentine-shortfin-squid\" class=\"tag known\" rel=\"nofollow\">Argentine shortfin squid</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:teneur-en-legumes\" class=\"tag user_defined\" rel=\"nofollow\">fr:teneur-en-legumes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/espelette-chili-pepper\" class=\"tag known\" rel=\"nofollow\">Espelette chili pepper</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:halbfettstufe\" class=\"tag user_defined\" rel=\"nofollow\">de:halbfettstufe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:orange-douce\" class=\"tag user_defined\" rel=\"nofollow\">fr:orange-douce</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/varietal\" class=\"tag known\" rel=\"nofollow\">Varietal</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/glucose-fructose\" class=\"tag known\" rel=\"nofollow\">Glucose-fructose</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/retinyl-palmitate\" class=\"tag known\" rel=\"nofollow\">Retinyl palmitate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:graines-de-soja-depelliculees\" class=\"tag user_defined\" rel=\"nofollow\">fr:graines-de-soja-depelliculees</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-de-mais-lt\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-de-mais-lt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:emulgator-lecitnine\" class=\"tag user_defined\" rel=\"nofollow\">de:emulgator-lecitnine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/coriander-flake\" class=\"tag user_defined\" rel=\"nofollow\">coriander-flake</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/glutinous-rice\" class=\"tag known\" rel=\"nofollow\">Glutinous rice</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:epeautre-complet\" class=\"tag user_defined\" rel=\"nofollow\">fr:epeautre-complet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/palmisti-and-illipe\" class=\"tag user_defined\" rel=\"nofollow\">palmisti-and-illipe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%81%D0%BE%D0%BA-%D0%BC%D0%B0%D0%BB%D0%B8%D0%BD%D1%8B-%D0%BA%D0%BE%D0%BD%D1%86%D0%B5%D0%BD%D1%82%D1%80%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:сок-малины-концентрированный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huile-de-cocot\" class=\"tag user_defined\" rel=\"nofollow\">fr:huile-de-cocot</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/calcium-pantothenate\" class=\"tag known\" rel=\"nofollow\">Calcium pantothenate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:sorbital\" class=\"tag user_defined\" rel=\"nofollow\">sv:sorbital</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pertoog\" class=\"tag user_defined\" rel=\"nofollow\">fr:pertoog</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:orzo-solubile\" class=\"tag user_defined\" rel=\"nofollow\">it:orzo-solubile</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/dried-fig\" class=\"tag known\" rel=\"nofollow\">Dried fig</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:vin-d-alsace-riesling\" class=\"tag user_defined\" rel=\"nofollow\">fr:vin-d-alsace-riesling</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chlorophylle-cuivrique\" class=\"tag user_defined\" rel=\"nofollow\">chlorophylle-cuivrique</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:lucker\" class=\"tag user_defined\" rel=\"nofollow\">de:lucker</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:viande-et-george-de-porc\" class=\"tag user_defined\" rel=\"nofollow\">fr:viande-et-george-de-porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/turkey-breast\" class=\"tag known\" rel=\"nofollow\">Turkey breast</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:jogurt-mild-as-entrahmter-milch\" class=\"tag user_defined\" rel=\"nofollow\">de:jogurt-mild-as-entrahmter-milch</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/77\" class=\"tag user_defined\" rel=\"nofollow\">77</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:1-kg\" class=\"tag user_defined\" rel=\"nofollow\">nb:1-kg</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:gluten-de-ble\" class=\"tag user_defined\" rel=\"nofollow\">it:gluten-de-ble</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:leche-concentrada-reconstituida\" class=\"tag user_defined\" rel=\"nofollow\">es:leche-concentrada-reconstituida</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ceylon-cinnamon\" class=\"tag known\" rel=\"nofollow\">Ceylon cinnamon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ig-stion-preservatives\" class=\"tag user_defined\" rel=\"nofollow\">ig-stion-preservatives</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:puo-contenere-tracce-di-altra-frutta-a-guscio\" class=\"tag user_defined\" rel=\"nofollow\">it:puo-contenere-tracce-di-altra-frutta-a-guscio</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:icre-hering\" class=\"tag user_defined\" rel=\"nofollow\">ro:icre-hering</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/poudre-de-lait-ecreme\" class=\"tag user_defined\" rel=\"nofollow\">poudre-de-lait-ecreme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e340i\" class=\"tag known\" rel=\"nofollow\">E340i</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vimto-flavouring\" class=\"tag user_defined\" rel=\"nofollow\">vimto-flavouring</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n";


    public static String split18 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:o-ainekset\" class=\"tag user_defined\" rel=\"nofollow\">nb:o-ainekset</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B1%D0%B0%D0%BA%D1%82%D0%B5%D1%80%D0%B8%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:бактериальный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/propylene-carbonate\" class=\"tag user_defined\" rel=\"nofollow\">propylene-carbonate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:miel-d-oranger-de-valencia-originaire\" class=\"tag user_defined\" rel=\"nofollow\">fr:miel-d-oranger-de-valencia-originaire</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cardamom-seed\" class=\"tag known\" rel=\"nofollow\">Cardamom seed</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/breadmeal\" class=\"tag known\" rel=\"nofollow\">Breadmeal</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:gamberetti-boreali-pandalus-borealis\" class=\"tag user_defined\" rel=\"nofollow\">it:gamberetti-boreali-pandalus-borealis</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:n%C3%B6tk%C3%B6ttextrakt\" class=\"tag user_defined\" rel=\"nofollow\">sv:nötköttextrakt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-concentre-de-fruits-rouges\" class=\"tag known\" rel=\"nofollow\">fr:Jus concentré de fruits rouges</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:fain%C4%83-de-gr%C3%A2u\" class=\"tag user_defined\" rel=\"nofollow\">ro:faină-de-grâu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:conjonctif-de-porc\" class=\"tag user_defined\" rel=\"nofollow\">fr:conjonctif-de-porc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tenir-au-frais-et-au-sec\" class=\"tag user_defined\" rel=\"nofollow\">fr:tenir-au-frais-et-au-sec</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jus-de-citrons-bonne-maman-buckes-durt-sucpe-pares-proences-59-g-concentre\" class=\"tag user_defined\" rel=\"nofollow\">fr:jus-de-citrons-bonne-maman-buckes-durt-sucpe-pares-proences-59-g-concentre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dextrose-sel-vinaigre-vinaigre-de-vin-persil-moutarde\" class=\"tag user_defined\" rel=\"nofollow\">fr:dextrose-sel-vinaigre-vinaigre-de-vin-persil-moutarde</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/very-fine-green-beans\" class=\"tag known\" rel=\"nofollow\">Very fine green beans</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/garlic-extract\" class=\"tag known\" rel=\"nofollow\">Garlic extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:gamberetti-in-salamoia\" class=\"tag user_defined\" rel=\"nofollow\">it:gamberetti-in-salamoia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cocos\" class=\"tag user_defined\" rel=\"nofollow\">cocos</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E4%B9%B3%E5%8C%96%E5%8A%91\" class=\"tag user_defined\" rel=\"nofollow\">zh:乳化劑</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:19-fettreducerad-kakao\" class=\"tag user_defined\" rel=\"nofollow\">nb:19-fettreducerad-kakao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:ulei-vegetal-nehidrogenat-de-palmier\" class=\"tag user_defined\" rel=\"nofollow\">ro:ulei-vegetal-nehidrogenat-de-palmier</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tapioca-syrup\" class=\"tag known\" rel=\"nofollow\">Tapioca syrup</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n";

    public static String split19 = "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:le-chocolat-utilise-est-un-chocolat-pur-beurre-de-cacao\" class=\"tag user_defined\" rel=\"nofollow\">fr:le-chocolat-utilise-est-un-chocolat-pur-beurre-de-cacao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/meadowsweet\" class=\"tag known\" rel=\"nofollow\">Meadowsweet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:sojaeiweib-lsolat\" class=\"tag user_defined\" rel=\"nofollow\">de:sojaeiweib-lsolat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:c02-agent-de-carbonatation-iv-colorant-acide-citique-regulateur-de-l-acidite-benzoate-de-sodium-agent-de-conservation\" class=\"tag user_defined\" rel=\"nofollow\">fr:c02-agent-de-carbonatation-iv-colorant-acide-citique-regulateur-de-l-acidite-benzoate-de-sodium-agent-de-conservation</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/actual\" class=\"tag user_defined\" rel=\"nofollow\">actual</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:%C3%A9tel%C3%ADzes%C3%ADt%C5%91\" class=\"tag user_defined\" rel=\"nofollow\">hu:ételízesítő</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/roasted-coffee\" class=\"tag known\" rel=\"nofollow\">Roasted coffee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-de-ble-malte-toaste-lt\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-de-ble-malte-toaste-lt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:colza-et-dans-des\" class=\"tag user_defined\" rel=\"nofollow\">fr:colza-et-dans-des</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/less-than\" class=\"tag user_defined\" rel=\"nofollow\">less-than</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:minimum-dans-le-chocolat-au-lait-cacao\" class=\"tag user_defined\" rel=\"nofollow\">fr:minimum-dans-le-chocolat-au-lait-cacao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/matieres-grasses\" class=\"tag user_defined\" rel=\"nofollow\">matieres-grasses</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bolognese-sauce\" class=\"tag known\" rel=\"nofollow\">Bolognese sauce</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eneroie\" class=\"tag user_defined\" rel=\"nofollow\">fr:eneroie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/crudites\" class=\"tag known\" rel=\"nofollow\">Crudités</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zout-000389-le-poids-moyen-d-une-pastille-est-de\" class=\"tag user_defined\" rel=\"nofollow\">zout-000389-le-poids-moyen-d-une-pastille-est-de</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:concentre-de-carotte\" class=\"tag known\" rel=\"nofollow\">fr:Concentré de carotte</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/prebiotic-tapioca-fiber\" class=\"tag user_defined\" rel=\"nofollow\">prebiotic-tapioca-fiber</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:petales-et-feuilles-de-tournesol\" class=\"tag user_defined\" rel=\"nofollow\">fr:petales-et-feuilles-de-tournesol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:gruau-d-avoine\" class=\"tag user_defined\" rel=\"nofollow\">fr:gruau-d-avoine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:ger%C3%B4steten-erdn%C3%BCssen\" class=\"tag user_defined\" rel=\"nofollow\">de:gerôsteten-erdnüssen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:monopropylene-glycol\" class=\"tag user_defined\" rel=\"nofollow\">fr:monopropylene-glycol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:marillensaft-aus-marillensaftkonzentrat\" class=\"tag user_defined\" rel=\"nofollow\">de:marillensaft-aus-marillensaftkonzentrat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ask-a-health-professional-before-use\" class=\"tag user_defined\" rel=\"nofollow\">ask-a-health-professional-before-use</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:cystein-hydrochlorid\" class=\"tag user_defined\" rel=\"nofollow\">de:cystein-hydrochlorid</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vanilla-powder\" class=\"tag known\" rel=\"nofollow\">Vanilla powder</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/c\" class=\"tag user_defined\" rel=\"nofollow\">c</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:vova-pastorizzante\" class=\"tag user_defined\" rel=\"nofollow\">it:vova-pastorizzante</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:jaune-d-oeuf-frais\" class=\"tag known\" rel=\"nofollow\">fr:Jaune d'œuf frais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:viande-de-porc-iberique\" class=\"tag user_defined\" rel=\"nofollow\">fr:viande-de-porc-iberique</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:feh%C3%A9rbab\" class=\"tag user_defined\" rel=\"nofollow\">hu:fehérbab</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:l-histidin-hydrochlorid\" class=\"tag user_defined\" rel=\"nofollow\">de:l-histidin-hydrochlorid</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kckc\" class=\"tag user_defined\" rel=\"nofollow\">de:kckc</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-sec-lactique-degraisse\" class=\"tag user_defined\" rel=\"nofollow\">fr:extrait-sec-lactique-degraisse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:stabilisator-johannisbrotkernmehl\" class=\"tag user_defined\" rel=\"nofollow\">de:stabilisator-johannisbrotkernmehl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:tomates-semi-sechees\" class=\"tag known\" rel=\"nofollow\">fr:Tomates semi-séchées</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/charbon\" class=\"tag user_defined\" rel=\"nofollow\">charbon</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/surimi\" class=\"tag known\" rel=\"nofollow\">Surimi</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/gingerbread\" class=\"tag known\" rel=\"nofollow\">Gingerbread</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:amidon-de-nz\" class=\"tag user_defined\" rel=\"nofollow\">fr:amidon-de-nz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:bulots\" class=\"tag user_defined\" rel=\"nofollow\">fr:bulots</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mixed-e307b\" class=\"tag user_defined\" rel=\"nofollow\">mixed-e307b</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:raddryckspulver\" class=\"tag user_defined\" rel=\"nofollow\">nb:raddryckspulver</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/muesli\" class=\"tag known\" rel=\"nofollow\">Müesli</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:infusion-de-the-vert-matcha\" class=\"tag user_defined\" rel=\"nofollow\">fr:infusion-de-the-vert-matcha</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/honey-from-spain\" class=\"tag known\" rel=\"nofollow\">Honey from Spain</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:7-sonnenblumen%C3%B6l\" class=\"tag user_defined\" rel=\"nofollow\">de:7-sonnenblumenöl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:mout-de-raisin-concentre-rectifie\" class=\"tag known\" rel=\"nofollow\">fr:Moût de raisin concentré rectifié</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B7%D0%B0%D0%BC%D0%B5%D0%BD%D0%B8%D1%82%D0%B5%D0%BB%D1%8C-%D0%BC%D0%B0%D1%81%D0%BB%D0%B0-%D0%BA%D0%B0%D0%BA%D0%B0%D0%BE-%D0%BD%D0%B5%D1%82%D0%B5%D0%BC%D0%BF%D0%B5%D1%80%D0%B8%D1%80%D1%83%D0%B5%D0%BC%D1%8B%D0%B9-%D0%BB%D0%B0%D1%83%D1%80%D0%B8%D0%BD%D0%BE%D0%B2%D0%BE%D0%B3%D0%BE-%D1%82%D0%B8%D0%BF%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:заменитель-масла-какао-нетемперируемый-лауринового-типа</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ttah\" class=\"tag user_defined\" rel=\"nofollow\">ttah</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dont-13-de-chevre-dans-les-cubes-chevre\" class=\"tag user_defined\" rel=\"nofollow\">fr:dont-13-de-chevre-dans-les-cubes-chevre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:creme-de-bresse\" class=\"tag user_defined\" rel=\"nofollow\">fr:creme-de-bresse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ginger-powder\" class=\"tag known\" rel=\"nofollow\">Ginger powder</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mono-and-diglycerides-of-fatty-acids-mono-and-diacetyl-tartaric-acid-esters-of-mono-and-diglycerides-of-fatty-acids\" class=\"tag user_defined\" rel=\"nofollow\">mono-and-diglycerides-of-fatty-acids-mono-and-diacetyl-tartaric-acid-esters-of-mono-and-diglycerides-of-fatty-acids</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:blaubeersaft\" class=\"tag user_defined\" rel=\"nofollow\">de:blaubeersaft</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pl:dodatki-smakowe\" class=\"tag user_defined\" rel=\"nofollow\">pl:dodatki-smakowe</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:savany%C3%BAs%C3%A1got-szab%C3%A1lyoz%C3%B3\" class=\"tag user_defined\" rel=\"nofollow\">hu:savanyúságot-szabályozó</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mung-bean-sprout\" class=\"tag known\" rel=\"nofollow\">Mung bean sprout</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/morels\" class=\"tag known\" rel=\"nofollow\">Morels</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:chia-samen\" class=\"tag user_defined\" rel=\"nofollow\">de:chia-samen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wholemeal-rye\" class=\"tag known\" rel=\"nofollow\">Wholemeal rye</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/semi-skimmed-cow-s-milk\" class=\"tag known\" rel=\"nofollow\">Semi-skimmed cow's milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rose-water\" class=\"tag known\" rel=\"nofollow\">Rose water</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spiny-lobster\" class=\"tag known\" rel=\"nofollow\">Spiny lobster</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:natriumcitate\" class=\"tag user_defined\" rel=\"nofollow\">de:natriumcitate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:chocolat-noir-valrhona\" class=\"tag user_defined\" rel=\"nofollow\">fr:chocolat-noir-valrhona</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:eau-minerale-naturelle-ain-saiss\" class=\"tag user_defined\" rel=\"nofollow\">fr:eau-minerale-naturelle-ain-saiss</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sirop-de-fructose-a-haute-teneur\" class=\"tag user_defined\" rel=\"nofollow\">fr:sirop-de-fructose-a-haute-teneur</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:zitrus%C3%B6le\" class=\"tag user_defined\" rel=\"nofollow\">de:zitrusöle</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/silica-dimethyl-silylate\" class=\"tag user_defined\" rel=\"nofollow\">silica-dimethyl-silylate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:une-lichette-de-jus-de-citron-vert\" class=\"tag user_defined\" rel=\"nofollow\">fr:une-lichette-de-jus-de-citron-vert</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:karamellzubereitung\" class=\"tag user_defined\" rel=\"nofollow\">de:karamellzubereitung</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B1%D0%B0%D0%BA%D1%82%D0%B5%D1%80%D0%B8%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9-%D0%BA%D0%BE%D0%BD%D1%86%D0%B5%D0%BD%D1%82%D1%80%D0%B0%D1%82-5a\" class=\"tag user_defined\" rel=\"nofollow\">ru:бактериальный-концентрат-5a</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e472d\" class=\"tag known\" rel=\"nofollow\">E472d</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vanilla-ice-cream\" class=\"tag known\" rel=\"nofollow\">Vanilla ice cream</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:certifie-par-ch-blo-004\" class=\"tag user_defined\" rel=\"nofollow\">fr:certifie-par-ch-blo-004</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BA%D1%80%D0%B0%D1%81%D0%B8%D1%82%D0%B5%D0%BB%D1%8C-%CE%B2-%D0%BA%D0%B0%D1%80%D0%BE%D1%82%D0%B8%D0%BD\" class=\"tag user_defined\" rel=\"nofollow\">ru:краситель-β-каротин</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:gef%C3%BCllt-mit-feiner-candy-creme\" class=\"tag user_defined\" rel=\"nofollow\">de:gefüllt-mit-feiner-candy-creme</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BC%D1%83%D0%BA%D0%B0-%D0%B8%D0%B7-%D1%82%D0%B2%D1%91%D1%80%D0%B4%D0%BE%D0%B9-%D0%BF%D1%88%D0%B5%D0%BD%D0%B8%D1%86%D1%8B-%D0%B4%D0%BB%D1%8F-%D0%BC%D0%B0%D0%BA%D0%B0%D1%80%D0%BE%D0%BD%D0%BD%D1%8B%D1%85-%D0%B8%D0%B7%D0%B4%D0%B5%D0%BB%D0%B8%D0%B9-%D0%B2%D1%8B%D1%81%D1%88%D0%B5%D0%B3%D0%BE-%D1%81%D0%BE%D1%80%D1%82%D0%B0\" class=\"tag user_defined\" rel=\"nofollow\">ru:мука-из-твёрдой-пшеницы-для-макаронных-изделий-высшего-сорта</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:malte\" class=\"tag user_defined\" rel=\"nofollow\">fr:malte</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E7%82%AD%E9%85%B8%EF%BD%83%EF%BD%81\" class=\"tag user_defined\" rel=\"nofollow\">ja:炭酸ｃａ</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-complete-damarante\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-complete-damarante</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-de-mais-et-d-orge-maltee\" class=\"tag user_defined\" rel=\"nofollow\">fr:extrait-de-mais-et-d-orge-maltee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/verbena\" class=\"tag known\" rel=\"nofollow\">Verbena</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:abricots-secs\" class=\"tag user_defined\" rel=\"nofollow\">fr:abricots-secs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:riz-rouget\" class=\"tag user_defined\" rel=\"nofollow\">fr:riz-rouget</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:bloc-de-foie-gras-de-canard\" class=\"tag user_defined\" rel=\"nofollow\">fr:bloc-de-foie-gras-de-canard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:lentilles-vertes-precuites\" class=\"tag known\" rel=\"nofollow\">fr:Lentilles vertes précuites</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:kio-e\" class=\"tag user_defined\" rel=\"nofollow\">it:kio-e</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:farine-de-ble-t45-type-00\" class=\"tag user_defined\" rel=\"nofollow\">fr:farine-de-ble-t45-type-00</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:socker-fullh%C3%A5rdad-kokosolja\" class=\"tag user_defined\" rel=\"nofollow\">sv:socker-fullhårdad-kokosolja</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-blend\" class=\"tag known\" rel=\"nofollow\">Vegetable blend</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rice-germ\" class=\"tag user_defined\" rel=\"nofollow\">rice-germ</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mindeston\" class=\"tag user_defined\" rel=\"nofollow\">de:mindeston</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/palm-oils-kernel\" class=\"tag user_defined\" rel=\"nofollow\">palm-oils-kernel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cetate-de-dl-alpha-tocopherol\" class=\"tag user_defined\" rel=\"nofollow\">fr:cetate-de-dl-alpha-tocopherol</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:h%C3%A4hnchenfett\" class=\"tag user_defined\" rel=\"nofollow\">de:hähnchenfett</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:pavot-3396\" class=\"tag user_defined\" rel=\"nofollow\">fr:pavot-3396</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e151\" class=\"tag known\" rel=\"nofollow\">E151</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:funghi-misti\" class=\"tag user_defined\" rel=\"nofollow\">it:funghi-misti</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:euf\" class=\"tag user_defined\" rel=\"nofollow\">fr:euf</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sv:modifierat-majs\" class=\"tag user_defined\" rel=\"nofollow\">sv:modifierat-majs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:voir-goulot\" class=\"tag user_defined\" rel=\"nofollow\">fr:voir-goulot</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:preparation-mousseline\" class=\"tag user_defined\" rel=\"nofollow\">fr:preparation-mousseline</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:preparation-de-poisson-pane\" class=\"tag user_defined\" rel=\"nofollow\">fr:preparation-de-poisson-pane</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:leinsamen-hell\" class=\"tag user_defined\" rel=\"nofollow\">de:leinsamen-hell</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/rapeseed-oil-potato-starch-water-cornflour-thickener-e1422-palm-oil-dried-whey\" class=\"tag user_defined\" rel=\"nofollow\">rapeseed-oil-potato-starch-water-cornflour-thickener-e1422-palm-oil-dried-whey</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/gemiddelde-satures\" class=\"tag user_defined\" rel=\"nofollow\">gemiddelde-satures</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tarwemeel\" class=\"tag user_defined\" rel=\"nofollow\">tarwemeel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sesame-paste\" class=\"tag known\" rel=\"nofollow\">Sesame paste</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:cet-emballage-contient-8-portions-de-60g-environ\" class=\"tag user_defined\" rel=\"nofollow\">it:cet-emballage-contient-8-portions-de-60g-environ</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:soja-de-farine\" class=\"tag user_defined\" rel=\"nofollow\">fr:soja-de-farine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ale\" class=\"tag user_defined\" rel=\"nofollow\">ale</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/cured-cheese\" class=\"tag known\" rel=\"nofollow\">Cured cheese</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E6%A3%95%E6%AB%9A%E6%B2%B9\" class=\"tag user_defined\" rel=\"nofollow\">zh:棕櫚油</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cacao-en-poudre-fortement-degraisse\" class=\"tag known\" rel=\"nofollow\">fr:Cacao en poudre fortement dégraissé</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sur-le-total\" class=\"tag user_defined\" rel=\"nofollow\">fr:sur-le-total</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fenugreek-leaf\" class=\"tag known\" rel=\"nofollow\">Fenugreek leaf</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:socker\" class=\"tag user_defined\" rel=\"nofollow\">nb:socker</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:puree-de-goyave-blanche-a-base-de-concentre\" class=\"tag user_defined\" rel=\"nofollow\">fr:puree-de-goyave-blanche-a-base-de-concentre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vegetable-stabilizer\" class=\"tag user_defined\" rel=\"nofollow\">vegetable-stabilizer</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/bacon-and-egg-bites-contain\" class=\"tag user_defined\" rel=\"nofollow\">bacon-and-egg-bites-contain</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:epaule-de-porc-preparee\" class=\"tag user_defined\" rel=\"nofollow\">fr:epaule-de-porc-preparee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:essigzubereitung\" class=\"tag user_defined\" rel=\"nofollow\">de:essigzubereitung</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:concentres-de-mineraux-du-lalt\" class=\"tag user_defined\" rel=\"nofollow\">fr:concentres-de-mineraux-du-lalt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:melange-de-cereales\" class=\"tag user_defined\" rel=\"nofollow\">fr:melange-de-cereales</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ressins\" class=\"tag user_defined\" rel=\"nofollow\">fr:ressins</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:fromage-blanc-au-lalt-pasteurise\" class=\"tag user_defined\" rel=\"nofollow\">fr:fromage-blanc-au-lalt-pasteurise</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:preparation\" class=\"tag user_defined\" rel=\"nofollow\">fr:preparation</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:ckfrs-milchschokolade\" class=\"tag user_defined\" rel=\"nofollow\">de:ckfrs-milchschokolade</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:fumet\" class=\"tag user_defined\" rel=\"nofollow\">de:fumet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sauce-cremeuse\" class=\"tag user_defined\" rel=\"nofollow\">fr:sauce-cremeuse</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milk-derivative\" class=\"tag user_defined\" rel=\"nofollow\">milk-derivative</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:traces-de-cereales-contenant-du-gluten\" class=\"tag user_defined\" rel=\"nofollow\">fr:traces-de-cereales-contenant-du-gluten</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%BA%D1%83%D1%81%D0%BE%D1%87%D0%BA%D0%B8-%D1%81%D1%83%D1%88%D0%B5%D0%BD%D0%BE%D0%B3%D0%BE-%D1%8F%D0%B1%D0%BB%D0%BE%D0%BA%D0%B0-%D0%B2-%D1%80%D0%B8%D1%81%D0%BE%D0%B2%D0%BE%D0%B9-%D0%BC%D0%B0%D1%81%D0%BB%D0%BE\" class=\"tag user_defined\" rel=\"nofollow\">ru:кусочки-сушеного-яблока-в-рисовой-масло</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:huile-de-soja-raffinee\" class=\"tag user_defined\" rel=\"nofollow\">fr:huile-de-soja-raffinee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/verdikkingsmiddelen\" class=\"tag user_defined\" rel=\"nofollow\">verdikkingsmiddelen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:marsala\" class=\"tag user_defined\" rel=\"nofollow\">it:marsala</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:puree-de-manque\" class=\"tag user_defined\" rel=\"nofollow\">fr:puree-de-manque</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:sekerpare\" class=\"tag user_defined\" rel=\"nofollow\">de:sekerpare</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B4%D0%BE%D0%B1%D0%B0%D0%B2%D0%BA%D0%B0-%D0%BF%D0%B8%D1%89%D0%B5%D0%B2%D0%B0%D1%8F-%D0%BA%D0%BE%D0%BC%D0%BF%D0%BB%D0%B5%D0%BA%D1%81%D0%BD%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:добавка-пищевая-комплексная</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:br%C3%A2nz%C4%83-emmental\" class=\"tag user_defined\" rel=\"nofollow\">ro:brânză-emmental</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:e-19-06-2018-rt\" class=\"tag user_defined\" rel=\"nofollow\">de:e-19-06-2018-rt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:zwie-beln\" class=\"tag user_defined\" rel=\"nofollow\">de:zwie-beln</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:coeurs-de-confiserie\" class=\"tag user_defined\" rel=\"nofollow\">fr:coeurs-de-confiserie</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/calcium-panthothenate\" class=\"tag user_defined\" rel=\"nofollow\">calcium-panthothenate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:extrait-de-vanille-madagascar\" class=\"tag user_defined\" rel=\"nofollow\">fr:extrait-de-vanille-madagascar</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/butter-sauce\" class=\"tag user_defined\" rel=\"nofollow\">butter-sauce</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/traditional-free-range-chicken\" class=\"tag known\" rel=\"nofollow\">Traditional free-range chicken</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wafer\" class=\"tag known\" rel=\"nofollow\">Wafer</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:peche-de-vigne\" class=\"tag user_defined\" rel=\"nofollow\">fr:peche-de-vigne</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:bigarreaux-colores-avec-e127\" class=\"tag user_defined\" rel=\"nofollow\">fr:bigarreaux-colores-avec-e127</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%8D%D0%BC%D1%83%D0%BB%D1%8C%D0%B3%D0%B0%D1%82%D0%BE%D1%80-%D1%86%D0%B8%D1%82%D1%80%D0%B0%D1%82-%D0%BD%D0%B0%D1%82%D1%80%D0%B8%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:эмульгатор-цитрат-натрия</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:natriumnitritt\" class=\"tag user_defined\" rel=\"nofollow\">de:natriumnitritt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ribwort-plantain\" class=\"tag known\" rel=\"nofollow\">Ribwort plantain</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sorghum\" class=\"tag known\" rel=\"nofollow\">Sorghum</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ble-tendre\" class=\"tag user_defined\" rel=\"nofollow\">fr:ble-tendre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%80%D0%B8%D1%81%D0%BE%D0%B2%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:рисовая</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:knoblauch-2-zitronensaftkonzentrat-meersalz\" class=\"tag user_defined\" rel=\"nofollow\">de:knoblauch-2-zitronensaftkonzentrat-meersalz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:icre-tarama\" class=\"tag user_defined\" rel=\"nofollow\">ro:icre-tarama</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:lapte-degresat-reconstituit\" class=\"tag user_defined\" rel=\"nofollow\">ro:lapte-degresat-reconstituit</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/including-natural-extracts-of-fruits\" class=\"tag user_defined\" rel=\"nofollow\">including-natural-extracts-of-fruits</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/soya-lecithin-e322\" class=\"tag user_defined\" rel=\"nofollow\">soya-lecithin-e322</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:morus-nigra\" class=\"tag user_defined\" rel=\"nofollow\">fr:morus-nigra</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:max\" class=\"tag user_defined\" rel=\"nofollow\">fr:max</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beet-root-powder\" class=\"tag user_defined\" rel=\"nofollow\">beet-root-powder</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:aroma-koffein\" class=\"tag known\" rel=\"nofollow\">de:Aroma Koffein</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/snail\" class=\"tag known\" rel=\"nofollow\">Snail</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chestnut-flour\" class=\"tag known\" rel=\"nofollow\">Chestnut flour</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%87%D0%BD%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:чный</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:louis-martin-82-chemin-de-la-buire-net-total\" class=\"tag user_defined\" rel=\"nofollow\">fr:louis-martin-82-chemin-de-la-buire-net-total</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/glucides\" class=\"tag user_defined\" rel=\"nofollow\">glucides</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:homogeneise\" class=\"tag user_defined\" rel=\"nofollow\">fr:homogeneise</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:herbe-de-ble-moulue\" class=\"tag user_defined\" rel=\"nofollow\">fr:herbe-de-ble-moulue</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:rhum-dore-traditionnel\" class=\"tag user_defined\" rel=\"nofollow\">fr:rhum-dore-traditionnel</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vitamines\" class=\"tag user_defined\" rel=\"nofollow\">vitamines</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/beef-bouillon-beef-gelatine\" class=\"tag user_defined\" rel=\"nofollow\">beef-bouillon-beef-gelatine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:cacao-cu-con%C8%9Binut-redus-de-gr%C4%83sime\" class=\"tag user_defined\" rel=\"nofollow\">ro:cacao-cu-conținut-redus-de-grăsime</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/chicken-seasoning\" class=\"tag user_defined\" rel=\"nofollow\">chicken-seasoning</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/e341i\" class=\"tag known\" rel=\"nofollow\">E341i</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/disteardimonium-hectorite\" class=\"tag user_defined\" rel=\"nofollow\">disteardimonium-hectorite</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/melted-emmental-cheese\" class=\"tag known\" rel=\"nofollow\">Melted Emmental cheese</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/huile-de-sesame\" class=\"tag user_defined\" rel=\"nofollow\">huile-de-sesame</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/stuffed-pasta\" class=\"tag known\" rel=\"nofollow\">Stuffed pasta</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:med-emulgator-sojalecithin\" class=\"tag user_defined\" rel=\"nofollow\">nb:med-emulgator-sojalecithin</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sugar-dehydrated-garlic\" class=\"tag user_defined\" rel=\"nofollow\">sugar-dehydrated-garlic</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/vowis-of-nutmeg-opow-d-the-secret-to-our-of-family-spirit-he-together\" class=\"tag user_defined\" rel=\"nofollow\">vowis-of-nutmeg-opow-d-the-secret-to-our-of-family-spirit-he-together</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/added-to-preserve-freshness\" class=\"tag user_defined\" rel=\"nofollow\">added-to-preserve-freshness</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:poudre-de-lait-ecreme-traces-da-rachides\" class=\"tag user_defined\" rel=\"nofollow\">fr:poudre-de-lait-ecreme-traces-da-rachides</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/zh:%E4%BA%8C%E6%B0%A7%E5%8C%96%E7%9F%BD\" class=\"tag user_defined\" rel=\"nofollow\">zh:二氧化矽</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:4-fraise-ecrasee\" class=\"tag user_defined\" rel=\"nofollow\">fr:4-fraise-ecrasee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whey-permeate\" class=\"tag known\" rel=\"nofollow\">Whey permeate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/sour-dough\" class=\"tag user_defined\" rel=\"nofollow\">sour-dough</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:babymais\" class=\"tag user_defined\" rel=\"nofollow\">de:babymais</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:baumwohlsaat%C3%B6l\" class=\"tag user_defined\" rel=\"nofollow\">de:baumwohlsaatöl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:preparato-alla-vaniglia\" class=\"tag user_defined\" rel=\"nofollow\">it:preparato-alla-vaniglia</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:ulei-de-nuci-de-cocos\" class=\"tag user_defined\" rel=\"nofollow\">ro:ulei-de-nuci-de-cocos</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E9%AD%9A%E4%BB%8B%E8%AA%BF%E5%91%B3%E6%B2%B9\" class=\"tag user_defined\" rel=\"nofollow\">ja:魚介調味油</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sorbet-fraises-et-framboises\" class=\"tag user_defined\" rel=\"nofollow\">fr:sorbet-fraises-et-framboises</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/strong-dijon-mustard\" class=\"tag known\" rel=\"nofollow\">Strong Dijon mustard</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/natural-and-nature-identical-flavourings\" class=\"tag user_defined\" rel=\"nofollow\">natural-and-nature-identical-flavourings</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:lapte-de-vac%C4%83-pasteurizat-la-temperatur%C4%83-%C3%AEnalt%C4%83\" class=\"tag user_defined\" rel=\"nofollow\">ro:lapte-de-vacă-pasteurizat-la-temperatură-înaltă</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%EF%BD%90%EF%BD%88%E8%AA%BF%E6%95%B4%E5%89%A4\" class=\"tag user_defined\" rel=\"nofollow\">ja:ｐｈ調整剤</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/spring-water\" class=\"tag known\" rel=\"nofollow\">Spring water</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:certains-ingredients-de-ce-produit-ne-proviennent-pas\" class=\"tag user_defined\" rel=\"nofollow\">fr:certains-ingredients-de-ce-produit-ne-proviennent-pas</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:matiere-premiere-importee\" class=\"tag user_defined\" rel=\"nofollow\">fr:matiere-premiere-importee</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:dont-10-orange-et-mandarine\" class=\"tag user_defined\" rel=\"nofollow\">fr:dont-10-orange-et-mandarine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E3%81%AD%E3%81%8E\" class=\"tag user_defined\" rel=\"nofollow\">ja:ねぎ</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:587888-cw\" class=\"tag user_defined\" rel=\"nofollow\">fr:587888-cw</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/nb:v%C3%A4h%C3%A4rasvainen-kaako\" class=\"tag user_defined\" rel=\"nofollow\">nb:vähärasvainen-kaako</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:zuckeraprikosen\" class=\"tag user_defined\" rel=\"nofollow\">de:zuckeraprikosen</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/non-animal-rennet\" class=\"tag user_defined\" rel=\"nofollow\">non-animal-rennet</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mineraux\" class=\"tag user_defined\" rel=\"nofollow\">mineraux</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:enn-bei-%C3%BCberm%C3%A0bigem-verzehr-abf%C3%BChrend-wirken\" class=\"tag user_defined\" rel=\"nofollow\">de:enn-bei-übermàbigem-verzehr-abführend-wirken</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:milcheiweibkonzentrat\" class=\"tag user_defined\" rel=\"nofollow\">de:milcheiweibkonzentrat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:nat%C3%BCrlicher-ingwer-extrakt\" class=\"tag user_defined\" rel=\"nofollow\">de:natürlicher-ingwer-extrakt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:sel-ferments-coagulants\" class=\"tag user_defined\" rel=\"nofollow\">fr:sel-ferments-coagulants</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:meeresrotalge\" class=\"tag user_defined\" rel=\"nofollow\">de:meeresrotalge</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:issu-de-lait-de-vache\" class=\"tag user_defined\" rel=\"nofollow\">fr:issu-de-lait-de-vache</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/es:min\" class=\"tag user_defined\" rel=\"nofollow\">es:min</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/mono-and-diglicerydes-of-fatty-acids\" class=\"tag user_defined\" rel=\"nofollow\">mono-and-diglicerydes-of-fatty-acids</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-spelt\" class=\"tag known\" rel=\"nofollow\">Whole spelt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/627\" class=\"tag user_defined\" rel=\"nofollow\">627</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:tilsiter-in-scheiben\" class=\"tag user_defined\" rel=\"nofollow\">de:tilsiter-in-scheiben</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/it:trattato-con-alcol-ettilico\" class=\"tag user_defined\" rel=\"nofollow\">it:trattato-con-alcol-ettilico</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:ecorce-naturelle-d-orange\" class=\"tag user_defined\" rel=\"nofollow\">fr:ecorce-naturelle-d-orange</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:stabiliator-johannisbrotkernmehl\" class=\"tag user_defined\" rel=\"nofollow\">de:stabiliator-johannisbrotkernmehl</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/white-wine-extract\" class=\"tag known\" rel=\"nofollow\">White wine extract</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:peche-de-vigne-23-jus\" class=\"tag user_defined\" rel=\"nofollow\">fr:peche-de-vigne-23-jus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/wheat-cakes\" class=\"tag known\" rel=\"nofollow\">Wheat cakes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/the-noir\" class=\"tag user_defined\" rel=\"nofollow\">the-noir</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:of-wnicn-saturates-i9g\" class=\"tag user_defined\" rel=\"nofollow\">fr:of-wnicn-saturates-i9g</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:imental-es-5\" class=\"tag user_defined\" rel=\"nofollow\">fr:imental-es-5</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/peut-contenir-des-traces-de-cacahuetes-et\" class=\"tag user_defined\" rel=\"nofollow\">peut-contenir-des-traces-de-cacahuetes-et</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:carne-de-pas%C4%83re\" class=\"tag user_defined\" rel=\"nofollow\">ro:carne-de-pasăre</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:thiamine-monoitrate\" class=\"tag user_defined\" rel=\"nofollow\">fr:thiamine-monoitrate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/skimmed-cows-milk\" class=\"tag known\" rel=\"nofollow\">Skimmed cows milk</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:orangeschalenextrakt\" class=\"tag known\" rel=\"nofollow\">de:Orangeschalenextrakt</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/tamper-evident-feature\" class=\"tag user_defined\" rel=\"nofollow\">tamper-evident-feature</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/product-in-italy-name-and-brands-invariably-filed-within-the\" class=\"tag user_defined\" rel=\"nofollow\">product-in-italy-name-and-brands-invariably-filed-within-the</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/milk-chocolate-contains-min\" class=\"tag user_defined\" rel=\"nofollow\">milk-chocolate-contains-min</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:saupoudres-de-farine-de-riz\" class=\"tag user_defined\" rel=\"nofollow\">fr:saupoudres-de-farine-de-riz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:poitrine-de-porc-issue-d-animaux-eleves-sans-traitement-antibiotique-des-la-fin-du-sevrage-et-nourris-sans-ogm\" class=\"tag user_defined\" rel=\"nofollow\">fr:poitrine-de-porc-issue-d-animaux-eleves-sans-traitement-antibiotique-des-la-fin-du-sevrage-et-nourris-sans-ogm</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:infusion-de-the-vert\" class=\"tag user_defined\" rel=\"nofollow\">fr:infusion-de-the-vert</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:corectori-de-aciditate\" class=\"tag user_defined\" rel=\"nofollow\">ro:corectori-de-aciditate</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D1%80%D0%B5%D0%B3%D1%83%D0%BB%D1%8F%D1%82%D0%BE%D1%80-%D0%BA%D0%B8%D1%81%D0%BB%D0%BE%D1%82%D0%BD%D0%BE%D1%81%D1%82%D0%B8-%D0%BA%D0%B8%D1%81%D0%BB%D0%BE%D1%82%D0%B0-%D1%83%D0%BA%D1%81%D1%83%D1%81%D0%BD%D0%B0%D1%8F\" class=\"tag user_defined\" rel=\"nofollow\">ru:регулятор-кислотности-кислота-уксусная</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:substan%C8%9B%C4%83-uscat%C4%83-de-cacao\" class=\"tag user_defined\" rel=\"nofollow\">ro:substanță-uscată-de-cacao</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ro:f%C4%83in%C4%83-alb%C4%83-de-gr%C3%A2u\" class=\"tag user_defined\" rel=\"nofollow\">ro:făină-albă-de-grâu</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:cacao-en-poudre-fine\" class=\"tag user_defined\" rel=\"nofollow\">fr:cacao-en-poudre-fine</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:helianthus-annuus\" class=\"tag user_defined\" rel=\"nofollow\">fr:helianthus-annuus</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ru:%D0%B0%D1%80%D0%BE%D0%BC%D0%B0%D1%82%D0%B8%D0%B7%D0%B0%D1%82%D0%BE%D1%80-%D0%BA%D1%80%D0%B0%D0%B1%D0%BE%D0%B2%D1%8B%D0%B9\" class=\"tag user_defined\" rel=\"nofollow\">ru:ароматизатор-крабовый</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:kr%C3%A4ter-der-provence\" class=\"tag user_defined\" rel=\"nofollow\">de:kräter-der-provence</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/hu:vir%C3%A1gm%C3%A9z\" class=\"tag user_defined\" rel=\"nofollow\">hu:virágméz</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/pistachio-nuts\" class=\"tag known\" rel=\"nofollow\">Pistachio nuts</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mars\" class=\"tag user_defined\" rel=\"nofollow\">de:mars</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:primevere\" class=\"tag user_defined\" rel=\"nofollow\">fr:primevere</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/alumina\" class=\"tag user_defined\" rel=\"nofollow\">alumina</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/ja:%E5%8A%A0%E5%B7%A5%E3%81%A7%E3%82%93%E7%B2%89\" class=\"tag user_defined\" rel=\"nofollow\">ja:加工でん粉</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:concentres-de-fruits-et-de-pantes\" class=\"tag user_defined\" rel=\"nofollow\">fr:concentres-de-fruits-et-de-pantes</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/yellow-onion\" class=\"tag known\" rel=\"nofollow\">Yellow onion</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/lutein-and-blue-patented-v\" class=\"tag user_defined\" rel=\"nofollow\">lutein-and-blue-patented-v</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/whole-wheat\" class=\"tag known\" rel=\"nofollow\">Whole wheat</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td></td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/de:mehlschwitze\" class=\"tag user_defined\" rel=\"nofollow\">de:mehlschwitze</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:coscia-di-suino\" class=\"tag user_defined\" rel=\"nofollow\">fr:coscia-di-suino</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "<tr><td><a href=\"/entry-date/2016-08/ingredient/fr:traces-eventuelles-d-oeufs\" class=\"tag user_defined\" rel=\"nofollow\">fr:traces-eventuelles-d-oeufs</a></td>\n" +
            "<td style=\"text-align:right\">1</td><td style=\"text-align:center\">*</td></tr>\n" +
            "</tbody>";

    public static void main(String[] args) {
        try {
            File myObj = new File("grocery.sql");
            System.out.println(myObj.getAbsolutePath());
            if (myObj.createNewFile()) {
                FileWriter myWriter = new FileWriter("grocery.sql");
                getIngredients(split1, myWriter);
                getIngredients(split2, myWriter);
                getIngredients(split3, myWriter);
                getIngredients(split4, myWriter);
                getIngredients(split5, myWriter);
                getIngredients(split6, myWriter);
                getIngredients(split7, myWriter);
                getIngredients(split8, myWriter);
                getIngredients(split9, myWriter);
                getIngredients(split10, myWriter);
                getIngredients(split11, myWriter);
                getIngredients(split12, myWriter);
                getIngredients(split13, myWriter);
                getIngredients(split14, myWriter);
                getIngredients(split15, myWriter);
                getIngredients(split16, myWriter);
                getIngredients(split20, myWriter);
                getIngredients(split17, myWriter);
                getIngredients(split18, myWriter);
                getIngredients(split19, myWriter);
                myWriter.close();
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void getIngredients(String list, FileWriter writer) throws IOException {
        String[] split = list.split("nofollow\">");
        for (int i = 0; i < split.length; i++) {
            String[] ingredient = split[i].split("<");
            if (!ingredient[0].equals("") && ingredient[0].length() < 63) {
                if (ingredient[0].contains("'")) {
                    ingredient[0] = ingredient[0].replaceAll("'", "''");
                }
                writer.write("INSERT INTO ingredient(ingredient_name) VALUES ('" + ingredient[0] + "');\n");
            }
        }
    }

}
