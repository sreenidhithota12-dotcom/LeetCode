class Solution {
    boolean isLeapYear(int year) {
    return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        int[] prefixDays = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int ans = prefixDays[month - 1] + day;
        if(isLeapYear(year) && month > 2 ) {
             ans++;
        }
        return ans;
    }
}