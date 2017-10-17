package com.rameshify.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HiCal {

	public static void main(String[] args) {
		Meeting[] meetings = { new Meeting(0, 1), new Meeting(3, 5), new Meeting(4, 8), new Meeting(10, 12),
				new Meeting(9, 10) };
//		Meeting[] meetings = { new Meeting(1, 2), new Meeting(2, 3)};
//		Meeting[] meetings = { new Meeting(1, 5), new Meeting(2, 3)};
//		Meeting[] meetings = { new Meeting(1, 10), new Meeting(2, 6), new Meeting(3, 5), new Meeting(7, 9) };

		List<Meeting> mergedMeetings = new HiCal().mergeCalendar(meetings);
		System.out.println(mergedMeetings);

	}

	private List<Meeting> mergeCalendar(Meeting[] meetings) {
		List<Meeting> mergedMeetings = new ArrayList<>();

		Arrays.sort(meetings, new Comparator<Meeting>() {
			@Override
			public int compare(Meeting firstMeeting, Meeting secondMeeting) {
				// -ve implies first meeting comes before second.
				return firstMeeting.getStartTime()-secondMeeting.getStartTime();
			}
		});
		
		mergedMeetings.add(meetings[0]);
		for (int i = 1; i < meetings.length; i++) {
			Meeting current = meetings[i];
			Meeting past = mergedMeetings.get(mergedMeetings.size() - 1);

			if (current.getStartTime() <= past.getEndTime()) {
				past.setEndTime(Math.max(past.getEndTime(), current.getEndTime()));
			} else {
				mergedMeetings.add(current);
			}

		}

		return mergedMeetings;
	}

}
