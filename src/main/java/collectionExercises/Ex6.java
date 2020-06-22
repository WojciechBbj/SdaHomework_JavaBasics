package collectionExercises;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static int randomNumber;

    public static int howManyNumbers() {
        System.out.print("5a, Podaj ile liczb ma zostać wylosowanych: ");
        int howManyNumbers = scanner.nextInt();

        return howManyNumbers;
    }

    public static void addRandomNumbersToQueue(int howManyNumbers) {

        System.out.println("5b, Aplication added " + howManyNumbers + "random numbers to queue");
        for (int i = 0; i < howManyNumbers; i++) {
            randomNumber = ((int) Math.round(random.nextDouble() * 100));
            priorityQueue.add(randomNumber);
            System.out.println("Added to queue number: " + randomNumber);
        }
    }

    public static void showQueue() {
        System.out.println("5c, numbers added to queue:");
        int i = 1;
        while (!priorityQueue.isEmpty()) {
            System.out.println("Element " + i + " of queue is: " + priorityQueue.poll());
        }
    }

    public static void main(String[] args) {

        addRandomNumbersToQueue(howManyNumbers());
        showQueue();
    }
}

