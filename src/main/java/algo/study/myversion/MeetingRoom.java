package algo.study.myversion;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
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

    static boolean func(Interval[] intervals){
        boolean result = true;
        List<Integer> temps = new ArrayList<>();
        for(Interval interval : intervals){
            for(int i = interval.getStart(); i<=interval.getEnd(); ++i){
                if(temps.contains(i)){
                    result = false;
                    break;
                }else{
                    temps.add(i);
                }
            }
            if(!result){
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        Interval interval1 = new Interval(0,30);
//        Interval interval2 = new Interval(5,10);
//        Interval interval3 = new Interval(15,20);
//        Interval[] input = {interval1,interval2,interval3};

        Interval interval1 = new Interval(7,10);
        Interval interval2 = new Interval(2,4);
        Interval[] input = {interval1,interval2};
        System.out.println(func(input));
    }
}
