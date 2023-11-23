package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ParadoxSimulationWithChange implements Runnable{
    private int simulationCount;

    public ParadoxSimulationWithChange(int simulationCount) {
        this.simulationCount = simulationCount;
    }

    @Override
    public void run() {
        Map<Integer, GameResult> map = new HashMap<>();
        Random random = new Random();

        for (int i = 0; i < simulationCount; i++) {
            int carIndex = random.nextInt(0, 3);
            int playerChoice = random.nextInt(0, 3);
            int hostChoice = random.nextInt(0, 3);

            while (hostChoice == carIndex || hostChoice == playerChoice) {
                hostChoice = random.nextInt(0, 3);
            }

            playerChoice = 3 - hostChoice - playerChoice;

            if (playerChoice == carIndex) {
                map.put(i, GameResult.WIN);
            } else {
                map.put(i, GameResult.LOSE);
            }
        }

        int winsCount = 0;
        int loseCount = 0;

        for (GameResult value: map.values()) {
            if (value.equals(GameResult.WIN)) {
                winsCount++;
            } else {
                loseCount++;
            }
        }

        System.out.println("ParadoxSimulationWithChange");
        System.out.println("Wins %: " + Math.round(winsCount * 100.0 / simulationCount));
        System.out.println("Lose %: " + Math.round(loseCount * 100.0 / simulationCount));
    }
}