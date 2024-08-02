package LeetCode75;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int canPlant = 0;
        for (int i = 0; i < flowerbed.length; i++){
            if (i > 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0){
                canPlant++;
            }
        }
        return canPlant >= n;
    }
}
