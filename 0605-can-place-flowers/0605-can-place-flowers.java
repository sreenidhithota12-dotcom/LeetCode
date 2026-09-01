class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int i=1;
        int c=0;
        if (n == 0) return true;
        if(len == 1){
            if(flowerbed[0]==1) return false;
            return true;
        }
        if(flowerbed[0]==1) i=2;
        else{
            if(flowerbed[1]==0) {
                flowerbed[0]=1;
                c++;
                i=2; 
            }
            else i=1;
        }
        while(i<len-1){
            if(flowerbed[i]==1) {
                i=i+2;
                continue;
            }
            if(flowerbed[i-1]==0 && flowerbed[i+1]==0) {
                flowerbed[i]=1;
                c++;
                i=i+2;
            }
            else i++;
        }
        if(flowerbed[len-1]==0 && flowerbed[len-2]==0) c++;
        return c>=n;
    }
}