package algo.study.betterversion;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2]..](si < ei)
 * determine if a person could attend all meetings.
 *
 * input: [[0,30],[5,10],[15,20]]
 * output: false
 *
 * input: [[7,10],[2,4]]
 * output: true
 */

@Data
@AllArgsConstructor
class Interval{
    private Integer start;
    private Integer end;

}

public class MeetingRoom {

    public static void main(String[] args) {
        Interval interval1 = new Interval(0,30);
        Interval interval2 = new Interval(5,10);
        Interval interval3 = new Interval(15,20);
        Interval[] input = {interval1,interval2,interval3};

        MeetingRoom meetingRoom = new MeetingRoom();

//        Interval interval1 = new Interval(7, 10);
//        Interval interval2 = new Interval(2, 4);
//        Interval[] input = {interval1,interval2};
        System.out.println(meetingRoom.func(input));
    }

    boolean func(Interval[] intervals){
        boolean result = true;
        Arrays.sort(intervals, Comp);
        for(int i = 1; i<intervals.length; ++i){
            if(intervals[i-1].getEnd() > intervals[i].getStart()){
                return false;
            }
        }
        return result;

    }

    Comparator<Interval> Comp = new Comparator<Interval>() {
        @Override public int compare(Interval o1, Interval o2) {
            return o1.getStart()-o2.getStart();
        }
    };
}
