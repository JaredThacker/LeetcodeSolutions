package LeetCode75;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int canPlant = 0;
        for (int i = 0; i < flowerbed.length; i++){
            if (flowerbed[i] == 0){
                boolean emptyLeftPlot = (flowerbed[i] == 0) && i > 0 && (flowerbed[i - 1] == 0);
                boolean emptyRightPlot = (flowerbed[i] == 0) && i < flowerbed.length - 1 &&(flowerbed[i + 1] == 0);

                if(emptyLeftPlot && emptyRightPlot) {
                    flowerbed[i] = 1;
                    canPlant++;
                } else if (i == 0 && emptyRightPlot) {
                    flowerbed[i] = 1;
                    canPlant++;
                } else if (i == flowerbed.length - 1 && emptyLeftPlot) {
                    flowerbed[i] = 1;
                    canPlant++;
                } else if (flowerbed.length == 1 && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    canPlant++;
                }

            }
        }
        return canPlant >= n;
    }
}
