import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author cnxiaohei
 * @date 2022/5/25 22:29
 */
public class Offer45_MinNumber {

    public String minNumber(int[] nums) {
        if (nums==null||nums.length==0) {
            return "";
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = Integer.toString(o1);
                String s2 = Integer.toString(o2);
                int len = Math.min(s1.length(), s2.length());

                return (s1+s2).compareTo(s2+s1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
            sb.append(integer);
        }
        return sb.toString();
    }
}
