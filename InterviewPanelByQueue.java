package org.task1.zsgs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterviewPanelByQueue {
	Queue<Integer> mainHall = new LinkedList<>();
	Queue<Integer> waitingHall = new LinkedList<>();
	Scanner input = new Scanner(System.in);

	void run() {
		System.out.print("Enter Total count of candidates appear for Interview :");
		int countOfInterviewee = input.nextInt();
		addInterviewee(countOfInterviewee);

		System.out.print("Enter waiting Hall capacity :");
		int capacity = input.nextInt();
		addToPanel(capacity);

		while (waitingHall.size() > 0) {
			callInterviewee();
		}
	}

	void addInterviewee(int countOfInterviewee) {

		for (int i = 1; i <= countOfInterviewee; i++) {
			mainHall.add(i);
		}
	}

	void addToPanel(int capacityOfPanel) {

		for (int i = 1; i <= capacityOfPanel; i++) {
			waitingHall.add(mainHall.poll());
		}
		System.out.println("Candidates waiting on main Hall " + mainHall.size());
		System.out.println("Candidates waiting on waiting Area " + waitingHall);
		System.out.println("--------------------------------------------");
	}

	void callInterviewee() {
		System.out.println( waitingHall.poll()+" completed the process ");
		if (mainHall.peek() != null) {
			waitingHall.add(mainHall.poll());
			System.out.println("candidates on the waiting Area :" + waitingHall);
			System.out.println("--------------------------------------------");
		}
	}

	public static void main(String[] args) {
		InterviewPanelByQueue iq = new InterviewPanelByQueue();
		iq.run();
	}
}
