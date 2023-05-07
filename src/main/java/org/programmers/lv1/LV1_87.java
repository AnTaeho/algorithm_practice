package org.programmers.lv1;

public class LV1_87 {

    public static void main(String[] args) {
    }

    public int[] solution(String[] wallpaper) {
        int minH = wallpaper.length;
        int minW = wallpaper[0].length();
        int maxH = 0;
        int maxW = 0;
        for (int i = 0 ; i < wallpaper.length; i++) {
            String[] split = wallpaper[i].split("");
            for (int j = 0; j < split.length; j++) {
                if (split[j].equals("#")) {
                    minH = Math.min(minH, i);
                    minW = Math.min(minW, j);
                    maxW = Math.max(maxW, j);
                    maxH = Math.max(maxH, i);
                }
            }
        }
        return new int[]{minH, minW, maxH+1, maxW+1};
    }

}
