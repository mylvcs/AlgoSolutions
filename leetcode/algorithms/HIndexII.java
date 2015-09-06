/*
 *
 */
public class HIndexII {

    public int hIndex(int[] citations) {
        int result = 0;
        for (int i = 0; i < citations.length; ++i) {
            result = Math.max(result, 
                    Math.min(citations[i], citations.length - i));
        }
        return result;
    }

}
