import java.util.*;

public class Main {
    static class PetrolPump {
        int petrol;
        int distance;

        public PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPetrolPump(PetrolPump[] pumps) {
        int n = pumps.length;
        int start = 0;
        int end = 1;
        int currentPetrol = pumps[start].petrol - pumps[start].distance;

        while (start != end || currentPetrol < 0) {
            while (currentPetrol < 0 && start != end) {
                currentPetrol -= pumps[start].petrol - pumps[start].distance;
                start = (start + 1) % n;

                if (start == 0)
                    return -1;
            }

            currentPetrol += pumps[end].petrol - pumps[end].distance;
            end = (end + 1) % n;
        }

        return start;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {new PetrolPump(4, 6), new PetrolPump(6, 5), new PetrolPump(7, 3),
                new PetrolPump(4, 5)};

        int startingIndex = findStartingPetrolPump(pumps);
        System.out.println("Starting petrol pump index: " + startingIndex);
    }
}
