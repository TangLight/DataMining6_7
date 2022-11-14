import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestApriori {
    public static void main(String[] args) {
        Apriori apriori = new Apriori(Arrays.asList("A、C","B、C、E","A、C、E","B、E","B、C"));
        Map<List<String>,Integer> frequentCollectionMap = apriori.getFC();
        System.out.println("-------------频繁集"+"----------------");
        for(List<String> list : frequentCollectionMap.keySet()) System.out.println(list+ "\t"+ frequentCollectionMap.get(list));

        Map<String,Double> relationRulesMap = apriori.getRelationRules(frequentCollectionMap);
        System.out.println("-----------关联规则"+"----------------");
        for (String s : relationRulesMap.keySet()) System.out.println(s+"\t"+relationRulesMap.get(s));
    }
}