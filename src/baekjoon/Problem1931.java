package baekjoon;

import java.io.*;
import java.util.*;

public class Problem1931 {
    public static void main(String[] args) throws IOException {
        class Room implements Comparable<Room> {

            public final int start;
            public final int end;

            public Room(int start, int end) {
                this.start = start;
                this.end = end;
            }

            @Override
            public int compareTo(Room o) {
                if (this.end == o.end) {
                    return this.start - o.start;
                }

                return this.end - o.end;
            }

            @Override
            public String toString() {
                return start + " " + end;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            Room room = new Room(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
            rooms.add(room);
        }
        rooms.sort(Comparator.naturalOrder());

        int time = 0;
        int answer = 0;
        for (Room room : rooms) {
            if (time <= room.start) {
                time = room.end;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
