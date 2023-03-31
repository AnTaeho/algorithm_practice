package org.programmers;

import java.util.*;
import java.util.stream.Collectors;

public class LV3_1 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        solution(genres, plays);
    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        int length = genres.length;
        Map<String, Integer> genre_play = new HashMap<>();
        for(int i = 0; i < length; i++){
            genre_play.put(genres[i], genre_play.getOrDefault(genres[i], 0) + plays[i]);
        }
        List<Music> musics = new ArrayList<>();
        for (int j = 0; j < length; j++) {
            musics.add(new Music(genres[j], j, plays[j]));
        }

        List<Map.Entry<String, Integer>> entries = genre_play.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());


        return answer;
    }

    static class Music {
        String genre;
        int number;
        int playNumber;

        public Music(String genre, int number, int playNumber) {
            this.genre = genre;
            this.number = number;
            this.playNumber = playNumber;
        }

        @Override
        public String toString() {
            return "Music{" +
                    "genre='" + genre + '\'' +
                    ", number=" + number +
                    ", playNumber=" + playNumber +
                    '}';
        }
    }
}
