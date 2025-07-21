import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class meeting {
    int start;
    int end;
    int pos;

    meeting(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

// class meetingComparator implements Comparator<meeting> {

// @Override
// public int compare(meeting o1, meeting o2) {

// if (o1.end > o2.end) {
// return 1;
// } else if (o1.end < o2.end) {
// return -1;
// } else if (o1.pos < o2.pos) {
// return -1;
// }
// return 1;
// }
// }

public class optimized {

    public static int maxMeetings(int start[], int end[]) {

        ArrayList<meeting> arr = new ArrayList<>();

        for (int i = 0; i < start.length; i++) {
            arr.add(new meeting(start[i], end[i], i + 1));
        }

        // meetingComparator meet = new meetingComparator();
        arr.sort(Comparator.comparingInt((meeting m) -> m.end).thenComparingInt(m -> m.pos));

        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(arr.get(0).pos);
        int limit = arr.get(0).end;

        for (int i = 1; i < start.length; i++) {

            if (arr.get(i).start > limit) {
                limit = arr.get(i).end;
                answer.add(arr.get(i).pos);
            }
        }

        return answer.size();

    }

    public static void main(String args[]) {

        {
            int start[] = { 1, 3, 0, 5, 8, 5 };
            int end[] = { 2, 4, 5, 7, 9, 9 };
            int answer = maxMeetings(start, end);

            System.out.println(answer);

        }
    }
}
