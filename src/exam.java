import java.util.Arrays;

public class exam {
    public static void main(String[] args) {
        System.out.println("Zadanie 1: ");
        tenGreaterThanUnityDigit();
        System.out.println();
        System.out.println();

        int[] numbersTable = new int[10];
        numbersTable[0] = 2;
        numbersTable[1] = 14;
        numbersTable[2] = 28;
        numbersTable[3] = 8;
        numbersTable[4] = 45;
        numbersTable[5] = 11;
        numbersTable[6] = 5;
        numbersTable[7] = 13;
        numbersTable[8] = 23;
        numbersTable[9] = 20;
        System.out.println("Zadanie 2:");
        System.out.println("Elementy tablicy wypisane w kolejnosci:");
        allTableElements(numbersTable);
        System.out.println();
        System.out.println("Odwrotnie wypisane elementy tablicy:");
        reverseAllTableElements(numbersTable);
        System.out.println();
        System.out.println("Najwiekszy element tablicy: " + largestNumber(numbersTable));
        System.out.println("Najmniejszy element tablicy: " + leastNumber(numbersTable));
        System.out.println("Suma elementow tablicy: " + numbersSum(numbersTable));
        System.out.println("Mediana elementow tablicy: " + tableMedian(numbersTable));
        System.out.println();
        System.out.println();

        int[] tableEx3 = {1, 2, 3, 4};
        int[] table2Ex3 = {1, 4, 5, 6};
        System.out.println("Zadanie 3:");
        sameNumbersinTables(tableEx3, table2Ex3);
        System.out.println();
        System.out.println();

        String[] namesTable = {"Adam", "Janek", "Michal", "Kasia", "Ania", "Milena", "Marzena", "Jakub", "Wiktoria", "Julka", "Krzysiu", "Agata", "Agnieszka", "Alicja", "Fryderyk", "Jarek", "Bogdan", "Juliusz", "Kajtek", "Laura"};
        System.out.println("Zadanie 4: ");
        longestName(namesTable);
        System.out.println("Ilosc imion zenskich: " + femaleNamesNumber(namesTable));
        System.out.println("Imiona zenskie stanowia: " + (femaleNamesNumber(namesTable) * 100) / namesTable.length + "%");
    }

    //Zadanie 1.
    //Stworz petle która dla wszystkich liczb dwucyfrowych wypisz te których cyfra dziesiątek jest większa niż cyfra jedności. np: 91 bo 9 > 1.
    //(W tym zadaniu najlepiej wykorzystać dzielenie i dzielenie z resztą!)
    public static void tenGreaterThanUnityDigit() {
        for (int x = 11; x < 100; x++) {
            if (x / 10 > x % 10) {
                System.out.print(x + " ");
            }
        }
    }

    //Zadanie 2.
    //Stworz tablice liczb całkowitych (ile chcesz elementów i jak chcesz)
    //następnie:
    //- wypisz wszystkie elementy tablicy od pierwszego do ostatniego w jednej linii
    //- wypisz wszystkie elementy tablicy od ostatniego do pierwszego w jednej linii
    //- wypisz największy element
    //- wypisz najmniejszy element
    //- wypisz sumę elemetów
    //- wypisz medianę elementów tablicy

    public static void allTableElements(int[] table) {
        for (int x = 0; x < table.length; x++) {
            System.out.print(table[x] + " ");
        }
    }

    public static void reverseAllTableElements(int[] table) {
        for (int x = table.length - 1; x >= 0; x--) {
            System.out.print(table[x] + " ");
        }
    }

    public static Integer largestNumber(int[] table) {
        int largestNumber = table[0];

        for (int x = 0; x < table.length; x++) {
            if (table[x] > largestNumber) {
                largestNumber = table[x];
            }
        }
        return largestNumber;
    }

    public static Integer leastNumber(int[] table) {
        int smallestNumber = table[0];

        for (int x = 0; x < table.length; x++) {
            if (table[x] < smallestNumber) {
                smallestNumber = table[x];
            }
        }
        return smallestNumber;
    }

    public static Integer numbersSum(int[] table) {
        int sum = 0;

        for (int x = 0; x < table.length; x++) {
            sum += table[x];
        }
        return sum;
    }

    public static double tableMedian(int[] table) {
        double median;
        Arrays.sort(table);
        int middleNumber = table.length / 2;

        if (table.length % 2 == 0) {
            median = ((table[middleNumber - 1]) + table[middleNumber]) / 2;
        } else {
            median = table[middleNumber];
        }
        return median;
    }

    //Zadanie 3.
    //Stwórz dwie tablice liczb calkowitych (ile elementów chcesz i jak chcesz)
    //a następnie wypisz wszystkie liczby które występują w obu tablicach.
    //np: {1,2,3,4} , {1,4,5,6} powinno wypisać {1,4}
    public static void sameNumbersinTables(int[] table1, int[] table2) {
        for (int x = 0; x < table1.length; x++) {
            for (int y = 0; y < table2.length; y++) {
                if (table1[x] == table2[y]) {
                    System.out.print(table1[x] + " ");
                }
            }
        }
    }

    //Zadanie 4.
    //Stworz sobie tablice 10-20 imion
    //Następnie
    //- znajdz najdluzsze oraz najkrotsze imie
    //- wypisz ilosc imion zenskich (to takie które się kończą na literke "a")
    //- jaki % calości stanowią imiona żeńskie

    public static void longestName(String[] names) {
        String longest = names[0];
        String smallest = names[0];
        for (int x = 0; x < names.length; x++) {
            if (names[x].length() > longest.length()) {
                longest = names[x];
            }
            if (names[x].length() < smallest.length()) {
                smallest = names[x];
            }
        }
        System.out.println("Najdlusze imie to: " + longest);
        System.out.println("Najkrotsze imie to: " + smallest);
    }

    public static Integer femaleNamesNumber(String[] names) {
        int count = 0;
        for (int x = 0; x < names.length; x++) {
            if (names[x].charAt(names[x].length() - 1) == 'a') {
                count++;
            }
        }
        return count;
    }
}
