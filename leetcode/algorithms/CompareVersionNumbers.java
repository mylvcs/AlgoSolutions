/*
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1, if version1 < version2 
 * return -1, otherwise return 0.
 * 
 * You may assume that the version strings are non-empty 
 * and contain only digits and the . character.
 * The . character does not represent a decimal point and 
 * is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way 
 * to version three", it is the fifth second-level revision 
 * of the second first-level revision.
 * 
 * Here is an example of version numbers ordering:
 * 
 * 0.1 < 1.1 < 1.2 < 13.37
 */
public class CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {
        int start1 = 0;
        int end1 = 0;
        int start2 = 0;
        int end2 = 0;
        while (true) {
            while (end1 < version1.length() && version1.charAt(end1) != '.') {
                end1++;
            }
            while (end2 < version2.length() && version2.charAt(end2) != '.') {
                end2++;
            }
            int a = Integer.parseInt(version1.substring(start1, end1));
            int b = Integer.parseInt(version2.substring(start2, end2));
            if (a > b)
                return 1;
            else if (a < b)
                return -1;
            else {
                if (end1 == version1.length() && end2 == version2.length())
                    return 0;
                if (end1 == version1.length() && end2 != version2.length())
                    return -1;
                if (end1 != version1.length() && end2 == version2.length())
                    return 1;
                else {
                    start1 = ++end1;
                    start2 = ++end2;
                }
            }
        }
    }

    public int compareVersion(String version1, String version2) {
        if (version1.length() == 0) {
            if (version2.length() == 0)
                return 0;
            else 
                return 
        }

        int start1 = 0;
        int end1 = 0;
        int start2 = 0;
        int end2 = 0;
        for (; end1 < version1.length() && version1.charAt(end1) != '.'; end1++);
        for (; end2 < version2.length() && version2.charAt(end2) != '.'; end2++);
        int a = Integer.parseInt(version1.substring(start1, end1));
        int b = Integer.parseInt(version2.substring(start2, end2));
        if (a > b)
            return 1;
        else if (a < b)
            return -1;
        else {
            
        }

    }

}
